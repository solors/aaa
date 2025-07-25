package androidx.compose.p015ui.input.pointer;

import androidx.compose.p015ui.geometry.Rect;
import androidx.compose.p015ui.geometry.Size;
import androidx.compose.p015ui.platform.ViewConfiguration;
import androidx.compose.p015ui.unit.Density;
import androidx.compose.p015ui.unit.DpRect;
import androidx.compose.runtime.Stable;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: SuspendingPointerInputFilter.kt */
@Metadata
/* renamed from: androidx.compose.ui.input.pointer.PointerInputScope */
/* loaded from: classes.dex */
public interface PointerInputScope extends Density {

    /* compiled from: SuspendingPointerInputFilter.kt */
    @Metadata
    /* renamed from: androidx.compose.ui.input.pointer.PointerInputScope$DefaultImpls */
    /* loaded from: classes.dex */
    public static final class DefaultImpls {
        @Deprecated
        /* renamed from: getExtendedTouchPadding-NH-jbRc  reason: not valid java name */
        public static long m108930getExtendedTouchPaddingNHjbRc(@NotNull PointerInputScope pointerInputScope) {
            return PointerInputScope.super.mo108928getExtendedTouchPaddingNHjbRc();
        }

        @Deprecated
        public static boolean getInterceptOutOfBoundsChildEvents(@NotNull PointerInputScope pointerInputScope) {
            return PointerInputScope.super.getInterceptOutOfBoundsChildEvents();
        }

        @Stable
        @Deprecated
        /* renamed from: roundToPx--R2X_6o  reason: not valid java name */
        public static int m108931roundToPxR2X_6o(@NotNull PointerInputScope pointerInputScope, long j) {
            return PointerInputScope.super.mo106207roundToPxR2X_6o(j);
        }

        @Stable
        @Deprecated
        /* renamed from: roundToPx-0680j_4  reason: not valid java name */
        public static int m108932roundToPx0680j_4(@NotNull PointerInputScope pointerInputScope, float f) {
            return PointerInputScope.super.mo106208roundToPx0680j_4(f);
        }

        @Deprecated
        public static void setInterceptOutOfBoundsChildEvents(@NotNull PointerInputScope pointerInputScope, boolean z) {
            PointerInputScope.super.setInterceptOutOfBoundsChildEvents(z);
        }

        @Stable
        @Deprecated
        /* renamed from: toDp-GaN1DYA  reason: not valid java name */
        public static float m108933toDpGaN1DYA(@NotNull PointerInputScope pointerInputScope, long j) {
            return PointerInputScope.super.mo106209toDpGaN1DYA(j);
        }

        @Stable
        @Deprecated
        /* renamed from: toDp-u2uoSUM  reason: not valid java name */
        public static float m108934toDpu2uoSUM(@NotNull PointerInputScope pointerInputScope, float f) {
            return PointerInputScope.super.mo106210toDpu2uoSUM(f);
        }

        @Stable
        @Deprecated
        /* renamed from: toDpSize-k-rfVVM  reason: not valid java name */
        public static long m108936toDpSizekrfVVM(@NotNull PointerInputScope pointerInputScope, long j) {
            return PointerInputScope.super.mo106212toDpSizekrfVVM(j);
        }

        @Stable
        @Deprecated
        /* renamed from: toPx--R2X_6o  reason: not valid java name */
        public static float m108937toPxR2X_6o(@NotNull PointerInputScope pointerInputScope, long j) {
            return PointerInputScope.super.mo106213toPxR2X_6o(j);
        }

        @Stable
        @Deprecated
        /* renamed from: toPx-0680j_4  reason: not valid java name */
        public static float m108938toPx0680j_4(@NotNull PointerInputScope pointerInputScope, float f) {
            return PointerInputScope.super.mo106214toPx0680j_4(f);
        }

        @Stable
        @Deprecated
        @NotNull
        public static Rect toRect(@NotNull PointerInputScope pointerInputScope, @NotNull DpRect receiver) {
            Intrinsics.checkNotNullParameter(receiver, "receiver");
            return PointerInputScope.super.toRect(receiver);
        }

        @Stable
        @Deprecated
        /* renamed from: toSize-XkaWNTQ  reason: not valid java name */
        public static long m108939toSizeXkaWNTQ(@NotNull PointerInputScope pointerInputScope, long j) {
            return PointerInputScope.super.mo106215toSizeXkaWNTQ(j);
        }

        @Stable
        @Deprecated
        /* renamed from: toSp-0xMU5do  reason: not valid java name */
        public static long m108940toSp0xMU5do(@NotNull PointerInputScope pointerInputScope, float f) {
            return PointerInputScope.super.mo106216toSp0xMU5do(f);
        }

        @Stable
        @Deprecated
        /* renamed from: toSp-kPz2Gy4  reason: not valid java name */
        public static long m108941toSpkPz2Gy4(@NotNull PointerInputScope pointerInputScope, float f) {
            return PointerInputScope.super.mo106217toSpkPz2Gy4(f);
        }

        @Stable
        @Deprecated
        /* renamed from: toDp-u2uoSUM  reason: not valid java name */
        public static float m108935toDpu2uoSUM(@NotNull PointerInputScope pointerInputScope, int i) {
            return PointerInputScope.super.mo106211toDpu2uoSUM(i);
        }

        @Stable
        @Deprecated
        /* renamed from: toSp-kPz2Gy4  reason: not valid java name */
        public static long m108942toSpkPz2Gy4(@NotNull PointerInputScope pointerInputScope, int i) {
            return PointerInputScope.super.mo106218toSpkPz2Gy4(i);
        }

        public static /* synthetic */ void getInterceptOutOfBoundsChildEvents$annotations() {
        }
    }

    @Nullable
    <R> Object awaitPointerEventScope(@NotNull Function2<? super AwaitPointerEventScope, ? super Continuation<? super R>, ? extends Object> function2, @NotNull Continuation<? super R> continuation);

    /* renamed from: getExtendedTouchPadding-NH-jbRc  reason: not valid java name */
    default long mo108928getExtendedTouchPaddingNHjbRc() {
        return Size.Companion.m107369getZeroNHjbRc();
    }

    default boolean getInterceptOutOfBoundsChildEvents() {
        return false;
    }

    /* renamed from: getSize-YbymL2g  reason: not valid java name */
    long m108929getSizeYbymL2g();

    @NotNull
    ViewConfiguration getViewConfiguration();

    default void setInterceptOutOfBoundsChildEvents(boolean z) {
    }
}
