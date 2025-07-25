package com.applovin.impl;

import com.applovin.impl.C4310e9;
import com.applovin.impl.InterfaceC4591ij;
import java.io.EOFException;
import java.util.Arrays;

/* renamed from: com.applovin.impl.q0 */
/* loaded from: classes2.dex */
public final class C5164q0 implements InterfaceC4641j8 {

    /* renamed from: r */
    private static final int[] f9108r;

    /* renamed from: u */
    private static final int f9111u;

    /* renamed from: a */
    private final byte[] f9112a;

    /* renamed from: b */
    private final int f9113b;

    /* renamed from: c */
    private boolean f9114c;

    /* renamed from: d */
    private long f9115d;

    /* renamed from: e */
    private int f9116e;

    /* renamed from: f */
    private int f9117f;

    /* renamed from: g */
    private boolean f9118g;

    /* renamed from: h */
    private long f9119h;

    /* renamed from: i */
    private int f9120i;

    /* renamed from: j */
    private int f9121j;

    /* renamed from: k */
    private long f9122k;

    /* renamed from: l */
    private InterfaceC4760l8 f9123l;

    /* renamed from: m */
    private InterfaceC5209qo f9124m;

    /* renamed from: n */
    private InterfaceC4591ij f9125n;

    /* renamed from: o */
    private boolean f9126o;

    /* renamed from: p */
    public static final InterfaceC4994n8 f9106p = new InterfaceC4994n8() { // from class: com.applovin.impl.u00
        @Override // com.applovin.impl.InterfaceC4994n8
        /* renamed from: a */
        public final InterfaceC4641j8[] mo92610a() {
            InterfaceC4641j8[] m96465c;
            m96465c = C5164q0.m96465c();
            return m96465c;
        }
    };

    /* renamed from: q */
    private static final int[] f9107q = {13, 14, 16, 18, 20, 21, 27, 32, 6, 7, 6, 6, 1, 1, 1, 1};

    /* renamed from: s */
    private static final byte[] f9109s = AbstractC5863xp.m92971c("#!AMR\n");

    /* renamed from: t */
    private static final byte[] f9110t = AbstractC5863xp.m92971c("#!AMR-WB\n");

    static {
        int[] iArr = {18, 24, 33, 37, 41, 47, 51, 59, 61, 6, 1, 1, 1, 1, 1, 1};
        f9108r = iArr;
        f9111u = iArr[8];
    }

    public C5164q0() {
        this(0);
    }

    /* renamed from: b */
    private void m96468b() {
        AbstractC4100b1.m100578b(this.f9124m);
        AbstractC5863xp.m93017a(this.f9123l);
    }

    /* renamed from: c */
    private boolean m96464c(int i) {
        return i >= 0 && i <= 15 && (m96461d(i) || m96467b(i));
    }

    /* renamed from: d */
    private boolean m96461d(int i) {
        return this.f9114c && (i < 10 || i > 13);
    }

    @Override // com.applovin.impl.InterfaceC4641j8
    /* renamed from: a */
    public void mo93192a() {
    }

    public C5164q0(int i) {
        this.f9113b = (i & 2) != 0 ? i | 1 : i;
        this.f9112a = new byte[1];
        this.f9120i = -1;
    }

    /* renamed from: a */
    private static int m96472a(int i, long j) {
        return (int) (((i * 8) * 1000000) / j);
    }

    /* renamed from: c */
    private boolean m96463c(InterfaceC4703k8 interfaceC4703k8) {
        byte[] bArr = f9109s;
        if (m96469a(interfaceC4703k8, bArr)) {
            this.f9114c = false;
            interfaceC4703k8.mo98010a(bArr.length);
            return true;
        }
        byte[] bArr2 = f9110t;
        if (m96469a(interfaceC4703k8, bArr2)) {
            this.f9114c = true;
            interfaceC4703k8.mo98010a(bArr2.length);
            return true;
        }
        return false;
    }

    /* renamed from: d */
    private void m96462d() {
        if (this.f9126o) {
            return;
        }
        this.f9126o = true;
        boolean z = this.f9114c;
        this.f9124m.mo96251a(new C4310e9.C4312b().m99606f(z ? "audio/amr-wb" : "audio/3gpp").m99601i(f9111u).m99617c(1).m99591n(z ? 16000 : 8000).m99632a());
    }

    /* renamed from: a */
    private InterfaceC4591ij m96470a(long j, boolean z) {
        return new C5047o4(j, this.f9119h, m96472a(this.f9120i, 20000L), this.f9120i, z);
    }

    /* renamed from: b */
    private boolean m96467b(int i) {
        return !this.f9114c && (i < 12 || i > 14);
    }

    /* renamed from: b */
    private int m96466b(InterfaceC4703k8 interfaceC4703k8) {
        interfaceC4703k8.mo98007b();
        interfaceC4703k8.mo98002c(this.f9112a, 0, 1);
        byte b = this.f9112a[0];
        if ((b & 131) <= 0) {
            return m96473a((b >> 3) & 15);
        }
        throw C4187ch.m100188a("Invalid padding bits for frame header " + ((int) b), null);
    }

    /* renamed from: a */
    private int m96473a(int i) {
        if (m96464c(i)) {
            return this.f9114c ? f9108r[i] : f9107q[i];
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Illegal AMR ");
        sb2.append(this.f9114c ? "WB" : "NB");
        sb2.append(" frame type ");
        sb2.append(i);
        throw C4187ch.m100188a(sb2.toString(), null);
    }

    /* renamed from: c */
    public static /* synthetic */ InterfaceC4641j8[] m96465c() {
        return new InterfaceC4641j8[]{new C5164q0()};
    }

    @Override // com.applovin.impl.InterfaceC4641j8
    /* renamed from: a */
    public void mo93175a(InterfaceC4760l8 interfaceC4760l8) {
        this.f9123l = interfaceC4760l8;
        this.f9124m = interfaceC4760l8.mo97782a(0, 1);
        interfaceC4760l8.mo97780c();
    }

    /* renamed from: d */
    private int m96460d(InterfaceC4703k8 interfaceC4703k8) {
        if (this.f9117f == 0) {
            try {
                int m96466b = m96466b(interfaceC4703k8);
                this.f9116e = m96466b;
                this.f9117f = m96466b;
                if (this.f9120i == -1) {
                    this.f9119h = interfaceC4703k8.mo97999f();
                    this.f9120i = this.f9116e;
                }
                if (this.f9120i == this.f9116e) {
                    this.f9121j++;
                }
            } catch (EOFException unused) {
                return -1;
            }
        }
        int m96250a = this.f9124m.m96250a((InterfaceC4379f5) interfaceC4703k8, this.f9117f, true);
        if (m96250a == -1) {
            return -1;
        }
        int i = this.f9117f - m96250a;
        this.f9117f = i;
        if (i > 0) {
            return 0;
        }
        this.f9124m.mo96254a(this.f9122k + this.f9115d, 1, this.f9116e, 0, null);
        this.f9115d += 20000;
        return 0;
    }

    /* renamed from: a */
    private void m96471a(long j, int i) {
        int i2;
        if (this.f9118g) {
            return;
        }
        int i3 = this.f9113b;
        if ((i3 & 1) != 0 && j != -1 && ((i2 = this.f9120i) == -1 || i2 == this.f9116e)) {
            if (this.f9121j >= 20 || i == -1) {
                InterfaceC4591ij m96470a = m96470a(j, (i3 & 2) != 0);
                this.f9125n = m96470a;
                this.f9123l.mo97781a(m96470a);
                this.f9118g = true;
                return;
            }
            return;
        }
        InterfaceC4591ij.C4593b c4593b = new InterfaceC4591ij.C4593b(-9223372036854775807L);
        this.f9125n = c4593b;
        this.f9123l.mo97781a(c4593b);
        this.f9118g = true;
    }

    /* renamed from: a */
    private static boolean m96469a(InterfaceC4703k8 interfaceC4703k8, byte[] bArr) {
        interfaceC4703k8.mo98007b();
        byte[] bArr2 = new byte[bArr.length];
        interfaceC4703k8.mo98002c(bArr2, 0, bArr.length);
        return Arrays.equals(bArr2, bArr);
    }

    @Override // com.applovin.impl.InterfaceC4641j8
    /* renamed from: a */
    public int mo93179a(InterfaceC4703k8 interfaceC4703k8, C5563th c5563th) {
        m96468b();
        if (interfaceC4703k8.mo97999f() == 0 && !m96463c(interfaceC4703k8)) {
            throw C4187ch.m100188a("Could not find AMR header.", null);
        }
        m96462d();
        int m96460d = m96460d(interfaceC4703k8);
        m96471a(interfaceC4703k8.mo98011a(), m96460d);
        return m96460d;
    }

    @Override // com.applovin.impl.InterfaceC4641j8
    /* renamed from: a */
    public void mo93184a(long j, long j2) {
        this.f9115d = 0L;
        this.f9116e = 0;
        this.f9117f = 0;
        if (j != 0) {
            InterfaceC4591ij interfaceC4591ij = this.f9125n;
            if (interfaceC4591ij instanceof C5047o4) {
                this.f9122k = ((C5047o4) interfaceC4591ij).m96872d(j);
                return;
            }
        }
        this.f9122k = 0L;
    }

    @Override // com.applovin.impl.InterfaceC4641j8
    /* renamed from: a */
    public boolean mo93182a(InterfaceC4703k8 interfaceC4703k8) {
        return m96463c(interfaceC4703k8);
    }
}
