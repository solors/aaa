package com.maticoo.sdk.utils.event;

import android.text.TextUtils;
import com.maticoo.sdk.core.MaticooManager;
import com.maticoo.sdk.utils.ApplicationUtil;
import com.maticoo.sdk.utils.constant.CommonConstants;
import com.maticoo.sdk.utils.log.DeveloperLog;
import com.maticoo.sdk.utils.model.Configurations;
import com.maticoo.sdk.utils.prefs.Preference;
import com.maticoo.sdk.utils.request.HeaderUtils;
import com.maticoo.sdk.utils.request.RequestBuilder;
import com.maticoo.sdk.utils.request.network.AdRequest;
import com.maticoo.sdk.utils.request.network.ByteRequestBody;
import com.maticoo.sdk.utils.request.network.Headers;
import java.nio.charset.Charset;

/* loaded from: classes6.dex */
public class EventReportBITask extends EventReportTask {
    public EventReportBITask(Event event, EventReportListener eventReportListener) {
        super(event, eventReportListener);
    }

    @Override // com.maticoo.sdk.utils.event.EventReportTask
    public boolean upload() {
        String buildEventUrl;
        try {
            if (MaticooManager.getInstance().isDoNotTrackStatus()) {
                return false;
            }
            byte[] buildEventForBIRequestBody = RequestBuilder.buildEventForBIRequestBody(this.event);
            if (buildEventForBIRequestBody == null) {
                DeveloperLog.LogD("build events request data error");
                return false;
            }
            Configurations value = Preference.CONFIGURATION.getValue();
            if (value != null) {
                buildEventUrl = RequestBuilder.buildEventUrl(value.getBiUrl());
            } else {
                DeveloperLog.LogD("build events request configurations error");
                buildEventUrl = RequestBuilder.buildEventUrl(CommonConstants.EVENT_BI_REPORT_URL);
            }
            if (TextUtils.isEmpty(buildEventUrl)) {
                return false;
            }
            ByteRequestBody byteRequestBody = new ByteRequestBody(buildEventForBIRequestBody, Charset.forName("UTF-8"), Headers.VALUE_APPLICATION_GZIP);
            AdRequest.post().url(buildEventUrl).body(byteRequestBody).headers(HeaderUtils.getBiHeaders()).connectTimeout(60000).readTimeout(100000).callback(this).performRequest(ApplicationUtil.getInstance().getApplicationContext());
            this.uploadTimes.incrementAndGet();
            return true;
        } catch (Throwable th) {
            th.printStackTrace();
            return false;
        }
    }
}
