package androidx.compose.p015ui.unit;

import androidx.compose.p015ui.geometry.Rect;
import androidx.compose.p015ui.geometry.Size;
import androidx.compose.p015ui.geometry.SizeKt;
import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import be.MathJVM;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: Density.kt */
@Immutable
@Metadata
/* renamed from: androidx.compose.ui.unit.Density */
/* loaded from: classes.dex */
public interface Density {

    /* compiled from: Density.kt */
    @Metadata
    /* renamed from: androidx.compose.ui.unit.Density$DefaultImpls */
    /* loaded from: classes.dex */
    public static final class DefaultImpls {
        @Stable
        @Deprecated
        /* renamed from: roundToPx--R2X_6o  reason: not valid java name */
        public static int m109720roundToPxR2X_6o(@NotNull Density density, long j) {
            return Density.super.mo106207roundToPxR2X_6o(j);
        }

        @Stable
        @Deprecated
        /* renamed from: roundToPx-0680j_4  reason: not valid java name */
        public static int m109721roundToPx0680j_4(@NotNull Density density, float f) {
            return Density.super.mo106208roundToPx0680j_4(f);
        }

        @Stable
        @Deprecated
        /* renamed from: toDp-GaN1DYA  reason: not valid java name */
        public static float m109722toDpGaN1DYA(@NotNull Density density, long j) {
            return Density.super.mo106209toDpGaN1DYA(j);
        }

        @Stable
        @Deprecated
        /* renamed from: toDp-u2uoSUM  reason: not valid java name */
        public static float m109724toDpu2uoSUM(@NotNull Density density, int i) {
            return Density.super.mo106211toDpu2uoSUM(i);
        }

        @Stable
        @Deprecated
        /* renamed from: toDpSize-k-rfVVM  reason: not valid java name */
        public static long m109725toDpSizekrfVVM(@NotNull Density density, long j) {
            return Density.super.mo106212toDpSizekrfVVM(j);
        }

        @Stable
        @Deprecated
        /* renamed from: toPx--R2X_6o  reason: not valid java name */
        public static float m109726toPxR2X_6o(@NotNull Density density, long j) {
            return Density.super.mo106213toPxR2X_6o(j);
        }

        @Stable
        @Deprecated
        /* renamed from: toPx-0680j_4  reason: not valid java name */
        public static float m109727toPx0680j_4(@NotNull Density density, float f) {
            return Density.super.mo106214toPx0680j_4(f);
        }

        @Stable
        @Deprecated
        @NotNull
        public static Rect toRect(@NotNull Density density, @NotNull DpRect receiver) {
            Intrinsics.checkNotNullParameter(receiver, "receiver");
            return Density.super.toRect(receiver);
        }

        @Stable
        @Deprecated
        /* renamed from: toSize-XkaWNTQ  reason: not valid java name */
        public static long m109728toSizeXkaWNTQ(@NotNull Density density, long j) {
            return Density.super.mo106215toSizeXkaWNTQ(j);
        }

        @Stable
        @Deprecated
        /* renamed from: toSp-0xMU5do  reason: not valid java name */
        public static long m109729toSp0xMU5do(@NotNull Density density, float f) {
            return Density.super.mo106216toSp0xMU5do(f);
        }

        @Stable
        @Deprecated
        /* renamed from: toSp-kPz2Gy4  reason: not valid java name */
        public static long m109731toSpkPz2Gy4(@NotNull Density density, int i) {
            return Density.super.mo106218toSpkPz2Gy4(i);
        }

        @Stable
        @Deprecated
        /* renamed from: toDp-u2uoSUM  reason: not valid java name */
        public static float m109723toDpu2uoSUM(@NotNull Density density, float f) {
            return Density.super.mo106210toDpu2uoSUM(f);
        }

        @Stable
        @Deprecated
        /* renamed from: toSp-kPz2Gy4  reason: not valid java name */
        public static long m109730toSpkPz2Gy4(@NotNull Density density, float f) {
            return Density.super.mo106217toSpkPz2Gy4(f);
        }

        @Stable
        public static /* synthetic */ void getDensity$annotations() {
        }

        @Stable
        public static /* synthetic */ void getFontScale$annotations() {
        }
    }

    float getDensity();

    float getFontScale();

    @Stable
    /* renamed from: roundToPx--R2X_6o */
    default int mo106207roundToPxR2X_6o(long j) {
        int m103791d;
        m103791d = MathJVM.m103791d(mo106213toPxR2X_6o(j));
        return m103791d;
    }

    @Stable
    /* renamed from: roundToPx-0680j_4 */
    default int mo106208roundToPx0680j_4(float f) {
        int m103791d;
        float mo106214toPx0680j_4 = mo106214toPx0680j_4(f);
        if (!Float.isInfinite(mo106214toPx0680j_4)) {
            m103791d = MathJVM.m103791d(mo106214toPx0680j_4);
            return m103791d;
        }
        return Integer.MAX_VALUE;
    }

    @Stable
    /* renamed from: toDp-GaN1DYA */
    default float mo106209toDpGaN1DYA(long j) {
        if (TextUnitType.m109943equalsimpl0(TextUnit.m109914getTypeUIouoOA(j), TextUnitType.Companion.m109948getSpUIouoOA())) {
            return C1059Dp.m109734constructorimpl(TextUnit.m109915getValueimpl(j) * getFontScale());
        }
        throw new IllegalStateException("Only Sp can convert to Px".toString());
    }

    @Stable
    /* renamed from: toDp-u2uoSUM */
    default float mo106211toDpu2uoSUM(int i) {
        return C1059Dp.m109734constructorimpl(i / getDensity());
    }

    @Stable
    /* renamed from: toDpSize-k-rfVVM */
    default long mo106212toDpSizekrfVVM(long j) {
        boolean z;
        if (j != Size.Companion.m107368getUnspecifiedNHjbRc()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return DpKt.m109756DpSizeYgX7TsA(mo106210toDpu2uoSUM(Size.m107360getWidthimpl(j)), mo106210toDpu2uoSUM(Size.m107357getHeightimpl(j)));
        }
        return DpSize.Companion.m109841getUnspecifiedMYxV2XQ();
    }

    @Stable
    /* renamed from: toPx--R2X_6o */
    default float mo106213toPxR2X_6o(long j) {
        if (TextUnitType.m109943equalsimpl0(TextUnit.m109914getTypeUIouoOA(j), TextUnitType.Companion.m109948getSpUIouoOA())) {
            return TextUnit.m109915getValueimpl(j) * getFontScale() * getDensity();
        }
        throw new IllegalStateException("Only Sp can convert to Px".toString());
    }

    @Stable
    /* renamed from: toPx-0680j_4 */
    default float mo106214toPx0680j_4(float f) {
        return f * getDensity();
    }

    @Stable
    @NotNull
    default Rect toRect(@NotNull DpRect dpRect) {
        Intrinsics.checkNotNullParameter(dpRect, "<this>");
        return new Rect(mo106214toPx0680j_4(dpRect.m109817getLeftD9Ej5fM()), mo106214toPx0680j_4(dpRect.m109819getTopD9Ej5fM()), mo106214toPx0680j_4(dpRect.m109818getRightD9Ej5fM()), mo106214toPx0680j_4(dpRect.m109816getBottomD9Ej5fM()));
    }

    @Stable
    /* renamed from: toSize-XkaWNTQ */
    default long mo106215toSizeXkaWNTQ(long j) {
        boolean z;
        if (j != DpSize.Companion.m109841getUnspecifiedMYxV2XQ()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return SizeKt.Size(mo106214toPx0680j_4(DpSize.m109832getWidthD9Ej5fM(j)), mo106214toPx0680j_4(DpSize.m109830getHeightD9Ej5fM(j)));
        }
        return Size.Companion.m107368getUnspecifiedNHjbRc();
    }

    @Stable
    /* renamed from: toSp-0xMU5do */
    default long mo106216toSp0xMU5do(float f) {
        return TextUnitKt.getSp(f / getFontScale());
    }

    @Stable
    /* renamed from: toSp-kPz2Gy4 */
    default long mo106218toSpkPz2Gy4(int i) {
        return TextUnitKt.getSp(i / (getFontScale() * getDensity()));
    }

    @Stable
    /* renamed from: toSp-kPz2Gy4 */
    default long mo106217toSpkPz2Gy4(float f) {
        return TextUnitKt.getSp(f / (getFontScale() * getDensity()));
    }

    @Stable
    /* renamed from: toDp-u2uoSUM */
    default float mo106210toDpu2uoSUM(float f) {
        return C1059Dp.m109734constructorimpl(f / getDensity());
    }
}
