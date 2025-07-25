package com.taurusx.tax.p606j.p614c0;

import android.graphics.Bitmap;
import android.text.TextUtils;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.taurusx.tax.p606j.EnumC28534q;
import com.taurusx.tax.p606j.p613b0.C28506e;
import com.taurusx.tax.p606j.p613b0.EnumC28492b;
import com.taurusx.tax.utils.webview.TaxBrowserActivity;
import java.util.EnumSet;
import p978t3.WebViewRenderException;

/* renamed from: com.taurusx.tax.j.c0.b */
/* loaded from: classes7.dex */
public class C28514b extends WebViewClient {

    /* renamed from: b */
    public static final EnumSet<EnumC28492b> f73956b = EnumSet.of(EnumC28492b.HANDLE_PHONE_SCHEME, EnumC28492b.OPEN_APP_MARKET, EnumC28492b.OPEN_IN_APP_BROWSER, EnumC28492b.HANDLE_SHARE_TWEET, EnumC28492b.FOLLOW_DEEP_LINK_WITH_FALLBACK, EnumC28492b.FOLLOW_DEEP_LINK);

    /* renamed from: a */
    public TaxBrowserActivity f73957a;

    public C28514b(TaxBrowserActivity taxBrowserActivity) {
        this.f73957a = taxBrowserActivity;
    }

    @Override // android.webkit.WebViewClient
    public void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        if (webView.canGoBack()) {
            EnumC28534q.LEFT_ARROW.createDrawable(this.f73957a);
        } else {
            EnumC28534q.UNLEFT_ARROW.createDrawable(this.f73957a);
        }
        this.f73957a.getClass();
        throw null;
    }

    @Override // android.webkit.WebViewClient
    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        super.onPageStarted(webView, str, bitmap);
        TaxBrowserActivity taxBrowserActivity = this.f73957a;
        taxBrowserActivity.getClass();
        EnumC28534q.UNRIGHT_ARROW.createDrawable(taxBrowserActivity);
        throw null;
    }

    @Override // android.webkit.WebViewClient
    public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        WebViewRenderException.m3275a(this);
        return true;
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        C28506e.InterfaceC28511e interfaceC28511e;
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        EnumSet.of(EnumC28492b.NOOP);
        interfaceC28511e = C28506e.f73934i;
        return new C28506e(EnumSet.copyOf((EnumSet) f73956b), new C28515a(), interfaceC28511e, true, null).m38058a(this.f73957a.getApplicationContext(), str, true);
    }

    /* renamed from: com.taurusx.tax.j.c0.b$a */
    /* loaded from: classes7.dex */
    public class C28515a implements C28506e.InterfaceC28510d {
        public C28515a() {
            C28514b.this = r1;
        }

        @Override // com.taurusx.tax.p606j.p613b0.C28506e.InterfaceC28510d
        /* renamed from: a */
        public void mo38046a(String str, EnumC28492b enumC28492b) {
            if (enumC28492b.equals(EnumC28492b.OPEN_IN_APP_BROWSER)) {
                C28514b.this.f73957a.f74289a.loadUrl(str);
            } else {
                C28514b.this.f73957a.finish();
            }
        }

        @Override // com.taurusx.tax.p606j.p613b0.C28506e.InterfaceC28510d
        /* renamed from: b */
        public void mo38045b(String str, EnumC28492b enumC28492b) {
        }
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(WebView webView, int i, String str, String str2) {
    }
}
