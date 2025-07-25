package androidx.compose.foundation.selection;

import androidx.compose.p015ui.semantics.SemanticsPropertiesKt;
import androidx.compose.p015ui.semantics.SemanticsPropertyReceiver;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* compiled from: SelectableGroup.kt */
@Metadata
/* loaded from: classes.dex */
final class SelectableGroupKt$selectableGroup$1 extends Lambda implements Function1<SemanticsPropertyReceiver, Unit> {
    public static final SelectableGroupKt$selectableGroup$1 INSTANCE = new SelectableGroupKt$selectableGroup$1();

    SelectableGroupKt$selectableGroup$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        invoke2(semanticsPropertyReceiver);
        return Unit.f99208a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull SemanticsPropertyReceiver semantics) {
        Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
        SemanticsPropertiesKt.selectableGroup(semantics);
    }
}
