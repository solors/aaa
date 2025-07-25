package com.applovin.impl;

import java.util.ArrayDeque;

/* renamed from: com.applovin.impl.z5 */
/* loaded from: classes2.dex */
final class C5953z5 implements InterfaceC5051o7 {

    /* renamed from: a */
    private final byte[] f12494a = new byte[8];

    /* renamed from: b */
    private final ArrayDeque f12495b = new ArrayDeque();

    /* renamed from: c */
    private final C5989zp f12496c = new C5989zp();

    /* renamed from: d */
    private InterfaceC4993n7 f12497d;

    /* renamed from: e */
    private int f12498e;

    /* renamed from: f */
    private int f12499f;

    /* renamed from: g */
    private long f12500g;

    /* renamed from: com.applovin.impl.z5$b */
    /* loaded from: classes2.dex */
    private static final class C5955b {

        /* renamed from: a */
        private final int f12501a;

        /* renamed from: b */
        private final long f12502b;

        private C5955b(int i, long j) {
            this.f12501a = i;
            this.f12502b = j;
        }
    }

    /* renamed from: b */
    private long m92510b(InterfaceC4703k8 interfaceC4703k8) {
        interfaceC4703k8.mo98007b();
        while (true) {
            interfaceC4703k8.mo98002c(this.f12494a, 0, 4);
            int m92326a = C5989zp.m92326a(this.f12494a[0]);
            if (m92326a != -1 && m92326a <= 4) {
                int m92324a = (int) C5989zp.m92324a(this.f12494a, m92326a, false);
                if (this.f12497d.mo93146c(m92324a)) {
                    interfaceC4703k8.mo98010a(m92326a);
                    return m92324a;
                }
            }
            interfaceC4703k8.mo98010a(1);
        }
    }

    /* renamed from: c */
    private static String m92508c(InterfaceC4703k8 interfaceC4703k8, int i) {
        if (i == 0) {
            return "";
        }
        byte[] bArr = new byte[i];
        interfaceC4703k8.mo98000d(bArr, 0, i);
        while (i > 0 && bArr[i - 1] == 0) {
            i--;
        }
        return new String(bArr, 0, i);
    }

    @Override // com.applovin.impl.InterfaceC5051o7
    /* renamed from: a */
    public void mo92511a(InterfaceC4993n7 interfaceC4993n7) {
        this.f12497d = interfaceC4993n7;
    }

    @Override // com.applovin.impl.InterfaceC5051o7
    public void reset() {
        this.f12498e = 0;
        this.f12495b.clear();
        this.f12496c.m92323b();
    }

    @Override // com.applovin.impl.InterfaceC5051o7
    /* renamed from: a */
    public boolean mo92513a(InterfaceC4703k8 interfaceC4703k8) {
        AbstractC4100b1.m100578b(this.f12497d);
        while (true) {
            C5955b c5955b = (C5955b) this.f12495b.peek();
            if (c5955b != null && interfaceC4703k8.mo97999f() >= c5955b.f12502b) {
                this.f12497d.mo93153a(((C5955b) this.f12495b.pop()).f12501a);
                return true;
            }
            if (this.f12498e == 0) {
                long m92325a = this.f12496c.m92325a(interfaceC4703k8, true, false, 4);
                if (m92325a == -2) {
                    m92325a = m92510b(interfaceC4703k8);
                }
                if (m92325a == -1) {
                    return false;
                }
                this.f12499f = (int) m92325a;
                this.f12498e = 1;
            }
            if (this.f12498e == 1) {
                this.f12500g = this.f12496c.m92325a(interfaceC4703k8, false, true, 8);
                this.f12498e = 2;
            }
            int mo93147b = this.f12497d.mo93147b(this.f12499f);
            if (mo93147b != 0) {
                if (mo93147b == 1) {
                    long mo97999f = interfaceC4703k8.mo97999f();
                    this.f12495b.push(new C5955b(this.f12499f, this.f12500g + mo97999f));
                    this.f12497d.mo93149a(this.f12499f, mo97999f, this.f12500g);
                    this.f12498e = 0;
                    return true;
                } else if (mo93147b == 2) {
                    long j = this.f12500g;
                    if (j <= 8) {
                        this.f12497d.mo93150a(this.f12499f, m92509b(interfaceC4703k8, (int) j));
                        this.f12498e = 0;
                        return true;
                    }
                    throw C4187ch.m100188a("Invalid integer size: " + this.f12500g, null);
                } else if (mo93147b == 3) {
                    long j2 = this.f12500g;
                    if (j2 <= 2147483647L) {
                        this.f12497d.mo93148a(this.f12499f, m92508c(interfaceC4703k8, (int) j2));
                        this.f12498e = 0;
                        return true;
                    }
                    throw C4187ch.m100188a("String element size: " + this.f12500g, null);
                } else if (mo93147b == 4) {
                    this.f12497d.mo93151a(this.f12499f, (int) this.f12500g, interfaceC4703k8);
                    this.f12498e = 0;
                    return true;
                } else if (mo93147b == 5) {
                    long j3 = this.f12500g;
                    if (j3 != 4 && j3 != 8) {
                        throw C4187ch.m100188a("Invalid float size: " + this.f12500g, null);
                    }
                    this.f12497d.mo93152a(this.f12499f, m92512a(interfaceC4703k8, (int) j3));
                    this.f12498e = 0;
                    return true;
                } else {
                    throw C4187ch.m100188a("Invalid element type " + mo93147b, null);
                }
            }
            interfaceC4703k8.mo98010a((int) this.f12500g);
            this.f12498e = 0;
        }
    }

    /* renamed from: b */
    private long m92509b(InterfaceC4703k8 interfaceC4703k8, int i) {
        interfaceC4703k8.mo98000d(this.f12494a, 0, i);
        long j = 0;
        for (int i2 = 0; i2 < i; i2++) {
            j = (j << 8) | (this.f12494a[i2] & 255);
        }
        return j;
    }

    /* renamed from: a */
    private double m92512a(InterfaceC4703k8 interfaceC4703k8, int i) {
        long m92509b = m92509b(interfaceC4703k8, i);
        if (i == 4) {
            return Float.intBitsToFloat((int) m92509b);
        }
        return Double.longBitsToDouble(m92509b);
    }
}
