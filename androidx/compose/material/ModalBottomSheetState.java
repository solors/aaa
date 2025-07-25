package androidx.compose.material;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.p015ui.input.nestedscroll.NestedScrollModifier;
import androidx.compose.runtime.internal.StabilityInferred;
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

/* compiled from: ModalBottomSheet.kt */
@StabilityInferred(parameters = 0)
@Metadata
@ExperimentalMaterialApi
/* loaded from: classes.dex */
public final class ModalBottomSheetState extends SwipeableState<ModalBottomSheetValue> {
    public static final int $stable = 0;
    @NotNull
    public static final Companion Companion = new Companion(null);
    private final boolean isSkipHalfExpanded;
    @NotNull
    private final NestedScrollModifier nestedScrollConnection;

    /* compiled from: ModalBottomSheet.kt */
    @Metadata
    /* renamed from: androidx.compose.material.ModalBottomSheetState$1 */
    /* loaded from: classes.dex */
    static final class C07421 extends Lambda implements Function1<ModalBottomSheetValue, Boolean> {
        public static final C07421 INSTANCE = new C07421();

        C07421() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        public final Boolean invoke(@NotNull ModalBottomSheetValue it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Boolean.TRUE;
        }
    }

    /* compiled from: ModalBottomSheet.kt */
    @Metadata
    /* renamed from: androidx.compose.material.ModalBottomSheetState$2 */
    /* loaded from: classes.dex */
    static final class C07432 extends Lambda implements Function1<ModalBottomSheetValue, Boolean> {
        public static final C07432 INSTANCE = new C07432();

        C07432() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        public final Boolean invoke(@NotNull ModalBottomSheetValue it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Boolean.TRUE;
        }
    }

    /* compiled from: ModalBottomSheet.kt */
    @Metadata
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final Saver<ModalBottomSheetState, ?> Saver(@NotNull AnimationSpec<Float> animationSpec, boolean z, @NotNull Function1<? super ModalBottomSheetValue, Boolean> confirmStateChange) {
            Intrinsics.checkNotNullParameter(animationSpec, "animationSpec");
            Intrinsics.checkNotNullParameter(confirmStateChange, "confirmStateChange");
            return SaverKt.Saver(ModalBottomSheetState$Companion$Saver$1.INSTANCE, new ModalBottomSheetState$Companion$Saver$2(animationSpec, z, confirmStateChange));
        }

        @NotNull
        public final Saver<ModalBottomSheetState, ?> Saver(@NotNull AnimationSpec<Float> animationSpec, @NotNull Function1<? super ModalBottomSheetValue, Boolean> confirmStateChange) {
            Intrinsics.checkNotNullParameter(animationSpec, "animationSpec");
            Intrinsics.checkNotNullParameter(confirmStateChange, "confirmStateChange");
            return Saver(animationSpec, false, confirmStateChange);
        }
    }

    public /* synthetic */ ModalBottomSheetState(ModalBottomSheetValue modalBottomSheetValue, AnimationSpec animationSpec, boolean z, Function1 function1, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(modalBottomSheetValue, (i & 2) != 0 ? SwipeableDefaults.INSTANCE.getAnimationSpec() : animationSpec, z, (i & 8) != 0 ? C07421.INSTANCE : function1);
    }

    @Nullable
    public final Object expand$material_release(@NotNull Continuation<? super Unit> continuation) {
        Object m6959e;
        Object animateTo$default = SwipeableState.animateTo$default(this, ModalBottomSheetValue.Expanded, null, continuation, 2, null);
        m6959e = C42688d.m6959e();
        if (animateTo$default == m6959e) {
            return animateTo$default;
        }
        return Unit.f99208a;
    }

    public final boolean getHasHalfExpandedState$material_release() {
        return getAnchors$material_release().values().contains(ModalBottomSheetValue.HalfExpanded);
    }

    @NotNull
    public final NestedScrollModifier getNestedScrollConnection$material_release() {
        return this.nestedScrollConnection;
    }

    @Nullable
    public final Object halfExpand$material_release(@NotNull Continuation<? super Unit> continuation) {
        Object m6959e;
        if (!getHasHalfExpandedState$material_release()) {
            return Unit.f99208a;
        }
        Object animateTo$default = SwipeableState.animateTo$default(this, ModalBottomSheetValue.HalfExpanded, null, continuation, 2, null);
        m6959e = C42688d.m6959e();
        if (animateTo$default == m6959e) {
            return animateTo$default;
        }
        return Unit.f99208a;
    }

    @Nullable
    public final Object hide(@NotNull Continuation<? super Unit> continuation) {
        Object m6959e;
        Object animateTo$default = SwipeableState.animateTo$default(this, ModalBottomSheetValue.Hidden, null, continuation, 2, null);
        m6959e = C42688d.m6959e();
        if (animateTo$default == m6959e) {
            return animateTo$default;
        }
        return Unit.f99208a;
    }

    public final boolean isSkipHalfExpanded$material_release() {
        return this.isSkipHalfExpanded;
    }

    public final boolean isVisible() {
        if (getCurrentValue() != ModalBottomSheetValue.Hidden) {
            return true;
        }
        return false;
    }

    @Nullable
    public final Object show(@NotNull Continuation<? super Unit> continuation) {
        ModalBottomSheetValue modalBottomSheetValue;
        Object m6959e;
        if (getHasHalfExpandedState$material_release()) {
            modalBottomSheetValue = ModalBottomSheetValue.HalfExpanded;
        } else {
            modalBottomSheetValue = ModalBottomSheetValue.Expanded;
        }
        Object animateTo$default = SwipeableState.animateTo$default(this, modalBottomSheetValue, null, continuation, 2, null);
        m6959e = C42688d.m6959e();
        if (animateTo$default == m6959e) {
            return animateTo$default;
        }
        return Unit.f99208a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ModalBottomSheetState(@NotNull ModalBottomSheetValue initialValue, @NotNull AnimationSpec<Float> animationSpec, boolean z, @NotNull Function1<? super ModalBottomSheetValue, Boolean> confirmStateChange) {
        super(initialValue, animationSpec, confirmStateChange);
        Intrinsics.checkNotNullParameter(initialValue, "initialValue");
        Intrinsics.checkNotNullParameter(animationSpec, "animationSpec");
        Intrinsics.checkNotNullParameter(confirmStateChange, "confirmStateChange");
        this.isSkipHalfExpanded = z;
        if (z) {
            if (!(initialValue != ModalBottomSheetValue.HalfExpanded)) {
                throw new IllegalArgumentException("The initial value must not be set to HalfExpanded if skipHalfExpanded is set to true.".toString());
            }
        }
        this.nestedScrollConnection = SwipeableKt.getPreUpPostDownNestedScrollConnection(this);
    }

    public /* synthetic */ ModalBottomSheetState(ModalBottomSheetValue modalBottomSheetValue, AnimationSpec animationSpec, Function1 function1, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(modalBottomSheetValue, (i & 2) != 0 ? SwipeableDefaults.INSTANCE.getAnimationSpec() : animationSpec, (i & 4) != 0 ? C07432.INSTANCE : function1);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ModalBottomSheetState(@NotNull ModalBottomSheetValue initialValue, @NotNull AnimationSpec<Float> animationSpec, @NotNull Function1<? super ModalBottomSheetValue, Boolean> confirmStateChange) {
        this(initialValue, animationSpec, false, confirmStateChange);
        Intrinsics.checkNotNullParameter(initialValue, "initialValue");
        Intrinsics.checkNotNullParameter(animationSpec, "animationSpec");
        Intrinsics.checkNotNullParameter(confirmStateChange, "confirmStateChange");
    }
}
