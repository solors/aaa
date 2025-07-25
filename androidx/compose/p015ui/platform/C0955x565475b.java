package androidx.compose.p015ui.platform;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Functions;
import kotlin.jvm.internal.Lambda;

/* compiled from: ViewCompositionStrategy.android.kt */
@Metadata
/* renamed from: androidx.compose.ui.platform.ViewCompositionStrategy$DisposeOnViewTreeLifecycleDestroyed$installFor$1 */
/* loaded from: classes.dex */
final class C0955x565475b extends Lambda implements Functions<Unit> {
    final /* synthetic */ View$OnAttachStateChangeListenerC0957xe2c59457 $listener;
    final /* synthetic */ AbstractComposeView $view;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0955x565475b(AbstractComposeView abstractComposeView, View$OnAttachStateChangeListenerC0957xe2c59457 view$OnAttachStateChangeListenerC0957xe2c59457) {
        super(0);
        this.$view = abstractComposeView;
        this.$listener = view$OnAttachStateChangeListenerC0957xe2c59457;
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
