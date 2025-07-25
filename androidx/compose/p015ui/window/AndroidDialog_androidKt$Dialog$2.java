package androidx.compose.p015ui.window;

import androidx.compose.p015ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Functions;
import kotlin.jvm.internal.Lambda;

/* compiled from: AndroidDialog.android.kt */
@Metadata
/* renamed from: androidx.compose.ui.window.AndroidDialog_androidKt$Dialog$2 */
/* loaded from: classes.dex */
final class AndroidDialog_androidKt$Dialog$2 extends Lambda implements Functions<Unit> {
    final /* synthetic */ DialogWrapper $dialog;
    final /* synthetic */ LayoutDirection $layoutDirection;
    final /* synthetic */ Functions<Unit> $onDismissRequest;
    final /* synthetic */ DialogProperties $properties;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidDialog_androidKt$Dialog$2(DialogWrapper dialogWrapper, Functions<Unit> functions, DialogProperties dialogProperties, LayoutDirection layoutDirection) {
        super(0);
        this.$dialog = dialogWrapper;
        this.$onDismissRequest = functions;
        this.$properties = dialogProperties;
        this.$layoutDirection = layoutDirection;
    }

    @Override // kotlin.jvm.functions.Functions
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.f99208a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$dialog.updateParameters(this.$onDismissRequest, this.$properties, this.$layoutDirection);
    }
}
