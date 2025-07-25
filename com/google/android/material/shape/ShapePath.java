package com.google.android.material.shape;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import com.google.android.material.shadow.ShadowRenderer;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes5.dex */
public class ShapePath {

    /* renamed from: a */
    private final List<PathOperation> f38231a = new ArrayList();

    /* renamed from: b */
    private final List<ShadowCompatOperation> f38232b = new ArrayList();

    /* renamed from: c */
    private boolean f38233c;
    @Deprecated
    public float currentShadowAngle;
    @Deprecated
    public float endShadowAngle;
    @Deprecated
    public float endX;
    @Deprecated
    public float endY;
    @Deprecated
    public float startX;
    @Deprecated
    public float startY;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static class ArcShadowOperation extends ShadowCompatOperation {

        /* renamed from: c */
        private final PathArcOperation f38237c;

        public ArcShadowOperation(PathArcOperation pathArcOperation) {
            this.f38237c = pathArcOperation;
        }

        @Override // com.google.android.material.shape.ShapePath.ShadowCompatOperation
        public void draw(Matrix matrix, @NonNull ShadowRenderer shadowRenderer, int i, @NonNull Canvas canvas) {
            shadowRenderer.drawCornerShadow(canvas, matrix, new RectF(this.f38237c.m71020j(), this.f38237c.m71016n(), this.f38237c.m71019k(), this.f38237c.m71021i()), i, this.f38237c.m71018l(), this.f38237c.m71017m());
        }
    }

    /* loaded from: classes5.dex */
    static class InnerCornerShadowOperation extends ShadowCompatOperation {

        /* renamed from: c */
        private final PathLineOperation f38238c;

        /* renamed from: d */
        private final PathLineOperation f38239d;

        /* renamed from: e */
        private final float f38240e;

        /* renamed from: f */
        private final float f38241f;

        public InnerCornerShadowOperation(PathLineOperation pathLineOperation, PathLineOperation pathLineOperation2, float f, float f2) {
            this.f38238c = pathLineOperation;
            this.f38239d = pathLineOperation2;
            this.f38240e = f;
            this.f38241f = f2;
        }

        /* renamed from: a */
        float m71033a() {
            return (float) Math.toDegrees(Math.atan((this.f38239d.f38253c - this.f38238c.f38253c) / (this.f38239d.f38252b - this.f38238c.f38252b)));
        }

        /* renamed from: b */
        float m71032b() {
            return (float) Math.toDegrees(Math.atan((this.f38238c.f38253c - this.f38241f) / (this.f38238c.f38252b - this.f38240e)));
        }

        /* renamed from: c */
        float m71031c() {
            float m71033a = ((m71033a() - m71032b()) + 360.0f) % 360.0f;
            if (m71033a <= 180.0f) {
                return m71033a;
            }
            return m71033a - 360.0f;
        }

        @Override // com.google.android.material.shape.ShapePath.ShadowCompatOperation
        public void draw(Matrix matrix, ShadowRenderer shadowRenderer, int i, Canvas canvas) {
            ShadowRenderer shadowRenderer2;
            float m71031c = m71031c();
            if (m71031c > 0.0f) {
                return;
            }
            double hypot = Math.hypot(this.f38238c.f38252b - this.f38240e, this.f38238c.f38253c - this.f38241f);
            double hypot2 = Math.hypot(this.f38239d.f38252b - this.f38238c.f38252b, this.f38239d.f38253c - this.f38238c.f38253c);
            float min = (float) Math.min(i, Math.min(hypot, hypot2));
            double d = min;
            double tan = Math.tan(Math.toRadians((-m71031c) / 2.0f)) * d;
            if (hypot > tan) {
                RectF rectF = new RectF(0.0f, 0.0f, (float) (hypot - tan), 0.0f);
                this.f38256a.set(matrix);
                this.f38256a.preTranslate(this.f38240e, this.f38241f);
                this.f38256a.preRotate(m71032b());
                shadowRenderer2 = shadowRenderer;
                shadowRenderer2.drawEdgeShadow(canvas, this.f38256a, rectF, i);
            } else {
                shadowRenderer2 = shadowRenderer;
            }
            float f = 2.0f * min;
            RectF rectF2 = new RectF(0.0f, 0.0f, f, f);
            this.f38256a.set(matrix);
            this.f38256a.preTranslate(this.f38238c.f38252b, this.f38238c.f38253c);
            this.f38256a.preRotate(m71032b());
            this.f38256a.preTranslate((float) ((-tan) - d), (-2.0f) * min);
            shadowRenderer.drawInnerCornerShadow(canvas, this.f38256a, rectF2, (int) min, 450.0f, m71031c, new float[]{(float) (d + tan), f});
            if (hypot2 > tan) {
                RectF rectF3 = new RectF(0.0f, 0.0f, (float) (hypot2 - tan), 0.0f);
                this.f38256a.set(matrix);
                this.f38256a.preTranslate(this.f38238c.f38252b, this.f38238c.f38253c);
                this.f38256a.preRotate(m71033a());
                this.f38256a.preTranslate((float) tan, 0.0f);
                shadowRenderer2.drawEdgeShadow(canvas, this.f38256a, rectF3, i);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static class LineShadowOperation extends ShadowCompatOperation {

        /* renamed from: c */
        private final PathLineOperation f38242c;

        /* renamed from: d */
        private final float f38243d;

        /* renamed from: e */
        private final float f38244e;

        public LineShadowOperation(PathLineOperation pathLineOperation, float f, float f2) {
            this.f38242c = pathLineOperation;
            this.f38243d = f;
            this.f38244e = f2;
        }

        /* renamed from: a */
        float m71030a() {
            return (float) Math.toDegrees(Math.atan((this.f38242c.f38253c - this.f38244e) / (this.f38242c.f38252b - this.f38243d)));
        }

        @Override // com.google.android.material.shape.ShapePath.ShadowCompatOperation
        public void draw(Matrix matrix, @NonNull ShadowRenderer shadowRenderer, int i, @NonNull Canvas canvas) {
            RectF rectF = new RectF(0.0f, 0.0f, (float) Math.hypot(this.f38242c.f38253c - this.f38244e, this.f38242c.f38252b - this.f38243d), 0.0f);
            this.f38256a.set(matrix);
            this.f38256a.preTranslate(this.f38243d, this.f38244e);
            this.f38256a.preRotate(m71030a());
            shadowRenderer.drawEdgeShadow(canvas, this.f38256a, rectF, i);
        }
    }

    /* loaded from: classes5.dex */
    public static class PathArcOperation extends PathOperation {

        /* renamed from: b */
        private static final RectF f38245b = new RectF();
        @Deprecated
        public float bottom;
        @Deprecated
        public float left;
        @Deprecated
        public float right;
        @Deprecated
        public float startAngle;
        @Deprecated
        public float sweepAngle;
        @Deprecated
        public float top;

        public PathArcOperation(float f, float f2, float f3, float f4) {
            m71014p(f);
            m71010t(f2);
            m71013q(f3);
            m71015o(f4);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: i */
        public float m71021i() {
            return this.bottom;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: j */
        public float m71020j() {
            return this.left;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: k */
        public float m71019k() {
            return this.right;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: l */
        public float m71018l() {
            return this.startAngle;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: m */
        public float m71017m() {
            return this.sweepAngle;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: n */
        public float m71016n() {
            return this.top;
        }

        /* renamed from: o */
        private void m71015o(float f) {
            this.bottom = f;
        }

        /* renamed from: p */
        private void m71014p(float f) {
            this.left = f;
        }

        /* renamed from: q */
        private void m71013q(float f) {
            this.right = f;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: r */
        public void m71012r(float f) {
            this.startAngle = f;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: s */
        public void m71011s(float f) {
            this.sweepAngle = f;
        }

        /* renamed from: t */
        private void m71010t(float f) {
            this.top = f;
        }

        @Override // com.google.android.material.shape.ShapePath.PathOperation
        public void applyToPath(@NonNull Matrix matrix, @NonNull Path path) {
            Matrix matrix2 = this.f38254a;
            matrix.invert(matrix2);
            path.transform(matrix2);
            RectF rectF = f38245b;
            rectF.set(m71020j(), m71016n(), m71019k(), m71021i());
            path.arcTo(rectF, m71018l(), m71017m(), false);
            path.transform(matrix);
        }
    }

    /* loaded from: classes5.dex */
    public static class PathCubicOperation extends PathOperation {

        /* renamed from: b */
        private float f38246b;

        /* renamed from: c */
        private float f38247c;

        /* renamed from: d */
        private float f38248d;

        /* renamed from: e */
        private float f38249e;

        /* renamed from: f */
        private float f38250f;

        /* renamed from: g */
        private float f38251g;

        public PathCubicOperation(float f, float f2, float f3, float f4, float f5, float f6) {
            m71009a(f);
            m71007c(f2);
            m71008b(f3);
            m71006d(f4);
            m71005e(f5);
            m71004f(f6);
        }

        /* renamed from: a */
        private void m71009a(float f) {
            this.f38246b = f;
        }

        /* renamed from: b */
        private void m71008b(float f) {
            this.f38248d = f;
        }

        /* renamed from: c */
        private void m71007c(float f) {
            this.f38247c = f;
        }

        /* renamed from: d */
        private void m71006d(float f) {
            this.f38249e = f;
        }

        /* renamed from: e */
        private void m71005e(float f) {
            this.f38250f = f;
        }

        /* renamed from: f */
        private void m71004f(float f) {
            this.f38251g = f;
        }

        @Override // com.google.android.material.shape.ShapePath.PathOperation
        public void applyToPath(@NonNull Matrix matrix, @NonNull Path path) {
            Matrix matrix2 = this.f38254a;
            matrix.invert(matrix2);
            path.transform(matrix2);
            path.cubicTo(this.f38246b, this.f38247c, this.f38248d, this.f38249e, this.f38250f, this.f38251g);
            path.transform(matrix);
        }
    }

    /* loaded from: classes5.dex */
    public static class PathLineOperation extends PathOperation {

        /* renamed from: b */
        private float f38252b;

        /* renamed from: c */
        private float f38253c;

        @Override // com.google.android.material.shape.ShapePath.PathOperation
        public void applyToPath(@NonNull Matrix matrix, @NonNull Path path) {
            Matrix matrix2 = this.f38254a;
            matrix.invert(matrix2);
            path.transform(matrix2);
            path.lineTo(this.f38252b, this.f38253c);
            path.transform(matrix);
        }
    }

    /* loaded from: classes5.dex */
    public static abstract class PathOperation {

        /* renamed from: a */
        protected final Matrix f38254a = new Matrix();

        public abstract void applyToPath(Matrix matrix, Path path);
    }

    /* loaded from: classes5.dex */
    public static class PathQuadOperation extends PathOperation {
        @Deprecated
        public float controlX;
        @Deprecated
        public float controlY;
        @Deprecated
        public float endX;
        @Deprecated
        public float endY;

        /* renamed from: e */
        private float m70995e() {
            return this.controlX;
        }

        /* renamed from: f */
        private float m70994f() {
            return this.controlY;
        }

        /* renamed from: g */
        private float m70993g() {
            return this.endX;
        }

        /* renamed from: h */
        private float m70992h() {
            return this.endY;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: i */
        public void m70991i(float f) {
            this.controlX = f;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: j */
        public void m70990j(float f) {
            this.controlY = f;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: k */
        public void m70989k(float f) {
            this.endX = f;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: l */
        public void m70988l(float f) {
            this.endY = f;
        }

        @Override // com.google.android.material.shape.ShapePath.PathOperation
        public void applyToPath(@NonNull Matrix matrix, @NonNull Path path) {
            Matrix matrix2 = this.f38254a;
            matrix.invert(matrix2);
            path.transform(matrix2);
            path.quadTo(m70995e(), m70994f(), m70993g(), m70992h());
            path.transform(matrix);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static abstract class ShadowCompatOperation {

        /* renamed from: b */
        static final Matrix f38255b = new Matrix();

        /* renamed from: a */
        final Matrix f38256a = new Matrix();

        ShadowCompatOperation() {
        }

        public abstract void draw(Matrix matrix, ShadowRenderer shadowRenderer, int i, Canvas canvas);

        public final void draw(ShadowRenderer shadowRenderer, int i, Canvas canvas) {
            draw(f38255b, shadowRenderer, i, canvas);
        }
    }

    public ShapePath() {
        reset(0.0f, 0.0f);
    }

    /* renamed from: a */
    private void m71049a(float f) {
        if (m71045e() == f) {
            return;
        }
        float m71045e = ((f - m71045e()) + 360.0f) % 360.0f;
        if (m71045e > 180.0f) {
            return;
        }
        PathArcOperation pathArcOperation = new PathArcOperation(m71043g(), m71042h(), m71043g(), m71042h());
        pathArcOperation.m71012r(m71045e());
        pathArcOperation.m71011s(m71045e);
        this.f38232b.add(new ArcShadowOperation(pathArcOperation));
        m71039k(f);
    }

    /* renamed from: b */
    private void m71048b(ShadowCompatOperation shadowCompatOperation, float f, float f2) {
        m71049a(f);
        this.f38232b.add(shadowCompatOperation);
        m71039k(f2);
    }

    /* renamed from: e */
    private float m71045e() {
        return this.currentShadowAngle;
    }

    /* renamed from: f */
    private float m71044f() {
        return this.endShadowAngle;
    }

    /* renamed from: k */
    private void m71039k(float f) {
        this.currentShadowAngle = f;
    }

    /* renamed from: l */
    private void m71038l(float f) {
        this.endShadowAngle = f;
    }

    /* renamed from: m */
    private void m71037m(float f) {
        this.endX = f;
    }

    /* renamed from: n */
    private void m71036n(float f) {
        this.endY = f;
    }

    /* renamed from: o */
    private void m71035o(float f) {
        this.startX = f;
    }

    /* renamed from: p */
    private void m71034p(float f) {
        this.startY = f;
    }

    public void addArc(float f, float f2, float f3, float f4, float f5, float f6) {
        boolean z;
        float f7;
        PathArcOperation pathArcOperation = new PathArcOperation(f, f2, f3, f4);
        pathArcOperation.m71012r(f5);
        pathArcOperation.m71011s(f6);
        this.f38231a.add(pathArcOperation);
        ArcShadowOperation arcShadowOperation = new ArcShadowOperation(pathArcOperation);
        float f8 = f5 + f6;
        if (f6 < 0.0f) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            f5 = (f5 + 180.0f) % 360.0f;
        }
        if (z) {
            f7 = (180.0f + f8) % 360.0f;
        } else {
            f7 = f8;
        }
        m71048b(arcShadowOperation, f5, f7);
        double d = f8;
        m71037m(((f + f3) * 0.5f) + (((f3 - f) / 2.0f) * ((float) Math.cos(Math.toRadians(d)))));
        m71036n(((f2 + f4) * 0.5f) + (((f4 - f2) / 2.0f) * ((float) Math.sin(Math.toRadians(d)))));
    }

    public void applyToPath(Matrix matrix, Path path) {
        int size = this.f38231a.size();
        for (int i = 0; i < size; i++) {
            this.f38231a.get(i).applyToPath(matrix, path);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public boolean m71047c() {
        return this.f38233c;
    }

    @RequiresApi(21)
    public void cubicToPoint(float f, float f2, float f3, float f4, float f5, float f6) {
        this.f38231a.add(new PathCubicOperation(f, f2, f3, f4, f5, f6));
        this.f38233c = true;
        m71037m(f5);
        m71036n(f6);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @NonNull
    /* renamed from: d */
    public ShadowCompatOperation m71046d(Matrix matrix) {
        m71049a(m71044f());
        final Matrix matrix2 = new Matrix(matrix);
        final ArrayList arrayList = new ArrayList(this.f38232b);
        return new ShadowCompatOperation() { // from class: com.google.android.material.shape.ShapePath.1
            @Override // com.google.android.material.shape.ShapePath.ShadowCompatOperation
            public void draw(Matrix matrix3, ShadowRenderer shadowRenderer, int i, Canvas canvas) {
                for (ShadowCompatOperation shadowCompatOperation : arrayList) {
                    shadowCompatOperation.draw(matrix2, shadowRenderer, i, canvas);
                }
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public float m71043g() {
        return this.endX;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public float m71042h() {
        return this.endY;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public float m71041i() {
        return this.startX;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public float m71040j() {
        return this.startY;
    }

    public void lineTo(float f, float f2) {
        PathLineOperation pathLineOperation = new PathLineOperation();
        pathLineOperation.f38252b = f;
        pathLineOperation.f38253c = f2;
        this.f38231a.add(pathLineOperation);
        LineShadowOperation lineShadowOperation = new LineShadowOperation(pathLineOperation, m71043g(), m71042h());
        m71048b(lineShadowOperation, lineShadowOperation.m71030a() + 270.0f, lineShadowOperation.m71030a() + 270.0f);
        m71037m(f);
        m71036n(f2);
    }

    @RequiresApi(21)
    public void quadToPoint(float f, float f2, float f3, float f4) {
        PathQuadOperation pathQuadOperation = new PathQuadOperation();
        pathQuadOperation.m70991i(f);
        pathQuadOperation.m70990j(f2);
        pathQuadOperation.m70989k(f3);
        pathQuadOperation.m70988l(f4);
        this.f38231a.add(pathQuadOperation);
        this.f38233c = true;
        m71037m(f3);
        m71036n(f4);
    }

    public void reset(float f, float f2) {
        reset(f, f2, 270.0f, 0.0f);
    }

    public void reset(float f, float f2, float f3, float f4) {
        m71035o(f);
        m71034p(f2);
        m71037m(f);
        m71036n(f2);
        m71039k(f3);
        m71038l((f3 + f4) % 360.0f);
        this.f38231a.clear();
        this.f38232b.clear();
        this.f38233c = false;
    }

    public ShapePath(float f, float f2) {
        reset(f, f2);
    }

    public void lineTo(float f, float f2, float f3, float f4) {
        if ((Math.abs(f - m71043g()) < 0.001f && Math.abs(f2 - m71042h()) < 0.001f) || (Math.abs(f - f3) < 0.001f && Math.abs(f2 - f4) < 0.001f)) {
            lineTo(f3, f4);
            return;
        }
        PathLineOperation pathLineOperation = new PathLineOperation();
        pathLineOperation.f38252b = f;
        pathLineOperation.f38253c = f2;
        this.f38231a.add(pathLineOperation);
        PathLineOperation pathLineOperation2 = new PathLineOperation();
        pathLineOperation2.f38252b = f3;
        pathLineOperation2.f38253c = f4;
        this.f38231a.add(pathLineOperation2);
        InnerCornerShadowOperation innerCornerShadowOperation = new InnerCornerShadowOperation(pathLineOperation, pathLineOperation2, m71043g(), m71042h());
        if (innerCornerShadowOperation.m71031c() > 0.0f) {
            lineTo(f, f2);
            lineTo(f3, f4);
            return;
        }
        m71048b(innerCornerShadowOperation, innerCornerShadowOperation.m71032b() + 270.0f, innerCornerShadowOperation.m71033a() + 270.0f);
        m71037m(f3);
        m71036n(f4);
    }
}
