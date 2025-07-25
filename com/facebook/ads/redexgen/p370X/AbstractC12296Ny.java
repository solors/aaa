package com.facebook.ads.redexgen.p370X;

import android.app.Activity;
import android.os.Build;
import android.util.Log;
import android.webkit.CookieManager;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Ny */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC12296Ny extends WebView {
    public static byte[] A01;
    public static final String A02;
    public boolean A00;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 96);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{-31, -4, 4, 7, 0, -1, -69, 15, 10, -69, 4, 9, 4, 15, 4, -4, 7, 4, 21, 0, -69, -34, 10, 10, 6, 4, 0, -24, -4, 9, -4, 2, 0, 13, -55, -70, -71, -125, -58, -43, -60, -42, -53, -56, -57, 63, 54, 75, 54, 72, 56, 71, 62, 69, 73, 15, -4, -22, -25, -28, -5, -18, -22, -4};
    }

    public abstract WebChromeClient A0D();

    public abstract WebViewClient A0E();

    static {
        A01();
        A02 = AbstractC12296Ny.class.getSimpleName();
    }

    public AbstractC12296Ny(Activity activity, C13029Zs c13029Zs) {
        super(activity);
        A03(c13029Zs);
    }

    public AbstractC12296Ny(C13029Zs c13029Zs) {
        super(c13029Zs);
        A03(c13029Zs);
    }

    public static void A02(int i) {
        C13028Zr context = AbstractC113247i.A00();
        if (context != null) {
            context.A07().AA0(A00(56, 8, 37), i, new C113578F(A00(35, 10, 3)));
        }
    }

    private void A03(C113257j c113257j) {
        setWebChromeClient(A0D());
        setWebViewClient(A0E());
        AbstractC12302O4.A04(this);
        getSettings().setJavaScriptEnabled(true);
        getSettings().setDomStorageEnabled(true);
        if (Build.VERSION.SDK_INT >= 17) {
            getSettings().setMediaPlaybackRequiresUserGesture(false);
        }
        if (c113257j.A04().A9O() && Build.VERSION.SDK_INT >= 19) {
            setWebContentsDebuggingEnabled(true);
        }
        setHorizontalScrollBarEnabled(false);
        setHorizontalScrollbarOverlay(false);
        setVerticalScrollBarEnabled(false);
        setVerticalScrollbarOverlay(false);
        if (Build.VERSION.SDK_INT >= 21) {
            try {
                CookieManager.getInstance().setAcceptThirdPartyCookies(this, true);
            } catch (Exception unused) {
                Log.w(A02, A00(0, 35, 59));
            }
        }
    }

    private void A04(String str) {
        loadUrl(A00(45, 11, 117) + str);
    }

    public final void A05(String str) {
        try {
            if (Build.VERSION.SDK_INT >= 19) {
                evaluateJavascript(str, null);
            } else {
                A04(str);
            }
        } catch (IllegalStateException unused) {
            A04(str);
        }
    }

    public final boolean A06() {
        return this.A00;
    }

    @Override // android.webkit.WebView
    public void destroy() {
        this.A00 = true;
        super.destroy();
    }
}
