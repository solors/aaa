package com.facebook.ads.redexgen.p370X;

import android.util.SparseArray;
import androidx.core.view.InputDeviceCompat;
import java.io.IOException;

/* renamed from: com.facebook.ads.redexgen.X.Xz */
/* loaded from: assets/audience_network.dex */
public final class C12912Xz implements InterfaceC11583Bx {
    public static String[] A08 = {"TOwSaeopWt9RIXmRrRQZwDuesIPAjimN", "m0YfCnzLjOMwBkPVrsGxjCiWTjg4eRpW", "OSs4RcvEx1fqe6WQBFkQnVWQQo5eEQ5g", "d1b9lbTXuFgKm0nY", "40KeqNYkGIg2lKcWJqrJfIqB2UKZ02Df", "7BwS2S40JWuyc5xmMzDJ", "w0DKA7VvSD5aMvU9byhgHeDf3SsHODBV", "AZ8mKiYMDCexUwniF0cO0Lykq6xa72Qc"};
    public static final InterfaceC11586C0 A09 = new C12913Y0();
    public long A00;
    public InterfaceC11585Bz A01;
    public boolean A02;
    public boolean A03;
    public boolean A04;
    public final SparseArray<C11658DA> A05;
    public final C11939I4 A06;
    public final C11950IG A07;

    public C12912Xz() {
        this(new C11950IG(0L));
    }

    public C12912Xz(C11950IG c11950ig) {
        this.A07 = c11950ig;
        this.A06 = new C11939I4(4096);
        this.A05 = new SparseArray<>();
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC11583Bx
    public final void A9D(InterfaceC11585Bz interfaceC11585Bz) {
        this.A01 = interfaceC11585Bz;
        interfaceC11585Bz.AG8(new C12963Yo(-9223372036854775807L));
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC11583Bx
    public final int AEk(InterfaceC11584By interfaceC11584By, C11590C4 c11590c4) throws IOException, InterruptedException {
        long j;
        if (interfaceC11584By.AEP(this.A06.A00, 0, 4, true)) {
            this.A06.A0Y(0);
            int A082 = this.A06.A08();
            if (A082 == 441) {
                return -1;
            }
            if (A082 == 442) {
                interfaceC11584By.AEO(this.A06.A00, 0, 10);
                this.A06.A0Y(9);
                int nextStartCode = this.A06.A0E();
                interfaceC11584By.AGq((nextStartCode & 7) + 14);
                return 0;
            } else if (A082 == 443) {
                interfaceC11584By.AEO(this.A06.A00, 0, 2);
                this.A06.A0Y(0);
                int nextStartCode2 = this.A06.A0I();
                interfaceC11584By.AGq(nextStartCode2 + 6);
                return 0;
            } else {
                int nextStartCode3 = A082 & InputDeviceCompat.SOURCE_ANY;
                if ((nextStartCode3 >> 8) != 1) {
                    interfaceC11584By.AGq(1);
                    return 0;
                }
                int i = A082 & 255;
                C11658DA c11658da = this.A05.get(i);
                if (!this.A02) {
                    if (c11658da == null) {
                        InterfaceC11651D3 elementaryStreamReader = null;
                        if (i == 189) {
                            elementaryStreamReader = new C12927YE();
                            this.A03 = true;
                            this.A00 = interfaceC11584By.A86();
                        } else if ((i & 224) == 192) {
                            elementaryStreamReader = new C12915Y2();
                            this.A03 = true;
                            this.A00 = interfaceC11584By.A86();
                        } else if ((i & 240) == 224) {
                            elementaryStreamReader = new C12920Y7();
                            this.A04 = true;
                            this.A00 = interfaceC11584By.A86();
                        }
                        if (elementaryStreamReader != null) {
                            elementaryStreamReader.A5B(this.A01, new C11665DH(i, 256));
                            c11658da = new C11658DA(elementaryStreamReader, this.A07);
                            this.A05.put(i, c11658da);
                        }
                    }
                    if (this.A03 && this.A04) {
                        j = this.A00 + 8192;
                    } else {
                        j = 1048576;
                    }
                    if (interfaceC11584By.A86() > j) {
                        this.A02 = true;
                        this.A01.A5u();
                    }
                }
                interfaceC11584By.AEO(this.A06.A00, 0, 2);
                this.A06.A0Y(0);
                int nextStartCode4 = this.A06.A0I();
                int i2 = nextStartCode4 + 6;
                if (c11658da == null) {
                    interfaceC11584By.AGq(i2);
                } else {
                    C11939I4 c11939i4 = this.A06;
                    if (A08[3].length() != 16) {
                        throw new RuntimeException();
                    }
                    String[] strArr = A08;
                    strArr[1] = "j5TposUyMNBjvJQv7fBjXCxPICHPLvzQ";
                    strArr[4] = "7epKzrJqV329mASYJ56vhWx8nQlYd13J";
                    c11939i4.A0W(i2);
                    interfaceC11584By.readFully(this.A06.A00, 0, i2);
                    this.A06.A0Y(6);
                    c11658da.A03(this.A06);
                    C11939I4 c11939i42 = this.A06;
                    int nextStartCode5 = this.A06.A05();
                    c11939i42.A0X(nextStartCode5);
                }
                return 0;
            }
        }
        return -1;
    }

    /* JADX WARN: Incorrect condition in loop: B:4:0x000c */
    @Override // com.facebook.ads.redexgen.p370X.InterfaceC11583Bx
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void AG7(long r6, long r8) {
        /*
            r5 = this;
            com.facebook.ads.redexgen.X.IG r0 = r5.A07
            r0.A08()
            r4 = 0
        L6:
            android.util.SparseArray<com.facebook.ads.redexgen.X.DA> r0 = r5.A05
            int r0 = r0.size()
            if (r4 >= r0) goto L3b
            android.util.SparseArray<com.facebook.ads.redexgen.X.DA> r0 = r5.A05
            java.lang.Object r3 = r0.valueAt(r4)
            java.lang.String[] r2 = com.facebook.ads.redexgen.p370X.C12912Xz.A08
            r0 = 6
            r1 = r2[r0]
            r0 = 2
            r0 = r2[r0]
            int r1 = r1.length()
            int r0 = r0.length()
            if (r1 == r0) goto L2c
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        L2c:
            java.lang.String[] r2 = com.facebook.ads.redexgen.p370X.C12912Xz.A08
            java.lang.String r1 = "i2l135vnIgvDI5cE6wxXd3NswI9xNsO1"
            r0 = 0
            r2[r0] = r1
            com.facebook.ads.redexgen.X.DA r3 = (com.facebook.ads.redexgen.p370X.C11658DA) r3
            r3.A02()
            int r4 = r4 + 1
            goto L6
        L3b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.p370X.C12912Xz.AG7(long, long):void");
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC11583Bx
    public final boolean AGs(InterfaceC11584By interfaceC11584By) throws IOException, InterruptedException {
        byte[] bArr = new byte[14];
        interfaceC11584By.AEO(bArr, 0, 14);
        if (442 != (((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255)) || (bArr[4] & 196) != 68 || (bArr[6] & 4) != 4 || (bArr[8] & 4) != 4 || (bArr[9] & 1) != 1 || (bArr[12] & 3) != 3) {
            return false;
        }
        int packStuffingLength = bArr[13] & 7;
        interfaceC11584By.A3s(packStuffingLength);
        interfaceC11584By.AEO(bArr, 0, 3);
        int packStuffingLength2 = bArr[0];
        int i = (packStuffingLength2 & 255) << 16;
        int packStuffingLength3 = bArr[1];
        int i2 = i | ((packStuffingLength3 & 255) << 8);
        int packStuffingLength4 = bArr[2];
        return 1 == ((packStuffingLength4 & 255) | i2);
    }
}
