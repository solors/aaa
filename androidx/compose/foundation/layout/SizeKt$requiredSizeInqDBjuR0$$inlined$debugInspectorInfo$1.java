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
/* renamed from: androidx.compose.foundation.layout.SizeKt$requiredSizeIn-qDBjuR0$$inlined$debugInspectorInfo$1  reason: invalid class name */
/* loaded from: classes.dex */
public final class SizeKt$requiredSizeInqDBjuR0$$inlined$debugInspectorInfo$1 extends Lambda implements Function1<InspectorInfo, Unit> {
    final /* synthetic */ float $maxHeight$inlined;
    final /* synthetic */ float $maxWidth$inlined;
    final /* synthetic */ float $minHeight$inlined;
    final /* synthetic */ float $minWidth$inlined;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SizeKt$requiredSizeInqDBjuR0$$inlined$debugInspectorInfo$1(float f, float f2, float f3, float f4) {
        super(1);
        this.$minWidth$inlined = f;
        this.$minHeight$inlined = f2;
        this.$maxWidth$inlined = f3;
        this.$maxHeight$inlined = f4;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(InspectorInfo inspectorInfo) {
        invoke2(inspectorInfo);
        return Unit.f99208a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull InspectorInfo inspectorInfo) {
        Intrinsics.checkNotNullParameter(inspectorInfo, "$this$null");
        inspectorInfo.setName("requiredSizeIn");
        inspectorInfo.getProperties().set("minWidth", C1059Dp.m109732boximpl(this.$minWidth$inlined));
        inspectorInfo.getProperties().set("minHeight", C1059Dp.m109732boximpl(this.$minHeight$inlined));
        inspectorInfo.getProperties().set("maxWidth", C1059Dp.m109732boximpl(this.$maxWidth$inlined));
        inspectorInfo.getProperties().set("maxHeight", C1059Dp.m109732boximpl(this.$maxHeight$inlined));
    }
}
