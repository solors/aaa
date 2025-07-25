package com.google.zxing.datamatrix.detector;

import com.google.firebase.sessions.settings.RemoteSettings;
import com.google.zxing.NotFoundException;
import com.google.zxing.ResultPoint;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.common.DetectorResult;
import com.google.zxing.common.GridSampler;
import com.google.zxing.common.detector.MathUtils;
import com.google.zxing.common.detector.WhiteRectangleDetector;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes5.dex */
public final class Detector {

    /* renamed from: a */
    private final BitMatrix f44427a;

    /* renamed from: b */
    private final WhiteRectangleDetector f44428b;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes5.dex */
    public static final class ResultPointsAndTransitions {

        /* renamed from: a */
        private final ResultPoint f44429a;

        /* renamed from: b */
        private final ResultPoint f44430b;

        /* renamed from: c */
        private final int f44431c;

        /* renamed from: a */
        ResultPoint m65949a() {
            return this.f44429a;
        }

        /* renamed from: b */
        ResultPoint m65948b() {
            return this.f44430b;
        }

        /* renamed from: c */
        int m65947c() {
            return this.f44431c;
        }

        public String toString() {
            return this.f44429a + RemoteSettings.FORWARD_SLASH_STRING + this.f44430b + '/' + this.f44431c;
        }

        private ResultPointsAndTransitions(ResultPoint resultPoint, ResultPoint resultPoint2, int i) {
            this.f44429a = resultPoint;
            this.f44430b = resultPoint2;
            this.f44431c = i;
        }
    }

    /* loaded from: classes5.dex */
    private static final class ResultPointsAndTransitionsComparator implements Serializable, Comparator<ResultPointsAndTransitions> {
        private ResultPointsAndTransitionsComparator() {
        }

        @Override // java.util.Comparator
        public int compare(ResultPointsAndTransitions resultPointsAndTransitions, ResultPointsAndTransitions resultPointsAndTransitions2) {
            return resultPointsAndTransitions.m65947c() - resultPointsAndTransitions2.m65947c();
        }
    }

    public Detector(BitMatrix bitMatrix) throws NotFoundException {
        this.f44427a = bitMatrix;
        this.f44428b = new WhiteRectangleDetector(bitMatrix);
    }

    /* renamed from: a */
    private ResultPoint m65956a(ResultPoint resultPoint, ResultPoint resultPoint2, ResultPoint resultPoint3, ResultPoint resultPoint4, int i) {
        float f = i;
        float m65954c = m65954c(resultPoint, resultPoint2) / f;
        float m65954c2 = m65954c(resultPoint3, resultPoint4);
        ResultPoint resultPoint5 = new ResultPoint(resultPoint4.getX() + (((resultPoint4.getX() - resultPoint3.getX()) / m65954c2) * m65954c), resultPoint4.getY() + (m65954c * ((resultPoint4.getY() - resultPoint3.getY()) / m65954c2)));
        float m65954c3 = m65954c(resultPoint, resultPoint3) / f;
        float m65954c4 = m65954c(resultPoint2, resultPoint4);
        ResultPoint resultPoint6 = new ResultPoint(resultPoint4.getX() + (((resultPoint4.getX() - resultPoint2.getX()) / m65954c4) * m65954c3), resultPoint4.getY() + (m65954c3 * ((resultPoint4.getY() - resultPoint2.getY()) / m65954c4)));
        if (!m65952e(resultPoint5)) {
            if (m65952e(resultPoint6)) {
                return resultPoint6;
            }
            return null;
        } else if (!m65952e(resultPoint6)) {
            return resultPoint5;
        } else {
            if (Math.abs(m65950g(resultPoint3, resultPoint5).m65947c() - m65950g(resultPoint2, resultPoint5).m65947c()) <= Math.abs(m65950g(resultPoint3, resultPoint6).m65947c() - m65950g(resultPoint2, resultPoint6).m65947c())) {
                return resultPoint5;
            }
            return resultPoint6;
        }
    }

    /* renamed from: b */
    private ResultPoint m65955b(ResultPoint resultPoint, ResultPoint resultPoint2, ResultPoint resultPoint3, ResultPoint resultPoint4, int i, int i2) {
        float m65954c = m65954c(resultPoint, resultPoint2) / i;
        float m65954c2 = m65954c(resultPoint3, resultPoint4);
        ResultPoint resultPoint5 = new ResultPoint(resultPoint4.getX() + (((resultPoint4.getX() - resultPoint3.getX()) / m65954c2) * m65954c), resultPoint4.getY() + (m65954c * ((resultPoint4.getY() - resultPoint3.getY()) / m65954c2)));
        float m65954c3 = m65954c(resultPoint, resultPoint3) / i2;
        float m65954c4 = m65954c(resultPoint2, resultPoint4);
        ResultPoint resultPoint6 = new ResultPoint(resultPoint4.getX() + (((resultPoint4.getX() - resultPoint2.getX()) / m65954c4) * m65954c3), resultPoint4.getY() + (m65954c3 * ((resultPoint4.getY() - resultPoint2.getY()) / m65954c4)));
        if (!m65952e(resultPoint5)) {
            if (m65952e(resultPoint6)) {
                return resultPoint6;
            }
            return null;
        } else if (!m65952e(resultPoint6)) {
            return resultPoint5;
        } else {
            if (Math.abs(i - m65950g(resultPoint3, resultPoint5).m65947c()) + Math.abs(i2 - m65950g(resultPoint2, resultPoint5).m65947c()) <= Math.abs(i - m65950g(resultPoint3, resultPoint6).m65947c()) + Math.abs(i2 - m65950g(resultPoint2, resultPoint6).m65947c())) {
                return resultPoint5;
            }
            return resultPoint6;
        }
    }

    /* renamed from: c */
    private static int m65954c(ResultPoint resultPoint, ResultPoint resultPoint2) {
        return MathUtils.round(ResultPoint.distance(resultPoint, resultPoint2));
    }

    /* renamed from: d */
    private static void m65953d(Map<ResultPoint, Integer> map, ResultPoint resultPoint) {
        Integer num = map.get(resultPoint);
        int i = 1;
        if (num != null) {
            i = 1 + num.intValue();
        }
        map.put(resultPoint, Integer.valueOf(i));
    }

    /* renamed from: e */
    private boolean m65952e(ResultPoint resultPoint) {
        if (resultPoint.getX() >= 0.0f && resultPoint.getX() < this.f44427a.getWidth() && resultPoint.getY() > 0.0f && resultPoint.getY() < this.f44427a.getHeight()) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    private static BitMatrix m65951f(BitMatrix bitMatrix, ResultPoint resultPoint, ResultPoint resultPoint2, ResultPoint resultPoint3, ResultPoint resultPoint4, int i, int i2) throws NotFoundException {
        float f = i - 0.5f;
        float f2 = i2 - 0.5f;
        return GridSampler.getInstance().sampleGrid(bitMatrix, i, i2, 0.5f, 0.5f, f, 0.5f, f, f2, 0.5f, f2, resultPoint.getX(), resultPoint.getY(), resultPoint4.getX(), resultPoint4.getY(), resultPoint3.getX(), resultPoint3.getY(), resultPoint2.getX(), resultPoint2.getY());
    }

    /* renamed from: g */
    private ResultPointsAndTransitions m65950g(ResultPoint resultPoint, ResultPoint resultPoint2) {
        boolean z;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int x = (int) resultPoint.getX();
        int y = (int) resultPoint.getY();
        int x2 = (int) resultPoint2.getX();
        int y2 = (int) resultPoint2.getY();
        int i6 = 0;
        int i7 = 1;
        if (Math.abs(y2 - y) > Math.abs(x2 - x)) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            y = x;
            x = y;
            y2 = x2;
            x2 = y2;
        }
        int abs = Math.abs(x2 - x);
        int abs2 = Math.abs(y2 - y);
        int i8 = (-abs) / 2;
        if (y < y2) {
            i = 1;
        } else {
            i = -1;
        }
        if (x >= x2) {
            i7 = -1;
        }
        BitMatrix bitMatrix = this.f44427a;
        if (z) {
            i2 = y;
        } else {
            i2 = x;
        }
        if (z) {
            i3 = x;
        } else {
            i3 = y;
        }
        boolean z2 = bitMatrix.get(i2, i3);
        while (x != x2) {
            BitMatrix bitMatrix2 = this.f44427a;
            if (z) {
                i4 = y;
            } else {
                i4 = x;
            }
            if (z) {
                i5 = x;
            } else {
                i5 = y;
            }
            boolean z3 = bitMatrix2.get(i4, i5);
            if (z3 != z2) {
                i6++;
                z2 = z3;
            }
            i8 += abs2;
            if (i8 > 0) {
                if (y == y2) {
                    break;
                }
                y += i;
                i8 -= abs;
            }
            x += i7;
        }
        return new ResultPointsAndTransitions(resultPoint, resultPoint2, i6);
    }

    public DetectorResult detect() throws NotFoundException {
        ResultPoint resultPoint;
        ResultPoint resultPoint2;
        BitMatrix m65951f;
        ResultPoint[] detect = this.f44428b.detect();
        ResultPoint resultPoint3 = detect[0];
        ResultPoint resultPoint4 = detect[1];
        ResultPoint resultPoint5 = detect[2];
        ResultPoint resultPoint6 = detect[3];
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(m65950g(resultPoint3, resultPoint4));
        arrayList.add(m65950g(resultPoint3, resultPoint5));
        arrayList.add(m65950g(resultPoint4, resultPoint6));
        arrayList.add(m65950g(resultPoint5, resultPoint6));
        ResultPoint resultPoint7 = null;
        Collections.sort(arrayList, new ResultPointsAndTransitionsComparator());
        ResultPointsAndTransitions resultPointsAndTransitions = (ResultPointsAndTransitions) arrayList.get(0);
        ResultPointsAndTransitions resultPointsAndTransitions2 = (ResultPointsAndTransitions) arrayList.get(1);
        HashMap hashMap = new HashMap();
        m65953d(hashMap, resultPointsAndTransitions.m65949a());
        m65953d(hashMap, resultPointsAndTransitions.m65948b());
        m65953d(hashMap, resultPointsAndTransitions2.m65949a());
        m65953d(hashMap, resultPointsAndTransitions2.m65948b());
        ResultPoint resultPoint8 = null;
        ResultPoint resultPoint9 = null;
        for (Map.Entry entry : hashMap.entrySet()) {
            ResultPoint resultPoint10 = (ResultPoint) entry.getKey();
            if (((Integer) entry.getValue()).intValue() == 2) {
                resultPoint8 = resultPoint10;
            } else if (resultPoint7 == null) {
                resultPoint7 = resultPoint10;
            } else {
                resultPoint9 = resultPoint10;
            }
        }
        if (resultPoint7 != null && resultPoint8 != null && resultPoint9 != null) {
            ResultPoint[] resultPointArr = {resultPoint7, resultPoint8, resultPoint9};
            ResultPoint.orderBestPatterns(resultPointArr);
            ResultPoint resultPoint11 = resultPointArr[0];
            ResultPoint resultPoint12 = resultPointArr[1];
            ResultPoint resultPoint13 = resultPointArr[2];
            if (!hashMap.containsKey(resultPoint3)) {
                resultPoint = resultPoint3;
            } else if (!hashMap.containsKey(resultPoint4)) {
                resultPoint = resultPoint4;
            } else if (!hashMap.containsKey(resultPoint5)) {
                resultPoint = resultPoint5;
            } else {
                resultPoint = resultPoint6;
            }
            int m65947c = m65950g(resultPoint13, resultPoint).m65947c();
            int m65947c2 = m65950g(resultPoint11, resultPoint).m65947c();
            if ((m65947c & 1) == 1) {
                m65947c++;
            }
            int i = m65947c + 2;
            if ((m65947c2 & 1) == 1) {
                m65947c2++;
            }
            int i2 = m65947c2 + 2;
            if (i * 4 < i2 * 7 && i2 * 4 < i * 7) {
                ResultPoint m65956a = m65956a(resultPoint12, resultPoint11, resultPoint13, resultPoint, Math.min(i2, i));
                if (m65956a != null) {
                    resultPoint = m65956a;
                }
                int max = Math.max(m65950g(resultPoint13, resultPoint).m65947c(), m65950g(resultPoint11, resultPoint).m65947c()) + 1;
                if ((max & 1) == 1) {
                    max++;
                }
                int i3 = max;
                m65951f = m65951f(this.f44427a, resultPoint13, resultPoint12, resultPoint11, resultPoint, i3, i3);
                resultPoint2 = resultPoint13;
            } else {
                resultPoint2 = resultPoint13;
                ResultPoint m65955b = m65955b(resultPoint12, resultPoint11, resultPoint13, resultPoint, i, i2);
                if (m65955b != null) {
                    resultPoint = m65955b;
                }
                int m65947c3 = m65950g(resultPoint2, resultPoint).m65947c();
                int m65947c4 = m65950g(resultPoint11, resultPoint).m65947c();
                if ((m65947c3 & 1) == 1) {
                    m65947c3++;
                }
                int i4 = m65947c3;
                if ((m65947c4 & 1) == 1) {
                    m65947c4++;
                }
                m65951f = m65951f(this.f44427a, resultPoint2, resultPoint12, resultPoint11, resultPoint, i4, m65947c4);
            }
            return new DetectorResult(m65951f, new ResultPoint[]{resultPoint2, resultPoint12, resultPoint11, resultPoint});
        }
        throw NotFoundException.getNotFoundInstance();
    }
}
