package androidx.compose.p015ui.viewinterop;

import androidx.compose.p015ui.semantics.SemanticsPropertyReceiver;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* compiled from: AndroidView.android.kt */
@Metadata
/* renamed from: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$modifierWithSemantics$1 */
/* loaded from: classes.dex */
final class AndroidView_androidKt$AndroidView$modifierWithSemantics$1 extends Lambda implements Function1<SemanticsPropertyReceiver, Unit> {
    public static final AndroidView_androidKt$AndroidView$modifierWithSemantics$1 INSTANCE = new AndroidView_androidKt$AndroidView$modifierWithSemantics$1();

    AndroidView_androidKt$AndroidView$modifierWithSemantics$1() {
        super(1);
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull SemanticsPropertyReceiver semantics) {
        Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        invoke2(semanticsPropertyReceiver);
        return Unit.f99208a;
    }
}
