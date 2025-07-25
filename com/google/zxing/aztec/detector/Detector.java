package com.google.zxing.aztec.detector;

import com.google.zxing.NotFoundException;
import com.google.zxing.ResultPoint;
import com.google.zxing.aztec.AztecDetectorResult;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.common.GridSampler;
import com.google.zxing.common.detector.MathUtils;
import com.google.zxing.common.detector.WhiteRectangleDetector;
import com.google.zxing.common.reedsolomon.GenericGF;
import com.google.zxing.common.reedsolomon.ReedSolomonDecoder;
import com.google.zxing.common.reedsolomon.ReedSolomonException;

/* loaded from: classes5.dex */
public final class Detector {

    /* renamed from: g */
    private static final int[] f44197g = {3808, 476, 2107, 1799};

    /* renamed from: a */
    private final BitMatrix f44198a;

    /* renamed from: b */
    private boolean f44199b;

    /* renamed from: c */
    private int f44200c;

    /* renamed from: d */
    private int f44201d;

    /* renamed from: e */
    private int f44202e;

    /* renamed from: f */
    private int f44203f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class Point {

        /* renamed from: a */
        private final int f44204a;

        /* renamed from: b */
        private final int f44205b;

        Point(int i, int i2) {
            this.f44204a = i;
            this.f44205b = i2;
        }

        /* renamed from: a */
        int m66106a() {
            return this.f44204a;
        }

        /* renamed from: b */
        int m66105b() {
            return this.f44205b;
        }

        /* renamed from: c */
        ResultPoint m66104c() {
            return new ResultPoint(m66106a(), m66105b());
        }

        public String toString() {
            return "<" + this.f44204a + ' ' + this.f44205b + '>';
        }
    }

    public Detector(BitMatrix bitMatrix) {
        this.f44198a = bitMatrix;
    }

    /* renamed from: a */
    private static float m66123a(ResultPoint resultPoint, ResultPoint resultPoint2) {
        return MathUtils.distance(resultPoint.getX(), resultPoint.getY(), resultPoint2.getX(), resultPoint2.getY());
    }

    /* renamed from: b */
    private static float m66122b(Point point, Point point2) {
        return MathUtils.distance(point.m66106a(), point.m66105b(), point2.m66106a(), point2.m66105b());
    }

    /* renamed from: c */
    private static ResultPoint[] m66121c(ResultPoint[] resultPointArr, int i, int i2) {
        float f = i2 / (i * 2.0f);
        float x = resultPointArr[0].getX() - resultPointArr[2].getX();
        float y = resultPointArr[0].getY() - resultPointArr[2].getY();
        float x2 = (resultPointArr[0].getX() + resultPointArr[2].getX()) / 2.0f;
        float y2 = (resultPointArr[0].getY() + resultPointArr[2].getY()) / 2.0f;
        float f2 = x * f;
        float f3 = y * f;
        ResultPoint resultPoint = new ResultPoint(x2 + f2, y2 + f3);
        ResultPoint resultPoint2 = new ResultPoint(x2 - f2, y2 - f3);
        float x3 = resultPointArr[1].getX() - resultPointArr[3].getX();
        float y3 = resultPointArr[1].getY() - resultPointArr[3].getY();
        float x4 = (resultPointArr[1].getX() + resultPointArr[3].getX()) / 2.0f;
        float y4 = (resultPointArr[1].getY() + resultPointArr[3].getY()) / 2.0f;
        float f4 = x3 * f;
        float f5 = f * y3;
        return new ResultPoint[]{resultPoint, new ResultPoint(x4 + f4, y4 + f5), resultPoint2, new ResultPoint(x4 - f4, y4 - f5)};
    }

    /* renamed from: d */
    private void m66120d(ResultPoint[] resultPointArr) throws NotFoundException {
        long j;
        long j2;
        if (m66110n(resultPointArr[0]) && m66110n(resultPointArr[1]) && m66110n(resultPointArr[2]) && m66110n(resultPointArr[3])) {
            int i = this.f44202e * 2;
            int[] iArr = {m66107q(resultPointArr[0], resultPointArr[1], i), m66107q(resultPointArr[1], resultPointArr[2], i), m66107q(resultPointArr[2], resultPointArr[3], i), m66107q(resultPointArr[3], resultPointArr[0], i)};
            this.f44203f = m66112l(iArr, i);
            long j3 = 0;
            for (int i2 = 0; i2 < 4; i2++) {
                int i3 = iArr[(this.f44203f + i2) % 4];
                if (this.f44199b) {
                    j = j3 << 7;
                    j2 = (i3 >> 1) & 127;
                } else {
                    j = j3 << 10;
                    j2 = ((i3 >> 2) & 992) + ((i3 >> 1) & 31);
                }
                j3 = j + j2;
            }
            int m66117g = m66117g(j3, this.f44199b);
            if (this.f44199b) {
                this.f44200c = (m66117g >> 6) + 1;
                this.f44201d = (m66117g & 63) + 1;
                return;
            }
            this.f44200c = (m66117g >> 11) + 1;
            this.f44201d = (m66117g & 2047) + 1;
            return;
        }
        throw NotFoundException.getNotFoundInstance();
    }

    /* renamed from: e */
    private ResultPoint[] m66119e(Point point) throws NotFoundException {
        boolean z;
        this.f44202e = 1;
        Point point2 = point;
        Point point3 = point2;
        Point point4 = point3;
        boolean z2 = true;
        while (this.f44202e < 9) {
            Point m66115i = m66115i(point, z2, 1, -1);
            Point m66115i2 = m66115i(point2, z2, 1, 1);
            Point m66115i3 = m66115i(point3, z2, -1, 1);
            Point m66115i4 = m66115i(point4, z2, -1, -1);
            if (this.f44202e > 2) {
                double m66122b = (m66122b(m66115i4, m66115i) * this.f44202e) / (m66122b(point4, point) * (this.f44202e + 2));
                if (m66122b < 0.75d || m66122b > 1.25d || !m66109o(m66115i, m66115i2, m66115i3, m66115i4)) {
                    break;
                }
            }
            z2 = !z2;
            this.f44202e++;
            point4 = m66115i4;
            point = m66115i;
            point2 = m66115i2;
            point3 = m66115i3;
        }
        int i = this.f44202e;
        if (i != 5 && i != 7) {
            throw NotFoundException.getNotFoundInstance();
        }
        if (i == 5) {
            z = true;
        } else {
            z = false;
        }
        this.f44199b = z;
        ResultPoint[] resultPointArr = {new ResultPoint(point.m66106a() + 0.5f, point.m66105b() - 0.5f), new ResultPoint(point2.m66106a() + 0.5f, point2.m66105b() + 0.5f), new ResultPoint(point3.m66106a() - 0.5f, point3.m66105b() + 0.5f), new ResultPoint(point4.m66106a() - 0.5f, point4.m66105b() - 0.5f)};
        int i2 = this.f44202e;
        return m66121c(resultPointArr, (i2 * 2) - 3, i2 * 2);
    }

    /* renamed from: f */
    private int m66118f(Point point, Point point2) {
        float m66122b = m66122b(point, point2);
        float m66106a = (point2.m66106a() - point.m66106a()) / m66122b;
        float m66105b = (point2.m66105b() - point.m66105b()) / m66122b;
        float m66106a2 = point.m66106a();
        float m66105b2 = point.m66105b();
        boolean z = this.f44198a.get(point.m66106a(), point.m66105b());
        int ceil = (int) Math.ceil(m66122b);
        boolean z2 = false;
        int i = 0;
        for (int i2 = 0; i2 < ceil; i2++) {
            m66106a2 += m66106a;
            m66105b2 += m66105b;
            if (this.f44198a.get(MathUtils.round(m66106a2), MathUtils.round(m66105b2)) != z) {
                i++;
            }
        }
        float f = i / m66122b;
        if (f > 0.1f && f < 0.9f) {
            return 0;
        }
        if (f <= 0.1f) {
            z2 = true;
        }
        if (z2 == z) {
            return 1;
        }
        return -1;
    }

    /* renamed from: g */
    private static int m66117g(long j, boolean z) throws NotFoundException {
        int i;
        int i2;
        if (z) {
            i = 7;
            i2 = 2;
        } else {
            i = 10;
            i2 = 4;
        }
        int i3 = i - i2;
        int[] iArr = new int[i];
        for (int i4 = i - 1; i4 >= 0; i4--) {
            iArr[i4] = ((int) j) & 15;
            j >>= 4;
        }
        try {
            new ReedSolomonDecoder(GenericGF.AZTEC_PARAM).decode(iArr, i3);
            int i5 = 0;
            for (int i6 = 0; i6 < i2; i6++) {
                i5 = (i5 << 4) + iArr[i6];
            }
            return i5;
        } catch (ReedSolomonException unused) {
            throw NotFoundException.getNotFoundInstance();
        }
    }

    /* renamed from: h */
    private int m66116h() {
        if (this.f44199b) {
            return (this.f44200c * 4) + 11;
        }
        int i = this.f44200c;
        if (i <= 4) {
            return (i * 4) + 15;
        }
        return (i * 4) + ((((i - 4) / 8) + 1) * 2) + 15;
    }

    /* renamed from: i */
    private Point m66115i(Point point, boolean z, int i, int i2) {
        int m66106a = point.m66106a() + i;
        int m66105b = point.m66105b();
        while (true) {
            m66105b += i2;
            if (!m66111m(m66106a, m66105b) || this.f44198a.get(m66106a, m66105b) != z) {
                break;
            }
            m66106a += i;
        }
        int i3 = m66106a - i;
        int i4 = m66105b - i2;
        while (m66111m(i3, i4) && this.f44198a.get(i3, i4) == z) {
            i3 += i;
        }
        int i5 = i3 - i;
        while (m66111m(i5, i4) && this.f44198a.get(i5, i4) == z) {
            i4 += i2;
        }
        return new Point(i5, i4 - i2);
    }

    /* renamed from: j */
    private Point m66114j() {
        ResultPoint m66104c;
        ResultPoint resultPoint;
        ResultPoint resultPoint2;
        ResultPoint resultPoint3;
        ResultPoint m66104c2;
        ResultPoint m66104c3;
        ResultPoint m66104c4;
        ResultPoint m66104c5;
        try {
            ResultPoint[] detect = new WhiteRectangleDetector(this.f44198a).detect();
            resultPoint2 = detect[0];
            resultPoint3 = detect[1];
            resultPoint = detect[2];
            m66104c = detect[3];
        } catch (NotFoundException unused) {
            int width = this.f44198a.getWidth() / 2;
            int height = this.f44198a.getHeight() / 2;
            int i = width + 7;
            int i2 = height - 7;
            ResultPoint m66104c6 = m66115i(new Point(i, i2), false, 1, -1).m66104c();
            int i3 = height + 7;
            ResultPoint m66104c7 = m66115i(new Point(i, i3), false, 1, 1).m66104c();
            int i4 = width - 7;
            ResultPoint m66104c8 = m66115i(new Point(i4, i3), false, -1, 1).m66104c();
            m66104c = m66115i(new Point(i4, i2), false, -1, -1).m66104c();
            resultPoint = m66104c8;
            resultPoint2 = m66104c6;
            resultPoint3 = m66104c7;
        }
        int round = MathUtils.round((((resultPoint2.getX() + m66104c.getX()) + resultPoint3.getX()) + resultPoint.getX()) / 4.0f);
        int round2 = MathUtils.round((((resultPoint2.getY() + m66104c.getY()) + resultPoint3.getY()) + resultPoint.getY()) / 4.0f);
        try {
            ResultPoint[] detect2 = new WhiteRectangleDetector(this.f44198a, 15, round, round2).detect();
            m66104c2 = detect2[0];
            m66104c3 = detect2[1];
            m66104c4 = detect2[2];
            m66104c5 = detect2[3];
        } catch (NotFoundException unused2) {
            int i5 = round + 7;
            int i6 = round2 - 7;
            m66104c2 = m66115i(new Point(i5, i6), false, 1, -1).m66104c();
            int i7 = round2 + 7;
            m66104c3 = m66115i(new Point(i5, i7), false, 1, 1).m66104c();
            int i8 = round - 7;
            m66104c4 = m66115i(new Point(i8, i7), false, -1, 1).m66104c();
            m66104c5 = m66115i(new Point(i8, i6), false, -1, -1).m66104c();
        }
        return new Point(MathUtils.round((((m66104c2.getX() + m66104c5.getX()) + m66104c3.getX()) + m66104c4.getX()) / 4.0f), MathUtils.round((((m66104c2.getY() + m66104c5.getY()) + m66104c3.getY()) + m66104c4.getY()) / 4.0f));
    }

    /* renamed from: k */
    private ResultPoint[] m66113k(ResultPoint[] resultPointArr) {
        return m66121c(resultPointArr, this.f44202e * 2, m66116h());
    }

    /* renamed from: l */
    private static int m66112l(int[] iArr, int i) throws NotFoundException {
        int i2 = 0;
        for (int i3 : iArr) {
            i2 = (i2 << 3) + ((i3 >> (i - 2)) << 1) + (i3 & 1);
        }
        int i4 = ((i2 & 1) << 11) + (i2 >> 1);
        for (int i5 = 0; i5 < 4; i5++) {
            if (Integer.bitCount(f44197g[i5] ^ i4) <= 2) {
                return i5;
            }
        }
        throw NotFoundException.getNotFoundInstance();
    }

    /* renamed from: m */
    private boolean m66111m(int i, int i2) {
        if (i >= 0 && i < this.f44198a.getWidth() && i2 > 0 && i2 < this.f44198a.getHeight()) {
            return true;
        }
        return false;
    }

    /* renamed from: n */
    private boolean m66110n(ResultPoint resultPoint) {
        return m66111m(MathUtils.round(resultPoint.getX()), MathUtils.round(resultPoint.getY()));
    }

    /* renamed from: o */
    private boolean m66109o(Point point, Point point2, Point point3, Point point4) {
        Point point5 = new Point(point.m66106a() - 3, point.m66105b() + 3);
        Point point6 = new Point(point2.m66106a() - 3, point2.m66105b() - 3);
        Point point7 = new Point(point3.m66106a() + 3, point3.m66105b() - 3);
        Point point8 = new Point(point4.m66106a() + 3, point4.m66105b() + 3);
        int m66118f = m66118f(point8, point5);
        if (m66118f == 0 || m66118f(point5, point6) != m66118f || m66118f(point6, point7) != m66118f || m66118f(point7, point8) != m66118f) {
            return false;
        }
        return true;
    }

    /* renamed from: p */
    private BitMatrix m66108p(BitMatrix bitMatrix, ResultPoint resultPoint, ResultPoint resultPoint2, ResultPoint resultPoint3, ResultPoint resultPoint4) throws NotFoundException {
        GridSampler gridSampler = GridSampler.getInstance();
        int m66116h = m66116h();
        float f = m66116h / 2.0f;
        int i = this.f44202e;
        float f2 = f - i;
        float f3 = f + i;
        return gridSampler.sampleGrid(bitMatrix, m66116h, m66116h, f2, f2, f3, f2, f3, f3, f2, f3, resultPoint.getX(), resultPoint.getY(), resultPoint2.getX(), resultPoint2.getY(), resultPoint3.getX(), resultPoint3.getY(), resultPoint4.getX(), resultPoint4.getY());
    }

    /* renamed from: q */
    private int m66107q(ResultPoint resultPoint, ResultPoint resultPoint2, int i) {
        float m66123a = m66123a(resultPoint, resultPoint2);
        float f = m66123a / i;
        float x = resultPoint.getX();
        float y = resultPoint.getY();
        float x2 = ((resultPoint2.getX() - resultPoint.getX()) * f) / m66123a;
        float y2 = (f * (resultPoint2.getY() - resultPoint.getY())) / m66123a;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            float f2 = i3;
            if (this.f44198a.get(MathUtils.round((f2 * x2) + x), MathUtils.round((f2 * y2) + y))) {
                i2 |= 1 << ((i - i3) - 1);
            }
        }
        return i2;
    }

    public AztecDetectorResult detect() throws NotFoundException {
        return detect(false);
    }

    public AztecDetectorResult detect(boolean z) throws NotFoundException {
        ResultPoint[] m66119e = m66119e(m66114j());
        if (z) {
            ResultPoint resultPoint = m66119e[0];
            m66119e[0] = m66119e[2];
            m66119e[2] = resultPoint;
        }
        m66120d(m66119e);
        BitMatrix bitMatrix = this.f44198a;
        int i = this.f44203f;
        return new AztecDetectorResult(m66108p(bitMatrix, m66119e[i % 4], m66119e[(i + 1) % 4], m66119e[(i + 2) % 4], m66119e[(i + 3) % 4]), m66113k(m66119e), this.f44199b, this.f44201d, this.f44200c);
    }
}
