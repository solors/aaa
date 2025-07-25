package com.google.common.collect;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.base.Objects;
import java.util.Arrays;

@GwtIncompatible
@ElementTypesAreNonnullByDefault
/* loaded from: classes4.dex */
final class CompactHashing {
    private CompactHashing() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static Object m69644a(int i) {
        if (i >= 2 && i <= 1073741824 && Integer.highestOneBit(i) == i) {
            if (i <= 256) {
                return new byte[i];
            }
            if (i <= 65536) {
                return new short[i];
            }
            return new int[i];
        }
        StringBuilder sb2 = new StringBuilder(52);
        sb2.append("must be power of 2 between 2^1 and 2^30: ");
        sb2.append(i);
        throw new IllegalArgumentException(sb2.toString());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static int m69643b(int i, int i2) {
        return i & (~i2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public static int m69642c(int i, int i2) {
        return i & i2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public static int m69641d(int i, int i2, int i3) {
        return (i & (~i3)) | (i2 & i3);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public static int m69640e(int i) {
        int i2;
        if (i < 32) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        return i2 * (i + 1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public static int m69639f(Object obj, Object obj2, int i, Object obj3, int[] iArr, Object[] objArr, Object[] objArr2) {
        int i2;
        int i3;
        int m69450d = Hashing.m69450d(obj);
        int i4 = m69450d & i;
        int m69637h = m69637h(obj3, i4);
        if (m69637h == 0) {
            return -1;
        }
        int m69643b = m69643b(m69450d, i);
        int i5 = -1;
        while (true) {
            i2 = m69637h - 1;
            i3 = iArr[i2];
            if (m69643b(i3, i) != m69643b || !Objects.equal(obj, objArr[i2]) || (objArr2 != null && !Objects.equal(obj2, objArr2[i2]))) {
                int m69642c = m69642c(i3, i);
                if (m69642c == 0) {
                    return -1;
                }
                i5 = i2;
                m69637h = m69642c;
            }
        }
        int m69642c2 = m69642c(i3, i);
        if (i5 == -1) {
            m69636i(obj3, i4, m69642c2);
        } else {
            iArr[i5] = m69641d(iArr[i5], m69642c2, i);
        }
        return i2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public static void m69638g(Object obj) {
        if (obj instanceof byte[]) {
            Arrays.fill((byte[]) obj, (byte) 0);
        } else if (obj instanceof short[]) {
            Arrays.fill((short[]) obj, (short) 0);
        } else {
            Arrays.fill((int[]) obj, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public static int m69637h(Object obj, int i) {
        if (obj instanceof byte[]) {
            return ((byte[]) obj)[i] & 255;
        }
        if (obj instanceof short[]) {
            return ((short[]) obj)[i] & 65535;
        }
        return ((int[]) obj)[i];
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public static void m69636i(Object obj, int i, int i2) {
        if (obj instanceof byte[]) {
            ((byte[]) obj)[i] = (byte) i2;
        } else if (obj instanceof short[]) {
            ((short[]) obj)[i] = (short) i2;
        } else {
            ((int[]) obj)[i] = i2;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public static int m69635j(int i) {
        return Math.max(4, Hashing.m69453a(i + 1, 1.0d));
    }
}
