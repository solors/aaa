package com.applovin.impl;

import android.content.Context;
import android.graphics.Point;
import android.os.Bundle;
import android.os.Looper;
import android.view.accessibility.CaptioningManager;
import com.applovin.exoplayer2.common.base.MoreObjects;
import com.applovin.impl.AbstractC4247db;
import com.applovin.impl.InterfaceC5044o2;
import java.util.Collection;
import java.util.Locale;

/* renamed from: com.applovin.impl.uo */
/* loaded from: classes2.dex */
public class C5652uo implements InterfaceC5044o2 {

    /* renamed from: A */
    public static final InterfaceC5044o2.InterfaceC5045a f11351A;

    /* renamed from: y */
    public static final C5652uo f11352y;

    /* renamed from: z */
    public static final C5652uo f11353z;

    /* renamed from: a */
    public final int f11354a;

    /* renamed from: b */
    public final int f11355b;

    /* renamed from: c */
    public final int f11356c;

    /* renamed from: d */
    public final int f11357d;

    /* renamed from: f */
    public final int f11358f;

    /* renamed from: g */
    public final int f11359g;

    /* renamed from: h */
    public final int f11360h;

    /* renamed from: i */
    public final int f11361i;

    /* renamed from: j */
    public final int f11362j;

    /* renamed from: k */
    public final int f11363k;

    /* renamed from: l */
    public final boolean f11364l;

    /* renamed from: m */
    public final AbstractC4247db f11365m;

    /* renamed from: n */
    public final AbstractC4247db f11366n;

    /* renamed from: o */
    public final int f11367o;

    /* renamed from: p */
    public final int f11368p;

    /* renamed from: q */
    public final int f11369q;

    /* renamed from: r */
    public final AbstractC4247db f11370r;

    /* renamed from: s */
    public final AbstractC4247db f11371s;

    /* renamed from: t */
    public final int f11372t;

    /* renamed from: u */
    public final boolean f11373u;

    /* renamed from: v */
    public final boolean f11374v;

    /* renamed from: w */
    public final boolean f11375w;

    /* renamed from: x */
    public final AbstractC4518hb f11376x;

    /* renamed from: com.applovin.impl.uo$a */
    /* loaded from: classes2.dex */
    public static class C5653a {

        /* renamed from: a */
        private int f11377a;

        /* renamed from: b */
        private int f11378b;

        /* renamed from: c */
        private int f11379c;

        /* renamed from: d */
        private int f11380d;

        /* renamed from: e */
        private int f11381e;

        /* renamed from: f */
        private int f11382f;

        /* renamed from: g */
        private int f11383g;

        /* renamed from: h */
        private int f11384h;

        /* renamed from: i */
        private int f11385i;

        /* renamed from: j */
        private int f11386j;

        /* renamed from: k */
        private boolean f11387k;

        /* renamed from: l */
        private AbstractC4247db f11388l;

        /* renamed from: m */
        private AbstractC4247db f11389m;

        /* renamed from: n */
        private int f11390n;

        /* renamed from: o */
        private int f11391o;

        /* renamed from: p */
        private int f11392p;

        /* renamed from: q */
        private AbstractC4247db f11393q;

        /* renamed from: r */
        private AbstractC4247db f11394r;

        /* renamed from: s */
        private int f11395s;

        /* renamed from: t */
        private boolean f11396t;

        /* renamed from: u */
        private boolean f11397u;

        /* renamed from: v */
        private boolean f11398v;

        /* renamed from: w */
        private AbstractC4518hb f11399w;

        public C5653a() {
            this.f11377a = Integer.MAX_VALUE;
            this.f11378b = Integer.MAX_VALUE;
            this.f11379c = Integer.MAX_VALUE;
            this.f11380d = Integer.MAX_VALUE;
            this.f11385i = Integer.MAX_VALUE;
            this.f11386j = Integer.MAX_VALUE;
            this.f11387k = true;
            this.f11388l = AbstractC4247db.m99829h();
            this.f11389m = AbstractC4247db.m99829h();
            this.f11390n = 0;
            this.f11391o = Integer.MAX_VALUE;
            this.f11392p = Integer.MAX_VALUE;
            this.f11393q = AbstractC4247db.m99829h();
            this.f11394r = AbstractC4247db.m99829h();
            this.f11395s = 0;
            this.f11396t = false;
            this.f11397u = false;
            this.f11398v = false;
            this.f11399w = AbstractC4518hb.m98741h();
        }

        /* renamed from: a */
        private static AbstractC4247db m94030a(String[] strArr) {
            AbstractC4247db.C4248a m99831f = AbstractC4247db.m99831f();
            for (String str : (String[]) AbstractC4100b1.m100583a(strArr)) {
                m99831f.m99827b(AbstractC5863xp.m92960f((String) AbstractC4100b1.m100583a((Object) str)));
            }
            return m99831f.m99828a();
        }

        /* renamed from: b */
        private void m94029b(Context context) {
            CaptioningManager captioningManager;
            if ((AbstractC5863xp.f12151a >= 23 || Looper.myLooper() != null) && (captioningManager = (CaptioningManager) context.getSystemService("captioning")) != null && captioningManager.isEnabled()) {
                this.f11395s = 1088;
                Locale locale = captioningManager.getLocale();
                if (locale != null) {
                    this.f11394r = AbstractC4247db.m99842a(AbstractC5863xp.m93008a(locale));
                }
            }
        }

        /* renamed from: a */
        public C5653a mo94034a(int i, int i2, boolean z) {
            this.f11385i = i;
            this.f11386j = i2;
            this.f11387k = z;
            return this;
        }

        /* renamed from: a */
        public C5653a mo94032a(Context context, boolean z) {
            Point m92973c = AbstractC5863xp.m92973c(context);
            return mo94034a(m92973c.x, m92973c.y, z);
        }

        /* renamed from: a */
        public C5653a mo94033a(Context context) {
            if (AbstractC5863xp.f12151a >= 19) {
                m94029b(context);
            }
            return this;
        }

        /* renamed from: a */
        public C5652uo mo94035a() {
            return new C5652uo(this);
        }

        public C5653a(Context context) {
            this();
            mo94033a(context);
            mo94032a(context, true);
        }

        public C5653a(Bundle bundle) {
            String m94037b = C5652uo.m94037b(6);
            C5652uo c5652uo = C5652uo.f11352y;
            this.f11377a = bundle.getInt(m94037b, c5652uo.f11354a);
            this.f11378b = bundle.getInt(C5652uo.m94037b(7), c5652uo.f11355b);
            this.f11379c = bundle.getInt(C5652uo.m94037b(8), c5652uo.f11356c);
            this.f11380d = bundle.getInt(C5652uo.m94037b(9), c5652uo.f11357d);
            this.f11381e = bundle.getInt(C5652uo.m94037b(10), c5652uo.f11358f);
            this.f11382f = bundle.getInt(C5652uo.m94037b(11), c5652uo.f11359g);
            this.f11383g = bundle.getInt(C5652uo.m94037b(12), c5652uo.f11360h);
            this.f11384h = bundle.getInt(C5652uo.m94037b(13), c5652uo.f11361i);
            this.f11385i = bundle.getInt(C5652uo.m94037b(14), c5652uo.f11362j);
            this.f11386j = bundle.getInt(C5652uo.m94037b(15), c5652uo.f11363k);
            this.f11387k = bundle.getBoolean(C5652uo.m94037b(16), c5652uo.f11364l);
            this.f11388l = AbstractC4247db.m99832c((String[]) MoreObjects.firstNonNull(bundle.getStringArray(C5652uo.m94037b(17)), new String[0]));
            this.f11389m = m94030a((String[]) MoreObjects.firstNonNull(bundle.getStringArray(C5652uo.m94037b(1)), new String[0]));
            this.f11390n = bundle.getInt(C5652uo.m94037b(2), c5652uo.f11367o);
            this.f11391o = bundle.getInt(C5652uo.m94037b(18), c5652uo.f11368p);
            this.f11392p = bundle.getInt(C5652uo.m94037b(19), c5652uo.f11369q);
            this.f11393q = AbstractC4247db.m99832c((String[]) MoreObjects.firstNonNull(bundle.getStringArray(C5652uo.m94037b(20)), new String[0]));
            this.f11394r = m94030a((String[]) MoreObjects.firstNonNull(bundle.getStringArray(C5652uo.m94037b(3)), new String[0]));
            this.f11395s = bundle.getInt(C5652uo.m94037b(4), c5652uo.f11372t);
            this.f11396t = bundle.getBoolean(C5652uo.m94037b(5), c5652uo.f11373u);
            this.f11397u = bundle.getBoolean(C5652uo.m94037b(21), c5652uo.f11374v);
            this.f11398v = bundle.getBoolean(C5652uo.m94037b(22), c5652uo.f11375w);
            this.f11399w = AbstractC4518hb.m98743a((Collection) AbstractC5555tb.m94480a((int[]) MoreObjects.firstNonNull(bundle.getIntArray(C5652uo.m94037b(23)), new int[0])));
        }
    }

    static {
        C5652uo mo94035a = new C5653a().mo94035a();
        f11352y = mo94035a;
        f11353z = mo94035a;
        f11351A = new InterfaceC5044o2.InterfaceC5045a() { // from class: com.applovin.impl.u60
            @Override // com.applovin.impl.InterfaceC5044o2.InterfaceC5045a
            /* renamed from: a */
            public final InterfaceC5044o2 mo92505a(Bundle bundle) {
                C5652uo m94038a;
                m94038a = C5652uo.m94038a(bundle);
                return m94038a;
            }
        };
    }

    public C5652uo(C5653a c5653a) {
        this.f11354a = c5653a.f11377a;
        this.f11355b = c5653a.f11378b;
        this.f11356c = c5653a.f11379c;
        this.f11357d = c5653a.f11380d;
        this.f11358f = c5653a.f11381e;
        this.f11359g = c5653a.f11382f;
        this.f11360h = c5653a.f11383g;
        this.f11361i = c5653a.f11384h;
        this.f11362j = c5653a.f11385i;
        this.f11363k = c5653a.f11386j;
        this.f11364l = c5653a.f11387k;
        this.f11365m = c5653a.f11388l;
        this.f11366n = c5653a.f11389m;
        this.f11367o = c5653a.f11390n;
        this.f11368p = c5653a.f11391o;
        this.f11369q = c5653a.f11392p;
        this.f11370r = c5653a.f11393q;
        this.f11371s = c5653a.f11394r;
        this.f11372t = c5653a.f11395s;
        this.f11373u = c5653a.f11396t;
        this.f11374v = c5653a.f11397u;
        this.f11375w = c5653a.f11398v;
        this.f11376x = c5653a.f11399w;
    }

    /* renamed from: b */
    public static String m94037b(int i) {
        return Integer.toString(i, 36);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C5652uo c5652uo = (C5652uo) obj;
        if (this.f11354a == c5652uo.f11354a && this.f11355b == c5652uo.f11355b && this.f11356c == c5652uo.f11356c && this.f11357d == c5652uo.f11357d && this.f11358f == c5652uo.f11358f && this.f11359g == c5652uo.f11359g && this.f11360h == c5652uo.f11360h && this.f11361i == c5652uo.f11361i && this.f11364l == c5652uo.f11364l && this.f11362j == c5652uo.f11362j && this.f11363k == c5652uo.f11363k && this.f11365m.equals(c5652uo.f11365m) && this.f11366n.equals(c5652uo.f11366n) && this.f11367o == c5652uo.f11367o && this.f11368p == c5652uo.f11368p && this.f11369q == c5652uo.f11369q && this.f11370r.equals(c5652uo.f11370r) && this.f11371s.equals(c5652uo.f11371s) && this.f11372t == c5652uo.f11372t && this.f11373u == c5652uo.f11373u && this.f11374v == c5652uo.f11374v && this.f11375w == c5652uo.f11375w && this.f11376x.equals(c5652uo.f11376x)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((((((((((((((((((((((((((((((((((((((((((((this.f11354a + 31) * 31) + this.f11355b) * 31) + this.f11356c) * 31) + this.f11357d) * 31) + this.f11358f) * 31) + this.f11359g) * 31) + this.f11360h) * 31) + this.f11361i) * 31) + (this.f11364l ? 1 : 0)) * 31) + this.f11362j) * 31) + this.f11363k) * 31) + this.f11365m.hashCode()) * 31) + this.f11366n.hashCode()) * 31) + this.f11367o) * 31) + this.f11368p) * 31) + this.f11369q) * 31) + this.f11370r.hashCode()) * 31) + this.f11371s.hashCode()) * 31) + this.f11372t) * 31) + (this.f11373u ? 1 : 0)) * 31) + (this.f11374v ? 1 : 0)) * 31) + (this.f11375w ? 1 : 0)) * 31) + this.f11376x.hashCode();
    }

    /* renamed from: a */
    public static /* synthetic */ C5652uo m94038a(Bundle bundle) {
        return new C5653a(bundle).mo94035a();
    }
}
