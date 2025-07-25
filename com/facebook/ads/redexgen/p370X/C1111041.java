package com.facebook.ads.redexgen.p370X;

/* renamed from: com.facebook.ads.redexgen.X.41 */
/* loaded from: assets/audience_network.dex */
public final class C1111041 extends AbstractC11624Cc {
    public final int A00;
    public final int A01;
    public final InterfaceC11894HL<? super InterfaceC11872Gz> A02;
    public final String A03;
    public final boolean A04;

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.HL != com.facebook.ads.internal.exoplayer2.thirdparty.upstream.TransferListener<? super com.facebook.ads.internal.exoplayer2.thirdparty.upstream.DataSource> */
    public C1111041(String str, InterfaceC11894HL<? super InterfaceC11872Gz> interfaceC11894HL) {
        this(str, interfaceC11894HL, 8000, 8000, false);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.HL != com.facebook.ads.internal.exoplayer2.thirdparty.upstream.TransferListener<? super com.facebook.ads.internal.exoplayer2.thirdparty.upstream.DataSource> */
    public C1111041(String str, InterfaceC11894HL<? super InterfaceC11872Gz> interfaceC11894HL, int i, int i2, boolean z) {
        this.A03 = str;
        this.A02 = interfaceC11894HL;
        this.A00 = i;
        this.A01 = i2;
        this.A04 = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.p370X.AbstractC11624Cc
    /* renamed from: A00 */
    public final C11626Ce A01(C11883HA c11883ha) {
        return new C11626Ce(this.A03, null, this.A02, this.A00, this.A01, this.A04, c11883ha);
    }
}
