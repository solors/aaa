package com.facebook.ads.redexgen.p370X;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.facebook.ads.redexgen.X.7i */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC113247i {
    public static String[] A00 = {"WfUJfZecOVcHzzrBpx92ELEjWhu2m", "ABQQ5taiOepRv8Mi5iWio7B3aVpn", "lqinWbZDhv0Ny2jUIa5P6Phm3DGMmF2T", "dPu2X3zgdKacWkfyqxYrIyrhes", "b2oe8Nr0EFLLItrmCHMxvIgMHIYOeqfq", "h", "yKBaB64vFuTn7zYoCnuYBPVEHVJ9GNEq", ""};
    public static final AtomicReference<C13028Zr> A01 = new AtomicReference<>();

    public static C13028Zr A00() {
        AtomicReference<C13028Zr> atomicReference = A01;
        if (A00[2].charAt(13) != '2') {
            throw new RuntimeException();
        }
        A00[3] = "t";
        return atomicReference.get();
    }

    public static void A01(C13028Zr c13028Zr) {
        if (c13028Zr == null) {
            return;
        }
        AbstractC113237h.A00(A01, null, c13028Zr);
    }
}
