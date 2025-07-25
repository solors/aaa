package com.google.zxing.oned.rss;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.DecodeHintType;
import com.google.zxing.NotFoundException;
import com.google.zxing.Result;
import com.google.zxing.ResultPoint;
import com.google.zxing.ResultPointCallback;
import com.google.zxing.common.BitArray;
import com.google.zxing.common.detector.MathUtils;
import com.google.zxing.oned.OneDReader;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes5.dex */
public final class RSS14Reader extends AbstractRSSReader {

    /* renamed from: i */
    private static final int[] f44541i = {1, 10, 34, 70, 126};

    /* renamed from: j */
    private static final int[] f44542j = {4, 20, 48, 81};

    /* renamed from: k */
    private static final int[] f44543k = {0, 161, 961, 2015, 2715};

    /* renamed from: l */
    private static final int[] f44544l = {0, 336, IronSourceError.ERROR_IS_SHOW_CALLED_DURING_SHOW, 1516};

    /* renamed from: m */
    private static final int[] f44545m = {8, 6, 4, 3, 1};

    /* renamed from: n */
    private static final int[] f44546n = {2, 4, 6, 8};

    /* renamed from: o */
    private static final int[][] f44547o = {new int[]{3, 8, 2, 1}, new int[]{3, 5, 5, 1}, new int[]{3, 3, 7, 1}, new int[]{3, 1, 9, 1}, new int[]{2, 7, 4, 1}, new int[]{2, 5, 6, 1}, new int[]{2, 3, 8, 1}, new int[]{1, 5, 7, 1}, new int[]{1, 3, 9, 1}};

    /* renamed from: g */
    private final List<Pair> f44548g = new ArrayList();

    /* renamed from: h */
    private final List<Pair> f44549h = new ArrayList();

    /* renamed from: o */
    private static void m65815o(Collection<Pair> collection, Pair pair) {
        boolean z;
        if (pair == null) {
            return;
        }
        Iterator<Pair> it = collection.iterator();
        while (true) {
            if (it.hasNext()) {
                Pair next = it.next();
                if (next.getValue() == pair.getValue()) {
                    next.m65816c();
                    z = true;
                    break;
                }
            } else {
                z = false;
                break;
            }
        }
        if (!z) {
            collection.add(pair);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0026, code lost:
        if (r1 < 4) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x003f, code lost:
        if (r1 < 4) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0041, code lost:
        r2 = true;
        r5 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0044, code lost:
        r2 = false;
        r5 = false;
     */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:85:? A[RETURN, SYNTHETIC] */
    /* renamed from: p */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void m65814p(boolean r10, int r11) throws com.google.zxing.NotFoundException {
        /*
            Method dump skipped, instructions count: 230
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.zxing.oned.rss.RSS14Reader.m65814p(boolean, int):void");
    }

    /* renamed from: q */
    private static boolean m65813q(Pair pair, Pair pair2) {
        int checksumPortion = (pair.getChecksumPortion() + (pair2.getChecksumPortion() * 16)) % 79;
        int value = (pair.m65817b().getValue() * 9) + pair2.m65817b().getValue();
        if (value > 72) {
            value--;
        }
        if (value > 8) {
            value--;
        }
        if (checksumPortion == value) {
            return true;
        }
        return false;
    }

    /* renamed from: r */
    private static Result m65812r(Pair pair, Pair pair2) {
        String valueOf = String.valueOf((pair.getValue() * 4537077) + pair2.getValue());
        StringBuilder sb2 = new StringBuilder(14);
        for (int length = 13 - valueOf.length(); length > 0; length--) {
            sb2.append('0');
        }
        sb2.append(valueOf);
        int i = 0;
        for (int i2 = 0; i2 < 13; i2++) {
            int charAt = sb2.charAt(i2) - '0';
            if ((i2 & 1) == 0) {
                charAt *= 3;
            }
            i += charAt;
        }
        int i3 = 10 - (i % 10);
        if (i3 == 10) {
            i3 = 0;
        }
        sb2.append(i3);
        ResultPoint[] resultPoints = pair.m65817b().getResultPoints();
        ResultPoint[] resultPoints2 = pair2.m65817b().getResultPoints();
        return new Result(sb2.toString(), null, new ResultPoint[]{resultPoints[0], resultPoints[1], resultPoints2[0], resultPoints2[1]}, BarcodeFormat.RSS_14);
    }

    /* renamed from: s */
    private DataCharacter m65811s(BitArray bitArray, FinderPattern finderPattern, boolean z) throws NotFoundException {
        int i;
        int[] m65827f = m65827f();
        for (int i2 = 0; i2 < m65827f.length; i2++) {
            m65827f[i2] = 0;
        }
        if (z) {
            OneDReader.m65853d(bitArray, finderPattern.getStartEnd()[0], m65827f);
        } else {
            OneDReader.m65854c(bitArray, finderPattern.getStartEnd()[1] + 1, m65827f);
            int i3 = 0;
            for (int length = m65827f.length - 1; i3 < length; length--) {
                int i4 = m65827f[i3];
                m65827f[i3] = m65827f[length];
                m65827f[length] = i4;
                i3++;
            }
        }
        if (z) {
            i = 16;
        } else {
            i = 15;
        }
        float sum = MathUtils.sum(m65827f) / i;
        int[] m65823j = m65823j();
        int[] m65825h = m65825h();
        float[] m65822k = m65822k();
        float[] m65824i = m65824i();
        for (int i5 = 0; i5 < m65827f.length; i5++) {
            float f = m65827f[i5] / sum;
            int i6 = (int) (0.5f + f);
            if (i6 <= 0) {
                i6 = 1;
            } else if (i6 > 8) {
                i6 = 8;
            }
            int i7 = i5 / 2;
            if ((i5 & 1) == 0) {
                m65823j[i7] = i6;
                m65822k[i7] = f - i6;
            } else {
                m65825h[i7] = i6;
                m65824i[i7] = f - i6;
            }
        }
        m65814p(z, i);
        int i8 = 0;
        int i9 = 0;
        for (int length2 = m65823j.length - 1; length2 >= 0; length2--) {
            int i10 = m65823j[length2];
            i8 = (i8 * 9) + i10;
            i9 += i10;
        }
        int i11 = 0;
        int i12 = 0;
        for (int length3 = m65825h.length - 1; length3 >= 0; length3--) {
            int i13 = m65825h[length3];
            i11 = (i11 * 9) + i13;
            i12 += i13;
        }
        int i14 = i8 + (i11 * 3);
        if (z) {
            if ((i9 & 1) == 0 && i9 <= 12 && i9 >= 4) {
                int i15 = (12 - i9) / 2;
                int i16 = f44545m[i15];
                int i17 = 9 - i16;
                return new DataCharacter((RSSUtils.getRSSvalue(m65823j, i16, false) * f44541i[i15]) + RSSUtils.getRSSvalue(m65825h, i17, true) + f44543k[i15], i14);
            }
            throw NotFoundException.getNotFoundInstance();
        } else if ((i12 & 1) == 0 && i12 <= 10 && i12 >= 4) {
            int i18 = (10 - i12) / 2;
            int i19 = f44546n[i18];
            return new DataCharacter((RSSUtils.getRSSvalue(m65825h, 9 - i19, false) * f44542j[i18]) + RSSUtils.getRSSvalue(m65823j, i19, true) + f44544l[i18], i14);
        } else {
            throw NotFoundException.getNotFoundInstance();
        }
    }

    /* renamed from: t */
    private Pair m65810t(BitArray bitArray, boolean z, int i, Map<DecodeHintType, ?> map) {
        int[] m65809u;
        ResultPointCallback resultPointCallback;
        try {
            FinderPattern m65808v = m65808v(bitArray, i, z, m65809u(bitArray, z));
            if (map == null) {
                resultPointCallback = null;
            } else {
                resultPointCallback = (ResultPointCallback) map.get(DecodeHintType.NEED_RESULT_POINT_CALLBACK);
            }
            if (resultPointCallback != null) {
                float f = (m65809u[0] + m65809u[1]) / 2.0f;
                if (z) {
                    f = (bitArray.getSize() - 1) - f;
                }
                resultPointCallback.foundPossibleResultPoint(new ResultPoint(f, i));
            }
            DataCharacter m65811s = m65811s(bitArray, m65808v, true);
            DataCharacter m65811s2 = m65811s(bitArray, m65808v, false);
            return new Pair((m65811s.getValue() * 1597) + m65811s2.getValue(), m65811s.getChecksumPortion() + (m65811s2.getChecksumPortion() * 4), m65808v);
        } catch (NotFoundException unused) {
            return null;
        }
    }

    /* renamed from: u */
    private int[] m65809u(BitArray bitArray, boolean z) throws NotFoundException {
        int[] m65826g = m65826g();
        m65826g[0] = 0;
        m65826g[1] = 0;
        m65826g[2] = 0;
        m65826g[3] = 0;
        int size = bitArray.getSize();
        int i = 0;
        boolean z2 = false;
        while (i < size) {
            z2 = !bitArray.get(i);
            if (z == z2) {
                break;
            }
            i++;
        }
        int i2 = 0;
        int i3 = i;
        while (i < size) {
            if (bitArray.get(i) != z2) {
                m65826g[i2] = m65826g[i2] + 1;
            } else {
                if (i2 == 3) {
                    if (AbstractRSSReader.m65820m(m65826g)) {
                        return new int[]{i3, i};
                    }
                    i3 += m65826g[0] + m65826g[1];
                    m65826g[0] = m65826g[2];
                    m65826g[1] = m65826g[3];
                    m65826g[2] = 0;
                    m65826g[3] = 0;
                    i2--;
                } else {
                    i2++;
                }
                m65826g[i2] = 1;
                z2 = !z2;
            }
            i++;
        }
        throw NotFoundException.getNotFoundInstance();
    }

    /* renamed from: v */
    private FinderPattern m65808v(BitArray bitArray, int i, boolean z, int[] iArr) throws NotFoundException {
        int i2;
        int i3;
        boolean z2 = bitArray.get(iArr[0]);
        int i4 = iArr[0] - 1;
        while (i4 >= 0 && z2 != bitArray.get(i4)) {
            i4--;
        }
        int i5 = i4 + 1;
        int[] m65826g = m65826g();
        System.arraycopy(m65826g, 0, m65826g, 1, m65826g.length - 1);
        m65826g[0] = iArr[0] - i5;
        int m65819n = AbstractRSSReader.m65819n(m65826g, f44547o);
        int i6 = iArr[1];
        if (z) {
            i2 = (bitArray.getSize() - 1) - i6;
            i3 = (bitArray.getSize() - 1) - i5;
        } else {
            i2 = i6;
            i3 = i5;
        }
        return new FinderPattern(m65819n, new int[]{i5, iArr[1]}, i3, i2, i);
    }

    @Override // com.google.zxing.oned.OneDReader
    public Result decodeRow(int i, BitArray bitArray, Map<DecodeHintType, ?> map) throws NotFoundException {
        m65815o(this.f44548g, m65810t(bitArray, false, i, map));
        bitArray.reverse();
        m65815o(this.f44549h, m65810t(bitArray, true, i, map));
        bitArray.reverse();
        for (Pair pair : this.f44548g) {
            if (pair.m65818a() > 1) {
                for (Pair pair2 : this.f44549h) {
                    if (pair2.m65818a() > 1 && m65813q(pair, pair2)) {
                        return m65812r(pair, pair2);
                    }
                }
                continue;
            }
        }
        throw NotFoundException.getNotFoundInstance();
    }

    @Override // com.google.zxing.oned.OneDReader, com.google.zxing.Reader
    public void reset() {
        this.f44548g.clear();
        this.f44549h.clear();
    }
}
