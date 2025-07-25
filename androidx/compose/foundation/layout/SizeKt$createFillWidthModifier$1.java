package androidx.compose.foundation.layout;

import androidx.compose.p015ui.platform.InspectorInfo;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* compiled from: Size.kt */
@Metadata
/* loaded from: classes.dex */
final class SizeKt$createFillWidthModifier$1 extends Lambda implements Function1<InspectorInfo, Unit> {
    final /* synthetic */ float $fraction;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SizeKt$createFillWidthModifier$1(float f) {
        super(1);
        this.$fraction = f;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(InspectorInfo inspectorInfo) {
        invoke2(inspectorInfo);
        return Unit.f99208a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull InspectorInfo $receiver) {
        Intrinsics.checkNotNullParameter($receiver, "$this$$receiver");
        $receiver.setName("fillMaxWidth");
        $receiver.getProperties().set("fraction", Float.valueOf(this.$fraction));
    }
}
