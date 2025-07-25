package com.zeus.gmc.sdk.mobileads.columbus.p626ad.nativead;

import com.zeus.gmc.sdk.mobileads.columbus.p626ad.enity.NativeAdInfo;

/* renamed from: com.zeus.gmc.sdk.mobileads.columbus.ad.nativead.c2oc2i */
/* loaded from: classes8.dex */
public class C32215c2oc2i {
    private C32215c2oc2i() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static boolean coo2iico(NativeAdInfo nativeAdInfo) {
        String ciio2c = nativeAdInfo.ciio2c();
        if (ciio2c != null && ciio2c.startsWith("<VAST")) {
            return true;
        }
        return false;
    }
}
