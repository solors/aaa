package androidx.compose.foundation.layout;

import androidx.compose.p015ui.Alignment;
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
final class SizeKt$createWrapContentSizeModifier$2 extends Lambda implements Function1<InspectorInfo, Unit> {
    final /* synthetic */ Alignment $align;
    final /* synthetic */ boolean $unbounded;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SizeKt$createWrapContentSizeModifier$2(Alignment alignment, boolean z) {
        super(1);
        this.$align = alignment;
        this.$unbounded = z;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(InspectorInfo inspectorInfo) {
        invoke2(inspectorInfo);
        return Unit.f99208a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull InspectorInfo $receiver) {
        Intrinsics.checkNotNullParameter($receiver, "$this$$receiver");
        $receiver.setName("wrapContentSize");
        $receiver.getProperties().set("align", this.$align);
        $receiver.getProperties().set("unbounded", Boolean.valueOf(this.$unbounded));
    }
}
