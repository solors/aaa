package androidx.compose.foundation.text;

import androidx.compose.p015ui.layout.Placeable;
import androidx.compose.p015ui.unit.IntOffset;
import java.util.List;
import kotlin.Metadata;
import kotlin.Tuples;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* compiled from: CoreText.kt */
@Metadata
/* loaded from: classes.dex */
final class TextController$measurePolicy$1$measure$2 extends Lambda implements Function1<Placeable.PlacementScope, Unit> {
    final /* synthetic */ List<Tuples<Placeable, IntOffset>> $placeables;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public TextController$measurePolicy$1$measure$2(List<? extends Tuples<? extends Placeable, IntOffset>> list) {
        super(1);
        this.$placeables = list;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
        invoke2(placementScope);
        return Unit.f99208a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull Placeable.PlacementScope layout) {
        Intrinsics.checkNotNullParameter(layout, "$this$layout");
        List<Tuples<Placeable, IntOffset>> list = this.$placeables;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            Tuples<Placeable, IntOffset> tuples = list.get(i);
            Placeable.PlacementScope.m109062place70tqf50$default(layout, tuples.m17632a(), tuples.m17631b().m109861unboximpl(), 0.0f, 2, null);
        }
    }
}
