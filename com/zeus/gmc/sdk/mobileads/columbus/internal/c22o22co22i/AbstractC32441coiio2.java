package com.zeus.gmc.sdk.mobileads.columbus.internal.c22o22co22i;

import android.content.Context;
import com.zeus.gmc.sdk.mobileads.columbus.p626ad.enity.InterstitialAdInfo;
import com.zeus.gmc.sdk.mobileads.columbus.p626ad.nativead.NativeAd;

/* renamed from: com.zeus.gmc.sdk.mobileads.columbus.internal.c22o22co22i.coiio2 */
/* loaded from: classes8.dex */
public abstract class AbstractC32441coiio2 {
    private static final String cioccoiococ = "ResponseInterstitial";
    protected long c2oc2i;
    protected Context coi222o222;
    private C32425c2oc2i coo2iico;

    public abstract void c2oc2i();

    public void coi222o222() {
        C32425c2oc2i c32425c2oc2i = this.coo2iico;
        if (c32425c2oc2i != null) {
            c32425c2oc2i.coo2iico(c32425c2oc2i);
            this.coo2iico = null;
        }
    }

    protected abstract void coo2iico(InterstitialAdInfo interstitialAdInfo);

    protected abstract void coo2iico(InterfaceC32437cioccoiococ interfaceC32437cioccoiococ);

    public void coo2iico(String str) {
    }

    public boolean coo2iico() {
        return false;
    }

    public void coo2iico(Context context, InterfaceC32437cioccoiococ interfaceC32437cioccoiococ, InterstitialAdInfo interstitialAdInfo, Long l) {
        this.coi222o222 = context.getApplicationContext();
        coo2iico(interstitialAdInfo);
        this.c2oc2i = l.longValue();
        C32425c2oc2i c32425c2oc2i = new C32425c2oc2i(interfaceC32437cioccoiococ, this.c2oc2i);
        this.coo2iico = c32425c2oc2i;
        c32425c2oc2i.coo2iico(c32425c2oc2i, this.coi222o222);
        coo2iico(interfaceC32437cioccoiococ);
    }

    public void coo2iico(Context context, InterfaceC32437cioccoiococ interfaceC32437cioccoiococ, NativeAd nativeAd, Long l) {
        this.coi222o222 = context.getApplicationContext();
        this.c2oc2i = l.longValue();
        C32425c2oc2i c32425c2oc2i = new C32425c2oc2i(interfaceC32437cioccoiococ, this.c2oc2i);
        this.coo2iico = c32425c2oc2i;
        c32425c2oc2i.coo2iico(c32425c2oc2i, this.coi222o222);
        coo2iico(interfaceC32437cioccoiococ);
    }
}
