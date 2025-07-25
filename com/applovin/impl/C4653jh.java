package com.applovin.impl;

import android.graphics.Bitmap;
import com.applovin.impl.C3989a5;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.zip.Inflater;

/* renamed from: com.applovin.impl.jh */
/* loaded from: classes2.dex */
public final class C4653jh extends AbstractC4336ek {

    /* renamed from: o */
    private final C4066ah f7202o;

    /* renamed from: p */
    private final C4066ah f7203p;

    /* renamed from: q */
    private final C4654a f7204q;

    /* renamed from: r */
    private Inflater f7205r;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.applovin.impl.jh$a */
    /* loaded from: classes2.dex */
    public static final class C4654a {

        /* renamed from: a */
        private final C4066ah f7206a = new C4066ah();

        /* renamed from: b */
        private final int[] f7207b = new int[256];

        /* renamed from: c */
        private boolean f7208c;

        /* renamed from: d */
        private int f7209d;

        /* renamed from: e */
        private int f7210e;

        /* renamed from: f */
        private int f7211f;

        /* renamed from: g */
        private int f7212g;

        /* renamed from: h */
        private int f7213h;

        /* renamed from: i */
        private int f7214i;

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: b */
        public void m98175b(C4066ah c4066ah, int i) {
            if (i < 19) {
                return;
            }
            this.f7209d = c4066ah.m100799C();
            this.f7210e = c4066ah.m100799C();
            c4066ah.m100778g(11);
            this.f7211f = c4066ah.m100799C();
            this.f7212g = c4066ah.m100799C();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: c */
        public void m98173c(C4066ah c4066ah, int i) {
            if (i % 5 != 2) {
                return;
            }
            c4066ah.m100778g(2);
            Arrays.fill(this.f7207b, 0);
            int i2 = i / 5;
            for (int i3 = 0; i3 < i2; i3++) {
                int m100762w = c4066ah.m100762w();
                int m100762w2 = c4066ah.m100762w();
                int m100762w3 = c4066ah.m100762w();
                int m100762w4 = c4066ah.m100762w();
                double d = m100762w2;
                double d2 = m100762w3 - 128;
                double d3 = m100762w4 - 128;
                this.f7207b[m100762w] = (AbstractC5863xp.m93039a((int) ((d - (0.34414d * d3)) - (d2 * 0.71414d)), 0, 255) << 8) | (c4066ah.m100762w() << 24) | (AbstractC5863xp.m93039a((int) ((1.402d * d2) + d), 0, 255) << 16) | AbstractC5863xp.m93039a((int) (d + (d3 * 1.772d)), 0, 255);
            }
            this.f7208c = true;
        }

        /* renamed from: a */
        public C3989a5 m98179a() {
            int i;
            if (this.f7209d == 0 || this.f7210e == 0 || this.f7213h == 0 || this.f7214i == 0 || this.f7206a.m100783e() == 0 || this.f7206a.m100785d() != this.f7206a.m100783e() || !this.f7208c) {
                return null;
            }
            this.f7206a.m100780f(0);
            int i2 = this.f7213h * this.f7214i;
            int[] iArr = new int[i2];
            int i3 = 0;
            while (i3 < i2) {
                int m100762w = this.f7206a.m100762w();
                if (m100762w != 0) {
                    i = i3 + 1;
                    iArr[i3] = this.f7207b[m100762w];
                } else {
                    int m100762w2 = this.f7206a.m100762w();
                    if (m100762w2 != 0) {
                        i = ((m100762w2 & 64) == 0 ? m100762w2 & 63 : ((m100762w2 & 63) << 8) | this.f7206a.m100762w()) + i3;
                        Arrays.fill(iArr, i3, i, (m100762w2 & 128) == 0 ? 0 : this.f7207b[this.f7206a.m100762w()]);
                    }
                }
                i3 = i;
            }
            return new C3989a5.C3991b().m101046a(Bitmap.createBitmap(iArr, this.f7213h, this.f7214i, Bitmap.Config.ARGB_8888)).m101042b(this.f7211f / this.f7209d).m101040b(0).m101048a(this.f7212g / this.f7210e, 0).m101047a(0).m101034d(this.f7213h / this.f7209d).m101049a(this.f7214i / this.f7210e).m101050a();
        }

        /* renamed from: b */
        public void m98176b() {
            this.f7209d = 0;
            this.f7210e = 0;
            this.f7211f = 0;
            this.f7212g = 0;
            this.f7213h = 0;
            this.f7214i = 0;
            this.f7206a.m100784d(0);
            this.f7208c = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: a */
        public void m98178a(C4066ah c4066ah, int i) {
            int m100759z;
            if (i < 4) {
                return;
            }
            c4066ah.m100778g(3);
            int i2 = i - 4;
            if ((c4066ah.m100762w() & 128) != 0) {
                if (i2 < 7 || (m100759z = c4066ah.m100759z()) < 4) {
                    return;
                }
                this.f7213h = c4066ah.m100799C();
                this.f7214i = c4066ah.m100799C();
                this.f7206a.m100784d(m100759z - 4);
                i2 = i - 11;
            }
            int m100785d = this.f7206a.m100785d();
            int m100783e = this.f7206a.m100783e();
            if (m100785d >= m100783e || i2 <= 0) {
                return;
            }
            int min = Math.min(i2, m100783e - m100785d);
            c4066ah.m100790a(this.f7206a.m100787c(), m100785d, min);
            this.f7206a.m100780f(m100785d + min);
        }
    }

    public C4653jh() {
        super("PgsDecoder");
        this.f7202o = new C4066ah();
        this.f7203p = new C4066ah();
        this.f7204q = new C4654a();
    }

    @Override // com.applovin.impl.AbstractC4336ek
    /* renamed from: a */
    protected InterfaceC5019nl mo92614a(byte[] bArr, int i, boolean z) {
        this.f7202o.m100791a(bArr, i);
        m98181a(this.f7202o);
        this.f7204q.m98176b();
        ArrayList arrayList = new ArrayList();
        while (this.f7202o.m100797a() >= 3) {
            C3989a5 m98180a = m98180a(this.f7202o, this.f7204q);
            if (m98180a != null) {
                arrayList.add(m98180a);
            }
        }
        return new C4717kh(Collections.unmodifiableList(arrayList));
    }

    /* renamed from: a */
    private void m98181a(C4066ah c4066ah) {
        if (c4066ah.m100797a() <= 0 || c4066ah.m100779g() != 120) {
            return;
        }
        if (this.f7205r == null) {
            this.f7205r = new Inflater();
        }
        if (AbstractC5863xp.m93023a(c4066ah, this.f7203p, this.f7205r)) {
            c4066ah.m100791a(this.f7203p.m100787c(), this.f7203p.m100783e());
        }
    }

    /* renamed from: a */
    private static C3989a5 m98180a(C4066ah c4066ah, C4654a c4654a) {
        int m100783e = c4066ah.m100783e();
        int m100762w = c4066ah.m100762w();
        int m100799C = c4066ah.m100799C();
        int m100785d = c4066ah.m100785d() + m100799C;
        C3989a5 c3989a5 = null;
        if (m100785d > m100783e) {
            c4066ah.m100780f(m100783e);
            return null;
        }
        if (m100762w != 128) {
            switch (m100762w) {
                case 20:
                    c4654a.m98173c(c4066ah, m100799C);
                    break;
                case 21:
                    c4654a.m98178a(c4066ah, m100799C);
                    break;
                case 22:
                    c4654a.m98175b(c4066ah, m100799C);
                    break;
            }
        } else {
            c3989a5 = c4654a.m98179a();
            c4654a.m98176b();
        }
        c4066ah.m100780f(m100785d);
        return c3989a5;
    }
}
