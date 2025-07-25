package androidx.compose.animation;

import androidx.compose.animation.core.AnimationVector2D;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.Transition;
import androidx.compose.p015ui.layout.Measurable;
import androidx.compose.p015ui.layout.MeasureResult;
import androidx.compose.p015ui.layout.MeasureScope;
import androidx.compose.p015ui.layout.Placeable;
import androidx.compose.p015ui.unit.IntOffset;
import androidx.compose.p015ui.unit.IntSize;
import androidx.compose.p015ui.unit.IntSizeKt;
import androidx.compose.runtime.State;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p804nd.NoWhenBranchMatchedException;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: EnterExitTransition.kt */
@Metadata
/* loaded from: classes.dex */
public final class SlideModifier extends LayoutModifierWithPassThroughIntrinsics {
    @NotNull
    private final Transition<EnterExitState>.DeferredAnimation<IntOffset, AnimationVector2D> lazyAnimation;
    @NotNull
    private final State<Slide> slideIn;
    @NotNull
    private final State<Slide> slideOut;
    @NotNull
    private final Function1<Transition.Segment<EnterExitState>, FiniteAnimationSpec<IntOffset>> transitionSpec;

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

    public SlideModifier(@NotNull Transition<EnterExitState>.DeferredAnimation<IntOffset, AnimationVector2D> lazyAnimation, @NotNull State<Slide> slideIn, @NotNull State<Slide> slideOut) {
        Intrinsics.checkNotNullParameter(lazyAnimation, "lazyAnimation");
        Intrinsics.checkNotNullParameter(slideIn, "slideIn");
        Intrinsics.checkNotNullParameter(slideOut, "slideOut");
        this.lazyAnimation = lazyAnimation;
        this.slideIn = slideIn;
        this.slideOut = slideOut;
        this.transitionSpec = new SlideModifier$transitionSpec$1(this);
    }

    @NotNull
    public final Transition<EnterExitState>.DeferredAnimation<IntOffset, AnimationVector2D> getLazyAnimation() {
        return this.lazyAnimation;
    }

    @NotNull
    public final State<Slide> getSlideIn() {
        return this.slideIn;
    }

    @NotNull
    public final State<Slide> getSlideOut() {
        return this.slideOut;
    }

    @NotNull
    public final Function1<Transition.Segment<EnterExitState>, FiniteAnimationSpec<IntOffset>> getTransitionSpec() {
        return this.transitionSpec;
    }

    @Override // androidx.compose.p015ui.layout.LayoutModifier
    @NotNull
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo105929measure3p2s80s(@NotNull MeasureScope measure, @NotNull Measurable measurable, long j) {
        Intrinsics.checkNotNullParameter(measure, "$this$measure");
        Intrinsics.checkNotNullParameter(measurable, "measurable");
        Placeable mo109020measureBRTryo0 = measurable.mo109020measureBRTryo0(j);
        return MeasureScope.layout$default(measure, mo109020measureBRTryo0.getWidth(), mo109020measureBRTryo0.getHeight(), null, new SlideModifier$measure$1(this, mo109020measureBRTryo0, IntSizeKt.IntSize(mo109020measureBRTryo0.getWidth(), mo109020measureBRTryo0.getHeight())), 4, null);
    }

    /* renamed from: targetValueByState-oFUgxo0  reason: not valid java name */
    public final long m105996targetValueByStateoFUgxo0(@NotNull EnterExitState targetState, long j) {
        long m109862getZeronOccac;
        long m109862getZeronOccac2;
        Function1<IntSize, IntOffset> slideOffset;
        Function1<IntSize, IntOffset> slideOffset2;
        Intrinsics.checkNotNullParameter(targetState, "targetState");
        Slide value = this.slideIn.getValue();
        if (value != null && (slideOffset2 = value.getSlideOffset()) != null) {
            m109862getZeronOccac = slideOffset2.invoke(IntSize.m109886boximpl(j)).m109861unboximpl();
        } else {
            m109862getZeronOccac = IntOffset.Companion.m109862getZeronOccac();
        }
        Slide value2 = this.slideOut.getValue();
        if (value2 != null && (slideOffset = value2.getSlideOffset()) != null) {
            m109862getZeronOccac2 = slideOffset.invoke(IntSize.m109886boximpl(j)).m109861unboximpl();
        } else {
            m109862getZeronOccac2 = IntOffset.Companion.m109862getZeronOccac();
        }
        int i = WhenMappings.$EnumSwitchMapping$0[targetState.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    return m109862getZeronOccac2;
                }
                throw new NoWhenBranchMatchedException();
            }
            return m109862getZeronOccac;
        }
        return IntOffset.Companion.m109862getZeronOccac();
    }
}
