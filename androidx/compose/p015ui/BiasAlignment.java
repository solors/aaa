package androidx.compose.p015ui;

import androidx.compose.p015ui.Alignment;
import androidx.compose.p015ui.unit.IntOffsetKt;
import androidx.compose.p015ui.unit.IntSize;
import androidx.compose.p015ui.unit.LayoutDirection;
import androidx.compose.runtime.Immutable;
import be.MathJVM;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Alignment.kt */
@Immutable
@Metadata
/* renamed from: androidx.compose.ui.BiasAlignment */
/* loaded from: classes.dex */
public final class BiasAlignment implements Alignment {
    private final float horizontalBias;
    private final float verticalBias;

    /* compiled from: Alignment.kt */
    @Immutable
    @Metadata
    /* renamed from: androidx.compose.ui.BiasAlignment$Horizontal */
    /* loaded from: classes.dex */
    public static final class Horizontal implements Alignment.Horizontal {
        private final float bias;

        public Horizontal(float f) {
            this.bias = f;
        }

        private final float component1() {
            return this.bias;
        }

        public static /* synthetic */ Horizontal copy$default(Horizontal horizontal, float f, int i, Object obj) {
            if ((i & 1) != 0) {
                f = horizontal.bias;
            }
            return horizontal.copy(f);
        }

        @Override // androidx.compose.p015ui.Alignment.Horizontal
        public int align(int i, int i2, @NotNull LayoutDirection layoutDirection) {
            float f;
            int m103791d;
            Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
            float f2 = (i2 - i) / 2.0f;
            if (layoutDirection == LayoutDirection.Ltr) {
                f = this.bias;
            } else {
                f = (-1) * this.bias;
            }
            m103791d = MathJVM.m103791d(f2 * (1 + f));
            return m103791d;
        }

        @NotNull
        public final Horizontal copy(float f) {
            return new Horizontal(f);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof Horizontal) && Intrinsics.m17075f(Float.valueOf(this.bias), Float.valueOf(((Horizontal) obj).bias))) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return Float.hashCode(this.bias);
        }

        @NotNull
        public String toString() {
            return "Horizontal(bias=" + this.bias + ')';
        }
    }

    /* compiled from: Alignment.kt */
    @Immutable
    @Metadata
    /* renamed from: androidx.compose.ui.BiasAlignment$Vertical */
    /* loaded from: classes.dex */
    public static final class Vertical implements Alignment.Vertical {
        private final float bias;

        public Vertical(float f) {
            this.bias = f;
        }

        private final float component1() {
            return this.bias;
        }

        public static /* synthetic */ Vertical copy$default(Vertical vertical, float f, int i, Object obj) {
            if ((i & 1) != 0) {
                f = vertical.bias;
            }
            return vertical.copy(f);
        }

        @Override // androidx.compose.p015ui.Alignment.Vertical
        public int align(int i, int i2) {
            int m103791d;
            m103791d = MathJVM.m103791d(((i2 - i) / 2.0f) * (1 + this.bias));
            return m103791d;
        }

        @NotNull
        public final Vertical copy(float f) {
            return new Vertical(f);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof Vertical) && Intrinsics.m17075f(Float.valueOf(this.bias), Float.valueOf(((Vertical) obj).bias))) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return Float.hashCode(this.bias);
        }

        @NotNull
        public String toString() {
            return "Vertical(bias=" + this.bias + ')';
        }
    }

    public BiasAlignment(float f, float f2) {
        this.horizontalBias = f;
        this.verticalBias = f2;
    }

    public static /* synthetic */ BiasAlignment copy$default(BiasAlignment biasAlignment, float f, float f2, int i, Object obj) {
        if ((i & 1) != 0) {
            f = biasAlignment.horizontalBias;
        }
        if ((i & 2) != 0) {
            f2 = biasAlignment.verticalBias;
        }
        return biasAlignment.copy(f, f2);
    }

    @Override // androidx.compose.p015ui.Alignment
    /* renamed from: align-KFBX0sM */
    public long mo107199alignKFBX0sM(long j, long j2, @NotNull LayoutDirection layoutDirection) {
        float f;
        int m103791d;
        int m103791d2;
        Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
        float m109894getWidthimpl = (IntSize.m109894getWidthimpl(j2) - IntSize.m109894getWidthimpl(j)) / 2.0f;
        float m109893getHeightimpl = (IntSize.m109893getHeightimpl(j2) - IntSize.m109893getHeightimpl(j)) / 2.0f;
        if (layoutDirection == LayoutDirection.Ltr) {
            f = this.horizontalBias;
        } else {
            f = (-1) * this.horizontalBias;
        }
        float f2 = 1;
        m103791d = MathJVM.m103791d(m109894getWidthimpl * (f + f2));
        m103791d2 = MathJVM.m103791d(m109893getHeightimpl * (f2 + this.verticalBias));
        return IntOffsetKt.IntOffset(m103791d, m103791d2);
    }

    public final float component1() {
        return this.horizontalBias;
    }

    public final float component2() {
        return this.verticalBias;
    }

    @NotNull
    public final BiasAlignment copy(float f, float f2) {
        return new BiasAlignment(f, f2);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BiasAlignment)) {
            return false;
        }
        BiasAlignment biasAlignment = (BiasAlignment) obj;
        if (Intrinsics.m17075f(Float.valueOf(this.horizontalBias), Float.valueOf(biasAlignment.horizontalBias)) && Intrinsics.m17075f(Float.valueOf(this.verticalBias), Float.valueOf(biasAlignment.verticalBias))) {
            return true;
        }
        return false;
    }

    public final float getHorizontalBias() {
        return this.horizontalBias;
    }

    public final float getVerticalBias() {
        return this.verticalBias;
    }

    public int hashCode() {
        return (Float.hashCode(this.horizontalBias) * 31) + Float.hashCode(this.verticalBias);
    }

    @NotNull
    public String toString() {
        return "BiasAlignment(horizontalBias=" + this.horizontalBias + ", verticalBias=" + this.verticalBias + ')';
    }
}
