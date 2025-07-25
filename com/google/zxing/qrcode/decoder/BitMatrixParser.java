package com.google.zxing.qrcode.decoder;

import com.google.zxing.FormatException;
import com.google.zxing.common.BitMatrix;

/* loaded from: classes5.dex */
final class BitMatrixParser {

    /* renamed from: a */
    private final BitMatrix f44681a;

    /* renamed from: b */
    private Version f44682b;

    /* renamed from: c */
    private FormatInformation f44683c;

    /* renamed from: d */
    private boolean f44684d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public BitMatrixParser(BitMatrix bitMatrix) throws FormatException {
        int height = bitMatrix.getHeight();
        if (height >= 21 && (height & 3) == 1) {
            this.f44681a = bitMatrix;
            return;
        }
        throw FormatException.getFormatInstance();
    }

    /* renamed from: a */
    private int m65572a(int i, int i2, int i3) {
        boolean z;
        if (this.f44684d) {
            z = this.f44681a.get(i2, i);
        } else {
            z = this.f44681a.get(i, i2);
        }
        if (z) {
            return (i3 << 1) | 1;
        }
        return i3 << 1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public void m65571b() {
        int i = 0;
        while (i < this.f44681a.getWidth()) {
            int i2 = i + 1;
            for (int i3 = i2; i3 < this.f44681a.getHeight(); i3++) {
                if (this.f44681a.get(i, i3) != this.f44681a.get(i3, i)) {
                    this.f44681a.flip(i3, i);
                    this.f44681a.flip(i, i3);
                }
            }
            i = i2;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public byte[] m65570c() throws FormatException {
        int i;
        FormatInformation m65569d = m65569d();
        Version m65568e = m65568e();
        DataMask dataMask = DataMask.values()[m65569d.m65548c()];
        int height = this.f44681a.getHeight();
        dataMask.m65562c(this.f44681a, height);
        BitMatrix m65545a = m65568e.m65545a();
        byte[] bArr = new byte[m65568e.getTotalCodewords()];
        int i2 = height - 1;
        boolean z = true;
        int i3 = i2;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        while (i3 > 0) {
            if (i3 == 6) {
                i3--;
            }
            for (int i7 = 0; i7 < height; i7++) {
                if (z) {
                    i = i2 - i7;
                } else {
                    i = i7;
                }
                for (int i8 = 0; i8 < 2; i8++) {
                    int i9 = i3 - i8;
                    if (!m65545a.get(i9, i)) {
                        i5++;
                        i6 <<= 1;
                        if (this.f44681a.get(i9, i)) {
                            i6 |= 1;
                        }
                        if (i5 == 8) {
                            bArr[i4] = (byte) i6;
                            i4++;
                            i5 = 0;
                            i6 = 0;
                        }
                    }
                }
            }
            z = !z;
            i3 -= 2;
        }
        if (i4 == m65568e.getTotalCodewords()) {
            return bArr;
        }
        throw FormatException.getFormatInstance();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public FormatInformation m65569d() throws FormatException {
        FormatInformation formatInformation = this.f44683c;
        if (formatInformation != null) {
            return formatInformation;
        }
        int i = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < 6; i3++) {
            i2 = m65572a(i3, 8, i2);
        }
        int m65572a = m65572a(8, 7, m65572a(8, 8, m65572a(7, 8, i2)));
        for (int i4 = 5; i4 >= 0; i4--) {
            m65572a = m65572a(8, i4, m65572a);
        }
        int height = this.f44681a.getHeight();
        int i5 = height - 7;
        for (int i6 = height - 1; i6 >= i5; i6--) {
            i = m65572a(8, i6, i);
        }
        for (int i7 = height - 8; i7 < height; i7++) {
            i = m65572a(i7, 8, i);
        }
        FormatInformation m65550a = FormatInformation.m65550a(m65572a, i);
        this.f44683c = m65550a;
        if (m65550a != null) {
            return m65550a;
        }
        throw FormatException.getFormatInstance();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public Version m65568e() throws FormatException {
        Version version = this.f44682b;
        if (version != null) {
            return version;
        }
        int height = this.f44681a.getHeight();
        int i = (height - 17) / 4;
        if (i <= 6) {
            return Version.getVersionForNumber(i);
        }
        int i2 = height - 11;
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 5; i5 >= 0; i5--) {
            for (int i6 = height - 9; i6 >= i2; i6--) {
                i4 = m65572a(i6, i5, i4);
            }
        }
        Version m65543c = Version.m65543c(i4);
        if (m65543c != null && m65543c.getDimensionForVersion() == height) {
            this.f44682b = m65543c;
            return m65543c;
        }
        for (int i7 = 5; i7 >= 0; i7--) {
            for (int i8 = height - 9; i8 >= i2; i8--) {
                i3 = m65572a(i7, i8, i3);
            }
        }
        Version m65543c2 = Version.m65543c(i3);
        if (m65543c2 != null && m65543c2.getDimensionForVersion() == height) {
            this.f44682b = m65543c2;
            return m65543c2;
        }
        throw FormatException.getFormatInstance();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public void m65567f() {
        if (this.f44683c == null) {
            return;
        }
        DataMask.values()[this.f44683c.m65548c()].m65562c(this.f44681a, this.f44681a.getHeight());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public void m65566g(boolean z) {
        this.f44682b = null;
        this.f44683c = null;
        this.f44684d = z;
    }
}
