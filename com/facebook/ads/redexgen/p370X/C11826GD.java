package com.facebook.ads.redexgen.p370X;

import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.GD */
/* loaded from: assets/audience_network.dex */
public final class C11826GD {
    public static String[] A09 = {"RyObx4fDrpMWT", "FTMxUhOCMkhRoWZqBhU38SM6oI7g2M2", "2MJEizeCZp5uxdCnXqOwiW6KQOsM6Mkf", "FGlKPE9c96UBdMv9ez6ncjACQS1IUqcl", "lhmVeVrWicrlRI5i333Om88pysxYtUVV", "IdMgaNLr90DZkQ3EJ6nC", "kLSN0JGedbjQkgataaBmJ9dDQG5h9BL", "R6VLxz3UdMSFOznv3qvHILfZYgKZO5A0"};
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public boolean A06;
    public final C11939I4 A07 = new C11939I4();
    public final int[] A08 = new int[256];

    /* JADX INFO: Access modifiers changed from: private */
    public void A03(C11939I4 c11939i4, int i) {
        int totalLength;
        if (i < 4) {
            return;
        }
        c11939i4.A0Z(3);
        int i2 = i - 4;
        if ((c11939i4.A0E() & 128) != 0) {
            if (i2 < 7 || (totalLength = c11939i4.A0G()) < 4) {
                return;
            }
            this.A01 = c11939i4.A0I();
            this.A00 = c11939i4.A0I();
            this.A07.A0W(totalLength - 4);
            i2 -= 7;
        }
        int bytesToRead = this.A07.A06();
        int A07 = this.A07.A07();
        String[] strArr = A09;
        String str = strArr[6];
        String str2 = strArr[1];
        int length = str.length();
        int position = str2.length();
        if (length != position) {
            throw new RuntimeException();
        }
        String[] strArr2 = A09;
        strArr2[3] = "GogXbqDElCJhME8HyW7iX3mlv0t9khKj";
        strArr2[4] = "UXOJdmjGs2LP9mzRUQfP3v2dC8BVV8MN";
        if (bytesToRead < A07 && i2 > 0) {
            int min = Math.min(i2, A07 - bytesToRead);
            c11939i4.A0c(this.A07.A00, bytesToRead, min);
            this.A07.A0Y(bytesToRead + min);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A04(C11939I4 c11939i4, int i) {
        if (i < 19) {
            return;
        }
        this.A05 = c11939i4.A0I();
        this.A04 = c11939i4.A0I();
        c11939i4.A0Z(11);
        this.A02 = c11939i4.A0I();
        this.A03 = c11939i4.A0I();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A05(C11939I4 c11939i4, int i) {
        if (i % 5 != 2) {
            return;
        }
        c11939i4.A0Z(2);
        Arrays.fill(this.A08, 0);
        int i2 = i / 5;
        for (int index = 0; index < i2; index++) {
            int A0E = c11939i4.A0E();
            int a = c11939i4.A0E();
            int A0E2 = c11939i4.A0E();
            int A0E3 = c11939i4.A0E();
            int entryCount = A0E2 - 128;
            int i3 = (int) (a + (entryCount * 1.402d));
            int g = (int) ((a - ((A0E3 - 128) * 0.34414d)) - ((A0E2 - 128) * 0.71414d));
            int entryCount2 = c11939i4.A0E() << 24;
            this.A08[A0E] = entryCount2 | (AbstractC11953IK.A06(i3, 0, 255) << 16) | (AbstractC11953IK.A06(g, 0, 255) << 8) | AbstractC11953IK.A06((int) (a + ((A0E3 - 128) * 1.772d)), 0, 255);
        }
        this.A06 = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x00bb, code lost:
        if (r6 == 0) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00bd, code lost:
        r1 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00d1, code lost:
        if (r6 == 0) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00d4, code lost:
        r1 = r9.A08[r9.A07.A0E()];
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.facebook.ads.redexgen.p370X.C11805Fs A06() {
        /*
            Method dump skipped, instructions count: 281
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.p370X.C11826GD.A06():com.facebook.ads.redexgen.X.Fs");
    }

    public final void A07() {
        this.A05 = 0;
        this.A04 = 0;
        this.A02 = 0;
        this.A03 = 0;
        this.A01 = 0;
        this.A00 = 0;
        this.A07.A0W(0);
        this.A06 = false;
    }
}
