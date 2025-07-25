package com.google.zxing.common.detector;

import com.google.zxing.NotFoundException;
import com.google.zxing.ResultPoint;
import com.google.zxing.common.BitMatrix;

/* loaded from: classes5.dex */
public final class WhiteRectangleDetector {

    /* renamed from: a */
    private final BitMatrix f44381a;

    /* renamed from: b */
    private final int f44382b;

    /* renamed from: c */
    private final int f44383c;

    /* renamed from: d */
    private final int f44384d;

    /* renamed from: e */
    private final int f44385e;

    /* renamed from: f */
    private final int f44386f;

    /* renamed from: g */
    private final int f44387g;

    public WhiteRectangleDetector(BitMatrix bitMatrix) throws NotFoundException {
        this(bitMatrix, 10, bitMatrix.getWidth() / 2, bitMatrix.getHeight() / 2);
    }

    /* renamed from: a */
    private ResultPoint[] m66014a(ResultPoint resultPoint, ResultPoint resultPoint2, ResultPoint resultPoint3, ResultPoint resultPoint4) {
        float x = resultPoint.getX();
        float y = resultPoint.getY();
        float x2 = resultPoint2.getX();
        float y2 = resultPoint2.getY();
        float x3 = resultPoint3.getX();
        float y3 = resultPoint3.getY();
        float x4 = resultPoint4.getX();
        float y4 = resultPoint4.getY();
        return x < ((float) this.f44383c) / 2.0f ? new ResultPoint[]{new ResultPoint(x4 - 1.0f, y4 + 1.0f), new ResultPoint(x2 + 1.0f, y2 + 1.0f), new ResultPoint(x3 - 1.0f, y3 - 1.0f), new ResultPoint(x + 1.0f, y - 1.0f)} : new ResultPoint[]{new ResultPoint(x4 + 1.0f, y4 + 1.0f), new ResultPoint(x2 + 1.0f, y2 - 1.0f), new ResultPoint(x3 - 1.0f, y3 + 1.0f), new ResultPoint(x - 1.0f, y - 1.0f)};
    }

    /* renamed from: b */
    private boolean m66013b(int i, int i2, int i3, boolean z) {
        if (z) {
            while (i <= i2) {
                if (this.f44381a.get(i, i3)) {
                    return true;
                }
                i++;
            }
            return false;
        }
        while (i <= i2) {
            if (this.f44381a.get(i3, i)) {
                return true;
            }
            i++;
        }
        return false;
    }

    /* renamed from: c */
    private ResultPoint m66012c(float f, float f2, float f3, float f4) {
        int round = MathUtils.round(MathUtils.distance(f, f2, f3, f4));
        float f5 = round;
        float f6 = (f3 - f) / f5;
        float f7 = (f4 - f2) / f5;
        for (int i = 0; i < round; i++) {
            float f8 = i;
            int round2 = MathUtils.round((f8 * f6) + f);
            int round3 = MathUtils.round((f8 * f7) + f2);
            if (this.f44381a.get(round2, round3)) {
                return new ResultPoint(round2, round3);
            }
        }
        return null;
    }

    public ResultPoint[] detect() throws NotFoundException {
        int i = this.f44384d;
        int i2 = this.f44385e;
        int i3 = this.f44387g;
        int i4 = this.f44386f;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        boolean z6 = false;
        boolean z7 = true;
        while (z7) {
            boolean z8 = false;
            boolean z9 = true;
            while (true) {
                if ((z9 || !z2) && i2 < this.f44383c) {
                    z9 = m66013b(i3, i4, i2, false);
                    if (z9) {
                        i2++;
                        z2 = true;
                        z8 = true;
                    } else if (!z2) {
                        i2++;
                    }
                }
            }
            if (i2 < this.f44383c) {
                boolean z10 = true;
                while (true) {
                    if ((z10 || !z3) && i4 < this.f44382b) {
                        z10 = m66013b(i, i2, i4, true);
                        if (z10) {
                            i4++;
                            z3 = true;
                            z8 = true;
                        } else if (!z3) {
                            i4++;
                        }
                    }
                }
                if (i4 < this.f44382b) {
                    boolean z11 = true;
                    while (true) {
                        if ((z11 || !z4) && i >= 0) {
                            z11 = m66013b(i3, i4, i, false);
                            if (z11) {
                                i--;
                                z4 = true;
                                z8 = true;
                            } else if (!z4) {
                                i--;
                            }
                        }
                    }
                    if (i >= 0) {
                        z7 = z8;
                        boolean z12 = true;
                        while (true) {
                            if ((z12 || !z6) && i3 >= 0) {
                                z12 = m66013b(i, i2, i3, true);
                                if (z12) {
                                    i3--;
                                    z7 = true;
                                    z6 = true;
                                } else if (!z6) {
                                    i3--;
                                }
                            }
                        }
                        if (i3 >= 0) {
                            if (z7) {
                                z5 = true;
                            }
                        }
                    }
                }
            }
            z = true;
            break;
        }
        if (!z && z5) {
            int i5 = i2 - i;
            ResultPoint resultPoint = null;
            ResultPoint resultPoint2 = null;
            for (int i6 = 1; resultPoint2 == null && i6 < i5; i6++) {
                resultPoint2 = m66012c(i, i4 - i6, i + i6, i4);
            }
            if (resultPoint2 != null) {
                ResultPoint resultPoint3 = null;
                for (int i7 = 1; resultPoint3 == null && i7 < i5; i7++) {
                    resultPoint3 = m66012c(i, i3 + i7, i + i7, i3);
                }
                if (resultPoint3 != null) {
                    ResultPoint resultPoint4 = null;
                    for (int i8 = 1; resultPoint4 == null && i8 < i5; i8++) {
                        resultPoint4 = m66012c(i2, i3 + i8, i2 - i8, i3);
                    }
                    if (resultPoint4 != null) {
                        for (int i9 = 1; resultPoint == null && i9 < i5; i9++) {
                            resultPoint = m66012c(i2, i4 - i9, i2 - i9, i4);
                        }
                        if (resultPoint != null) {
                            return m66014a(resultPoint, resultPoint2, resultPoint4, resultPoint3);
                        }
                        throw NotFoundException.getNotFoundInstance();
                    }
                    throw NotFoundException.getNotFoundInstance();
                }
                throw NotFoundException.getNotFoundInstance();
            }
            throw NotFoundException.getNotFoundInstance();
        }
        throw NotFoundException.getNotFoundInstance();
    }

    public WhiteRectangleDetector(BitMatrix bitMatrix, int i, int i2, int i3) throws NotFoundException {
        this.f44381a = bitMatrix;
        int height = bitMatrix.getHeight();
        this.f44382b = height;
        int width = bitMatrix.getWidth();
        this.f44383c = width;
        int i4 = i / 2;
        int i5 = i2 - i4;
        this.f44384d = i5;
        int i6 = i2 + i4;
        this.f44385e = i6;
        int i7 = i3 - i4;
        this.f44387g = i7;
        int i8 = i3 + i4;
        this.f44386f = i8;
        if (i7 < 0 || i5 < 0 || i8 >= height || i6 >= width) {
            throw NotFoundException.getNotFoundInstance();
        }
    }
}
