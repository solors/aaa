package com.google.zxing.qrcode.detector;

import com.google.zxing.DecodeHintType;
import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;
import com.google.zxing.ResultPoint;
import com.google.zxing.ResultPointCallback;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.common.DetectorResult;
import com.google.zxing.common.GridSampler;
import com.google.zxing.common.PerspectiveTransform;
import com.google.zxing.common.detector.MathUtils;
import com.google.zxing.qrcode.decoder.Version;
import java.util.Map;

/* loaded from: classes5.dex */
public class Detector {

    /* renamed from: a */
    private final BitMatrix f44725a;

    /* renamed from: b */
    private ResultPointCallback f44726b;

    public Detector(BitMatrix bitMatrix) {
        this.f44725a = bitMatrix;
    }

    /* renamed from: b */
    private float m65534b(ResultPoint resultPoint, ResultPoint resultPoint2) {
        float m65526j = m65526j((int) resultPoint.getX(), (int) resultPoint.getY(), (int) resultPoint2.getX(), (int) resultPoint2.getY());
        float m65526j2 = m65526j((int) resultPoint2.getX(), (int) resultPoint2.getY(), (int) resultPoint.getX(), (int) resultPoint.getY());
        if (Float.isNaN(m65526j)) {
            return m65526j2 / 7.0f;
        }
        if (Float.isNaN(m65526j2)) {
            return m65526j / 7.0f;
        }
        return (m65526j + m65526j2) / 14.0f;
    }

    /* renamed from: c */
    private static int m65533c(ResultPoint resultPoint, ResultPoint resultPoint2, ResultPoint resultPoint3, float f) throws NotFoundException {
        int round = ((MathUtils.round(ResultPoint.distance(resultPoint, resultPoint2) / f) + MathUtils.round(ResultPoint.distance(resultPoint, resultPoint3) / f)) / 2) + 7;
        int i = round & 3;
        if (i != 0) {
            if (i != 2) {
                if (i == 3) {
                    throw NotFoundException.getNotFoundInstance();
                }
                return round;
            }
            return round - 1;
        }
        return round + 1;
    }

    /* renamed from: d */
    private static PerspectiveTransform m65532d(ResultPoint resultPoint, ResultPoint resultPoint2, ResultPoint resultPoint3, ResultPoint resultPoint4, int i) {
        float x;
        float y;
        float f;
        float f2 = i - 3.5f;
        if (resultPoint4 != null) {
            x = resultPoint4.getX();
            y = resultPoint4.getY();
            f = f2 - 3.0f;
        } else {
            x = (resultPoint2.getX() - resultPoint.getX()) + resultPoint3.getX();
            y = (resultPoint2.getY() - resultPoint.getY()) + resultPoint3.getY();
            f = f2;
        }
        return PerspectiveTransform.quadrilateralToQuadrilateral(3.5f, 3.5f, f2, 3.5f, f, f, 3.5f, f2, resultPoint.getX(), resultPoint.getY(), resultPoint2.getX(), resultPoint2.getY(), x, y, resultPoint3.getX(), resultPoint3.getY());
    }

    /* renamed from: h */
    private static BitMatrix m65528h(BitMatrix bitMatrix, PerspectiveTransform perspectiveTransform, int i) throws NotFoundException {
        return GridSampler.getInstance().sampleGrid(bitMatrix, i, i, perspectiveTransform);
    }

    /* renamed from: i */
    private float m65527i(int i, int i2, int i3, int i4) {
        boolean z;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        Detector detector;
        boolean z2;
        boolean z3;
        boolean z4 = true;
        if (Math.abs(i4 - i2) > Math.abs(i3 - i)) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            i6 = i;
            i5 = i2;
            i8 = i3;
            i7 = i4;
        } else {
            i5 = i;
            i6 = i2;
            i7 = i3;
            i8 = i4;
        }
        int abs = Math.abs(i7 - i5);
        int abs2 = Math.abs(i8 - i6);
        int i14 = 2;
        int i15 = (-abs) / 2;
        int i16 = -1;
        if (i5 < i7) {
            i9 = 1;
        } else {
            i9 = -1;
        }
        if (i6 < i8) {
            i16 = 1;
        }
        int i17 = i7 + i9;
        int i18 = i5;
        int i19 = i6;
        int i20 = 0;
        while (true) {
            if (i18 != i17) {
                if (z) {
                    i12 = i19;
                } else {
                    i12 = i18;
                }
                if (z) {
                    i13 = i18;
                } else {
                    i13 = i19;
                }
                if (i20 == z4) {
                    z2 = z;
                    z3 = z4;
                    i10 = i17;
                    detector = this;
                } else {
                    detector = this;
                    z2 = z;
                    i10 = i17;
                    z3 = false;
                }
                if (z3 == detector.f44725a.get(i12, i13)) {
                    if (i20 == 2) {
                        return MathUtils.distance(i18, i19, i5, i6);
                    }
                    i20++;
                }
                i15 += abs2;
                if (i15 > 0) {
                    if (i19 != i8) {
                        i19 += i16;
                        i15 -= abs;
                    } else {
                        i11 = 2;
                        break;
                    }
                }
                i18 += i9;
                i17 = i10;
                z = z2;
                z4 = true;
                i14 = 2;
            } else {
                i10 = i17;
                i11 = i14;
                break;
            }
        }
        if (i20 == i11) {
            return MathUtils.distance(i10, i8, i5, i6);
        }
        return Float.NaN;
    }

    /* renamed from: j */
    private float m65526j(int i, int i2, int i3, int i4) {
        float f;
        float f2;
        float m65527i = m65527i(i, i2, i3, i4);
        int i5 = i - (i3 - i);
        int i6 = 0;
        if (i5 < 0) {
            f = i / (i - i5);
            i5 = 0;
        } else if (i5 >= this.f44725a.getWidth()) {
            f = ((this.f44725a.getWidth() - 1) - i) / (i5 - i);
            i5 = this.f44725a.getWidth() - 1;
        } else {
            f = 1.0f;
        }
        float f3 = i2;
        int i7 = (int) (f3 - ((i4 - i2) * f));
        if (i7 < 0) {
            f2 = f3 / (i2 - i7);
        } else if (i7 >= this.f44725a.getHeight()) {
            f2 = ((this.f44725a.getHeight() - 1) - i2) / (i7 - i2);
            i6 = this.f44725a.getHeight() - 1;
        } else {
            i6 = i7;
            f2 = 1.0f;
        }
        return (m65527i + m65527i(i, i2, (int) (i + ((i5 - i) * f2)), i6)) - 1.0f;
    }

    /* renamed from: a */
    protected final float m65535a(ResultPoint resultPoint, ResultPoint resultPoint2, ResultPoint resultPoint3) {
        return (m65534b(resultPoint, resultPoint2) + m65534b(resultPoint, resultPoint3)) / 2.0f;
    }

    public DetectorResult detect() throws NotFoundException, FormatException {
        return detect(null);
    }

    /* renamed from: e */
    protected final AlignmentPattern m65531e(float f, int i, int i2, float f2) throws NotFoundException {
        int i3 = (int) (f2 * f);
        int max = Math.max(0, i - i3);
        int min = Math.min(this.f44725a.getWidth() - 1, i + i3) - max;
        float f3 = 3.0f * f;
        if (min >= f3) {
            int max2 = Math.max(0, i2 - i3);
            int min2 = Math.min(this.f44725a.getHeight() - 1, i2 + i3) - max2;
            if (min2 >= f3) {
                return new AlignmentPatternFinder(this.f44725a, max, max2, min, min2, f, this.f44726b).m65538c();
            }
            throw NotFoundException.getNotFoundInstance();
        }
        throw NotFoundException.getNotFoundInstance();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: f */
    public final BitMatrix m65530f() {
        return this.f44725a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: g */
    public final DetectorResult m65529g(FinderPatternInfo finderPatternInfo) throws NotFoundException, FormatException {
        AlignmentPattern alignmentPattern;
        FinderPattern topLeft = finderPatternInfo.getTopLeft();
        FinderPattern topRight = finderPatternInfo.getTopRight();
        FinderPattern bottomLeft = finderPatternInfo.getBottomLeft();
        float m65535a = m65535a(topLeft, topRight, bottomLeft);
        if (m65535a >= 1.0f) {
            int m65533c = m65533c(topLeft, topRight, bottomLeft, m65535a);
            Version provisionalVersionForDimension = Version.getProvisionalVersionForDimension(m65533c);
            int dimensionForVersion = provisionalVersionForDimension.getDimensionForVersion() - 7;
            if (provisionalVersionForDimension.getAlignmentPatternCenters().length > 0) {
                float x = (topRight.getX() - topLeft.getX()) + bottomLeft.getX();
                float y = (topRight.getY() - topLeft.getY()) + bottomLeft.getY();
                float f = 1.0f - (3.0f / dimensionForVersion);
                int x2 = (int) (topLeft.getX() + ((x - topLeft.getX()) * f));
                int y2 = (int) (topLeft.getY() + (f * (y - topLeft.getY())));
                for (int i = 4; i <= 16; i <<= 1) {
                    try {
                        alignmentPattern = m65531e(m65535a, x2, y2, i);
                        break;
                    } catch (NotFoundException unused) {
                    }
                }
            }
            alignmentPattern = null;
            return new DetectorResult(m65528h(this.f44725a, m65532d(topLeft, topRight, bottomLeft, alignmentPattern, m65533c), m65533c), alignmentPattern == null ? new ResultPoint[]{bottomLeft, topLeft, topRight} : new ResultPoint[]{bottomLeft, topLeft, topRight, alignmentPattern});
        }
        throw NotFoundException.getNotFoundInstance();
    }

    public final DetectorResult detect(Map<DecodeHintType, ?> map) throws NotFoundException, FormatException {
        ResultPointCallback resultPointCallback = map == null ? null : (ResultPointCallback) map.get(DecodeHintType.NEED_RESULT_POINT_CALLBACK);
        this.f44726b = resultPointCallback;
        return m65529g(new FinderPatternFinder(this.f44725a, resultPointCallback).m65517f(map));
    }
}
