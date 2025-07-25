package com.applovin.impl;

import com.applovin.impl.AbstractC4416fr;
import com.applovin.impl.AbstractC4474gl;
import com.applovin.impl.C4310e9;
import java.util.ArrayList;
import java.util.Arrays;

/* renamed from: com.applovin.impl.er */
/* loaded from: classes2.dex */
final class C4345er extends AbstractC4474gl {

    /* renamed from: n */
    private C4346a f5958n;

    /* renamed from: o */
    private int f5959o;

    /* renamed from: p */
    private boolean f5960p;

    /* renamed from: q */
    private AbstractC4416fr.C4420d f5961q;

    /* renamed from: r */
    private AbstractC4416fr.C4418b f5962r;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.applovin.impl.er$a */
    /* loaded from: classes2.dex */
    public static final class C4346a {

        /* renamed from: a */
        public final AbstractC4416fr.C4420d f5963a;

        /* renamed from: b */
        public final AbstractC4416fr.C4418b f5964b;

        /* renamed from: c */
        public final byte[] f5965c;

        /* renamed from: d */
        public final AbstractC4416fr.C4419c[] f5966d;

        /* renamed from: e */
        public final int f5967e;

        public C4346a(AbstractC4416fr.C4420d c4420d, AbstractC4416fr.C4418b c4418b, byte[] bArr, AbstractC4416fr.C4419c[] c4419cArr, int i) {
            this.f5963a = c4420d;
            this.f5964b = c4418b;
            this.f5965c = bArr;
            this.f5966d = c4419cArr;
            this.f5967e = i;
        }
    }

    /* renamed from: a */
    static int m99456a(byte b, int i, int i2) {
        return (b >> i2) & (255 >>> (8 - i));
    }

    /* renamed from: b */
    C4346a m99453b(C4066ah c4066ah) {
        AbstractC4416fr.C4420d c4420d = this.f5961q;
        if (c4420d == null) {
            this.f5961q = AbstractC4416fr.m99065b(c4066ah);
            return null;
        }
        AbstractC4416fr.C4418b c4418b = this.f5962r;
        if (c4418b == null) {
            this.f5962r = AbstractC4416fr.m99069a(c4066ah);
            return null;
        }
        byte[] bArr = new byte[c4066ah.m100783e()];
        System.arraycopy(c4066ah.m100787c(), 0, bArr, 0, c4066ah.m100783e());
        AbstractC4416fr.C4419c[] m99068a = AbstractC4416fr.m99068a(c4066ah, c4420d.f6237b);
        return new C4346a(c4420d, c4418b, bArr, m99068a, AbstractC4416fr.m99073a(m99068a.length - 1));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.applovin.impl.AbstractC4474gl
    /* renamed from: c */
    public void mo98918c(long j) {
        super.mo98918c(j);
        this.f5960p = j != 0;
        AbstractC4416fr.C4420d c4420d = this.f5961q;
        this.f5959o = c4420d != null ? c4420d.f6242g : 0;
    }

    /* renamed from: a */
    static void m99454a(C4066ah c4066ah, long j) {
        if (c4066ah.m100789b() < c4066ah.m100783e() + 4) {
            c4066ah.m100792a(Arrays.copyOf(c4066ah.m100787c(), c4066ah.m100783e() + 4));
        } else {
            c4066ah.m100782e(c4066ah.m100783e() + 4);
        }
        byte[] m100787c = c4066ah.m100787c();
        m100787c[c4066ah.m100783e() - 4] = (byte) (j & 255);
        m100787c[c4066ah.m100783e() - 3] = (byte) ((j >>> 8) & 255);
        m100787c[c4066ah.m100783e() - 2] = (byte) ((j >>> 16) & 255);
        m100787c[c4066ah.m100783e() - 1] = (byte) ((j >>> 24) & 255);
    }

    /* renamed from: c */
    public static boolean m99452c(C4066ah c4066ah) {
        try {
            return AbstractC4416fr.m99072a(1, c4066ah, true);
        } catch (C4187ch unused) {
            return false;
        }
    }

    /* renamed from: a */
    private static int m99455a(byte b, C4346a c4346a) {
        if (!c4346a.f5966d[m99456a(b, c4346a.f5967e, 1)].f6232a) {
            return c4346a.f5963a.f6242g;
        }
        return c4346a.f5963a.f6243h;
    }

    @Override // com.applovin.impl.AbstractC4474gl
    /* renamed from: a */
    protected long mo93214a(C4066ah c4066ah) {
        if ((c4066ah.m100787c()[0] & 1) == 1) {
            return -1L;
        }
        int m99455a = m99455a(c4066ah.m100787c()[0], (C4346a) AbstractC4100b1.m100578b(this.f5958n));
        long j = this.f5960p ? (this.f5959o + m99455a) / 4 : 0;
        m99454a(c4066ah, j);
        this.f5960p = true;
        this.f5959o = m99455a;
        return j;
    }

    @Override // com.applovin.impl.AbstractC4474gl
    /* renamed from: a */
    protected boolean mo93213a(C4066ah c4066ah, long j, AbstractC4474gl.C4476b c4476b) {
        if (this.f5958n != null) {
            AbstractC4100b1.m100583a(c4476b.f6441a);
            return false;
        }
        C4346a m99453b = m99453b(c4066ah);
        this.f5958n = m99453b;
        if (m99453b == null) {
            return true;
        }
        AbstractC4416fr.C4420d c4420d = m99453b.f5963a;
        ArrayList arrayList = new ArrayList();
        arrayList.add(c4420d.f6245j);
        arrayList.add(m99453b.f5965c);
        c4476b.f6441a = new C4310e9.C4312b().m99606f("audio/vorbis").m99620b(c4420d.f6240e).m99597k(c4420d.f6239d).m99617c(c4420d.f6237b).m99591n(c4420d.f6238c).m99623a(arrayList).m99632a();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.applovin.impl.AbstractC4474gl
    /* renamed from: a */
    public void mo93212a(boolean z) {
        super.mo93212a(z);
        if (z) {
            this.f5958n = null;
            this.f5961q = null;
            this.f5962r = null;
        }
        this.f5959o = 0;
        this.f5960p = false;
    }
}
