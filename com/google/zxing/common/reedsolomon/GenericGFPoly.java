package com.google.zxing.common.reedsolomon;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public final class GenericGFPoly {

    /* renamed from: a */
    private final GenericGF f44395a;

    /* renamed from: b */
    private final int[] f44396b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public GenericGFPoly(GenericGF genericGF, int[] iArr) {
        if (iArr.length != 0) {
            this.f44395a = genericGF;
            int length = iArr.length;
            if (length > 1 && iArr[0] == 0) {
                int i = 1;
                while (i < length && iArr[i] == 0) {
                    i++;
                }
                if (i == length) {
                    this.f44396b = new int[]{0};
                    return;
                }
                int[] iArr2 = new int[length - i];
                this.f44396b = iArr2;
                System.arraycopy(iArr, i, iArr2, 0, iArr2.length);
                return;
            }
            this.f44396b = iArr;
            return;
        }
        throw new IllegalArgumentException();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public GenericGFPoly m66003a(GenericGFPoly genericGFPoly) {
        if (this.f44395a.equals(genericGFPoly.f44395a)) {
            if (m65997g()) {
                return genericGFPoly;
            }
            if (genericGFPoly.m65997g()) {
                return this;
            }
            int[] iArr = this.f44396b;
            int[] iArr2 = genericGFPoly.f44396b;
            if (iArr.length <= iArr2.length) {
                iArr = iArr2;
                iArr2 = iArr;
            }
            int[] iArr3 = new int[iArr.length];
            int length = iArr.length - iArr2.length;
            System.arraycopy(iArr, 0, iArr3, 0, length);
            for (int i = length; i < iArr.length; i++) {
                iArr3[i] = GenericGF.m66011a(iArr2[i - length], iArr[i]);
            }
            return new GenericGFPoly(this.f44395a, iArr3);
        }
        throw new IllegalArgumentException("GenericGFPolys do not have same GenericGF field");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public GenericGFPoly[] m66002b(GenericGFPoly genericGFPoly) {
        if (this.f44395a.equals(genericGFPoly.f44395a)) {
            if (!genericGFPoly.m65997g()) {
                GenericGFPoly m66007e = this.f44395a.m66007e();
                int m66006f = this.f44395a.m66006f(genericGFPoly.m66000d(genericGFPoly.m65998f()));
                GenericGFPoly genericGFPoly2 = this;
                while (genericGFPoly2.m65998f() >= genericGFPoly.m65998f() && !genericGFPoly2.m65997g()) {
                    int m65998f = genericGFPoly2.m65998f() - genericGFPoly.m65998f();
                    int m66004h = this.f44395a.m66004h(genericGFPoly2.m66000d(genericGFPoly2.m65998f()), m66006f);
                    GenericGFPoly m65994j = genericGFPoly.m65994j(m65998f, m66004h);
                    m66007e = m66007e.m66003a(this.f44395a.m66010b(m65998f, m66004h));
                    genericGFPoly2 = genericGFPoly2.m66003a(m65994j);
                }
                return new GenericGFPoly[]{m66007e, genericGFPoly2};
            }
            throw new IllegalArgumentException("Divide by 0");
        }
        throw new IllegalArgumentException("GenericGFPolys do not have same GenericGF field");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public int m66001c(int i) {
        if (i == 0) {
            return m66000d(0);
        }
        if (i == 1) {
            int i2 = 0;
            for (int i3 : this.f44396b) {
                i2 = GenericGF.m66011a(i2, i3);
            }
            return i2;
        }
        int[] iArr = this.f44396b;
        int i4 = iArr[0];
        int length = iArr.length;
        for (int i5 = 1; i5 < length; i5++) {
            i4 = GenericGF.m66011a(this.f44395a.m66004h(i, i4), this.f44396b[i5]);
        }
        return i4;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public int m66000d(int i) {
        int[] iArr = this.f44396b;
        return iArr[(iArr.length - 1) - i];
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public int[] m65999e() {
        return this.f44396b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public int m65998f() {
        return this.f44396b.length - 1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public boolean m65997g() {
        if (this.f44396b[0] != 0) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public GenericGFPoly m65996h(int i) {
        if (i == 0) {
            return this.f44395a.m66007e();
        }
        if (i == 1) {
            return this;
        }
        int length = this.f44396b.length;
        int[] iArr = new int[length];
        for (int i2 = 0; i2 < length; i2++) {
            iArr[i2] = this.f44395a.m66004h(this.f44396b[i2], i);
        }
        return new GenericGFPoly(this.f44395a, iArr);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public GenericGFPoly m65995i(GenericGFPoly genericGFPoly) {
        if (this.f44395a.equals(genericGFPoly.f44395a)) {
            if (!m65997g() && !genericGFPoly.m65997g()) {
                int[] iArr = this.f44396b;
                int length = iArr.length;
                int[] iArr2 = genericGFPoly.f44396b;
                int length2 = iArr2.length;
                int[] iArr3 = new int[(length + length2) - 1];
                for (int i = 0; i < length; i++) {
                    int i2 = iArr[i];
                    for (int i3 = 0; i3 < length2; i3++) {
                        int i4 = i + i3;
                        iArr3[i4] = GenericGF.m66011a(iArr3[i4], this.f44395a.m66004h(i2, iArr2[i3]));
                    }
                }
                return new GenericGFPoly(this.f44395a, iArr3);
            }
            return this.f44395a.m66007e();
        }
        throw new IllegalArgumentException("GenericGFPolys do not have same GenericGF field");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public GenericGFPoly m65994j(int i, int i2) {
        if (i >= 0) {
            if (i2 == 0) {
                return this.f44395a.m66007e();
            }
            int length = this.f44396b.length;
            int[] iArr = new int[i + length];
            for (int i3 = 0; i3 < length; i3++) {
                iArr[i3] = this.f44395a.m66004h(this.f44396b[i3], i2);
            }
            return new GenericGFPoly(this.f44395a, iArr);
        }
        throw new IllegalArgumentException();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(m65998f() * 8);
        for (int m65998f = m65998f(); m65998f >= 0; m65998f--) {
            int m66000d = m66000d(m65998f);
            if (m66000d != 0) {
                if (m66000d < 0) {
                    sb2.append(" - ");
                    m66000d = -m66000d;
                } else if (sb2.length() > 0) {
                    sb2.append(" + ");
                }
                if (m65998f == 0 || m66000d != 1) {
                    int m66005g = this.f44395a.m66005g(m66000d);
                    if (m66005g == 0) {
                        sb2.append('1');
                    } else if (m66005g == 1) {
                        sb2.append('a');
                    } else {
                        sb2.append("a^");
                        sb2.append(m66005g);
                    }
                }
                if (m65998f != 0) {
                    if (m65998f == 1) {
                        sb2.append('x');
                    } else {
                        sb2.append("x^");
                        sb2.append(m65998f);
                    }
                }
            }
        }
        return sb2.toString();
    }
}
