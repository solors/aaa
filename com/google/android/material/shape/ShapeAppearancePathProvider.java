package com.google.android.material.shape;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.annotation.UiThread;

/* loaded from: classes5.dex */
public class ShapeAppearancePathProvider {

    /* renamed from: a */
    private final ShapePath[] f38218a = new ShapePath[4];

    /* renamed from: b */
    private final Matrix[] f38219b = new Matrix[4];

    /* renamed from: c */
    private final Matrix[] f38220c = new Matrix[4];

    /* renamed from: d */
    private final PointF f38221d = new PointF();

    /* renamed from: e */
    private final Path f38222e = new Path();

    /* renamed from: f */
    private final Path f38223f = new Path();

    /* renamed from: g */
    private final ShapePath f38224g = new ShapePath();

    /* renamed from: h */
    private final float[] f38225h = new float[2];

    /* renamed from: i */
    private final float[] f38226i = new float[2];

    /* renamed from: j */
    private final Path f38227j = new Path();

    /* renamed from: k */
    private final Path f38228k = new Path();

    /* renamed from: l */
    private boolean f38229l = true;

    /* loaded from: classes5.dex */
    private static class Lazy {

        /* renamed from: a */
        static final ShapeAppearancePathProvider f38230a = new ShapeAppearancePathProvider();

        private Lazy() {
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* loaded from: classes5.dex */
    public interface PathListener {
        void onCornerPathCreated(ShapePath shapePath, Matrix matrix, int i);

        void onEdgePathCreated(ShapePath shapePath, Matrix matrix, int i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class ShapeAppearancePathSpec {
        @NonNull
        public final RectF bounds;
        public final float interpolation;
        @NonNull
        public final Path path;
        @Nullable
        public final PathListener pathListener;
        @NonNull
        public final ShapeAppearanceModel shapeAppearanceModel;

        ShapeAppearancePathSpec(@NonNull ShapeAppearanceModel shapeAppearanceModel, float f, RectF rectF, @Nullable PathListener pathListener, Path path) {
            this.pathListener = pathListener;
            this.shapeAppearanceModel = shapeAppearanceModel;
            this.interpolation = f;
            this.bounds = rectF;
            this.path = path;
        }
    }

    public ShapeAppearancePathProvider() {
        for (int i = 0; i < 4; i++) {
            this.f38218a[i] = new ShapePath();
            this.f38219b[i] = new Matrix();
            this.f38220c[i] = new Matrix();
        }
    }

    /* renamed from: a */
    private float m71061a(int i) {
        return (i + 1) * 90;
    }

    /* renamed from: b */
    private void m71060b(@NonNull ShapeAppearancePathSpec shapeAppearancePathSpec, int i) {
        this.f38225h[0] = this.f38218a[i].m71041i();
        this.f38225h[1] = this.f38218a[i].m71040j();
        this.f38219b[i].mapPoints(this.f38225h);
        if (i == 0) {
            Path path = shapeAppearancePathSpec.path;
            float[] fArr = this.f38225h;
            path.moveTo(fArr[0], fArr[1]);
        } else {
            Path path2 = shapeAppearancePathSpec.path;
            float[] fArr2 = this.f38225h;
            path2.lineTo(fArr2[0], fArr2[1]);
        }
        this.f38218a[i].applyToPath(this.f38219b[i], shapeAppearancePathSpec.path);
        PathListener pathListener = shapeAppearancePathSpec.pathListener;
        if (pathListener != null) {
            pathListener.onCornerPathCreated(this.f38218a[i], this.f38219b[i], i);
        }
    }

    /* renamed from: c */
    private void m71059c(@NonNull ShapeAppearancePathSpec shapeAppearancePathSpec, int i) {
        int i2 = (i + 1) % 4;
        this.f38225h[0] = this.f38218a[i].m71043g();
        this.f38225h[1] = this.f38218a[i].m71042h();
        this.f38219b[i].mapPoints(this.f38225h);
        this.f38226i[0] = this.f38218a[i2].m71041i();
        this.f38226i[1] = this.f38218a[i2].m71040j();
        this.f38219b[i2].mapPoints(this.f38226i);
        float[] fArr = this.f38225h;
        float f = fArr[0];
        float[] fArr2 = this.f38226i;
        float max = Math.max(((float) Math.hypot(f - fArr2[0], fArr[1] - fArr2[1])) - 0.001f, 0.0f);
        float m71055g = m71055g(shapeAppearancePathSpec.bounds, i);
        this.f38224g.reset(0.0f, 0.0f);
        EdgeTreatment m71054h = m71054h(i, shapeAppearancePathSpec.shapeAppearanceModel);
        m71054h.getEdgePath(max, m71055g, shapeAppearancePathSpec.interpolation, this.f38224g);
        this.f38227j.reset();
        this.f38224g.applyToPath(this.f38220c[i], this.f38227j);
        if (this.f38229l && (m71054h.mo71078b() || m71053i(this.f38227j, i) || m71053i(this.f38227j, i2))) {
            Path path = this.f38227j;
            path.op(path, this.f38223f, Path.Op.DIFFERENCE);
            this.f38225h[0] = this.f38224g.m71041i();
            this.f38225h[1] = this.f38224g.m71040j();
            this.f38220c[i].mapPoints(this.f38225h);
            Path path2 = this.f38222e;
            float[] fArr3 = this.f38225h;
            path2.moveTo(fArr3[0], fArr3[1]);
            this.f38224g.applyToPath(this.f38220c[i], this.f38222e);
        } else {
            this.f38224g.applyToPath(this.f38220c[i], shapeAppearancePathSpec.path);
        }
        PathListener pathListener = shapeAppearancePathSpec.pathListener;
        if (pathListener != null) {
            pathListener.onEdgePathCreated(this.f38224g, this.f38220c[i], i);
        }
    }

    /* renamed from: d */
    private void m71058d(int i, @NonNull RectF rectF, @NonNull PointF pointF) {
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    pointF.set(rectF.right, rectF.top);
                    return;
                } else {
                    pointF.set(rectF.left, rectF.top);
                    return;
                }
            }
            pointF.set(rectF.left, rectF.bottom);
            return;
        }
        pointF.set(rectF.right, rectF.bottom);
    }

    /* renamed from: e */
    private CornerSize m71057e(int i, @NonNull ShapeAppearanceModel shapeAppearanceModel) {
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return shapeAppearanceModel.getTopRightCornerSize();
                }
                return shapeAppearanceModel.getTopLeftCornerSize();
            }
            return shapeAppearanceModel.getBottomLeftCornerSize();
        }
        return shapeAppearanceModel.getBottomRightCornerSize();
    }

    /* renamed from: f */
    private CornerTreatment m71056f(int i, @NonNull ShapeAppearanceModel shapeAppearanceModel) {
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return shapeAppearanceModel.getTopRightCorner();
                }
                return shapeAppearanceModel.getTopLeftCorner();
            }
            return shapeAppearanceModel.getBottomLeftCorner();
        }
        return shapeAppearanceModel.getBottomRightCorner();
    }

    /* renamed from: g */
    private float m71055g(@NonNull RectF rectF, int i) {
        float[] fArr = this.f38225h;
        ShapePath shapePath = this.f38218a[i];
        fArr[0] = shapePath.endX;
        fArr[1] = shapePath.endY;
        this.f38219b[i].mapPoints(fArr);
        if (i != 1 && i != 3) {
            return Math.abs(rectF.centerY() - this.f38225h[1]);
        }
        return Math.abs(rectF.centerX() - this.f38225h[0]);
    }

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @UiThread
    public static ShapeAppearancePathProvider getInstance() {
        return Lazy.f38230a;
    }

    /* renamed from: h */
    private EdgeTreatment m71054h(int i, @NonNull ShapeAppearanceModel shapeAppearanceModel) {
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return shapeAppearanceModel.getRightEdge();
                }
                return shapeAppearanceModel.getTopEdge();
            }
            return shapeAppearanceModel.getLeftEdge();
        }
        return shapeAppearanceModel.getBottomEdge();
    }

    @RequiresApi(19)
    /* renamed from: i */
    private boolean m71053i(Path path, int i) {
        this.f38228k.reset();
        this.f38218a[i].applyToPath(this.f38219b[i], this.f38228k);
        RectF rectF = new RectF();
        path.computeBounds(rectF, true);
        this.f38228k.computeBounds(rectF, true);
        path.op(this.f38228k, Path.Op.INTERSECT);
        path.computeBounds(rectF, true);
        if (!rectF.isEmpty()) {
            return true;
        }
        if (rectF.width() > 1.0f && rectF.height() > 1.0f) {
            return true;
        }
        return false;
    }

    /* renamed from: j */
    private void m71052j(@NonNull ShapeAppearancePathSpec shapeAppearancePathSpec, int i) {
        m71056f(i, shapeAppearancePathSpec.shapeAppearanceModel).getCornerPath(this.f38218a[i], 90.0f, shapeAppearancePathSpec.interpolation, shapeAppearancePathSpec.bounds, m71057e(i, shapeAppearancePathSpec.shapeAppearanceModel));
        float m71061a = m71061a(i);
        this.f38219b[i].reset();
        m71058d(i, shapeAppearancePathSpec.bounds, this.f38221d);
        Matrix matrix = this.f38219b[i];
        PointF pointF = this.f38221d;
        matrix.setTranslate(pointF.x, pointF.y);
        this.f38219b[i].preRotate(m71061a);
    }

    /* renamed from: l */
    private void m71050l(int i) {
        this.f38225h[0] = this.f38218a[i].m71043g();
        this.f38225h[1] = this.f38218a[i].m71042h();
        this.f38219b[i].mapPoints(this.f38225h);
        float m71061a = m71061a(i);
        this.f38220c[i].reset();
        Matrix matrix = this.f38220c[i];
        float[] fArr = this.f38225h;
        matrix.setTranslate(fArr[0], fArr[1]);
        this.f38220c[i].preRotate(m71061a);
    }

    public void calculatePath(ShapeAppearanceModel shapeAppearanceModel, float f, RectF rectF, @NonNull Path path) {
        calculatePath(shapeAppearanceModel, f, rectF, null, path);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k */
    public void m71051k(boolean z) {
        this.f38229l = z;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void calculatePath(ShapeAppearanceModel shapeAppearanceModel, float f, RectF rectF, PathListener pathListener, @NonNull Path path) {
        path.rewind();
        this.f38222e.rewind();
        this.f38223f.rewind();
        this.f38223f.addRect(rectF, Path.Direction.CW);
        ShapeAppearancePathSpec shapeAppearancePathSpec = new ShapeAppearancePathSpec(shapeAppearanceModel, f, rectF, pathListener, path);
        for (int i = 0; i < 4; i++) {
            m71052j(shapeAppearancePathSpec, i);
            m71050l(i);
        }
        for (int i2 = 0; i2 < 4; i2++) {
            m71060b(shapeAppearancePathSpec, i2);
            m71059c(shapeAppearancePathSpec, i2);
        }
        path.close();
        this.f38222e.close();
        if (this.f38222e.isEmpty()) {
            return;
        }
        path.op(this.f38222e, Path.Op.UNION);
    }
}
