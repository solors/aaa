package com.maticoo.sdk.utils.event;

import android.text.TextUtils;
import com.maticoo.sdk.core.MaticooManager;
import com.maticoo.sdk.utils.ApplicationUtil;
import com.maticoo.sdk.utils.constant.CommonConstants;
import com.maticoo.sdk.utils.log.DeveloperLog;
import com.maticoo.sdk.utils.request.HeaderUtils;
import com.maticoo.sdk.utils.request.RequestBuilder;
import com.maticoo.sdk.utils.request.network.AdRequest;
import com.maticoo.sdk.utils.request.network.ByteRequestBody;
import com.maticoo.sdk.utils.request.network.Request;
import com.maticoo.sdk.utils.request.network.Response;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes6.dex */
public class EventReportTask implements Request.OnRequestCallback {
    protected Event event;
    private EventReportListener reportCallback;
    protected AtomicInteger uploadTimes = new AtomicInteger(0);

    public EventReportTask(Event event, EventReportListener eventReportListener) {
        this.event = event;
        this.reportCallback = eventReportListener;
    }

    public int getUploadTimes() {
        return this.uploadTimes.get();
    }

    @Override // com.maticoo.sdk.utils.request.network.Request.OnRequestCallback
    public void onRequestFailed(String str) {
        DeveloperLog.LogD("BI Event response fail error : " + str);
        this.reportCallback.onReportResult(this, false);
    }

    @Override // com.maticoo.sdk.utils.request.network.Request.OnRequestCallback
    public void onRequestSuccess(Response response) {
        try {
            String string = response.body().string();
            DeveloperLog.LogD("BI Event response success body : " + string);
        } catch (Exception unused) {
        }
        if (response != null) {
            this.reportCallback.onReportResult(this, true);
        } else {
            this.reportCallback.onReportResult(this, false);
        }
    }

    public boolean upload() {
        try {
            if (MaticooManager.getInstance().isDoNotTrackStatus()) {
                return false;
            }
            byte[] buildEventRequestBody = RequestBuilder.buildEventRequestBody(this.event);
            if (buildEventRequestBody == null) {
                DeveloperLog.LogD("build events request data error");
                return false;
            }
            String buildEventUrl = RequestBuilder.buildEventUrl(CommonConstants.getAdEventUrl());
            if (TextUtils.isEmpty(buildEventUrl)) {
                return false;
            }
            ByteRequestBody byteRequestBody = new ByteRequestBody(buildEventRequestBody);
            AdRequest.post().url(buildEventUrl).body(byteRequestBody).headers(HeaderUtils.getBaseHeaders()).connectTimeout(60000).readTimeout(100000).callback(this).performRequest(ApplicationUtil.getInstance().getApplicationContext());
            this.uploadTimes.incrementAndGet();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}
