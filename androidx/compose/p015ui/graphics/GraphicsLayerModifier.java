package androidx.compose.p015ui.graphics;

import androidx.compose.p015ui.layout.LayoutModifier;
import androidx.compose.p015ui.layout.Measurable;
import androidx.compose.p015ui.layout.MeasureResult;
import androidx.compose.p015ui.layout.MeasureScope;
import androidx.compose.p015ui.layout.Placeable;
import androidx.compose.p015ui.platform.InspectorInfo;
import androidx.compose.p015ui.platform.InspectorValueInfo;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata
/* renamed from: androidx.compose.ui.graphics.BlockGraphicsLayerModifier */
/* loaded from: classes.dex */
public final class GraphicsLayerModifier extends InspectorValueInfo implements LayoutModifier {
    @NotNull
    private final Function1<GraphicsLayerScope, Unit> layerBlock;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public GraphicsLayerModifier(@NotNull Function1<? super GraphicsLayerScope, Unit> layerBlock, @NotNull Function1<? super InspectorInfo, Unit> inspectorInfo) {
        super(inspectorInfo);
        Intrinsics.checkNotNullParameter(layerBlock, "layerBlock");
        Intrinsics.checkNotNullParameter(inspectorInfo, "inspectorInfo");
        this.layerBlock = layerBlock;
    }

    public boolean equals(@Nullable Object obj) {
        if (!(obj instanceof GraphicsLayerModifier)) {
            return false;
        }
        return Intrinsics.m17075f(this.layerBlock, ((GraphicsLayerModifier) obj).layerBlock);
    }

    public int hashCode() {
        return this.layerBlock.hashCode();
    }

    @Override // androidx.compose.p015ui.layout.LayoutModifier
    @NotNull
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo105929measure3p2s80s(@NotNull MeasureScope measure, @NotNull Measurable measurable, long j) {
        Intrinsics.checkNotNullParameter(measure, "$this$measure");
        Intrinsics.checkNotNullParameter(measurable, "measurable");
        Placeable mo109020measureBRTryo0 = measurable.mo109020measureBRTryo0(j);
        return MeasureScope.layout$default(measure, mo109020measureBRTryo0.getWidth(), mo109020measureBRTryo0.getHeight(), null, new BlockGraphicsLayerModifier$measure$1(mo109020measureBRTryo0, this), 4, null);
    }

    @NotNull
    public String toString() {
        return "BlockGraphicsLayerModifier(block=" + this.layerBlock + ')';
    }
}
