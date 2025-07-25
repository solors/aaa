package androidx.compose.p015ui.layout;

import androidx.compose.p015ui.platform.InspectorInfo;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import p1076zd.InterfaceC45268n;

/* compiled from: InspectableValue.kt */
@Metadata
/* renamed from: androidx.compose.ui.layout.LayoutModifierKt$layout$$inlined$debugInspectorInfo$1 */
/* loaded from: classes.dex */
public final class LayoutModifierKt$layout$$inlined$debugInspectorInfo$1 extends Lambda implements Function1<InspectorInfo, Unit> {
    final /* synthetic */ InterfaceC45268n $measure$inlined;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LayoutModifierKt$layout$$inlined$debugInspectorInfo$1(InterfaceC45268n interfaceC45268n) {
        super(1);
        this.$measure$inlined = interfaceC45268n;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(InspectorInfo inspectorInfo) {
        invoke2(inspectorInfo);
        return Unit.f99208a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull InspectorInfo inspectorInfo) {
        Intrinsics.checkNotNullParameter(inspectorInfo, "$this$null");
        inspectorInfo.setName("layout");
        inspectorInfo.getProperties().set("measure", this.$measure$inlined);
    }
}
