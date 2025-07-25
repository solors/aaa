package com.zeus.gmc.sdk.mobileads.columbus.internal.cciccio;

import com.zeus.gmc.sdk.mobileads.columbus.p626ad.nativead.NativeAdError;

/* renamed from: com.zeus.gmc.sdk.mobileads.columbus.internal.cciccio.c2oc2i */
/* loaded from: classes8.dex */
public class C32528c2oc2i<T> {
    public static final int c2oc2o = 1;
    public static final int cco22 = 2;
    public static final int cioccoiococ = 0;
    public int c2oc2i;
    public final NativeAdError coi222o222;
    public final T coo2iico;

    private C32528c2oc2i(T t) {
        this.coo2iico = t;
        this.coi222o222 = null;
    }

    public boolean coo2iico() {
        return this.coo2iico != null && this.coi222o222 == null;
    }

    public static <T> C32528c2oc2i<T> coo2iico(T t) {
        return new C32528c2oc2i<>(t);
    }

    public static <T> C32528c2oc2i<T> coo2iico(T t, int i) {
        return new C32528c2oc2i<>(t, i);
    }

    private C32528c2oc2i(T t, int i) {
        this.coo2iico = t;
        this.coi222o222 = null;
        this.c2oc2i = i;
    }

    public static <T> C32528c2oc2i<T> coo2iico(NativeAdError nativeAdError) {
        return new C32528c2oc2i<>(nativeAdError);
    }

    private C32528c2oc2i(NativeAdError nativeAdError) {
        this.coo2iico = null;
        this.coi222o222 = nativeAdError;
    }
}
