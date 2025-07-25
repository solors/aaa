package com.facebook.ads.redexgen.p370X;

import com.facebook.ads.internal.exoplayer2.thirdparty.Format;
import com.google.common.primitives.SignedBytes;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Yg */
/* loaded from: assets/audience_network.dex */
public final class C12955Yg extends AbstractC11597CB {
    public static byte[] A05;
    public static String[] A06 = {"lGyDkwtSGWnyBDNx8VCH6YS5wU7hPdWQ", "PgowCxsSC8EJKJT6apDR", "LPWWnTonb9RlyYc30tl", "RtHeIiqAKzH58z", "0jwO409h5d63SGevyEOv", "LIh4yarHvfESg0ILrv8Z9A7hNJPgMM", "W4YWO", "dzZdewsfodUdBsfR1Ihh4NImnUsz5jl1"};
    public int A00;
    public int A01;
    public boolean A02;
    public final C11939I4 A03;
    public final C11939I4 A04;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A05, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 84);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        String[] strArr = A06;
        if (strArr[0].charAt(5) != strArr[7].charAt(5)) {
            throw new RuntimeException();
        }
        A06[5] = "sxdlVolwhrQkkfqceIwrm1GozpbCc1";
        A05 = new byte[]{-34, -15, -20, -19, -9, -88, -18, -9, -6, -11, -23, -4, -88, -10, -9, -4, -88, -5, -3, -8, -8, -9, -6, -4, -19, -20, -62, -88, 71, 58, 53, 54, SignedBytes.MAX_POWER_OF_TWO, 0, 50, 71, 52};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    @Override // com.facebook.ads.redexgen.p370X.AbstractC11597CB
    public final void A0B(C11939I4 c11939i4, long j) throws C11464A0 {
        int A0E = c11939i4.A0E();
        long A09 = j + (c11939i4.A09() * 1000);
        if (A0E == 0 && !this.A02) {
            C11939I4 c11939i42 = new C11939I4(new byte[c11939i4.A04()]);
            c11939i4.A0c(c11939i42.A00, 0, c11939i4.A04());
            C11955IM A00 = C11955IM.A00(c11939i42);
            this.A01 = A00.A02;
            super.A00.A69(Format.A03(null, A00(28, 9, 125), null, -1, -1, A00.A03, A00.A01, -1.0f, A00.A04, -1, A00.A00, null));
            this.A02 = true;
        } else if (A0E == 1 && this.A02) {
            byte[] bArr = this.A03.A00;
            bArr[0] = 0;
            bArr[1] = 0;
            bArr[2] = 0;
            int i = 4 - this.A01;
            int i2 = 0;
            while (c11939i4.A04() > 0) {
                c11939i4.A0c(this.A03.A00, i, this.A01);
                this.A03.A0Y(0);
                int A0H = this.A03.A0H();
                this.A04.A0Y(0);
                super.A00.AFv(this.A04, 4);
                super.A00.AFv(c11939i4, A0H);
                i2 = i2 + 4 + A0H;
            }
            super.A00.AFw(A09, this.A00 == 1 ? 1 : 0, i2, 0, null);
        }
    }

    static {
        A01();
    }

    public C12955Yg(InterfaceC11595C9 interfaceC11595C9) {
        super(interfaceC11595C9);
        this.A04 = new C11939I4(AbstractC11935I0.A03);
        this.A03 = new C11939I4(4);
    }

    @Override // com.facebook.ads.redexgen.p370X.AbstractC11597CB
    public final boolean A0C(C11939I4 c11939i4) throws C12956Yh {
        int A0E = c11939i4.A0E();
        int header = A0E >> 4;
        int frameType = header & 15;
        int i = A0E & 15;
        if (i == 7) {
            this.A00 = frameType;
            return frameType != 5;
        }
        throw new C12956Yh(A00(0, 28, 52) + i);
    }
}
