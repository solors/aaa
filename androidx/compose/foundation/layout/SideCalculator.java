package androidx.compose.foundation.layout;

import android.graphics.Insets;
import androidx.annotation.RequiresApi;
import androidx.compose.foundation.layout.WindowInsetsSides;
import androidx.compose.p015ui.geometry.Offset;
import androidx.compose.p015ui.unit.LayoutDirection;
import androidx.compose.p015ui.unit.Velocity;
import androidx.compose.p015ui.unit.VelocityKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges._Ranges;
import org.jetbrains.annotations.NotNull;

/* compiled from: WindowInsetsConnection.android.kt */
@RequiresApi(30)
@Metadata
/* loaded from: classes.dex */
interface SideCalculator {
    @NotNull
    public static final Companion Companion = Companion.$$INSTANCE;

    /* compiled from: WindowInsetsConnection.android.kt */
    @Metadata
    /* loaded from: classes.dex */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        @NotNull
        private static final SideCalculator$Companion$LeftSideCalculator$1 LeftSideCalculator = new SideCalculator() { // from class: androidx.compose.foundation.layout.SideCalculator$Companion$LeftSideCalculator$1
            @Override // androidx.compose.foundation.layout.SideCalculator
            @NotNull
            public Insets adjustInsets(@NotNull Insets oldInsets, int i) {
                int i2;
                int i3;
                int i4;
                Insets of;
                Intrinsics.checkNotNullParameter(oldInsets, "oldInsets");
                i2 = oldInsets.top;
                i3 = oldInsets.right;
                i4 = oldInsets.bottom;
                of = Insets.of(i, i2, i3, i4);
                Intrinsics.checkNotNullExpressionValue(of, "of(newValue, oldInsets.t….right, oldInsets.bottom)");
                return of;
            }

            @Override // androidx.compose.foundation.layout.SideCalculator
            /* renamed from: consumedOffsets-MK-Hz9U */
            public long mo106341consumedOffsetsMKHz9U(long j) {
                return androidx.compose.p015ui.geometry.OffsetKt.Offset(Offset.m107291getXimpl(j), 0.0f);
            }

            @Override // androidx.compose.foundation.layout.SideCalculator
            /* renamed from: consumedVelocity-QWom1Mo */
            public long mo106342consumedVelocityQWom1Mo(long j, float f) {
                return VelocityKt.Velocity(Velocity.m109959getXimpl(j) - f, 0.0f);
            }

            @Override // androidx.compose.foundation.layout.SideCalculator
            public int valueOf(@NotNull Insets insets) {
                int i;
                Intrinsics.checkNotNullParameter(insets, "insets");
                i = insets.left;
                return i;
            }

            @Override // androidx.compose.foundation.layout.SideCalculator
            public float motionOf(float f, float f2) {
                return f;
            }
        };
        @NotNull
        private static final SideCalculator$Companion$TopSideCalculator$1 TopSideCalculator = new SideCalculator() { // from class: androidx.compose.foundation.layout.SideCalculator$Companion$TopSideCalculator$1
            @Override // androidx.compose.foundation.layout.SideCalculator
            @NotNull
            public Insets adjustInsets(@NotNull Insets oldInsets, int i) {
                int i2;
                int i3;
                int i4;
                Insets of;
                Intrinsics.checkNotNullParameter(oldInsets, "oldInsets");
                i2 = oldInsets.left;
                i3 = oldInsets.right;
                i4 = oldInsets.bottom;
                of = Insets.of(i2, i, i3, i4);
                Intrinsics.checkNotNullExpressionValue(of, "of(oldInsets.left, newVa….right, oldInsets.bottom)");
                return of;
            }

            @Override // androidx.compose.foundation.layout.SideCalculator
            /* renamed from: consumedOffsets-MK-Hz9U */
            public long mo106341consumedOffsetsMKHz9U(long j) {
                return androidx.compose.p015ui.geometry.OffsetKt.Offset(0.0f, Offset.m107292getYimpl(j));
            }

            @Override // androidx.compose.foundation.layout.SideCalculator
            /* renamed from: consumedVelocity-QWom1Mo */
            public long mo106342consumedVelocityQWom1Mo(long j, float f) {
                return VelocityKt.Velocity(0.0f, Velocity.m109960getYimpl(j) - f);
            }

            @Override // androidx.compose.foundation.layout.SideCalculator
            public int valueOf(@NotNull Insets insets) {
                int i;
                Intrinsics.checkNotNullParameter(insets, "insets");
                i = insets.top;
                return i;
            }

            @Override // androidx.compose.foundation.layout.SideCalculator
            public float motionOf(float f, float f2) {
                return f2;
            }
        };
        @NotNull
        private static final SideCalculator$Companion$RightSideCalculator$1 RightSideCalculator = new SideCalculator() { // from class: androidx.compose.foundation.layout.SideCalculator$Companion$RightSideCalculator$1
            @Override // androidx.compose.foundation.layout.SideCalculator
            @NotNull
            public Insets adjustInsets(@NotNull Insets oldInsets, int i) {
                int i2;
                int i3;
                int i4;
                Insets of;
                Intrinsics.checkNotNullParameter(oldInsets, "oldInsets");
                i2 = oldInsets.left;
                i3 = oldInsets.top;
                i4 = oldInsets.bottom;
                of = Insets.of(i2, i3, i, i4);
                Intrinsics.checkNotNullExpressionValue(of, "of(oldInsets.left, oldIn…wValue, oldInsets.bottom)");
                return of;
            }

            @Override // androidx.compose.foundation.layout.SideCalculator
            /* renamed from: consumedOffsets-MK-Hz9U */
            public long mo106341consumedOffsetsMKHz9U(long j) {
                return androidx.compose.p015ui.geometry.OffsetKt.Offset(Offset.m107291getXimpl(j), 0.0f);
            }

            @Override // androidx.compose.foundation.layout.SideCalculator
            /* renamed from: consumedVelocity-QWom1Mo */
            public long mo106342consumedVelocityQWom1Mo(long j, float f) {
                return VelocityKt.Velocity(Velocity.m109959getXimpl(j) + f, 0.0f);
            }

            @Override // androidx.compose.foundation.layout.SideCalculator
            public float motionOf(float f, float f2) {
                return -f;
            }

            @Override // androidx.compose.foundation.layout.SideCalculator
            public int valueOf(@NotNull Insets insets) {
                int i;
                Intrinsics.checkNotNullParameter(insets, "insets");
                i = insets.right;
                return i;
            }
        };
        @NotNull
        private static final SideCalculator$Companion$BottomSideCalculator$1 BottomSideCalculator = new SideCalculator() { // from class: androidx.compose.foundation.layout.SideCalculator$Companion$BottomSideCalculator$1
            @Override // androidx.compose.foundation.layout.SideCalculator
            @NotNull
            public Insets adjustInsets(@NotNull Insets oldInsets, int i) {
                int i2;
                int i3;
                int i4;
                Insets of;
                Intrinsics.checkNotNullParameter(oldInsets, "oldInsets");
                i2 = oldInsets.left;
                i3 = oldInsets.top;
                i4 = oldInsets.right;
                of = Insets.of(i2, i3, i4, i);
                Intrinsics.checkNotNullExpressionValue(of, "of(oldInsets.left, oldIn…ldInsets.right, newValue)");
                return of;
            }

            @Override // androidx.compose.foundation.layout.SideCalculator
            /* renamed from: consumedOffsets-MK-Hz9U */
            public long mo106341consumedOffsetsMKHz9U(long j) {
                return androidx.compose.p015ui.geometry.OffsetKt.Offset(0.0f, Offset.m107292getYimpl(j));
            }

            @Override // androidx.compose.foundation.layout.SideCalculator
            /* renamed from: consumedVelocity-QWom1Mo */
            public long mo106342consumedVelocityQWom1Mo(long j, float f) {
                return VelocityKt.Velocity(0.0f, Velocity.m109960getYimpl(j) + f);
            }

            @Override // androidx.compose.foundation.layout.SideCalculator
            public float motionOf(float f, float f2) {
                return -f2;
            }

            @Override // androidx.compose.foundation.layout.SideCalculator
            public int valueOf(@NotNull Insets insets) {
                int i;
                Intrinsics.checkNotNullParameter(insets, "insets");
                i = insets.bottom;
                return i;
            }
        };

        private Companion() {
        }

        @NotNull
        /* renamed from: chooseCalculator-ni1skBw  reason: not valid java name */
        public final SideCalculator m106343chooseCalculatorni1skBw(int i, @NotNull LayoutDirection layoutDirection) {
            Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
            WindowInsetsSides.Companion companion = WindowInsetsSides.Companion;
            if (WindowInsetsSides.m106386equalsimpl0(i, companion.m106401getLeftJoeWqyM())) {
                return LeftSideCalculator;
            }
            if (WindowInsetsSides.m106386equalsimpl0(i, companion.m106404getTopJoeWqyM())) {
                return TopSideCalculator;
            }
            if (WindowInsetsSides.m106386equalsimpl0(i, companion.m106402getRightJoeWqyM())) {
                return RightSideCalculator;
            }
            if (WindowInsetsSides.m106386equalsimpl0(i, companion.m106398getBottomJoeWqyM())) {
                return BottomSideCalculator;
            }
            if (WindowInsetsSides.m106386equalsimpl0(i, companion.m106403getStartJoeWqyM())) {
                if (layoutDirection == LayoutDirection.Ltr) {
                    return LeftSideCalculator;
                }
                return RightSideCalculator;
            } else if (WindowInsetsSides.m106386equalsimpl0(i, companion.m106399getEndJoeWqyM())) {
                if (layoutDirection == LayoutDirection.Ltr) {
                    return RightSideCalculator;
                }
                return LeftSideCalculator;
            } else {
                throw new IllegalStateException("Only Left, Top, Right, Bottom, Start and End are allowed".toString());
            }
        }
    }

    @NotNull
    Insets adjustInsets(@NotNull Insets insets, int i);

    /* renamed from: consumedOffsets-MK-Hz9U  reason: not valid java name */
    long mo106341consumedOffsetsMKHz9U(long j);

    /* renamed from: consumedVelocity-QWom1Mo  reason: not valid java name */
    long mo106342consumedVelocityQWom1Mo(long j, float f);

    default float hideMotion(float f, float f2) {
        float m16913i;
        m16913i = _Ranges.m16913i(motionOf(f, f2), 0.0f);
        return m16913i;
    }

    float motionOf(float f, float f2);

    default float showMotion(float f, float f2) {
        float m16918d;
        m16918d = _Ranges.m16918d(motionOf(f, f2), 0.0f);
        return m16918d;
    }

    int valueOf(@NotNull Insets insets);
}
