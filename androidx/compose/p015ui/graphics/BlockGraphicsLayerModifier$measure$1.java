package androidx.compose.p015ui.graphics;

import androidx.compose.p015ui.layout.Placeable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* compiled from: GraphicsLayerModifier.kt */
@Metadata
/* renamed from: androidx.compose.ui.graphics.BlockGraphicsLayerModifier$measure$1 */
/* loaded from: classes.dex */
final class BlockGraphicsLayerModifier$measure$1 extends Lambda implements Function1<Placeable.PlacementScope, Unit> {
    final /* synthetic */ Placeable $placeable;
    final /* synthetic */ GraphicsLayerModifier this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BlockGraphicsLayerModifier$measure$1(Placeable placeable, GraphicsLayerModifier graphicsLayerModifier) {
        super(1);
        this.$placeable = placeable;
        this.this$0 = graphicsLayerModifier;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
        invoke2(placementScope);
        return Unit.f99208a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull Placeable.PlacementScope layout) {
        Function1 function1;
        Intrinsics.checkNotNullParameter(layout, "$this$layout");
        Placeable placeable = this.$placeable;
        function1 = this.this$0.layerBlock;
        Placeable.PlacementScope.placeWithLayer$default(layout, placeable, 0, 0, 0.0f, function1, 4, null);
    }
}
