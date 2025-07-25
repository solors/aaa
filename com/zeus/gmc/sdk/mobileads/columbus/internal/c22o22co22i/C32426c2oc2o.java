package com.zeus.gmc.sdk.mobileads.columbus.internal.c22o22co22i;

import android.content.Context;
import android.os.Handler;
import android.webkit.WebViewClient;
import com.zeus.gmc.sdk.mobileads.columbus.p626ad.interstitialad.HtmlBridge;
import com.zeus.gmc.sdk.mobileads.columbus.p626ad.interstitialad.InterstitialAdError;

/* renamed from: com.zeus.gmc.sdk.mobileads.columbus.internal.c22o22co22i.c2oc2o */
/* loaded from: classes8.dex */
public class C32426c2oc2o extends C32438coi222o222 {
    private Handler c2oc2o;
    private HtmlBridge cco22;

    /* renamed from: com.zeus.gmc.sdk.mobileads.columbus.internal.c22o22co22i.c2oc2o$coo2iico */
    /* loaded from: classes8.dex */
    static class C32427coo2iico implements InterfaceC32436ciii2coi2 {
        private final InterfaceC32437cioccoiococ coo2iico;

        public C32427coo2iico(InterfaceC32437cioccoiococ interfaceC32437cioccoiococ) {
            this.coo2iico = interfaceC32437cioccoiococ;
        }

        @Override // com.zeus.gmc.sdk.mobileads.columbus.internal.c22o22co22i.InterfaceC32436ciii2coi2
        public void coo2iico(C32438coi222o222 c32438coi222o222) {
            this.coo2iico.onAdLoaded();
        }

        @Override // com.zeus.gmc.sdk.mobileads.columbus.internal.c22o22co22i.InterfaceC32436ciii2coi2
        public void onBackToInterstitial() {
            this.coo2iico.onBackToInterstitial();
        }

        @Override // com.zeus.gmc.sdk.mobileads.columbus.internal.c22o22co22i.InterfaceC32436ciii2coi2
        public void onLeftInterstitial() {
            this.coo2iico.onLeftInterstitial();
        }

        @Override // com.zeus.gmc.sdk.mobileads.columbus.internal.c22o22co22i.InterfaceC32436ciii2coi2
        public void coo2iico(InterstitialAdError interstitialAdError) {
            this.coo2iico.onAdError(interstitialAdError);
        }

        @Override // com.zeus.gmc.sdk.mobileads.columbus.internal.c22o22co22i.InterfaceC32436ciii2coi2
        public void coo2iico(String str) {
            this.coo2iico.onAdClicked(str);
        }

        @Override // com.zeus.gmc.sdk.mobileads.columbus.internal.c22o22co22i.InterfaceC32436ciii2coi2
        public void coo2iico() {
            this.coo2iico.onAdClicked();
        }
    }

    public C32426c2oc2o(Context context) {
        super(context);
        this.c2oc2o = new Handler();
    }

    public void coo2iico(InterfaceC32437cioccoiococ interfaceC32437cioccoiococ) {
        super.cioccoiococ();
        WebViewClient c32435cii2c2 = new C32435cii2c2(new C32427coo2iico(interfaceC32437cioccoiococ), this);
        HtmlBridge htmlBridge = new HtmlBridge();
        this.cco22 = htmlBridge;
        addJavascriptInterface(htmlBridge, HtmlBridge.HTML_BRIDGE_NAME);
        setWebViewClient(c32435cii2c2);
    }

    public void setIClosedPositionListener(InterfaceC32440coiic interfaceC32440coiic) {
        HtmlBridge htmlBridge = this.cco22;
        if (htmlBridge != null) {
            htmlBridge.setIClosedPositionListener(interfaceC32440coiic);
        }
    }

    private void coo2iico(Runnable runnable) {
        this.c2oc2o.post(runnable);
    }
}
