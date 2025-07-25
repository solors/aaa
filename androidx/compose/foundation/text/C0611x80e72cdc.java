package androidx.compose.foundation.text;

import androidx.compose.p015ui.platform.InspectorInfo;
import androidx.compose.p015ui.text.TextStyle;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* compiled from: InspectableValue.kt */
@Metadata
/* renamed from: androidx.compose.foundation.text.MaxLinesHeightModifierKt$maxLinesHeight$$inlined$debugInspectorInfo$1 */
/* loaded from: classes.dex */
public final class C0611x80e72cdc extends Lambda implements Function1<InspectorInfo, Unit> {
    final /* synthetic */ int $maxLines$inlined;
    final /* synthetic */ TextStyle $textStyle$inlined;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0611x80e72cdc(int i, TextStyle textStyle) {
        super(1);
        this.$maxLines$inlined = i;
        this.$textStyle$inlined = textStyle;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(InspectorInfo inspectorInfo) {
        invoke2(inspectorInfo);
        return Unit.f99208a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull InspectorInfo inspectorInfo) {
        Intrinsics.checkNotNullParameter(inspectorInfo, "$this$null");
        inspectorInfo.setName("maxLinesHeight");
        inspectorInfo.getProperties().set("maxLines", Integer.valueOf(this.$maxLines$inlined));
        inspectorInfo.getProperties().set("textStyle", this.$textStyle$inlined);
    }
}
