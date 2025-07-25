package androidx.compose.material;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.State;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sd.C42688d;

/* compiled from: Drawer.kt */
@Stable
@Metadata
/* loaded from: classes.dex */
public final class DrawerState {
    @NotNull
    public static final Companion Companion = new Companion(null);
    @NotNull
    private final SwipeableState<DrawerValue> swipeableState;

    /* compiled from: Drawer.kt */
    @Metadata
    /* renamed from: androidx.compose.material.DrawerState$1 */
    /* loaded from: classes.dex */
    static final class C07161 extends Lambda implements Function1<DrawerValue, Boolean> {
        public static final C07161 INSTANCE = new C07161();

        C07161() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        public final Boolean invoke(@NotNull DrawerValue it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Boolean.TRUE;
        }
    }

    /* compiled from: Drawer.kt */
    @Metadata
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final Saver<DrawerState, DrawerValue> Saver(@NotNull Function1<? super DrawerValue, Boolean> confirmStateChange) {
            Intrinsics.checkNotNullParameter(confirmStateChange, "confirmStateChange");
            return SaverKt.Saver(DrawerState$Companion$Saver$1.INSTANCE, new DrawerState$Companion$Saver$2(confirmStateChange));
        }
    }

    public DrawerState(@NotNull DrawerValue initialValue, @NotNull Function1<? super DrawerValue, Boolean> confirmStateChange) {
        Intrinsics.checkNotNullParameter(initialValue, "initialValue");
        Intrinsics.checkNotNullParameter(confirmStateChange, "confirmStateChange");
        this.swipeableState = new SwipeableState<>(initialValue, DrawerKt.access$getAnimationSpec$p(), confirmStateChange);
    }

    @ExperimentalMaterialApi
    @Nullable
    public final Object animateTo(@NotNull DrawerValue drawerValue, @NotNull AnimationSpec<Float> animationSpec, @NotNull Continuation<? super Unit> continuation) {
        Object m6959e;
        Object animateTo = this.swipeableState.animateTo(drawerValue, animationSpec, continuation);
        m6959e = C42688d.m6959e();
        if (animateTo == m6959e) {
            return animateTo;
        }
        return Unit.f99208a;
    }

    @Nullable
    public final Object close(@NotNull Continuation<? super Unit> continuation) {
        Object m6959e;
        Object animateTo = animateTo(DrawerValue.Closed, DrawerKt.access$getAnimationSpec$p(), continuation);
        m6959e = C42688d.m6959e();
        if (animateTo == m6959e) {
            return animateTo;
        }
        return Unit.f99208a;
    }

    @NotNull
    public final DrawerValue getCurrentValue() {
        return this.swipeableState.getCurrentValue();
    }

    @ExperimentalMaterialApi
    @NotNull
    public final State<Float> getOffset() {
        return this.swipeableState.getOffset();
    }

    @NotNull
    public final SwipeableState<DrawerValue> getSwipeableState$material_release() {
        return this.swipeableState;
    }

    @ExperimentalMaterialApi
    @NotNull
    public final DrawerValue getTargetValue() {
        return this.swipeableState.getTargetValue();
    }

    public final boolean isAnimationRunning() {
        return this.swipeableState.isAnimationRunning();
    }

    public final boolean isClosed() {
        if (getCurrentValue() == DrawerValue.Closed) {
            return true;
        }
        return false;
    }

    public final boolean isOpen() {
        if (getCurrentValue() == DrawerValue.Open) {
            return true;
        }
        return false;
    }

    @Nullable
    public final Object open(@NotNull Continuation<? super Unit> continuation) {
        Object m6959e;
        Object animateTo = animateTo(DrawerValue.Open, DrawerKt.access$getAnimationSpec$p(), continuation);
        m6959e = C42688d.m6959e();
        if (animateTo == m6959e) {
            return animateTo;
        }
        return Unit.f99208a;
    }

    @ExperimentalMaterialApi
    @Nullable
    public final Object snapTo(@NotNull DrawerValue drawerValue, @NotNull Continuation<? super Unit> continuation) {
        Object m6959e;
        Object snapTo = this.swipeableState.snapTo(drawerValue, continuation);
        m6959e = C42688d.m6959e();
        if (snapTo == m6959e) {
            return snapTo;
        }
        return Unit.f99208a;
    }

    public /* synthetic */ DrawerState(DrawerValue drawerValue, Function1 function1, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(drawerValue, (i & 2) != 0 ? C07161.INSTANCE : function1);
    }

    @ExperimentalMaterialApi
    public static /* synthetic */ void getOffset$annotations() {
    }

    @ExperimentalMaterialApi
    public static /* synthetic */ void getTargetValue$annotations() {
    }
}
