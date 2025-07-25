package androidx.compose.foundation.text;

import androidx.compose.foundation.text.selection.SelectionHandles;
import androidx.compose.foundation.text.selection.SelectionHandlesKt;
import androidx.compose.p015ui.semantics.SemanticsPropertyReceiver;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* compiled from: CoreTextField.kt */
@Metadata
/* loaded from: classes.dex */
final class CoreTextFieldKt$TextFieldCursorHandle$2$1 extends Lambda implements Function1<SemanticsPropertyReceiver, Unit> {
    final /* synthetic */ long $position;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoreTextFieldKt$TextFieldCursorHandle$2$1(long j) {
        super(1);
        this.$position = j;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        invoke2(semanticsPropertyReceiver);
        return Unit.f99208a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull SemanticsPropertyReceiver semantics) {
        Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
        semantics.set(SelectionHandlesKt.getSelectionHandleInfoKey(), new SelectionHandles(Handle.Cursor, this.$position, null));
    }
}
