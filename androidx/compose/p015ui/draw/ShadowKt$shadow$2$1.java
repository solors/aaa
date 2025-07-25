package androidx.compose.p015ui.draw;

import androidx.compose.p015ui.graphics.GraphicsLayerScope;
import androidx.compose.p015ui.graphics.Shape;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* compiled from: Shadow.kt */
@Metadata
/* renamed from: androidx.compose.ui.draw.ShadowKt$shadow$2$1 */
/* loaded from: classes.dex */
final class ShadowKt$shadow$2$1 extends Lambda implements Function1<GraphicsLayerScope, Unit> {
    final /* synthetic */ long $ambientColor;
    final /* synthetic */ boolean $clip;
    final /* synthetic */ float $elevation;
    final /* synthetic */ Shape $shape;
    final /* synthetic */ long $spotColor;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShadowKt$shadow$2$1(float f, Shape shape, boolean z, long j, long j2) {
        super(1);
        this.$elevation = f;
        this.$shape = shape;
        this.$clip = z;
        this.$ambientColor = j;
        this.$spotColor = j2;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(GraphicsLayerScope graphicsLayerScope) {
        invoke2(graphicsLayerScope);
        return Unit.f99208a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull GraphicsLayerScope graphicsLayer) {
        Intrinsics.checkNotNullParameter(graphicsLayer, "$this$graphicsLayer");
        graphicsLayer.setShadowElevation(graphicsLayer.mo106214toPx0680j_4(this.$elevation));
        graphicsLayer.setShape(this.$shape);
        graphicsLayer.setClip(this.$clip);
        graphicsLayer.mo107686setAmbientShadowColor8_81llA(this.$ambientColor);
        graphicsLayer.mo107687setSpotShadowColor8_81llA(this.$spotColor);
    }
}
