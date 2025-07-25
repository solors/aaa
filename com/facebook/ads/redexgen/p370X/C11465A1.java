package com.facebook.ads.redexgen.p370X;

import com.facebook.ads.internal.exoplayer2.thirdparty.source.TrackGroupArray;

/* renamed from: com.facebook.ads.redexgen.X.A1 */
/* loaded from: assets/audience_network.dex */
public final class C11465A1 {
    public final int A00;
    public final long A01;
    public final long A02;
    public final AbstractC11486AM A03;
    public final C11746Et A04;
    public final TrackGroupArray A05;
    public final C11862Gp A06;
    public final Object A07;
    public final boolean A08;
    public volatile long A09;
    public volatile long A0A;

    public C11465A1(AbstractC11486AM abstractC11486AM, long j, TrackGroupArray trackGroupArray, C11862Gp c11862Gp) {
        this(abstractC11486AM, null, new C11746Et(0), j, -9223372036854775807L, 1, false, trackGroupArray, c11862Gp);
    }

    public C11465A1(AbstractC11486AM abstractC11486AM, Object obj, C11746Et c11746Et, long j, long j2, int i, boolean z, TrackGroupArray trackGroupArray, C11862Gp c11862Gp) {
        this.A03 = abstractC11486AM;
        this.A07 = obj;
        this.A04 = c11746Et;
        this.A02 = j;
        this.A01 = j2;
        this.A0A = j;
        this.A09 = j;
        this.A00 = i;
        this.A08 = z;
        this.A05 = trackGroupArray;
        this.A06 = c11862Gp;
    }

    public static void A00(C11465A1 c11465a1, C11465A1 c11465a12) {
        c11465a12.A0A = c11465a1.A0A;
        c11465a12.A09 = c11465a1.A09;
    }

    public final C11465A1 A01(int i) {
        C11465A1 c11465a1 = new C11465A1(this.A03, this.A07, this.A04.A00(i), this.A02, this.A01, this.A00, this.A08, this.A05, this.A06);
        A00(this, c11465a1);
        return c11465a1;
    }

    public final C11465A1 A02(int i) {
        C11465A1 playbackInfo = new C11465A1(this.A03, this.A07, this.A04, this.A02, this.A01, i, this.A08, this.A05, this.A06);
        A00(this, playbackInfo);
        return playbackInfo;
    }

    public final C11465A1 A03(AbstractC11486AM abstractC11486AM, Object obj) {
        C11465A1 playbackInfo = new C11465A1(abstractC11486AM, obj, this.A04, this.A02, this.A01, this.A00, this.A08, this.A05, this.A06);
        A00(this, playbackInfo);
        return playbackInfo;
    }

    public final C11465A1 A04(C11746Et c11746Et, long j, long j2) {
        long j3 = j2;
        AbstractC11486AM abstractC11486AM = this.A03;
        Object obj = this.A07;
        if (!c11746Et.A01()) {
            j3 = -9223372036854775807L;
        }
        return new C11465A1(abstractC11486AM, obj, c11746Et, j, j3, this.A00, this.A08, this.A05, this.A06);
    }

    public final C11465A1 A05(TrackGroupArray trackGroupArray, C11862Gp c11862Gp) {
        C11465A1 playbackInfo = new C11465A1(this.A03, this.A07, this.A04, this.A02, this.A01, this.A00, this.A08, trackGroupArray, c11862Gp);
        A00(this, playbackInfo);
        return playbackInfo;
    }

    public final C11465A1 A06(boolean z) {
        C11465A1 playbackInfo = new C11465A1(this.A03, this.A07, this.A04, this.A02, this.A01, this.A00, z, this.A05, this.A06);
        A00(this, playbackInfo);
        return playbackInfo;
    }
}
