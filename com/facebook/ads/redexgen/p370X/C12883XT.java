package com.facebook.ads.redexgen.p370X;

import com.facebook.ads.internal.exoplayer2.thirdparty.Format;
import com.google.common.primitives.UnsignedBytes;
import java.io.EOFException;
import java.io.IOException;
import java.nio.ByteBuffer;

/* renamed from: com.facebook.ads.redexgen.X.XT */
/* loaded from: assets/audience_network.dex */
public final class C12883XT implements InterfaceC11595C9 {
    public static String[] A0F = {"3qzXOmg4s2331UA7hG", "9bk", "VVdoXs4tz6DPKYHGOZRt6RiMCyELY1A5", "g7JlN9bgbBs41PAJ4JuNA0qeFJ1c1UUN", "LKvHqs3IZORZ6jeOQe1pAUwl2aVi1yge", "34f97P4Qb7PfWYgeR24LPv7AajWY1fA6", "GiS2v9udXUeFFnoeEASPbMACNgmzJ", "g0nN8wixzNmLcgKoJI"};
    public long A00;
    public long A01;
    public Format A02;
    public Format A03;
    public C11767FE A04;
    public C11767FE A05;
    public C11767FE A06;
    public InterfaceC11768FF A07;
    public boolean A08;
    public boolean A09;
    public final int A0A;
    public final InterfaceC11864Gr A0D;
    public final C11766FD A0C = new C11766FD();
    public final C11765FC A0B = new C11765FC();
    public final C11939I4 A0E = new C11939I4(32);

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    private void A07(C12971Yw c12971Yw, C11765FC c11765fc) {
        int i;
        long j = c11765fc.A01;
        this.A0E.A0W(1);
        A06(j, this.A0E.A00, 1);
        long j2 = j + 1;
        byte b = this.A0E.A00[0];
        boolean z = (b & UnsignedBytes.MAX_POWER_OF_TWO) != 0;
        int i2 = b & Byte.MAX_VALUE;
        C11541BF c11541bf = c12971Yw.A02;
        String[] strArr = A0F;
        if (strArr[7].length() != strArr[0].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0F;
        strArr2[7] = "6HdF621ULlaMIov5Sn";
        strArr2[0] = "aYQM3gHOLvWB46aIdh";
        if (c11541bf.A04 == null) {
            c12971Yw.A02.A04 = new byte[16];
        }
        A06(j2, c12971Yw.A02.A04, i2);
        long j3 = j2 + i2;
        if (z) {
            this.A0E.A0W(2);
            A06(j3, this.A0E.A00, 2);
            j3 += 2;
            i = this.A0E.A0I();
        } else {
            i = 1;
        }
        int[] iArr = c12971Yw.A02.A06;
        if (iArr == null || iArr.length < i) {
            iArr = new int[i];
        }
        int[] iArr2 = c12971Yw.A02.A07;
        if (iArr2 == null || iArr2.length < i) {
            iArr2 = new int[i];
        }
        if (z) {
            int i3 = i * 6;
            this.A0E.A0W(i3);
            A06(j3, this.A0E.A00, i3);
            j3 += i3;
            this.A0E.A0Y(0);
            for (int i4 = 0; i4 < i; i4++) {
                iArr[i4] = this.A0E.A0I();
                iArr2[i4] = this.A0E.A0H();
            }
        } else {
            iArr[0] = 0;
            iArr2[0] = c11765fc.A00 - ((int) (j3 - c11765fc.A01));
        }
        C11594C8 c11594c8 = c11765fc.A02;
        c12971Yw.A02.A03(i, iArr, iArr2, c11594c8.A03, c12971Yw.A02.A04, c11594c8.A01, c11594c8.A02, c11594c8.A00);
        int i5 = (int) (j3 - c11765fc.A01);
        c11765fc.A01 += i5;
        c11765fc.A00 -= i5;
    }

    public C12883XT(InterfaceC11864Gr interfaceC11864Gr) {
        this.A0D = interfaceC11864Gr;
        this.A0A = interfaceC11864Gr.A7b();
        this.A04 = new C11767FE(0L, this.A0A);
        this.A05 = this.A04;
        this.A06 = this.A04;
    }

    private int A00(int i) {
        if (!this.A06.A02) {
            this.A06.A02(this.A0D.A3t(), new C11767FE(this.A06.A03, this.A0A));
        }
        return Math.min(i, (int) (this.A06.A03 - this.A01));
    }

    public static Format A01(Format format, long j) {
        if (format == null) {
            return null;
        }
        if (j != 0) {
            long j2 = format.A0G;
            String[] strArr = A0F;
            if (strArr[5].charAt(28) != strArr[4].charAt(28)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0F;
            strArr2[5] = "iKt3Y1BQ3CJXTdnfarGB4lWbdbXT1axy";
            strArr2[4] = "iefBNEa9mmKDxjNV7WvFRyBB3S0z1vzT";
            if (j2 != Long.MAX_VALUE) {
                return format.A0H(format.A0G + j);
            }
            return format;
        }
        return format;
    }

    private void A02(int i) {
        this.A01 += i;
        if (this.A01 == this.A06.A03) {
            this.A06 = this.A06.A00;
        }
    }

    private void A03(long j) {
        while (j >= this.A05.A03) {
            this.A05 = this.A05.A00;
        }
    }

    private void A04(long j) {
        if (j == -1) {
            return;
        }
        while (j >= this.A04.A03) {
            this.A0D.AEz(this.A04.A01);
            this.A04 = this.A04.A01();
        }
        if (this.A05.A04 < this.A04.A04) {
            this.A05 = this.A04;
        }
    }

    private void A05(long j, ByteBuffer byteBuffer, int i) {
        A03(j);
        while (i > 0) {
            int remaining = (int) (this.A05.A03 - j);
            int min = Math.min(i, remaining);
            byte[] bArr = this.A05.A01.A01;
            int remaining2 = this.A05.A00(j);
            byteBuffer.put(bArr, remaining2, min);
            i -= min;
            j += min;
            int remaining3 = (j > this.A05.A03 ? 1 : (j == this.A05.A03 ? 0 : -1));
            if (remaining3 == 0) {
                this.A05 = this.A05.A00;
            }
        }
    }

    private void A06(long j, byte[] bArr, int i) {
        A03(j);
        int i2 = i;
        while (i2 > 0) {
            int min = Math.min(i2, (int) (this.A05.A03 - j));
            byte[] bArr2 = this.A05.A01.A01;
            int toCopy = this.A05.A00(j);
            int remaining = i - i2;
            System.arraycopy(bArr2, toCopy, bArr, remaining, min);
            i2 -= min;
            j += min;
            int remaining2 = (j > this.A05.A03 ? 1 : (j == this.A05.A03 ? 0 : -1));
            if (remaining2 == 0) {
                this.A05 = this.A05.A00;
            }
        }
    }

    /* JADX WARN: Incorrect condition in loop: B:7:0x0019 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void A08(com.facebook.ads.redexgen.p370X.C11767FE r6) {
        /*
            r5 = this;
            boolean r0 = r6.A02
            if (r0 != 0) goto L5
            return
        L5:
            com.facebook.ads.redexgen.X.FE r0 = r5.A06
            boolean r4 = r0.A02
            com.facebook.ads.redexgen.X.FE r0 = r5.A06
            long r2 = r0.A04
            long r0 = r6.A04
            long r2 = r2 - r0
            int r1 = (int) r2
            int r0 = r5.A0A
            int r1 = r1 / r0
            int r4 = r4 + r1
            com.facebook.ads.redexgen.X.Gq[] r2 = new com.facebook.ads.redexgen.p370X.C11863Gq[r4]
            r1 = 0
        L18:
            int r0 = r2.length
            if (r1 >= r0) goto L26
            com.facebook.ads.redexgen.X.Gq r0 = r6.A01
            r2[r1] = r0
            com.facebook.ads.redexgen.X.FE r6 = r6.A01()
            int r1 = r1 + 1
            goto L18
        L26:
            com.facebook.ads.redexgen.X.Gr r0 = r5.A0D
            r0.AF0(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.p370X.C12883XT.A08(com.facebook.ads.redexgen.X.FE):void");
    }

    private final void A09(boolean z) {
        this.A0C.A0H(z);
        A08(this.A04);
        this.A04 = new C11767FE(0L, this.A0A);
        this.A05 = this.A04;
        this.A06 = this.A04;
        this.A01 = 0L;
        this.A0D.AHB();
    }

    public final int A0A() {
        return this.A0C.A07();
    }

    public final int A0B() {
        return this.A0C.A05();
    }

    public final int A0C() {
        return this.A0C.A06();
    }

    public final int A0D(long j, boolean z, boolean z2) {
        return this.A0C.A08(j, z, z2);
    }

    public final int A0E(C114589u c114589u, C12971Yw c12971Yw, boolean z, boolean z2, long j) {
        int result = this.A0C.A09(c114589u, c12971Yw, z, z2, this.A02, this.A0B);
        switch (result) {
            case -5:
                this.A02 = c114589u.A00;
                return -5;
            case -4:
                if (!c12971Yw.A04()) {
                    int result2 = (c12971Yw.A00 > j ? 1 : (c12971Yw.A00 == j ? 0 : -1));
                    if (result2 < 0) {
                        c12971Yw.A00(Integer.MIN_VALUE);
                    }
                    boolean A0A = c12971Yw.A0A();
                    String[] strArr = A0F;
                    String str = strArr[3];
                    String str2 = strArr[2];
                    int charAt = str.charAt(7);
                    int result3 = str2.charAt(7);
                    if (charAt != result3) {
                        String[] strArr2 = A0F;
                        strArr2[7] = "nHnyKFMdmGIlRqyLio";
                        strArr2[0] = "5Se0YnkMdMNTcGBGkq";
                        if (A0A) {
                            A07(c12971Yw, this.A0B);
                        }
                        int result4 = this.A0B.A00;
                        c12971Yw.A09(result4);
                        long j2 = this.A0B.A01;
                        ByteBuffer byteBuffer = c12971Yw.A01;
                        int result5 = this.A0B.A00;
                        A05(j2, byteBuffer, result5);
                        return -4;
                    }
                    throw new RuntimeException();
                }
                return -4;
            case -3:
                return -3;
            default:
                throw new IllegalStateException();
        }
    }

    public final long A0F() {
        return this.A0C.A0B();
    }

    public final Format A0G() {
        return this.A0C.A0E();
    }

    public final void A0H() {
        A04(this.A0C.A0A());
    }

    public final void A0I() {
        A09(false);
    }

    public final void A0J() {
        this.A0C.A0F();
        this.A05 = this.A04;
    }

    public final void A0K(long j, boolean z, boolean z2) {
        A04(this.A0C.A0D(j, z, z2));
    }

    public final void A0L(InterfaceC11768FF interfaceC11768FF) {
        this.A07 = interfaceC11768FF;
    }

    public final boolean A0M() {
        return this.A0C.A0I();
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC11595C9
    public final void A69(Format format) {
        Format A01 = A01(format, this.A00);
        boolean formatChanged = this.A0C.A0K(A01);
        this.A03 = format;
        this.A08 = false;
        if (this.A07 != null && formatChanged) {
            this.A07.ADv(A01);
        }
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC11595C9
    public final int AFu(InterfaceC11584By interfaceC11584By, int i, boolean z) throws IOException, InterruptedException {
        int read = interfaceC11584By.read(this.A06.A01.A01, this.A06.A00(this.A01), A00(i));
        if (read == -1) {
            if (z) {
                return -1;
            }
            throw new EOFException();
        }
        A02(read);
        return read;
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC11595C9
    public final void AFv(C11939I4 c11939i4, int i) {
        while (i > 0) {
            int A00 = A00(i);
            byte[] bArr = this.A06.A01.A01;
            int bytesAppended = this.A06.A00(this.A01);
            c11939i4.A0c(bArr, bytesAppended, A00);
            i -= A00;
            A02(A00);
        }
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC11595C9
    public final void AFw(long j, int i, int i2, int i3, C11594C8 c11594c8) {
        if (this.A08) {
            A69(this.A03);
        }
        if (this.A09) {
            if ((i & 1) == 0 || !this.A0C.A0J(j)) {
                return;
            }
            String[] strArr = A0F;
            if (strArr[3].charAt(7) == strArr[2].charAt(7)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0F;
            strArr2[7] = "0U0U2SqxFsdc1RAk3H";
            strArr2[0] = "sNqMg87rvgY5P5a5aa";
            this.A09 = false;
        }
        this.A0C.A0G(j + this.A00, i, (this.A01 - i2) - i3, i2, c11594c8);
    }
}
