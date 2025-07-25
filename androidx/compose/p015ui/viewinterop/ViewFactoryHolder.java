package androidx.compose.p015ui.viewinterop;

import android.content.Context;
import android.view.View;
import androidx.compose.p015ui.input.nestedscroll.NestedScrollDispatcher;
import androidx.compose.p015ui.platform.ViewRootForInspector;
import androidx.compose.runtime.CompositionContext;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: AndroidView.android.kt */
@Metadata
/* renamed from: androidx.compose.ui.viewinterop.ViewFactoryHolder */
/* loaded from: classes.dex */
public final class ViewFactoryHolder<T extends View> extends AndroidViewHolder implements ViewRootForInspector {
    @Nullable
    private Function1<? super Context, ? extends T> factory;
    @Nullable
    private T typedView;
    @NotNull
    private Function1<? super T, Unit> updateBlock;

    public /* synthetic */ ViewFactoryHolder(Context context, CompositionContext compositionContext, NestedScrollDispatcher nestedScrollDispatcher, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : compositionContext, (i & 4) != 0 ? new NestedScrollDispatcher() : nestedScrollDispatcher);
    }

    @Nullable
    public final Function1<Context, T> getFactory() {
        return (Function1<? super Context, ? extends T>) this.factory;
    }

    @Nullable
    public final T getTypedView$ui_release() {
        return this.typedView;
    }

    @NotNull
    public final Function1<T, Unit> getUpdateBlock() {
        return (Function1<? super T, Unit>) this.updateBlock;
    }

    public final void setFactory(@Nullable Function1<? super Context, ? extends T> function1) {
        this.factory = function1;
        if (function1 != null) {
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "context");
            T invoke = function1.invoke(context);
            this.typedView = invoke;
            setView$ui_release(invoke);
        }
    }

    public final void setTypedView$ui_release(@Nullable T t) {
        this.typedView = t;
    }

    public final void setUpdateBlock(@NotNull Function1<? super T, Unit> value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.updateBlock = value;
        setUpdate(new ViewFactoryHolder$updateBlock$1(this));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewFactoryHolder(@NotNull Context context, @Nullable CompositionContext compositionContext, @NotNull NestedScrollDispatcher dispatcher) {
        super(context, compositionContext, dispatcher);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
        this.updateBlock = AndroidView_androidKt.getNoOpUpdate();
    }

    @Override // androidx.compose.p015ui.platform.ViewRootForInspector
    @NotNull
    public View getViewRoot() {
        return this;
    }
}
