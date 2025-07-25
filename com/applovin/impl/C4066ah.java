package com.applovin.impl;

import com.applovin.exoplayer2.common.base.Charsets;
import java.nio.charset.Charset;
import java.util.Arrays;

/* renamed from: com.applovin.impl.ah */
/* loaded from: classes2.dex */
public final class C4066ah {

    /* renamed from: a */
    private byte[] f4711a;

    /* renamed from: b */
    private int f4712b;

    /* renamed from: c */
    private int f4713c;

    public C4066ah() {
        this.f4711a = AbstractC5863xp.f12156f;
    }

    /* renamed from: A */
    public int m100801A() {
        int m100775j = m100775j();
        if (m100775j >= 0) {
            return m100775j;
        }
        throw new IllegalStateException("Top bit not zero: " + m100775j);
    }

    /* renamed from: B */
    public long m100800B() {
        long m100766s = m100766s();
        if (m100766s >= 0) {
            return m100766s;
        }
        throw new IllegalStateException("Top bit not zero: " + m100766s);
    }

    /* renamed from: C */
    public int m100799C() {
        byte[] bArr = this.f4711a;
        int i = this.f4712b;
        this.f4712b = i + 2;
        return (bArr[i + 1] & 255) | ((bArr[i] & 255) << 8);
    }

    /* renamed from: D */
    public long m100798D() {
        int i;
        int i2;
        byte b;
        int i3;
        long j = this.f4711a[this.f4712b];
        int i4 = 7;
        while (true) {
            if (i4 < 0) {
                break;
            }
            if (((1 << i4) & j) != 0) {
                i4--;
            } else if (i4 < 6) {
                j &= i3 - 1;
                i2 = 7 - i4;
            } else if (i4 == 7) {
                i2 = 1;
            }
        }
        i2 = 0;
        if (i2 != 0) {
            for (i = 1; i < i2; i++) {
                if ((this.f4711a[this.f4712b + i] & 192) == 128) {
                    j = (j << 6) | (b & 63);
                } else {
                    throw new NumberFormatException("Invalid UTF-8 sequence continuation byte: " + j);
                }
            }
            this.f4712b += i2;
            return j;
        }
        throw new NumberFormatException("Invalid UTF-8 sequence first byte: " + j);
    }

    /* renamed from: a */
    public int m100797a() {
        return this.f4713c - this.f4712b;
    }

    /* renamed from: b */
    public int m100789b() {
        return this.f4711a.length;
    }

    /* renamed from: c */
    public byte[] m100787c() {
        return this.f4711a;
    }

    /* renamed from: d */
    public int m100785d() {
        return this.f4712b;
    }

    /* renamed from: e */
    public int m100783e() {
        return this.f4713c;
    }

    /* renamed from: f */
    public char m100781f() {
        byte[] bArr = this.f4711a;
        int i = this.f4712b;
        return (char) ((bArr[i + 1] & 255) | ((bArr[i] & 255) << 8));
    }

    /* renamed from: g */
    public int m100779g() {
        return this.f4711a[this.f4712b] & 255;
    }

    /* renamed from: h */
    public double m100777h() {
        return Double.longBitsToDouble(m100766s());
    }

    /* renamed from: i */
    public float m100776i() {
        return Float.intBitsToFloat(m100775j());
    }

    /* renamed from: j */
    public int m100775j() {
        byte[] bArr = this.f4711a;
        int i = this.f4712b;
        int i2 = ((bArr[i + 1] & 255) << 16) | ((bArr[i] & 255) << 24);
        this.f4712b = i + 4;
        return (bArr[i + 3] & 255) | i2 | ((bArr[i + 2] & 255) << 8);
    }

    /* renamed from: k */
    public int m100774k() {
        byte[] bArr = this.f4711a;
        int i = this.f4712b;
        int i2 = (bArr[i + 1] & 255) << 8;
        this.f4712b = i + 3;
        return (bArr[i + 2] & 255) | i2 | (((bArr[i] & 255) << 24) >> 8);
    }

    /* renamed from: l */
    public String m100773l() {
        if (m100797a() == 0) {
            return null;
        }
        int i = this.f4712b;
        while (i < this.f4713c && !AbstractC5863xp.m92958h(this.f4711a[i])) {
            i++;
        }
        int i2 = this.f4712b;
        if (i - i2 >= 3) {
            byte[] bArr = this.f4711a;
            if (bArr[i2] == -17 && bArr[i2 + 1] == -69 && bArr[i2 + 2] == -65) {
                this.f4712b = i2 + 3;
            }
        }
        byte[] bArr2 = this.f4711a;
        int i3 = this.f4712b;
        String m93006a = AbstractC5863xp.m93006a(bArr2, i3, i - i3);
        this.f4712b = i;
        int i4 = this.f4713c;
        if (i == i4) {
            return m93006a;
        }
        byte[] bArr3 = this.f4711a;
        if (bArr3[i] == 13) {
            int i5 = i + 1;
            this.f4712b = i5;
            if (i5 == i4) {
                return m93006a;
            }
        }
        int i6 = this.f4712b;
        if (bArr3[i6] == 10) {
            this.f4712b = i6 + 1;
        }
        return m93006a;
    }

    /* renamed from: m */
    public int m100772m() {
        byte[] bArr = this.f4711a;
        int i = this.f4712b;
        int i2 = ((bArr[i + 1] & 255) << 8) | (bArr[i] & 255);
        this.f4712b = i + 4;
        return ((bArr[i + 3] & 255) << 24) | i2 | ((bArr[i + 2] & 255) << 16);
    }

    /* renamed from: n */
    public long m100771n() {
        byte[] bArr = this.f4711a;
        int i = this.f4712b;
        long j = (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40);
        this.f4712b = i + 8;
        return ((bArr[i + 7] & 255) << 56) | j | ((bArr[i + 6] & 255) << 48);
    }

    /* renamed from: o */
    public short m100770o() {
        byte[] bArr = this.f4711a;
        int i = this.f4712b;
        this.f4712b = i + 2;
        return (short) (((bArr[i + 1] & 255) << 8) | (bArr[i] & 255));
    }

    /* renamed from: p */
    public long m100769p() {
        byte[] bArr = this.f4711a;
        int i = this.f4712b;
        this.f4712b = i + 4;
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    /* renamed from: q */
    public int m100768q() {
        int m100772m = m100772m();
        if (m100772m >= 0) {
            return m100772m;
        }
        throw new IllegalStateException("Top bit not zero: " + m100772m);
    }

    /* renamed from: r */
    public int m100767r() {
        byte[] bArr = this.f4711a;
        int i = this.f4712b;
        this.f4712b = i + 2;
        return ((bArr[i + 1] & 255) << 8) | (bArr[i] & 255);
    }

    /* renamed from: s */
    public long m100766s() {
        byte[] bArr = this.f4711a;
        int i = this.f4712b;
        long j = ((bArr[i] & 255) << 56) | ((bArr[i + 1] & 255) << 48) | ((bArr[i + 2] & 255) << 40) | ((bArr[i + 3] & 255) << 32) | ((bArr[i + 4] & 255) << 24);
        this.f4712b = i + 8;
        return (bArr[i + 7] & 255) | j | ((bArr[i + 5] & 255) << 16) | ((bArr[i + 6] & 255) << 8);
    }

    /* renamed from: t */
    public String m100765t() {
        return m100796a((char) 0);
    }

    /* renamed from: u */
    public short m100764u() {
        byte[] bArr = this.f4711a;
        int i = this.f4712b;
        this.f4712b = i + 2;
        return (short) ((bArr[i + 1] & 255) | ((bArr[i] & 255) << 8));
    }

    /* renamed from: v */
    public int m100763v() {
        return (m100762w() << 21) | (m100762w() << 14) | (m100762w() << 7) | m100762w();
    }

    /* renamed from: w */
    public int m100762w() {
        byte[] bArr = this.f4711a;
        int i = this.f4712b;
        this.f4712b = i + 1;
        return bArr[i] & 255;
    }

    /* renamed from: x */
    public int m100761x() {
        byte[] bArr = this.f4711a;
        int i = this.f4712b;
        int i2 = (bArr[i + 1] & 255) | ((bArr[i] & 255) << 8);
        this.f4712b = i + 4;
        return i2;
    }

    /* renamed from: y */
    public long m100760y() {
        byte[] bArr = this.f4711a;
        int i = this.f4712b;
        this.f4712b = i + 4;
        return (bArr[i + 3] & 255) | ((bArr[i] & 255) << 24) | ((bArr[i + 1] & 255) << 16) | ((bArr[i + 2] & 255) << 8);
    }

    /* renamed from: z */
    public int m100759z() {
        byte[] bArr = this.f4711a;
        int i = this.f4712b;
        int i2 = (bArr[i + 1] & 255) << 8;
        this.f4712b = i + 3;
        return (bArr[i + 2] & 255) | i2 | ((bArr[i] & 255) << 16);
    }

    /* renamed from: a */
    public void m100795a(int i) {
        if (i > m100789b()) {
            this.f4711a = Arrays.copyOf(this.f4711a, i);
        }
    }

    /* renamed from: b */
    public String m100788b(int i) {
        if (i == 0) {
            return "";
        }
        int i2 = this.f4712b;
        int i3 = (i2 + i) - 1;
        String m93006a = AbstractC5863xp.m93006a(this.f4711a, i2, (i3 >= this.f4713c || this.f4711a[i3] != 0) ? i : i - 1);
        this.f4712b += i;
        return m93006a;
    }

    /* renamed from: c */
    public String m100786c(int i) {
        return m100794a(i, Charsets.UTF_8);
    }

    /* renamed from: d */
    public void m100784d(int i) {
        m100791a(m100789b() < i ? new byte[i] : this.f4711a, i);
    }

    /* renamed from: e */
    public void m100782e(int i) {
        AbstractC4100b1.m100580a(i >= 0 && i <= this.f4711a.length);
        this.f4713c = i;
    }

    /* renamed from: f */
    public void m100780f(int i) {
        AbstractC4100b1.m100580a(i >= 0 && i <= this.f4713c);
        this.f4712b = i;
    }

    /* renamed from: g */
    public void m100778g(int i) {
        m100780f(this.f4712b + i);
    }

    public C4066ah(int i) {
        this.f4711a = new byte[i];
        this.f4713c = i;
    }

    /* renamed from: a */
    public void m100793a(C5971zg c5971zg, int i) {
        m100790a(c5971zg.f12566a, 0, i);
        c5971zg.m92392c(0);
    }

    public C4066ah(byte[] bArr) {
        this.f4711a = bArr;
        this.f4713c = bArr.length;
    }

    /* renamed from: a */
    public void m100790a(byte[] bArr, int i, int i2) {
        System.arraycopy(this.f4711a, this.f4712b, bArr, i, i2);
        this.f4712b += i2;
    }

    /* renamed from: a */
    public String m100796a(char c) {
        if (m100797a() == 0) {
            return null;
        }
        int i = this.f4712b;
        while (i < this.f4713c && this.f4711a[i] != c) {
            i++;
        }
        byte[] bArr = this.f4711a;
        int i2 = this.f4712b;
        String m93006a = AbstractC5863xp.m93006a(bArr, i2, i - i2);
        this.f4712b = i;
        if (i < this.f4713c) {
            this.f4712b = i + 1;
        }
        return m93006a;
    }

    public C4066ah(byte[] bArr, int i) {
        this.f4711a = bArr;
        this.f4713c = i;
    }

    /* renamed from: a */
    public void m100792a(byte[] bArr) {
        m100791a(bArr, bArr.length);
    }

    /* renamed from: a */
    public void m100791a(byte[] bArr, int i) {
        this.f4711a = bArr;
        this.f4713c = i;
        this.f4712b = 0;
    }

    /* renamed from: a */
    public String m100794a(int i, Charset charset) {
        String str = new String(this.f4711a, this.f4712b, i, charset);
        this.f4712b += i;
        return str;
    }
}
