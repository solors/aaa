package androidx.compose.foundation.layout;

import androidx.compose.p015ui.layout.HorizontalAlignmentLine;
import androidx.compose.p015ui.platform.InspectorInfo;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* compiled from: InspectableValue.kt */
@Metadata
/* loaded from: classes.dex */
public final class RowScopeInstance$alignBy$$inlined$debugInspectorInfo$1 extends Lambda implements Function1<InspectorInfo, Unit> {
    final /* synthetic */ HorizontalAlignmentLine $alignmentLine$inlined;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RowScopeInstance$alignBy$$inlined$debugInspectorInfo$1(HorizontalAlignmentLine horizontalAlignmentLine) {
        super(1);
        this.$alignmentLine$inlined = horizontalAlignmentLine;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(InspectorInfo inspectorInfo) {
        invoke2(inspectorInfo);
        return Unit.f99208a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull InspectorInfo inspectorInfo) {
        Intrinsics.checkNotNullParameter(inspectorInfo, "$this$null");
        inspectorInfo.setName("alignBy");
        inspectorInfo.setValue(this.$alignmentLine$inlined);
    }
}
