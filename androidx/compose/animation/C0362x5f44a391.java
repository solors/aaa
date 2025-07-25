package androidx.compose.animation;

import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.p015ui.platform.InspectorInfo;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* compiled from: InspectableValue.kt */
@Metadata
/* renamed from: androidx.compose.animation.AnimationModifierKt$animateContentSize$$inlined$debugInspectorInfo$1 */
/* loaded from: classes.dex */
public final class C0362x5f44a391 extends Lambda implements Function1<InspectorInfo, Unit> {
    final /* synthetic */ FiniteAnimationSpec $animationSpec$inlined;
    final /* synthetic */ Function2 $finishedListener$inlined;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0362x5f44a391(FiniteAnimationSpec finiteAnimationSpec, Function2 function2) {
        super(1);
        this.$animationSpec$inlined = finiteAnimationSpec;
        this.$finishedListener$inlined = function2;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(InspectorInfo inspectorInfo) {
        invoke2(inspectorInfo);
        return Unit.f99208a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull InspectorInfo inspectorInfo) {
        Intrinsics.checkNotNullParameter(inspectorInfo, "$this$null");
        inspectorInfo.setName("animateContentSize");
        inspectorInfo.getProperties().set("animationSpec", this.$animationSpec$inlined);
        inspectorInfo.getProperties().set("finishedListener", this.$finishedListener$inlined);
    }
}
