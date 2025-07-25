package androidx.compose.foundation.relocation;

import androidx.compose.p015ui.platform.InspectorInfo;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* compiled from: InspectableValue.kt */
@Metadata
/* renamed from: androidx.compose.foundation.relocation.BringIntoViewResponderKt$bringIntoViewResponder$$inlined$debugInspectorInfo$1 */
/* loaded from: classes.dex */
public final class C0581x692369d3 extends Lambda implements Function1<InspectorInfo, Unit> {
    final /* synthetic */ BringIntoViewResponder $responder$inlined;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0581x692369d3(BringIntoViewResponder bringIntoViewResponder) {
        super(1);
        this.$responder$inlined = bringIntoViewResponder;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(InspectorInfo inspectorInfo) {
        invoke2(inspectorInfo);
        return Unit.f99208a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull InspectorInfo inspectorInfo) {
        Intrinsics.checkNotNullParameter(inspectorInfo, "$this$null");
        inspectorInfo.setName("bringIntoViewResponder");
        inspectorInfo.getProperties().set("responder", this.$responder$inlined);
    }
}
