package androidx.compose.animation.core;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: InfiniteTransition.kt */
@StabilityInferred(parameters = 0)
@Metadata
/* loaded from: classes.dex */
public final class InfiniteTransition {
    public static final int $stable = 8;
    @NotNull
    private final MutableVector<TransitionAnimationState<?, ?>> animations = new MutableVector<>(new TransitionAnimationState[16], 0);
    @NotNull
    private final SnapshotState isRunning$delegate;
    @NotNull
    private final SnapshotState refreshChildNeeded$delegate;
    private long startTimeNanos;

    /* compiled from: InfiniteTransition.kt */
    @Metadata
    /* loaded from: classes.dex */
    public final class TransitionAnimationState<T, V extends AnimationVectors> implements State<T> {
        @NotNull
        private TargetBasedAnimation<T, V> animation;
        @NotNull
        private AnimationSpec<T> animationSpec;
        private T initialValue;
        private boolean isFinished;
        private long playTimeNanosOffset;
        private boolean startOnTheNextFrame;
        private T targetValue;
        final /* synthetic */ InfiniteTransition this$0;
        @NotNull
        private final VectorConverters<T, V> typeConverter;
        @NotNull
        private final SnapshotState value$delegate;

        public TransitionAnimationState(InfiniteTransition infiniteTransition, T t, @NotNull T t2, @NotNull VectorConverters<T, V> typeConverter, AnimationSpec<T> animationSpec) {
            SnapshotState mutableStateOf$default;
            Intrinsics.checkNotNullParameter(typeConverter, "typeConverter");
            Intrinsics.checkNotNullParameter(animationSpec, "animationSpec");
            this.this$0 = infiniteTransition;
            this.initialValue = t;
            this.targetValue = t2;
            this.typeConverter = typeConverter;
            this.animationSpec = animationSpec;
            mutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(t, null, 2, null);
            this.value$delegate = mutableStateOf$default;
            this.animation = new TargetBasedAnimation<>(this.animationSpec, typeConverter, this.initialValue, this.targetValue, (AnimationVectors) null, 16, (DefaultConstructorMarker) null);
        }

        @NotNull
        public final TargetBasedAnimation<T, V> getAnimation() {
            return this.animation;
        }

        @NotNull
        public final AnimationSpec<T> getAnimationSpec() {
            return this.animationSpec;
        }

        public final T getInitialValue() {
            return this.initialValue;
        }

        public final long getPlayTimeNanosOffset() {
            return this.playTimeNanosOffset;
        }

        public final boolean getStartOnTheNextFrame() {
            return this.startOnTheNextFrame;
        }

        public final T getTargetValue() {
            return this.targetValue;
        }

        @NotNull
        public final VectorConverters<T, V> getTypeConverter() {
            return this.typeConverter;
        }

        @Override // androidx.compose.runtime.State
        public T getValue() {
            return this.value$delegate.getValue();
        }

        public final boolean isFinished() {
            return this.isFinished;
        }

        public final void onPlayTimeChanged(long j) {
            this.this$0.setRefreshChildNeeded(false);
            if (this.startOnTheNextFrame) {
                this.startOnTheNextFrame = false;
                this.playTimeNanosOffset = j;
            }
            long j2 = j - this.playTimeNanosOffset;
            setValue$animation_core_release(this.animation.getValueFromNanos(j2));
            this.isFinished = this.animation.isFinishedFromNanos(j2);
        }

        public final void reset() {
            this.startOnTheNextFrame = true;
        }

        public final void setAnimation(@NotNull TargetBasedAnimation<T, V> targetBasedAnimation) {
            Intrinsics.checkNotNullParameter(targetBasedAnimation, "<set-?>");
            this.animation = targetBasedAnimation;
        }

        public final void setAnimationSpec(@NotNull AnimationSpec<T> animationSpec) {
            Intrinsics.checkNotNullParameter(animationSpec, "<set-?>");
            this.animationSpec = animationSpec;
        }

        public final void setFinished(boolean z) {
            this.isFinished = z;
        }

        public final void setInitialValue(T t) {
            this.initialValue = t;
        }

        public final void setPlayTimeNanosOffset(long j) {
            this.playTimeNanosOffset = j;
        }

        public final void setStartOnTheNextFrame(boolean z) {
            this.startOnTheNextFrame = z;
        }

        public final void setTargetValue(T t) {
            this.targetValue = t;
        }

        public void setValue$animation_core_release(T t) {
            this.value$delegate.setValue(t);
        }

        public final void skipToEnd() {
            setValue$animation_core_release(this.animation.getTargetValue());
            this.startOnTheNextFrame = true;
        }

        public final void updateValues(T t, T t2, @NotNull AnimationSpec<T> animationSpec) {
            Intrinsics.checkNotNullParameter(animationSpec, "animationSpec");
            this.initialValue = t;
            this.targetValue = t2;
            this.animationSpec = animationSpec;
            this.animation = new TargetBasedAnimation<>(animationSpec, this.typeConverter, t, t2, (AnimationVectors) null, 16, (DefaultConstructorMarker) null);
            this.this$0.setRefreshChildNeeded(true);
            this.isFinished = false;
            this.startOnTheNextFrame = true;
        }
    }

    public InfiniteTransition() {
        SnapshotState mutableStateOf$default;
        SnapshotState mutableStateOf$default2;
        mutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
        this.refreshChildNeeded$delegate = mutableStateOf$default;
        this.startTimeNanos = Long.MIN_VALUE;
        mutableStateOf$default2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.TRUE, null, 2, null);
        this.isRunning$delegate = mutableStateOf$default2;
    }

    private final boolean getRefreshChildNeeded() {
        return ((Boolean) this.refreshChildNeeded$delegate.getValue()).booleanValue();
    }

    private final boolean isRunning() {
        return ((Boolean) this.isRunning$delegate.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onFrame(long j) {
        boolean z;
        MutableVector<TransitionAnimationState<?, ?>> mutableVector = this.animations;
        int size = mutableVector.getSize();
        if (size > 0) {
            TransitionAnimationState<?, ?>[] content = mutableVector.getContent();
            z = true;
            int i = 0;
            do {
                TransitionAnimationState<?, ?> transitionAnimationState = content[i];
                if (!transitionAnimationState.isFinished()) {
                    transitionAnimationState.onPlayTimeChanged(j);
                }
                if (!transitionAnimationState.isFinished()) {
                    z = false;
                }
                i++;
            } while (i < size);
        } else {
            z = true;
        }
        setRunning(!z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setRefreshChildNeeded(boolean z) {
        this.refreshChildNeeded$delegate.setValue(Boolean.valueOf(z));
    }

    private final void setRunning(boolean z) {
        this.isRunning$delegate.setValue(Boolean.valueOf(z));
    }

    public final void addAnimation$animation_core_release(@NotNull TransitionAnimationState<?, ?> animation) {
        Intrinsics.checkNotNullParameter(animation, "animation");
        this.animations.add(animation);
        setRefreshChildNeeded(true);
    }

    @NotNull
    public final MutableVector<TransitionAnimationState<?, ?>> getAnimations$animation_core_release() {
        return this.animations;
    }

    public final void removeAnimation$animation_core_release(@NotNull TransitionAnimationState<?, ?> animation) {
        Intrinsics.checkNotNullParameter(animation, "animation");
        this.animations.remove(animation);
    }

    @Composable
    public final void run$animation_core_release(@Nullable Composer composer, int i) {
        Composer startRestartGroup = composer.startRestartGroup(-318043801);
        if (isRunning() || getRefreshChildNeeded()) {
            EffectsKt.LaunchedEffect(this, new InfiniteTransition$run$1(this, null), startRestartGroup, 8);
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new InfiniteTransition$run$2(this, i));
        }
    }
}
