package com.google.zxing.qrcode.detector;

import com.google.zxing.DecodeHintType;
import com.google.zxing.NotFoundException;
import com.google.zxing.ResultPoint;
import com.google.zxing.ResultPointCallback;
import com.google.zxing.common.BitMatrix;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;

/* loaded from: classes5.dex */
public class FinderPatternFinder {

    /* renamed from: a */
    private final BitMatrix f44729a;

    /* renamed from: b */
    private final List<FinderPattern> f44730b;

    /* renamed from: c */
    private boolean f44731c;

    /* renamed from: d */
    private final int[] f44732d;

    /* renamed from: e */
    private final ResultPointCallback f44733e;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes5.dex */
    public static final class CenterComparator implements Serializable, Comparator<FinderPattern> {

        /* renamed from: b */
        private final float f44734b;

        private CenterComparator(float f) {
            this.f44734b = f;
        }

        @Override // java.util.Comparator
        public int compare(FinderPattern finderPattern, FinderPattern finderPattern2) {
            int compare = Integer.compare(finderPattern2.m65523d(), finderPattern.m65523d());
            return compare == 0 ? Float.compare(Math.abs(finderPattern.getEstimatedModuleSize() - this.f44734b), Math.abs(finderPattern2.getEstimatedModuleSize() - this.f44734b)) : compare;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes5.dex */
    public static final class FurthestFromAverageComparator implements Serializable, Comparator<FinderPattern> {

        /* renamed from: b */
        private final float f44735b;

        private FurthestFromAverageComparator(float f) {
            this.f44735b = f;
        }

        @Override // java.util.Comparator
        public int compare(FinderPattern finderPattern, FinderPattern finderPattern2) {
            return Float.compare(Math.abs(finderPattern2.getEstimatedModuleSize() - this.f44735b), Math.abs(finderPattern.getEstimatedModuleSize() - this.f44735b));
        }
    }

    public FinderPatternFinder(BitMatrix bitMatrix) {
        this(bitMatrix, null);
    }

    /* renamed from: a */
    private static float m65522a(int[] iArr, int i) {
        return ((i - iArr[4]) - iArr[3]) - (iArr[2] / 2.0f);
    }

    /* renamed from: c */
    private boolean m65520c(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int[] m65513j = m65513j();
        int i6 = 0;
        while (i >= i6 && i2 >= i6 && this.f44729a.get(i2 - i6, i - i6)) {
            m65513j[2] = m65513j[2] + 1;
            i6++;
        }
        if (m65513j[2] == 0) {
            return false;
        }
        while (i >= i6 && i2 >= i6 && !this.f44729a.get(i2 - i6, i - i6)) {
            m65513j[1] = m65513j[1] + 1;
            i6++;
        }
        if (m65513j[1] == 0) {
            return false;
        }
        while (i >= i6 && i2 >= i6 && this.f44729a.get(i2 - i6, i - i6)) {
            m65513j[0] = m65513j[0] + 1;
            i6++;
        }
        if (m65513j[0] == 0) {
            return false;
        }
        int height = this.f44729a.getHeight();
        int width = this.f44729a.getWidth();
        int i7 = 1;
        while (true) {
            int i8 = i + i7;
            if (i8 >= height || (i5 = i2 + i7) >= width || !this.f44729a.get(i5, i8)) {
                break;
            }
            m65513j[2] = m65513j[2] + 1;
            i7++;
        }
        while (true) {
            int i9 = i + i7;
            if (i9 >= height || (i4 = i2 + i7) >= width || this.f44729a.get(i4, i9)) {
                break;
            }
            m65513j[3] = m65513j[3] + 1;
            i7++;
        }
        if (m65513j[3] == 0) {
            return false;
        }
        while (true) {
            int i10 = i + i7;
            if (i10 >= height || (i3 = i2 + i7) >= width || !this.f44729a.get(i3, i10)) {
                break;
            }
            m65513j[4] = m65513j[4] + 1;
            i7++;
        }
        if (m65513j[4] == 0) {
            return false;
        }
        return m65514i(m65513j);
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x0082, code lost:
        if (r2[3] < r13) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0086, code lost:
        if (r11 >= r1) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x008c, code lost:
        if (r0.get(r11, r12) == false) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x008e, code lost:
        r9 = r2[4];
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0090, code lost:
        if (r9 >= r13) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0092, code lost:
        r2[4] = r9 + 1;
        r11 = r11 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0099, code lost:
        r12 = r2[4];
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x009b, code lost:
        if (r12 < r13) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x009d, code lost:
        return Float.NaN;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00b1, code lost:
        if ((java.lang.Math.abs(((((r2[0] + r2[1]) + r2[2]) + r2[3]) + r12) - r14) * 5) < r14) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00b3, code lost:
        return Float.NaN;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00b8, code lost:
        if (m65515h(r2) == false) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00be, code lost:
        return m65522a(r2, r11);
     */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private float m65519d(int r11, int r12, int r13, int r14) {
        /*
            r10 = this;
            com.google.zxing.common.BitMatrix r0 = r10.f44729a
            int r1 = r0.getWidth()
            int[] r2 = r10.m65513j()
            r3 = r11
        Lb:
            r4 = 2
            r5 = 1
            if (r3 < 0) goto L1d
            boolean r6 = r0.get(r3, r12)
            if (r6 == 0) goto L1d
            r6 = r2[r4]
            int r6 = r6 + r5
            r2[r4] = r6
            int r3 = r3 + (-1)
            goto Lb
        L1d:
            r6 = 2143289344(0x7fc00000, float:NaN)
            if (r3 >= 0) goto L22
            return r6
        L22:
            if (r3 < 0) goto L35
            boolean r7 = r0.get(r3, r12)
            if (r7 != 0) goto L35
            r7 = r2[r5]
            if (r7 > r13) goto L35
            int r7 = r7 + 1
            r2[r5] = r7
            int r3 = r3 + (-1)
            goto L22
        L35:
            if (r3 < 0) goto Lbf
            r7 = r2[r5]
            if (r7 <= r13) goto L3d
            goto Lbf
        L3d:
            r7 = 0
            if (r3 < 0) goto L51
            boolean r8 = r0.get(r3, r12)
            if (r8 == 0) goto L51
            r8 = r2[r7]
            if (r8 > r13) goto L51
            int r8 = r8 + 1
            r2[r7] = r8
            int r3 = r3 + (-1)
            goto L3d
        L51:
            r3 = r2[r7]
            if (r3 <= r13) goto L56
            return r6
        L56:
            int r11 = r11 + r5
        L57:
            if (r11 >= r1) goto L67
            boolean r3 = r0.get(r11, r12)
            if (r3 == 0) goto L67
            r3 = r2[r4]
            int r3 = r3 + r5
            r2[r4] = r3
            int r11 = r11 + 1
            goto L57
        L67:
            if (r11 != r1) goto L6a
            return r6
        L6a:
            r3 = 3
            if (r11 >= r1) goto L7e
            boolean r8 = r0.get(r11, r12)
            if (r8 != 0) goto L7e
            r8 = r2[r3]
            if (r8 >= r13) goto L7e
            int r8 = r8 + 1
            r2[r3] = r8
            int r11 = r11 + 1
            goto L6a
        L7e:
            if (r11 == r1) goto Lbf
            r8 = r2[r3]
            if (r8 < r13) goto L85
            goto Lbf
        L85:
            r8 = 4
            if (r11 >= r1) goto L99
            boolean r9 = r0.get(r11, r12)
            if (r9 == 0) goto L99
            r9 = r2[r8]
            if (r9 >= r13) goto L99
            int r9 = r9 + 1
            r2[r8] = r9
            int r11 = r11 + 1
            goto L85
        L99:
            r12 = r2[r8]
            if (r12 < r13) goto L9e
            return r6
        L9e:
            r13 = r2[r7]
            r0 = r2[r5]
            int r13 = r13 + r0
            r0 = r2[r4]
            int r13 = r13 + r0
            r0 = r2[r3]
            int r13 = r13 + r0
            int r13 = r13 + r12
            int r13 = r13 - r14
            int r12 = java.lang.Math.abs(r13)
            int r12 = r12 * 5
            if (r12 < r14) goto Lb4
            return r6
        Lb4:
            boolean r12 = m65515h(r2)
            if (r12 == 0) goto Lbf
            float r11 = m65522a(r2, r11)
            return r11
        Lbf:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.zxing.qrcode.detector.FinderPatternFinder.m65519d(int, int, int, int):float");
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x0082, code lost:
        if (r2[3] < r13) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0086, code lost:
        if (r11 >= r1) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x008c, code lost:
        if (r0.get(r12, r11) == false) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x008e, code lost:
        r9 = r2[4];
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0090, code lost:
        if (r9 >= r13) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0092, code lost:
        r2[4] = r9 + 1;
        r11 = r11 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0099, code lost:
        r12 = r2[4];
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x009b, code lost:
        if (r12 < r13) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x009d, code lost:
        return Float.NaN;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00b2, code lost:
        if ((java.lang.Math.abs(((((r2[0] + r2[1]) + r2[2]) + r2[3]) + r12) - r14) * 5) < (r14 * 2)) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00b4, code lost:
        return Float.NaN;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00b9, code lost:
        if (m65515h(r2) == false) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00bf, code lost:
        return m65522a(r2, r11);
     */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private float m65518e(int r11, int r12, int r13, int r14) {
        /*
            r10 = this;
            com.google.zxing.common.BitMatrix r0 = r10.f44729a
            int r1 = r0.getHeight()
            int[] r2 = r10.m65513j()
            r3 = r11
        Lb:
            r4 = 2
            r5 = 1
            if (r3 < 0) goto L1d
            boolean r6 = r0.get(r12, r3)
            if (r6 == 0) goto L1d
            r6 = r2[r4]
            int r6 = r6 + r5
            r2[r4] = r6
            int r3 = r3 + (-1)
            goto Lb
        L1d:
            r6 = 2143289344(0x7fc00000, float:NaN)
            if (r3 >= 0) goto L22
            return r6
        L22:
            if (r3 < 0) goto L35
            boolean r7 = r0.get(r12, r3)
            if (r7 != 0) goto L35
            r7 = r2[r5]
            if (r7 > r13) goto L35
            int r7 = r7 + 1
            r2[r5] = r7
            int r3 = r3 + (-1)
            goto L22
        L35:
            if (r3 < 0) goto Lc0
            r7 = r2[r5]
            if (r7 <= r13) goto L3d
            goto Lc0
        L3d:
            r7 = 0
            if (r3 < 0) goto L51
            boolean r8 = r0.get(r12, r3)
            if (r8 == 0) goto L51
            r8 = r2[r7]
            if (r8 > r13) goto L51
            int r8 = r8 + 1
            r2[r7] = r8
            int r3 = r3 + (-1)
            goto L3d
        L51:
            r3 = r2[r7]
            if (r3 <= r13) goto L56
            return r6
        L56:
            int r11 = r11 + r5
        L57:
            if (r11 >= r1) goto L67
            boolean r3 = r0.get(r12, r11)
            if (r3 == 0) goto L67
            r3 = r2[r4]
            int r3 = r3 + r5
            r2[r4] = r3
            int r11 = r11 + 1
            goto L57
        L67:
            if (r11 != r1) goto L6a
            return r6
        L6a:
            r3 = 3
            if (r11 >= r1) goto L7e
            boolean r8 = r0.get(r12, r11)
            if (r8 != 0) goto L7e
            r8 = r2[r3]
            if (r8 >= r13) goto L7e
            int r8 = r8 + 1
            r2[r3] = r8
            int r11 = r11 + 1
            goto L6a
        L7e:
            if (r11 == r1) goto Lc0
            r8 = r2[r3]
            if (r8 < r13) goto L85
            goto Lc0
        L85:
            r8 = 4
            if (r11 >= r1) goto L99
            boolean r9 = r0.get(r12, r11)
            if (r9 == 0) goto L99
            r9 = r2[r8]
            if (r9 >= r13) goto L99
            int r9 = r9 + 1
            r2[r8] = r9
            int r11 = r11 + 1
            goto L85
        L99:
            r12 = r2[r8]
            if (r12 < r13) goto L9e
            return r6
        L9e:
            r13 = r2[r7]
            r0 = r2[r5]
            int r13 = r13 + r0
            r0 = r2[r4]
            int r13 = r13 + r0
            r0 = r2[r3]
            int r13 = r13 + r0
            int r13 = r13 + r12
            int r13 = r13 - r14
            int r12 = java.lang.Math.abs(r13)
            int r12 = r12 * 5
            int r14 = r14 * r4
            if (r12 < r14) goto Lb5
            return r6
        Lb5:
            boolean r12 = m65515h(r2)
            if (r12 == 0) goto Lc0
            float r11 = m65522a(r2, r11)
            return r11
        Lc0:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.zxing.qrcode.detector.FinderPatternFinder.m65518e(int, int, int, int):float");
    }

    /* renamed from: g */
    private int m65516g() {
        if (this.f44730b.size() <= 1) {
            return 0;
        }
        FinderPattern finderPattern = null;
        for (FinderPattern finderPattern2 : this.f44730b) {
            if (finderPattern2.m65523d() >= 2) {
                if (finderPattern == null) {
                    finderPattern = finderPattern2;
                } else {
                    this.f44731c = true;
                    return ((int) (Math.abs(finderPattern.getX() - finderPattern2.getX()) - Math.abs(finderPattern.getY() - finderPattern2.getY()))) / 2;
                }
            }
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: h */
    public static boolean m65515h(int[] iArr) {
        int i = 0;
        for (int i2 = 0; i2 < 5; i2++) {
            int i3 = iArr[i2];
            if (i3 == 0) {
                return false;
            }
            i += i3;
        }
        if (i < 7) {
            return false;
        }
        float f = i / 7.0f;
        float f2 = f / 2.0f;
        if (Math.abs(f - iArr[0]) >= f2 || Math.abs(f - iArr[1]) >= f2 || Math.abs((f * 3.0f) - iArr[2]) >= 3.0f * f2 || Math.abs(f - iArr[3]) >= f2 || Math.abs(f - iArr[4]) >= f2) {
            return false;
        }
        return true;
    }

    /* renamed from: i */
    protected static boolean m65514i(int[] iArr) {
        int i = 0;
        for (int i2 = 0; i2 < 5; i2++) {
            int i3 = iArr[i2];
            if (i3 == 0) {
                return false;
            }
            i += i3;
        }
        if (i < 7) {
            return false;
        }
        float f = i / 7.0f;
        float f2 = f / 1.333f;
        if (Math.abs(f - iArr[0]) >= f2 || Math.abs(f - iArr[1]) >= f2 || Math.abs((f * 3.0f) - iArr[2]) >= 3.0f * f2 || Math.abs(f - iArr[3]) >= f2 || Math.abs(f - iArr[4]) >= f2) {
            return false;
        }
        return true;
    }

    /* renamed from: j */
    private int[] m65513j() {
        m65521b(this.f44732d);
        return this.f44732d;
    }

    /* renamed from: n */
    private boolean m65509n() {
        int size = this.f44730b.size();
        float f = 0.0f;
        int i = 0;
        float f2 = 0.0f;
        for (FinderPattern finderPattern : this.f44730b) {
            if (finderPattern.m65523d() >= 2) {
                i++;
                f2 += finderPattern.getEstimatedModuleSize();
            }
        }
        if (i < 3) {
            return false;
        }
        float f3 = f2 / size;
        for (FinderPattern finderPattern2 : this.f44730b) {
            f += Math.abs(finderPattern2.getEstimatedModuleSize() - f3);
        }
        if (f > f2 * 0.05f) {
            return false;
        }
        return true;
    }

    /* renamed from: o */
    private FinderPattern[] m65508o() throws NotFoundException {
        float f;
        int size = this.f44730b.size();
        if (size >= 3) {
            float f2 = 0.0f;
            if (size > 3) {
                float f3 = 0.0f;
                float f4 = 0.0f;
                for (FinderPattern finderPattern : this.f44730b) {
                    float estimatedModuleSize = finderPattern.getEstimatedModuleSize();
                    f3 += estimatedModuleSize;
                    f4 += estimatedModuleSize * estimatedModuleSize;
                }
                float f5 = f3 / size;
                float sqrt = (float) Math.sqrt((f4 / f) - (f5 * f5));
                Collections.sort(this.f44730b, new FurthestFromAverageComparator(f5));
                float max = Math.max(0.2f * f5, sqrt);
                int i = 0;
                while (i < this.f44730b.size() && this.f44730b.size() > 3) {
                    if (Math.abs(this.f44730b.get(i).getEstimatedModuleSize() - f5) > max) {
                        this.f44730b.remove(i);
                        i--;
                    }
                    i++;
                }
            }
            if (this.f44730b.size() > 3) {
                for (FinderPattern finderPattern2 : this.f44730b) {
                    f2 += finderPattern2.getEstimatedModuleSize();
                }
                Collections.sort(this.f44730b, new CenterComparator(f2 / this.f44730b.size()));
                List<FinderPattern> list = this.f44730b;
                list.subList(3, list.size()).clear();
            }
            return new FinderPattern[]{this.f44730b.get(0), this.f44730b.get(1), this.f44730b.get(2)};
        }
        throw NotFoundException.getNotFoundInstance();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: b */
    public final void m65521b(int[] iArr) {
        for (int i = 0; i < iArr.length; i++) {
            iArr[i] = 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public final FinderPatternInfo m65517f(Map<DecodeHintType, ?> map) throws NotFoundException {
        boolean z;
        if (map != null && map.containsKey(DecodeHintType.TRY_HARDER)) {
            z = true;
        } else {
            z = false;
        }
        int height = this.f44729a.getHeight();
        int width = this.f44729a.getWidth();
        int i = (height * 3) / 388;
        if (i < 3 || z) {
            i = 3;
        }
        int[] iArr = new int[5];
        int i2 = i - 1;
        boolean z2 = false;
        while (i2 < height && !z2) {
            m65521b(iArr);
            int i3 = 0;
            int i4 = 0;
            while (i3 < width) {
                if (this.f44729a.get(i3, i2)) {
                    if ((i4 & 1) == 1) {
                        i4++;
                    }
                    iArr[i4] = iArr[i4] + 1;
                } else if ((i4 & 1) == 0) {
                    if (i4 == 4) {
                        if (m65515h(iArr)) {
                            if (m65510m(iArr, i2, i3)) {
                                if (this.f44731c) {
                                    z2 = m65509n();
                                } else {
                                    int m65516g = m65516g();
                                    int i5 = iArr[2];
                                    if (m65516g > i5) {
                                        i2 += (m65516g - i5) - 2;
                                        i3 = width - 1;
                                    }
                                }
                                m65521b(iArr);
                                i = 2;
                                i4 = 0;
                            } else {
                                m65507p(iArr);
                            }
                        } else {
                            m65507p(iArr);
                        }
                        i4 = 3;
                    } else {
                        i4++;
                        iArr[i4] = iArr[i4] + 1;
                    }
                } else {
                    iArr[i4] = iArr[i4] + 1;
                }
                i3++;
            }
            if (m65515h(iArr) && m65510m(iArr, i2, width)) {
                i = iArr[0];
                if (this.f44731c) {
                    z2 = m65509n();
                }
            }
            i2 += i;
        }
        FinderPattern[] m65508o = m65508o();
        ResultPoint.orderBestPatterns(m65508o);
        return new FinderPatternInfo(m65508o);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: k */
    public final BitMatrix m65512k() {
        return this.f44729a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: l */
    public final List<FinderPattern> m65511l() {
        return this.f44730b;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: m */
    public final boolean m65510m(int[] iArr, int i, int i2) {
        boolean z = false;
        int i3 = iArr[0] + iArr[1] + iArr[2] + iArr[3] + iArr[4];
        int m65522a = (int) m65522a(iArr, i2);
        float m65518e = m65518e(i, m65522a, iArr[2], i3);
        if (!Float.isNaN(m65518e)) {
            int i4 = (int) m65518e;
            float m65519d = m65519d(m65522a, i4, iArr[2], i3);
            if (!Float.isNaN(m65519d) && m65520c(i4, (int) m65519d)) {
                float f = i3 / 7.0f;
                int i5 = 0;
                while (true) {
                    if (i5 >= this.f44730b.size()) {
                        break;
                    }
                    FinderPattern finderPattern = this.f44730b.get(i5);
                    if (finderPattern.m65525b(f, m65518e, m65519d)) {
                        this.f44730b.set(i5, finderPattern.m65524c(m65518e, m65519d, f));
                        z = true;
                        break;
                    }
                    i5++;
                }
                if (!z) {
                    FinderPattern finderPattern2 = new FinderPattern(m65519d, m65518e, f);
                    this.f44730b.add(finderPattern2);
                    ResultPointCallback resultPointCallback = this.f44733e;
                    if (resultPointCallback != null) {
                        resultPointCallback.foundPossibleResultPoint(finderPattern2);
                    }
                }
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: p */
    public final void m65507p(int[] iArr) {
        iArr[0] = iArr[2];
        iArr[1] = iArr[3];
        iArr[2] = iArr[4];
        iArr[3] = 1;
        iArr[4] = 0;
    }

    public FinderPatternFinder(BitMatrix bitMatrix, ResultPointCallback resultPointCallback) {
        this.f44729a = bitMatrix;
        this.f44730b = new ArrayList();
        this.f44732d = new int[5];
        this.f44733e = resultPointCallback;
    }
}
