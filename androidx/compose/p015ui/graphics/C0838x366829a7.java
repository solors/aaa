package androidx.compose.p015ui.graphics;

import androidx.compose.p015ui.platform.InspectorInfo;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* compiled from: InspectableValue.kt */
@Metadata
/* renamed from: androidx.compose.ui.graphics.GraphicsLayerModifierKt$graphicsLayer-pANQ8Wg$$inlined$debugInspectorInfo$1 */
/* loaded from: classes.dex */
public final class C0838x366829a7 extends Lambda implements Function1<InspectorInfo, Unit> {
    final /* synthetic */ float $alpha$inlined;
    final /* synthetic */ long $ambientShadowColor$inlined;
    final /* synthetic */ float $cameraDistance$inlined;
    final /* synthetic */ boolean $clip$inlined;
    final /* synthetic */ RenderEffect $renderEffect$inlined;
    final /* synthetic */ float $rotationX$inlined;
    final /* synthetic */ float $rotationY$inlined;
    final /* synthetic */ float $rotationZ$inlined;
    final /* synthetic */ float $scaleX$inlined;
    final /* synthetic */ float $scaleY$inlined;
    final /* synthetic */ float $shadowElevation$inlined;
    final /* synthetic */ Shape $shape$inlined;
    final /* synthetic */ long $spotShadowColor$inlined;
    final /* synthetic */ long $transformOrigin$inlined;
    final /* synthetic */ float $translationX$inlined;
    final /* synthetic */ float $translationY$inlined;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0838x366829a7(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, long j, Shape shape, boolean z, RenderEffect renderEffect, long j2, long j3) {
        super(1);
        this.$scaleX$inlined = f;
        this.$scaleY$inlined = f2;
        this.$alpha$inlined = f3;
        this.$translationX$inlined = f4;
        this.$translationY$inlined = f5;
        this.$shadowElevation$inlined = f6;
        this.$rotationX$inlined = f7;
        this.$rotationY$inlined = f8;
        this.$rotationZ$inlined = f9;
        this.$cameraDistance$inlined = f10;
        this.$transformOrigin$inlined = j;
        this.$shape$inlined = shape;
        this.$clip$inlined = z;
        this.$renderEffect$inlined = renderEffect;
        this.$ambientShadowColor$inlined = j2;
        this.$spotShadowColor$inlined = j3;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(InspectorInfo inspectorInfo) {
        invoke2(inspectorInfo);
        return Unit.f99208a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull InspectorInfo inspectorInfo) {
        Intrinsics.checkNotNullParameter(inspectorInfo, "$this$null");
        inspectorInfo.setName("graphicsLayer");
        inspectorInfo.getProperties().set("scaleX", Float.valueOf(this.$scaleX$inlined));
        inspectorInfo.getProperties().set("scaleY", Float.valueOf(this.$scaleY$inlined));
        inspectorInfo.getProperties().set("alpha", Float.valueOf(this.$alpha$inlined));
        inspectorInfo.getProperties().set("translationX", Float.valueOf(this.$translationX$inlined));
        inspectorInfo.getProperties().set("translationY", Float.valueOf(this.$translationY$inlined));
        inspectorInfo.getProperties().set("shadowElevation", Float.valueOf(this.$shadowElevation$inlined));
        inspectorInfo.getProperties().set("rotationX", Float.valueOf(this.$rotationX$inlined));
        inspectorInfo.getProperties().set("rotationY", Float.valueOf(this.$rotationY$inlined));
        inspectorInfo.getProperties().set("rotationZ", Float.valueOf(this.$rotationZ$inlined));
        inspectorInfo.getProperties().set("cameraDistance", Float.valueOf(this.$cameraDistance$inlined));
        inspectorInfo.getProperties().set("transformOrigin", TransformOrigin.m107856boximpl(this.$transformOrigin$inlined));
        inspectorInfo.getProperties().set("shape", this.$shape$inlined);
        inspectorInfo.getProperties().set("clip", Boolean.valueOf(this.$clip$inlined));
        inspectorInfo.getProperties().set("renderEffect", this.$renderEffect$inlined);
        inspectorInfo.getProperties().set("ambientShadowColor", Color.m107517boximpl(this.$ambientShadowColor$inlined));
        inspectorInfo.getProperties().set("spotShadowColor", Color.m107517boximpl(this.$spotShadowColor$inlined));
    }
}
