package androidx.compose.p015ui.input.pointer;

import androidx.compose.p015ui.platform.InspectorInfo;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* compiled from: InspectableValue.kt */
@Metadata
/* renamed from: androidx.compose.ui.input.pointer.PointerInteropFilter_androidKt$pointerInteropFilter$$inlined$debugInspectorInfo$1 */
/* loaded from: classes.dex */
public final class C0909xeacf5c03 extends Lambda implements Function1<InspectorInfo, Unit> {
    final /* synthetic */ Function1 $onTouchEvent$inlined;
    final /* synthetic */ RequestDisallowInterceptTouchEvent $requestDisallowInterceptTouchEvent$inlined;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0909xeacf5c03(RequestDisallowInterceptTouchEvent requestDisallowInterceptTouchEvent, Function1 function1) {
        super(1);
        this.$requestDisallowInterceptTouchEvent$inlined = requestDisallowInterceptTouchEvent;
        this.$onTouchEvent$inlined = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(InspectorInfo inspectorInfo) {
        invoke2(inspectorInfo);
        return Unit.f99208a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull InspectorInfo inspectorInfo) {
        Intrinsics.checkNotNullParameter(inspectorInfo, "$this$null");
        inspectorInfo.setName("pointerInteropFilter");
        inspectorInfo.getProperties().set("requestDisallowInterceptTouchEvent", this.$requestDisallowInterceptTouchEvent$inlined);
        inspectorInfo.getProperties().set("onTouchEvent", this.$onTouchEvent$inlined);
    }
}
