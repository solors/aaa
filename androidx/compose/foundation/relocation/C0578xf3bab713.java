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
/* renamed from: androidx.compose.foundation.relocation.BringIntoViewRequesterKt$bringIntoViewRequester$$inlined$debugInspectorInfo$1 */
/* loaded from: classes.dex */
public final class C0578xf3bab713 extends Lambda implements Function1<InspectorInfo, Unit> {
    final /* synthetic */ BringIntoViewRequester $bringIntoViewRequester$inlined;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0578xf3bab713(BringIntoViewRequester bringIntoViewRequester) {
        super(1);
        this.$bringIntoViewRequester$inlined = bringIntoViewRequester;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(InspectorInfo inspectorInfo) {
        invoke2(inspectorInfo);
        return Unit.f99208a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull InspectorInfo inspectorInfo) {
        Intrinsics.checkNotNullParameter(inspectorInfo, "$this$null");
        inspectorInfo.setName("bringIntoViewRequester");
        inspectorInfo.getProperties().set("bringIntoViewRequester", this.$bringIntoViewRequester$inlined);
    }
}
