package androidx.compose.material;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.p015ui.input.nestedscroll.NestedScrollModifier;
import androidx.compose.runtime.Stable;
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

/* compiled from: BottomSheetScaffold.kt */
@Metadata
@Stable
@ExperimentalMaterialApi
/* loaded from: classes.dex */
public final class BottomSheetState extends SwipeableState<BottomSheetValue> {
    @NotNull
    public static final Companion Companion = new Companion(null);
    @NotNull
    private final NestedScrollModifier nestedScrollConnection;

    /* compiled from: BottomSheetScaffold.kt */
    @Metadata
    /* renamed from: androidx.compose.material.BottomSheetState$1 */
    /* loaded from: classes.dex */
    static final class C06941 extends Lambda implements Function1<BottomSheetValue, Boolean> {
        public static final C06941 INSTANCE = new C06941();

        C06941() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        public final Boolean invoke(@NotNull BottomSheetValue it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Boolean.TRUE;
        }
    }

    /* compiled from: BottomSheetScaffold.kt */
    @Metadata
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final Saver<BottomSheetState, ?> Saver(@NotNull AnimationSpec<Float> animationSpec, @NotNull Function1<? super BottomSheetValue, Boolean> confirmStateChange) {
            Intrinsics.checkNotNullParameter(animationSpec, "animationSpec");
            Intrinsics.checkNotNullParameter(confirmStateChange, "confirmStateChange");
            return SaverKt.Saver(BottomSheetState$Companion$Saver$1.INSTANCE, new BottomSheetState$Companion$Saver$2(animationSpec, confirmStateChange));
        }
    }

    public /* synthetic */ BottomSheetState(BottomSheetValue bottomSheetValue, AnimationSpec animationSpec, Function1 function1, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(bottomSheetValue, (i & 2) != 0 ? SwipeableDefaults.INSTANCE.getAnimationSpec() : animationSpec, (i & 4) != 0 ? C06941.INSTANCE : function1);
    }

    @Nullable
    public final Object collapse(@NotNull Continuation<? super Unit> continuation) {
        Object m6959e;
        Object animateTo$default = SwipeableState.animateTo$default(this, BottomSheetValue.Collapsed, null, continuation, 2, null);
        m6959e = C42688d.m6959e();
        if (animateTo$default == m6959e) {
            return animateTo$default;
        }
        return Unit.f99208a;
    }

    @Nullable
    public final Object expand(@NotNull Continuation<? super Unit> continuation) {
        BottomSheetValue bottomSheetValue;
        Object m6959e;
        if (getHasExpandedState$material_release()) {
            bottomSheetValue = BottomSheetValue.Expanded;
        } else {
            bottomSheetValue = BottomSheetValue.Collapsed;
        }
        Object animateTo$default = SwipeableState.animateTo$default(this, bottomSheetValue, null, continuation, 2, null);
        m6959e = C42688d.m6959e();
        if (animateTo$default == m6959e) {
            return animateTo$default;
        }
        return Unit.f99208a;
    }

    public final boolean getHasExpandedState$material_release() {
        return getAnchors$material_release().containsValue(BottomSheetValue.Expanded);
    }

    @NotNull
    public final NestedScrollModifier getNestedScrollConnection$material_release() {
        return this.nestedScrollConnection;
    }

    public final boolean isCollapsed() {
        if (getCurrentValue() == BottomSheetValue.Collapsed) {
            return true;
        }
        return false;
    }

    public final boolean isExpanded() {
        if (getCurrentValue() == BottomSheetValue.Expanded) {
            return true;
        }
        return false;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BottomSheetState(@NotNull BottomSheetValue initialValue, @NotNull AnimationSpec<Float> animationSpec, @NotNull Function1<? super BottomSheetValue, Boolean> confirmStateChange) {
        super(initialValue, animationSpec, confirmStateChange);
        Intrinsics.checkNotNullParameter(initialValue, "initialValue");
        Intrinsics.checkNotNullParameter(animationSpec, "animationSpec");
        Intrinsics.checkNotNullParameter(confirmStateChange, "confirmStateChange");
        this.nestedScrollConnection = SwipeableKt.getPreUpPostDownNestedScrollConnection(this);
    }
}
