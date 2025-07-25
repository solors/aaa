package se;

import kotlin.text.C37695v;

/* compiled from: R8$$SyntheticClass */
/* renamed from: se.x */
/* loaded from: classes8.dex */
public final /* synthetic */ class C42736x {
    /* renamed from: a */
    public static /* synthetic */ String m6661a(long j, int i) {
        long m16528a;
        int i2 = (j > 0L ? 1 : (j == 0L ? 0 : -1));
        if (i2 == 0) {
            return "0";
        }
        if (i2 > 0) {
            return Long.toString(j, i);
        }
        i = (i < 2 || i > 36) ? 10 : 10;
        int i3 = 64;
        char[] cArr = new char[64];
        int i4 = i - 1;
        if ((i & i4) == 0) {
            int numberOfTrailingZeros = Integer.numberOfTrailingZeros(i);
            do {
                i3--;
                cArr[i3] = Character.forDigit(((int) j) & i4, i);
                j >>>= numberOfTrailingZeros;
            } while (j != 0);
        } else {
            if ((i & 1) == 0) {
                m16528a = (j >>> 1) / (i >>> 1);
            } else {
                m16528a = C37695v.m16528a(j, i);
            }
            long j2 = i;
            cArr[63] = Character.forDigit((int) (j - (m16528a * j2)), i);
            i3 = 63;
            while (m16528a > 0) {
                i3--;
                cArr[i3] = Character.forDigit((int) (m16528a % j2), i);
                m16528a /= j2;
            }
        }
        return new String(cArr, i3, 64 - i3);
    }
}
