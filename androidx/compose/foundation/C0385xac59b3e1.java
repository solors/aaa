package androidx.compose.foundation;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.p015ui.platform.InspectorInfo;
import androidx.compose.p015ui.semantics.Role;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Functions;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* compiled from: InspectableValue.kt */
@Metadata
/* renamed from: androidx.compose.foundation.ClickableKt$combinedClickable-XVZzFYc$$inlined$debugInspectorInfo$1 */
/* loaded from: classes.dex */
public final class C0385xac59b3e1 extends Lambda implements Function1<InspectorInfo, Unit> {
    final /* synthetic */ boolean $enabled$inlined;
    final /* synthetic */ Indication $indication$inlined;
    final /* synthetic */ MutableInteractionSource $interactionSource$inlined;
    final /* synthetic */ Functions $onClick$inlined;
    final /* synthetic */ String $onClickLabel$inlined;
    final /* synthetic */ Functions $onDoubleClick$inlined;
    final /* synthetic */ Functions $onLongClick$inlined;
    final /* synthetic */ String $onLongClickLabel$inlined;
    final /* synthetic */ Role $role$inlined;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0385xac59b3e1(boolean z, String str, Role role, Functions functions, Functions functions2, Functions functions3, String str2, Indication indication, MutableInteractionSource mutableInteractionSource) {
        super(1);
        this.$enabled$inlined = z;
        this.$onClickLabel$inlined = str;
        this.$role$inlined = role;
        this.$onClick$inlined = functions;
        this.$onDoubleClick$inlined = functions2;
        this.$onLongClick$inlined = functions3;
        this.$onLongClickLabel$inlined = str2;
        this.$indication$inlined = indication;
        this.$interactionSource$inlined = mutableInteractionSource;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(InspectorInfo inspectorInfo) {
        invoke2(inspectorInfo);
        return Unit.f99208a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull InspectorInfo inspectorInfo) {
        Intrinsics.checkNotNullParameter(inspectorInfo, "$this$null");
        inspectorInfo.setName("combinedClickable");
        inspectorInfo.getProperties().set("enabled", Boolean.valueOf(this.$enabled$inlined));
        inspectorInfo.getProperties().set("onClickLabel", this.$onClickLabel$inlined);
        inspectorInfo.getProperties().set("role", this.$role$inlined);
        inspectorInfo.getProperties().set("onClick", this.$onClick$inlined);
        inspectorInfo.getProperties().set("onDoubleClick", this.$onDoubleClick$inlined);
        inspectorInfo.getProperties().set("onLongClick", this.$onLongClick$inlined);
        inspectorInfo.getProperties().set("onLongClickLabel", this.$onLongClickLabel$inlined);
        inspectorInfo.getProperties().set("indication", this.$indication$inlined);
        inspectorInfo.getProperties().set("interactionSource", this.$interactionSource$inlined);
    }
}
