package com.google.zxing;

import com.google.zxing.common.detector.MathUtils;

/* loaded from: classes5.dex */
public class ResultPoint {

    /* renamed from: a */
    private final float f44184a;

    /* renamed from: b */
    private final float f44185b;

    public ResultPoint(float f, float f2) {
        this.f44184a = f;
        this.f44185b = f2;
    }

    /* renamed from: a */
    private static float m66135a(ResultPoint resultPoint, ResultPoint resultPoint2, ResultPoint resultPoint3) {
        float f = resultPoint2.f44184a;
        float f2 = resultPoint2.f44185b;
        return ((resultPoint3.f44184a - f) * (resultPoint.f44185b - f2)) - ((resultPoint3.f44185b - f2) * (resultPoint.f44184a - f));
    }

    public static float distance(ResultPoint resultPoint, ResultPoint resultPoint2) {
        return MathUtils.distance(resultPoint.f44184a, resultPoint.f44185b, resultPoint2.f44184a, resultPoint2.f44185b);
    }

    public static void orderBestPatterns(ResultPoint[] resultPointArr) {
        ResultPoint resultPoint;
        ResultPoint resultPoint2;
        ResultPoint resultPoint3;
        float distance = distance(resultPointArr[0], resultPointArr[1]);
        float distance2 = distance(resultPointArr[1], resultPointArr[2]);
        float distance3 = distance(resultPointArr[0], resultPointArr[2]);
        if (distance2 >= distance && distance2 >= distance3) {
            resultPoint = resultPointArr[0];
            resultPoint2 = resultPointArr[1];
            resultPoint3 = resultPointArr[2];
        } else if (distance3 >= distance2 && distance3 >= distance) {
            resultPoint = resultPointArr[1];
            resultPoint2 = resultPointArr[0];
            resultPoint3 = resultPointArr[2];
        } else {
            resultPoint = resultPointArr[2];
            resultPoint2 = resultPointArr[0];
            resultPoint3 = resultPointArr[1];
        }
        if (m66135a(resultPoint2, resultPoint, resultPoint3) < 0.0f) {
            ResultPoint resultPoint4 = resultPoint3;
            resultPoint3 = resultPoint2;
            resultPoint2 = resultPoint4;
        }
        resultPointArr[0] = resultPoint2;
        resultPointArr[1] = resultPoint;
        resultPointArr[2] = resultPoint3;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ResultPoint) {
            ResultPoint resultPoint = (ResultPoint) obj;
            if (this.f44184a == resultPoint.f44184a && this.f44185b == resultPoint.f44185b) {
                return true;
            }
        }
        return false;
    }

    public final float getX() {
        return this.f44184a;
    }

    public final float getY() {
        return this.f44185b;
    }

    public final int hashCode() {
        return (Float.floatToIntBits(this.f44184a) * 31) + Float.floatToIntBits(this.f44185b);
    }

    public final String toString() {
        return "(" + this.f44184a + ',' + this.f44185b + ')';
    }
}
