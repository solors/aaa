package com.facebook.ads.redexgen.p370X;

import android.util.Pair;

/* renamed from: com.facebook.ads.redexgen.X.AM */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC11486AM {
    public static String[] A00 = {"IexUQhYz8RUJUtV2yarZNq98m", "SqA0rybJc2Jt0Ub7DMrjeUwUZAoVo8qv", "DxKx9aNXAj7QPQdQDSbsmk09wXoOPMXu", "S07tUDZ51Jgo3YfQ92rRpWn9afvBt6KZ", "soNl1VU97OXHQ4CjHAobgeJ4Yx1tI1qy", "ZprKdiaQVhEf0JuCZOvliqNdbLoAvnqm", "6MSYafjKTbgzk4635", "p5W86Vx2FooSJmLWV"};
    public static final AbstractC11486AM A01 = new C12983Z8();

    public abstract int A00();

    public abstract int A01();

    public abstract int A04(Object obj);

    public abstract C11484AK A0A(int i, C11484AK c11484ak, boolean z);

    public abstract C11485AL A0D(int i, C11485AL c11485al, boolean z, long j);

    public int A02(int i, int i2, boolean z) {
        switch (i2) {
            case 0:
                if (i == A06(z)) {
                    return -1;
                }
                return i + 1;
            case 1:
                return i;
            case 2:
                if (i == A06(z)) {
                    return A05(z);
                }
                return i + 1;
            default:
                throw new IllegalStateException();
        }
    }

    public final int A03(int i, C11484AK c11484ak, C11485AL c11485al, int i2, boolean z) {
        int i3 = A09(i, c11484ak).A00;
        int windowIndex = A0B(i3, c11485al).A01;
        if (windowIndex == i) {
            int A02 = A02(i3, i2, z);
            String[] strArr = A00;
            String str = strArr[1];
            String str2 = strArr[3];
            int charAt = str.charAt(18);
            int windowIndex2 = str2.charAt(18);
            if (charAt != windowIndex2) {
                throw new RuntimeException();
            }
            String[] strArr2 = A00;
            strArr2[7] = "n5aRHXbmzoQSsyEqE";
            strArr2[6] = "TNiQeaFqL1JGSvg6B";
            if (A02 == -1) {
                return -1;
            }
            int windowIndex3 = A0B(A02, c11485al).A00;
            return windowIndex3;
        }
        int windowIndex4 = i + 1;
        return windowIndex4;
    }

    public int A05(boolean z) {
        return A0E() ? -1 : 0;
    }

    public int A06(boolean z) {
        if (A0E()) {
            return -1;
        }
        return A01() - 1;
    }

    public final Pair<Integer, Long> A07(C11485AL c11485al, C11484AK c11484ak, int i, long j) {
        return A08(c11485al, c11484ak, i, j, 0L);
    }

    public final Pair<Integer, Long> A08(C11485AL c11485al, C11484AK c11484ak, int i, long j, long j2) {
        AbstractC11914Hf.A00(i, 0, A01());
        A0D(i, c11485al, false, j2);
        if (j == -9223372036854775807L) {
            j = c11485al.A01();
            if (j == -9223372036854775807L) {
                return null;
            }
        }
        int i2 = c11485al.A00;
        long periodPositionUs = c11485al.A03() + j;
        long A07 = A09(i2, c11484ak).A07();
        while (A07 != -9223372036854775807L && periodPositionUs >= A07 && i2 < c11485al.A01) {
            periodPositionUs -= A07;
            i2++;
            A07 = A09(i2, c11484ak).A07();
        }
        return Pair.create(Integer.valueOf(i2), Long.valueOf(periodPositionUs));
    }

    public final C11484AK A09(int i, C11484AK c11484ak) {
        return A0A(i, c11484ak, false);
    }

    public final C11485AL A0B(int i, C11485AL c11485al) {
        return A0C(i, c11485al, false);
    }

    public final C11485AL A0C(int i, C11485AL c11485al, boolean z) {
        return A0D(i, c11485al, z, 0L);
    }

    public final boolean A0E() {
        return A01() == 0;
    }

    public final boolean A0F(int i, C11484AK c11484ak, C11485AL c11485al, int i2, boolean z) {
        return A03(i, c11484ak, c11485al, i2, z) == -1;
    }
}
