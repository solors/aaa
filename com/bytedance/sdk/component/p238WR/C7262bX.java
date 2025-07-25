package com.bytedance.sdk.component.p238WR;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.ValueCallback;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.bytedance.sdk.component.p238WR.C7268eqN;
import com.bytedance.sdk.component.utils.C7741PX;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* renamed from: com.bytedance.sdk.component.WR.bX */
/* loaded from: classes3.dex */
public class C7262bX extends WebView {

    /* renamed from: IL */
    private final HashSet<String> f15675IL;

    /* renamed from: bX */
    private boolean f15676bX;

    /* renamed from: bg */
    public long f15677bg;
    private boolean eqN;
    private View$OnTouchListenerC7263bg ldr;

    /* renamed from: zx */
    private boolean f15678zx;

    public C7262bX(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f15675IL = new HashSet<>();
        this.f15677bg = System.currentTimeMillis();
        m89433bg();
    }

    /* renamed from: IL */
    private void m89434IL() {
        if (this.f15676bX) {
            return;
        }
        ViewParent parent = getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(this);
        }
        setOnClickListener(null);
        setOnTouchListener(null);
        Iterator<String> it = this.f15675IL.iterator();
        while (it.hasNext()) {
            super.removeJavascriptInterface(it.next());
        }
    }

    /* renamed from: bg */
    private void m89433bg() {
        WebSettings settings = getSettings();
        settings.setSupportZoom(false);
        settings.setDisplayZoomControls(false);
        settings.setBuiltInZoomControls(false);
        settings.setSupportMultipleWindows(false);
        settings.setAllowFileAccess(false);
        settings.setSavePassword(false);
        setWebViewClient(new C7268eqN.C7272bg());
    }

    @Override // android.webkit.WebView
    public void addJavascriptInterface(Object obj, String str) {
        toString();
        if (!this.f15676bX && !this.f15678zx) {
            super.addJavascriptInterface(obj, str);
            this.f15675IL.add(str);
            return;
        }
        C7741PX.m87873bg("TTAD.PangleWebView", "addJavascriptInterface: has destroyed or has recycler");
    }

    @Override // android.webkit.WebView
    public void clearCache(boolean z) {
        if (!this.f15676bX && !this.f15678zx) {
            super.clearCache(z);
        } else {
            C7741PX.m87873bg("TTAD.PangleWebView", "clearCache: has destroyed or recycler");
        }
    }

    @Override // android.webkit.WebView
    public void destroy() {
        toString();
        if (this.f15676bX) {
            return;
        }
        this.f15676bX = true;
        m89434IL();
        super.destroy();
    }

    @Override // android.webkit.WebView
    public void evaluateJavascript(String str, ValueCallback<String> valueCallback) {
        if (!this.f15676bX && !this.f15678zx) {
            super.evaluateJavascript(str, valueCallback);
        } else if (valueCallback != null) {
            C7741PX.m87873bg("TTAD.PangleWebView", "evaluateJavascript: has destroyed or recycler, ".concat(String.valueOf(str)));
            valueCallback.onReceiveValue("");
        }
    }

    @Override // android.webkit.WebView
    public void goBack() {
        if (!this.f15676bX && !this.f15678zx) {
            super.goBack();
        } else {
            C7741PX.m87873bg("TTAD.PangleWebView", "goBack: has destroyed or recycler");
        }
    }

    @Override // android.webkit.WebView
    public void goBackOrForward(int i) {
        if (!this.f15676bX && !this.f15678zx) {
            super.goBackOrForward(i);
        } else {
            C7741PX.m87873bg("TTAD.PangleWebView", "goBackOrForward: has destroyed or recycler");
        }
    }

    @Override // android.webkit.WebView
    public void goForward() {
        if (!this.f15676bX && !this.f15678zx) {
            super.goForward();
        } else {
            C7741PX.m87873bg("TTAD.PangleWebView", "goForward: has destroyed or recycler");
        }
    }

    @Override // android.webkit.WebView
    public void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5) {
        if (!this.f15676bX && !this.f15678zx) {
            super.loadDataWithBaseURL(str, str2, str3, str4, str5);
        } else {
            C7741PX.m87873bg("TTAD.PangleWebView", "loadDataWithBaseURL: has destroyed or recycler");
        }
    }

    @Override // android.webkit.WebView
    public void loadUrl(String str) {
        if (!this.f15676bX && !this.f15678zx) {
            try {
                super.loadUrl(str);
                return;
            } catch (Exception | IncompatibleClassChangeError | NoClassDefFoundError e) {
                C7741PX.m87871bg("TTAD.PangleWebView", "loadUrl: ", e);
                return;
            }
        }
        C7741PX.m87873bg("TTAD.PangleWebView", "loadUrl: has destroyed or recycler");
    }

    @Override // android.webkit.WebView, android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        toString();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        toString();
        if (this.eqN) {
            destroy();
        }
    }

    @Override // android.webkit.WebView, android.view.View
    protected void onDraw(Canvas canvas) {
        if (!this.f15676bX && !this.f15678zx) {
            super.onDraw(canvas);
        }
    }

    @Override // android.webkit.WebView, android.widget.AbsoluteLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        if (!this.f15676bX && !this.f15678zx) {
            super.onMeasure(i, i2);
        } else {
            setMeasuredDimension(0, 0);
        }
    }

    @Override // android.webkit.WebView
    public void onPause() {
        if (!this.f15676bX && !this.f15678zx) {
            try {
                super.onPause();
                return;
            } catch (Exception e) {
                C7741PX.m87871bg("TTAD.PangleWebView", "onPause: ", e);
                return;
            }
        }
        C7741PX.m87873bg("TTAD.PangleWebView", "onPause: has destroyed or recycler");
    }

    @Override // android.webkit.WebView
    public void onResume() {
        if (!this.f15676bX && !this.f15678zx) {
            try {
                super.onResume();
                return;
            } catch (Exception e) {
                C7741PX.m87871bg("TTAD.PangleWebView", "onResume: ", e);
                return;
            }
        }
        C7741PX.m87873bg("TTAD.PangleWebView", "onResume: has destroyed or recycler");
    }

    @Override // android.webkit.WebView
    public void pauseTimers() {
        if (!this.f15676bX && !this.f15678zx) {
            super.pauseTimers();
        }
    }

    @Override // android.webkit.WebView
    public void reload() {
        if (!this.f15676bX && !this.f15678zx) {
            super.reload();
        } else {
            C7741PX.m87873bg("TTAD.PangleWebView", "reload: has destroyed or recycler");
        }
    }

    @Override // android.webkit.WebView
    public void removeJavascriptInterface(String str) {
        if (!this.f15676bX && !this.f15678zx) {
            super.removeJavascriptInterface(str);
            this.f15675IL.remove(str);
        }
    }

    @Override // android.webkit.WebView
    public void resumeTimers() {
        if (!this.f15676bX && !this.f15678zx) {
            super.resumeTimers();
        }
    }

    public void setArbitrageTouchListener(View$OnTouchListenerC7263bg view$OnTouchListenerC7263bg) {
        this.ldr = view$OnTouchListenerC7263bg;
    }

    public void setDestroyOnDetached(boolean z) {
        this.eqN = z;
    }

    @Override // android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public void setOnTouchListener(View.OnTouchListener onTouchListener) {
        View$OnTouchListenerC7263bg view$OnTouchListenerC7263bg = this.ldr;
        if (view$OnTouchListenerC7263bg == null) {
            super.setOnTouchListener(onTouchListener);
            return;
        }
        view$OnTouchListenerC7263bg.m89425bg(onTouchListener);
        super.setOnTouchListener(this.ldr);
    }

    public void setRecycler(boolean z) {
        this.f15678zx = z;
    }

    @Override // android.webkit.WebView
    public void stopLoading() {
        if (!this.f15676bX && !this.f15678zx) {
            try {
                super.stopLoading();
                return;
            } catch (Exception e) {
                C7741PX.m87871bg("TTAD.PangleWebView", "stopLoading: ", e);
                return;
            }
        }
        C7741PX.m87873bg("TTAD.PangleWebView", "stopLoading: has destroyed or recycler");
    }

    public C7262bX(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f15675IL = new HashSet<>();
        this.f15677bg = System.currentTimeMillis();
        m89433bg();
    }

    @Override // android.webkit.WebView
    public void loadUrl(String str, Map<String, String> map) {
        if (!this.f15676bX && !this.f15678zx) {
            try {
                super.loadUrl(str, map);
                return;
            } catch (Exception | IncompatibleClassChangeError | NoClassDefFoundError e) {
                C7741PX.m87871bg("TTAD.PangleWebView", "loadUrl: ", e);
                return;
            }
        }
        C7741PX.m87873bg("TTAD.PangleWebView", "loadUrl: has destroyed or recycler");
    }
}
