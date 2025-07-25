package com.learnings.purchase.event;

import com.learnings.purchase.PurchaseInitParameter;
import com.learnings.purchase.PurchaseLogUtil;
import com.learnings.purchase.event.https.HttpsFixUtil;
import com.p552ot.pubsub.p561i.p562a.C26559a;
import java.util.concurrent.TimeUnit;
import nf.HttpLoggingInterceptor;
import org.json.JSONObject;
import p1077ze.AbstractC45279b0;
import p1077ze.C45275a0;
import p1077ze.C45292c0;
import p1077ze.MediaType;
import p1077ze.OkHttpClient;
import p1077ze.ResponseBody;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes6.dex */
public class EventUploader {
    private static final String HOST = "https://api.learnings.ai";
    public static final String MEDIA_TYPE_JSON = "application/json; charset=utf-8";
    private static final String TAG = "Purchase_EventUploader";
    private OkHttpClient mOkHttpClient;
    private String mUrl;

    public EventUploader(PurchaseInitParameter purchaseInitParameter) {
        HttpLoggingInterceptor httpLoggingInterceptor = new HttpLoggingInterceptor();
        if (purchaseInitParameter.isShowLog()) {
            httpLoggingInterceptor.m14035d(HttpLoggingInterceptor.EnumC38818a.BODY);
        } else {
            httpLoggingInterceptor.m14035d(HttpLoggingInterceptor.EnumC38818a.NONE);
        }
        OkHttpClient.C45336a m43P = HttpsFixUtil.getFixHttpsBuilder().m32a(httpLoggingInterceptor).m43P(true);
        TimeUnit timeUnit = TimeUnit.SECONDS;
        this.mOkHttpClient = m43P.m26e(10L, timeUnit).m44O(10L, timeUnit).m29b0(10L, timeUnit).m28c();
        this.mUrl = "https://api.learnings.ai/iap/v1/event";
    }

    public boolean upload(String str) {
        C45292c0 execute;
        PurchaseLogUtil.log(TAG, "upload body: " + str);
        try {
            execute = this.mOkHttpClient.mo83b(new C45275a0.C45276a().m476j(AbstractC45279b0.create(MediaType.m97f(MEDIA_TYPE_JSON), str)).m468r(this.mUrl).m484b()).execute();
        } catch (Throwable th) {
            th.printStackTrace();
            PurchaseLogUtil.log(TAG, "upload exception: " + th.getMessage());
        }
        if (!execute.isSuccessful()) {
            PurchaseLogUtil.log(TAG, "upload fail http request not successful");
            return false;
        }
        ResponseBody m419a = execute.m419a();
        if (m419a == null) {
            PurchaseLogUtil.log(TAG, "upload fail http response body is null");
            return false;
        }
        String string = m419a.string();
        PurchaseLogUtil.log(TAG, "upload response: " + string);
        JSONObject optJSONObject = new JSONObject(string).optJSONObject("status");
        if (optJSONObject == null) {
            PurchaseLogUtil.log(TAG, "upload fail status is null");
            return false;
        } else if (optJSONObject.optInt(C26559a.f69635d) == 0) {
            PurchaseLogUtil.log(TAG, "upload successful");
            return true;
        } else {
            String optString = optJSONObject.optString("message");
            PurchaseLogUtil.log(TAG, "upload fail: " + optString);
            return false;
        }
    }
}
