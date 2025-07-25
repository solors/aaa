package androidx.compose.p015ui.platform;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* compiled from: InspectableValue.kt */
@Metadata
/* renamed from: androidx.compose.ui.platform.InspectableValueKt$NoInspectorInfo$1 */
/* loaded from: classes.dex */
final class InspectableValueKt$NoInspectorInfo$1 extends Lambda implements Function1<InspectorInfo, Unit> {
    public static final InspectableValueKt$NoInspectorInfo$1 INSTANCE = new InspectableValueKt$NoInspectorInfo$1();

    InspectableValueKt$NoInspectorInfo$1() {
        super(1);
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull InspectorInfo inspectorInfo) {
        Intrinsics.checkNotNullParameter(inspectorInfo, "$this$null");
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(InspectorInfo inspectorInfo) {
        invoke2(inspectorInfo);
        return Unit.f99208a;
    }
}
