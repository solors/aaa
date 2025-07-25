package com.maticoo.sdk.p405ad.utils.webview;

import android.annotation.SuppressLint;
import android.text.TextUtils;
import android.webkit.JavascriptInterface;
import android.webkit.WebView;
import androidx.annotation.MainThread;
import com.maticoo.sdk.p405ad.utils.AdsUtil;
import com.maticoo.sdk.utils.HandlerUtil;
import com.maticoo.sdk.utils.crash.CrashUtil;
import com.maticoo.sdk.utils.log.DeveloperLog;
import org.json.JSONObject;

/* renamed from: com.maticoo.sdk.ad.utils.webview.JsBridge */
/* loaded from: classes6.dex */
public class JsBridge {
    public static final String AD_BRIDGE = "adBridge";
    public static final String JS_ON_LOAD = "javascript:window.addEventListener('load', function(){window.sdk.callOnLoad()})";
    public static final String JS_VIEW_PORT = "var meta = document.createElement('meta'); meta.name = 'viewport'; meta.content = 'width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no'; var head = document.getElementsByTagName('head')[0]; head.appendChild(meta);";
    public static final String SDK = "sdk";
    private static final String TAG = "JsBridge";
    private int abt;
    private int adType;
    private String campaign;
    private String jsObjectName;
    private MessageListener mListener;
    private BaseWebView mWebView;
    private String placementId;
    private String sceneName;

    /* renamed from: com.maticoo.sdk.ad.utils.webview.JsBridge$MessageListener */
    /* loaded from: classes6.dex */
    public interface MessageListener {
        @MainThread
        void onReceiveMessage(String str, JSONObject jSONObject);
    }

    @JavascriptInterface
    public void callOnLoad() {
        DeveloperLog.LogD(TAG, "callOnLoad");
        notifyView(JsBridgeConstants.METHOD_ON_LOAD, null);
    }

    @JavascriptInterface
    public String getSdkVersion() {
        return "1.8.1.1";
    }

    @JavascriptInterface
    public void goBack() {
        try {
            DeveloperLog.LogD(TAG, "call goBack");
            notifyView(JsBridgeConstants.METHOD_GO_BACK, null);
        } catch (Exception e) {
            DeveloperLog.LogD(JsBridgeConstants.METHOD_GO_BACK, e);
            CrashUtil.getSingleton().reportSDKException(e, JsBridgeConstants.METHOD_GO_BACK);
        }
    }

    @SuppressLint({"AddJavascriptInterface"})
    public void injectJavaScript(WebView webView, String str) {
        if (webView == null) {
            return;
        }
        BaseWebView baseWebView = (BaseWebView) webView;
        this.mWebView = baseWebView;
        baseWebView.addJavascriptInterface(this, str);
    }

    public void jsLog(String str, JSONObject jSONObject) {
        AdsUtil.reportJSLog(str, this.placementId, this.adType, jSONObject);
    }

    public void notifyView(final String str, final JSONObject jSONObject) {
        HandlerUtil.runOnUiThread(new Runnable() { // from class: com.maticoo.sdk.ad.utils.webview.JsBridge.1
            @Override // java.lang.Runnable
            public void run() {
                if (JsBridge.this.mListener != null) {
                    JsBridge.this.mListener.onReceiveMessage(str, jSONObject);
                }
                if ("close".equals(str) || JsBridgeConstants.METHOD_GO_BACK.equals(str)) {
                    JsBridge.this.release();
                }
            }
        });
    }

    @JavascriptInterface
    public String postMessage(String str) {
        String str2;
        try {
            DeveloperLog.LogD(TAG, "postMessage :  param : " + str);
        } catch (Exception e) {
            DeveloperLog.LogD("postMessage", e);
            CrashUtil.getSingleton().reportSDKException(e, "postMessage");
        }
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        JSONObject jSONObject = new JSONObject(str);
        String optString = jSONObject.optString("m");
        JSONObject optJSONObject = jSONObject.optJSONObject("d");
        StringBuilder sb2 = new StringBuilder();
        sb2.append("postMessage :  method : ");
        sb2.append(optString);
        sb2.append(" data : ");
        if (optJSONObject == null) {
            str2 = "";
        } else {
            str2 = optJSONObject.toString();
        }
        sb2.append(str2);
        DeveloperLog.LogD(TAG, sb2.toString());
        if (!"click".equals(optString) && !"close".equals(optString) && !JsBridgeConstants.METHOD_CLOSE_VISIBLE.equals(optString) && !JsBridgeConstants.METHOD_JS_LOAD_SUCCESS.equals(optString) && !JsBridgeConstants.METHOD_JS_LOAD_FAILED.equals(optString) && !JsBridgeConstants.METHOD_VIDEO_IMPL.equals(optString) && !"video_completed".equals(optString) && !JsBridgeConstants.METHOD_AD_REWARDED.equals(optString) && !JsBridgeConstants.METHOD_TRUMPET.equals(optString) && !JsBridgeConstants.METHOD_INTERACT_EVENT.equals(optString) && !JsBridgeConstants.METHOD_IMAGE_IMPL.equals(optString) && !JsBridgeConstants.METHOD_PAGE_READY.equals(optString) && !JsBridgeConstants.METHOD_COMPANION_IMP.equals(optString) && !JsBridgeConstants.METHOD_ICON_VIEW.equals(optString)) {
            if ("js_log".equals(optString)) {
                jsLog(jSONObject.optString("e"), optJSONObject);
            }
            return "";
        }
        notifyView(optString, optJSONObject);
        return "";
    }

    @MainThread
    public void release() {
        this.mListener = null;
        BaseWebView baseWebView = this.mWebView;
        if (baseWebView != null && !baseWebView.isDestroyed()) {
            this.mWebView.removeJavascriptInterface(this.jsObjectName);
        }
        this.mWebView = null;
    }

    public void reportEvent(String str) {
        WebUtil.sendEvent(this.mWebView, WebUtil.buildScript(str));
    }

    @MainThread
    public void reportEvent2(String str) {
        WebUtil.sendEvent2(this.mWebView, WebUtil.buildScript(str));
    }

    public void setAbt(int i) {
        this.abt = i;
    }

    public void setAdType(int i) {
        this.adType = i;
    }

    public void setCampaign(String str) {
        this.campaign = str;
    }

    public void setMessageListener(MessageListener messageListener) {
        this.mListener = messageListener;
    }

    public void setPlacementId(String str) {
        this.placementId = str;
    }

    public void setSceneName(String str) {
        this.sceneName = str;
    }

    @MainThread
    public void reportEvent2(String str, String str2) {
        WebUtil.sendEvent2(this.mWebView, WebUtil.buildScript(str, str2));
    }
}
