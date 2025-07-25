package androidx.compose.p015ui.semantics;

import androidx.compose.p015ui.platform.InspectorInfo;
import com.maticoo.sdk.utils.log.p406bi.Constants;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* compiled from: InspectableValue.kt */
@Metadata
/* renamed from: androidx.compose.ui.semantics.SemanticsModifierKt$clearAndSetSemantics$$inlined$debugInspectorInfo$1 */
/* loaded from: classes.dex */
public final class C1046x10017f64 extends Lambda implements Function1<InspectorInfo, Unit> {
    final /* synthetic */ Function1 $properties$inlined;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1046x10017f64(Function1 function1) {
        super(1);
        this.$properties$inlined = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(InspectorInfo inspectorInfo) {
        invoke2(inspectorInfo);
        return Unit.f99208a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull InspectorInfo inspectorInfo) {
        Intrinsics.checkNotNullParameter(inspectorInfo, "$this$null");
        inspectorInfo.setName("clearAndSetSemantics");
        inspectorInfo.getProperties().set(Constants.KEY_PROPERTIES, this.$properties$inlined);
    }
}
