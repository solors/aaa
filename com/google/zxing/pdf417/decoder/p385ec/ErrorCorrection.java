package com.google.zxing.pdf417.decoder.p385ec;

import com.google.zxing.ChecksumException;

/* renamed from: com.google.zxing.pdf417.decoder.ec.ErrorCorrection */
/* loaded from: classes5.dex */
public final class ErrorCorrection {

    /* renamed from: a */
    private final ModulusGF f44638a = ModulusGF.PDF417_GF;

    /* renamed from: a */
    private int[] m65631a(ModulusPoly modulusPoly) throws ChecksumException {
        int m65615d = modulusPoly.m65615d();
        int[] iArr = new int[m65615d];
        int i = 0;
        for (int i2 = 1; i2 < this.f44638a.m65624e() && i < m65615d; i2++) {
            if (modulusPoly.m65617b(i2) == 0) {
                iArr[i] = this.f44638a.m65622g(i2);
                i++;
            }
        }
        if (i == m65615d) {
            return iArr;
        }
        throw ChecksumException.getChecksumInstance();
    }

    /* renamed from: b */
    private int[] m65630b(ModulusPoly modulusPoly, ModulusPoly modulusPoly2, int[] iArr) {
        int m65615d = modulusPoly2.m65615d();
        int[] iArr2 = new int[m65615d];
        for (int i = 1; i <= m65615d; i++) {
            iArr2[m65615d - i] = this.f44638a.m65620i(i, modulusPoly2.m65616c(i));
        }
        ModulusPoly modulusPoly3 = new ModulusPoly(this.f44638a, iArr2);
        int length = iArr.length;
        int[] iArr3 = new int[length];
        for (int i2 = 0; i2 < length; i2++) {
            int m65622g = this.f44638a.m65622g(iArr[i2]);
            iArr3[i2] = this.f44638a.m65620i(this.f44638a.m65619j(0, modulusPoly.m65617b(m65622g)), this.f44638a.m65622g(modulusPoly3.m65617b(m65622g)));
        }
        return iArr3;
    }

    /* renamed from: c */
    private ModulusPoly[] m65629c(ModulusPoly modulusPoly, ModulusPoly modulusPoly2, int i) throws ChecksumException {
        if (modulusPoly.m65615d() < modulusPoly2.m65615d()) {
            modulusPoly2 = modulusPoly;
            modulusPoly = modulusPoly2;
        }
        ModulusPoly m65623f = this.f44638a.m65623f();
        ModulusPoly m65625d = this.f44638a.m65625d();
        while (true) {
            ModulusPoly modulusPoly3 = modulusPoly2;
            modulusPoly2 = modulusPoly;
            modulusPoly = modulusPoly3;
            ModulusPoly modulusPoly4 = m65625d;
            ModulusPoly modulusPoly5 = m65623f;
            m65623f = modulusPoly4;
            if (modulusPoly.m65615d() >= i / 2) {
                if (!modulusPoly.m65614e()) {
                    ModulusPoly m65623f2 = this.f44638a.m65623f();
                    int m65622g = this.f44638a.m65622g(modulusPoly.m65616c(modulusPoly.m65615d()));
                    while (modulusPoly2.m65615d() >= modulusPoly.m65615d() && !modulusPoly2.m65614e()) {
                        int m65615d = modulusPoly2.m65615d() - modulusPoly.m65615d();
                        int m65620i = this.f44638a.m65620i(modulusPoly2.m65616c(modulusPoly2.m65615d()), m65622g);
                        m65623f2 = m65623f2.m65618a(this.f44638a.m65627b(m65615d, m65620i));
                        modulusPoly2 = modulusPoly2.m65609j(modulusPoly.m65611h(m65615d, m65620i));
                    }
                    m65625d = m65623f2.m65612g(m65623f).m65609j(modulusPoly5).m65610i();
                } else {
                    throw ChecksumException.getChecksumInstance();
                }
            } else {
                int m65616c = m65623f.m65616c(0);
                if (m65616c != 0) {
                    int m65622g2 = this.f44638a.m65622g(m65616c);
                    return new ModulusPoly[]{m65623f.m65613f(m65622g2), modulusPoly.m65613f(m65622g2)};
                }
                throw ChecksumException.getChecksumInstance();
            }
        }
    }

    public int decode(int[] iArr, int i, int[] iArr2) throws ChecksumException {
        ModulusPoly modulusPoly = new ModulusPoly(this.f44638a, iArr);
        int[] iArr3 = new int[i];
        boolean z = false;
        for (int i2 = i; i2 > 0; i2--) {
            int m65617b = modulusPoly.m65617b(this.f44638a.m65626c(i2));
            iArr3[i - i2] = m65617b;
            if (m65617b != 0) {
                z = true;
            }
        }
        if (!z) {
            return 0;
        }
        ModulusPoly m65625d = this.f44638a.m65625d();
        if (iArr2 != null) {
            for (int i3 : iArr2) {
                int m65626c = this.f44638a.m65626c((iArr.length - 1) - i3);
                ModulusGF modulusGF = this.f44638a;
                m65625d = m65625d.m65612g(new ModulusPoly(modulusGF, new int[]{modulusGF.m65619j(0, m65626c), 1}));
            }
        }
        ModulusPoly[] m65629c = m65629c(this.f44638a.m65627b(i, 1), new ModulusPoly(this.f44638a, iArr3), i);
        ModulusPoly modulusPoly2 = m65629c[0];
        ModulusPoly modulusPoly3 = m65629c[1];
        int[] m65631a = m65631a(modulusPoly2);
        int[] m65630b = m65630b(modulusPoly3, modulusPoly2, m65631a);
        for (int i4 = 0; i4 < m65631a.length; i4++) {
            int length = (iArr.length - 1) - this.f44638a.m65621h(m65631a[i4]);
            if (length >= 0) {
                iArr[length] = this.f44638a.m65619j(iArr[length], m65630b[i4]);
            } else {
                throw ChecksumException.getChecksumInstance();
            }
        }
        return m65631a.length;
    }
}
