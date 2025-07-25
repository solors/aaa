package androidx.compose.material;

import androidx.compose.p015ui.layout.Placeable;
import be.MathJVM;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* compiled from: TouchTarget.kt */
@Metadata
/* loaded from: classes.dex */
final class MinimumTouchTargetModifier$measure$1 extends Lambda implements Function1<Placeable.PlacementScope, Unit> {
    final /* synthetic */ int $height;
    final /* synthetic */ Placeable $placeable;
    final /* synthetic */ int $width;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MinimumTouchTargetModifier$measure$1(int i, Placeable placeable, int i2) {
        super(1);
        this.$width = i;
        this.$placeable = placeable;
        this.$height = i2;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
        invoke2(placementScope);
        return Unit.f99208a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull Placeable.PlacementScope layout) {
        int m103791d;
        int m103791d2;
        Intrinsics.checkNotNullParameter(layout, "$this$layout");
        m103791d = MathJVM.m103791d((this.$width - this.$placeable.getWidth()) / 2.0f);
        m103791d2 = MathJVM.m103791d((this.$height - this.$placeable.getHeight()) / 2.0f);
        Placeable.PlacementScope.place$default(layout, this.$placeable, m103791d, m103791d2, 0.0f, 4, null);
    }
}
