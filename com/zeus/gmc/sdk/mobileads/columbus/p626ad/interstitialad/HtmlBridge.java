package com.zeus.gmc.sdk.mobileads.columbus.p626ad.interstitialad;

import android.webkit.JavascriptInterface;
import com.zeus.gmc.sdk.mobileads.columbus.internal.c22o22co22i.InterfaceC32440coiic;
import java.lang.ref.WeakReference;

/* renamed from: com.zeus.gmc.sdk.mobileads.columbus.ad.interstitialad.HtmlBridge */
/* loaded from: classes8.dex */
public class HtmlBridge {
    public static final String HTML_BRIDGE_NAME = "HtmlBridge";
    private WeakReference<InterfaceC32440coiic> coo2iico;

    @JavascriptInterface
    public void adPosition(String str) {
        InterfaceC32440coiic interfaceC32440coiic;
        WeakReference<InterfaceC32440coiic> weakReference = this.coo2iico;
        if (weakReference != null && (interfaceC32440coiic = weakReference.get()) != null) {
            interfaceC32440coiic.onAdPosition(str);
        }
    }

    @JavascriptInterface
    public void closePosition(String str) {
        WeakReference<InterfaceC32440coiic> weakReference = this.coo2iico;
        if (weakReference != null && weakReference.get() != null) {
            this.coo2iico.get().onClosedPosition(str);
        }
    }

    public void setIClosedPositionListener(InterfaceC32440coiic interfaceC32440coiic) {
        this.coo2iico = new WeakReference<>(interfaceC32440coiic);
    }
}
