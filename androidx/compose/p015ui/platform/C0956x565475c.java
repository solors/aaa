package androidx.compose.p015ui.platform;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Functions;
import kotlin.jvm.internal.C37609n0;
import kotlin.jvm.internal.Lambda;

/* compiled from: ViewCompositionStrategy.android.kt */
@Metadata
/* renamed from: androidx.compose.ui.platform.ViewCompositionStrategy$DisposeOnViewTreeLifecycleDestroyed$installFor$2 */
/* loaded from: classes.dex */
final class C0956x565475c extends Lambda implements Functions<Unit> {
    final /* synthetic */ C37609n0<Functions<Unit>> $disposer;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0956x565475c(C37609n0<Functions<Unit>> c37609n0) {
        super(0);
        this.$disposer = c37609n0;
    }

    @Override // kotlin.jvm.functions.Functions
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.f99208a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$disposer.f99327b.invoke();
    }
}
