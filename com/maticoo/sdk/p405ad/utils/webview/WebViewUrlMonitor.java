package com.maticoo.sdk.p405ad.utils.webview;

import com.amazon.aps.shared.metrics.model.ApsMetricsDataMap;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.maticoo.sdk.utils.ApplicationUtil;
import com.maticoo.sdk.utils.constant.CommonConstants;
import com.maticoo.sdk.utils.log.DeveloperLog;
import com.maticoo.sdk.utils.request.HeaderUtils;
import com.maticoo.sdk.utils.request.network.AdRequest;
import com.maticoo.sdk.utils.request.network.Request;
import com.maticoo.sdk.utils.request.network.Response;
import com.maticoo.sdk.utils.request.network.StringRequestBody;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.maticoo.sdk.ad.utils.webview.WebViewUrlMonitor */
/* loaded from: classes6.dex */
public class WebViewUrlMonitor {
    private OfferInfo offerInfo;

    /* renamed from: com.maticoo.sdk.ad.utils.webview.WebViewUrlMonitor$OfferInfo */
    /* loaded from: classes6.dex */
    public static class OfferInfo {
        public String crid;
        public int isSuccess;
        public long postTime;
        public List<UrlInfo> urlList = new ArrayList();
        public String icc = Locale.getDefault().getCountry();

        public OfferInfo(String str) {
            this.crid = str;
        }
    }

    /* renamed from: com.maticoo.sdk.ad.utils.webview.WebViewUrlMonitor$UrlInfo */
    /* loaded from: classes6.dex */
    public static class UrlInfo {
        public long currentTime;
        public int responseCode;
        public String url;

        public UrlInfo(String str, long j, int i) {
            this.responseCode = i;
            this.url = str;
            this.currentTime = j;
        }

        public boolean equals(Object obj) {
            return this.url.equals(((UrlInfo) obj).url);
        }
    }

    public WebViewUrlMonitor(String str) {
        this.offerInfo = new OfferInfo(str);
    }

    private void post2Server(String str) {
        try {
            DeveloperLog.LogD("WebViewUrlMonitor, post2Server, jsonStr : " + str);
            AdRequest.post().url(CommonConstants.getRedirectUrl()).headers(HeaderUtils.getBaseHeaders()).body(new StringRequestBody(str)).connectTimeout(60000).readTimeout(60000).instanceFollowRedirects(true).callback(new Request.OnRequestCallback() { // from class: com.maticoo.sdk.ad.utils.webview.WebViewUrlMonitor.1
                {
                    WebViewUrlMonitor.this = this;
                }

                @Override // com.maticoo.sdk.utils.request.network.Request.OnRequestCallback
                public void onRequestFailed(String str2) {
                    DeveloperLog.LogD("WebViewUrlMonitor, post2Server, onRequestFailed : " + str2);
                }

                @Override // com.maticoo.sdk.utils.request.network.Request.OnRequestCallback
                public void onRequestSuccess(Response response) {
                    DeveloperLog.LogD("WebViewUrlMonitor, post2Server, onRequestSuccess : " + response);
                }
            }).performRequest(ApplicationUtil.getInstance().getApplicationContext());
        } catch (Exception unused) {
        }
    }

    private void setUrl(String str, int i) {
        DeveloperLog.LogD("WebViewUrlMonitor, url = " + str + "  responseCode = " + i);
        if (this.offerInfo == null) {
            return;
        }
        UrlInfo urlInfo = new UrlInfo(str, System.currentTimeMillis(), i);
        if (this.offerInfo.urlList.contains(urlInfo)) {
            this.offerInfo.urlList.remove(urlInfo);
        }
        this.offerInfo.urlList.add(urlInfo);
    }

    private String toJson() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("crid", this.offerInfo.crid);
            jSONObject.put("icc", this.offerInfo.icc);
            jSONObject.put("s", this.offerInfo.isSuccess);
            jSONObject.put("t", this.offerInfo.postTime);
            int i = 0;
            while (i < this.offerInfo.urlList.size()) {
                UrlInfo urlInfo = this.offerInfo.urlList.get(i);
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put(ApsMetricsDataMap.APSMETRICS_FIELD_URL, urlInfo.url);
                jSONObject2.put("t", urlInfo.currentTime);
                jSONObject2.put(InneractiveMediationDefs.GENDER_FEMALE, urlInfo.responseCode);
                i++;
                jSONObject.put(String.valueOf(i), jSONObject2);
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
        String jSONObject3 = jSONObject.toString();
        DeveloperLog.LogD("WebViewUrlMonitor, result = " + jSONObject3);
        return jSONObject3;
    }

    public void loadSuccess() {
        long currentTimeMillis = System.currentTimeMillis();
        OfferInfo offerInfo = this.offerInfo;
        offerInfo.isSuccess = 0;
        offerInfo.postTime = currentTimeMillis;
        post2Server(toJson());
        this.offerInfo = null;
    }

    public void setUrl200(String str) {
        setUrl(str, 200);
    }

    public void setUrl302(String str) {
        setUrl(str, 302);
    }

    public void timeOut() {
        long currentTimeMillis = System.currentTimeMillis();
        OfferInfo offerInfo = this.offerInfo;
        offerInfo.isSuccess = 1;
        offerInfo.postTime = currentTimeMillis;
        post2Server(toJson());
        this.offerInfo = null;
    }
}
