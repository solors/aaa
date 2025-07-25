package androidx.compose.material;

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

@StabilityInferred(parameters = 0)
@Metadata
@ExperimentalMaterialApi
/* renamed from: androidx.compose.material.BottomDrawerState */
/* loaded from: classes.dex */
public final class Drawer extends SwipeableState<BottomDrawerValue> {
    public static final int $stable = 0;
    @NotNull
    public static final Companion Companion = new Companion(null);
    @NotNull
    private final NestedScrollModifier nestedScrollConnection;

    /* compiled from: Drawer.kt */
    @Metadata
    /* renamed from: androidx.compose.material.BottomDrawerState$1 */
    /* loaded from: classes.dex */
    static final class C06821 extends Lambda implements Function1<BottomDrawerValue, Boolean> {
        public static final C06821 INSTANCE = new C06821();

        C06821() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        public final Boolean invoke(@NotNull BottomDrawerValue it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Boolean.TRUE;
        }
    }

    /* compiled from: Drawer.kt */
    @Metadata
    /* renamed from: androidx.compose.material.BottomDrawerState$Companion */
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final Saver<Drawer, BottomDrawerValue> Saver(@NotNull Function1<? super BottomDrawerValue, Boolean> confirmStateChange) {
            Intrinsics.checkNotNullParameter(confirmStateChange, "confirmStateChange");
            return SaverKt.Saver(BottomDrawerState$Companion$Saver$1.INSTANCE, new BottomDrawerState$Companion$Saver$2(confirmStateChange));
        }
    }

    public /* synthetic */ Drawer(BottomDrawerValue bottomDrawerValue, Function1 function1, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(bottomDrawerValue, (i & 2) != 0 ? C06821.INSTANCE : function1);
    }

    private final boolean isOpenEnabled() {
        return getAnchors$material_release().values().contains(BottomDrawerValue.Open);
    }

    @Nullable
    public final Object close(@NotNull Continuation<? super Unit> continuation) {
        Object m6959e;
        Object animateTo$default = SwipeableState.animateTo$default(this, BottomDrawerValue.Closed, null, continuation, 2, null);
        m6959e = C42688d.m6959e();
        if (animateTo$default == m6959e) {
            return animateTo$default;
        }
        return Unit.f99208a;
    }

    @Nullable
    public final Object expand(@NotNull Continuation<? super Unit> continuation) {
        Object m6959e;
        Object animateTo$default = SwipeableState.animateTo$default(this, BottomDrawerValue.Expanded, null, continuation, 2, null);
        m6959e = C42688d.m6959e();
        if (animateTo$default == m6959e) {
            return animateTo$default;
        }
        return Unit.f99208a;
    }

    @NotNull
    public final NestedScrollModifier getNestedScrollConnection$material_release() {
        return this.nestedScrollConnection;
    }

    public final boolean isClosed() {
        if (getCurrentValue() == BottomDrawerValue.Closed) {
            return true;
        }
        return false;
    }

    public final boolean isExpanded() {
        if (getCurrentValue() == BottomDrawerValue.Expanded) {
            return true;
        }
        return false;
    }

    public final boolean isOpen() {
        if (getCurrentValue() != BottomDrawerValue.Closed) {
            return true;
        }
        return false;
    }

    @Nullable
    public final Object open(@NotNull Continuation<? super Unit> continuation) {
        BottomDrawerValue bottomDrawerValue;
        Object m6959e;
        if (isOpenEnabled()) {
            bottomDrawerValue = BottomDrawerValue.Open;
        } else {
            bottomDrawerValue = BottomDrawerValue.Expanded;
        }
        Object animateTo$default = SwipeableState.animateTo$default(this, bottomDrawerValue, null, continuation, 2, null);
        m6959e = C42688d.m6959e();
        if (animateTo$default == m6959e) {
            return animateTo$default;
        }
        return Unit.f99208a;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public Drawer(@org.jetbrains.annotations.NotNull androidx.compose.material.BottomDrawerValue r2, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super androidx.compose.material.BottomDrawerValue, java.lang.Boolean> r3) {
        /*
            r1 = this;
            java.lang.String r0 = "initialValue"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "confirmStateChange"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            androidx.compose.animation.core.TweenSpec r0 = androidx.compose.material.DrawerKt.access$getAnimationSpec$p()
            r1.<init>(r2, r0, r3)
            androidx.compose.ui.input.nestedscroll.NestedScrollConnection r2 = androidx.compose.material.SwipeableKt.getPreUpPostDownNestedScrollConnection(r1)
            r1.nestedScrollConnection = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.Drawer.<init>(androidx.compose.material.BottomDrawerValue, kotlin.jvm.functions.Function1):void");
    }
}
