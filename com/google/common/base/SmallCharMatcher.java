package com.google.common.base;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.CharMatcher;
import java.util.BitSet;

@GwtIncompatible
@ElementTypesAreNonnullByDefault
/* loaded from: classes4.dex */
final class SmallCharMatcher extends CharMatcher.NamedFastMatcher {

    /* renamed from: c */
    private final char[] f39436c;

    /* renamed from: d */
    private final boolean f39437d;

    /* renamed from: f */
    private final long f39438f;

    private SmallCharMatcher(char[] cArr, long j, boolean z, String str) {
        super(str);
        this.f39436c = cArr;
        this.f39438f = j;
        this.f39437d = z;
    }

    /* renamed from: i */
    private boolean m70023i(int i) {
        if (1 == ((this.f39438f >> i) & 1)) {
            return true;
        }
        return false;
    }

    @VisibleForTesting
    /* renamed from: j */
    static int m70022j(int i) {
        if (i == 1) {
            return 2;
        }
        int highestOneBit = Integer.highestOneBit(i - 1) << 1;
        while (highestOneBit * 0.5d < i) {
            highestOneBit <<= 1;
        }
        return highestOneBit;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k */
    public static CharMatcher m70021k(BitSet bitSet, String str) {
        int i;
        int cardinality = bitSet.cardinality();
        boolean z = bitSet.get(0);
        int m70022j = m70022j(cardinality);
        char[] cArr = new char[m70022j];
        int i2 = m70022j - 1;
        int nextSetBit = bitSet.nextSetBit(0);
        long j = 0;
        while (nextSetBit != -1) {
            long j2 = (1 << nextSetBit) | j;
            int m70020l = m70020l(nextSetBit);
            while (true) {
                i = m70020l & i2;
                if (cArr[i] == 0) {
                    break;
                }
                m70020l = i + 1;
            }
            cArr[i] = (char) nextSetBit;
            nextSetBit = bitSet.nextSetBit(nextSetBit + 1);
            j = j2;
        }
        return new SmallCharMatcher(cArr, j, z, str);
    }

    /* renamed from: l */
    static int m70020l(int i) {
        return Integer.rotateLeft(i * (-862048943), 15) * 461845907;
    }

    @Override // com.google.common.base.CharMatcher
    /* renamed from: g */
    void mo70024g(BitSet bitSet) {
        char[] cArr;
        if (this.f39437d) {
            bitSet.set(0);
        }
        for (char c : this.f39436c) {
            if (c != 0) {
                bitSet.set(c);
            }
        }
    }

    @Override // com.google.common.base.CharMatcher
    public boolean matches(char c) {
        if (c == 0) {
            return this.f39437d;
        }
        if (!m70023i(c)) {
            return false;
        }
        int length = this.f39436c.length - 1;
        int m70020l = m70020l(c) & length;
        int i = m70020l;
        do {
            char c2 = this.f39436c[i];
            if (c2 == 0) {
                return false;
            }
            if (c2 == c) {
                return true;
            }
            i = (i + 1) & length;
        } while (i != m70020l);
        return false;
    }
}
