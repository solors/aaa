package androidx.compose.foundation.layout;

import androidx.compose.p015ui.platform.InspectorInfo;
import androidx.compose.p015ui.unit.C1059Dp;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* compiled from: InspectableValue.kt */
@Metadata
/* renamed from: androidx.compose.foundation.layout.PaddingKt$padding-VpY3zN4$$inlined$debugInspectorInfo$1  reason: invalid class name */
/* loaded from: classes.dex */
public final class PaddingKt$paddingVpY3zN4$$inlined$debugInspectorInfo$1 extends Lambda implements Function1<InspectorInfo, Unit> {
    final /* synthetic */ float $horizontal$inlined;
    final /* synthetic */ float $vertical$inlined;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaddingKt$paddingVpY3zN4$$inlined$debugInspectorInfo$1(float f, float f2) {
        super(1);
        this.$horizontal$inlined = f;
        this.$vertical$inlined = f2;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(InspectorInfo inspectorInfo) {
        invoke2(inspectorInfo);
        return Unit.f99208a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull InspectorInfo inspectorInfo) {
        Intrinsics.checkNotNullParameter(inspectorInfo, "$this$null");
        inspectorInfo.setName("padding");
        inspectorInfo.getProperties().set("horizontal", C1059Dp.m109732boximpl(this.$horizontal$inlined));
        inspectorInfo.getProperties().set("vertical", C1059Dp.m109732boximpl(this.$vertical$inlined));
    }
}
