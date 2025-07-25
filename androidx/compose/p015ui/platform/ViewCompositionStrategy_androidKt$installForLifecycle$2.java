package androidx.compose.p015ui.platform;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Functions;
import kotlin.jvm.internal.Lambda;

/* compiled from: ViewCompositionStrategy.android.kt */
@Metadata
/* renamed from: androidx.compose.ui.platform.ViewCompositionStrategy_androidKt$installForLifecycle$2 */
/* loaded from: classes.dex */
final class ViewCompositionStrategy_androidKt$installForLifecycle$2 extends Lambda implements Functions<Unit> {
    final /* synthetic */ Lifecycle $lifecycle;
    final /* synthetic */ LifecycleEventObserver $observer;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewCompositionStrategy_androidKt$installForLifecycle$2(Lifecycle lifecycle, LifecycleEventObserver lifecycleEventObserver) {
        super(0);
        this.$lifecycle = lifecycle;
        this.$observer = lifecycleEventObserver;
    }

    @Override // kotlin.jvm.functions.Functions
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.f99208a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$lifecycle.removeObserver(this.$observer);
    }
}
