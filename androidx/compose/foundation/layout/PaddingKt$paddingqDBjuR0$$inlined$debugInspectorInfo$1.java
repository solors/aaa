package androidx.compose.foundation.layout;

import androidx.compose.p015ui.platform.InspectorInfo;
import androidx.compose.p015ui.unit.C1059Dp;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* compiled from: InspectableValue.kt */
@Metadata
/* renamed from: androidx.compose.foundation.layout.PaddingKt$padding-qDBjuR0$$inlined$debugInspectorInfo$1  reason: invalid class name */
/* loaded from: classes.dex */
public final class PaddingKt$paddingqDBjuR0$$inlined$debugInspectorInfo$1 extends Lambda implements Function1<InspectorInfo, Unit> {
    final /* synthetic */ float $bottom$inlined;
    final /* synthetic */ float $end$inlined;
    final /* synthetic */ float $start$inlined;
    final /* synthetic */ float $top$inlined;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaddingKt$paddingqDBjuR0$$inlined$debugInspectorInfo$1(float f, float f2, float f3, float f4) {
        super(1);
        this.$start$inlined = f;
        this.$top$inlined = f2;
        this.$end$inlined = f3;
        this.$bottom$inlined = f4;
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
        inspectorInfo.getProperties().set("start", C1059Dp.m109732boximpl(this.$start$inlined));
        inspectorInfo.getProperties().set(ViewHierarchyConstants.DIMENSION_TOP_KEY, C1059Dp.m109732boximpl(this.$top$inlined));
        inspectorInfo.getProperties().set("end", C1059Dp.m109732boximpl(this.$end$inlined));
        inspectorInfo.getProperties().set("bottom", C1059Dp.m109732boximpl(this.$bottom$inlined));
    }
}
