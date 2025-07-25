package androidx.compose.p015ui.platform;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Functions;
import kotlin.jvm.internal.Lambda;

/* compiled from: ViewCompositionStrategy.android.kt */
@Metadata
/* renamed from: androidx.compose.ui.platform.ViewCompositionStrategy$DisposeOnDetachedFromWindow$installFor$1 */
/* loaded from: classes.dex */
final class ViewCompositionStrategy$DisposeOnDetachedFromWindow$installFor$1 extends Lambda implements Functions<Unit> {
    final /* synthetic */ View$OnAttachStateChangeListenerC0951xb3f1a111 $listener;
    final /* synthetic */ AbstractComposeView $view;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewCompositionStrategy$DisposeOnDetachedFromWindow$installFor$1(AbstractComposeView abstractComposeView, View$OnAttachStateChangeListenerC0951xb3f1a111 view$OnAttachStateChangeListenerC0951xb3f1a111) {
        super(0);
        this.$view = abstractComposeView;
        this.$listener = view$OnAttachStateChangeListenerC0951xb3f1a111;
    }

    @Override // kotlin.jvm.functions.Functions
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.f99208a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$view.removeOnAttachStateChangeListener(this.$listener);
    }
}
