package androidx.compose.p015ui.viewinterop;

import android.view.View;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Functions;
import kotlin.jvm.internal.Lambda;

/* compiled from: AndroidView.android.kt */
@Metadata
/* renamed from: androidx.compose.ui.viewinterop.ViewFactoryHolder$updateBlock$1 */
/* loaded from: classes.dex */
final class ViewFactoryHolder$updateBlock$1 extends Lambda implements Functions<Unit> {
    final /* synthetic */ ViewFactoryHolder<T> this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewFactoryHolder$updateBlock$1(ViewFactoryHolder<T> viewFactoryHolder) {
        super(0);
        this.this$0 = viewFactoryHolder;
    }

    @Override // kotlin.jvm.functions.Functions
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.f99208a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        View typedView$ui_release = this.this$0.getTypedView$ui_release();
        if (typedView$ui_release != null) {
            this.this$0.getUpdateBlock().invoke(typedView$ui_release);
        }
    }
}
