package com.facebook.ads.redexgen.p370X;

/* renamed from: com.facebook.ads.redexgen.X.Yo */
/* loaded from: assets/audience_network.dex */
public final class C12963Yo implements InterfaceC11592C6 {
    public final long A00;
    public final C11591C5 A01;

    public C12963Yo(long j) {
        this(j, 0L);
    }

    public C12963Yo(long j, long j2) {
        this.A00 = j;
        this.A01 = new C11591C5(j2 == 0 ? C11593C7.A04 : new C11593C7(0L, j2));
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC11592C6
    public final long A7F() {
        return this.A00;
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC11592C6
    public final C11591C5 A8H(long j) {
        return this.A01;
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC11592C6
    public final boolean A9h() {
        return false;
    }
}
