package androidx.compose.foundation;

import androidx.compose.p015ui.graphics.Brush;
import androidx.compose.p015ui.graphics.Shape;
import androidx.compose.p015ui.platform.InspectorInfo;
import io.appmetrica.analytics.impl.C33933H2;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* compiled from: InspectableValue.kt */
@Metadata
/* loaded from: classes.dex */
public final class BackgroundKt$background$$inlined$debugInspectorInfo$1 extends Lambda implements Function1<InspectorInfo, Unit> {
    final /* synthetic */ float $alpha$inlined;
    final /* synthetic */ Brush $brush$inlined;
    final /* synthetic */ Shape $shape$inlined;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BackgroundKt$background$$inlined$debugInspectorInfo$1(float f, Brush brush, Shape shape) {
        super(1);
        this.$alpha$inlined = f;
        this.$brush$inlined = brush;
        this.$shape$inlined = shape;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(InspectorInfo inspectorInfo) {
        invoke2(inspectorInfo);
        return Unit.f99208a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull InspectorInfo inspectorInfo) {
        Intrinsics.checkNotNullParameter(inspectorInfo, "$this$null");
        inspectorInfo.setName(C33933H2.f92945g);
        inspectorInfo.getProperties().set("alpha", Float.valueOf(this.$alpha$inlined));
        inspectorInfo.getProperties().set("brush", this.$brush$inlined);
        inspectorInfo.getProperties().set("shape", this.$shape$inlined);
    }
}
