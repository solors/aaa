package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzgal {
    public static long zza(long j, long j2) {
        boolean z;
        boolean z2 = true;
        if ((j ^ j2) < 0) {
            z = true;
        } else {
            z = false;
        }
        long j3 = j + j2;
        if ((j ^ j3) < 0) {
            z2 = false;
        }
        if (z | z2) {
            return j3;
        }
        throw new ArithmeticException("overflow: checkedAdd(" + j + ", " + j2 + ")");
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x004a, code lost:
        if (r8 > 0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x004d, code lost:
        if (r8 < 0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0051, code lost:
        if (r9 == false) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static long zzb(long r8, long r10, java.math.RoundingMode r12) {
        /*
            r12.getClass()
            long r0 = r8 / r10
            long r2 = r10 * r0
            long r2 = r8 - r2
            r4 = 0
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 != 0) goto L10
            goto L59
        L10:
            long r8 = r8 ^ r10
            int[] r6 = com.google.android.gms.internal.ads.zzgak.zza
            int r7 = r12.ordinal()
            r6 = r6[r7]
            r7 = 63
            long r8 = r8 >> r7
            int r8 = (int) r8
            r9 = 1
            r8 = r8 | r9
            r7 = 0
            switch(r6) {
                case 1: goto L56;
                case 2: goto L59;
                case 3: goto L4d;
                case 4: goto L53;
                case 5: goto L4a;
                case 6: goto L29;
                case 7: goto L29;
                case 8: goto L29;
                default: goto L23;
            }
        L23:
            java.lang.AssertionError r8 = new java.lang.AssertionError
            r8.<init>()
            throw r8
        L29:
            long r2 = java.lang.Math.abs(r2)
            long r10 = java.lang.Math.abs(r10)
            long r10 = r10 - r2
            long r2 = r2 - r10
            int r10 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r10 != 0) goto L47
            java.math.RoundingMode r10 = java.math.RoundingMode.HALF_UP
            if (r12 == r10) goto L51
            java.math.RoundingMode r10 = java.math.RoundingMode.HALF_EVEN
            if (r12 != r10) goto L50
            r10 = 1
            long r10 = r10 & r0
            int r10 = (r10 > r4 ? 1 : (r10 == r4 ? 0 : -1))
            if (r10 == 0) goto L50
            goto L51
        L47:
            if (r10 <= 0) goto L50
            goto L51
        L4a:
            if (r8 <= 0) goto L50
            goto L51
        L4d:
            if (r8 >= 0) goto L50
            goto L51
        L50:
            r9 = r7
        L51:
            if (r9 == 0) goto L59
        L53:
            long r8 = (long) r8
            long r0 = r0 + r8
            return r0
        L56:
            com.google.android.gms.internal.ads.zzgam.zzb(r7)
        L59:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzgal.zzb(long, long, java.math.RoundingMode):long");
    }

    public static long zzc(long j, long j2) {
        zzgam.zza("a", j);
        zzgam.zza("b", j2);
        if (j == 0) {
            return j2;
        }
        if (j2 == 0) {
            return j;
        }
        int numberOfTrailingZeros = Long.numberOfTrailingZeros(j);
        long j3 = j >> numberOfTrailingZeros;
        int numberOfTrailingZeros2 = Long.numberOfTrailingZeros(j2);
        long j4 = j2 >> numberOfTrailingZeros2;
        while (j3 != j4) {
            long j5 = j3 - j4;
            long j6 = (j5 >> 63) & j5;
            long j7 = (j5 - j6) - j6;
            j3 = j7 >> Long.numberOfTrailingZeros(j7);
            j4 += j6;
        }
        return j3 << Math.min(numberOfTrailingZeros, numberOfTrailingZeros2);
    }

    public static long zzd(long j, long j2) {
        boolean z;
        boolean z2;
        int numberOfLeadingZeros = Long.numberOfLeadingZeros(j) + Long.numberOfLeadingZeros(~j) + Long.numberOfLeadingZeros(j2) + Long.numberOfLeadingZeros(~j2);
        if (numberOfLeadingZeros > 65) {
            return j * j2;
        }
        long j3 = j ^ j2;
        boolean z3 = true;
        if (numberOfLeadingZeros < 64) {
            z = true;
        } else {
            z = false;
        }
        int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
        if (i < 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (j2 != Long.MIN_VALUE) {
            z3 = false;
        }
        long j4 = (j3 >>> 63) + Long.MAX_VALUE;
        if (z | (z3 & z2)) {
            return j4;
        }
        long j5 = j * j2;
        if (i != 0 && j5 / j != j2) {
            return j4;
        }
        return j5;
    }
}
