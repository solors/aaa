package com.facebook.ads.redexgen.p370X;

/* renamed from: com.facebook.ads.redexgen.X.X0 */
/* loaded from: assets/audience_network.dex */
public final class C12854X0 implements InterfaceC11871Gy {
    public final InterfaceC11894HL<? super C12855X1> A00;

    public C12854X0() {
        this(null);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.HL != com.facebook.ads.internal.exoplayer2.thirdparty.upstream.TransferListener<? super com.facebook.ads.internal.exoplayer2.thirdparty.upstream.FileDataSource> */
    public C12854X0(InterfaceC11894HL<? super C12855X1> interfaceC11894HL) {
        this.A00 = interfaceC11894HL;
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC11871Gy
    public final InterfaceC11872Gz A4t() {
        return new C12855X1(this.A00);
    }
}
