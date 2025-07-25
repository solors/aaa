package androidx.compose.material;

import androidx.compose.foundation.interaction.InteractionSource;
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
/* renamed from: androidx.compose.material.TextFieldDefaults$indicatorLine-gv0btCI$$inlined$debugInspectorInfo$1 */
/* loaded from: classes.dex */
public final class C0793x343b27c2 extends Lambda implements Function1<InspectorInfo, Unit> {
    final /* synthetic */ TextFieldColors $colors$inlined;
    final /* synthetic */ boolean $enabled$inlined;
    final /* synthetic */ float $focusedIndicatorLineThickness$inlined;
    final /* synthetic */ InteractionSource $interactionSource$inlined;
    final /* synthetic */ boolean $isError$inlined;
    final /* synthetic */ float $unfocusedIndicatorLineThickness$inlined;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0793x343b27c2(boolean z, boolean z2, InteractionSource interactionSource, TextFieldColors textFieldColors, float f, float f2) {
        super(1);
        this.$enabled$inlined = z;
        this.$isError$inlined = z2;
        this.$interactionSource$inlined = interactionSource;
        this.$colors$inlined = textFieldColors;
        this.$focusedIndicatorLineThickness$inlined = f;
        this.$unfocusedIndicatorLineThickness$inlined = f2;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(InspectorInfo inspectorInfo) {
        invoke2(inspectorInfo);
        return Unit.f99208a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull InspectorInfo inspectorInfo) {
        Intrinsics.checkNotNullParameter(inspectorInfo, "$this$null");
        inspectorInfo.setName("indicatorLine");
        inspectorInfo.getProperties().set("enabled", Boolean.valueOf(this.$enabled$inlined));
        inspectorInfo.getProperties().set("isError", Boolean.valueOf(this.$isError$inlined));
        inspectorInfo.getProperties().set("interactionSource", this.$interactionSource$inlined);
        inspectorInfo.getProperties().set("colors", this.$colors$inlined);
        inspectorInfo.getProperties().set("focusedIndicatorLineThickness", C1059Dp.m109732boximpl(this.$focusedIndicatorLineThickness$inlined));
        inspectorInfo.getProperties().set("unfocusedIndicatorLineThickness", C1059Dp.m109732boximpl(this.$unfocusedIndicatorLineThickness$inlined));
    }
}
