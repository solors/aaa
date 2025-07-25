package com.facebook.ads.redexgen.p370X;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.webkit.JavascriptInterface;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.facebook.ads.redexgen.X.O0 */
/* loaded from: assets/audience_network.dex */
public class C12298O0 {
    public static String[] A07 = {"MaUhfef1XHChQSOAsPU", "01oMUC4JT554rhL", "9TYVZPZrh7WqyaB", "ShOi1FYvFM9bF84GqYiu0GZZ4HOF35Af", "s", "YvdeaQsxQHJ3CZVDgFIjqRdATcpqYXuO", "b384kAccrLIUxrnk6NdGu", "f4PnsWwvvRSNWXAtteJ0H"};
    public final String A00 = C12298O0.class.getSimpleName();
    public final WeakReference<AtomicBoolean> A01;
    public final WeakReference<AtomicBoolean> A02;
    public final WeakReference<InterfaceC108920S> A03;
    public final WeakReference<InterfaceC12299O1> A04;
    public final WeakReference<C12530Rk> A05;
    public final WeakReference<C12720Up> A06;

    public C12298O0(C12720Up c12720Up, InterfaceC12299O1 interfaceC12299O1, C12530Rk c12530Rk, AtomicBoolean atomicBoolean, AtomicBoolean atomicBoolean2, C13029Zs c13029Zs) {
        this.A06 = new WeakReference<>(c12720Up);
        this.A04 = new WeakReference<>(interfaceC12299O1);
        this.A05 = new WeakReference<>(c12530Rk);
        this.A01 = new WeakReference<>(atomicBoolean);
        this.A02 = new WeakReference<>(atomicBoolean2);
        this.A03 = new WeakReference<>(c13029Zs.A0E());
    }

    private InterfaceC108920S A00() {
        InterfaceC108920S funnel = this.A03.get();
        if (funnel == null) {
            return new C13208co();
        }
        return funnel;
    }

    @JavascriptInterface
    public void alert(String str) {
        Log.e(this.A00, str);
    }

    @JavascriptInterface
    public String getAnalogInfo() {
        return AbstractC12143LV.A01(C113658N.A02());
    }

    @JavascriptInterface
    public void logFunnel(int i, String str) {
        A00().AHS(i, str);
    }

    @JavascriptInterface
    public void onMainAssetLoaded() {
        A00().AHT();
        if (this.A06.get() != null && this.A01.get() != null && this.A02.get() != null && this.A02.get().get()) {
            this.A01.get().set(true);
            A00().AHU();
            if (this.A06.get().isShown()) {
                A00().AHV();
                new Handler(Looper.getMainLooper()).post(new C12722Ur(this.A05));
            }
            InterfaceC12299O1 interfaceC12299O1 = this.A04.get();
            if (interfaceC12299O1 != null) {
                new Handler(Looper.getMainLooper()).post(new RunnableC12297Nz(this, interfaceC12299O1));
            }
        }
    }

    @JavascriptInterface
    public void onPageInitialized() {
        C12720Up webView = this.A06.get();
        if (webView == null || webView.A06()) {
            A00().AHW(true);
            return;
        }
        InterfaceC12299O1 interfaceC12299O1 = this.A04.get();
        if (interfaceC12299O1 == null) {
            A00().AHW(true);
            return;
        }
        InterfaceC108920S A00 = A00();
        String[] strArr = A07;
        if (strArr[3].charAt(2) == strArr[5].charAt(2)) {
            throw new RuntimeException();
        }
        A07[6] = "MExJxptNjWm815DyzsGP1";
        A00.AHW(false);
        interfaceC12299O1.ACx();
    }
}
