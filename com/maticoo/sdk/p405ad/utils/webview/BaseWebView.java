package com.maticoo.sdk.p405ad.utils.webview;

import android.annotation.SuppressLint;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Message;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.ConsoleMessage;
import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.maticoo.sdk.utils.MethodBuilderFactory;
import com.maticoo.sdk.utils.Reflection;
import com.maticoo.sdk.utils.ViewUtils;
import com.maticoo.sdk.utils.debug.MaticooDebugUtils;
import com.maticoo.sdk.utils.log.DeveloperLog;
import com.unity3d.services.core.p621di.ServiceProvider;

/* renamed from: com.maticoo.sdk.ad.utils.webview.BaseWebView */
/* loaded from: classes6.dex */
public class BaseWebView extends WebView {
    private static Boolean isSupperTouchEvent;
    private boolean isDestroyed;
    private WebViewClient mWebViewClient;
    public long touchTimestamp;

    @SuppressLint({"SetJavaScriptEnabled"})
    public BaseWebView(Context context) {
        super(context);
        this.touchTimestamp = -1L;
        if (isSupperTouchEvent == null) {
            try {
                WebView.class.getDeclaredMethod("onTouchEvent", MotionEvent.class);
                isSupperTouchEvent = Boolean.TRUE;
            } catch (NoSuchMethodException unused) {
                DeveloperLog.LogE("WebView.onTouchEvent() not implemented");
            }
        }
        setWebViewClient(new DefaultWebViewClient());
        WebSettings settings = getSettings();
        int i = Build.VERSION.SDK_INT;
        settings.setAllowFileAccessFromFileURLs(true);
        settings.setAllowUniversalAccessFromFileURLs(true);
        settings.setAllowFileAccess(true);
        settings.setAllowContentAccess(true);
        settings.setBlockNetworkImage(false);
        settings.setBlockNetworkLoads(false);
        settings.setSupportZoom(false);
        settings.setBuiltInZoomControls(false);
        settings.setDisplayZoomControls(false);
        settings.setJavaScriptCanOpenWindowsAutomatically(false);
        settings.setJavaScriptEnabled(true);
        if (MaticooDebugUtils.debugMode) {
            WebView.setWebContentsDebuggingEnabled(true);
        }
        settings.setLoadsImagesAutomatically(true);
        settings.setMediaPlaybackRequiresUserGesture(false);
        settings.setMixedContentMode(0);
        settings.setSaveFormData(false);
        settings.setSavePassword(false);
        settings.setNeedInitialFocus(true);
        settings.setPluginState(WebSettings.PluginState.OFF);
        settings.setSupportMultipleWindows(false);
        setInitialScale(0);
        settings.setCacheMode(1);
        String str = getContext().getFilesDir().getAbsolutePath() + "cache/";
        if (i < 33) {
            Reflection.MethodBuilder addParam = MethodBuilderFactory.create(settings, "setAppCachePath").addParam(String.class, str);
            Reflection.MethodBuilder addParam2 = MethodBuilderFactory.create(settings, "setAppCacheMaxSize").addParam(Long.TYPE, Long.valueOf((long) ServiceProvider.HTTP_CACHE_DISK_SIZE));
            Reflection.MethodBuilder addParam3 = MethodBuilderFactory.create(settings, "setAppCacheEnabled").addParam(Boolean.TYPE, Boolean.TRUE);
            try {
                addParam.execute();
                addParam2.execute();
                addParam3.execute();
            } catch (Exception e) {
                DeveloperLog.LogE("setAppCache", e);
            }
        }
        settings.setDomStorageEnabled(true);
        settings.setDatabasePath(str);
        settings.setDatabaseEnabled(true);
        settings.setGeolocationEnabled(false);
        settings.setEnableSmoothTransition(false);
        settings.setLightTouchEnabled(false);
        settings.setRenderPriority(WebSettings.RenderPriority.NORMAL);
        setHorizontalScrollBarEnabled(false);
        setVerticalScrollBarEnabled(false);
        setWebChromeClient(new WebChromeClient() { // from class: com.maticoo.sdk.ad.utils.webview.BaseWebView.1
            @Override // android.webkit.WebChromeClient
            public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
                return true;
            }

            @Override // android.webkit.WebChromeClient
            public boolean onCreateWindow(WebView webView, boolean z, boolean z2, Message message) {
                return super.onCreateWindow(webView, z, z2, message);
            }

            @Override // android.webkit.WebChromeClient
            public boolean onJsAlert(WebView webView, String str2, String str3, JsResult jsResult) {
                return BaseWebView.chromePopupProcess(jsResult);
            }

            @Override // android.webkit.WebChromeClient
            public boolean onJsBeforeUnload(WebView webView, String str2, String str3, JsResult jsResult) {
                return BaseWebView.chromePopupProcess(jsResult);
            }

            @Override // android.webkit.WebChromeClient
            public boolean onJsConfirm(WebView webView, String str2, String str3, JsResult jsResult) {
                return BaseWebView.chromePopupProcess(jsResult);
            }

            @Override // android.webkit.WebChromeClient
            public boolean onJsPrompt(WebView webView, String str2, String str3, String str4, JsPromptResult jsPromptResult) {
                return BaseWebView.chromePopupProcess(jsPromptResult);
            }

            @Override // android.webkit.WebChromeClient
            public void onShowCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback) {
                super.onShowCustomView(view, customViewCallback);
            }

            @Override // android.webkit.WebChromeClient
            public boolean onShowFileChooser(WebView webView, ValueCallback<Uri[]> valueCallback, WebChromeClient.FileChooserParams fileChooserParams) {
                return super.onShowFileChooser(webView, valueCallback, fileChooserParams);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean chromePopupProcess(JsResult jsResult) {
        jsResult.confirm();
        return true;
    }

    private long getViewTouchTimestamp() {
        return this.touchTimestamp;
    }

    public void destroy(String str) {
        if (this.isDestroyed) {
            return;
        }
        ViewUtils.webViewDestroy(this, str);
        destroy();
        this.isDestroyed = true;
    }

    public boolean isAllow() {
        if (getViewTouchTimestamp() != -1 && SystemClock.elapsedRealtime() - getViewTouchTimestamp() < 4000) {
            return true;
        }
        return false;
    }

    public boolean isDestroyed() {
        return this.isDestroyed;
    }

    @Override // android.webkit.WebView
    public void loadUrl(String str) {
        super.loadUrl(str);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.webkit.WebView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        WebViewClient webViewClient = this.mWebViewClient;
        if (webViewClient instanceof BaseWebViewClient) {
            ((BaseWebViewClient) webViewClient).onAttachedToWindow(this);
        }
    }

    @Override // android.webkit.WebView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        setViewTouchTimestamp(SystemClock.elapsedRealtime());
        if (isSupperTouchEvent.booleanValue()) {
            return super.onTouchEvent(motionEvent);
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void setViewTouchTimestamp(long j) {
        this.touchTimestamp = j;
    }

    @Override // android.webkit.WebView
    public void setWebViewClient(WebViewClient webViewClient) {
        super.setWebViewClient(webViewClient);
        this.mWebViewClient = webViewClient;
    }
}
