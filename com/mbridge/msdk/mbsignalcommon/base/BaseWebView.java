package com.mbridge.msdk.mbsignalcommon.base;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.mbridge.msdk.foundation.tools.SameLogTool;
import java.lang.reflect.Method;

@SuppressLint({"NewApi"})
/* loaded from: classes6.dex */
public class BaseWebView extends WebView {

    /* renamed from: a */
    protected Context f57622a;

    /* renamed from: b */
    private View.OnTouchListener f57623b;

    /* renamed from: c */
    private View.OnTouchListener f57624c;
    public long lastTouchTime;
    public BaseWebViewClient mWebViewClient;

    public BaseWebView(Context context) {
        super(context);
        this.lastTouchTime = 0L;
        this.f57624c = new View.OnTouchListener() { // from class: com.mbridge.msdk.mbsignalcommon.base.BaseWebView.1
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction() == 0) {
                    BaseWebView.this.lastTouchTime = System.currentTimeMillis();
                }
                if (BaseWebView.this.f57623b != null) {
                    return BaseWebView.this.f57623b.onTouch(view, motionEvent);
                }
                return false;
            }
        };
        this.f57622a = context;
        mo51075a();
    }

    @Override // android.webkit.WebView
    public void reload() {
        super.reload();
    }

    public void setFilter(BaseFilter baseFilter) {
        BaseWebViewClient baseWebViewClient = this.mWebViewClient;
        if (baseWebViewClient != null && (baseWebViewClient instanceof BaseWebViewClient)) {
            baseWebViewClient.m51167a(baseFilter);
        }
    }

    @Override // android.view.View
    public void setOnTouchListener(View.OnTouchListener onTouchListener) {
        this.f57623b = onTouchListener;
    }

    public void setTransparent() {
        setLayerType(1, null);
        setBackgroundColor(0);
    }

    @Override // android.webkit.WebView
    public void setWebViewClient(WebViewClient webViewClient) {
        super.setWebViewClient(webViewClient);
        if (webViewClient instanceof BaseWebViewClient) {
            this.mWebViewClient = (BaseWebViewClient) webViewClient;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public void mo51075a() {
        if (this.mWebViewClient == null) {
            BaseWebViewClient baseWebViewClient = new BaseWebViewClient();
            this.mWebViewClient = baseWebViewClient;
            setWebViewClient(baseWebViewClient);
        }
        setHorizontalScrollBarEnabled(false);
        setVerticalScrollBarEnabled(false);
        WebSettings settings = getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setAppCacheEnabled(true);
        settings.setAppCacheMaxSize(5242880L);
        settings.setAllowFileAccess(true);
        settings.setBuiltInZoomControls(true);
        settings.setJavaScriptCanOpenWindowsAutomatically(true);
        settings.setDomStorageEnabled(true);
        settings.setSupportZoom(false);
        settings.setSavePassword(false);
        settings.setDatabaseEnabled(true);
        settings.setUseWideViewPort(true);
        settings.setLoadWithOverviewMode(true);
        settings.setRenderPriority(WebSettings.RenderPriority.HIGH);
        try {
            if (Build.VERSION.SDK_INT >= 26) {
                settings.setSafeBrowsingEnabled(false);
            }
        } catch (Throwable th) {
            SameLogTool.m51824b("BaseWebView", th.getMessage());
        }
        settings.setMediaPlaybackRequiresUserGesture(false);
        settings.setAllowFileAccessFromFileURLs(false);
        settings.setAllowUniversalAccessFromFileURLs(false);
        try {
            settings.setMixedContentMode(0);
        } catch (Exception e) {
            SameLogTool.m51824b("BaseWebView", e.getMessage());
        }
        settings.setDatabaseEnabled(true);
        String path = this.f57622a.getDir("database", 0).getPath();
        settings.setDatabasePath(path);
        settings.setGeolocationEnabled(true);
        settings.setGeolocationDatabasePath(path);
        try {
            Method declaredMethod = WebSettings.class.getDeclaredMethod("setDisplayZoomControls", Boolean.TYPE);
            declaredMethod.setAccessible(true);
            declaredMethod.invoke(settings, Boolean.FALSE);
        } catch (Exception e2) {
            SameLogTool.m51824b("BaseWebView", e2.getMessage());
        }
        super.setOnTouchListener(this.f57624c);
    }

    public BaseWebView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.lastTouchTime = 0L;
        this.f57624c = new View.OnTouchListener() { // from class: com.mbridge.msdk.mbsignalcommon.base.BaseWebView.1
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction() == 0) {
                    BaseWebView.this.lastTouchTime = System.currentTimeMillis();
                }
                if (BaseWebView.this.f57623b != null) {
                    return BaseWebView.this.f57623b.onTouch(view, motionEvent);
                }
                return false;
            }
        };
        this.f57622a = context;
        mo51075a();
    }

    public BaseWebView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.lastTouchTime = 0L;
        this.f57624c = new View.OnTouchListener() { // from class: com.mbridge.msdk.mbsignalcommon.base.BaseWebView.1
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction() == 0) {
                    BaseWebView.this.lastTouchTime = System.currentTimeMillis();
                }
                if (BaseWebView.this.f57623b != null) {
                    return BaseWebView.this.f57623b.onTouch(view, motionEvent);
                }
                return false;
            }
        };
        this.f57622a = context;
        mo51075a();
    }
}
