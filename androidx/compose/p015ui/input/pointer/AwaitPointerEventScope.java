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
/* renamed from: androidx.compose.ui.input.pointer.AwaitPointerEventScope */
/* loaded from: classes.dex */
public interface AwaitPointerEventScope extends Density {

    /* compiled from: SuspendingPointerInputFilter.kt */
    @Metadata
    /* renamed from: androidx.compose.ui.input.pointer.AwaitPointerEventScope$DefaultImpls */
    /* loaded from: classes.dex */
    public static final class DefaultImpls {
        @Deprecated
        /* renamed from: getExtendedTouchPadding-NH-jbRc  reason: not valid java name */
        public static long m108812getExtendedTouchPaddingNHjbRc(@NotNull AwaitPointerEventScope awaitPointerEventScope) {
            return AwaitPointerEventScope.super.mo108810getExtendedTouchPaddingNHjbRc();
        }

        @Stable
        @Deprecated
        /* renamed from: roundToPx--R2X_6o  reason: not valid java name */
        public static int m108813roundToPxR2X_6o(@NotNull AwaitPointerEventScope awaitPointerEventScope, long j) {
            return AwaitPointerEventScope.super.mo106207roundToPxR2X_6o(j);
        }

        @Stable
        @Deprecated
        /* renamed from: roundToPx-0680j_4  reason: not valid java name */
        public static int m108814roundToPx0680j_4(@NotNull AwaitPointerEventScope awaitPointerEventScope, float f) {
            return AwaitPointerEventScope.super.mo106208roundToPx0680j_4(f);
        }

        @Stable
        @Deprecated
        /* renamed from: toDp-GaN1DYA  reason: not valid java name */
        public static float m108815toDpGaN1DYA(@NotNull AwaitPointerEventScope awaitPointerEventScope, long j) {
            return AwaitPointerEventScope.super.mo106209toDpGaN1DYA(j);
        }

        @Stable
        @Deprecated
        /* renamed from: toDp-u2uoSUM  reason: not valid java name */
        public static float m108816toDpu2uoSUM(@NotNull AwaitPointerEventScope awaitPointerEventScope, float f) {
            return AwaitPointerEventScope.super.mo106210toDpu2uoSUM(f);
        }

        @Stable
        @Deprecated
        /* renamed from: toDpSize-k-rfVVM  reason: not valid java name */
        public static long m108818toDpSizekrfVVM(@NotNull AwaitPointerEventScope awaitPointerEventScope, long j) {
            return AwaitPointerEventScope.super.mo106212toDpSizekrfVVM(j);
        }

        @Stable
        @Deprecated
        /* renamed from: toPx--R2X_6o  reason: not valid java name */
        public static float m108819toPxR2X_6o(@NotNull AwaitPointerEventScope awaitPointerEventScope, long j) {
            return AwaitPointerEventScope.super.mo106213toPxR2X_6o(j);
        }

        @Stable
        @Deprecated
        /* renamed from: toPx-0680j_4  reason: not valid java name */
        public static float m108820toPx0680j_4(@NotNull AwaitPointerEventScope awaitPointerEventScope, float f) {
            return AwaitPointerEventScope.super.mo106214toPx0680j_4(f);
        }

        @Stable
        @Deprecated
        @NotNull
        public static Rect toRect(@NotNull AwaitPointerEventScope awaitPointerEventScope, @NotNull DpRect receiver) {
            Intrinsics.checkNotNullParameter(receiver, "receiver");
            return AwaitPointerEventScope.super.toRect(receiver);
        }

        @Stable
        @Deprecated
        /* renamed from: toSize-XkaWNTQ  reason: not valid java name */
        public static long m108821toSizeXkaWNTQ(@NotNull AwaitPointerEventScope awaitPointerEventScope, long j) {
            return AwaitPointerEventScope.super.mo106215toSizeXkaWNTQ(j);
        }

        @Stable
        @Deprecated
        /* renamed from: toSp-0xMU5do  reason: not valid java name */
        public static long m108822toSp0xMU5do(@NotNull AwaitPointerEventScope awaitPointerEventScope, float f) {
            return AwaitPointerEventScope.super.mo106216toSp0xMU5do(f);
        }

        @Stable
        @Deprecated
        /* renamed from: toSp-kPz2Gy4  reason: not valid java name */
        public static long m108823toSpkPz2Gy4(@NotNull AwaitPointerEventScope awaitPointerEventScope, float f) {
            return AwaitPointerEventScope.super.mo106217toSpkPz2Gy4(f);
        }

        @Deprecated
        @Nullable
        public static <T> Object withTimeout(@NotNull AwaitPointerEventScope awaitPointerEventScope, long j, @NotNull Function2<? super AwaitPointerEventScope, ? super Continuation<? super T>, ? extends Object> function2, @NotNull Continuation<? super T> continuation) {
            return AwaitPointerEventScope.super.withTimeout(j, function2, continuation);
        }

        @Deprecated
        @Nullable
        public static <T> Object withTimeoutOrNull(@NotNull AwaitPointerEventScope awaitPointerEventScope, long j, @NotNull Function2<? super AwaitPointerEventScope, ? super Continuation<? super T>, ? extends Object> function2, @NotNull Continuation<? super T> continuation) {
            return AwaitPointerEventScope.super.withTimeoutOrNull(j, function2, continuation);
        }

        @Stable
        @Deprecated
        /* renamed from: toDp-u2uoSUM  reason: not valid java name */
        public static float m108817toDpu2uoSUM(@NotNull AwaitPointerEventScope awaitPointerEventScope, int i) {
            return AwaitPointerEventScope.super.mo106211toDpu2uoSUM(i);
        }

        @Stable
        @Deprecated
        /* renamed from: toSp-kPz2Gy4  reason: not valid java name */
        public static long m108824toSpkPz2Gy4(@NotNull AwaitPointerEventScope awaitPointerEventScope, int i) {
            return AwaitPointerEventScope.super.mo106218toSpkPz2Gy4(i);
        }
    }

    static /* synthetic */ Object awaitPointerEvent$default(AwaitPointerEventScope awaitPointerEventScope, PointerEventPass pointerEventPass, Continuation continuation, int i, Object obj) {
        if (obj == null) {
            if ((i & 1) != 0) {
                pointerEventPass = PointerEventPass.Main;
            }
            return awaitPointerEventScope.awaitPointerEvent(pointerEventPass, continuation);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: awaitPointerEvent");
    }

    static /* synthetic */ Object withTimeout$suspendImpl(AwaitPointerEventScope awaitPointerEventScope, long j, Function2 function2, Continuation continuation) {
        return function2.mo105910invoke(awaitPointerEventScope, continuation);
    }

    static /* synthetic */ Object withTimeoutOrNull$suspendImpl(AwaitPointerEventScope awaitPointerEventScope, long j, Function2 function2, Continuation continuation) {
        return function2.mo105910invoke(awaitPointerEventScope, continuation);
    }

    @Nullable
    Object awaitPointerEvent(@NotNull PointerEventPass pointerEventPass, @NotNull Continuation<? super PointerEvent> continuation);

    @NotNull
    PointerEvent getCurrentEvent();

    /* renamed from: getExtendedTouchPadding-NH-jbRc  reason: not valid java name */
    default long mo108810getExtendedTouchPaddingNHjbRc() {
        return Size.Companion.m107369getZeroNHjbRc();
    }

    /* renamed from: getSize-YbymL2g  reason: not valid java name */
    long mo108811getSizeYbymL2g();

    @NotNull
    ViewConfiguration getViewConfiguration();

    @Nullable
    default <T> Object withTimeout(long j, @NotNull Function2<? super AwaitPointerEventScope, ? super Continuation<? super T>, ? extends Object> function2, @NotNull Continuation<? super T> continuation) {
        return withTimeout$suspendImpl(this, j, function2, continuation);
    }

    @Nullable
    default <T> Object withTimeoutOrNull(long j, @NotNull Function2<? super AwaitPointerEventScope, ? super Continuation<? super T>, ? extends Object> function2, @NotNull Continuation<? super T> continuation) {
        return withTimeoutOrNull$suspendImpl(this, j, function2, continuation);
    }
}
