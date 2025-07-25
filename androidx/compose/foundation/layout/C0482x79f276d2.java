package androidx.compose.foundation.layout;

import androidx.compose.p015ui.layout.AlignmentLine;
import androidx.compose.p015ui.platform.InspectorInfo;
import androidx.compose.p015ui.unit.TextUnit;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* compiled from: InspectableValue.kt */
@Metadata
/* renamed from: androidx.compose.foundation.layout.AlignmentLineKt$paddingFrom-Y_r0B1c$$inlined$debugInspectorInfo$1 */
/* loaded from: classes.dex */
public final class C0482x79f276d2 extends Lambda implements Function1<InspectorInfo, Unit> {
    final /* synthetic */ long $after$inlined;
    final /* synthetic */ AlignmentLine $alignmentLine$inlined;
    final /* synthetic */ long $before$inlined;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0482x79f276d2(AlignmentLine alignmentLine, long j, long j2) {
        super(1);
        this.$alignmentLine$inlined = alignmentLine;
        this.$before$inlined = j;
        this.$after$inlined = j2;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(InspectorInfo inspectorInfo) {
        invoke2(inspectorInfo);
        return Unit.f99208a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull InspectorInfo inspectorInfo) {
        Intrinsics.checkNotNullParameter(inspectorInfo, "$this$null");
        inspectorInfo.setName("paddingFrom");
        inspectorInfo.getProperties().set("alignmentLine", this.$alignmentLine$inlined);
        inspectorInfo.getProperties().set("before", TextUnit.m109905boximpl(this.$before$inlined));
        inspectorInfo.getProperties().set("after", TextUnit.m109905boximpl(this.$after$inlined));
    }
}
