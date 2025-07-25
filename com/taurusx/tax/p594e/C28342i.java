package com.taurusx.tax.p594e;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;
import com.taurusx.tax.log.LogUtil;
import com.taurusx.tax.mraid.MraidBrowser;
import p978t3.WebViewRenderException;

/* renamed from: com.taurusx.tax.e.i */
/* loaded from: classes7.dex */
public class C28342i extends WebViewClient {

    /* renamed from: a */
    public final /* synthetic */ MraidBrowser f73600a;

    public C28342i(MraidBrowser mraidBrowser) {
        this.f73600a = mraidBrowser;
    }

    @Override // android.webkit.WebViewClient
    public void onPageFinished(WebView webView, String str) {
        BitmapDrawable decodeImage;
        BitmapDrawable decodeImage2;
        super.onPageFinished(webView, str);
        if (webView.canGoBack()) {
            decodeImage = EnumC28333f.LEFT_ARROW.decodeImage(this.f73600a);
        } else {
            decodeImage = EnumC28333f.UNLEFT_ARROW.decodeImage(this.f73600a);
        }
        this.f73600a.f74067b.setImageDrawable(decodeImage);
        if (webView.canGoForward()) {
            decodeImage2 = EnumC28333f.RIGHT_ARROW.decodeImage(this.f73600a);
        } else {
            decodeImage2 = EnumC28333f.UNRIGHT_ARROW.decodeImage(this.f73600a);
        }
        this.f73600a.f74068c.setImageDrawable(decodeImage2);
    }

    @Override // android.webkit.WebViewClient
    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        super.onPageStarted(webView, str, bitmap);
        MraidBrowser mraidBrowser = this.f73600a;
        mraidBrowser.f74068c.setImageDrawable(EnumC28333f.UNRIGHT_ARROW.decodeImage(mraidBrowser));
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(WebView webView, int i, String str, String str2) {
        Toast.makeText((Activity) webView.getContext(), "MRAID error: " + str, 0).show();
    }

    @Override // android.webkit.WebViewClient
    public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        WebViewRenderException.m3275a(this);
        return true;
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        if (str == null) {
            return false;
        }
        String host = Uri.parse(str).getHost();
        if ((str.startsWith("http:") || str.startsWith("https:")) && !"play.google.com".equals(host) && !"market.android.com".equals(host)) {
            return false;
        }
        try {
            this.f73600a.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
        } catch (ActivityNotFoundException unused) {
            LogUtil.m37899w("MraidBrowser", "Unable to start activity for " + str + ". Ensure that your phone can handle this intent.");
        }
        this.f73600a.finish();
        return true;
    }
}
