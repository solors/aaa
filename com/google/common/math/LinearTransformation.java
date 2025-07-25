package com.google.common.math;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.base.Preconditions;
import com.google.errorprone.annotations.concurrent.LazyInit;

@ElementTypesAreNonnullByDefault
@Beta
@GwtIncompatible
/* loaded from: classes4.dex */
public abstract class LinearTransformation {

    /* loaded from: classes4.dex */
    public static final class LinearTransformationBuilder {

        /* renamed from: a */
        private final double f41345a;

        /* renamed from: b */
        private final double f41346b;

        public LinearTransformation and(double d, double d2) {
            boolean z;
            boolean z2 = true;
            if (DoubleUtils.m68186d(d) && DoubleUtils.m68186d(d2)) {
                z = true;
            } else {
                z = false;
            }
            Preconditions.checkArgument(z);
            double d3 = this.f41345a;
            if (d == d3) {
                if (d2 == this.f41346b) {
                    z2 = false;
                }
                Preconditions.checkArgument(z2);
                return new VerticalLinearTransformation(this.f41345a);
            }
            return withSlope((d2 - this.f41346b) / (d - d3));
        }

        public LinearTransformation withSlope(double d) {
            Preconditions.checkArgument(!Double.isNaN(d));
            if (DoubleUtils.m68186d(d)) {
                return new RegularLinearTransformation(d, this.f41346b - (this.f41345a * d));
            }
            return new VerticalLinearTransformation(this.f41345a);
        }

        private LinearTransformationBuilder(double d, double d2) {
            this.f41345a = d;
            this.f41346b = d2;
        }
    }

    public static LinearTransformation forNaN() {
        return NaNLinearTransformation.f41347a;
    }

    public static LinearTransformation horizontal(double d) {
        Preconditions.checkArgument(DoubleUtils.m68186d(d));
        return new RegularLinearTransformation(0.0d, d);
    }

    public static LinearTransformationBuilder mapping(double d, double d2) {
        boolean z;
        if (DoubleUtils.m68186d(d) && DoubleUtils.m68186d(d2)) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkArgument(z);
        return new LinearTransformationBuilder(d, d2);
    }

    public static LinearTransformation vertical(double d) {
        Preconditions.checkArgument(DoubleUtils.m68186d(d));
        return new VerticalLinearTransformation(d);
    }

    public abstract LinearTransformation inverse();

    public abstract boolean isHorizontal();

    public abstract boolean isVertical();

    public abstract double slope();

    public abstract double transform(double d);

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes4.dex */
    public static final class VerticalLinearTransformation extends LinearTransformation {

        /* renamed from: a */
        final double f41351a;
        @LazyInit

        /* renamed from: b */
        LinearTransformation f41352b;

        VerticalLinearTransformation(double d) {
            this.f41351a = d;
            this.f41352b = null;
        }

        /* renamed from: a */
        private LinearTransformation m68178a() {
            return new RegularLinearTransformation(0.0d, this.f41351a, this);
        }

        @Override // com.google.common.math.LinearTransformation
        public LinearTransformation inverse() {
            LinearTransformation linearTransformation = this.f41352b;
            if (linearTransformation == null) {
                LinearTransformation m68178a = m68178a();
                this.f41352b = m68178a;
                return m68178a;
            }
            return linearTransformation;
        }

        @Override // com.google.common.math.LinearTransformation
        public boolean isHorizontal() {
            return false;
        }

        @Override // com.google.common.math.LinearTransformation
        public boolean isVertical() {
            return true;
        }

        @Override // com.google.common.math.LinearTransformation
        public double slope() {
            throw new IllegalStateException();
        }

        public String toString() {
            return String.format("x = %g", Double.valueOf(this.f41351a));
        }

        @Override // com.google.common.math.LinearTransformation
        public double transform(double d) {
            throw new IllegalStateException();
        }

        VerticalLinearTransformation(double d, LinearTransformation linearTransformation) {
            this.f41351a = d;
            this.f41352b = linearTransformation;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes4.dex */
    public static final class RegularLinearTransformation extends LinearTransformation {

        /* renamed from: a */
        final double f41348a;

        /* renamed from: b */
        final double f41349b;
        @LazyInit

        /* renamed from: c */
        LinearTransformation f41350c;

        RegularLinearTransformation(double d, double d2) {
            this.f41348a = d;
            this.f41349b = d2;
            this.f41350c = null;
        }

        /* renamed from: a */
        private LinearTransformation m68179a() {
            double d = this.f41348a;
            if (d != 0.0d) {
                return new RegularLinearTransformation(1.0d / d, (this.f41349b * (-1.0d)) / d, this);
            }
            return new VerticalLinearTransformation(this.f41349b, this);
        }

        @Override // com.google.common.math.LinearTransformation
        public LinearTransformation inverse() {
            LinearTransformation linearTransformation = this.f41350c;
            if (linearTransformation == null) {
                LinearTransformation m68179a = m68179a();
                this.f41350c = m68179a;
                return m68179a;
            }
            return linearTransformation;
        }

        @Override // com.google.common.math.LinearTransformation
        public boolean isHorizontal() {
            if (this.f41348a == 0.0d) {
                return true;
            }
            return false;
        }

        @Override // com.google.common.math.LinearTransformation
        public boolean isVertical() {
            return false;
        }

        @Override // com.google.common.math.LinearTransformation
        public double slope() {
            return this.f41348a;
        }

        public String toString() {
            return String.format("y = %g * x + %g", Double.valueOf(this.f41348a), Double.valueOf(this.f41349b));
        }

        @Override // com.google.common.math.LinearTransformation
        public double transform(double d) {
            return (d * this.f41348a) + this.f41349b;
        }

        RegularLinearTransformation(double d, double d2, LinearTransformation linearTransformation) {
            this.f41348a = d;
            this.f41349b = d2;
            this.f41350c = linearTransformation;
        }
    }

    /* loaded from: classes4.dex */
    private static final class NaNLinearTransformation extends LinearTransformation {

        /* renamed from: a */
        static final NaNLinearTransformation f41347a = new NaNLinearTransformation();

        private NaNLinearTransformation() {
        }

        @Override // com.google.common.math.LinearTransformation
        public boolean isHorizontal() {
            return false;
        }

        @Override // com.google.common.math.LinearTransformation
        public boolean isVertical() {
            return false;
        }

        @Override // com.google.common.math.LinearTransformation
        public double slope() {
            return Double.NaN;
        }

        public String toString() {
            return "NaN";
        }

        @Override // com.google.common.math.LinearTransformation
        public double transform(double d) {
            return Double.NaN;
        }

        @Override // com.google.common.math.LinearTransformation
        public LinearTransformation inverse() {
            return this;
        }
    }
}
