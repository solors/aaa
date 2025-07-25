package com.maticoo.sdk.p405ad.utils.webview;

import android.text.TextUtils;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import androidx.annotation.MainThread;
import com.maticoo.sdk.bean.AdBean;
import com.maticoo.sdk.bean.Bidresp;
import com.maticoo.sdk.report.VastErrorReport;
import com.maticoo.sdk.utils.HandlerUtil;
import com.maticoo.sdk.utils.log.DeveloperLog;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.maticoo.sdk.ad.utils.webview.WebUtil */
/* loaded from: classes6.dex */
public class WebUtil {
    private static final String JS_DATA_TEMPLATE = "javascript:%s('%s')";
    private static final String JS_TEMPLATE = "javascript:%s()";

    public static JSONObject appendEventData(JSONObject jSONObject, String str, Object obj) throws JSONException {
        return jSONObject.put(str, obj);
    }

    public static JSONObject buildEventData(String str) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("type", str);
        return jSONObject;
    }

    public static String buildScript(JSONObject jSONObject) {
        return String.format(JS_TEMPLATE, jSONObject.toString());
    }

    public static boolean checkRedirectAndReport(WebView webView, AdBean adBean, String str) {
        Bidresp bidresp;
        if (adBean != null) {
            bidresp = adBean.getBidBean();
        } else {
            bidresp = null;
        }
        if (webView instanceof BaseWebView) {
            BaseWebView baseWebView = (BaseWebView) webView;
            if (!baseWebView.isAllow()) {
                VastErrorReport.reportErrorForAuto(bidresp, str);
                if (bidresp != null && bidresp.getAuto() != 0) {
                    return false;
                }
                return true;
            }
            baseWebView.setViewTouchTimestamp(-1L);
        }
        return false;
    }

    public static void loadJsCode(final String str, final WebView webView) {
        HandlerUtil.runOnUiThread(new Runnable() { // from class: com.maticoo.sdk.ad.utils.webview.WebUtil.3
            @Override // java.lang.Runnable
            public void run() {
                webView.evaluateJavascript(str, null);
            }
        });
    }

    public static void sendEvent(final WebView webView, final String str) {
        if (webView != null && !TextUtils.isEmpty(str)) {
            DeveloperLog.LogD("WebViewUtil:sendEvent", str);
            webView.post(new Runnable() { // from class: com.maticoo.sdk.ad.utils.webview.WebUtil.1
                @Override // java.lang.Runnable
                public void run() {
                    webView.evaluateJavascript(str, new ValueCallback<String>() { // from class: com.maticoo.sdk.ad.utils.webview.WebUtil.1.1
                        {
                            RunnableC215471.this = this;
                        }

                        @Override // android.webkit.ValueCallback
                        public void onReceiveValue(String str2) {
                        }
                    });
                }
            });
        }
    }

    @MainThread
    public static void sendEvent2(final WebView webView, final String str) {
        if (webView != null && !TextUtils.isEmpty(str)) {
            DeveloperLog.LogD("WebViewUtil:sendEvent", str);
            HandlerUtil.runOnUiThread(new Runnable() { // from class: com.maticoo.sdk.ad.utils.webview.WebUtil.2
                @Override // java.lang.Runnable
                public void run() {
                    webView.evaluateJavascript(str, new ValueCallback<String>() { // from class: com.maticoo.sdk.ad.utils.webview.WebUtil.2.1
                        {
                            RunnableC215492.this = this;
                        }

                        @Override // android.webkit.ValueCallback
                        public void onReceiveValue(String str2) {
                            DeveloperLog.LogD("WebViewUtil:sendEvent", "evaluateJavascript : " + str + " result: " + str2);
                        }
                    });
                }
            });
        }
    }

    public static String buildScript(String str, String str2) {
        return String.format(JS_DATA_TEMPLATE, str, str2);
    }

    public static String buildScript(String str) {
        return String.format(JS_TEMPLATE, str);
    }
}
