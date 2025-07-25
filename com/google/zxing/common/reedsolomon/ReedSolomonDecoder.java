package com.google.zxing.common.reedsolomon;

/* loaded from: classes5.dex */
public final class ReedSolomonDecoder {

    /* renamed from: a */
    private final GenericGF f44397a;

    public ReedSolomonDecoder(GenericGF genericGF) {
        this.f44397a = genericGF;
    }

    /* renamed from: a */
    private int[] m65993a(GenericGFPoly genericGFPoly) throws ReedSolomonException {
        int m65998f = genericGFPoly.m65998f();
        int i = 0;
        if (m65998f == 1) {
            return new int[]{genericGFPoly.m66000d(1)};
        }
        int[] iArr = new int[m65998f];
        for (int i2 = 1; i2 < this.f44397a.getSize() && i < m65998f; i2++) {
            if (genericGFPoly.m66001c(i2) == 0) {
                iArr[i] = this.f44397a.m66006f(i2);
                i++;
            }
        }
        if (i == m65998f) {
            return iArr;
        }
        throw new ReedSolomonException("Error locator degree does not match number of roots");
    }

    /* renamed from: b */
    private int[] m65992b(GenericGFPoly genericGFPoly, int[] iArr) {
        int i;
        int length = iArr.length;
        int[] iArr2 = new int[length];
        for (int i2 = 0; i2 < length; i2++) {
            int m66006f = this.f44397a.m66006f(iArr[i2]);
            int i3 = 1;
            for (int i4 = 0; i4 < length; i4++) {
                if (i2 != i4) {
                    int m66004h = this.f44397a.m66004h(iArr[i4], m66006f);
                    if ((m66004h & 1) == 0) {
                        i = m66004h | 1;
                    } else {
                        i = m66004h & (-2);
                    }
                    i3 = this.f44397a.m66004h(i3, i);
                }
            }
            iArr2[i2] = this.f44397a.m66004h(genericGFPoly.m66001c(m66006f), this.f44397a.m66006f(i3));
            if (this.f44397a.getGeneratorBase() != 0) {
                iArr2[i2] = this.f44397a.m66004h(iArr2[i2], m66006f);
            }
        }
        return iArr2;
    }

    /* renamed from: c */
    private GenericGFPoly[] m65991c(GenericGFPoly genericGFPoly, GenericGFPoly genericGFPoly2, int i) throws ReedSolomonException {
        if (genericGFPoly.m65998f() < genericGFPoly2.m65998f()) {
            genericGFPoly2 = genericGFPoly;
            genericGFPoly = genericGFPoly2;
        }
        GenericGFPoly m66007e = this.f44397a.m66007e();
        GenericGFPoly m66008d = this.f44397a.m66008d();
        do {
            GenericGFPoly genericGFPoly3 = genericGFPoly2;
            genericGFPoly2 = genericGFPoly;
            genericGFPoly = genericGFPoly3;
            GenericGFPoly genericGFPoly4 = m66008d;
            GenericGFPoly genericGFPoly5 = m66007e;
            m66007e = genericGFPoly4;
            if (genericGFPoly.m65998f() >= i / 2) {
                if (!genericGFPoly.m65997g()) {
                    GenericGFPoly m66007e2 = this.f44397a.m66007e();
                    int m66006f = this.f44397a.m66006f(genericGFPoly.m66000d(genericGFPoly.m65998f()));
                    while (genericGFPoly2.m65998f() >= genericGFPoly.m65998f() && !genericGFPoly2.m65997g()) {
                        int m65998f = genericGFPoly2.m65998f() - genericGFPoly.m65998f();
                        int m66004h = this.f44397a.m66004h(genericGFPoly2.m66000d(genericGFPoly2.m65998f()), m66006f);
                        m66007e2 = m66007e2.m66003a(this.f44397a.m66010b(m65998f, m66004h));
                        genericGFPoly2 = genericGFPoly2.m66003a(genericGFPoly.m65994j(m65998f, m66004h));
                    }
                    m66008d = m66007e2.m65995i(m66007e).m66003a(genericGFPoly5);
                } else {
                    throw new ReedSolomonException("r_{i-1} was zero");
                }
            } else {
                int m66000d = m66007e.m66000d(0);
                if (m66000d != 0) {
                    int m66006f2 = this.f44397a.m66006f(m66000d);
                    return new GenericGFPoly[]{m66007e.m65996h(m66006f2), genericGFPoly.m65996h(m66006f2)};
                }
                throw new ReedSolomonException("sigmaTilde(0) was zero");
            }
        } while (genericGFPoly2.m65998f() < genericGFPoly.m65998f());
        throw new IllegalStateException("Division algorithm failed to reduce polynomial?");
    }

    public void decode(int[] iArr, int i) throws ReedSolomonException {
        GenericGFPoly genericGFPoly = new GenericGFPoly(this.f44397a, iArr);
        int[] iArr2 = new int[i];
        boolean z = true;
        for (int i2 = 0; i2 < i; i2++) {
            GenericGF genericGF = this.f44397a;
            int m66001c = genericGFPoly.m66001c(genericGF.m66009c(genericGF.getGeneratorBase() + i2));
            iArr2[(i - 1) - i2] = m66001c;
            if (m66001c != 0) {
                z = false;
            }
        }
        if (z) {
            return;
        }
        GenericGFPoly[] m65991c = m65991c(this.f44397a.m66010b(i, 1), new GenericGFPoly(this.f44397a, iArr2), i);
        GenericGFPoly genericGFPoly2 = m65991c[0];
        GenericGFPoly genericGFPoly3 = m65991c[1];
        int[] m65993a = m65993a(genericGFPoly2);
        int[] m65992b = m65992b(genericGFPoly3, m65993a);
        for (int i3 = 0; i3 < m65993a.length; i3++) {
            int length = (iArr.length - 1) - this.f44397a.m66005g(m65993a[i3]);
            if (length >= 0) {
                iArr[length] = GenericGF.m66011a(iArr[length], m65992b[i3]);
            } else {
                throw new ReedSolomonException("Bad error location");
            }
        }
    }
}
