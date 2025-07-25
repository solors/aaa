package androidx.compose.p015ui.graphics.drawscope;

import androidx.compose.p015ui.geometry.Offset;
import androidx.compose.p015ui.geometry.Size;
import androidx.compose.p015ui.geometry.SizeKt;
import androidx.compose.p015ui.graphics.Canvas;
import androidx.compose.p015ui.graphics.Path;
import androidx.compose.p015ui.unit.Density;
import androidx.compose.p015ui.unit.DensityKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: CanvasDrawScope.kt */
@Metadata
/* renamed from: androidx.compose.ui.graphics.drawscope.CanvasDrawScopeKt */
/* loaded from: classes.dex */
public final class CanvasDrawScopeKt {
    @NotNull
    private static final Density DefaultDensity = DensityKt.Density(1.0f, 1.0f);

    /* JADX INFO: Access modifiers changed from: private */
    public static final DrawTransform asDrawTransform(final DrawContext drawContext) {
        return new DrawTransform() { // from class: androidx.compose.ui.graphics.drawscope.CanvasDrawScopeKt$asDrawTransform$1
            @Override // androidx.compose.p015ui.graphics.drawscope.DrawTransform
            /* renamed from: clipPath-mtrdD-E  reason: not valid java name */
            public void mo107948clipPathmtrdDE(@NotNull Path path, int i) {
                Intrinsics.checkNotNullParameter(path, "path");
                DrawContext.this.getCanvas().mo107385clipPathmtrdDE(path, i);
            }

            @Override // androidx.compose.p015ui.graphics.drawscope.DrawTransform
            /* renamed from: clipRect-N_I0leg  reason: not valid java name */
            public void mo107949clipRectN_I0leg(float f, float f2, float f3, float f4, int i) {
                DrawContext.this.getCanvas().mo107386clipRectN_I0leg(f, f2, f3, f4, i);
            }

            @Override // androidx.compose.p015ui.graphics.drawscope.DrawTransform
            /* renamed from: getCenter-F1C5BW0  reason: not valid java name */
            public long mo107950getCenterF1C5BW0() {
                return SizeKt.m107370getCenteruvyYCjk(mo107951getSizeNHjbRc());
            }

            @Override // androidx.compose.p015ui.graphics.drawscope.DrawTransform
            /* renamed from: getSize-NH-jbRc  reason: not valid java name */
            public long mo107951getSizeNHjbRc() {
                return DrawContext.this.mo107946getSizeNHjbRc();
            }

            @Override // androidx.compose.p015ui.graphics.drawscope.DrawTransform
            public void inset(float f, float f2, float f3, float f4) {
                boolean z;
                Canvas canvas = DrawContext.this.getCanvas();
                DrawContext drawContext2 = DrawContext.this;
                long Size = SizeKt.Size(Size.m107360getWidthimpl(mo107951getSizeNHjbRc()) - (f3 + f), Size.m107357getHeightimpl(mo107951getSizeNHjbRc()) - (f4 + f2));
                if (Size.m107360getWidthimpl(Size) >= 0.0f && Size.m107357getHeightimpl(Size) >= 0.0f) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    drawContext2.mo107947setSizeuvyYCjk(Size);
                    canvas.translate(f, f2);
                    return;
                }
                throw new IllegalArgumentException("Width and height must be greater than or equal to zero".toString());
            }

            @Override // androidx.compose.p015ui.graphics.drawscope.DrawTransform
            /* renamed from: rotate-Uv8p0NA  reason: not valid java name */
            public void mo107952rotateUv8p0NA(float f, long j) {
                Canvas canvas = DrawContext.this.getCanvas();
                canvas.translate(Offset.m107291getXimpl(j), Offset.m107292getYimpl(j));
                canvas.rotate(f);
                canvas.translate(-Offset.m107291getXimpl(j), -Offset.m107292getYimpl(j));
            }

            @Override // androidx.compose.p015ui.graphics.drawscope.DrawTransform
            /* renamed from: scale-0AR0LA0  reason: not valid java name */
            public void mo107953scale0AR0LA0(float f, float f2, long j) {
                Canvas canvas = DrawContext.this.getCanvas();
                canvas.translate(Offset.m107291getXimpl(j), Offset.m107292getYimpl(j));
                canvas.scale(f, f2);
                canvas.translate(-Offset.m107291getXimpl(j), -Offset.m107292getYimpl(j));
            }

            @Override // androidx.compose.p015ui.graphics.drawscope.DrawTransform
            /* renamed from: transform-58bKbWc  reason: not valid java name */
            public void mo107954transform58bKbWc(@NotNull float[] matrix) {
                Intrinsics.checkNotNullParameter(matrix, "matrix");
                DrawContext.this.getCanvas().mo107387concat58bKbWc(matrix);
            }

            @Override // androidx.compose.p015ui.graphics.drawscope.DrawTransform
            public void translate(float f, float f2) {
                DrawContext.this.getCanvas().translate(f, f2);
            }
        };
    }
}
