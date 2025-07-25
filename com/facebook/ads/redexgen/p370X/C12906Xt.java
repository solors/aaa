package com.facebook.ads.redexgen.p370X;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.Xt */
/* loaded from: assets/audience_network.dex */
public final class C12906Xt implements InterfaceC11583Bx {
    public static byte[] A0C;
    public static String[] A0D = {"ufcbpOhQhqfww", "8gjJwrnRxopXUt5RDr9dLAGWyYcJb", "RrpJOHcsb4Pm36IqzzuwB0Pwd2F", "CxEKAMRBe9nENfTzQqU3HZQRCQOPz", "jAhDY7r0a3RmtejP3i1VUzMRlFDw44q1", "N2iKKo93X7k9EaQngNkn4845L63", "a2luvlJkNDqKc6tsACEIqhpgDPphGsh0", "cjBBox4hJsENN3ORgD9lVAgfXCMAx7I4"};
    public static final InterfaceC11586C0 A0E;
    public static final long A0F;
    public static final long A0G;
    public static final long A0H;
    public int A00;
    public int A01;
    public InterfaceC11585Bz A02;
    public InterfaceC11666DI A03;
    public boolean A04;
    public final int A05;
    public final SparseArray<InterfaceC11666DI> A06;
    public final SparseBooleanArray A07;
    public final SparseIntArray A08;
    public final InterfaceC11664DG A09;
    public final C11939I4 A0A;
    public final List<C11950IG> A0B;

    public static String A0D(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A0C, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 25);
        }
        return new String(copyOfRange);
    }

    public static void A0G() {
        A0C = new byte[]{101, 103, 81, 87, -127, -97, -84, -84, -83, -78, 94, -92, -89, -84, -94, 94, -79, -73, -84, -95, 94, -96, -73, -78, -93, 108, 94, -117, -83, -79, -78, 94, -86, -89, -87, -93, -86, -73, 94, -84, -83, -78, 94, -97, 94, -110, -80, -97, -84, -79, -82, -83, -80, -78, 94, -111, -78, -80, -93, -97, -85, 108, 105, 101, 103, 87, -48, -51, -34, -53};
    }

    static {
        A0G();
        A0E = new C12909Xw();
        A0F = AbstractC11953IK.A08(A0D(0, 4, 11));
        A0G = AbstractC11953IK.A08(A0D(62, 4, 11));
        A0H = AbstractC11953IK.A08(A0D(66, 4, 111));
    }

    public C12906Xt() {
        this(0);
    }

    public C12906Xt(int i) {
        this(1, i);
    }

    public C12906Xt(int i, int i2) {
        this(i, new C11950IG(0L), new C12923YA(i2));
    }

    public C12906Xt(int i, C11950IG c11950ig, InterfaceC11664DG interfaceC11664DG) {
        this.A09 = (InterfaceC11664DG) AbstractC11914Hf.A01(interfaceC11664DG);
        this.A05 = i;
        if (i == 1 || i == 2) {
            this.A0B = Collections.singletonList(c11950ig);
        } else {
            this.A0B = new ArrayList();
            this.A0B.add(c11950ig);
        }
        this.A0A = new C11939I4(new byte[9400], 0);
        this.A07 = new SparseBooleanArray();
        this.A06 = new SparseArray<>();
        this.A08 = new SparseIntArray();
        A0F();
    }

    public static /* synthetic */ int A01(C12906Xt c12906Xt) {
        int i = c12906Xt.A01;
        c12906Xt.A01 = i + 1;
        return i;
    }

    public static /* synthetic */ long A06() {
        long j = A0F;
        String[] strArr = A0D;
        if (strArr[3].length() != strArr[1].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0D;
        strArr2[5] = "Mvsf3JxSGosjXzwBkJPQGIwLB4q";
        strArr2[2] = "plT0rwNDmkTcKTqeWkJB2rosyoD";
        return j;
    }

    private void A0F() {
        this.A07.clear();
        this.A06.clear();
        SparseArray<InterfaceC11666DI> A4z = this.A09.A4z();
        int size = A4z.size();
        for (int i = 0; i < size; i++) {
            SparseArray<InterfaceC11666DI> sparseArray = this.A06;
            int initialPayloadReadersSize = A4z.keyAt(i);
            sparseArray.put(initialPayloadReadersSize, A4z.valueAt(i));
            int initialPayloadReadersSize2 = A0D[4].charAt(29);
            if (initialPayloadReadersSize2 != 52) {
                throw new RuntimeException();
            }
            String[] strArr = A0D;
            strArr[5] = "LIVsYOsH3dPANi1wlFOQjbxCQA0";
            strArr[2] = "j5LCk1ZVCLyx7AviJpanN8L4qxZ";
        }
        this.A06.put(0, new C12911Xy(new C12908Xv(this)));
        this.A03 = null;
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC11583Bx
    public final void A9D(InterfaceC11585Bz interfaceC11585Bz) {
        this.A02 = interfaceC11585Bz;
        interfaceC11585Bz.AG8(new C12963Yo(-9223372036854775807L));
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x00d8, code lost:
        if (r8 != 0) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00da, code lost:
        r8 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x010e, code lost:
        if (r8 != 0) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0111, code lost:
        r8 = false;
     */
    @Override // com.facebook.ads.redexgen.p370X.InterfaceC11583Bx
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int AEk(com.facebook.ads.redexgen.p370X.InterfaceC11584By r14, com.facebook.ads.redexgen.p370X.C11590C4 r15) throws java.io.IOException, java.lang.InterruptedException {
        /*
            Method dump skipped, instructions count: 347
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.p370X.C12906Xt.AEk(com.facebook.ads.redexgen.X.By, com.facebook.ads.redexgen.X.C4):int");
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC11583Bx
    public final void AG7(long j, long j2) {
        int size = this.A0B.size();
        for (int i = 0; i < size; i++) {
            this.A0B.get(i).A08();
        }
        this.A0A.A0V();
        this.A08.clear();
        A0F();
        this.A00 = 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x003d, code lost:
        r4 = r4 + 1;
     */
    /* JADX WARN: Incorrect condition in loop: B:7:0x001e */
    @Override // com.facebook.ads.redexgen.p370X.InterfaceC11583Bx
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean AGs(com.facebook.ads.redexgen.p370X.InterfaceC11584By r9) throws java.io.IOException, java.lang.InterruptedException {
        /*
            r8 = this;
            com.facebook.ads.redexgen.X.I4 r0 = r8.A0A
            byte[] r6 = r0.A00
            r0 = 940(0x3ac, float:1.317E-42)
            r5 = 0
            r9.AEO(r6, r5, r0)
            r4 = 0
        Lb:
            r0 = 188(0xbc, float:2.63E-43)
            if (r4 >= r0) goto L43
            r3 = 0
        L10:
            r7 = 5
            java.lang.String[] r1 = com.facebook.ads.redexgen.p370X.C12906Xt.A0D
            r0 = 4
            r1 = r1[r0]
            r0 = 29
            char r1 = r1.charAt(r0)
            r0 = 52
            if (r1 == r0) goto L26
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        L26:
            java.lang.String[] r2 = com.facebook.ads.redexgen.p370X.C12906Xt.A0D
            java.lang.String r1 = "eeZVGRLgQ6ycx1TKwzFGL5x5hafhS4uk"
            r0 = 4
            r2[r0] = r1
            if (r3 != r7) goto L34
            r9.AGq(r4)
            r0 = 1
            return r0
        L34:
            int r0 = r3 * 188
            int r0 = r0 + r4
            r1 = r6[r0]
            r0 = 71
            if (r1 == r0) goto L40
            int r4 = r4 + 1
            goto Lb
        L40:
            int r3 = r3 + 1
            goto L10
        L43:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.p370X.C12906Xt.AGs(com.facebook.ads.redexgen.X.By):boolean");
    }
}
