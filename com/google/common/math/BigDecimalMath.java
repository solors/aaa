package com.google.common.math;

import com.google.common.annotations.GwtIncompatible;
import java.math.BigDecimal;
import java.math.RoundingMode;

@ElementTypesAreNonnullByDefault
@GwtIncompatible
/* loaded from: classes4.dex */
public class BigDecimalMath {

    /* loaded from: classes4.dex */
    private static class BigDecimalToDoubleRounder extends ToDoubleRounder<BigDecimal> {

        /* renamed from: a */
        static final BigDecimalToDoubleRounder f41330a = new BigDecimalToDoubleRounder();

        private BigDecimalToDoubleRounder() {
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.math.ToDoubleRounder
        /* renamed from: f */
        public BigDecimal mo68120a(BigDecimal bigDecimal, BigDecimal bigDecimal2) {
            return bigDecimal.subtract(bigDecimal2);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.math.ToDoubleRounder
        /* renamed from: g */
        public double mo68118c(BigDecimal bigDecimal) {
            return bigDecimal.doubleValue();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.math.ToDoubleRounder
        /* renamed from: h */
        public int mo68117d(BigDecimal bigDecimal) {
            return bigDecimal.signum();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.math.ToDoubleRounder
        /* renamed from: i */
        public BigDecimal mo68116e(double d, RoundingMode roundingMode) {
            return new BigDecimal(d);
        }
    }

    private BigDecimalMath() {
    }

    public static double roundToDouble(BigDecimal bigDecimal, RoundingMode roundingMode) {
        return BigDecimalToDoubleRounder.f41330a.m68119b(bigDecimal, roundingMode);
    }
}
