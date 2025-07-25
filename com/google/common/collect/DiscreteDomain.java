package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Preconditions;
import com.google.common.primitives.Ints;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.Serializable;
import java.lang.Comparable;
import java.math.BigInteger;
import java.util.NoSuchElementException;

@GwtCompatible
@ElementTypesAreNonnullByDefault
/* loaded from: classes4.dex */
public abstract class DiscreteDomain<C extends Comparable> {

    /* renamed from: b */
    final boolean f39923b;

    /* loaded from: classes4.dex */
    private static final class BigIntegerDomain extends DiscreteDomain<BigInteger> implements Serializable {

        /* renamed from: c */
        private static final BigIntegerDomain f39924c = new BigIntegerDomain();

        /* renamed from: d */
        private static final BigInteger f39925d = BigInteger.valueOf(Long.MIN_VALUE);

        /* renamed from: f */
        private static final BigInteger f39926f = BigInteger.valueOf(Long.MAX_VALUE);

        BigIntegerDomain() {
            super(true);
        }

        private Object readResolve() {
            return f39924c;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.DiscreteDomain
        /* renamed from: c */
        public BigInteger mo69557a(BigInteger bigInteger, long j) {
            CollectPreconditions.m69726c(j, "distance");
            return bigInteger.add(BigInteger.valueOf(j));
        }

        public String toString() {
            return "DiscreteDomain.bigIntegers()";
        }

        @Override // com.google.common.collect.DiscreteDomain
        public long distance(BigInteger bigInteger, BigInteger bigInteger2) {
            return bigInteger2.subtract(bigInteger).max(f39925d).min(f39926f).longValue();
        }

        @Override // com.google.common.collect.DiscreteDomain
        public BigInteger next(BigInteger bigInteger) {
            return bigInteger.add(BigInteger.ONE);
        }

        @Override // com.google.common.collect.DiscreteDomain
        public BigInteger previous(BigInteger bigInteger) {
            return bigInteger.subtract(BigInteger.ONE);
        }
    }

    /* loaded from: classes4.dex */
    private static final class IntegerDomain extends DiscreteDomain<Integer> implements Serializable {

        /* renamed from: c */
        private static final IntegerDomain f39927c = new IntegerDomain();

        IntegerDomain() {
            super(true);
        }

        private Object readResolve() {
            return f39927c;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.DiscreteDomain
        /* renamed from: c */
        public Integer mo69557a(Integer num, long j) {
            CollectPreconditions.m69726c(j, "distance");
            return Integer.valueOf(Ints.checkedCast(num.longValue() + j));
        }

        public String toString() {
            return "DiscreteDomain.integers()";
        }

        @Override // com.google.common.collect.DiscreteDomain
        public long distance(Integer num, Integer num2) {
            return num2.intValue() - num.intValue();
        }

        @Override // com.google.common.collect.DiscreteDomain
        public Integer maxValue() {
            return Integer.MAX_VALUE;
        }

        @Override // com.google.common.collect.DiscreteDomain
        public Integer minValue() {
            return Integer.MIN_VALUE;
        }

        @Override // com.google.common.collect.DiscreteDomain
        public Integer next(Integer num) {
            int intValue = num.intValue();
            if (intValue == Integer.MAX_VALUE) {
                return null;
            }
            return Integer.valueOf(intValue + 1);
        }

        @Override // com.google.common.collect.DiscreteDomain
        public Integer previous(Integer num) {
            int intValue = num.intValue();
            if (intValue == Integer.MIN_VALUE) {
                return null;
            }
            return Integer.valueOf(intValue - 1);
        }
    }

    /* loaded from: classes4.dex */
    private static final class LongDomain extends DiscreteDomain<Long> implements Serializable {

        /* renamed from: c */
        private static final LongDomain f39928c = new LongDomain();

        LongDomain() {
            super(true);
        }

        private Object readResolve() {
            return f39928c;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.DiscreteDomain
        /* renamed from: c */
        public Long mo69557a(Long l, long j) {
            boolean z;
            CollectPreconditions.m69726c(j, "distance");
            long longValue = l.longValue() + j;
            if (longValue < 0) {
                if (l.longValue() < 0) {
                    z = true;
                } else {
                    z = false;
                }
                Preconditions.checkArgument(z, "overflow");
            }
            return Long.valueOf(longValue);
        }

        public String toString() {
            return "DiscreteDomain.longs()";
        }

        @Override // com.google.common.collect.DiscreteDomain
        public long distance(Long l, Long l2) {
            long longValue = l2.longValue() - l.longValue();
            if (l2.longValue() <= l.longValue() || longValue >= 0) {
                if (l2.longValue() >= l.longValue() || longValue <= 0) {
                    return longValue;
                }
                return Long.MIN_VALUE;
            }
            return Long.MAX_VALUE;
        }

        @Override // com.google.common.collect.DiscreteDomain
        public Long maxValue() {
            return Long.MAX_VALUE;
        }

        @Override // com.google.common.collect.DiscreteDomain
        public Long minValue() {
            return Long.MIN_VALUE;
        }

        @Override // com.google.common.collect.DiscreteDomain
        public Long next(Long l) {
            long longValue = l.longValue();
            if (longValue == Long.MAX_VALUE) {
                return null;
            }
            return Long.valueOf(longValue + 1);
        }

        @Override // com.google.common.collect.DiscreteDomain
        public Long previous(Long l) {
            long longValue = l.longValue();
            if (longValue == Long.MIN_VALUE) {
                return null;
            }
            return Long.valueOf(longValue - 1);
        }
    }

    public static DiscreteDomain<BigInteger> bigIntegers() {
        return BigIntegerDomain.f39924c;
    }

    public static DiscreteDomain<Integer> integers() {
        return IntegerDomain.f39927c;
    }

    public static DiscreteDomain<Long> longs() {
        return LongDomain.f39928c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public C mo69557a(C c, long j) {
        CollectPreconditions.m69726c(j, "distance");
        C c2 = c;
        for (long j2 = 0; j2 < j; j2++) {
            c2 = next(c2);
            if (c2 == null) {
                String valueOf = String.valueOf(c);
                StringBuilder sb2 = new StringBuilder(valueOf.length() + 51);
                sb2.append("overflowed computing offset(");
                sb2.append(valueOf);
                sb2.append(", ");
                sb2.append(j);
                sb2.append(")");
                throw new IllegalArgumentException(sb2.toString());
            }
        }
        return c2;
    }

    public abstract long distance(C c, C c2);

    @CanIgnoreReturnValue
    public C maxValue() {
        throw new NoSuchElementException();
    }

    @CanIgnoreReturnValue
    public C minValue() {
        throw new NoSuchElementException();
    }

    public abstract C next(C c);

    public abstract C previous(C c);

    protected DiscreteDomain() {
        this(false);
    }

    private DiscreteDomain(boolean z) {
        this.f39923b = z;
    }
}
