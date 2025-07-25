package com.facebook.ads.redexgen.p370X;

import com.facebook.ads.internal.exoplayer2.thirdparty.Format;
import com.facebook.ads.internal.exoplayer2.thirdparty.drm.DrmInitData;

/* renamed from: com.facebook.ads.redexgen.X.Ca */
/* loaded from: assets/audience_network.dex */
public final class C11622Ca {
    public static String[] A0A = {"tKMEQyvluzQ1Nn3ykuVdzNZ8vb4kdT8m", "GeKfs2sJ6nbbQhem6v82VjejoG5jBsB7", "AfmYZYeI1Y00emk9wBvDzFPL2v9SQ7vS", "qVzzKcDVUoFZFts2UpxZp90t7lN0aiYH", "rWkFrnOBw96ebPrEG0IMfbHNXRTUH8t0", "U5tUtJMHZjXCJdFBhHSSQmrZPEv5F3Ni", "CMETZJr0lHowFtN3K41q19SzNF1CjRpv", "lrsJQP2RFV9f4UsQyKTnoj893IObLugA"};
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public C11616CU A04;
    public C11631Cj A05;
    public final InterfaceC11595C9 A06;
    public final C11633Cl A07 = new C11633Cl();
    public final C11939I4 A09 = new C11939I4(1);
    public final C11939I4 A08 = new C11939I4();

    public C11622Ca(InterfaceC11595C9 interfaceC11595C9) {
        this.A06 = interfaceC11595C9;
    }

    private C11632Ck A00() {
        int i = this.A07.A07.A02;
        if (this.A07.A08 != null) {
            return this.A07.A08;
        }
        return this.A05.A00(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A01() {
        if (!this.A07.A0A) {
            return;
        }
        C11939I4 c11939i4 = this.A07.A09;
        C11632Ck encryptionBox = A00();
        if (encryptionBox.A00 != 0) {
            c11939i4.A0Z(encryptionBox.A00);
        }
        if (this.A07.A0H[this.A01]) {
            int A0I = c11939i4.A0I() * 6;
            if (A0A[6].charAt(17) == 'S') {
                throw new RuntimeException();
            }
            A0A[0] = "Dkat9NH7bKSE7Rzb8B6OLbAVLJtjjf4Q";
            c11939i4.A0Z(A0I);
        }
    }

    public final int A03() {
        C11939I4 c11939i4;
        int vectorSize;
        if (this.A07.A0A) {
            C11632Ck A00 = A00();
            if (A00.A00 != 0) {
                c11939i4 = this.A07.A09;
                vectorSize = A00.A00;
            } else {
                byte[] initVectorData = A00.A04;
                this.A08.A0b(initVectorData, initVectorData.length);
                c11939i4 = this.A08;
                vectorSize = initVectorData.length;
            }
            boolean z = this.A07.A0H[this.A01];
            this.A09.A00[0] = (byte) ((z ? 128 : 0) | vectorSize);
            this.A09.A0Y(0);
            InterfaceC11595C9 interfaceC11595C9 = this.A06;
            C11939I4 initializationVectorData = this.A09;
            interfaceC11595C9.AFv(initializationVectorData, 1);
            this.A06.AFv(c11939i4, vectorSize);
            if (!z) {
                return vectorSize + 1;
            }
            C11939I4 c11939i42 = this.A07.A09;
            int A0I = c11939i42.A0I();
            c11939i42.A0Z(-2);
            int i = (A0I * 6) + 2;
            this.A06.AFv(c11939i42, i);
            return vectorSize + 1 + i;
        }
        return 0;
    }

    public final void A04() {
        this.A07.A01();
        this.A01 = 0;
        this.A02 = 0;
        this.A00 = 0;
        this.A03 = 0;
    }

    public final void A05(long j) {
        long A01 = AbstractC114409b.A01(j);
        for (int i = this.A01; i < this.A07.A00 && this.A07.A00(i) < A01; i++) {
            if (this.A07.A0I[i]) {
                this.A03 = i;
            }
        }
    }

    public final void A06(DrmInitData drmInitData) {
        C11632Ck encryptionBox = this.A05.A00(this.A07.A07.A02);
        String str = encryptionBox != null ? encryptionBox.A02 : null;
        InterfaceC11595C9 interfaceC11595C9 = this.A06;
        Format format = this.A05.A07;
        String[] strArr = A0A;
        String schemeType = strArr[5];
        if (schemeType.charAt(25) == strArr[2].charAt(25)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0A;
        strArr2[1] = "9VKvmNGI1pKEwb6BSF19djXm8kYtnzgK";
        strArr2[7] = "KanRAdK5lExnEnkfSh4wHj8L33fZCYqk";
        interfaceC11595C9.A69(format.A0I(drmInitData.A02(str)));
    }

    public final void A07(C11631Cj c11631Cj, C11616CU c11616cu) {
        this.A05 = (C11631Cj) AbstractC11914Hf.A01(c11631Cj);
        this.A04 = (C11616CU) AbstractC11914Hf.A01(c11616cu);
        this.A06.A69(c11631Cj.A07);
        A04();
    }

    public final boolean A08() {
        this.A01++;
        this.A00++;
        if (this.A00 == this.A07.A0E[this.A02]) {
            this.A02++;
            this.A00 = 0;
            return false;
        }
        return true;
    }
}
