package androidx.compose.animation.core;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.State;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Transition.kt */
@Stable
@Metadata
/* loaded from: classes.dex */
public final class Transition<S> {
    @NotNull
    private final SnapshotStateList<Transition<S>.TransitionAnimationState<?, ?>> _animations;
    @NotNull
    private final SnapshotStateList<Transition<?>> _transitions;
    @NotNull
    private final SnapshotState isSeeking$delegate;
    @Nullable
    private final String label;
    private long lastSeekedTimeNanos;
    @NotNull
    private final SnapshotState playTimeNanos$delegate;
    @NotNull
    private final SnapshotState segment$delegate;
    @NotNull
    private final SnapshotState startTimeNanos$delegate;
    @NotNull
    private final SnapshotState targetState$delegate;
    @NotNull
    private final State totalDurationNanos$delegate;
    @NotNull
    private final MutableTransitionState<S> transitionState;
    @NotNull
    private final SnapshotState updateChildrenNeeded$delegate;

    /* compiled from: Transition.kt */
    @Metadata
    @InternalAnimationApi
    /* loaded from: classes.dex */
    public final class DeferredAnimation<T, V extends AnimationVectors> {
        @Nullable
        private Transition<S>.DeferredAnimationData<T, V>.DeferredAnimationData<T, V> data;
        @NotNull
        private final String label;
        final /* synthetic */ Transition<S> this$0;
        @NotNull
        private final VectorConverters<T, V> typeConverter;

        /* compiled from: Transition.kt */
        @Metadata
        /* loaded from: classes.dex */
        public final class DeferredAnimationData<T, V extends AnimationVectors> implements State<T> {
            @NotNull
            private final Transition<S>.TransitionAnimationState<T, V> animation;
            @NotNull
            private Function1<? super S, ? extends T> targetValueByState;
            final /* synthetic */ Transition<S>.DeferredAnimation<T, V> this$0;
            @NotNull
            private Function1<? super Segment<S>, ? extends FiniteAnimationSpec<T>> transitionSpec;

            public DeferredAnimationData(@NotNull DeferredAnimation deferredAnimation, @NotNull Transition<S>.TransitionAnimationState<T, V> animation, @NotNull Function1<? super Segment<S>, ? extends FiniteAnimationSpec<T>> transitionSpec, Function1<? super S, ? extends T> targetValueByState) {
                Intrinsics.checkNotNullParameter(animation, "animation");
                Intrinsics.checkNotNullParameter(transitionSpec, "transitionSpec");
                Intrinsics.checkNotNullParameter(targetValueByState, "targetValueByState");
                this.this$0 = deferredAnimation;
                this.animation = animation;
                this.transitionSpec = transitionSpec;
                this.targetValueByState = targetValueByState;
            }

            @NotNull
            public final Transition<S>.TransitionAnimationState<T, V> getAnimation() {
                return this.animation;
            }

            @NotNull
            public final Function1<S, T> getTargetValueByState() {
                return (Function1<? super S, ? extends T>) this.targetValueByState;
            }

            @NotNull
            public final Function1<Segment<S>, FiniteAnimationSpec<T>> getTransitionSpec() {
                return (Function1<? super Segment<S>, ? extends FiniteAnimationSpec<T>>) this.transitionSpec;
            }

            @Override // androidx.compose.runtime.State
            public T getValue() {
                updateAnimationStates(this.this$0.this$0.getSegment());
                return this.animation.getValue();
            }

            public final void setTargetValueByState(@NotNull Function1<? super S, ? extends T> function1) {
                Intrinsics.checkNotNullParameter(function1, "<set-?>");
                this.targetValueByState = function1;
            }

            public final void setTransitionSpec(@NotNull Function1<? super Segment<S>, ? extends FiniteAnimationSpec<T>> function1) {
                Intrinsics.checkNotNullParameter(function1, "<set-?>");
                this.transitionSpec = function1;
            }

            public final void updateAnimationStates(@NotNull Segment<S> segment) {
                Intrinsics.checkNotNullParameter(segment, "segment");
                T invoke = this.targetValueByState.invoke(segment.getTargetState());
                if (this.this$0.this$0.isSeeking()) {
                    this.animation.updateInitialAndTargetValue$animation_core_release(this.targetValueByState.invoke(segment.getInitialState()), invoke, this.transitionSpec.invoke(segment));
                    return;
                }
                this.animation.updateTargetValue$animation_core_release(invoke, this.transitionSpec.invoke(segment));
            }
        }

        public DeferredAnimation(@NotNull Transition transition, @NotNull VectorConverters<T, V> typeConverter, String label) {
            Intrinsics.checkNotNullParameter(typeConverter, "typeConverter");
            Intrinsics.checkNotNullParameter(label, "label");
            this.this$0 = transition;
            this.typeConverter = typeConverter;
            this.label = label;
        }

        @NotNull
        public final State<T> animate(@NotNull Function1<? super Segment<S>, ? extends FiniteAnimationSpec<T>> transitionSpec, @NotNull Function1<? super S, ? extends T> targetValueByState) {
            Intrinsics.checkNotNullParameter(transitionSpec, "transitionSpec");
            Intrinsics.checkNotNullParameter(targetValueByState, "targetValueByState");
            Transition<S>.DeferredAnimationData<T, V>.DeferredAnimationData<T, V> deferredAnimationData = this.data;
            if (deferredAnimationData == null) {
                Transition<S> transition = this.this$0;
                deferredAnimationData = new DeferredAnimationData<>(this, new TransitionAnimationState(transition, targetValueByState.invoke((S) transition.getCurrentState()), AnimationStateKt.createZeroVectorFrom(this.typeConverter, targetValueByState.invoke((S) this.this$0.getCurrentState())), this.typeConverter, this.label), transitionSpec, targetValueByState);
                Transition<S> transition2 = this.this$0;
                this.data = deferredAnimationData;
                transition2.addAnimation$animation_core_release(deferredAnimationData.getAnimation());
            }
            Transition<S> transition3 = this.this$0;
            deferredAnimationData.setTargetValueByState(targetValueByState);
            deferredAnimationData.setTransitionSpec(transitionSpec);
            deferredAnimationData.updateAnimationStates(transition3.getSegment());
            return deferredAnimationData;
        }

        @Nullable
        public final Transition<S>.DeferredAnimationData<T, V>.DeferredAnimationData<T, V> getData$animation_core_release() {
            return this.data;
        }

        @NotNull
        public final String getLabel() {
            return this.label;
        }

        @NotNull
        public final VectorConverters<T, V> getTypeConverter() {
            return this.typeConverter;
        }

        public final void setData$animation_core_release(@Nullable Transition<S>.DeferredAnimationData<T, V>.DeferredAnimationData<T, V> deferredAnimationData) {
            this.data = deferredAnimationData;
        }

        public final void setupSeeking$animation_core_release() {
            Transition<S>.DeferredAnimationData<T, V>.DeferredAnimationData<T, V> deferredAnimationData = this.data;
            if (deferredAnimationData != null) {
                Transition<S> transition = this.this$0;
                deferredAnimationData.getAnimation().updateInitialAndTargetValue$animation_core_release(deferredAnimationData.getTargetValueByState().invoke(transition.getSegment().getInitialState()), deferredAnimationData.getTargetValueByState().invoke(transition.getSegment().getTargetState()), deferredAnimationData.getTransitionSpec().invoke(transition.getSegment()));
            }
        }
    }

    /* compiled from: Transition.kt */
    @Metadata
    /* loaded from: classes.dex */
    public interface Segment<S> {

        /* compiled from: Transition.kt */
        @Metadata
        /* loaded from: classes.dex */
        public static final class DefaultImpls {
            @Deprecated
            public static <S> boolean isTransitioningTo(@NotNull Segment<S> segment, S s, S s2) {
                return Segment.super.isTransitioningTo(s, s2);
            }
        }

        S getInitialState();

        S getTargetState();

        default boolean isTransitioningTo(S s, S s2) {
            if (Intrinsics.m17075f(s, getInitialState()) && Intrinsics.m17075f(s2, getTargetState())) {
                return true;
            }
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: Transition.kt */
    @Metadata
    /* loaded from: classes.dex */
    public static final class SegmentImpl<S> implements Segment<S> {
        private final S initialState;
        private final S targetState;

        public SegmentImpl(S s, S s2) {
            this.initialState = s;
            this.targetState = s2;
        }

        public boolean equals(@Nullable Object obj) {
            if (obj instanceof Segment) {
                Segment segment = (Segment) obj;
                if (Intrinsics.m17075f(getInitialState(), segment.getInitialState()) && Intrinsics.m17075f(getTargetState(), segment.getTargetState())) {
                    return true;
                }
            }
            return false;
        }

        @Override // androidx.compose.animation.core.Transition.Segment
        public S getInitialState() {
            return this.initialState;
        }

        @Override // androidx.compose.animation.core.Transition.Segment
        public S getTargetState() {
            return this.targetState;
        }

        public int hashCode() {
            int i;
            S initialState = getInitialState();
            int i2 = 0;
            if (initialState != null) {
                i = initialState.hashCode();
            } else {
                i = 0;
            }
            int i3 = i * 31;
            S targetState = getTargetState();
            if (targetState != null) {
                i2 = targetState.hashCode();
            }
            return i3 + i2;
        }
    }

    /* compiled from: Transition.kt */
    @Metadata
    @Stable
    /* loaded from: classes.dex */
    public final class TransitionAnimationState<T, V extends AnimationVectors> implements State<T> {
        @NotNull
        private final SnapshotState animation$delegate;
        @NotNull
        private final SnapshotState animationSpec$delegate;
        @NotNull
        private final FiniteAnimationSpec<T> interruptionSpec;
        @NotNull
        private final SnapshotState isFinished$delegate;
        @NotNull
        private final String label;
        @NotNull
        private final SnapshotState needsReset$delegate;
        @NotNull
        private final SnapshotState offsetTimeNanos$delegate;
        @NotNull
        private final SnapshotState targetValue$delegate;
        final /* synthetic */ Transition<S> this$0;
        @NotNull
        private final VectorConverters<T, V> typeConverter;
        @NotNull
        private final SnapshotState value$delegate;
        @NotNull
        private V velocityVector;

        public TransitionAnimationState(Transition transition, @NotNull T t, @NotNull V initialVelocityVector, @NotNull VectorConverters<T, V> typeConverter, String label) {
            SnapshotState mutableStateOf$default;
            SnapshotState mutableStateOf$default2;
            SnapshotState mutableStateOf$default3;
            SnapshotState mutableStateOf$default4;
            SnapshotState mutableStateOf$default5;
            SnapshotState mutableStateOf$default6;
            SnapshotState mutableStateOf$default7;
            T t2;
            Intrinsics.checkNotNullParameter(initialVelocityVector, "initialVelocityVector");
            Intrinsics.checkNotNullParameter(typeConverter, "typeConverter");
            Intrinsics.checkNotNullParameter(label, "label");
            this.this$0 = transition;
            this.typeConverter = typeConverter;
            this.label = label;
            mutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(t, null, 2, null);
            this.targetValue$delegate = mutableStateOf$default;
            mutableStateOf$default2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(AnimationSpecKt.spring$default(0.0f, 0.0f, null, 7, null), null, 2, null);
            this.animationSpec$delegate = mutableStateOf$default2;
            mutableStateOf$default3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(new TargetBasedAnimation(getAnimationSpec(), typeConverter, t, getTargetValue(), initialVelocityVector), null, 2, null);
            this.animation$delegate = mutableStateOf$default3;
            mutableStateOf$default4 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.TRUE, null, 2, null);
            this.isFinished$delegate = mutableStateOf$default4;
            mutableStateOf$default5 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(0L, null, 2, null);
            this.offsetTimeNanos$delegate = mutableStateOf$default5;
            mutableStateOf$default6 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
            this.needsReset$delegate = mutableStateOf$default6;
            mutableStateOf$default7 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(t, null, 2, null);
            this.value$delegate = mutableStateOf$default7;
            this.velocityVector = initialVelocityVector;
            Float f = VisibilityThresholds.getVisibilityThresholdMap().get(typeConverter);
            if (f != null) {
                float floatValue = f.floatValue();
                V invoke = typeConverter.getConvertToVector().invoke(t);
                int size$animation_core_release = invoke.getSize$animation_core_release();
                for (int i = 0; i < size$animation_core_release; i++) {
                    invoke.set$animation_core_release(i, floatValue);
                }
                t2 = this.typeConverter.getConvertFromVector().invoke(invoke);
            } else {
                t2 = null;
            }
            this.interruptionSpec = AnimationSpecKt.spring$default(0.0f, 0.0f, t2, 3, null);
        }

        private final boolean getNeedsReset() {
            return ((Boolean) this.needsReset$delegate.getValue()).booleanValue();
        }

        private final long getOffsetTimeNanos() {
            return ((Number) this.offsetTimeNanos$delegate.getValue()).longValue();
        }

        private final T getTargetValue() {
            return this.targetValue$delegate.getValue();
        }

        private final void setAnimation(TargetBasedAnimation<T, V> targetBasedAnimation) {
            this.animation$delegate.setValue(targetBasedAnimation);
        }

        private final void setAnimationSpec(FiniteAnimationSpec<T> finiteAnimationSpec) {
            this.animationSpec$delegate.setValue(finiteAnimationSpec);
        }

        private final void setNeedsReset(boolean z) {
            this.needsReset$delegate.setValue(Boolean.valueOf(z));
        }

        private final void setOffsetTimeNanos(long j) {
            this.offsetTimeNanos$delegate.setValue(Long.valueOf(j));
        }

        private final void setTargetValue(T t) {
            this.targetValue$delegate.setValue(t);
        }

        private final void updateAnimation(T t, boolean z) {
            FiniteAnimationSpec<T> animationSpec;
            if (z) {
                if (getAnimationSpec() instanceof SpringSpec) {
                    animationSpec = getAnimationSpec();
                } else {
                    animationSpec = this.interruptionSpec;
                }
            } else {
                animationSpec = getAnimationSpec();
            }
            setAnimation(new TargetBasedAnimation<>(animationSpec, this.typeConverter, t, getTargetValue(), this.velocityVector));
            this.this$0.onChildAnimationUpdated();
        }

        /* JADX WARN: Multi-variable type inference failed */
        static /* synthetic */ void updateAnimation$default(TransitionAnimationState transitionAnimationState, Object obj, boolean z, int i, Object obj2) {
            if ((i & 1) != 0) {
                obj = transitionAnimationState.getValue();
            }
            if ((i & 2) != 0) {
                z = false;
            }
            transitionAnimationState.updateAnimation(obj, z);
        }

        @NotNull
        public final TargetBasedAnimation<T, V> getAnimation() {
            return (TargetBasedAnimation) this.animation$delegate.getValue();
        }

        @NotNull
        public final FiniteAnimationSpec<T> getAnimationSpec() {
            return (FiniteAnimationSpec) this.animationSpec$delegate.getValue();
        }

        public final long getDurationNanos$animation_core_release() {
            return getAnimation().getDurationNanos();
        }

        @NotNull
        public final String getLabel() {
            return this.label;
        }

        @NotNull
        public final VectorConverters<T, V> getTypeConverter() {
            return this.typeConverter;
        }

        @Override // androidx.compose.runtime.State
        public T getValue() {
            return this.value$delegate.getValue();
        }

        public final boolean isFinished$animation_core_release() {
            return ((Boolean) this.isFinished$delegate.getValue()).booleanValue();
        }

        public final void onPlayTimeChanged$animation_core_release(long j, float f) {
            boolean z;
            long offsetTimeNanos;
            if (f == 0.0f) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                offsetTimeNanos = getAnimation().getDurationNanos();
            } else {
                offsetTimeNanos = ((float) (j - getOffsetTimeNanos())) / f;
            }
            setValue$animation_core_release(getAnimation().getValueFromNanos(offsetTimeNanos));
            this.velocityVector = getAnimation().getVelocityVectorFromNanos(offsetTimeNanos);
            if (getAnimation().isFinishedFromNanos(offsetTimeNanos)) {
                setFinished$animation_core_release(true);
                setOffsetTimeNanos(0L);
            }
        }

        public final void resetAnimation$animation_core_release() {
            setNeedsReset(true);
        }

        public final void seekTo$animation_core_release(long j) {
            setValue$animation_core_release(getAnimation().getValueFromNanos(j));
            this.velocityVector = getAnimation().getVelocityVectorFromNanos(j);
        }

        public final void setFinished$animation_core_release(boolean z) {
            this.isFinished$delegate.setValue(Boolean.valueOf(z));
        }

        public void setValue$animation_core_release(T t) {
            this.value$delegate.setValue(t);
        }

        public final void updateInitialAndTargetValue$animation_core_release(T t, T t2, @NotNull FiniteAnimationSpec<T> animationSpec) {
            Intrinsics.checkNotNullParameter(animationSpec, "animationSpec");
            setTargetValue(t2);
            setAnimationSpec(animationSpec);
            if (Intrinsics.m17075f(getAnimation().getInitialValue(), t) && Intrinsics.m17075f(getAnimation().getTargetValue(), t2)) {
                return;
            }
            updateAnimation$default(this, t, false, 2, null);
        }

        public final void updateTargetValue$animation_core_release(T t, @NotNull FiniteAnimationSpec<T> animationSpec) {
            Intrinsics.checkNotNullParameter(animationSpec, "animationSpec");
            if (!Intrinsics.m17075f(getTargetValue(), t) || getNeedsReset()) {
                setTargetValue(t);
                setAnimationSpec(animationSpec);
                updateAnimation$default(this, null, !isFinished$animation_core_release(), 1, null);
                setFinished$animation_core_release(false);
                setOffsetTimeNanos(this.this$0.getPlayTimeNanos());
                setNeedsReset(false);
            }
        }
    }

    public Transition(@NotNull MutableTransitionState<S> transitionState, @Nullable String str) {
        SnapshotState mutableStateOf$default;
        SnapshotState mutableStateOf$default2;
        SnapshotState mutableStateOf$default3;
        SnapshotState mutableStateOf$default4;
        SnapshotState mutableStateOf$default5;
        SnapshotState mutableStateOf$default6;
        Intrinsics.checkNotNullParameter(transitionState, "transitionState");
        this.transitionState = transitionState;
        this.label = str;
        mutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(getCurrentState(), null, 2, null);
        this.targetState$delegate = mutableStateOf$default;
        mutableStateOf$default2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(new SegmentImpl(getCurrentState(), getCurrentState()), null, 2, null);
        this.segment$delegate = mutableStateOf$default2;
        mutableStateOf$default3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(0L, null, 2, null);
        this.playTimeNanos$delegate = mutableStateOf$default3;
        mutableStateOf$default4 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Long.MIN_VALUE, null, 2, null);
        this.startTimeNanos$delegate = mutableStateOf$default4;
        mutableStateOf$default5 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.TRUE, null, 2, null);
        this.updateChildrenNeeded$delegate = mutableStateOf$default5;
        this._animations = SnapshotStateKt.mutableStateListOf();
        this._transitions = SnapshotStateKt.mutableStateListOf();
        mutableStateOf$default6 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
        this.isSeeking$delegate = mutableStateOf$default6;
        this.totalDurationNanos$delegate = SnapshotStateKt.derivedStateOf(new Transition$totalDurationNanos$2(this));
    }

    private final long getStartTimeNanos() {
        return ((Number) this.startTimeNanos$delegate.getValue()).longValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onChildAnimationUpdated() {
        setUpdateChildrenNeeded$animation_core_release(true);
        if (isSeeking()) {
            long j = 0;
            for (Transition<S>.TransitionAnimationState<?, ?> transitionAnimationState : this._animations) {
                j = Math.max(j, transitionAnimationState.getDurationNanos$animation_core_release());
                transitionAnimationState.seekTo$animation_core_release(this.lastSeekedTimeNanos);
            }
            setUpdateChildrenNeeded$animation_core_release(false);
        }
    }

    private final void setSegment(Segment<S> segment) {
        this.segment$delegate.setValue(segment);
    }

    private final void setStartTimeNanos(long j) {
        this.startTimeNanos$delegate.setValue(Long.valueOf(j));
    }

    public final boolean addAnimation$animation_core_release(@NotNull Transition<S>.TransitionAnimationState<?, ?> animation) {
        Intrinsics.checkNotNullParameter(animation, "animation");
        return this._animations.add(animation);
    }

    public final boolean addTransition$animation_core_release(@NotNull Transition<?> transition) {
        Intrinsics.checkNotNullParameter(transition, "transition");
        return this._transitions.add(transition);
    }

    @Composable
    public final void animateTo$animation_core_release(S s, @Nullable Composer composer, int i) {
        int i2;
        int i3;
        int i4;
        Composer startRestartGroup = composer.startRestartGroup(-1493585151);
        if ((i & 14) == 0) {
            if (startRestartGroup.changed(s)) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            i2 = i4 | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            if (startRestartGroup.changed(this)) {
                i3 = 32;
            } else {
                i3 = 16;
            }
            i2 |= i3;
        }
        if ((i2 & 91) == 18 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else if (!isSeeking()) {
            updateTarget$animation_core_release(s, startRestartGroup, (i2 & 14) | (i2 & 112));
            if (!Intrinsics.m17075f(s, getCurrentState()) || isRunning() || getUpdateChildrenNeeded$animation_core_release()) {
                int i5 = (i2 >> 3) & 14;
                startRestartGroup.startReplaceableGroup(1157296644);
                boolean changed = startRestartGroup.changed(this);
                Object rememberedValue = startRestartGroup.rememberedValue();
                if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                    rememberedValue = new Transition$animateTo$1$1(this, null);
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                startRestartGroup.endReplaceableGroup();
                EffectsKt.LaunchedEffect(this, (Function2) rememberedValue, startRestartGroup, i5);
            }
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Transition$animateTo$2(this, s, i));
        }
    }

    @NotNull
    public final List<Transition<S>.TransitionAnimationState<?, ?>> getAnimations() {
        return this._animations;
    }

    public final S getCurrentState() {
        return this.transitionState.getCurrentState();
    }

    @Nullable
    public final String getLabel() {
        return this.label;
    }

    public final long getLastSeekedTimeNanos$animation_core_release() {
        return this.lastSeekedTimeNanos;
    }

    public final long getPlayTimeNanos() {
        return ((Number) this.playTimeNanos$delegate.getValue()).longValue();
    }

    @NotNull
    public final Segment<S> getSegment() {
        return (Segment) this.segment$delegate.getValue();
    }

    public final S getTargetState() {
        return (S) this.targetState$delegate.getValue();
    }

    public final long getTotalDurationNanos() {
        return ((Number) this.totalDurationNanos$delegate.getValue()).longValue();
    }

    @NotNull
    public final List<Transition<?>> getTransitions() {
        return this._transitions;
    }

    public final boolean getUpdateChildrenNeeded$animation_core_release() {
        return ((Boolean) this.updateChildrenNeeded$delegate.getValue()).booleanValue();
    }

    public final boolean isRunning() {
        if (getStartTimeNanos() != Long.MIN_VALUE) {
            return true;
        }
        return false;
    }

    public final boolean isSeeking() {
        return ((Boolean) this.isSeeking$delegate.getValue()).booleanValue();
    }

    public final void onFrame$animation_core_release(long j, float f) {
        if (getStartTimeNanos() == Long.MIN_VALUE) {
            onTransitionStart$animation_core_release(j);
        }
        setUpdateChildrenNeeded$animation_core_release(false);
        setPlayTimeNanos(j - getStartTimeNanos());
        boolean z = true;
        for (Transition<S>.TransitionAnimationState<?, ?> transitionAnimationState : this._animations) {
            if (!transitionAnimationState.isFinished$animation_core_release()) {
                transitionAnimationState.onPlayTimeChanged$animation_core_release(getPlayTimeNanos(), f);
            }
            if (!transitionAnimationState.isFinished$animation_core_release()) {
                z = false;
            }
        }
        for (Transition<?> transition : this._transitions) {
            if (!Intrinsics.m17075f(transition.getTargetState(), transition.getCurrentState())) {
                transition.onFrame$animation_core_release(getPlayTimeNanos(), f);
            }
            if (!Intrinsics.m17075f(transition.getTargetState(), transition.getCurrentState())) {
                z = false;
            }
        }
        if (z) {
            onTransitionEnd$animation_core_release();
        }
    }

    public final void onTransitionEnd$animation_core_release() {
        setStartTimeNanos(Long.MIN_VALUE);
        setCurrentState$animation_core_release(getTargetState());
        setPlayTimeNanos(0L);
        this.transitionState.setRunning$animation_core_release(false);
    }

    public final void onTransitionStart$animation_core_release(long j) {
        setStartTimeNanos(j);
        this.transitionState.setRunning$animation_core_release(true);
    }

    public final void removeAnimation$animation_core_release(@NotNull Transition<S>.TransitionAnimationState<?, ?> animation) {
        Intrinsics.checkNotNullParameter(animation, "animation");
        this._animations.remove(animation);
    }

    public final boolean removeTransition$animation_core_release(@NotNull Transition<?> transition) {
        Intrinsics.checkNotNullParameter(transition, "transition");
        return this._transitions.remove(transition);
    }

    public final void seek(S s, S s2, long j) {
        setStartTimeNanos(Long.MIN_VALUE);
        this.transitionState.setRunning$animation_core_release(false);
        if (!isSeeking() || !Intrinsics.m17075f(getCurrentState(), s) || !Intrinsics.m17075f(getTargetState(), s2)) {
            setCurrentState$animation_core_release(s);
            setTargetState$animation_core_release(s2);
            setSeeking$animation_core_release(true);
            setSegment(new SegmentImpl(s, s2));
        }
        for (Transition<?> transition : this._transitions) {
            if (transition.isSeeking()) {
                transition.seek(transition.getCurrentState(), transition.getTargetState(), j);
            }
        }
        for (Transition<S>.TransitionAnimationState<?, ?> transitionAnimationState : this._animations) {
            transitionAnimationState.seekTo$animation_core_release(j);
        }
        this.lastSeekedTimeNanos = j;
    }

    public final void setCurrentState$animation_core_release(S s) {
        this.transitionState.setCurrentState$animation_core_release(s);
    }

    public final void setLastSeekedTimeNanos$animation_core_release(long j) {
        this.lastSeekedTimeNanos = j;
    }

    public final void setPlayTimeNanos(long j) {
        this.playTimeNanos$delegate.setValue(Long.valueOf(j));
    }

    public final void setSeeking$animation_core_release(boolean z) {
        this.isSeeking$delegate.setValue(Boolean.valueOf(z));
    }

    public final void setTargetState$animation_core_release(S s) {
        this.targetState$delegate.setValue(s);
    }

    public final void setUpdateChildrenNeeded$animation_core_release(boolean z) {
        this.updateChildrenNeeded$delegate.setValue(Boolean.valueOf(z));
    }

    @Composable
    public final void updateTarget$animation_core_release(S s, @Nullable Composer composer, int i) {
        int i2;
        int i3;
        int i4;
        Composer startRestartGroup = composer.startRestartGroup(-583974681);
        if ((i & 14) == 0) {
            if (startRestartGroup.changed(s)) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            i2 = i4 | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            if (startRestartGroup.changed(this)) {
                i3 = 32;
            } else {
                i3 = 16;
            }
            i2 |= i3;
        }
        if ((i2 & 91) == 18 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else if (!isSeeking() && !Intrinsics.m17075f(getTargetState(), s)) {
            setSegment(new SegmentImpl(getTargetState(), s));
            setCurrentState$animation_core_release(getTargetState());
            setTargetState$animation_core_release(s);
            if (!isRunning()) {
                setUpdateChildrenNeeded$animation_core_release(true);
            }
            for (Transition<S>.TransitionAnimationState<?, ?> transitionAnimationState : this._animations) {
                transitionAnimationState.resetAnimation$animation_core_release();
            }
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Transition$updateTarget$2(this, s, i));
        }
    }

    public final void removeAnimation$animation_core_release(@NotNull Transition<S>.DeferredAnimation<?, ?> deferredAnimation) {
        Transition<S>.TransitionAnimationState<?, ?> animation;
        Intrinsics.checkNotNullParameter(deferredAnimation, "deferredAnimation");
        Transition<S>.DeferredAnimationData<?, V>.DeferredAnimationData<?, ?> data$animation_core_release = deferredAnimation.getData$animation_core_release();
        if (data$animation_core_release == null || (animation = data$animation_core_release.getAnimation()) == null) {
            return;
        }
        removeAnimation$animation_core_release(animation);
    }

    public /* synthetic */ Transition(MutableTransitionState mutableTransitionState, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(mutableTransitionState, (i & 2) != 0 ? null : str);
    }

    public Transition(S s, @Nullable String str) {
        this(new MutableTransitionState(s), str);
    }

    @InternalAnimationApi
    public static /* synthetic */ void getPlayTimeNanos$annotations() {
    }

    @InternalAnimationApi
    public static /* synthetic */ void isSeeking$annotations() {
    }
}
