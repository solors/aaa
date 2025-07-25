package androidx.compose.p015ui.graphics.vector;

import androidx.compose.p015ui.graphics.AndroidPath_androidKt;
import androidx.compose.p015ui.graphics.Brush;
import androidx.compose.p015ui.graphics.Path;
import androidx.compose.p015ui.graphics.PathMeasure;
import androidx.compose.p015ui.graphics.drawscope.DrawScope;
import androidx.compose.p015ui.graphics.drawscope.Stroke;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p804nd.EnumC38505n;
import p804nd.InterfaceC38501j;
import p804nd.LazyJVM;

/* compiled from: Vector.kt */
@Metadata
/* renamed from: androidx.compose.ui.graphics.vector.PathComponent */
/* loaded from: classes.dex */
public final class PathComponent extends VNode {
    @Nullable
    private Brush fill;
    private float fillAlpha;
    private boolean isPathDirty;
    private boolean isStrokeDirty;
    private boolean isTrimPathDirty;
    @NotNull
    private String name;
    @NotNull
    private final PathParser parser;
    @NotNull
    private final Path path;
    @NotNull
    private List<? extends PathNode> pathData;
    private int pathFillType;
    @NotNull
    private final InterfaceC38501j pathMeasure$delegate;
    @NotNull
    private final Path renderPath;
    @Nullable
    private Brush stroke;
    private float strokeAlpha;
    private int strokeLineCap;
    private int strokeLineJoin;
    private float strokeLineMiter;
    private float strokeLineWidth;
    @Nullable
    private Stroke strokeStyle;
    private float trimPathEnd;
    private float trimPathOffset;
    private float trimPathStart;

    public PathComponent() {
        super(null);
        InterfaceC38501j m14553b;
        this.name = "";
        this.fillAlpha = 1.0f;
        this.pathData = VectorKt.getEmptyPath();
        this.pathFillType = VectorKt.getDefaultFillType();
        this.strokeAlpha = 1.0f;
        this.strokeLineCap = VectorKt.getDefaultStrokeLineCap();
        this.strokeLineJoin = VectorKt.getDefaultStrokeLineJoin();
        this.strokeLineMiter = 4.0f;
        this.trimPathEnd = 1.0f;
        this.isPathDirty = true;
        this.isStrokeDirty = true;
        this.isTrimPathDirty = true;
        this.path = AndroidPath_androidKt.Path();
        this.renderPath = AndroidPath_androidKt.Path();
        m14553b = LazyJVM.m14553b(EnumC38505n.f101867d, PathComponent$pathMeasure$2.INSTANCE);
        this.pathMeasure$delegate = m14553b;
        this.parser = new PathParser();
    }

    private final PathMeasure getPathMeasure() {
        return (PathMeasure) this.pathMeasure$delegate.getValue();
    }

    private final void updatePath() {
        this.parser.clear();
        this.path.reset();
        this.parser.addPathNodes(this.pathData).toPath(this.path);
        updateRenderPath();
    }

    private final void updateRenderPath() {
        boolean z;
        boolean z2;
        this.renderPath.reset();
        if (this.trimPathStart == 0.0f) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (this.trimPathEnd == 1.0f) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                Path.m107759addPathUv8p0NA$default(this.renderPath, this.path, 0L, 2, null);
                return;
            }
        }
        getPathMeasure().setPath(this.path, false);
        float length = getPathMeasure().getLength();
        float f = this.trimPathStart;
        float f2 = this.trimPathOffset;
        float f3 = ((f + f2) % 1.0f) * length;
        float f4 = ((this.trimPathEnd + f2) % 1.0f) * length;
        if (f3 > f4) {
            getPathMeasure().getSegment(f3, length, this.renderPath, true);
            getPathMeasure().getSegment(0.0f, f4, this.renderPath, true);
            return;
        }
        getPathMeasure().getSegment(f3, f4, this.renderPath, true);
    }

    @Override // androidx.compose.p015ui.graphics.vector.VNode
    public void draw(@NotNull DrawScope drawScope) {
        Intrinsics.checkNotNullParameter(drawScope, "<this>");
        if (this.isPathDirty) {
            updatePath();
        } else if (this.isTrimPathDirty) {
            updateRenderPath();
        }
        this.isPathDirty = false;
        this.isTrimPathDirty = false;
        Brush brush = this.fill;
        if (brush != null) {
            DrawScope.m108011drawPathGBMwjPU$default(drawScope, this.renderPath, brush, this.fillAlpha, null, null, 0, 56, null);
        }
        Brush brush2 = this.stroke;
        if (brush2 != null) {
            Stroke stroke = this.strokeStyle;
            if (this.isStrokeDirty || stroke == null) {
                stroke = new Stroke(this.strokeLineWidth, this.strokeLineMiter, this.strokeLineCap, this.strokeLineJoin, null, 16, null);
                this.strokeStyle = stroke;
                this.isStrokeDirty = false;
            }
            DrawScope.m108011drawPathGBMwjPU$default(drawScope, this.renderPath, brush2, this.strokeAlpha, stroke, null, 0, 48, null);
        }
    }

    @Nullable
    public final Brush getFill() {
        return this.fill;
    }

    public final float getFillAlpha() {
        return this.fillAlpha;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    @NotNull
    public final List<PathNode> getPathData() {
        return this.pathData;
    }

    /* renamed from: getPathFillType-Rg-k1Os  reason: not valid java name */
    public final int m108106getPathFillTypeRgk1Os() {
        return this.pathFillType;
    }

    @Nullable
    public final Brush getStroke() {
        return this.stroke;
    }

    public final float getStrokeAlpha() {
        return this.strokeAlpha;
    }

    /* renamed from: getStrokeLineCap-KaPHkGw  reason: not valid java name */
    public final int m108107getStrokeLineCapKaPHkGw() {
        return this.strokeLineCap;
    }

    /* renamed from: getStrokeLineJoin-LxFBmk8  reason: not valid java name */
    public final int m108108getStrokeLineJoinLxFBmk8() {
        return this.strokeLineJoin;
    }

    public final float getStrokeLineMiter() {
        return this.strokeLineMiter;
    }

    public final float getStrokeLineWidth() {
        return this.strokeLineWidth;
    }

    public final float getTrimPathEnd() {
        return this.trimPathEnd;
    }

    public final float getTrimPathOffset() {
        return this.trimPathOffset;
    }

    public final float getTrimPathStart() {
        return this.trimPathStart;
    }

    public final void setFill(@Nullable Brush brush) {
        this.fill = brush;
        invalidate();
    }

    public final void setFillAlpha(float f) {
        this.fillAlpha = f;
        invalidate();
    }

    public final void setName(@NotNull String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.name = value;
        invalidate();
    }

    public final void setPathData(@NotNull List<? extends PathNode> value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.pathData = value;
        this.isPathDirty = true;
        invalidate();
    }

    /* renamed from: setPathFillType-oQ8Xj4U  reason: not valid java name */
    public final void m108109setPathFillTypeoQ8Xj4U(int i) {
        this.pathFillType = i;
        this.renderPath.mo107425setFillTypeoQ8Xj4U(i);
        invalidate();
    }

    public final void setStroke(@Nullable Brush brush) {
        this.stroke = brush;
        invalidate();
    }

    public final void setStrokeAlpha(float f) {
        this.strokeAlpha = f;
        invalidate();
    }

    /* renamed from: setStrokeLineCap-BeK7IIE  reason: not valid java name */
    public final void m108110setStrokeLineCapBeK7IIE(int i) {
        this.strokeLineCap = i;
        this.isStrokeDirty = true;
        invalidate();
    }

    /* renamed from: setStrokeLineJoin-Ww9F2mQ  reason: not valid java name */
    public final void m108111setStrokeLineJoinWw9F2mQ(int i) {
        this.strokeLineJoin = i;
        this.isStrokeDirty = true;
        invalidate();
    }

    public final void setStrokeLineMiter(float f) {
        this.strokeLineMiter = f;
        this.isStrokeDirty = true;
        invalidate();
    }

    public final void setStrokeLineWidth(float f) {
        this.strokeLineWidth = f;
        invalidate();
    }

    public final void setTrimPathEnd(float f) {
        boolean z;
        if (this.trimPathEnd == f) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            this.trimPathEnd = f;
            this.isTrimPathDirty = true;
            invalidate();
        }
    }

    public final void setTrimPathOffset(float f) {
        boolean z;
        if (this.trimPathOffset == f) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            this.trimPathOffset = f;
            this.isTrimPathDirty = true;
            invalidate();
        }
    }

    public final void setTrimPathStart(float f) {
        boolean z;
        if (this.trimPathStart == f) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            this.trimPathStart = f;
            this.isTrimPathDirty = true;
            invalidate();
        }
    }

    @NotNull
    public String toString() {
        return this.path.toString();
    }
}
