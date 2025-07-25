package androidx.compose.p015ui.graphics.painter;

import androidx.compose.p015ui.geometry.Offset;
import androidx.compose.p015ui.geometry.Rect;
import androidx.compose.p015ui.geometry.RectKt;
import androidx.compose.p015ui.geometry.Size;
import androidx.compose.p015ui.geometry.SizeKt;
import androidx.compose.p015ui.graphics.AndroidPaint_androidKt;
import androidx.compose.p015ui.graphics.Canvas;
import androidx.compose.p015ui.graphics.ColorFilter;
import androidx.compose.p015ui.graphics.Paint;
import androidx.compose.p015ui.graphics.drawscope.DrawScope;
import androidx.compose.p015ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Painter.kt */
@Metadata
/* renamed from: androidx.compose.ui.graphics.painter.Painter */
/* loaded from: classes.dex */
public abstract class Painter {
    @Nullable
    private ColorFilter colorFilter;
    @Nullable
    private Paint layerPaint;
    private boolean useLayer;
    private float alpha = 1.0f;
    @NotNull
    private LayoutDirection layoutDirection = LayoutDirection.Ltr;
    @NotNull
    private final Function1<DrawScope, Unit> drawLambda = new Painter$drawLambda$1(this);

    private final void configureAlpha(float f) {
        boolean z;
        boolean z2;
        if (this.alpha == f) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            if (!applyAlpha(f)) {
                if (f == 1.0f) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2) {
                    Paint paint = this.layerPaint;
                    if (paint != null) {
                        paint.setAlpha(f);
                    }
                    this.useLayer = false;
                } else {
                    obtainPaint().setAlpha(f);
                    this.useLayer = true;
                }
            }
            this.alpha = f;
        }
    }

    private final void configureColorFilter(ColorFilter colorFilter) {
        if (!Intrinsics.m17075f(this.colorFilter, colorFilter)) {
            if (!applyColorFilter(colorFilter)) {
                if (colorFilter == null) {
                    Paint paint = this.layerPaint;
                    if (paint != null) {
                        paint.setColorFilter(null);
                    }
                    this.useLayer = false;
                } else {
                    obtainPaint().setColorFilter(colorFilter);
                    this.useLayer = true;
                }
            }
            this.colorFilter = colorFilter;
        }
    }

    private final void configureLayoutDirection(LayoutDirection layoutDirection) {
        if (this.layoutDirection != layoutDirection) {
            applyLayoutDirection(layoutDirection);
            this.layoutDirection = layoutDirection;
        }
    }

    /* renamed from: draw-x_KDEd0$default  reason: not valid java name */
    public static /* synthetic */ void m108095drawx_KDEd0$default(Painter painter, DrawScope drawScope, long j, float f, ColorFilter colorFilter, int i, Object obj) {
        if (obj == null) {
            if ((i & 2) != 0) {
                f = 1.0f;
            }
            float f2 = f;
            if ((i & 4) != 0) {
                colorFilter = null;
            }
            painter.m108096drawx_KDEd0(drawScope, j, f2, colorFilter);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: draw-x_KDEd0");
    }

    private final Paint obtainPaint() {
        Paint paint = this.layerPaint;
        if (paint == null) {
            Paint Paint = AndroidPaint_androidKt.Paint();
            this.layerPaint = Paint;
            return Paint;
        }
        return paint;
    }

    protected boolean applyAlpha(float f) {
        return false;
    }

    protected boolean applyColorFilter(@Nullable ColorFilter colorFilter) {
        return false;
    }

    protected boolean applyLayoutDirection(@NotNull LayoutDirection layoutDirection) {
        Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
        return false;
    }

    /* renamed from: draw-x_KDEd0  reason: not valid java name */
    public final void m108096drawx_KDEd0(@NotNull DrawScope draw, long j, float f, @Nullable ColorFilter colorFilter) {
        Intrinsics.checkNotNullParameter(draw, "$this$draw");
        configureAlpha(f);
        configureColorFilter(colorFilter);
        configureLayoutDirection(draw.getLayoutDirection());
        float m107360getWidthimpl = Size.m107360getWidthimpl(draw.mo108021getSizeNHjbRc()) - Size.m107360getWidthimpl(j);
        float m107357getHeightimpl = Size.m107357getHeightimpl(draw.mo108021getSizeNHjbRc()) - Size.m107357getHeightimpl(j);
        draw.getDrawContext().getTransform().inset(0.0f, 0.0f, m107360getWidthimpl, m107357getHeightimpl);
        if (f > 0.0f && Size.m107360getWidthimpl(j) > 0.0f && Size.m107357getHeightimpl(j) > 0.0f) {
            if (this.useLayer) {
                Rect m107331Recttz77jQw = RectKt.m107331Recttz77jQw(Offset.Companion.m107307getZeroF1C5BW0(), SizeKt.Size(Size.m107360getWidthimpl(j), Size.m107357getHeightimpl(j)));
                Canvas canvas = draw.getDrawContext().getCanvas();
                try {
                    canvas.saveLayer(m107331Recttz77jQw, obtainPaint());
                    onDraw(draw);
                } finally {
                    canvas.restore();
                }
            } else {
                onDraw(draw);
            }
        }
        draw.getDrawContext().getTransform().inset(-0.0f, -0.0f, -m107360getWidthimpl, -m107357getHeightimpl);
    }

    /* renamed from: getIntrinsicSize-NH-jbRc */
    public abstract long mo108090getIntrinsicSizeNHjbRc();

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract void onDraw(@NotNull DrawScope drawScope);
}
