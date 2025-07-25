package androidx.compose.p015ui.graphics;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.Region;
import androidx.compose.p015ui.geometry.Offset;
import androidx.compose.p015ui.graphics.PointMode;
import androidx.compose.p015ui.unit.IntOffset;
import androidx.compose.p015ui.unit.IntSize;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.C37629d;
import kotlin.ranges.PrimitiveRanges;
import kotlin.ranges._Ranges;
import org.jetbrains.annotations.NotNull;

/* compiled from: AndroidCanvas.android.kt */
@Metadata
/* renamed from: androidx.compose.ui.graphics.AndroidCanvas */
/* loaded from: classes.dex */
public final class AndroidCanvas implements Canvas {
    @NotNull
    private final Rect dstRect;
    @NotNull
    private Canvas internalCanvas;
    @NotNull
    private final Rect srcRect;

    public AndroidCanvas() {
        Canvas canvas;
        canvas = AndroidCanvas_androidKt.EmptyCanvas;
        this.internalCanvas = canvas;
        this.srcRect = new Rect();
        this.dstRect = new Rect();
    }

    private final void drawLines(List<Offset> list, Paint paint, int i) {
        PrimitiveRanges m16900v;
        C37629d m16901u;
        if (list.size() >= 2) {
            m16900v = _Ranges.m16900v(0, list.size() - 1);
            m16901u = _Ranges.m16901u(m16900v, i);
            int m16953c = m16901u.m16953c();
            int m16952d = m16901u.m16952d();
            int m16951f = m16901u.m16951f();
            if ((m16951f <= 0 || m16953c > m16952d) && (m16951f >= 0 || m16952d > m16953c)) {
                return;
            }
            while (true) {
                long m107301unboximpl = list.get(m16953c).m107301unboximpl();
                long m107301unboximpl2 = list.get(m16953c + 1).m107301unboximpl();
                this.internalCanvas.drawLine(Offset.m107291getXimpl(m107301unboximpl), Offset.m107292getYimpl(m107301unboximpl), Offset.m107291getXimpl(m107301unboximpl2), Offset.m107292getYimpl(m107301unboximpl2), paint.asFrameworkPaint());
                if (m16953c != m16952d) {
                    m16953c += m16951f;
                } else {
                    return;
                }
            }
        }
    }

    private final void drawPoints(List<Offset> list, Paint paint) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            long m107301unboximpl = list.get(i).m107301unboximpl();
            this.internalCanvas.drawPoint(Offset.m107291getXimpl(m107301unboximpl), Offset.m107292getYimpl(m107301unboximpl), paint.asFrameworkPaint());
        }
    }

    private final void drawRawLines(float[] fArr, Paint paint, int i) {
        PrimitiveRanges m16900v;
        C37629d m16901u;
        if (fArr.length >= 4 && fArr.length % 2 == 0) {
            m16900v = _Ranges.m16900v(0, fArr.length - 3);
            m16901u = _Ranges.m16901u(m16900v, i * 2);
            int m16953c = m16901u.m16953c();
            int m16952d = m16901u.m16952d();
            int m16951f = m16901u.m16951f();
            if ((m16951f <= 0 || m16953c > m16952d) && (m16951f >= 0 || m16952d > m16953c)) {
                return;
            }
            while (true) {
                this.internalCanvas.drawLine(fArr[m16953c], fArr[m16953c + 1], fArr[m16953c + 2], fArr[m16953c + 3], paint.asFrameworkPaint());
                if (m16953c != m16952d) {
                    m16953c += m16951f;
                } else {
                    return;
                }
            }
        }
    }

    private final void drawRawPoints(float[] fArr, Paint paint, int i) {
        PrimitiveRanges m16900v;
        C37629d m16901u;
        if (fArr.length % 2 == 0) {
            m16900v = _Ranges.m16900v(0, fArr.length - 1);
            m16901u = _Ranges.m16901u(m16900v, i);
            int m16953c = m16901u.m16953c();
            int m16952d = m16901u.m16952d();
            int m16951f = m16901u.m16951f();
            if ((m16951f <= 0 || m16953c > m16952d) && (m16951f >= 0 || m16952d > m16953c)) {
                return;
            }
            while (true) {
                this.internalCanvas.drawPoint(fArr[m16953c], fArr[m16953c + 1], paint.asFrameworkPaint());
                if (m16953c != m16952d) {
                    m16953c += m16951f;
                } else {
                    return;
                }
            }
        }
    }

    @Override // androidx.compose.p015ui.graphics.Canvas
    /* renamed from: clipPath-mtrdD-E  reason: not valid java name */
    public void mo107385clipPathmtrdDE(@NotNull Path path, int i) {
        Intrinsics.checkNotNullParameter(path, "path");
        Canvas canvas = this.internalCanvas;
        if (path instanceof AndroidPath) {
            canvas.clipPath(((AndroidPath) path).getInternalPath(), m107395toRegionOp7u2Bmg(i));
            return;
        }
        throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
    }

    @Override // androidx.compose.p015ui.graphics.Canvas
    /* renamed from: clipRect-N_I0leg  reason: not valid java name */
    public void mo107386clipRectN_I0leg(float f, float f2, float f3, float f4, int i) {
        this.internalCanvas.clipRect(f, f2, f3, f4, m107395toRegionOp7u2Bmg(i));
    }

    @Override // androidx.compose.p015ui.graphics.Canvas
    /* renamed from: concat-58bKbWc  reason: not valid java name */
    public void mo107387concat58bKbWc(@NotNull float[] matrix) {
        Intrinsics.checkNotNullParameter(matrix, "matrix");
        if (!MatrixKt.m107745isIdentity58bKbWc(matrix)) {
            Matrix matrix2 = new Matrix();
            AndroidMatrixConversions_androidKt.m107402setFromEL8BTi8(matrix2, matrix);
            this.internalCanvas.concat(matrix2);
        }
    }

    @Override // androidx.compose.p015ui.graphics.Canvas
    public void disableZ() {
        CanvasUtils.INSTANCE.enableZ(this.internalCanvas, false);
    }

    @Override // androidx.compose.p015ui.graphics.Canvas
    public void drawArc(float f, float f2, float f3, float f4, float f5, float f6, boolean z, @NotNull Paint paint) {
        Intrinsics.checkNotNullParameter(paint, "paint");
        this.internalCanvas.drawArc(f, f2, f3, f4, f5, f6, z, paint.asFrameworkPaint());
    }

    @Override // androidx.compose.p015ui.graphics.Canvas
    /* renamed from: drawCircle-9KIMszo  reason: not valid java name */
    public void mo107388drawCircle9KIMszo(long j, float f, @NotNull Paint paint) {
        Intrinsics.checkNotNullParameter(paint, "paint");
        this.internalCanvas.drawCircle(Offset.m107291getXimpl(j), Offset.m107292getYimpl(j), f, paint.asFrameworkPaint());
    }

    @Override // androidx.compose.p015ui.graphics.Canvas
    /* renamed from: drawImage-d-4ec7I  reason: not valid java name */
    public void mo107389drawImaged4ec7I(@NotNull ImageBitmap image, long j, @NotNull Paint paint) {
        Intrinsics.checkNotNullParameter(image, "image");
        Intrinsics.checkNotNullParameter(paint, "paint");
        this.internalCanvas.drawBitmap(AndroidImageBitmap_androidKt.asAndroidBitmap(image), Offset.m107291getXimpl(j), Offset.m107292getYimpl(j), paint.asFrameworkPaint());
    }

    @Override // androidx.compose.p015ui.graphics.Canvas
    /* renamed from: drawImageRect-HPBpro0  reason: not valid java name */
    public void mo107390drawImageRectHPBpro0(@NotNull ImageBitmap image, long j, long j2, long j3, long j4, @NotNull Paint paint) {
        Intrinsics.checkNotNullParameter(image, "image");
        Intrinsics.checkNotNullParameter(paint, "paint");
        Canvas canvas = this.internalCanvas;
        Bitmap asAndroidBitmap = AndroidImageBitmap_androidKt.asAndroidBitmap(image);
        Rect rect = this.srcRect;
        rect.left = IntOffset.m109852getXimpl(j);
        rect.top = IntOffset.m109853getYimpl(j);
        rect.right = IntOffset.m109852getXimpl(j) + IntSize.m109894getWidthimpl(j2);
        rect.bottom = IntOffset.m109853getYimpl(j) + IntSize.m109893getHeightimpl(j2);
        Unit unit = Unit.f99208a;
        Rect rect2 = this.dstRect;
        rect2.left = IntOffset.m109852getXimpl(j3);
        rect2.top = IntOffset.m109853getYimpl(j3);
        rect2.right = IntOffset.m109852getXimpl(j3) + IntSize.m109894getWidthimpl(j4);
        rect2.bottom = IntOffset.m109853getYimpl(j3) + IntSize.m109893getHeightimpl(j4);
        canvas.drawBitmap(asAndroidBitmap, rect, rect2, paint.asFrameworkPaint());
    }

    @Override // androidx.compose.p015ui.graphics.Canvas
    /* renamed from: drawLine-Wko1d7g  reason: not valid java name */
    public void mo107391drawLineWko1d7g(long j, long j2, @NotNull Paint paint) {
        Intrinsics.checkNotNullParameter(paint, "paint");
        this.internalCanvas.drawLine(Offset.m107291getXimpl(j), Offset.m107292getYimpl(j), Offset.m107291getXimpl(j2), Offset.m107292getYimpl(j2), paint.asFrameworkPaint());
    }

    @Override // androidx.compose.p015ui.graphics.Canvas
    public void drawOval(float f, float f2, float f3, float f4, @NotNull Paint paint) {
        Intrinsics.checkNotNullParameter(paint, "paint");
        this.internalCanvas.drawOval(f, f2, f3, f4, paint.asFrameworkPaint());
    }

    @Override // androidx.compose.p015ui.graphics.Canvas
    public void drawPath(@NotNull Path path, @NotNull Paint paint) {
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(paint, "paint");
        Canvas canvas = this.internalCanvas;
        if (path instanceof AndroidPath) {
            canvas.drawPath(((AndroidPath) path).getInternalPath(), paint.asFrameworkPaint());
            return;
        }
        throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
    }

    @Override // androidx.compose.p015ui.graphics.Canvas
    /* renamed from: drawPoints-O7TthRY  reason: not valid java name */
    public void mo107392drawPointsO7TthRY(int i, @NotNull List<Offset> points, @NotNull Paint paint) {
        Intrinsics.checkNotNullParameter(points, "points");
        Intrinsics.checkNotNullParameter(paint, "paint");
        PointMode.Companion companion = PointMode.Companion;
        if (PointMode.m107788equalsimpl0(i, companion.m107792getLinesr_lszbg())) {
            drawLines(points, paint, 2);
        } else if (PointMode.m107788equalsimpl0(i, companion.m107794getPolygonr_lszbg())) {
            drawLines(points, paint, 1);
        } else if (PointMode.m107788equalsimpl0(i, companion.m107793getPointsr_lszbg())) {
            drawPoints(points, paint);
        }
    }

    @Override // androidx.compose.p015ui.graphics.Canvas
    /* renamed from: drawRawPoints-O7TthRY  reason: not valid java name */
    public void mo107393drawRawPointsO7TthRY(int i, @NotNull float[] points, @NotNull Paint paint) {
        Intrinsics.checkNotNullParameter(points, "points");
        Intrinsics.checkNotNullParameter(paint, "paint");
        if (points.length % 2 == 0) {
            PointMode.Companion companion = PointMode.Companion;
            if (PointMode.m107788equalsimpl0(i, companion.m107792getLinesr_lszbg())) {
                drawRawLines(points, paint, 2);
                return;
            } else if (PointMode.m107788equalsimpl0(i, companion.m107794getPolygonr_lszbg())) {
                drawRawLines(points, paint, 1);
                return;
            } else if (PointMode.m107788equalsimpl0(i, companion.m107793getPointsr_lszbg())) {
                drawRawPoints(points, paint, 2);
                return;
            } else {
                return;
            }
        }
        throw new IllegalArgumentException("points must have an even number of values");
    }

    @Override // androidx.compose.p015ui.graphics.Canvas
    public void drawRect(float f, float f2, float f3, float f4, @NotNull Paint paint) {
        Intrinsics.checkNotNullParameter(paint, "paint");
        this.internalCanvas.drawRect(f, f2, f3, f4, paint.asFrameworkPaint());
    }

    @Override // androidx.compose.p015ui.graphics.Canvas
    public void drawRoundRect(float f, float f2, float f3, float f4, float f5, float f6, @NotNull Paint paint) {
        Intrinsics.checkNotNullParameter(paint, "paint");
        this.internalCanvas.drawRoundRect(f, f2, f3, f4, f5, f6, paint.asFrameworkPaint());
    }

    @Override // androidx.compose.p015ui.graphics.Canvas
    /* renamed from: drawVertices-TPEHhCM  reason: not valid java name */
    public void mo107394drawVerticesTPEHhCM(@NotNull Vertices vertices, int i, @NotNull Paint paint) {
        Intrinsics.checkNotNullParameter(vertices, "vertices");
        Intrinsics.checkNotNullParameter(paint, "paint");
        this.internalCanvas.drawVertices(AndroidVertexMode_androidKt.m107435toAndroidVertexModeJOOmi9M(vertices.m107880getVertexModec2xauaI()), vertices.getPositions().length, vertices.getPositions(), 0, vertices.getTextureCoordinates(), 0, vertices.getColors(), 0, vertices.getIndices(), 0, vertices.getIndices().length, paint.asFrameworkPaint());
    }

    @Override // androidx.compose.p015ui.graphics.Canvas
    public void enableZ() {
        CanvasUtils.INSTANCE.enableZ(this.internalCanvas, true);
    }

    @NotNull
    public final Canvas getInternalCanvas() {
        return this.internalCanvas;
    }

    @Override // androidx.compose.p015ui.graphics.Canvas
    public void restore() {
        this.internalCanvas.restore();
    }

    @Override // androidx.compose.p015ui.graphics.Canvas
    public void rotate(float f) {
        this.internalCanvas.rotate(f);
    }

    @Override // androidx.compose.p015ui.graphics.Canvas
    public void save() {
        this.internalCanvas.save();
    }

    @Override // androidx.compose.p015ui.graphics.Canvas
    public void saveLayer(@NotNull androidx.compose.p015ui.geometry.Rect bounds, @NotNull Paint paint) {
        Intrinsics.checkNotNullParameter(bounds, "bounds");
        Intrinsics.checkNotNullParameter(paint, "paint");
        this.internalCanvas.saveLayer(bounds.getLeft(), bounds.getTop(), bounds.getRight(), bounds.getBottom(), paint.asFrameworkPaint(), 31);
    }

    @Override // androidx.compose.p015ui.graphics.Canvas
    public void scale(float f, float f2) {
        this.internalCanvas.scale(f, f2);
    }

    public final void setInternalCanvas(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "<set-?>");
        this.internalCanvas = canvas;
    }

    @Override // androidx.compose.p015ui.graphics.Canvas
    public void skew(float f, float f2) {
        this.internalCanvas.skew(f, f2);
    }

    @NotNull
    /* renamed from: toRegionOp--7u2Bmg  reason: not valid java name */
    public final Region.Op m107395toRegionOp7u2Bmg(int i) {
        if (ClipOp.m107511equalsimpl0(i, ClipOp.Companion.m107515getDifferencertfAjoo())) {
            return Region.Op.DIFFERENCE;
        }
        return Region.Op.INTERSECT;
    }

    @Override // androidx.compose.p015ui.graphics.Canvas
    public void translate(float f, float f2) {
        this.internalCanvas.translate(f, f2);
    }

    public static /* synthetic */ void getInternalCanvas$annotations() {
    }
}
