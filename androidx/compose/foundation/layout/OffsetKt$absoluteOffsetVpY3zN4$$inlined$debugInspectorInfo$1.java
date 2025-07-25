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
/* renamed from: androidx.compose.foundation.layout.OffsetKt$absoluteOffset-VpY3zN4$$inlined$debugInspectorInfo$1  reason: invalid class name */
/* loaded from: classes.dex */
public final class OffsetKt$absoluteOffsetVpY3zN4$$inlined$debugInspectorInfo$1 extends Lambda implements Function1<InspectorInfo, Unit> {
    final /* synthetic */ float $x$inlined;
    final /* synthetic */ float $y$inlined;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OffsetKt$absoluteOffsetVpY3zN4$$inlined$debugInspectorInfo$1(float f, float f2) {
        super(1);
        this.$x$inlined = f;
        this.$y$inlined = f2;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(InspectorInfo inspectorInfo) {
        invoke2(inspectorInfo);
        return Unit.f99208a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull InspectorInfo inspectorInfo) {
        Intrinsics.checkNotNullParameter(inspectorInfo, "$this$null");
        inspectorInfo.setName("absoluteOffset");
        inspectorInfo.getProperties().set("x", C1059Dp.m109732boximpl(this.$x$inlined));
        inspectorInfo.getProperties().set("y", C1059Dp.m109732boximpl(this.$y$inlined));
    }
}
