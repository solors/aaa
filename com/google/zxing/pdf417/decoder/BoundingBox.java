package com.google.zxing.pdf417.decoder;

import com.google.zxing.NotFoundException;
import com.google.zxing.ResultPoint;
import com.google.zxing.common.BitMatrix;

/* loaded from: classes5.dex */
final class BoundingBox {

    /* renamed from: a */
    private final BitMatrix f44610a;

    /* renamed from: b */
    private final ResultPoint f44611b;

    /* renamed from: c */
    private final ResultPoint f44612c;

    /* renamed from: d */
    private final ResultPoint f44613d;

    /* renamed from: e */
    private final ResultPoint f44614e;

    /* renamed from: f */
    private final int f44615f;

    /* renamed from: g */
    private final int f44616g;

    /* renamed from: h */
    private final int f44617h;

    /* renamed from: i */
    private final int f44618i;

    /* JADX INFO: Access modifiers changed from: package-private */
    public BoundingBox(BitMatrix bitMatrix, ResultPoint resultPoint, ResultPoint resultPoint2, ResultPoint resultPoint3, ResultPoint resultPoint4) throws NotFoundException {
        boolean z = false;
        boolean z2 = resultPoint == null || resultPoint2 == null;
        z = (resultPoint3 == null || resultPoint4 == null) ? true : z;
        if (z2 && z) {
            throw NotFoundException.getNotFoundInstance();
        }
        if (z2) {
            resultPoint = new ResultPoint(0.0f, resultPoint3.getY());
            resultPoint2 = new ResultPoint(0.0f, resultPoint4.getY());
        } else if (z) {
            resultPoint3 = new ResultPoint(bitMatrix.getWidth() - 1, resultPoint.getY());
            resultPoint4 = new ResultPoint(bitMatrix.getWidth() - 1, resultPoint2.getY());
        }
        this.f44610a = bitMatrix;
        this.f44611b = resultPoint;
        this.f44612c = resultPoint2;
        this.f44613d = resultPoint3;
        this.f44614e = resultPoint4;
        this.f44615f = (int) Math.min(resultPoint.getX(), resultPoint2.getX());
        this.f44616g = (int) Math.max(resultPoint3.getX(), resultPoint4.getX());
        this.f44617h = (int) Math.min(resultPoint.getY(), resultPoint3.getY());
        this.f44618i = (int) Math.max(resultPoint2.getY(), resultPoint4.getY());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public static BoundingBox m65706j(BoundingBox boundingBox, BoundingBox boundingBox2) throws NotFoundException {
        if (boundingBox == null) {
            return boundingBox2;
        }
        if (boundingBox2 == null) {
            return boundingBox;
        }
        return new BoundingBox(boundingBox.f44610a, boundingBox.f44611b, boundingBox.f44612c, boundingBox2.f44613d, boundingBox2.f44614e);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:17:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x005b  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.google.zxing.pdf417.decoder.BoundingBox m65715a(int r13, int r14, boolean r15) throws com.google.zxing.NotFoundException {
        /*
            r12 = this;
            com.google.zxing.ResultPoint r0 = r12.f44611b
            com.google.zxing.ResultPoint r1 = r12.f44612c
            com.google.zxing.ResultPoint r2 = r12.f44613d
            com.google.zxing.ResultPoint r3 = r12.f44614e
            if (r13 <= 0) goto L29
            if (r15 == 0) goto Le
            r4 = r0
            goto Lf
        Le:
            r4 = r2
        Lf:
            float r5 = r4.getY()
            int r5 = (int) r5
            int r5 = r5 - r13
            if (r5 >= 0) goto L18
            r5 = 0
        L18:
            com.google.zxing.ResultPoint r13 = new com.google.zxing.ResultPoint
            float r4 = r4.getX()
            float r5 = (float) r5
            r13.<init>(r4, r5)
            if (r15 == 0) goto L26
            r8 = r13
            goto L2a
        L26:
            r10 = r13
            r8 = r0
            goto L2b
        L29:
            r8 = r0
        L2a:
            r10 = r2
        L2b:
            if (r14 <= 0) goto L5b
            if (r15 == 0) goto L32
            com.google.zxing.ResultPoint r13 = r12.f44612c
            goto L34
        L32:
            com.google.zxing.ResultPoint r13 = r12.f44614e
        L34:
            float r0 = r13.getY()
            int r0 = (int) r0
            int r0 = r0 + r14
            com.google.zxing.common.BitMatrix r14 = r12.f44610a
            int r14 = r14.getHeight()
            if (r0 < r14) goto L4a
            com.google.zxing.common.BitMatrix r14 = r12.f44610a
            int r14 = r14.getHeight()
            int r0 = r14 + (-1)
        L4a:
            com.google.zxing.ResultPoint r14 = new com.google.zxing.ResultPoint
            float r13 = r13.getX()
            float r0 = (float) r0
            r14.<init>(r13, r0)
            if (r15 == 0) goto L58
            r9 = r14
            goto L5c
        L58:
            r11 = r14
            r9 = r1
            goto L5d
        L5b:
            r9 = r1
        L5c:
            r11 = r3
        L5d:
            com.google.zxing.pdf417.decoder.BoundingBox r13 = new com.google.zxing.pdf417.decoder.BoundingBox
            com.google.zxing.common.BitMatrix r7 = r12.f44610a
            r6 = r13
            r6.<init>(r7, r8, r9, r10, r11)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.zxing.pdf417.decoder.BoundingBox.m65715a(int, int, boolean):com.google.zxing.pdf417.decoder.BoundingBox");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public ResultPoint m65714b() {
        return this.f44612c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public ResultPoint m65713c() {
        return this.f44614e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public int m65712d() {
        return this.f44616g;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public int m65711e() {
        return this.f44618i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public int m65710f() {
        return this.f44615f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public int m65709g() {
        return this.f44617h;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public ResultPoint m65708h() {
        return this.f44611b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public ResultPoint m65707i() {
        return this.f44613d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public BoundingBox(BoundingBox boundingBox) {
        this.f44610a = boundingBox.f44610a;
        this.f44611b = boundingBox.m65708h();
        this.f44612c = boundingBox.m65714b();
        this.f44613d = boundingBox.m65707i();
        this.f44614e = boundingBox.m65713c();
        this.f44615f = boundingBox.m65710f();
        this.f44616g = boundingBox.m65712d();
        this.f44617h = boundingBox.m65709g();
        this.f44618i = boundingBox.m65711e();
    }
}
