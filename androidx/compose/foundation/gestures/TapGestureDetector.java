package androidx.compose.foundation.gestures;

import androidx.compose.p015ui.geometry.Rect;
import androidx.compose.p015ui.unit.Density;
import androidx.compose.p015ui.unit.DpRect;
import androidx.compose.runtime.Stable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* renamed from: androidx.compose.foundation.gestures.PressGestureScope */
/* loaded from: classes.dex */
public interface TapGestureDetector extends Density {

    /* compiled from: TapGestureDetector.kt */
    @Metadata
    /* renamed from: androidx.compose.foundation.gestures.PressGestureScope$DefaultImpls */
    /* loaded from: classes.dex */
    public static final class DefaultImpls {
        @Stable
        @Deprecated
        /* renamed from: roundToPx--R2X_6o  reason: not valid java name */
        public static int m106195roundToPxR2X_6o(@NotNull TapGestureDetector tapGestureDetector, long j) {
            return TapGestureDetector.super.mo106207roundToPxR2X_6o(j);
        }

        @Stable
        @Deprecated
        /* renamed from: roundToPx-0680j_4  reason: not valid java name */
        public static int m106196roundToPx0680j_4(@NotNull TapGestureDetector tapGestureDetector, float f) {
            return TapGestureDetector.super.mo106208roundToPx0680j_4(f);
        }

        @Stable
        @Deprecated
        /* renamed from: toDp-GaN1DYA  reason: not valid java name */
        public static float m106197toDpGaN1DYA(@NotNull TapGestureDetector tapGestureDetector, long j) {
            return TapGestureDetector.super.mo106209toDpGaN1DYA(j);
        }

        @Stable
        @Deprecated
        /* renamed from: toDp-u2uoSUM  reason: not valid java name */
        public static float m106198toDpu2uoSUM(@NotNull TapGestureDetector tapGestureDetector, float f) {
            return TapGestureDetector.super.mo106210toDpu2uoSUM(f);
        }

        @Stable
        @Deprecated
        /* renamed from: toDpSize-k-rfVVM  reason: not valid java name */
        public static long m106200toDpSizekrfVVM(@NotNull TapGestureDetector tapGestureDetector, long j) {
            return TapGestureDetector.super.mo106212toDpSizekrfVVM(j);
        }

        @Stable
        @Deprecated
        /* renamed from: toPx--R2X_6o  reason: not valid java name */
        public static float m106201toPxR2X_6o(@NotNull TapGestureDetector tapGestureDetector, long j) {
            return TapGestureDetector.super.mo106213toPxR2X_6o(j);
        }

        @Stable
        @Deprecated
        /* renamed from: toPx-0680j_4  reason: not valid java name */
        public static float m106202toPx0680j_4(@NotNull TapGestureDetector tapGestureDetector, float f) {
            return TapGestureDetector.super.mo106214toPx0680j_4(f);
        }

        @Stable
        @Deprecated
        @NotNull
        public static Rect toRect(@NotNull TapGestureDetector tapGestureDetector, @NotNull DpRect receiver) {
            Intrinsics.checkNotNullParameter(receiver, "receiver");
            return TapGestureDetector.super.toRect(receiver);
        }

        @Stable
        @Deprecated
        /* renamed from: toSize-XkaWNTQ  reason: not valid java name */
        public static long m106203toSizeXkaWNTQ(@NotNull TapGestureDetector tapGestureDetector, long j) {
            return TapGestureDetector.super.mo106215toSizeXkaWNTQ(j);
        }

        @Stable
        @Deprecated
        /* renamed from: toSp-0xMU5do  reason: not valid java name */
        public static long m106204toSp0xMU5do(@NotNull TapGestureDetector tapGestureDetector, float f) {
            return TapGestureDetector.super.mo106216toSp0xMU5do(f);
        }

        @Stable
        @Deprecated
        /* renamed from: toSp-kPz2Gy4  reason: not valid java name */
        public static long m106205toSpkPz2Gy4(@NotNull TapGestureDetector tapGestureDetector, float f) {
            return TapGestureDetector.super.mo106217toSpkPz2Gy4(f);
        }

        @Stable
        @Deprecated
        /* renamed from: toDp-u2uoSUM  reason: not valid java name */
        public static float m106199toDpu2uoSUM(@NotNull TapGestureDetector tapGestureDetector, int i) {
            return TapGestureDetector.super.mo106211toDpu2uoSUM(i);
        }

        @Stable
        @Deprecated
        /* renamed from: toSp-kPz2Gy4  reason: not valid java name */
        public static long m106206toSpkPz2Gy4(@NotNull TapGestureDetector tapGestureDetector, int i) {
            return TapGestureDetector.super.mo106218toSpkPz2Gy4(i);
        }
    }

    @Nullable
    Object awaitRelease(@NotNull Continuation<? super Unit> continuation);

    @Nullable
    Object tryAwaitRelease(@NotNull Continuation<? super Boolean> continuation);
}
