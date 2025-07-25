package androidx.compose.foundation;

import androidx.compose.p015ui.platform.InspectorInfo;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* compiled from: InspectableValue.kt */
@Metadata
/* renamed from: androidx.compose.foundation.FocusableKt$onPinnableParentAvailable$$inlined$debugInspectorInfo$1 */
/* loaded from: classes.dex */
public final class C0397xdce699c extends Lambda implements Function1<InspectorInfo, Unit> {
    final /* synthetic */ Function1 $onPinnableParentAvailable$inlined;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0397xdce699c(Function1 function1) {
        super(1);
        this.$onPinnableParentAvailable$inlined = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(InspectorInfo inspectorInfo) {
        invoke2(inspectorInfo);
        return Unit.f99208a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull InspectorInfo inspectorInfo) {
        Intrinsics.checkNotNullParameter(inspectorInfo, "$this$null");
        inspectorInfo.setName("onPinnableParentAvailable");
        inspectorInfo.getProperties().set("onPinnableParentAvailable", this.$onPinnableParentAvailable$inlined);
    }
}
