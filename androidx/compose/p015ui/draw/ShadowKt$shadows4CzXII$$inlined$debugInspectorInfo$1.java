package androidx.compose.p015ui.draw;

import androidx.compose.p015ui.graphics.Color;
import androidx.compose.p015ui.graphics.Shape;
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
/* renamed from: androidx.compose.ui.draw.ShadowKt$shadow-s4CzXII$$inlined$debugInspectorInfo$1  reason: invalid class name */
/* loaded from: classes.dex */
public final class ShadowKt$shadows4CzXII$$inlined$debugInspectorInfo$1 extends Lambda implements Function1<InspectorInfo, Unit> {
    final /* synthetic */ long $ambientColor$inlined;
    final /* synthetic */ boolean $clip$inlined;
    final /* synthetic */ float $elevation$inlined;
    final /* synthetic */ Shape $shape$inlined;
    final /* synthetic */ long $spotColor$inlined;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShadowKt$shadows4CzXII$$inlined$debugInspectorInfo$1(float f, Shape shape, boolean z, long j, long j2) {
        super(1);
        this.$elevation$inlined = f;
        this.$shape$inlined = shape;
        this.$clip$inlined = z;
        this.$ambientColor$inlined = j;
        this.$spotColor$inlined = j2;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(InspectorInfo inspectorInfo) {
        invoke2(inspectorInfo);
        return Unit.f99208a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull InspectorInfo inspectorInfo) {
        Intrinsics.checkNotNullParameter(inspectorInfo, "$this$null");
        inspectorInfo.setName("shadow");
        inspectorInfo.getProperties().set("elevation", C1059Dp.m109732boximpl(this.$elevation$inlined));
        inspectorInfo.getProperties().set("shape", this.$shape$inlined);
        inspectorInfo.getProperties().set("clip", Boolean.valueOf(this.$clip$inlined));
        inspectorInfo.getProperties().set("ambientColor", Color.m107517boximpl(this.$ambientColor$inlined));
        inspectorInfo.getProperties().set("spotColor", Color.m107517boximpl(this.$spotColor$inlined));
    }
}
