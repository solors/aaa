package androidx.compose.p015ui;

import androidx.compose.p015ui.Alignment;
import androidx.compose.p015ui.unit.IntOffsetKt;
import androidx.compose.p015ui.unit.IntSize;
import androidx.compose.p015ui.unit.IntSizeKt;
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
/* renamed from: androidx.compose.ui.BiasAbsoluteAlignment */
/* loaded from: classes.dex */
public final class BiasAbsoluteAlignment implements Alignment {
    private final float horizontalBias;
    private final float verticalBias;

    /* compiled from: Alignment.kt */
    @Immutable
    @Metadata
    /* renamed from: androidx.compose.ui.BiasAbsoluteAlignment$Horizontal */
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
            int m103791d;
            Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
            m103791d = MathJVM.m103791d(((i2 - i) / 2.0f) * (1 + this.bias));
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

    public BiasAbsoluteAlignment(float f, float f2) {
        this.horizontalBias = f;
        this.verticalBias = f2;
    }

    private final float component1() {
        return this.horizontalBias;
    }

    private final float component2() {
        return this.verticalBias;
    }

    public static /* synthetic */ BiasAbsoluteAlignment copy$default(BiasAbsoluteAlignment biasAbsoluteAlignment, float f, float f2, int i, Object obj) {
        if ((i & 1) != 0) {
            f = biasAbsoluteAlignment.horizontalBias;
        }
        if ((i & 2) != 0) {
            f2 = biasAbsoluteAlignment.verticalBias;
        }
        return biasAbsoluteAlignment.copy(f, f2);
    }

    @Override // androidx.compose.p015ui.Alignment
    /* renamed from: align-KFBX0sM */
    public long mo107199alignKFBX0sM(long j, long j2, @NotNull LayoutDirection layoutDirection) {
        int m103791d;
        int m103791d2;
        Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
        long IntSize = IntSizeKt.IntSize(IntSize.m109894getWidthimpl(j2) - IntSize.m109894getWidthimpl(j), IntSize.m109893getHeightimpl(j2) - IntSize.m109893getHeightimpl(j));
        float f = 1;
        float m109894getWidthimpl = (IntSize.m109894getWidthimpl(IntSize) / 2.0f) * (this.horizontalBias + f);
        float m109893getHeightimpl = (IntSize.m109893getHeightimpl(IntSize) / 2.0f) * (f + this.verticalBias);
        m103791d = MathJVM.m103791d(m109894getWidthimpl);
        m103791d2 = MathJVM.m103791d(m109893getHeightimpl);
        return IntOffsetKt.IntOffset(m103791d, m103791d2);
    }

    @NotNull
    public final BiasAbsoluteAlignment copy(float f, float f2) {
        return new BiasAbsoluteAlignment(f, f2);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BiasAbsoluteAlignment)) {
            return false;
        }
        BiasAbsoluteAlignment biasAbsoluteAlignment = (BiasAbsoluteAlignment) obj;
        if (Intrinsics.m17075f(Float.valueOf(this.horizontalBias), Float.valueOf(biasAbsoluteAlignment.horizontalBias)) && Intrinsics.m17075f(Float.valueOf(this.verticalBias), Float.valueOf(biasAbsoluteAlignment.verticalBias))) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (Float.hashCode(this.horizontalBias) * 31) + Float.hashCode(this.verticalBias);
    }

    @NotNull
    public String toString() {
        return "BiasAbsoluteAlignment(horizontalBias=" + this.horizontalBias + ", verticalBias=" + this.verticalBias + ')';
    }
}
