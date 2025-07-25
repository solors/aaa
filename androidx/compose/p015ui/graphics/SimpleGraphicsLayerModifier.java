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
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: GraphicsLayerModifier.kt */
@Metadata
/* renamed from: androidx.compose.ui.graphics.SimpleGraphicsLayerModifier */
/* loaded from: classes.dex */
public final class SimpleGraphicsLayerModifier extends InspectorValueInfo implements LayoutModifier {
    private final float alpha;
    private final long ambientShadowColor;
    private final float cameraDistance;
    private final boolean clip;
    @NotNull
    private final Function1<GraphicsLayerScope, Unit> layerBlock;
    @Nullable
    private final RenderEffect renderEffect;
    private final float rotationX;
    private final float rotationY;
    private final float rotationZ;
    private final float scaleX;
    private final float scaleY;
    private final float shadowElevation;
    @NotNull
    private final Shape shape;
    private final long spotShadowColor;
    private final long transformOrigin;
    private final float translationX;
    private final float translationY;

    public /* synthetic */ SimpleGraphicsLayerModifier(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, long j, Shape shape, boolean z, RenderEffect renderEffect, long j2, long j3, Function1 function1, DefaultConstructorMarker defaultConstructorMarker) {
        this(f, f2, f3, f4, f5, f6, f7, f8, f9, f10, j, shape, z, renderEffect, j2, j3, function1);
    }

    public boolean equals(@Nullable Object obj) {
        SimpleGraphicsLayerModifier simpleGraphicsLayerModifier;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        boolean z9;
        boolean z10;
        if (obj instanceof SimpleGraphicsLayerModifier) {
            simpleGraphicsLayerModifier = (SimpleGraphicsLayerModifier) obj;
        } else {
            simpleGraphicsLayerModifier = null;
        }
        if (simpleGraphicsLayerModifier == null) {
            return false;
        }
        if (this.scaleX == simpleGraphicsLayerModifier.scaleX) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return false;
        }
        if (this.scaleY == simpleGraphicsLayerModifier.scaleY) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z2) {
            return false;
        }
        if (this.alpha == simpleGraphicsLayerModifier.alpha) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (!z3) {
            return false;
        }
        if (this.translationX == simpleGraphicsLayerModifier.translationX) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (!z4) {
            return false;
        }
        if (this.translationY == simpleGraphicsLayerModifier.translationY) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (!z5) {
            return false;
        }
        if (this.shadowElevation == simpleGraphicsLayerModifier.shadowElevation) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (!z6) {
            return false;
        }
        if (this.rotationX == simpleGraphicsLayerModifier.rotationX) {
            z7 = true;
        } else {
            z7 = false;
        }
        if (!z7) {
            return false;
        }
        if (this.rotationY == simpleGraphicsLayerModifier.rotationY) {
            z8 = true;
        } else {
            z8 = false;
        }
        if (!z8) {
            return false;
        }
        if (this.rotationZ == simpleGraphicsLayerModifier.rotationZ) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (!z9) {
            return false;
        }
        if (this.cameraDistance == simpleGraphicsLayerModifier.cameraDistance) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10 || !TransformOrigin.m107863equalsimpl0(this.transformOrigin, simpleGraphicsLayerModifier.transformOrigin) || !Intrinsics.m17075f(this.shape, simpleGraphicsLayerModifier.shape) || this.clip != simpleGraphicsLayerModifier.clip || !Intrinsics.m17075f(this.renderEffect, simpleGraphicsLayerModifier.renderEffect) || !Color.m107528equalsimpl0(this.ambientShadowColor, simpleGraphicsLayerModifier.ambientShadowColor) || !Color.m107528equalsimpl0(this.spotShadowColor, simpleGraphicsLayerModifier.spotShadowColor)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        int i;
        int hashCode = ((((((((((((((((((((((((Float.hashCode(this.scaleX) * 31) + Float.hashCode(this.scaleY)) * 31) + Float.hashCode(this.alpha)) * 31) + Float.hashCode(this.translationX)) * 31) + Float.hashCode(this.translationY)) * 31) + Float.hashCode(this.shadowElevation)) * 31) + Float.hashCode(this.rotationX)) * 31) + Float.hashCode(this.rotationY)) * 31) + Float.hashCode(this.rotationZ)) * 31) + Float.hashCode(this.cameraDistance)) * 31) + TransformOrigin.m107866hashCodeimpl(this.transformOrigin)) * 31) + this.shape.hashCode()) * 31) + Boolean.hashCode(this.clip)) * 31;
        RenderEffect renderEffect = this.renderEffect;
        if (renderEffect != null) {
            i = renderEffect.hashCode();
        } else {
            i = 0;
        }
        return ((((hashCode + i) * 31) + Color.m107534hashCodeimpl(this.ambientShadowColor)) * 31) + Color.m107534hashCodeimpl(this.spotShadowColor);
    }

    @Override // androidx.compose.p015ui.layout.LayoutModifier
    @NotNull
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo105929measure3p2s80s(@NotNull MeasureScope measure, @NotNull Measurable measurable, long j) {
        Intrinsics.checkNotNullParameter(measure, "$this$measure");
        Intrinsics.checkNotNullParameter(measurable, "measurable");
        Placeable mo109020measureBRTryo0 = measurable.mo109020measureBRTryo0(j);
        return MeasureScope.layout$default(measure, mo109020measureBRTryo0.getWidth(), mo109020measureBRTryo0.getHeight(), null, new SimpleGraphicsLayerModifier$measure$1(mo109020measureBRTryo0, this), 4, null);
    }

    @NotNull
    public String toString() {
        return "SimpleGraphicsLayerModifier(scaleX=" + this.scaleX + ", scaleY=" + this.scaleY + ", alpha = " + this.alpha + ", translationX=" + this.translationX + ", translationY=" + this.translationY + ", shadowElevation=" + this.shadowElevation + ", rotationX=" + this.rotationX + ", rotationY=" + this.rotationY + ", rotationZ=" + this.rotationZ + ", cameraDistance=" + this.cameraDistance + ", transformOrigin=" + ((Object) TransformOrigin.m107867toStringimpl(this.transformOrigin)) + ", shape=" + this.shape + ", clip=" + this.clip + ", renderEffect=" + this.renderEffect + ", ambientShadowColor=" + ((Object) Color.m107535toStringimpl(this.ambientShadowColor)) + ", spotShadowColor=" + ((Object) Color.m107535toStringimpl(this.spotShadowColor)) + ')';
    }

    private SimpleGraphicsLayerModifier(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, long j, Shape shape, boolean z, RenderEffect renderEffect, long j2, long j3, Function1<? super InspectorInfo, Unit> function1) {
        super(function1);
        this.scaleX = f;
        this.scaleY = f2;
        this.alpha = f3;
        this.translationX = f4;
        this.translationY = f5;
        this.shadowElevation = f6;
        this.rotationX = f7;
        this.rotationY = f8;
        this.rotationZ = f9;
        this.cameraDistance = f10;
        this.transformOrigin = j;
        this.shape = shape;
        this.clip = z;
        this.renderEffect = renderEffect;
        this.ambientShadowColor = j2;
        this.spotShadowColor = j3;
        this.layerBlock = new SimpleGraphicsLayerModifier$layerBlock$1(this);
    }
}
