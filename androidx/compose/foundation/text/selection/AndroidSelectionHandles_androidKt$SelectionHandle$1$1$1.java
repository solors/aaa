package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.text.Handle;
import androidx.compose.p015ui.semantics.SemanticsPropertyKey;
import androidx.compose.p015ui.semantics.SemanticsPropertyReceiver;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* compiled from: AndroidSelectionHandles.android.kt */
@Metadata
/* loaded from: classes.dex */
final class AndroidSelectionHandles_androidKt$SelectionHandle$1$1$1 extends Lambda implements Function1<SemanticsPropertyReceiver, Unit> {
    final /* synthetic */ boolean $isStartHandle;
    final /* synthetic */ long $position;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidSelectionHandles_androidKt$SelectionHandle$1$1$1(boolean z, long j) {
        super(1);
        this.$isStartHandle = z;
        this.$position = j;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        invoke2(semanticsPropertyReceiver);
        return Unit.f99208a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull SemanticsPropertyReceiver semantics) {
        Handle handle;
        Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
        SemanticsPropertyKey<SelectionHandles> selectionHandleInfoKey = SelectionHandlesKt.getSelectionHandleInfoKey();
        if (this.$isStartHandle) {
            handle = Handle.SelectionStart;
        } else {
            handle = Handle.SelectionEnd;
        }
        semantics.set(selectionHandleInfoKey, new SelectionHandles(handle, this.$position, null));
    }
}
