package androidx.compose.animation;

import androidx.compose.animation.core.AnimationVector2D;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.Transition;
import androidx.compose.p015ui.Alignment;
import androidx.compose.p015ui.layout.Measurable;
import androidx.compose.p015ui.layout.MeasureResult;
import androidx.compose.p015ui.layout.MeasureScope;
import androidx.compose.p015ui.layout.Placeable;
import androidx.compose.p015ui.unit.IntOffset;
import androidx.compose.p015ui.unit.IntOffsetKt;
import androidx.compose.p015ui.unit.IntSize;
import androidx.compose.p015ui.unit.IntSizeKt;
import androidx.compose.p015ui.unit.LayoutDirection;
import androidx.compose.runtime.State;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p804nd.NoWhenBranchMatchedException;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: EnterExitTransition.kt */
@Metadata
/* loaded from: classes.dex */
public final class ExpandShrinkModifier extends LayoutModifierWithPassThroughIntrinsics {
    @NotNull
    private final State<Alignment> alignment;
    @Nullable
    private Alignment currentAlignment;
    @NotNull
    private final State<EnterExitTransition> expand;
    @NotNull
    private final Transition<EnterExitState>.DeferredAnimation<IntOffset, AnimationVector2D> offsetAnimation;
    @NotNull
    private final State<EnterExitTransition> shrink;
    @NotNull
    private final Transition<EnterExitState>.DeferredAnimation<IntSize, AnimationVector2D> sizeAnimation;
    @NotNull
    private final Function1<Transition.Segment<EnterExitState>, FiniteAnimationSpec<IntSize>> sizeTransitionSpec;

    /* compiled from: EnterExitTransition.kt */
    @Metadata
    /* loaded from: classes.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[EnterExitState.values().length];
            iArr[EnterExitState.Visible.ordinal()] = 1;
            iArr[EnterExitState.PreEnter.ordinal()] = 2;
            iArr[EnterExitState.PostExit.ordinal()] = 3;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ExpandShrinkModifier(@NotNull Transition<EnterExitState>.DeferredAnimation<IntSize, AnimationVector2D> sizeAnimation, @NotNull Transition<EnterExitState>.DeferredAnimation<IntOffset, AnimationVector2D> offsetAnimation, @NotNull State<EnterExitTransition> expand, @NotNull State<EnterExitTransition> shrink, @NotNull State<? extends Alignment> alignment) {
        Intrinsics.checkNotNullParameter(sizeAnimation, "sizeAnimation");
        Intrinsics.checkNotNullParameter(offsetAnimation, "offsetAnimation");
        Intrinsics.checkNotNullParameter(expand, "expand");
        Intrinsics.checkNotNullParameter(shrink, "shrink");
        Intrinsics.checkNotNullParameter(alignment, "alignment");
        this.sizeAnimation = sizeAnimation;
        this.offsetAnimation = offsetAnimation;
        this.expand = expand;
        this.shrink = shrink;
        this.alignment = alignment;
        this.sizeTransitionSpec = new ExpandShrinkModifier$sizeTransitionSpec$1(this);
    }

    @NotNull
    public final State<Alignment> getAlignment() {
        return this.alignment;
    }

    @Nullable
    public final Alignment getCurrentAlignment() {
        return this.currentAlignment;
    }

    @NotNull
    public final State<EnterExitTransition> getExpand() {
        return this.expand;
    }

    @NotNull
    public final Transition<EnterExitState>.DeferredAnimation<IntOffset, AnimationVector2D> getOffsetAnimation() {
        return this.offsetAnimation;
    }

    @NotNull
    public final State<EnterExitTransition> getShrink() {
        return this.shrink;
    }

    @NotNull
    public final Transition<EnterExitState>.DeferredAnimation<IntSize, AnimationVector2D> getSizeAnimation() {
        return this.sizeAnimation;
    }

    @NotNull
    public final Function1<Transition.Segment<EnterExitState>, FiniteAnimationSpec<IntSize>> getSizeTransitionSpec() {
        return this.sizeTransitionSpec;
    }

    @Override // androidx.compose.p015ui.layout.LayoutModifier
    @NotNull
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo105929measure3p2s80s(@NotNull MeasureScope measure, @NotNull Measurable measurable, long j) {
        long m109862getZeronOccac;
        Intrinsics.checkNotNullParameter(measure, "$this$measure");
        Intrinsics.checkNotNullParameter(measurable, "measurable");
        Placeable mo109020measureBRTryo0 = measurable.mo109020measureBRTryo0(j);
        long IntSize = IntSizeKt.IntSize(mo109020measureBRTryo0.getWidth(), mo109020measureBRTryo0.getHeight());
        long m109898unboximpl = this.sizeAnimation.animate(this.sizeTransitionSpec, new ExpandShrinkModifier$measure$currentSize$1(this, IntSize)).getValue().m109898unboximpl();
        long m109861unboximpl = this.offsetAnimation.animate(ExpandShrinkModifier$measure$offsetDelta$1.INSTANCE, new ExpandShrinkModifier$measure$offsetDelta$2(this, IntSize)).getValue().m109861unboximpl();
        Alignment alignment = this.currentAlignment;
        if (alignment != null) {
            m109862getZeronOccac = alignment.mo107199alignKFBX0sM(IntSize, m109898unboximpl, LayoutDirection.Ltr);
        } else {
            m109862getZeronOccac = IntOffset.Companion.m109862getZeronOccac();
        }
        return MeasureScope.layout$default(measure, IntSize.m109894getWidthimpl(m109898unboximpl), IntSize.m109893getHeightimpl(m109898unboximpl), null, new ExpandShrinkModifier$measure$1(mo109020measureBRTryo0, m109862getZeronOccac, m109861unboximpl), 4, null);
    }

    public final void setCurrentAlignment(@Nullable Alignment alignment) {
        this.currentAlignment = alignment;
    }

    /* renamed from: sizeByState-Uzc_VyU  reason: not valid java name */
    public final long m105979sizeByStateUzc_VyU(@NotNull EnterExitState targetState, long j) {
        long j2;
        long j3;
        Intrinsics.checkNotNullParameter(targetState, "targetState");
        EnterExitTransition value = this.expand.getValue();
        if (value != null) {
            j2 = value.getSize().invoke(IntSize.m109886boximpl(j)).m109898unboximpl();
        } else {
            j2 = j;
        }
        EnterExitTransition value2 = this.shrink.getValue();
        if (value2 != null) {
            j3 = value2.getSize().invoke(IntSize.m109886boximpl(j)).m109898unboximpl();
        } else {
            j3 = j;
        }
        int i = WhenMappings.$EnumSwitchMapping$0[targetState.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    return j3;
                }
                throw new NoWhenBranchMatchedException();
            }
            return j2;
        }
        return j;
    }

    /* renamed from: targetOffsetByState-oFUgxo0  reason: not valid java name */
    public final long m105980targetOffsetByStateoFUgxo0(@NotNull EnterExitState targetState, long j) {
        Intrinsics.checkNotNullParameter(targetState, "targetState");
        if (this.currentAlignment == null) {
            return IntOffset.Companion.m109862getZeronOccac();
        }
        if (this.alignment.getValue() == null) {
            return IntOffset.Companion.m109862getZeronOccac();
        }
        if (Intrinsics.m17075f(this.currentAlignment, this.alignment.getValue())) {
            return IntOffset.Companion.m109862getZeronOccac();
        }
        int i = WhenMappings.$EnumSwitchMapping$0[targetState.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    EnterExitTransition value = this.shrink.getValue();
                    if (value != null) {
                        long m109898unboximpl = value.getSize().invoke(IntSize.m109886boximpl(j)).m109898unboximpl();
                        Alignment value2 = this.alignment.getValue();
                        Intrinsics.m17074g(value2);
                        Alignment alignment = value2;
                        LayoutDirection layoutDirection = LayoutDirection.Ltr;
                        long mo107199alignKFBX0sM = alignment.mo107199alignKFBX0sM(j, m109898unboximpl, layoutDirection);
                        Alignment alignment2 = this.currentAlignment;
                        Intrinsics.m17074g(alignment2);
                        long mo107199alignKFBX0sM2 = alignment2.mo107199alignKFBX0sM(j, m109898unboximpl, layoutDirection);
                        return IntOffsetKt.IntOffset(IntOffset.m109852getXimpl(mo107199alignKFBX0sM) - IntOffset.m109852getXimpl(mo107199alignKFBX0sM2), IntOffset.m109853getYimpl(mo107199alignKFBX0sM) - IntOffset.m109853getYimpl(mo107199alignKFBX0sM2));
                    }
                    return IntOffset.Companion.m109862getZeronOccac();
                }
                throw new NoWhenBranchMatchedException();
            }
            return IntOffset.Companion.m109862getZeronOccac();
        }
        return IntOffset.Companion.m109862getZeronOccac();
    }
}
