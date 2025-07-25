package androidx.compose.p015ui.modifier;

import androidx.compose.p015ui.platform.InspectorInfo;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Functions;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* compiled from: InspectableValue.kt */
@Metadata
/* renamed from: androidx.compose.ui.modifier.ModifierLocalProviderKt$modifierLocalProvider$$inlined$debugInspectorInfo$1 */
/* loaded from: classes.dex */
public final class C0927xd651ace7 extends Lambda implements Function1<InspectorInfo, Unit> {
    final /* synthetic */ ProvidableModifierLocal $key$inlined;
    final /* synthetic */ Functions $value$inlined;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0927xd651ace7(ProvidableModifierLocal providableModifierLocal, Functions functions) {
        super(1);
        this.$key$inlined = providableModifierLocal;
        this.$value$inlined = functions;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(InspectorInfo inspectorInfo) {
        invoke2(inspectorInfo);
        return Unit.f99208a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull InspectorInfo inspectorInfo) {
        Intrinsics.checkNotNullParameter(inspectorInfo, "$this$null");
        inspectorInfo.setName("modifierLocalProvider");
        inspectorInfo.getProperties().set("key", this.$key$inlined);
        inspectorInfo.getProperties().set("value", this.$value$inlined);
    }
}
