package com.facebook.ads.redexgen.p370X;

import java.io.IOException;

/* renamed from: com.facebook.ads.redexgen.X.9h */
/* loaded from: assets/audience_network.dex */
public final class C114469h extends Exception {
    public final int A00;
    public final int A01;

    public C114469h(int i, String str, Throwable th, int i2) {
        super(str, th);
        this.A01 = i;
        this.A00 = i2;
    }

    public static C114469h A00(IOException iOException) {
        return new C114469h(0, null, iOException, -1);
    }

    public static C114469h A01(Exception exc, int i) {
        return new C114469h(1, null, exc, i);
    }

    public static C114469h A02(RuntimeException runtimeException) {
        return new C114469h(2, null, runtimeException, -1);
    }
}
