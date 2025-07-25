package com.maticoo.sdk.mraid;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.http.SslError;
import android.text.TextUtils;
import android.util.Base64;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.SslErrorHandler;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.maticoo.sdk.mraid.cache.ImageInterceptor;
import com.maticoo.sdk.mraid.cache.WebCacheManager;
import com.maticoo.sdk.p405ad.utils.webview.BaseWebView;
import com.maticoo.sdk.p405ad.utils.webview.BaseWebViewClient;
import com.maticoo.sdk.utils.HandlerUtil;
import com.maticoo.sdk.utils.ViewUtils;
import com.vungle.ads.internal.Constants;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.Formatter;
import java.util.Locale;

/* loaded from: classes6.dex */
public class WebView extends BaseWebView {
    private static final String MRAID_JAVASCRIPT_INTERFACE_NAME = "MASTMRAIDWebView";
    private Bridge bridge;
    private Handler handler;
    private boolean isDestroyed;
    private boolean loaded;
    private final GestureDetector mGestureDetector;
    GestureDetector.OnGestureListener mOnGestureListener;
    private final BaseWebViewClient mWebViewClient;
    private String mraidBridgeJavascript;
    private final WebCacheManager webCacheManager;
    private boolean webviewFailed;

    /* loaded from: classes6.dex */
    private static class ChromeClient extends WebChromeClient {
        private ChromeClient() {
        }
    }

    /* loaded from: classes6.dex */
    public interface Handler {
        void webViewExposureChange(WebView webView, Bridge bridge, boolean z);

        void webViewOnClick(WebView webView);

        void webViewPageFinished(WebView webView);

        void webViewPageStarted(WebView webView);

        void webViewReceivedError(WebView webView, int i, String str, String str2);

        void webViewRenderProcessGone(RenderProcessGoneDetail renderProcessGoneDetail);

        boolean webViewShouldOverrideUrlLoading(WebView webView, String str);
    }

    /* loaded from: classes6.dex */
    private class TouchListener implements View.OnTouchListener {
        private TouchListener() {
        }

        @Override // android.view.View.OnTouchListener
        @SuppressLint({"ClickableViewAccessibility"})
        public boolean onTouch(View view, MotionEvent motionEvent) {
            int action = motionEvent.getAction();
            if ((action == 0 || action == 1) && !view.hasFocus()) {
                view.requestFocus();
            }
            return WebView.this.mGestureDetector.onTouchEvent(motionEvent);
        }
    }

    @SuppressLint({"SetJavaScriptEnabled"})
    public WebView(Context context) {
        super(context);
        this.handler = null;
        this.loaded = false;
        this.mraidBridgeJavascript = null;
        this.webviewFailed = false;
        WebCacheManager newInstance = WebCacheManager.newInstance();
        this.webCacheManager = newInstance;
        this.mOnGestureListener = new GestureDetector.SimpleOnGestureListener() { // from class: com.maticoo.sdk.mraid.WebView.3
            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
            public boolean onSingleTapUp(MotionEvent motionEvent) {
                WebView.this.performClick();
                return false;
            }
        };
        newInstance.addCacheInterceptor(new ImageInterceptor(context));
        setBackgroundColor(0);
        ViewClientAPI11 viewClientAPI11 = new ViewClientAPI11();
        this.mWebViewClient = viewClientAPI11;
        setWebViewClient(viewClientAPI11);
        setOnTouchListener(new TouchListener());
        setScrollBarStyle(0);
        removeJavascriptInterface("searchBoxJavaBridge_");
        this.mGestureDetector = new GestureDetector(context, this.mOnGestureListener);
        setOnClickListener(new View.OnClickListener() { // from class: com.maticoo.sdk.mraid.WebView.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (WebView.this.handler != null) {
                    WebView.this.handler.webViewOnClick(WebView.this);
                }
            }
        });
    }

    @Override // android.webkit.WebView
    public void destroy() {
        if (this.isDestroyed) {
            return;
        }
        ViewUtils.webViewDestroy(this, MRAID_JAVASCRIPT_INTERFACE_NAME);
        super.destroy();
        this.isDestroyed = true;
    }

    public void injectJavascript(String str) {
        final String str2 = "javascript:" + str;
        HandlerUtil.runOnUiThread(new Runnable() { // from class: com.maticoo.sdk.mraid.WebView.2
            @Override // java.lang.Runnable
            public void run() {
                if (WebView.this.isDestroyed) {
                    return;
                }
                WebView.this.loadUrl(str2);
            }
        });
    }

    public boolean isLoaded() {
        return this.loaded;
    }

    @SuppressLint({"AddJavascriptInterface", "JavascriptInterface"})
    public void loadFragment(String str, String str2, Bridge bridge) throws Exception {
        this.bridge = bridge;
        addJavascriptInterface(bridge, MRAID_JAVASCRIPT_INTERFACE_NAME);
        if (!TextUtils.isEmpty(str2)) {
            str2 = "manifest=\"" + str2 + "\"";
        }
        Formatter formatter = new Formatter(Locale.US);
        formatter.format(Defaults.RICHMEDIA_FORMAT, str2, str);
        String formatter2 = formatter.toString();
        formatter.close();
        loadData(Base64.encodeToString(formatter2.replace(Constants.AD_MRAID_JS_FILE_NAME, "http://localhost/mraid.js").getBytes(), 0), "text/html; charset=UTF-8", "base64");
    }

    public void loadUrl(@NonNull String str, Bridge bridge) {
        this.bridge = bridge;
        addJavascriptInterface(bridge, MRAID_JAVASCRIPT_INTERFACE_NAME);
        super.loadUrl(str);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.maticoo.sdk.p405ad.utils.webview.BaseWebView, android.webkit.WebView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Handler handler = this.handler;
        if (handler != null) {
            handler.webViewExposureChange(this, this.bridge, isShown());
        }
    }

    public void setHandler(Handler handler) {
        this.handler = handler;
    }

    @Override // android.webkit.WebView
    @NonNull
    public BaseWebViewClient getWebViewClient() {
        return this.mWebViewClient;
    }

    /* loaded from: classes6.dex */
    private class ViewClientAPI11 extends ViewClientAPI8 {
        public ViewClientAPI11() {
            super();
        }

        @Override // com.maticoo.sdk.mraid.WebView.ViewClientAPI8
        protected void initJavascriptBridge() {
            WebView.this.mraidBridgeJavascript = Assets.getMraidJs();
        }

        @Override // com.maticoo.sdk.mraid.WebView.ViewClientAPI8, android.webkit.WebViewClient
        public void onReceivedSslError(android.webkit.WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
            sslErrorHandler.cancel();
        }

        @Override // com.maticoo.sdk.mraid.WebView.ViewClientAPI8, android.webkit.WebViewClient
        public WebResourceResponse shouldInterceptRequest(android.webkit.WebView webView, String str) {
            if (!TextUtils.isEmpty(str) && str.contains(Constants.AD_MRAID_JS_FILE_NAME)) {
                return new WebResourceResponse("text/javascript", "UTF-8", new ByteArrayInputStream(WebView.this.mraidBridgeJavascript.getBytes()));
            }
            return super.shouldInterceptRequest(webView, str);
        }

        @Override // com.maticoo.sdk.mraid.WebView.ViewClientAPI8, android.webkit.WebViewClient
        @Nullable
        public WebResourceResponse shouldInterceptRequest(android.webkit.WebView webView, WebResourceRequest webResourceRequest) {
            if (webResourceRequest != null && webResourceRequest.getUrl() != null && !TextUtils.isEmpty(webResourceRequest.getUrl().getPath()) && webResourceRequest.getUrl().getPath().contains(Constants.AD_MRAID_JS_FILE_NAME)) {
                return new WebResourceResponse("text/javascript", "UTF-8", new ByteArrayInputStream(WebView.this.mraidBridgeJavascript.getBytes()));
            }
            return super.shouldInterceptRequest(webView, webResourceRequest);
        }
    }

    /* loaded from: classes6.dex */
    private class ViewClientAPI8 extends BaseWebViewClient {
        public ViewClientAPI8() {
            initJavascriptBridge();
        }

        @NonNull
        private WebResourceResponse getReplaceIcon() {
            Bitmap createBitmap = Bitmap.createBitmap(1, 1, Bitmap.Config.ALPHA_8);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            createBitmap.compress(Bitmap.CompressFormat.PNG, 50, byteArrayOutputStream);
            return new WebResourceResponse("image/png", null, new BufferedInputStream(new ByteArrayInputStream(byteArrayOutputStream.toByteArray())));
        }

        protected void initJavascriptBridge() {
            if (WebView.this.mraidBridgeJavascript == null) {
                WebView.this.mraidBridgeJavascript = Assets.getMraidJs();
            }
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(android.webkit.WebView webView, String str) {
            super.onPageFinished(webView, str);
            WebView.this.loaded = true;
            if (!WebView.this.webviewFailed && WebView.this.handler != null) {
                WebView.this.handler.webViewPageFinished((WebView) webView);
            }
            webView.setFocusableInTouchMode(true);
        }

        @Override // android.webkit.WebViewClient
        public void onPageStarted(android.webkit.WebView webView, String str, Bitmap bitmap) {
            super.onPageStarted(webView, str, bitmap);
            WebView.this.loaded = false;
            if (WebView.this.handler != null) {
                WebView.this.handler.webViewPageStarted((WebView) webView);
            }
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(android.webkit.WebView webView, int i, String str, String str2) {
            super.onReceivedError(webView, i, str, str2);
            WebView.this.webviewFailed = true;
            if (WebView.this.handler != null) {
                WebView.this.handler.webViewReceivedError((WebView) webView, i, str, str2);
            }
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedSslError(android.webkit.WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
            sslErrorHandler.cancel();
        }

        @Override // com.maticoo.sdk.p405ad.utils.webview.BaseWebViewClient, android.webkit.WebViewClient
        public boolean onRenderProcessGone(android.webkit.WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
            if (webView != null && webView.getParent() != null && (webView.getParent() instanceof ViewGroup)) {
                ((ViewGroup) webView.getParent()).removeView(webView);
                webView.destroy();
            }
            WebView.this.webviewFailed = true;
            if (WebView.this.handler != null) {
                WebView.this.handler.webViewRenderProcessGone(renderProcessGoneDetail);
            }
            return true;
        }

        @Override // android.webkit.WebViewClient
        @Nullable
        public WebResourceResponse shouldInterceptRequest(android.webkit.WebView webView, WebResourceRequest webResourceRequest) {
            if (webResourceRequest != null && webResourceRequest.getUrl() != null) {
                if (!"/favicon.ico".equals(webResourceRequest.getUrl().getPath())) {
                    try {
                        return WebView.this.webCacheManager.interceptWebResRequest(webResourceRequest);
                    } catch (Exception e) {
                        e.printStackTrace();
                        return null;
                    }
                }
                return getReplaceIcon();
            }
            return super.shouldInterceptRequest(webView, webResourceRequest);
        }

        @Override // com.maticoo.sdk.p405ad.utils.webview.BaseWebViewClient, android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(android.webkit.WebView webView, String str) {
            if (WebView.this.handler != null) {
                return WebView.this.handler.webViewShouldOverrideUrlLoading((WebView) webView, str);
            }
            return false;
        }

        @Override // android.webkit.WebViewClient
        @TargetApi(23)
        public void onReceivedError(android.webkit.WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
            super.onReceivedError(webView, webResourceRequest, webResourceError);
            if (webResourceRequest.isForMainFrame()) {
                onReceivedError(webView, webResourceError.getErrorCode(), webResourceError.getDescription().toString(), webResourceRequest.getUrl().toString());
            }
        }

        @Override // android.webkit.WebViewClient
        @Nullable
        public WebResourceResponse shouldInterceptRequest(android.webkit.WebView webView, String str) {
            return super.shouldInterceptRequest(webView, str);
        }
    }
}
