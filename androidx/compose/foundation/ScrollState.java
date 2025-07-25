package androidx.compose.foundation;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.SpringSpec;
import androidx.compose.foundation.gestures.ScrollExtensions;
import androidx.compose.foundation.gestures.ScrollScope;
import androidx.compose.foundation.gestures.ScrollableState;
import androidx.compose.foundation.gestures.ScrollableStateKt;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sd.C42688d;

/* compiled from: Scroll.kt */
@Stable
@Metadata
/* loaded from: classes.dex */
public final class ScrollState implements ScrollableState {
    @NotNull
    public static final Companion Companion = new Companion(null);
    @NotNull
    private static final Saver<ScrollState, ?> Saver = SaverKt.Saver(ScrollState$Companion$Saver$1.INSTANCE, ScrollState$Companion$Saver$2.INSTANCE);
    private float accumulator;
    @NotNull
    private final SnapshotState value$delegate;
    @NotNull
    private final MutableInteractionSource internalInteractionSource = InteractionSourceKt.MutableInteractionSource();
    @NotNull
    private SnapshotState<Integer> _maxValueState = SnapshotStateKt.mutableStateOf(Integer.MAX_VALUE, SnapshotStateKt.structuralEqualityPolicy());
    @NotNull
    private final ScrollableState scrollableState = ScrollableStateKt.ScrollableState(new ScrollState$scrollableState$1(this));

    /* compiled from: Scroll.kt */
    @Metadata
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final Saver<ScrollState, ?> getSaver() {
            return ScrollState.Saver;
        }
    }

    public ScrollState(int i) {
        this.value$delegate = SnapshotStateKt.mutableStateOf(Integer.valueOf(i), SnapshotStateKt.structuralEqualityPolicy());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object animateScrollTo$default(ScrollState scrollState, int i, AnimationSpec animationSpec, Continuation continuation, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            animationSpec = new SpringSpec(0.0f, 0.0f, null, 7, null);
        }
        return scrollState.animateScrollTo(i, animationSpec, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setValue(int i) {
        this.value$delegate.setValue(Integer.valueOf(i));
    }

    @Nullable
    public final Object animateScrollTo(int i, @NotNull AnimationSpec<Float> animationSpec, @NotNull Continuation<? super Unit> continuation) {
        Object m6959e;
        Object animateScrollBy = ScrollExtensions.animateScrollBy(this, i - getValue(), animationSpec, continuation);
        m6959e = C42688d.m6959e();
        if (animateScrollBy == m6959e) {
            return animateScrollBy;
        }
        return Unit.f99208a;
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public float dispatchRawDelta(float f) {
        return this.scrollableState.dispatchRawDelta(f);
    }

    @NotNull
    public final InteractionSource getInteractionSource() {
        return this.internalInteractionSource;
    }

    @NotNull
    public final MutableInteractionSource getInternalInteractionSource$foundation_release() {
        return this.internalInteractionSource;
    }

    public final int getMaxValue() {
        return this._maxValueState.getValue().intValue();
    }

    public final int getValue() {
        return ((Number) this.value$delegate.getValue()).intValue();
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public boolean isScrollInProgress() {
        return this.scrollableState.isScrollInProgress();
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    @Nullable
    public Object scroll(@NotNull MutatePriority mutatePriority, @NotNull Function2<? super ScrollScope, ? super Continuation<? super Unit>, ? extends Object> function2, @NotNull Continuation<? super Unit> continuation) {
        Object m6959e;
        Object scroll = this.scrollableState.scroll(mutatePriority, function2, continuation);
        m6959e = C42688d.m6959e();
        if (scroll == m6959e) {
            return scroll;
        }
        return Unit.f99208a;
    }

    @Nullable
    public final Object scrollTo(int i, @NotNull Continuation<? super Float> continuation) {
        return ScrollExtensions.scrollBy(this, i - getValue(), continuation);
    }

    public final void setMaxValue$foundation_release(int i) {
        this._maxValueState.setValue(Integer.valueOf(i));
        if (getValue() > i) {
            setValue(i);
        }
    }
}
