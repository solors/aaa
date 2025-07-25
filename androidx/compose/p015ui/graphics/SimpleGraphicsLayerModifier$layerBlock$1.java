package androidx.compose.p015ui.graphics;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: GraphicsLayerModifier.kt */
@Metadata
/* renamed from: androidx.compose.ui.graphics.SimpleGraphicsLayerModifier$layerBlock$1 */
/* loaded from: classes.dex */
public final class SimpleGraphicsLayerModifier$layerBlock$1 extends Lambda implements Function1<GraphicsLayerScope, Unit> {
    final /* synthetic */ SimpleGraphicsLayerModifier this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SimpleGraphicsLayerModifier$layerBlock$1(SimpleGraphicsLayerModifier simpleGraphicsLayerModifier) {
        super(1);
        this.this$0 = simpleGraphicsLayerModifier;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(GraphicsLayerScope graphicsLayerScope) {
        invoke2(graphicsLayerScope);
        return Unit.f99208a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull GraphicsLayerScope graphicsLayerScope) {
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        float f8;
        float f9;
        float f10;
        long j;
        Shape shape;
        boolean z;
        RenderEffect renderEffect;
        long j2;
        long j3;
        Intrinsics.checkNotNullParameter(graphicsLayerScope, "$this$null");
        f = this.this$0.scaleX;
        graphicsLayerScope.setScaleX(f);
        f2 = this.this$0.scaleY;
        graphicsLayerScope.setScaleY(f2);
        f3 = this.this$0.alpha;
        graphicsLayerScope.setAlpha(f3);
        f4 = this.this$0.translationX;
        graphicsLayerScope.setTranslationX(f4);
        f5 = this.this$0.translationY;
        graphicsLayerScope.setTranslationY(f5);
        f6 = this.this$0.shadowElevation;
        graphicsLayerScope.setShadowElevation(f6);
        f7 = this.this$0.rotationX;
        graphicsLayerScope.setRotationX(f7);
        f8 = this.this$0.rotationY;
        graphicsLayerScope.setRotationY(f8);
        f9 = this.this$0.rotationZ;
        graphicsLayerScope.setRotationZ(f9);
        f10 = this.this$0.cameraDistance;
        graphicsLayerScope.setCameraDistance(f10);
        j = this.this$0.transformOrigin;
        graphicsLayerScope.mo107688setTransformOrigin__ExYCQ(j);
        shape = this.this$0.shape;
        graphicsLayerScope.setShape(shape);
        z = this.this$0.clip;
        graphicsLayerScope.setClip(z);
        renderEffect = this.this$0.renderEffect;
        graphicsLayerScope.setRenderEffect(renderEffect);
        j2 = this.this$0.ambientShadowColor;
        graphicsLayerScope.mo107686setAmbientShadowColor8_81llA(j2);
        j3 = this.this$0.spotShadowColor;
        graphicsLayerScope.mo107687setSpotShadowColor8_81llA(j3);
    }
}
