package com.facebook.ads.redexgen.p370X;

import java.util.concurrent.Callable;
import javax.annotation.Nullable;

/* renamed from: com.facebook.ads.redexgen.X.MD */
/* loaded from: assets/audience_network.dex */
public class CallableC12187MD implements Callable<Void> {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final int[] A06;

    public CallableC12187MD(int[] iArr, int i, int i2, int i3, int i4, int i5, int i6) {
        this.A06 = iArr;
        this.A05 = i;
        this.A01 = i2;
        this.A02 = i3;
        this.A04 = i4;
        this.A00 = i5;
        this.A03 = i6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // java.util.concurrent.Callable
    @Nullable
    /* renamed from: A00 */
    public final Void call() throws Exception {
        C12771Vf.A00(this.A06, this.A05, this.A01, this.A02, this.A04, this.A00, this.A03);
        return null;
    }
}
