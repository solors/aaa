package androidx.compose.foundation.gestures;

import androidx.compose.foundation.Overscroll;
import androidx.compose.p015ui.geometry.Offset;
import androidx.compose.p015ui.geometry.OffsetKt;
import androidx.compose.p015ui.input.nestedscroll.NestedScrollDispatcher;
import androidx.compose.p015ui.unit.Velocity;
import androidx.compose.p015ui.unit.VelocityKt;
import androidx.compose.runtime.State;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Scrollable.kt */
@Metadata
/* loaded from: classes.dex */
public final class ScrollingLogic {
    @NotNull
    private final FlingBehavior flingBehavior;
    @NotNull
    private final State<NestedScrollDispatcher> nestedScrollDispatcher;
    @NotNull
    private final Orientation orientation;
    @Nullable
    private final Overscroll overscrollEffect;
    private final boolean reverseDirection;
    @NotNull
    private final ScrollableState scrollableState;

    public ScrollingLogic(@NotNull Orientation orientation, boolean z, @NotNull State<NestedScrollDispatcher> nestedScrollDispatcher, @NotNull ScrollableState scrollableState, @NotNull FlingBehavior flingBehavior, @Nullable Overscroll overscroll) {
        Intrinsics.checkNotNullParameter(orientation, "orientation");
        Intrinsics.checkNotNullParameter(nestedScrollDispatcher, "nestedScrollDispatcher");
        Intrinsics.checkNotNullParameter(scrollableState, "scrollableState");
        Intrinsics.checkNotNullParameter(flingBehavior, "flingBehavior");
        this.orientation = orientation;
        this.reverseDirection = z;
        this.nestedScrollDispatcher = nestedScrollDispatcher;
        this.scrollableState = scrollableState;
        this.flingBehavior = flingBehavior;
        this.overscrollEffect = overscroll;
    }

    /* renamed from: dispatchScroll-f0eR0lY  reason: not valid java name */
    public final long m106221dispatchScrollf0eR0lY(@NotNull ScrollScope dispatchScroll, long j, @Nullable Offset offset, int i) {
        long m107307getZeroF1C5BW0;
        Intrinsics.checkNotNullParameter(dispatchScroll, "$this$dispatchScroll");
        Overscroll overscroll = this.overscrollEffect;
        if (overscroll != null && overscroll.isEnabled()) {
            m107307getZeroF1C5BW0 = this.overscrollEffect.mo106067consumePreScrollA0NYTsA(j, offset, i);
        } else {
            m107307getZeroF1C5BW0 = Offset.Companion.m107307getZeroF1C5BW0();
        }
        long m107295minusMKHz9U = Offset.m107295minusMKHz9U(j, m107307getZeroF1C5BW0);
        NestedScrollDispatcher value = this.nestedScrollDispatcher.getValue();
        long m107295minusMKHz9U2 = Offset.m107295minusMKHz9U(m107295minusMKHz9U, value.m108785dispatchPreScrollOzD1aCk(m107295minusMKHz9U, i));
        long m106224reverseIfNeededMKHz9U = m106224reverseIfNeededMKHz9U(m106227toOffsettuRUvjQ(dispatchScroll.scrollBy(m106226toFloatk4lQ0M(m106224reverseIfNeededMKHz9U(m107295minusMKHz9U2)))));
        long m107295minusMKHz9U3 = Offset.m107295minusMKHz9U(m107295minusMKHz9U2, m106224reverseIfNeededMKHz9U);
        long m108783dispatchPostScrollDzOQY0M = value.m108783dispatchPostScrollDzOQY0M(m106224reverseIfNeededMKHz9U, m107295minusMKHz9U3, i);
        Overscroll overscroll2 = this.overscrollEffect;
        if (overscroll2 != null && overscroll2.isEnabled()) {
            this.overscrollEffect.mo106065consumePostScrolll7mfB5k(m107295minusMKHz9U2, Offset.m107295minusMKHz9U(m107295minusMKHz9U3, m108783dispatchPostScrollDzOQY0M), offset, i);
        }
        return m107295minusMKHz9U3;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0036  */
    @org.jetbrains.annotations.Nullable
    /* renamed from: doFlingAnimation-QWom1Mo  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m106222doFlingAnimationQWom1Mo(long r13, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super androidx.compose.p015ui.unit.Velocity> r15) {
        /*
            r12 = this;
            boolean r0 = r15 instanceof androidx.compose.foundation.gestures.ScrollingLogic$doFlingAnimation$1
            if (r0 == 0) goto L13
            r0 = r15
            androidx.compose.foundation.gestures.ScrollingLogic$doFlingAnimation$1 r0 = (androidx.compose.foundation.gestures.ScrollingLogic$doFlingAnimation$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.foundation.gestures.ScrollingLogic$doFlingAnimation$1 r0 = new androidx.compose.foundation.gestures.ScrollingLogic$doFlingAnimation$1
            r0.<init>(r12, r15)
        L18:
            r4 = r0
            java.lang.Object r15 = r4.result
            java.lang.Object r0 = sd.C42683b.m6964e()
            int r1 = r4.label
            r2 = 1
            if (r1 == 0) goto L36
            if (r1 != r2) goto L2e
            java.lang.Object r13 = r4.L$0
            kotlin.jvm.internal.m0 r13 = (kotlin.jvm.internal.C37608m0) r13
            p804nd.C38508r.m14539b(r15)
            goto L5d
        L2e:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L36:
            p804nd.C38508r.m14539b(r15)
            kotlin.jvm.internal.m0 r15 = new kotlin.jvm.internal.m0
            r15.<init>()
            r15.f99326b = r13
            androidx.compose.foundation.gestures.ScrollableState r1 = r12.scrollableState
            r3 = 0
            androidx.compose.foundation.gestures.ScrollingLogic$doFlingAnimation$2 r11 = new androidx.compose.foundation.gestures.ScrollingLogic$doFlingAnimation$2
            r10 = 0
            r5 = r11
            r6 = r12
            r7 = r15
            r8 = r13
            r5.<init>(r6, r7, r8, r10)
            r5 = 1
            r6 = 0
            r4.L$0 = r15
            r4.label = r2
            r2 = r3
            r3 = r11
            java.lang.Object r13 = androidx.compose.foundation.gestures.ScrollableState.scroll$default(r1, r2, r3, r4, r5, r6)
            if (r13 != r0) goto L5c
            return r0
        L5c:
            r13 = r15
        L5d:
            long r13 = r13.f99326b
            androidx.compose.ui.unit.Velocity r13 = androidx.compose.p015ui.unit.Velocity.m109950boximpl(r13)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.ScrollingLogic.m106222doFlingAnimationQWom1Mo(long, kotlin.coroutines.d):java.lang.Object");
    }

    @NotNull
    public final FlingBehavior getFlingBehavior() {
        return this.flingBehavior;
    }

    @NotNull
    public final State<NestedScrollDispatcher> getNestedScrollDispatcher() {
        return this.nestedScrollDispatcher;
    }

    @NotNull
    public final Orientation getOrientation() {
        return this.orientation;
    }

    @Nullable
    public final Overscroll getOverscrollEffect() {
        return this.overscrollEffect;
    }

    public final boolean getReverseDirection() {
        return this.reverseDirection;
    }

    @NotNull
    public final ScrollableState getScrollableState() {
        return this.scrollableState;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00be A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00d6 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00fa A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00fb  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object onDragStopped(float r13, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super kotlin.Unit> r14) {
        /*
            Method dump skipped, instructions count: 299
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.ScrollingLogic.onDragStopped(float, kotlin.coroutines.d):java.lang.Object");
    }

    /* renamed from: performRawScroll-MK-Hz9U  reason: not valid java name */
    public final long m106223performRawScrollMKHz9U(long j) {
        if (this.scrollableState.isScrollInProgress()) {
            return Offset.Companion.m107307getZeroF1C5BW0();
        }
        return m106227toOffsettuRUvjQ(reverseIfNeeded(this.scrollableState.dispatchRawDelta(reverseIfNeeded(m106226toFloatk4lQ0M(j)))));
    }

    public final float reverseIfNeeded(float f) {
        if (this.reverseDirection) {
            return f * (-1);
        }
        return f;
    }

    /* renamed from: reverseIfNeeded-MK-Hz9U  reason: not valid java name */
    public final long m106224reverseIfNeededMKHz9U(long j) {
        if (this.reverseDirection) {
            return Offset.m107298timestuRUvjQ(j, -1.0f);
        }
        return j;
    }

    public final boolean shouldScrollImmediately() {
        boolean z;
        if (!this.scrollableState.isScrollInProgress()) {
            Overscroll overscroll = this.overscrollEffect;
            if (overscroll != null) {
                z = overscroll.isInProgress();
            } else {
                z = false;
            }
            if (!z) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: toFloat-TH1AsA0  reason: not valid java name */
    public final float m106225toFloatTH1AsA0(long j) {
        if (this.orientation == Orientation.Horizontal) {
            return Velocity.m109959getXimpl(j);
        }
        return Velocity.m109960getYimpl(j);
    }

    /* renamed from: toFloat-k-4lQ0M  reason: not valid java name */
    public final float m106226toFloatk4lQ0M(long j) {
        if (this.orientation == Orientation.Horizontal) {
            return Offset.m107291getXimpl(j);
        }
        return Offset.m107292getYimpl(j);
    }

    /* renamed from: toOffset-tuRUvjQ  reason: not valid java name */
    public final long m106227toOffsettuRUvjQ(float f) {
        boolean z;
        if (f == 0.0f) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return Offset.Companion.m107307getZeroF1C5BW0();
        }
        if (this.orientation == Orientation.Horizontal) {
            return OffsetKt.Offset(f, 0.0f);
        }
        return OffsetKt.Offset(0.0f, f);
    }

    /* renamed from: toVelocity-adjELrA  reason: not valid java name */
    public final long m106228toVelocityadjELrA(float f) {
        if (this.orientation == Orientation.Horizontal) {
            return VelocityKt.Velocity(f, 0.0f);
        }
        return VelocityKt.Velocity(0.0f, f);
    }

    /* renamed from: update-QWom1Mo  reason: not valid java name */
    public final long m106229updateQWom1Mo(long j, float f) {
        if (this.orientation == Orientation.Horizontal) {
            return Velocity.m109955copyOhffZ5M$default(j, f, 0.0f, 2, null);
        }
        return Velocity.m109955copyOhffZ5M$default(j, 0.0f, f, 1, null);
    }
}
