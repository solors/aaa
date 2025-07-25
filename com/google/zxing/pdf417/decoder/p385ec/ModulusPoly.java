package com.google.zxing.pdf417.decoder.p385ec;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.zxing.pdf417.decoder.ec.ModulusPoly */
/* loaded from: classes5.dex */
public final class ModulusPoly {

    /* renamed from: a */
    private final ModulusGF f44644a;

    /* renamed from: b */
    private final int[] f44645b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ModulusPoly(ModulusGF modulusGF, int[] iArr) {
        if (iArr.length != 0) {
            this.f44644a = modulusGF;
            int length = iArr.length;
            if (length > 1 && iArr[0] == 0) {
                int i = 1;
                while (i < length && iArr[i] == 0) {
                    i++;
                }
                if (i == length) {
                    this.f44645b = new int[]{0};
                    return;
                }
                int[] iArr2 = new int[length - i];
                this.f44645b = iArr2;
                System.arraycopy(iArr, i, iArr2, 0, iArr2.length);
                return;
            }
            this.f44645b = iArr;
            return;
        }
        throw new IllegalArgumentException();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public ModulusPoly m65618a(ModulusPoly modulusPoly) {
        if (this.f44644a.equals(modulusPoly.f44644a)) {
            if (m65614e()) {
                return modulusPoly;
            }
            if (modulusPoly.m65614e()) {
                return this;
            }
            int[] iArr = this.f44645b;
            int[] iArr2 = modulusPoly.f44645b;
            if (iArr.length <= iArr2.length) {
                iArr = iArr2;
                iArr2 = iArr;
            }
            int[] iArr3 = new int[iArr.length];
            int length = iArr.length - iArr2.length;
            System.arraycopy(iArr, 0, iArr3, 0, length);
            for (int i = length; i < iArr.length; i++) {
                iArr3[i] = this.f44644a.m65628a(iArr2[i - length], iArr[i]);
            }
            return new ModulusPoly(this.f44644a, iArr3);
        }
        throw new IllegalArgumentException("ModulusPolys do not have same ModulusGF field");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public int m65617b(int i) {
        if (i == 0) {
            return m65616c(0);
        }
        if (i == 1) {
            int i2 = 0;
            for (int i3 : this.f44645b) {
                i2 = this.f44644a.m65628a(i2, i3);
            }
            return i2;
        }
        int[] iArr = this.f44645b;
        int i4 = iArr[0];
        int length = iArr.length;
        for (int i5 = 1; i5 < length; i5++) {
            ModulusGF modulusGF = this.f44644a;
            i4 = modulusGF.m65628a(modulusGF.m65620i(i, i4), this.f44645b[i5]);
        }
        return i4;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public int m65616c(int i) {
        int[] iArr = this.f44645b;
        return iArr[(iArr.length - 1) - i];
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public int m65615d() {
        return this.f44645b.length - 1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public boolean m65614e() {
        if (this.f44645b[0] != 0) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public ModulusPoly m65613f(int i) {
        if (i == 0) {
            return this.f44644a.m65623f();
        }
        if (i == 1) {
            return this;
        }
        int length = this.f44645b.length;
        int[] iArr = new int[length];
        for (int i2 = 0; i2 < length; i2++) {
            iArr[i2] = this.f44644a.m65620i(this.f44645b[i2], i);
        }
        return new ModulusPoly(this.f44644a, iArr);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public ModulusPoly m65612g(ModulusPoly modulusPoly) {
        if (this.f44644a.equals(modulusPoly.f44644a)) {
            if (!m65614e() && !modulusPoly.m65614e()) {
                int[] iArr = this.f44645b;
                int length = iArr.length;
                int[] iArr2 = modulusPoly.f44645b;
                int length2 = iArr2.length;
                int[] iArr3 = new int[(length + length2) - 1];
                for (int i = 0; i < length; i++) {
                    int i2 = iArr[i];
                    for (int i3 = 0; i3 < length2; i3++) {
                        int i4 = i + i3;
                        ModulusGF modulusGF = this.f44644a;
                        iArr3[i4] = modulusGF.m65628a(iArr3[i4], modulusGF.m65620i(i2, iArr2[i3]));
                    }
                }
                return new ModulusPoly(this.f44644a, iArr3);
            }
            return this.f44644a.m65623f();
        }
        throw new IllegalArgumentException("ModulusPolys do not have same ModulusGF field");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public ModulusPoly m65611h(int i, int i2) {
        if (i >= 0) {
            if (i2 == 0) {
                return this.f44644a.m65623f();
            }
            int length = this.f44645b.length;
            int[] iArr = new int[i + length];
            for (int i3 = 0; i3 < length; i3++) {
                iArr[i3] = this.f44644a.m65620i(this.f44645b[i3], i2);
            }
            return new ModulusPoly(this.f44644a, iArr);
        }
        throw new IllegalArgumentException();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public ModulusPoly m65610i() {
        int length = this.f44645b.length;
        int[] iArr = new int[length];
        for (int i = 0; i < length; i++) {
            iArr[i] = this.f44644a.m65619j(0, this.f44645b[i]);
        }
        return new ModulusPoly(this.f44644a, iArr);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public ModulusPoly m65609j(ModulusPoly modulusPoly) {
        if (this.f44644a.equals(modulusPoly.f44644a)) {
            if (modulusPoly.m65614e()) {
                return this;
            }
            return m65618a(modulusPoly.m65610i());
        }
        throw new IllegalArgumentException("ModulusPolys do not have same ModulusGF field");
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(m65615d() * 8);
        for (int m65615d = m65615d(); m65615d >= 0; m65615d--) {
            int m65616c = m65616c(m65615d);
            if (m65616c != 0) {
                if (m65616c < 0) {
                    sb2.append(" - ");
                    m65616c = -m65616c;
                } else if (sb2.length() > 0) {
                    sb2.append(" + ");
                }
                if (m65615d == 0 || m65616c != 1) {
                    sb2.append(m65616c);
                }
                if (m65615d != 0) {
                    if (m65615d == 1) {
                        sb2.append('x');
                    } else {
                        sb2.append("x^");
                        sb2.append(m65615d);
                    }
                }
            }
        }
        return sb2.toString();
    }
}
