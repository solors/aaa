package com.taurusx.tax.utils.webview;

import android.app.Activity;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.ViewGroup;
import android.webkit.CookieSyncManager;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.google.common.primitives.SignedBytes;
import com.taurusx.tax.C28162a;
import com.taurusx.tax.log.LogUtil;
import com.taurusx.tax.p606j.C28485b;
import com.taurusx.tax.p606j.p614c0.C28513a;
import com.taurusx.tax.p606j.p614c0.C28514b;
import p692h2.StringFogImpl;

/* loaded from: classes7.dex */
public class TaxBrowserActivity extends Activity {

    /* renamed from: c */
    public static final String f74287c;

    /* renamed from: d */
    public static final String f74288d;

    /* renamed from: a */
    public WebView f74289a;

    /* renamed from: b */
    public C28485b f74290b;

    static {
        StringFogImpl stringFogImpl = C28162a.f73047a;
        f74287c = stringFogImpl.m23824a(new byte[]{-60, -92, -35}, new byte[]{-111, -10});
        f74288d = stringFogImpl.m23824a(new byte[]{84, -86, 88, -26, 67, -71, 69, -86, 84, -94, 86, -82, 13, -94, 68}, new byte[]{32, -53});
    }

    @Override // android.app.Activity
    public void finish() {
        ((ViewGroup) getWindow().getDecorView()).removeAllViews();
        super.finish();
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setResult(-1);
        getWindow().requestFeature(2);
        getWindow().setFeatureInt(2, -1);
        this.f74290b = new C28485b(new C28485b.C28489d());
        WebSettings settings = this.f74289a.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setSavePassword(false);
        settings.setSupportZoom(true);
        settings.setBuiltInZoomControls(true);
        settings.setUseWideViewPort(true);
        settings.setAllowFileAccessFromFileURLs(false);
        settings.setAllowFileAccess(false);
        settings.setSavePassword(false);
        getIntent().getStringExtra(f74288d);
        WebView webView = this.f74289a;
        StringFogImpl stringFogImpl = C28162a.f73047a;
        webView.removeJavascriptInterface(stringFogImpl.m23824a(new byte[]{-68, 50, -82, 37, -84, 63, -115, 56, -73, 29, -82, 33, -82, 21, -67, 62, -85, 48, -86, 8}, new byte[]{-49, 87}));
        this.f74289a.removeJavascriptInterface(stringFogImpl.m23824a(new byte[]{77, -102, 79, -100, 95, -118, 69, -101, 69, -107, 69, -115, 85}, new byte[]{44, -7}));
        this.f74289a.removeJavascriptInterface(stringFogImpl.m23824a(new byte[]{78, -98, 76, -104, 92, -114, 70, -97, 70, -111, 70, -119, 86, -87, 93, -100, 89, -104, 93, -114, 78, -111}, new byte[]{47, -3}));
        this.f74289a.loadUrl(getIntent().getStringExtra(f74287c));
        this.f74289a.setWebViewClient(new C28514b(this));
        this.f74289a.setWebChromeClient(new C28513a(this));
        throw null;
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.f74289a.destroy();
        this.f74289a = null;
    }

    @Override // android.app.Activity
    public void onPause() {
        long elapsedRealtime;
        super.onPause();
        CookieSyncManager.getInstance().stopSync();
        WebView webView = this.f74289a;
        if (isFinishing()) {
            webView.stopLoading();
            webView.loadUrl("");
        }
        webView.onPause();
        C28485b c28485b = this.f74290b;
        synchronized (c28485b) {
            C28485b.EnumC28488c enumC28488c = c28485b.f73915a;
            C28485b.EnumC28488c enumC28488c2 = C28485b.EnumC28488c.PAUSED;
            if (enumC28488c == enumC28488c2) {
                StringFogImpl stringFogImpl = C28162a.f73047a;
                LogUtil.m37905d(stringFogImpl.m23824a(new byte[]{-100, -98, -99, -115, -99, -116, -112}, new byte[]{-24, -1}), stringFogImpl.m23824a(new byte[]{97, 25, 80, 20, 73, 19, 113, 31, 72, 19, 113, 4, 68, 21, 78, 19, 87, 86, 68, 26, 87, 19, 68, 18, 92, 86, 85, 23, 80, 5, SignedBytes.MAX_POWER_OF_TWO, 18, 11}, new byte[]{37, 118}));
            } else {
                long j = c28485b.f73917c;
                synchronized (c28485b) {
                    if (c28485b.f73915a == enumC28488c2) {
                        elapsedRealtime = 0;
                    } else {
                        ((C28485b.C28489d) c28485b.f73918d).getClass();
                        elapsedRealtime = SystemClock.elapsedRealtime() - c28485b.f73916b;
                    }
                    c28485b.f73917c = j + elapsedRealtime;
                    c28485b.f73916b = 0L;
                    c28485b.f73915a = enumC28488c2;
                }
            }
        }
    }

    @Override // android.app.Activity
    public void onResume() {
        super.onResume();
        CookieSyncManager.getInstance().startSync();
        this.f74289a.onResume();
        C28485b c28485b = this.f74290b;
        synchronized (c28485b) {
            C28485b.EnumC28488c enumC28488c = c28485b.f73915a;
            C28485b.EnumC28488c enumC28488c2 = C28485b.EnumC28488c.STARTED;
            if (enumC28488c == enumC28488c2) {
                StringFogImpl stringFogImpl = C28162a.f73047a;
                LogUtil.m37905d(stringFogImpl.m23824a(new byte[]{SignedBytes.MAX_POWER_OF_TWO, -79, 65, -94, 65, -93, 76}, new byte[]{52, -48}), stringFogImpl.m23824a(new byte[]{68, 118, 117, 123, 108, 124, 84, 112, 109, 124, 84, 107, 97, 122, 107, 124, 114, 57, 97, 117, 114, 124, 97, 125, 121, 57, 115, 109, 97, 107, 116, 124, 100, 55}, new byte[]{0, 25}));
            } else {
                c28485b.f73915a = enumC28488c2;
                ((C28485b.C28489d) c28485b.f73918d).getClass();
                c28485b.f73916b = SystemClock.elapsedRealtime();
            }
        }
    }
}
