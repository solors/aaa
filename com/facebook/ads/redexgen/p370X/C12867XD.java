package com.facebook.ads.redexgen.p370X;

import com.facebook.ads.internal.exoplayer2.thirdparty.source.TrackGroup;

/* renamed from: com.facebook.ads.redexgen.X.XD */
/* loaded from: assets/audience_network.dex */
public final class C12867XD implements InterfaceC11857Gk {
    public final float A00;
    public final float A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final long A05;
    public final InterfaceC11867Gu A06;
    public final InterfaceC11917Hi A07;

    public C12867XD(InterfaceC11867Gu interfaceC11867Gu) {
        this(interfaceC11867Gu, 10000, 25000, 25000, 0.75f, 0.75f, 2000L, InterfaceC11917Hi.A00);
    }

    public C12867XD(InterfaceC11867Gu interfaceC11867Gu, int i, int i2, int i3, float f, float f2, long j, InterfaceC11917Hi interfaceC11917Hi) {
        this.A06 = interfaceC11867Gu;
        this.A03 = i;
        this.A02 = i2;
        this.A04 = i3;
        this.A00 = f;
        this.A01 = f2;
        this.A05 = j;
        this.A07 = interfaceC11917Hi;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.p370X.InterfaceC11857Gk
    /* renamed from: A00 */
    public final C11650D2 A5A(TrackGroup trackGroup, int... iArr) {
        return new C11650D2(trackGroup, iArr, this.A06, this.A03, this.A02, this.A04, this.A00, this.A01, this.A05, this.A07);
    }
}
