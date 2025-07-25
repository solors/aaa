package com.applovin.impl;

import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.Arrays;

/* renamed from: com.applovin.impl.a6 */
/* loaded from: classes2.dex */
public final class C3992a6 implements InterfaceC4703k8 {

    /* renamed from: b */
    private final InterfaceC4379f5 f4524b;

    /* renamed from: c */
    private final long f4525c;

    /* renamed from: d */
    private long f4526d;

    /* renamed from: f */
    private int f4528f;

    /* renamed from: g */
    private int f4529g;

    /* renamed from: e */
    private byte[] f4527e = new byte[65536];

    /* renamed from: a */
    private final byte[] f4523a = new byte[4096];

    public C3992a6(InterfaceC4379f5 interfaceC4379f5, long j, long j2) {
        this.f4524b = interfaceC4379f5;
        this.f4526d = j;
        this.f4525c = j2;
    }

    /* renamed from: d */
    private void m101029d(int i) {
        if (i != -1) {
            this.f4526d += i;
        }
    }

    /* renamed from: e */
    private void m101028e(int i) {
        int i2 = this.f4528f + i;
        byte[] bArr = this.f4527e;
        if (i2 > bArr.length) {
            this.f4527e = Arrays.copyOf(this.f4527e, AbstractC5863xp.m93039a(bArr.length * 2, 65536 + i2, i2 + 524288));
        }
    }

    /* renamed from: g */
    private void m101025g(int i) {
        byte[] bArr;
        int i2 = this.f4529g - i;
        this.f4529g = i2;
        this.f4528f = 0;
        byte[] bArr2 = this.f4527e;
        if (i2 < bArr2.length - 524288) {
            bArr = new byte[65536 + i2];
        } else {
            bArr = bArr2;
        }
        System.arraycopy(bArr2, i, bArr, 0, i2);
        this.f4527e = bArr;
    }

    @Override // com.applovin.impl.InterfaceC4703k8
    /* renamed from: a */
    public boolean mo98009a(int i, boolean z) {
        m101028e(i);
        int i2 = this.f4529g - this.f4528f;
        while (i2 < i) {
            i2 = m101031a(this.f4527e, this.f4528f, i, i2, z);
            if (i2 == -1) {
                return false;
            }
            this.f4529g = this.f4528f + i2;
        }
        this.f4528f += i;
        return true;
    }

    @Override // com.applovin.impl.InterfaceC4703k8
    /* renamed from: b */
    public int mo98005b(byte[] bArr, int i, int i2) {
        int min;
        m101028e(i2);
        int i3 = this.f4529g;
        int i4 = this.f4528f;
        int i5 = i3 - i4;
        if (i5 == 0) {
            min = m101031a(this.f4527e, i4, i2, 0, true);
            if (min == -1) {
                return -1;
            }
            this.f4529g += min;
        } else {
            min = Math.min(i2, i5);
        }
        System.arraycopy(this.f4527e, this.f4528f, bArr, i, min);
        this.f4528f += min;
        return min;
    }

    @Override // com.applovin.impl.InterfaceC4703k8
    /* renamed from: c */
    public void mo98003c(int i) {
        mo98009a(i, false);
    }

    @Override // com.applovin.impl.InterfaceC4703k8
    /* renamed from: f */
    public long mo97999f() {
        return this.f4526d;
    }

    /* renamed from: f */
    private int m101026f(int i) {
        int min = Math.min(this.f4529g, i);
        m101025g(min);
        return min;
    }

    @Override // com.applovin.impl.InterfaceC4703k8
    /* renamed from: c */
    public void mo98002c(byte[] bArr, int i, int i2) {
        mo98004b(bArr, i, i2, false);
    }

    @Override // com.applovin.impl.InterfaceC4703k8
    /* renamed from: d */
    public long mo98001d() {
        return this.f4526d + this.f4528f;
    }

    @Override // com.applovin.impl.InterfaceC4703k8
    /* renamed from: d */
    public void mo98000d(byte[] bArr, int i, int i2) {
        mo98008a(bArr, i, i2, false);
    }

    /* renamed from: e */
    private int m101027e(byte[] bArr, int i, int i2) {
        int i3 = this.f4529g;
        if (i3 == 0) {
            return 0;
        }
        int min = Math.min(i3, i2);
        System.arraycopy(this.f4527e, 0, bArr, i, min);
        m101025g(min);
        return min;
    }

    @Override // com.applovin.impl.InterfaceC4703k8
    /* renamed from: a */
    public long mo98011a() {
        return this.f4525c;
    }

    @Override // com.applovin.impl.InterfaceC4703k8, com.applovin.impl.InterfaceC4379f5
    /* renamed from: a */
    public int mo94271a(byte[] bArr, int i, int i2) {
        int m101027e = m101027e(bArr, i, i2);
        if (m101027e == 0) {
            m101027e = m101031a(bArr, i, i2, 0, true);
        }
        m101029d(m101027e);
        return m101027e;
    }

    @Override // com.applovin.impl.InterfaceC4703k8
    /* renamed from: b */
    public boolean mo98004b(byte[] bArr, int i, int i2, boolean z) {
        if (mo98009a(i2, z)) {
            System.arraycopy(this.f4527e, this.f4528f - i2, bArr, i, i2);
            return true;
        }
        return false;
    }

    @Override // com.applovin.impl.InterfaceC4703k8
    /* renamed from: a */
    public boolean mo98008a(byte[] bArr, int i, int i2, boolean z) {
        int m101027e = m101027e(bArr, i, i2);
        while (m101027e < i2 && m101027e != -1) {
            m101027e = m101031a(bArr, i, i2, m101027e, z);
        }
        m101029d(m101027e);
        return m101027e != -1;
    }

    @Override // com.applovin.impl.InterfaceC4703k8
    /* renamed from: b */
    public void mo98007b() {
        this.f4528f = 0;
    }

    @Override // com.applovin.impl.InterfaceC4703k8
    /* renamed from: b */
    public int mo98006b(int i) {
        int m101026f = m101026f(i);
        if (m101026f == 0) {
            byte[] bArr = this.f4523a;
            m101026f = m101031a(bArr, 0, Math.min(i, bArr.length), 0, true);
        }
        m101029d(m101026f);
        return m101026f;
    }

    @Override // com.applovin.impl.InterfaceC4703k8
    /* renamed from: a */
    public void mo98010a(int i) {
        m101030b(i, false);
    }

    /* renamed from: a */
    private int m101031a(byte[] bArr, int i, int i2, int i3, boolean z) {
        if (!Thread.interrupted()) {
            int mo94271a = this.f4524b.mo94271a(bArr, i + i3, i2 - i3);
            if (mo94271a == -1) {
                if (i3 == 0 && z) {
                    return -1;
                }
                throw new EOFException();
            }
            return i3 + mo94271a;
        }
        throw new InterruptedIOException();
    }

    /* renamed from: b */
    public boolean m101030b(int i, boolean z) {
        int m101026f = m101026f(i);
        while (m101026f < i && m101026f != -1) {
            m101026f = m101031a(this.f4523a, -m101026f, Math.min(i, this.f4523a.length + m101026f), m101026f, z);
        }
        m101029d(m101026f);
        return m101026f != -1;
    }
}
