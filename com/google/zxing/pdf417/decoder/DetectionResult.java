package com.google.zxing.pdf417.decoder;

import com.google.zxing.pdf417.PDF417Common;
import java.util.Formatter;

/* loaded from: classes5.dex */
final class DetectionResult {

    /* renamed from: a */
    private final BarcodeMetadata f44629a;

    /* renamed from: b */
    private final DetectionResultColumn[] f44630b;

    /* renamed from: c */
    private BoundingBox f44631c;

    /* renamed from: d */
    private final int f44632d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public DetectionResult(BarcodeMetadata barcodeMetadata, BoundingBox boundingBox) {
        this.f44629a = barcodeMetadata;
        int m65723a = barcodeMetadata.m65723a();
        this.f44632d = m65723a;
        this.f44631c = boundingBox;
        this.f44630b = new DetectionResultColumn[m65723a + 2];
    }

    /* renamed from: a */
    private void m65688a(DetectionResultColumn detectionResultColumn) {
        if (detectionResultColumn != null) {
            ((DetectionResultRowIndicatorColumn) detectionResultColumn).m65665g(this.f44629a);
        }
    }

    /* renamed from: b */
    private static boolean m65687b(Codeword codeword, Codeword codeword2) {
        if (codeword2 == null || !codeword2.m65699g() || codeword2.m65705a() != codeword.m65705a()) {
            return false;
        }
        codeword.m65697i(codeword2.m65703c());
        return true;
    }

    /* renamed from: c */
    private static int m65686c(int i, int i2, Codeword codeword) {
        if (codeword == null) {
            return i2;
        }
        if (!codeword.m65699g()) {
            if (codeword.m65698h(i)) {
                codeword.m65697i(i);
                return 0;
            }
            return i2 + 1;
        }
        return i2;
    }

    /* renamed from: d */
    private int m65685d() {
        int m65683f = m65683f();
        if (m65683f == 0) {
            return 0;
        }
        for (int i = 1; i < this.f44632d + 1; i++) {
            Codeword[] m65668d = this.f44630b[i].m65668d();
            for (int i2 = 0; i2 < m65668d.length; i2++) {
                Codeword codeword = m65668d[i2];
                if (codeword != null && !codeword.m65699g()) {
                    m65684e(i, i2, m65668d);
                }
            }
        }
        return m65683f;
    }

    /* renamed from: e */
    private void m65684e(int i, int i2, Codeword[] codewordArr) {
        Codeword[] codewordArr2;
        Codeword codeword = codewordArr[i2];
        Codeword[] m65668d = this.f44630b[i - 1].m65668d();
        DetectionResultColumn detectionResultColumn = this.f44630b[i + 1];
        if (detectionResultColumn != null) {
            codewordArr2 = detectionResultColumn.m65668d();
        } else {
            codewordArr2 = m65668d;
        }
        Codeword[] codewordArr3 = new Codeword[14];
        codewordArr3[2] = m65668d[i2];
        codewordArr3[3] = codewordArr2[i2];
        if (i2 > 0) {
            int i3 = i2 - 1;
            codewordArr3[0] = codewordArr[i3];
            codewordArr3[4] = m65668d[i3];
            codewordArr3[5] = codewordArr2[i3];
        }
        if (i2 > 1) {
            int i4 = i2 - 2;
            codewordArr3[8] = codewordArr[i4];
            codewordArr3[10] = m65668d[i4];
            codewordArr3[11] = codewordArr2[i4];
        }
        if (i2 < codewordArr.length - 1) {
            int i5 = i2 + 1;
            codewordArr3[1] = codewordArr[i5];
            codewordArr3[6] = m65668d[i5];
            codewordArr3[7] = codewordArr2[i5];
        }
        if (i2 < codewordArr.length - 2) {
            int i6 = i2 + 2;
            codewordArr3[9] = codewordArr[i6];
            codewordArr3[12] = m65668d[i6];
            codewordArr3[13] = codewordArr2[i6];
        }
        for (int i7 = 0; i7 < 14 && !m65687b(codeword, codewordArr3[i7]); i7++) {
        }
    }

    /* renamed from: f */
    private int m65683f() {
        m65682g();
        return m65681h() + m65680i();
    }

    /* renamed from: g */
    private void m65682g() {
        DetectionResultColumn[] detectionResultColumnArr = this.f44630b;
        DetectionResultColumn detectionResultColumn = detectionResultColumnArr[0];
        if (detectionResultColumn != null && detectionResultColumnArr[this.f44632d + 1] != null) {
            Codeword[] m65668d = detectionResultColumn.m65668d();
            Codeword[] m65668d2 = this.f44630b[this.f44632d + 1].m65668d();
            for (int i = 0; i < m65668d.length; i++) {
                Codeword codeword = m65668d[i];
                if (codeword != null && m65668d2[i] != null && codeword.m65703c() == m65668d2[i].m65703c()) {
                    for (int i2 = 1; i2 <= this.f44632d; i2++) {
                        Codeword codeword2 = this.f44630b[i2].m65668d()[i];
                        if (codeword2 != null) {
                            codeword2.m65697i(m65668d[i].m65703c());
                            if (!codeword2.m65699g()) {
                                this.f44630b[i2].m65668d()[i] = null;
                            }
                        }
                    }
                }
            }
        }
    }

    /* renamed from: h */
    private int m65681h() {
        DetectionResultColumn detectionResultColumn = this.f44630b[0];
        if (detectionResultColumn == null) {
            return 0;
        }
        Codeword[] m65668d = detectionResultColumn.m65668d();
        int i = 0;
        for (int i2 = 0; i2 < m65668d.length; i2++) {
            Codeword codeword = m65668d[i2];
            if (codeword != null) {
                int m65703c = codeword.m65703c();
                int i3 = 0;
                for (int i4 = 1; i4 < this.f44632d + 1 && i3 < 2; i4++) {
                    Codeword codeword2 = this.f44630b[i4].m65668d()[i2];
                    if (codeword2 != null) {
                        i3 = m65686c(m65703c, i3, codeword2);
                        if (!codeword2.m65699g()) {
                            i++;
                        }
                    }
                }
            }
        }
        return i;
    }

    /* renamed from: i */
    private int m65680i() {
        DetectionResultColumn[] detectionResultColumnArr = this.f44630b;
        int i = this.f44632d;
        if (detectionResultColumnArr[i + 1] == null) {
            return 0;
        }
        Codeword[] m65668d = detectionResultColumnArr[i + 1].m65668d();
        int i2 = 0;
        for (int i3 = 0; i3 < m65668d.length; i3++) {
            Codeword codeword = m65668d[i3];
            if (codeword != null) {
                int m65703c = codeword.m65703c();
                int i4 = 0;
                for (int i5 = this.f44632d + 1; i5 > 0 && i4 < 2; i5--) {
                    Codeword codeword2 = this.f44630b[i5].m65668d()[i3];
                    if (codeword2 != null) {
                        i4 = m65686c(m65703c, i4, codeword2);
                        if (!codeword2.m65699g()) {
                            i2++;
                        }
                    }
                }
            }
        }
        return i2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public int m65679j() {
        return this.f44632d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k */
    public int m65678k() {
        return this.f44629a.m65722b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: l */
    public int m65677l() {
        return this.f44629a.m65721c();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: m */
    public BoundingBox m65676m() {
        return this.f44631c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: n */
    public DetectionResultColumn m65675n(int i) {
        return this.f44630b[i];
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o */
    public DetectionResultColumn[] m65674o() {
        m65688a(this.f44630b[0]);
        m65688a(this.f44630b[this.f44632d + 1]);
        int i = PDF417Common.MAX_CODEWORDS_IN_BARCODE;
        while (true) {
            int m65685d = m65685d();
            if (m65685d <= 0 || m65685d >= i) {
                break;
            }
            i = m65685d;
        }
        return this.f44630b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: p */
    public void m65673p(BoundingBox boundingBox) {
        this.f44631c = boundingBox;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: q */
    public void m65672q(int i, DetectionResultColumn detectionResultColumn) {
        this.f44630b[i] = detectionResultColumn;
    }

    public String toString() {
        DetectionResultColumn[] detectionResultColumnArr = this.f44630b;
        DetectionResultColumn detectionResultColumn = detectionResultColumnArr[0];
        if (detectionResultColumn == null) {
            detectionResultColumn = detectionResultColumnArr[this.f44632d + 1];
        }
        Formatter formatter = new Formatter();
        for (int i = 0; i < detectionResultColumn.m65668d().length; i++) {
            try {
                formatter.format("CW %3d:", Integer.valueOf(i));
                for (int i2 = 0; i2 < this.f44632d + 2; i2++) {
                    DetectionResultColumn detectionResultColumn2 = this.f44630b[i2];
                    if (detectionResultColumn2 == null) {
                        formatter.format("    |   ", new Object[0]);
                    } else {
                        Codeword codeword = detectionResultColumn2.m65668d()[i];
                        if (codeword == null) {
                            formatter.format("    |   ", new Object[0]);
                        } else {
                            formatter.format(" %3d|%3d", Integer.valueOf(codeword.m65703c()), Integer.valueOf(codeword.m65701e()));
                        }
                    }
                }
                formatter.format("%n", new Object[0]);
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    try {
                        formatter.close();
                    } catch (Throwable th3) {
                        th.addSuppressed(th3);
                    }
                    throw th2;
                }
            }
        }
        String formatter2 = formatter.toString();
        formatter.close();
        return formatter2;
    }
}
