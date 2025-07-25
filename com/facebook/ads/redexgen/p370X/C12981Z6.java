package com.facebook.ads.redexgen.p370X;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Z6 */
/* loaded from: assets/audience_network.dex */
public final class C12981Z6 implements InterfaceC11506Ag {
    public static String[] A08 = {"DqzHGffDcmflJqigjgSPz5Ih3LuvN1vm", "GNv6Ae", "LelNVzb768HYU8MfXJtnH9MoMCR0fTwa", "KnBzaomJ4wFvZeITctRDF8tBR6fO5AM8", "2u9otpZXCk16Szcxzo3RgVsB8eWIqp2Q", "EbIk1BCgQ5uw3o5TzCMO1ZXZATNxIl6G", "RIc4tTFixsMvKq90zInLLBFrOnvIp26L", "v8gNFDmzDFQ65UlksIc5Du22tyA8sdnr"};
    public boolean A04;
    public boolean A05;
    public int[] A06;
    public int[] A07;
    public ByteBuffer A02 = InterfaceC11506Ag.A00;
    public ByteBuffer A03 = InterfaceC11506Ag.A00;
    public int A00 = -1;
    public int A01 = -1;

    public final void A00(int[] iArr) {
        this.A07 = iArr;
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC11506Ag
    public final boolean A4m(int i, int i2, int i3) throws C11505Af {
        boolean z = !Arrays.equals(this.A07, this.A06);
        this.A06 = this.A07;
        if (this.A06 == null) {
            this.A04 = false;
            return z;
        } else if (i3 == 2) {
            if (!z && this.A01 == i && this.A00 == i2) {
                return false;
            }
            this.A01 = i;
            this.A00 = i2;
            boolean outputChannelsChanged = i2 != this.A06.length;
            this.A04 = outputChannelsChanged;
            int i4 = 0;
            while (true) {
                int length = this.A06.length;
                String[] strArr = A08;
                if (strArr[0].charAt(13) != strArr[6].charAt(13)) {
                    throw new RuntimeException();
                }
                A08[1] = "576vmg";
                if (i4 >= length) {
                    return true;
                }
                int i5 = this.A06[i4];
                if (i5 < i2) {
                    boolean z2 = this.A04;
                    boolean outputChannelsChanged2 = i5 != i4;
                    this.A04 = z2 | outputChannelsChanged2;
                    i4++;
                } else {
                    throw new C11505Af(i, i2, i3);
                }
            }
        } else {
            throw new C11505Af(i, i2, i3);
        }
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC11506Ag
    public final ByteBuffer A7u() {
        ByteBuffer byteBuffer = this.A03;
        ByteBuffer outputBuffer = InterfaceC11506Ag.A00;
        this.A03 = outputBuffer;
        return byteBuffer;
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC11506Ag
    public final int A7v() {
        if (this.A06 == null) {
            return this.A00;
        }
        int[] iArr = this.A06;
        if (A08[4].charAt(2) != '9') {
            throw new RuntimeException();
        }
        String[] strArr = A08;
        strArr[7] = "4sakcIsy6w2uz0nPxriWxgex69qzPMi1";
        strArr[3] = "A1JfXRpmh7pGoJx4KgQXcs2DSpbOe785";
        return iArr.length;
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC11506Ag
    public final int A7w() {
        return 2;
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC11506Ag
    public final int A7x() {
        return this.A01;
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC11506Ag
    public final boolean A9L() {
        return this.A04;
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC11506Ag
    public final boolean A9Q() {
        return this.A05 && this.A03 == InterfaceC11506Ag.A00;
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC11506Ag
    public final void AEh() {
        this.A05 = true;
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC11506Ag
    public final void AEi(ByteBuffer byteBuffer) {
        int[] iArr;
        AbstractC11914Hf.A04(this.A06 != null);
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int position2 = this.A00;
        int i = (limit - position) / (position2 * 2);
        int position3 = this.A06.length;
        int i2 = position3 * i * 2;
        int position4 = this.A02.capacity();
        if (position4 < i2) {
            this.A02 = ByteBuffer.allocateDirect(i2).order(ByteOrder.nativeOrder());
        } else {
            this.A02.clear();
        }
        while (position < limit) {
            for (int position5 : this.A06) {
                this.A02.putShort(byteBuffer.getShort((position5 * 2) + position));
            }
            int position6 = this.A00;
            position += position6 * 2;
        }
        byteBuffer.position(limit);
        this.A02.flip();
        this.A03 = this.A02;
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC11506Ag
    public final void flush() {
        this.A03 = InterfaceC11506Ag.A00;
        this.A05 = false;
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC11506Ag
    public final void reset() {
        flush();
        this.A02 = InterfaceC11506Ag.A00;
        this.A00 = -1;
        this.A01 = -1;
        this.A06 = null;
        this.A07 = null;
        this.A04 = false;
    }
}
