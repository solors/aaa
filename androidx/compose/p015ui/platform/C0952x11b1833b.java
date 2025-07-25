package androidx.compose.p015ui.platform;

import androidx.customview.poolingcontainer.PoolingContainer;
import androidx.customview.poolingcontainer.PoolingContainerListener;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Functions;
import kotlin.jvm.internal.Lambda;

/* compiled from: ViewCompositionStrategy.android.kt */
@Metadata
/* renamed from: androidx.compose.ui.platform.ViewCompositionStrategy$DisposeOnDetachedFromWindowOrReleasedFromPool$installFor$1 */
/* loaded from: classes.dex */
final class C0952x11b1833b extends Lambda implements Functions<Unit> {
    final /* synthetic */ View$OnAttachStateChangeListenerC0953x994eb477 $listener;
    final /* synthetic */ PoolingContainerListener $poolingContainerListener;
    final /* synthetic */ AbstractComposeView $view;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0952x11b1833b(AbstractComposeView abstractComposeView, View$OnAttachStateChangeListenerC0953x994eb477 view$OnAttachStateChangeListenerC0953x994eb477, PoolingContainerListener poolingContainerListener) {
        super(0);
        this.$view = abstractComposeView;
        this.$listener = view$OnAttachStateChangeListenerC0953x994eb477;
        this.$poolingContainerListener = poolingContainerListener;
    }

    @Override // kotlin.jvm.functions.Functions
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.f99208a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$view.removeOnAttachStateChangeListener(this.$listener);
        PoolingContainer.removePoolingContainerListener(this.$view, this.$poolingContainerListener);
    }
}
