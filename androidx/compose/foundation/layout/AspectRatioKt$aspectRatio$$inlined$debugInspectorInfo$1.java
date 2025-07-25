package androidx.compose.foundation.layout;

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
public final class AspectRatioKt$aspectRatio$$inlined$debugInspectorInfo$1 extends Lambda implements Function1<InspectorInfo, Unit> {
    final /* synthetic */ boolean $matchHeightConstraintsFirst$inlined;
    final /* synthetic */ float $ratio$inlined;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AspectRatioKt$aspectRatio$$inlined$debugInspectorInfo$1(float f, boolean z) {
        super(1);
        this.$ratio$inlined = f;
        this.$matchHeightConstraintsFirst$inlined = z;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(InspectorInfo inspectorInfo) {
        invoke2(inspectorInfo);
        return Unit.f99208a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull InspectorInfo inspectorInfo) {
        Intrinsics.checkNotNullParameter(inspectorInfo, "$this$null");
        inspectorInfo.setName("aspectRatio");
        inspectorInfo.getProperties().set("ratio", Float.valueOf(this.$ratio$inlined));
        inspectorInfo.getProperties().set("matchHeightConstraintsFirst", Boolean.valueOf(this.$matchHeightConstraintsFirst$inlined));
    }
}
