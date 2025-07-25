package com.taurusx.tax.p604i;

import android.content.Context;
import android.util.AttributeSet;
import android.webkit.CookieManager;
import android.webkit.WebView;
import com.taurusx.tax.p578b.p581e.C28219a;
import com.taurusx.tax.p578b.p581e.C28237j;
import com.taurusx.tax.p606j.C28518e;
import com.taurusx.tax.p606j.C28549x;

/* renamed from: com.taurusx.tax.i.h */
/* loaded from: classes7.dex */
public class C28445h extends WebView {

    /* renamed from: a */
    public static boolean f73865a = false;
    public boolean mDestroyed;
    public InterfaceC28446a mWebViewListener;

    /* renamed from: com.taurusx.tax.i.h$a */
    /* loaded from: classes7.dex */
    public interface InterfaceC28446a {
        /* renamed from: a */
        void mo37825a();

        /* renamed from: a */
        void mo37824a(C28219a c28219a, C28237j c28237j);

        /* renamed from: a */
        boolean mo37823a(String str);

        /* renamed from: b */
        void mo37822b();
    }

    public C28445h(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m38085a();
        C28518e.m38035a(this);
        if (f73865a) {
            return;
        }
        m38084a(getContext());
        f73865a = true;
    }

    /* renamed from: a */
    public final void m38084a(Context context) {
    }

    @Override // android.webkit.WebView
    public void destroy() {
        if (this.mDestroyed) {
            return;
        }
        this.mDestroyed = true;
        C28549x.m37972a(this);
        removeAllViews();
        super.destroy();
    }

    @Override // android.webkit.WebView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        CookieManager.getInstance().setAcceptThirdPartyCookies(this, true);
    }

    public void setWebViewListener(InterfaceC28446a interfaceC28446a) {
        this.mWebViewListener = interfaceC28446a;
    }

    public void setWebViewScaleJS() {
        loadUrl("javascript:var meta = document.querySelector('meta[name=viewport]');if (!meta){meta = document.createElement('meta');meta.name = 'viewport'; meta.content = 'width=device-width,user-scalable=no,initial-scale=1,maximum-scale=1';document.getElementsByTagName('head')[0].appendChild(meta);}");
    }

    /* renamed from: a */
    public final void m38085a() {
        getSettings().setAllowFileAccess(false);
        getSettings().setAllowContentAccess(false);
        getSettings().setAllowFileAccessFromFileURLs(false);
        getSettings().setAllowUniversalAccessFromFileURLs(false);
        getSettings().setSavePassword(false);
        getSettings().setCacheMode(1);
        removeJavascriptInterface("searchBoxJavaBridge_");
        removeJavascriptInterface("accessibility");
        removeJavascriptInterface("accessibilityTraversal");
    }

    public C28445h(Context context) {
        super(context.getApplicationContext());
        m38085a();
        C28518e.m38035a(this);
        if (f73865a) {
            return;
        }
        m38084a(getContext());
        f73865a = true;
    }

    public void loadHtmlResponse(String str) {
    }
}
