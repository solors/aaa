package com.google.zxing.pdf417.decoder;

import java.util.Formatter;

/* loaded from: classes5.dex */
class DetectionResultColumn {

    /* renamed from: a */
    private final BoundingBox f44633a;

    /* renamed from: b */
    private final Codeword[] f44634b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public DetectionResultColumn(BoundingBox boundingBox) {
        this.f44633a = new BoundingBox(boundingBox);
        this.f44634b = new Codeword[(boundingBox.m65711e() - boundingBox.m65709g()) + 1];
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final BoundingBox m65671a() {
        return this.f44633a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public final Codeword m65670b(int i) {
        return this.f44634b[m65667e(i)];
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public final Codeword m65669c(int i) {
        Codeword codeword;
        Codeword codeword2;
        Codeword m65670b = m65670b(i);
        if (m65670b != null) {
            return m65670b;
        }
        for (int i2 = 1; i2 < 5; i2++) {
            int m65667e = m65667e(i) - i2;
            if (m65667e >= 0 && (codeword2 = this.f44634b[m65667e]) != null) {
                return codeword2;
            }
            int m65667e2 = m65667e(i) + i2;
            Codeword[] codewordArr = this.f44634b;
            if (m65667e2 < codewordArr.length && (codeword = codewordArr[m65667e2]) != null) {
                return codeword;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public final Codeword[] m65668d() {
        return this.f44634b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public final int m65667e(int i) {
        return i - this.f44633a.m65709g();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public final void m65666f(int i, Codeword codeword) {
        this.f44634b[m65667e(i)] = codeword;
    }

    public String toString() {
        Codeword[] codewordArr;
        Formatter formatter = new Formatter();
        try {
            int i = 0;
            for (Codeword codeword : this.f44634b) {
                if (codeword == null) {
                    formatter.format("%3d:    |   %n", Integer.valueOf(i));
                    i++;
                } else {
                    formatter.format("%3d: %3d|%3d%n", Integer.valueOf(i), Integer.valueOf(codeword.m65703c()), Integer.valueOf(codeword.m65701e()));
                    i++;
                }
            }
            String formatter2 = formatter.toString();
            formatter.close();
            return formatter2;
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
}
