package androidx.compose.p015ui.graphics;

import androidx.compose.p015ui.unit.Density;
import androidx.compose.p015ui.unit.DensityKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: GraphicsLayerScope.kt */
@Metadata
/* renamed from: androidx.compose.ui.graphics.ReusableGraphicsLayerScope */
/* loaded from: classes.dex */
public final class ReusableGraphicsLayerScope implements GraphicsLayerScope {
    private boolean clip;
    @Nullable
    private RenderEffect renderEffect;
    private float rotationX;
    private float rotationY;
    private float rotationZ;
    private float shadowElevation;
    private float translationX;
    private float translationY;
    private float scaleX = 1.0f;
    private float scaleY = 1.0f;
    private float alpha = 1.0f;
    private long ambientShadowColor = GraphicsLayerScopeKt.getDefaultShadowColor();
    private long spotShadowColor = GraphicsLayerScopeKt.getDefaultShadowColor();
    private float cameraDistance = 8.0f;
    private long transformOrigin = TransformOrigin.Companion.m107869getCenterSzJe1aQ();
    @NotNull
    private Shape shape = RectangleShape.getRectangleShape();
    @NotNull
    private Density graphicsDensity = DensityKt.Density$default(1.0f, 0.0f, 2, null);

    @Override // androidx.compose.p015ui.graphics.GraphicsLayerScope
    public float getAlpha() {
        return this.alpha;
    }

    @Override // androidx.compose.p015ui.graphics.GraphicsLayerScope
    /* renamed from: getAmbientShadowColor-0d7_KjU */
    public long mo107683getAmbientShadowColor0d7_KjU() {
        return this.ambientShadowColor;
    }

    @Override // androidx.compose.p015ui.graphics.GraphicsLayerScope
    public float getCameraDistance() {
        return this.cameraDistance;
    }

    @Override // androidx.compose.p015ui.graphics.GraphicsLayerScope
    public boolean getClip() {
        return this.clip;
    }

    @Override // androidx.compose.p015ui.unit.Density
    public float getDensity() {
        return this.graphicsDensity.getDensity();
    }

    @Override // androidx.compose.p015ui.unit.Density
    public float getFontScale() {
        return this.graphicsDensity.getFontScale();
    }

    @NotNull
    public final Density getGraphicsDensity$ui_release() {
        return this.graphicsDensity;
    }

    @Override // androidx.compose.p015ui.graphics.GraphicsLayerScope
    @Nullable
    public RenderEffect getRenderEffect() {
        return this.renderEffect;
    }

    @Override // androidx.compose.p015ui.graphics.GraphicsLayerScope
    public float getRotationX() {
        return this.rotationX;
    }

    @Override // androidx.compose.p015ui.graphics.GraphicsLayerScope
    public float getRotationY() {
        return this.rotationY;
    }

    @Override // androidx.compose.p015ui.graphics.GraphicsLayerScope
    public float getRotationZ() {
        return this.rotationZ;
    }

    @Override // androidx.compose.p015ui.graphics.GraphicsLayerScope
    public float getScaleX() {
        return this.scaleX;
    }

    @Override // androidx.compose.p015ui.graphics.GraphicsLayerScope
    public float getScaleY() {
        return this.scaleY;
    }

    @Override // androidx.compose.p015ui.graphics.GraphicsLayerScope
    public float getShadowElevation() {
        return this.shadowElevation;
    }

    @Override // androidx.compose.p015ui.graphics.GraphicsLayerScope
    @NotNull
    public Shape getShape() {
        return this.shape;
    }

    @Override // androidx.compose.p015ui.graphics.GraphicsLayerScope
    /* renamed from: getSpotShadowColor-0d7_KjU */
    public long mo107684getSpotShadowColor0d7_KjU() {
        return this.spotShadowColor;
    }

    @Override // androidx.compose.p015ui.graphics.GraphicsLayerScope
    /* renamed from: getTransformOrigin-SzJe1aQ */
    public long mo107685getTransformOriginSzJe1aQ() {
        return this.transformOrigin;
    }

    @Override // androidx.compose.p015ui.graphics.GraphicsLayerScope
    public float getTranslationX() {
        return this.translationX;
    }

    @Override // androidx.compose.p015ui.graphics.GraphicsLayerScope
    public float getTranslationY() {
        return this.translationY;
    }

    public final void reset() {
        setScaleX(1.0f);
        setScaleY(1.0f);
        setAlpha(1.0f);
        setTranslationX(0.0f);
        setTranslationY(0.0f);
        setShadowElevation(0.0f);
        mo107686setAmbientShadowColor8_81llA(GraphicsLayerScopeKt.getDefaultShadowColor());
        mo107687setSpotShadowColor8_81llA(GraphicsLayerScopeKt.getDefaultShadowColor());
        setRotationX(0.0f);
        setRotationY(0.0f);
        setRotationZ(0.0f);
        setCameraDistance(8.0f);
        mo107688setTransformOrigin__ExYCQ(TransformOrigin.Companion.m107869getCenterSzJe1aQ());
        setShape(RectangleShape.getRectangleShape());
        setClip(false);
        setRenderEffect(null);
    }

    @Override // androidx.compose.p015ui.graphics.GraphicsLayerScope
    public void setAlpha(float f) {
        this.alpha = f;
    }

    @Override // androidx.compose.p015ui.graphics.GraphicsLayerScope
    /* renamed from: setAmbientShadowColor-8_81llA */
    public void mo107686setAmbientShadowColor8_81llA(long j) {
        this.ambientShadowColor = j;
    }

    @Override // androidx.compose.p015ui.graphics.GraphicsLayerScope
    public void setCameraDistance(float f) {
        this.cameraDistance = f;
    }

    @Override // androidx.compose.p015ui.graphics.GraphicsLayerScope
    public void setClip(boolean z) {
        this.clip = z;
    }

    public final void setGraphicsDensity$ui_release(@NotNull Density density) {
        Intrinsics.checkNotNullParameter(density, "<set-?>");
        this.graphicsDensity = density;
    }

    @Override // androidx.compose.p015ui.graphics.GraphicsLayerScope
    public void setRenderEffect(@Nullable RenderEffect renderEffect) {
        this.renderEffect = renderEffect;
    }

    @Override // androidx.compose.p015ui.graphics.GraphicsLayerScope
    public void setRotationX(float f) {
        this.rotationX = f;
    }

    @Override // androidx.compose.p015ui.graphics.GraphicsLayerScope
    public void setRotationY(float f) {
        this.rotationY = f;
    }

    @Override // androidx.compose.p015ui.graphics.GraphicsLayerScope
    public void setRotationZ(float f) {
        this.rotationZ = f;
    }

    @Override // androidx.compose.p015ui.graphics.GraphicsLayerScope
    public void setScaleX(float f) {
        this.scaleX = f;
    }

    @Override // androidx.compose.p015ui.graphics.GraphicsLayerScope
    public void setScaleY(float f) {
        this.scaleY = f;
    }

    @Override // androidx.compose.p015ui.graphics.GraphicsLayerScope
    public void setShadowElevation(float f) {
        this.shadowElevation = f;
    }

    @Override // androidx.compose.p015ui.graphics.GraphicsLayerScope
    public void setShape(@NotNull Shape shape) {
        Intrinsics.checkNotNullParameter(shape, "<set-?>");
        this.shape = shape;
    }

    @Override // androidx.compose.p015ui.graphics.GraphicsLayerScope
    /* renamed from: setSpotShadowColor-8_81llA */
    public void mo107687setSpotShadowColor8_81llA(long j) {
        this.spotShadowColor = j;
    }

    @Override // androidx.compose.p015ui.graphics.GraphicsLayerScope
    /* renamed from: setTransformOrigin-__ExYCQ */
    public void mo107688setTransformOrigin__ExYCQ(long j) {
        this.transformOrigin = j;
    }

    @Override // androidx.compose.p015ui.graphics.GraphicsLayerScope
    public void setTranslationX(float f) {
        this.translationX = f;
    }

    @Override // androidx.compose.p015ui.graphics.GraphicsLayerScope
    public void setTranslationY(float f) {
        this.translationY = f;
    }
}
