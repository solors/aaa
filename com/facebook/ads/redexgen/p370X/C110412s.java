package com.facebook.ads.redexgen.p370X;

import com.ironsource.C20517nb;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.2s */
/* loaded from: assets/audience_network.dex */
public final class C110412s<E> implements Cloneable {
    public static byte[] A04;
    public static String[] A05 = {"3rdfmaS4Bvs6KD5DohCaazKJ5nPjrowZ", "nk5cgk6zHA99knZ4VIBWP6swe9j6XVxJ", "SR1GrmmGZb5WiV5DUpa8V4qNmvh", "hXJT0tWkN7S4w3G0a7yWDauM9ZCHUr7o", "HR23fndUBIfy3sX8NPdMDAzNZ7ikzeu", "Yza27yUTeZsQZywWns2Eqk9QSJgdTaNC", "To1PPTsvrqg0vOGGncKBfzj1ovx9xtsA", "AHHllHZ2j6xopeQt7"};
    public static final Object A06;
    public int A00;
    public boolean A01;
    public long[] A02;
    public Object[] A03;

    public static String A03(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A04, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 104);
        }
        return new String(copyOfRange);
    }

    public static void A05() {
        A04 = new byte[]{107, 55, 43, 42, 48, 99, 14, 34, 51, 106, 4, 8, 25, 31};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public final String toString() {
        if (A06() <= 0) {
            String A03 = A03(12, 2, 10);
            String[] strArr = A05;
            if (strArr[6].charAt(16) != strArr[5].charAt(16)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A05;
            strArr2[1] = "Skpu9y55M8HCr5nD5qLEIrlUv7DMUr8f";
            strArr2[3] = "83PSjIhGPkyHWD5a17BzKCZMIovhzHLb";
            return A03;
        }
        StringBuilder sb2 = new StringBuilder(this.A00 * 28);
        sb2.append('{');
        for (int i = 0; i < this.A00; i++) {
            if (i > 0) {
                sb2.append(A03(10, 2, 64));
            }
            sb2.append(A00(i));
            sb2.append(C20517nb.f52173T);
            E A07 = A07(i);
            if (A07 != this) {
                sb2.append(A07);
            } else {
                sb2.append(A03(0, 10, 43));
            }
        }
        sb2.append('}');
        return sb2.toString();
    }

    static {
        A05();
        A06 = new Object();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2s != com.facebook.ads.internal.androidx.support.v4.util.LongSparseArray<E> */
    public C110412s() {
        this(10);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2s != com.facebook.ads.internal.androidx.support.v4.util.LongSparseArray<E> */
    public C110412s(int i) {
        this.A01 = false;
        if (i == 0) {
            this.A02 = AbstractC110402r.A02;
            this.A03 = AbstractC110402r.A03;
        } else {
            int A00 = AbstractC110402r.A00(i);
            this.A02 = new long[A00];
            this.A03 = new Object[A00];
        }
        this.A00 = 0;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2s != com.facebook.ads.internal.androidx.support.v4.util.LongSparseArray<E> */
    private final long A00(int i) {
        if (this.A01) {
            A04();
        }
        return this.A02[i];
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2s != com.facebook.ads.internal.androidx.support.v4.util.LongSparseArray<E> */
    /* renamed from: A01 */
    public final C110412s<E> clone() {
        C110412s<E> c110412s = null;
        try {
            c110412s = (C110412s) super.clone();
            c110412s.A02 = (long[]) this.A02.clone();
            c110412s.A03 = (Object[]) this.A03.clone();
            return c110412s;
        } catch (CloneNotSupportedException unused) {
            return c110412s;
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2s != com.facebook.ads.internal.androidx.support.v4.util.LongSparseArray<E> */
    private final E A02(long j, E e) {
        int A03 = AbstractC110402r.A03(this.A02, this.A00, j);
        if (A03 >= 0) {
            Object[] objArr = this.A03;
            if (A05[7].length() != 17) {
                throw new RuntimeException();
            }
            A05[2] = "jXlMUCcAItIj0GcupoJ3Otj";
            if (objArr[A03] != A06) {
                return (E) this.A03[A03];
            }
        }
        return e;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2s != com.facebook.ads.internal.androidx.support.v4.util.LongSparseArray<E> */
    private void A04() {
        int i = this.A00;
        int i2 = 0;
        long[] jArr = this.A02;
        Object[] objArr = this.A03;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (obj != A06) {
                if (i3 != i2) {
                    jArr[i2] = jArr[i3];
                    objArr[i2] = obj;
                    objArr[i3] = null;
                }
                i2++;
            }
        }
        this.A01 = false;
        this.A00 = i2;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2s != com.facebook.ads.internal.androidx.support.v4.util.LongSparseArray<E> */
    public final int A06() {
        if (this.A01) {
            A04();
        }
        int i = this.A00;
        String[] strArr = A05;
        if (strArr[6].charAt(16) != strArr[5].charAt(16)) {
            throw new RuntimeException();
        }
        A05[4] = "ypCZ";
        return i;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2s != com.facebook.ads.internal.androidx.support.v4.util.LongSparseArray<E> */
    public final E A07(int i) {
        if (this.A01) {
            A04();
        }
        return (E) this.A03[i];
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2s != com.facebook.ads.internal.androidx.support.v4.util.LongSparseArray<E> */
    public final E A08(long j) {
        return A02(j, null);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2s != com.facebook.ads.internal.androidx.support.v4.util.LongSparseArray<E> */
    public final void A09() {
        int i = this.A00;
        Object[] objArr = this.A03;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = null;
        }
        this.A00 = 0;
        this.A01 = false;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2s != com.facebook.ads.internal.androidx.support.v4.util.LongSparseArray<E> */
    public final void A0A(int i) {
        if (this.A03[i] != A06) {
            this.A03[i] = A06;
            this.A01 = true;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0057, code lost:
        if (r4 != false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0059, code lost:
        r1 = r8.A00;
        r0 = r8.A02.length;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x005e, code lost:
        if (r1 < r0) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0060, code lost:
        A04();
        r1 = r8.A02;
        r0 = r8.A00;
        r3 = com.facebook.ads.redexgen.p370X.AbstractC110402r.A03(r1, r0, r9) ^ (-1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x006d, code lost:
        r4 = r8.A00;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x007a, code lost:
        if (com.facebook.ads.redexgen.p370X.C110412s.A05[7].length() == 17) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0081, code lost:
        throw new java.lang.RuntimeException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0089, code lost:
        if (r4 != false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x008c, code lost:
        com.facebook.ads.redexgen.p370X.C110412s.A05[7] = "rLvHDd51XfoeTGgnr";
        r0 = r8.A02.length;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0096, code lost:
        if (r4 < r0) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0098, code lost:
        r0 = r8.A00;
        r0 = com.facebook.ads.redexgen.p370X.AbstractC110402r.A00(r0 + 1);
        r5 = new long[r0];
        r4 = new java.lang.Object[r0];
        r7 = r8.A02;
        r6 = r8.A02.length;
        r1 = com.facebook.ads.redexgen.p370X.C110412s.A05[7].length();
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00b4, code lost:
        if (r1 == 17) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00bc, code lost:
        com.facebook.ads.redexgen.p370X.C110412s.A05[2] = "L48OP70swgk";
        java.lang.System.arraycopy(r7, 0, r5, 0, r6);
        r1 = r8.A03;
        r0 = r8.A03.length;
        java.lang.System.arraycopy(r1, 0, r4, 0, r0);
        r8.A02 = r5;
        r8.A03 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00d3, code lost:
        r0 = r8.A00;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00d6, code lost:
        if ((r0 - r3) == 0) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00d8, code lost:
        r0 = r8.A00;
        java.lang.System.arraycopy(r8.A02, r3, r8.A02, r3 + 1, r0 - r3);
        r0 = r8.A00;
        java.lang.System.arraycopy(r8.A03, r3, r8.A03, r3 + 1, r0 - r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00f0, code lost:
        r8.A02[r3] = r9;
        r8.A03[r3] = r11;
        r0 = r8.A00;
        r8.A00 = r0 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:?, code lost:
        return;
     */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2s != com.facebook.ads.internal.androidx.support.v4.util.LongSparseArray<E> */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A0B(long r9, E r11) {
        /*
            Method dump skipped, instructions count: 256
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.p370X.C110412s.A0B(long, java.lang.Object):void");
    }
}
