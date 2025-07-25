package com.google.zxing.oned.rss.expanded;

import com.facebook.internal.FacebookRequestErrorClassification;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.DecodeHintType;
import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;
import com.google.zxing.Result;
import com.google.zxing.ResultPoint;
import com.google.zxing.common.BitArray;
import com.google.zxing.common.detector.MathUtils;
import com.google.zxing.oned.OneDReader;
import com.google.zxing.oned.rss.AbstractRSSReader;
import com.google.zxing.oned.rss.DataCharacter;
import com.google.zxing.oned.rss.FinderPattern;
import com.google.zxing.oned.rss.RSSUtils;
import com.google.zxing.oned.rss.expanded.decoders.AbstractExpandedDecoder;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.maticoo.sdk.utils.error.ErrorCode;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* loaded from: classes5.dex */
public final class RSSExpandedReader extends AbstractRSSReader {

    /* renamed from: k */
    private static final int[] f44557k = {7, 5, 4, 3, 1};

    /* renamed from: l */
    private static final int[] f44558l = {4, 20, 52, 104, 204};

    /* renamed from: m */
    private static final int[] f44559m = {0, 348, 1388, 2948, 3988};

    /* renamed from: n */
    private static final int[][] f44560n = {new int[]{1, 8, 4, 1}, new int[]{3, 6, 4, 1}, new int[]{3, 4, 6, 1}, new int[]{3, 2, 8, 1}, new int[]{2, 6, 5, 1}, new int[]{2, 2, 9, 1}};

    /* renamed from: o */
    private static final int[][] f44561o = {new int[]{1, 3, 9, 27, 81, 32, 96, 77}, new int[]{20, 60, 180, 118, 143, 7, 21, 63}, new int[]{189, 145, 13, 39, 117, IronSourceConstants.USING_CACHE_FOR_INIT_EVENT, 209, 205}, new int[]{193, 157, 49, 147, 19, 57, 171, 91}, new int[]{62, 186, 136, 197, 169, 85, 44, 132}, new int[]{185, 133, 188, 142, 4, 12, 36, 108}, new int[]{113, 128, 173, 97, 80, 29, 87, 50}, new int[]{150, 28, 84, 41, 123, 158, 52, 156}, new int[]{46, 138, 203, 187, 139, 206, 196, 166}, new int[]{76, 17, 51, 153, 37, 111, 122, 155}, new int[]{43, 129, 176, 106, 107, 110, 119, 146}, new int[]{16, 48, 144, 10, 30, 90, 59, 177}, new int[]{109, 116, 137, 200, 178, 112, 125, 164}, new int[]{70, 210, 208, 202, 184, 130, 179, 115}, new int[]{134, 191, ErrorCode.CODE_INIT_UNKNOWN_ERROR, 31, 93, 68, 204, FacebookRequestErrorClassification.EC_INVALID_TOKEN}, new int[]{148, 22, 66, 198, 172, 94, 71, 2}, new int[]{6, 18, 54, 162, 64, 192, 154, 40}, new int[]{120, 149, 25, 75, 14, 42, 126, 167}, new int[]{79, 26, 78, 23, 69, 207, 199, 175}, new int[]{103, 98, 83, 38, 114, 131, 182, 124}, new int[]{161, 61, 183, 127, 170, 88, 53, 159}, new int[]{55, 165, 73, 8, 24, 72, 5, 15}, new int[]{45, 135, 194, 160, 58, 174, 100, 89}};

    /* renamed from: p */
    private static final int[][] f44562p = {new int[]{0, 0}, new int[]{0, 1, 1}, new int[]{0, 2, 1, 3}, new int[]{0, 4, 1, 3, 2}, new int[]{0, 4, 1, 3, 3, 5}, new int[]{0, 4, 1, 3, 4, 5, 5}, new int[]{0, 0, 1, 1, 2, 2, 3, 3}, new int[]{0, 0, 1, 1, 2, 2, 3, 4, 4}, new int[]{0, 0, 1, 1, 2, 2, 3, 4, 5, 5}, new int[]{0, 0, 1, 1, 2, 3, 3, 4, 4, 5, 5}};

    /* renamed from: g */
    private final List<ExpandedPair> f44563g = new ArrayList(11);

    /* renamed from: h */
    private final List<ExpandedRow> f44564h = new ArrayList();

    /* renamed from: i */
    private final int[] f44565i = new int[2];

    /* renamed from: j */
    private boolean f44566j;

    /* renamed from: A */
    private FinderPattern m65797A(BitArray bitArray, int i, boolean z) {
        int i2;
        int i3;
        int i4;
        if (z) {
            int i5 = this.f44565i[0] - 1;
            while (i5 >= 0 && !bitArray.get(i5)) {
                i5--;
            }
            int i6 = i5 + 1;
            int[] iArr = this.f44565i;
            i4 = iArr[0] - i6;
            i2 = iArr[1];
            i3 = i6;
        } else {
            int[] iArr2 = this.f44565i;
            int i7 = iArr2[0];
            int nextUnset = bitArray.getNextUnset(iArr2[1] + 1);
            i2 = nextUnset;
            i3 = i7;
            i4 = nextUnset - this.f44565i[1];
        }
        int[] m65826g = m65826g();
        System.arraycopy(m65826g, 0, m65826g, 1, m65826g.length - 1);
        m65826g[0] = i4;
        try {
            return new FinderPattern(AbstractRSSReader.m65819n(m65826g, f44560n), new int[]{i3, i2}, i3, i2, i);
        } catch (NotFoundException unused) {
            return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x004c, code lost:
        continue;
     */
    /* renamed from: B */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void m65796B(java.util.List<com.google.zxing.oned.rss.expanded.ExpandedPair> r6, java.util.List<com.google.zxing.oned.rss.expanded.ExpandedRow> r7) {
        /*
            java.util.Iterator r7 = r7.iterator()
        L4:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L55
            java.lang.Object r0 = r7.next()
            com.google.zxing.oned.rss.expanded.ExpandedRow r0 = (com.google.zxing.oned.rss.expanded.ExpandedRow) r0
            java.util.List r1 = r0.m65800a()
            int r1 = r1.size()
            int r2 = r6.size()
            if (r1 == r2) goto L4
            java.util.List r0 = r0.m65800a()
            java.util.Iterator r0 = r0.iterator()
        L26:
            boolean r1 = r0.hasNext()
            r2 = 1
            if (r1 == 0) goto L4f
            java.lang.Object r1 = r0.next()
            com.google.zxing.oned.rss.expanded.ExpandedPair r1 = (com.google.zxing.oned.rss.expanded.ExpandedPair) r1
            java.util.Iterator r3 = r6.iterator()
        L37:
            boolean r4 = r3.hasNext()
            r5 = 0
            if (r4 == 0) goto L4b
            java.lang.Object r4 = r3.next()
            com.google.zxing.oned.rss.expanded.ExpandedPair r4 = (com.google.zxing.oned.rss.expanded.ExpandedPair) r4
            boolean r4 = r1.equals(r4)
            if (r4 == 0) goto L37
            goto L4c
        L4b:
            r2 = r5
        L4c:
            if (r2 != 0) goto L26
            r2 = r5
        L4f:
            if (r2 == 0) goto L4
            r7.remove()
            goto L4
        L55:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.zxing.oned.rss.expanded.RSSExpandedReader.m65796B(java.util.List, java.util.List):void");
    }

    /* renamed from: D */
    private static void m65794D(int[] iArr) {
        int length = iArr.length;
        for (int i = 0; i < length / 2; i++) {
            int i2 = iArr[i];
            int i3 = (length - i) - 1;
            iArr[i] = iArr[i3];
            iArr[i3] = i2;
        }
    }

    /* renamed from: E */
    private void m65793E(int i, boolean z) {
        boolean z2 = false;
        int i2 = 0;
        boolean z3 = false;
        while (true) {
            if (i2 >= this.f44564h.size()) {
                break;
            }
            ExpandedRow expandedRow = this.f44564h.get(i2);
            if (expandedRow.m65799b() > i) {
                z2 = expandedRow.m65798c(this.f44563g);
                break;
            } else {
                z3 = expandedRow.m65798c(this.f44563g);
                i2++;
            }
        }
        if (z2 || z3 || m65782y(this.f44563g, this.f44564h)) {
            return;
        }
        this.f44564h.add(i2, new ExpandedRow(this.f44563g, i, z));
        m65796B(this.f44563g, this.f44564h);
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:71:? A[RETURN, SYNTHETIC] */
    /* renamed from: o */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void m65792o(int r11) throws com.google.zxing.NotFoundException {
        /*
            Method dump skipped, instructions count: 205
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.zxing.oned.rss.expanded.RSSExpandedReader.m65792o(int):void");
    }

    /* renamed from: p */
    private boolean m65791p() {
        ExpandedPair expandedPair = this.f44563g.get(0);
        DataCharacter m65803c = expandedPair.m65803c();
        DataCharacter m65802d = expandedPair.m65802d();
        if (m65802d == null) {
            return false;
        }
        int checksumPortion = m65802d.getChecksumPortion();
        int i = 2;
        for (int i2 = 1; i2 < this.f44563g.size(); i2++) {
            ExpandedPair expandedPair2 = this.f44563g.get(i2);
            checksumPortion += expandedPair2.m65803c().getChecksumPortion();
            i++;
            DataCharacter m65802d2 = expandedPair2.m65802d();
            if (m65802d2 != null) {
                checksumPortion += m65802d2.getChecksumPortion();
                i++;
            }
        }
        if (((i - 4) * 211) + (checksumPortion % 211) != m65803c.getValue()) {
            return false;
        }
        return true;
    }

    /* renamed from: q */
    private List<ExpandedPair> m65790q(List<ExpandedRow> list, int i) throws NotFoundException {
        while (i < this.f44564h.size()) {
            ExpandedRow expandedRow = this.f44564h.get(i);
            this.f44563g.clear();
            for (ExpandedRow expandedRow2 : list) {
                this.f44563g.addAll(expandedRow2.m65800a());
            }
            this.f44563g.addAll(expandedRow.m65800a());
            if (m65781z(this.f44563g)) {
                if (m65791p()) {
                    return this.f44563g;
                }
                ArrayList arrayList = new ArrayList(list);
                arrayList.add(expandedRow);
                try {
                    return m65790q(arrayList, i + 1);
                } catch (NotFoundException unused) {
                    continue;
                }
            }
            i++;
        }
        throw NotFoundException.getNotFoundInstance();
    }

    /* renamed from: r */
    private List<ExpandedPair> m65789r(boolean z) {
        List<ExpandedPair> list = null;
        if (this.f44564h.size() > 25) {
            this.f44564h.clear();
            return null;
        }
        this.f44563g.clear();
        if (z) {
            Collections.reverse(this.f44564h);
        }
        try {
            list = m65790q(new ArrayList(), 0);
        } catch (NotFoundException unused) {
        }
        if (z) {
            Collections.reverse(this.f44564h);
        }
        return list;
    }

    /* renamed from: s */
    static Result m65788s(List<ExpandedPair> list) throws NotFoundException, FormatException {
        String parseInformation = AbstractExpandedDecoder.createDecoder(BitArrayBuilder.m65806a(list)).parseInformation();
        ResultPoint[] resultPoints = list.get(0).m65804b().getResultPoints();
        ResultPoint[] resultPoints2 = list.get(list.size() - 1).m65804b().getResultPoints();
        return new Result(parseInformation, null, new ResultPoint[]{resultPoints[0], resultPoints[1], resultPoints2[0], resultPoints2[1]}, BarcodeFormat.RSS_EXPANDED);
    }

    /* renamed from: v */
    private void m65785v(BitArray bitArray, List<ExpandedPair> list, int i) throws NotFoundException {
        boolean z;
        int[] m65826g = m65826g();
        m65826g[0] = 0;
        m65826g[1] = 0;
        m65826g[2] = 0;
        m65826g[3] = 0;
        int size = bitArray.getSize();
        if (i < 0) {
            if (list.isEmpty()) {
                i = 0;
            } else {
                i = list.get(list.size() - 1).m65804b().getStartEnd()[1];
            }
        }
        if (list.size() % 2 != 0) {
            z = true;
        } else {
            z = false;
        }
        if (this.f44566j) {
            z = !z;
        }
        boolean z2 = false;
        while (i < size) {
            z2 = !bitArray.get(i);
            if (!z2) {
                break;
            }
            i++;
        }
        int i2 = 0;
        boolean z3 = z2;
        int i3 = i;
        while (i < size) {
            if (bitArray.get(i) != z3) {
                m65826g[i2] = m65826g[i2] + 1;
            } else {
                if (i2 == 3) {
                    if (z) {
                        m65794D(m65826g);
                    }
                    if (AbstractRSSReader.m65820m(m65826g)) {
                        int[] iArr = this.f44565i;
                        iArr[0] = i3;
                        iArr[1] = i;
                        return;
                    }
                    if (z) {
                        m65794D(m65826g);
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
                z3 = !z3;
            }
            i++;
        }
        throw NotFoundException.getNotFoundInstance();
    }

    /* renamed from: w */
    private static int m65784w(BitArray bitArray, int i) {
        if (bitArray.get(i)) {
            return bitArray.getNextSet(bitArray.getNextUnset(i));
        }
        return bitArray.getNextUnset(bitArray.getNextSet(i));
    }

    /* renamed from: x */
    private static boolean m65783x(FinderPattern finderPattern, boolean z, boolean z2) {
        if (finderPattern.getValue() == 0 && z && z2) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0043, code lost:
        continue;
     */
    /* renamed from: y */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static boolean m65782y(java.lang.Iterable<com.google.zxing.oned.rss.expanded.ExpandedPair> r7, java.lang.Iterable<com.google.zxing.oned.rss.expanded.ExpandedRow> r8) {
        /*
            java.util.Iterator r8 = r8.iterator()
        L4:
            boolean r0 = r8.hasNext()
            r1 = 0
            if (r0 == 0) goto L46
            java.lang.Object r0 = r8.next()
            com.google.zxing.oned.rss.expanded.ExpandedRow r0 = (com.google.zxing.oned.rss.expanded.ExpandedRow) r0
            java.util.Iterator r2 = r7.iterator()
        L15:
            boolean r3 = r2.hasNext()
            r4 = 1
            if (r3 == 0) goto L42
            java.lang.Object r3 = r2.next()
            com.google.zxing.oned.rss.expanded.ExpandedPair r3 = (com.google.zxing.oned.rss.expanded.ExpandedPair) r3
            java.util.List r5 = r0.m65800a()
            java.util.Iterator r5 = r5.iterator()
        L2a:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L3e
            java.lang.Object r6 = r5.next()
            com.google.zxing.oned.rss.expanded.ExpandedPair r6 = (com.google.zxing.oned.rss.expanded.ExpandedPair) r6
            boolean r6 = r3.equals(r6)
            if (r6 == 0) goto L2a
            r3 = r4
            goto L3f
        L3e:
            r3 = r1
        L3f:
            if (r3 != 0) goto L15
            goto L43
        L42:
            r1 = r4
        L43:
            if (r1 == 0) goto L4
            return r4
        L46:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.zxing.oned.rss.expanded.RSSExpandedReader.m65782y(java.lang.Iterable, java.lang.Iterable):boolean");
    }

    /* renamed from: z */
    private static boolean m65781z(List<ExpandedPair> list) {
        int[][] iArr;
        boolean z;
        for (int[] iArr2 : f44562p) {
            if (list.size() <= iArr2.length) {
                int i = 0;
                while (true) {
                    if (i < list.size()) {
                        if (list.get(i).m65804b().getValue() != iArr2[i]) {
                            z = false;
                            break;
                        }
                        i++;
                    } else {
                        z = true;
                        break;
                    }
                }
                if (z) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: C */
    ExpandedPair m65795C(BitArray bitArray, List<ExpandedPair> list, int i) throws NotFoundException {
        boolean z;
        FinderPattern m65797A;
        DataCharacter dataCharacter;
        if (list.size() % 2 == 0) {
            z = true;
        } else {
            z = false;
        }
        if (this.f44566j) {
            z = !z;
        }
        int i2 = -1;
        boolean z2 = true;
        do {
            m65785v(bitArray, list, i2);
            m65797A = m65797A(bitArray, i, z);
            if (m65797A == null) {
                i2 = m65784w(bitArray, this.f44565i[0]);
                continue;
            } else {
                z2 = false;
                continue;
            }
        } while (z2);
        DataCharacter m65787t = m65787t(bitArray, m65797A, z, true);
        if (!list.isEmpty() && list.get(list.size() - 1).mustBeLast()) {
            throw NotFoundException.getNotFoundInstance();
        }
        try {
            dataCharacter = m65787t(bitArray, m65797A, z, false);
        } catch (NotFoundException unused) {
            dataCharacter = null;
        }
        return new ExpandedPair(m65787t, dataCharacter, m65797A, true);
    }

    @Override // com.google.zxing.oned.OneDReader
    public Result decodeRow(int i, BitArray bitArray, Map<DecodeHintType, ?> map) throws NotFoundException, FormatException {
        this.f44563g.clear();
        this.f44566j = false;
        try {
            return m65788s(m65786u(i, bitArray));
        } catch (NotFoundException unused) {
            this.f44563g.clear();
            this.f44566j = true;
            return m65788s(m65786u(i, bitArray));
        }
    }

    @Override // com.google.zxing.oned.OneDReader, com.google.zxing.Reader
    public void reset() {
        this.f44563g.clear();
        this.f44564h.clear();
    }

    /* renamed from: t */
    DataCharacter m65787t(BitArray bitArray, FinderPattern finderPattern, boolean z, boolean z2) throws NotFoundException {
        int i;
        int[] m65827f = m65827f();
        for (int i2 = 0; i2 < m65827f.length; i2++) {
            m65827f[i2] = 0;
        }
        if (z2) {
            OneDReader.m65853d(bitArray, finderPattern.getStartEnd()[0], m65827f);
        } else {
            OneDReader.m65854c(bitArray, finderPattern.getStartEnd()[1], m65827f);
            int i3 = 0;
            for (int length = m65827f.length - 1; i3 < length; length--) {
                int i4 = m65827f[i3];
                m65827f[i3] = m65827f[length];
                m65827f[length] = i4;
                i3++;
            }
        }
        float sum = MathUtils.sum(m65827f) / 17.0f;
        float f = (finderPattern.getStartEnd()[1] - finderPattern.getStartEnd()[0]) / 15.0f;
        if (Math.abs(sum - f) / f <= 0.3f) {
            int[] m65823j = m65823j();
            int[] m65825h = m65825h();
            float[] m65822k = m65822k();
            float[] m65824i = m65824i();
            for (int i5 = 0; i5 < m65827f.length; i5++) {
                float f2 = (m65827f[i5] * 1.0f) / sum;
                int i6 = (int) (0.5f + f2);
                if (i6 <= 0) {
                    if (f2 >= 0.3f) {
                        i6 = 1;
                    } else {
                        throw NotFoundException.getNotFoundInstance();
                    }
                } else if (i6 > 8) {
                    if (f2 <= 8.7f) {
                        i6 = 8;
                    } else {
                        throw NotFoundException.getNotFoundInstance();
                    }
                }
                int i7 = i5 / 2;
                if ((i5 & 1) == 0) {
                    m65823j[i7] = i6;
                    m65822k[i7] = f2 - i6;
                } else {
                    m65825h[i7] = i6;
                    m65824i[i7] = f2 - i6;
                }
            }
            m65792o(17);
            int value = finderPattern.getValue() * 4;
            if (z) {
                i = 0;
            } else {
                i = 2;
            }
            int i8 = ((value + i) + (!z2 ? 1 : 0)) - 1;
            int i9 = 0;
            int i10 = 0;
            for (int length2 = m65823j.length - 1; length2 >= 0; length2--) {
                if (m65783x(finderPattern, z, z2)) {
                    i9 += m65823j[length2] * f44561o[i8][length2 * 2];
                }
                i10 += m65823j[length2];
            }
            int i11 = 0;
            for (int length3 = m65825h.length - 1; length3 >= 0; length3--) {
                if (m65783x(finderPattern, z, z2)) {
                    i11 += m65825h[length3] * f44561o[i8][(length3 * 2) + 1];
                }
            }
            int i12 = i9 + i11;
            if ((i10 & 1) == 0 && i10 <= 13 && i10 >= 4) {
                int i13 = (13 - i10) / 2;
                int i14 = f44557k[i13];
                return new DataCharacter((RSSUtils.getRSSvalue(m65823j, i14, true) * f44558l[i13]) + RSSUtils.getRSSvalue(m65825h, 9 - i14, false) + f44559m[i13], i12);
            }
            throw NotFoundException.getNotFoundInstance();
        }
        throw NotFoundException.getNotFoundInstance();
    }

    /* renamed from: u */
    List<ExpandedPair> m65786u(int i, BitArray bitArray) throws NotFoundException {
        boolean z = false;
        while (!z) {
            try {
                List<ExpandedPair> list = this.f44563g;
                list.add(m65795C(bitArray, list, i));
            } catch (NotFoundException e) {
                if (!this.f44563g.isEmpty()) {
                    z = true;
                } else {
                    throw e;
                }
            }
        }
        if (m65791p()) {
            return this.f44563g;
        }
        boolean z2 = !this.f44564h.isEmpty();
        m65793E(i, false);
        if (z2) {
            List<ExpandedPair> m65789r = m65789r(false);
            if (m65789r != null) {
                return m65789r;
            }
            List<ExpandedPair> m65789r2 = m65789r(true);
            if (m65789r2 != null) {
                return m65789r2;
            }
        }
        throw NotFoundException.getNotFoundInstance();
    }
}
