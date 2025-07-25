package com.google.zxing.pdf417.decoder;

import com.google.zxing.ResultPoint;

/* loaded from: classes5.dex */
final class DetectionResultRowIndicatorColumn extends DetectionResultColumn {

    /* renamed from: c */
    private final boolean f44635c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public DetectionResultRowIndicatorColumn(BoundingBox boundingBox, boolean z) {
        super(boundingBox);
        this.f44635c = z;
    }

    /* renamed from: h */
    private void m65664h(BarcodeMetadata barcodeMetadata) {
        ResultPoint m65707i;
        ResultPoint m65713c;
        BoundingBox m65671a = m65671a();
        if (this.f44635c) {
            m65707i = m65671a.m65708h();
        } else {
            m65707i = m65671a.m65707i();
        }
        if (this.f44635c) {
            m65713c = m65671a.m65714b();
        } else {
            m65713c = m65671a.m65713c();
        }
        int m65667e = m65667e((int) m65713c.getY());
        Codeword[] m65668d = m65668d();
        int i = -1;
        int i2 = 0;
        int i3 = 1;
        for (int m65667e2 = m65667e((int) m65707i.getY()); m65667e2 < m65667e; m65667e2++) {
            Codeword codeword = m65668d[m65667e2];
            if (codeword != null) {
                codeword.m65696j();
                int m65703c = codeword.m65703c() - i;
                if (m65703c == 0) {
                    i2++;
                } else {
                    if (m65703c == 1) {
                        i3 = Math.max(i3, i2);
                        i = codeword.m65703c();
                    } else if (codeword.m65703c() >= barcodeMetadata.m65721c()) {
                        m65668d[m65667e2] = null;
                    } else {
                        i = codeword.m65703c();
                    }
                    i2 = 1;
                }
            }
        }
    }

    /* renamed from: l */
    private void m65660l(Codeword[] codewordArr, BarcodeMetadata barcodeMetadata) {
        for (int i = 0; i < codewordArr.length; i++) {
            Codeword codeword = codewordArr[i];
            if (codeword != null) {
                int m65701e = codeword.m65701e() % 30;
                int m65703c = codeword.m65703c();
                if (m65703c > barcodeMetadata.m65721c()) {
                    codewordArr[i] = null;
                } else {
                    if (!this.f44635c) {
                        m65703c += 2;
                    }
                    int i2 = m65703c % 3;
                    if (i2 != 0) {
                        if (i2 != 1) {
                            if (i2 == 2 && m65701e + 1 != barcodeMetadata.m65723a()) {
                                codewordArr[i] = null;
                            }
                        } else if (m65701e / 3 != barcodeMetadata.m65722b() || m65701e % 3 != barcodeMetadata.m65720d()) {
                            codewordArr[i] = null;
                        }
                    } else if ((m65701e * 3) + 1 != barcodeMetadata.m65719e()) {
                        codewordArr[i] = null;
                    }
                }
            }
        }
    }

    /* renamed from: m */
    private void m65659m() {
        Codeword[] m65668d;
        for (Codeword codeword : m65668d()) {
            if (codeword != null) {
                codeword.m65696j();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public void m65665g(BarcodeMetadata barcodeMetadata) {
        ResultPoint m65707i;
        ResultPoint m65713c;
        boolean z;
        Codeword[] m65668d = m65668d();
        m65659m();
        m65660l(m65668d, barcodeMetadata);
        BoundingBox m65671a = m65671a();
        if (this.f44635c) {
            m65707i = m65671a.m65708h();
        } else {
            m65707i = m65671a.m65707i();
        }
        if (this.f44635c) {
            m65713c = m65671a.m65714b();
        } else {
            m65713c = m65671a.m65713c();
        }
        int m65667e = m65667e((int) m65713c.getY());
        int i = -1;
        int i2 = 0;
        int i3 = 1;
        for (int m65667e2 = m65667e((int) m65707i.getY()); m65667e2 < m65667e; m65667e2++) {
            Codeword codeword = m65668d[m65667e2];
            if (codeword != null) {
                int m65703c = codeword.m65703c() - i;
                if (m65703c == 0) {
                    i2++;
                } else {
                    if (m65703c == 1) {
                        i3 = Math.max(i3, i2);
                        i = codeword.m65703c();
                    } else if (m65703c >= 0 && codeword.m65703c() < barcodeMetadata.m65721c() && m65703c <= m65667e2) {
                        if (i3 > 2) {
                            m65703c *= i3 - 2;
                        }
                        if (m65703c >= m65667e2) {
                            z = true;
                        } else {
                            z = false;
                        }
                        for (int i4 = 1; i4 <= m65703c && !z; i4++) {
                            if (m65668d[m65667e2 - i4] != null) {
                                z = true;
                            } else {
                                z = false;
                            }
                        }
                        if (z) {
                            m65668d[m65667e2] = null;
                        } else {
                            i = codeword.m65703c();
                        }
                    } else {
                        m65668d[m65667e2] = null;
                    }
                    i2 = 1;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public BarcodeMetadata m65663i() {
        Codeword[] m65668d = m65668d();
        BarcodeValue barcodeValue = new BarcodeValue();
        BarcodeValue barcodeValue2 = new BarcodeValue();
        BarcodeValue barcodeValue3 = new BarcodeValue();
        BarcodeValue barcodeValue4 = new BarcodeValue();
        for (Codeword codeword : m65668d) {
            if (codeword != null) {
                codeword.m65696j();
                int m65701e = codeword.m65701e() % 30;
                int m65703c = codeword.m65703c();
                if (!this.f44635c) {
                    m65703c += 2;
                }
                int i = m65703c % 3;
                if (i != 0) {
                    if (i != 1) {
                        if (i == 2) {
                            barcodeValue.m65716c(m65701e + 1);
                        }
                    } else {
                        barcodeValue4.m65716c(m65701e / 3);
                        barcodeValue3.m65716c(m65701e % 3);
                    }
                } else {
                    barcodeValue2.m65716c((m65701e * 3) + 1);
                }
            }
        }
        if (barcodeValue.m65717b().length != 0 && barcodeValue2.m65717b().length != 0 && barcodeValue3.m65717b().length != 0 && barcodeValue4.m65717b().length != 0 && barcodeValue.m65717b()[0] > 0 && barcodeValue2.m65717b()[0] + barcodeValue3.m65717b()[0] >= 3 && barcodeValue2.m65717b()[0] + barcodeValue3.m65717b()[0] <= 90) {
            BarcodeMetadata barcodeMetadata = new BarcodeMetadata(barcodeValue.m65717b()[0], barcodeValue2.m65717b()[0], barcodeValue3.m65717b()[0], barcodeValue4.m65717b()[0]);
            m65660l(m65668d, barcodeMetadata);
            return barcodeMetadata;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public int[] m65662j() {
        Codeword[] m65668d;
        int m65703c;
        BarcodeMetadata m65663i = m65663i();
        if (m65663i == null) {
            return null;
        }
        m65664h(m65663i);
        int m65721c = m65663i.m65721c();
        int[] iArr = new int[m65721c];
        for (Codeword codeword : m65668d()) {
            if (codeword != null && (m65703c = codeword.m65703c()) < m65721c) {
                iArr[m65703c] = iArr[m65703c] + 1;
            }
        }
        return iArr;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k */
    public boolean m65661k() {
        return this.f44635c;
    }

    @Override // com.google.zxing.pdf417.decoder.DetectionResultColumn
    public String toString() {
        return "IsLeft: " + this.f44635c + '\n' + super.toString();
    }
}
