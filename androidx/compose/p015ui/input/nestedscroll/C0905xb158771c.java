package androidx.compose.p015ui.input.nestedscroll;

import androidx.compose.p015ui.platform.InspectorInfo;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* compiled from: InspectableValue.kt */
@Metadata
/* renamed from: androidx.compose.ui.input.nestedscroll.NestedScrollModifierKt$nestedScroll$$inlined$debugInspectorInfo$1 */
/* loaded from: classes.dex */
public final class C0905xb158771c extends Lambda implements Function1<InspectorInfo, Unit> {
    final /* synthetic */ NestedScrollModifier $connection$inlined;
    final /* synthetic */ NestedScrollDispatcher $dispatcher$inlined;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0905xb158771c(NestedScrollModifier nestedScrollModifier, NestedScrollDispatcher nestedScrollDispatcher) {
        super(1);
        this.$connection$inlined = nestedScrollModifier;
        this.$dispatcher$inlined = nestedScrollDispatcher;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(InspectorInfo inspectorInfo) {
        invoke2(inspectorInfo);
        return Unit.f99208a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull InspectorInfo inspectorInfo) {
        Intrinsics.checkNotNullParameter(inspectorInfo, "$this$null");
        inspectorInfo.setName("nestedScroll");
        inspectorInfo.getProperties().set("connection", this.$connection$inlined);
        inspectorInfo.getProperties().set("dispatcher", this.$dispatcher$inlined);
    }
}
