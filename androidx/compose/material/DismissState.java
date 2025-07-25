package androidx.compose.material;

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

/* compiled from: SwipeToDismiss.kt */
@StabilityInferred(parameters = 0)
@Metadata
@ExperimentalMaterialApi
/* loaded from: classes.dex */
public final class DismissState extends SwipeableState<DismissValue> {
    public static final int $stable = 0;
    @NotNull
    public static final Companion Companion = new Companion(null);

    /* compiled from: SwipeToDismiss.kt */
    @Metadata
    /* renamed from: androidx.compose.material.DismissState$1 */
    /* loaded from: classes.dex */
    static final class C07031 extends Lambda implements Function1<DismissValue, Boolean> {
        public static final C07031 INSTANCE = new C07031();

        C07031() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        public final Boolean invoke(@NotNull DismissValue it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Boolean.TRUE;
        }
    }

    /* compiled from: SwipeToDismiss.kt */
    @Metadata
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final Saver<DismissState, DismissValue> Saver(@NotNull Function1<? super DismissValue, Boolean> confirmStateChange) {
            Intrinsics.checkNotNullParameter(confirmStateChange, "confirmStateChange");
            return SaverKt.Saver(DismissState$Companion$Saver$1.INSTANCE, new DismissState$Companion$Saver$2(confirmStateChange));
        }
    }

    public /* synthetic */ DismissState(DismissValue dismissValue, Function1 function1, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(dismissValue, (i & 2) != 0 ? C07031.INSTANCE : function1);
    }

    @Nullable
    public final Object dismiss(@NotNull SwipeToDismiss swipeToDismiss, @NotNull Continuation<? super Unit> continuation) {
        DismissValue dismissValue;
        Object m6959e;
        if (swipeToDismiss == SwipeToDismiss.StartToEnd) {
            dismissValue = DismissValue.DismissedToEnd;
        } else {
            dismissValue = DismissValue.DismissedToStart;
        }
        Object animateTo$default = SwipeableState.animateTo$default(this, dismissValue, null, continuation, 2, null);
        m6959e = C42688d.m6959e();
        if (animateTo$default == m6959e) {
            return animateTo$default;
        }
        return Unit.f99208a;
    }

    @Nullable
    public final SwipeToDismiss getDismissDirection() {
        boolean z;
        if (getOffset().getValue().floatValue() == 0.0f) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return null;
        }
        if (getOffset().getValue().floatValue() > 0.0f) {
            return SwipeToDismiss.StartToEnd;
        }
        return SwipeToDismiss.EndToStart;
    }

    public final boolean isDismissed(@NotNull SwipeToDismiss direction) {
        DismissValue dismissValue;
        Intrinsics.checkNotNullParameter(direction, "direction");
        DismissValue currentValue = getCurrentValue();
        if (direction == SwipeToDismiss.StartToEnd) {
            dismissValue = DismissValue.DismissedToEnd;
        } else {
            dismissValue = DismissValue.DismissedToStart;
        }
        if (currentValue == dismissValue) {
            return true;
        }
        return false;
    }

    @Nullable
    public final Object reset(@NotNull Continuation<? super Unit> continuation) {
        Object m6959e;
        Object animateTo$default = SwipeableState.animateTo$default(this, DismissValue.Default, null, continuation, 2, null);
        m6959e = C42688d.m6959e();
        if (animateTo$default == m6959e) {
            return animateTo$default;
        }
        return Unit.f99208a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DismissState(@NotNull DismissValue initialValue, @NotNull Function1<? super DismissValue, Boolean> confirmStateChange) {
        super(initialValue, null, confirmStateChange, 2, null);
        Intrinsics.checkNotNullParameter(initialValue, "initialValue");
        Intrinsics.checkNotNullParameter(confirmStateChange, "confirmStateChange");
    }
}
