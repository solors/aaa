package androidx.compose.foundation;

import androidx.compose.p015ui.platform.InspectorInfo;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* compiled from: InspectableValue.kt */
@Metadata
/* renamed from: androidx.compose.foundation.FocusedBoundsKt$onFocusedBoundsChanged$$inlined$debugInspectorInfo$1 */
/* loaded from: classes.dex */
public final class C0409x5a20c36e extends Lambda implements Function1<InspectorInfo, Unit> {
    final /* synthetic */ Function1 $onPositioned$inlined;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0409x5a20c36e(Function1 function1) {
        super(1);
        this.$onPositioned$inlined = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(InspectorInfo inspectorInfo) {
        invoke2(inspectorInfo);
        return Unit.f99208a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull InspectorInfo inspectorInfo) {
        Intrinsics.checkNotNullParameter(inspectorInfo, "$this$null");
        inspectorInfo.setName("onFocusedBoundsChanged");
        inspectorInfo.getProperties().set("onPositioned", this.$onPositioned$inlined);
    }
}
