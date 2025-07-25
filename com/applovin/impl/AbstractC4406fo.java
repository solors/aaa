package com.applovin.impl;

import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.util.Pair;
import com.applovin.impl.AbstractC4247db;
import com.applovin.impl.AbstractC4406fo;
import com.applovin.impl.C5319sd;
import com.applovin.impl.C5588u;
import com.applovin.impl.InterfaceC5044o2;

/* renamed from: com.applovin.impl.fo */
/* loaded from: classes2.dex */
public abstract class AbstractC4406fo implements InterfaceC5044o2 {

    /* renamed from: a */
    public static final AbstractC4406fo f6154a = new C4407a();

    /* renamed from: b */
    public static final InterfaceC5044o2.InterfaceC5045a f6155b = new InterfaceC5044o2.InterfaceC5045a() { // from class: com.applovin.impl.cx
        @Override // com.applovin.impl.InterfaceC5044o2.InterfaceC5045a
        /* renamed from: a */
        public final InterfaceC5044o2 mo92505a(Bundle bundle) {
            return AbstractC4406fo.m99124b(bundle);
        }
    };

    /* renamed from: com.applovin.impl.fo$a */
    /* loaded from: classes2.dex */
    class C4407a extends AbstractC4406fo {
        C4407a() {
        }

        @Override // com.applovin.impl.AbstractC4406fo
        /* renamed from: a */
        public int mo93564a() {
            return 0;
        }

        @Override // com.applovin.impl.AbstractC4406fo
        /* renamed from: b */
        public int mo93560b() {
            return 0;
        }

        @Override // com.applovin.impl.AbstractC4406fo
        /* renamed from: a */
        public int mo93561a(Object obj) {
            return -1;
        }

        @Override // com.applovin.impl.AbstractC4406fo
        /* renamed from: b */
        public Object mo93559b(int i) {
            throw new IndexOutOfBoundsException();
        }

        @Override // com.applovin.impl.AbstractC4406fo
        /* renamed from: a */
        public C4410d mo93562a(int i, C4410d c4410d, long j) {
            throw new IndexOutOfBoundsException();
        }

        @Override // com.applovin.impl.AbstractC4406fo
        /* renamed from: a */
        public C4408b mo93563a(int i, C4408b c4408b, boolean z) {
            throw new IndexOutOfBoundsException();
        }
    }

    /* renamed from: com.applovin.impl.fo$b */
    /* loaded from: classes2.dex */
    public static final class C4408b implements InterfaceC5044o2 {

        /* renamed from: i */
        public static final InterfaceC5044o2.InterfaceC5045a f6156i = new InterfaceC5044o2.InterfaceC5045a() { // from class: com.applovin.impl.dx
            @Override // com.applovin.impl.InterfaceC5044o2.InterfaceC5045a
            /* renamed from: a */
            public final InterfaceC5044o2 mo92505a(Bundle bundle) {
                return AbstractC4406fo.C4408b.m99109b(bundle);
            }
        };

        /* renamed from: a */
        public Object f6157a;

        /* renamed from: b */
        public Object f6158b;

        /* renamed from: c */
        public int f6159c;

        /* renamed from: d */
        public long f6160d;

        /* renamed from: f */
        public long f6161f;

        /* renamed from: g */
        public boolean f6162g;

        /* renamed from: h */
        private C5588u f6163h = C5588u.f10959h;

        /* renamed from: b */
        public static /* synthetic */ C4408b m99109b(Bundle bundle) {
            return m99117a(bundle);
        }

        /* renamed from: g */
        private static String m99100g(int i) {
            return Integer.toString(i, 36);
        }

        /* renamed from: c */
        public long m99107c(int i) {
            return this.f6163h.m94356a(i).f10974g;
        }

        /* renamed from: d */
        public int m99105d(int i) {
            return this.f6163h.m94356a(i).m94349a();
        }

        /* renamed from: e */
        public long m99104e() {
            return this.f6161f;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !C4408b.class.equals(obj.getClass())) {
                return false;
            }
            C4408b c4408b = (C4408b) obj;
            if (AbstractC5863xp.m93016a(this.f6157a, c4408b.f6157a) && AbstractC5863xp.m93016a(this.f6158b, c4408b.f6158b) && this.f6159c == c4408b.f6159c && this.f6160d == c4408b.f6160d && this.f6161f == c4408b.f6161f && this.f6162g == c4408b.f6162g && AbstractC5863xp.m93016a(this.f6163h, c4408b.f6163h)) {
                return true;
            }
            return false;
        }

        /* renamed from: f */
        public int m99102f() {
            return this.f6163h.f10966f;
        }

        public int hashCode() {
            int hashCode;
            Object obj = this.f6157a;
            int i = 0;
            if (obj == null) {
                hashCode = 0;
            } else {
                hashCode = obj.hashCode();
            }
            int i2 = (hashCode + 217) * 31;
            Object obj2 = this.f6158b;
            if (obj2 != null) {
                i = obj2.hashCode();
            }
            long j = this.f6160d;
            long j2 = this.f6161f;
            return ((((((((((i2 + i) * 31) + this.f6159c) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + (this.f6162g ? 1 : 0)) * 31) + this.f6163h.hashCode();
        }

        /* renamed from: a */
        public static C4408b m99117a(Bundle bundle) {
            C5588u c5588u;
            int i = bundle.getInt(m99100g(0), 0);
            long j = bundle.getLong(m99100g(1), -9223372036854775807L);
            long j2 = bundle.getLong(m99100g(2), 0L);
            boolean z = bundle.getBoolean(m99100g(3));
            Bundle bundle2 = bundle.getBundle(m99100g(4));
            if (bundle2 != null) {
                c5588u = (C5588u) C5588u.f10961j.mo92505a(bundle2);
            } else {
                c5588u = C5588u.f10959h;
            }
            C5588u c5588u2 = c5588u;
            C4408b c4408b = new C4408b();
            c4408b.m99114a(null, null, i, j, j2, c5588u2, z);
            return c4408b;
        }

        /* renamed from: b */
        public int m99110b(long j) {
            return this.f6163h.m94351b(j, this.f6160d);
        }

        /* renamed from: c */
        public long m99108c() {
            return this.f6160d;
        }

        /* renamed from: d */
        public long m99106d() {
            return AbstractC5538t2.m94552b(this.f6161f);
        }

        /* renamed from: e */
        public boolean m99103e(int i) {
            return !this.f6163h.m94356a(i).m94344b();
        }

        /* renamed from: f */
        public boolean m99101f(int i) {
            return this.f6163h.m94356a(i).f10975h;
        }

        /* renamed from: b */
        public long m99112b(int i) {
            return this.f6163h.m94356a(i).f10969a;
        }

        /* renamed from: b */
        public long m99113b() {
            return this.f6163h.f10964c;
        }

        /* renamed from: b */
        public int m99111b(int i, int i2) {
            return this.f6163h.m94356a(i).m94348a(i2);
        }

        /* renamed from: a */
        public int m99120a(int i) {
            return this.f6163h.m94356a(i).f10970b;
        }

        /* renamed from: a */
        public long m99119a(int i, int i2) {
            C5588u.C5589a m94356a = this.f6163h.m94356a(i);
            if (m94356a.f10970b != -1) {
                return m94356a.f10973f[i2];
            }
            return -9223372036854775807L;
        }

        /* renamed from: a */
        public int m99121a() {
            return this.f6163h.f10963b;
        }

        /* renamed from: a */
        public int m99118a(long j) {
            return this.f6163h.m94355a(j, this.f6160d);
        }

        /* renamed from: a */
        public C4408b m99115a(Object obj, Object obj2, int i, long j, long j2) {
            return m99114a(obj, obj2, i, j, j2, C5588u.f10959h, false);
        }

        /* renamed from: a */
        public C4408b m99114a(Object obj, Object obj2, int i, long j, long j2, C5588u c5588u, boolean z) {
            this.f6157a = obj;
            this.f6158b = obj2;
            this.f6159c = i;
            this.f6160d = j;
            this.f6161f = j2;
            this.f6163h = c5588u;
            this.f6162g = z;
            return this;
        }
    }

    /* renamed from: com.applovin.impl.fo$d */
    /* loaded from: classes2.dex */
    public static final class C4410d implements InterfaceC5044o2 {

        /* renamed from: s */
        public static final Object f6168s = new Object();

        /* renamed from: t */
        private static final Object f6169t = new Object();

        /* renamed from: u */
        private static final C5319sd f6170u = new C5319sd.C5322c().m95631b("com.applovin.exoplayer2.Timeline").m95634a(Uri.EMPTY).m95635a();

        /* renamed from: v */
        public static final InterfaceC5044o2.InterfaceC5045a f6171v = new InterfaceC5044o2.InterfaceC5045a() { // from class: com.applovin.impl.ex
            @Override // com.applovin.impl.InterfaceC5044o2.InterfaceC5045a
            /* renamed from: a */
            public final InterfaceC5044o2 mo92505a(Bundle bundle) {
                return AbstractC4406fo.C4410d.m99094b(bundle);
            }
        };

        /* renamed from: b */
        public Object f6173b;

        /* renamed from: d */
        public Object f6175d;

        /* renamed from: f */
        public long f6176f;

        /* renamed from: g */
        public long f6177g;

        /* renamed from: h */
        public long f6178h;

        /* renamed from: i */
        public boolean f6179i;

        /* renamed from: j */
        public boolean f6180j;

        /* renamed from: k */
        public boolean f6181k;

        /* renamed from: l */
        public C5319sd.C5326f f6182l;

        /* renamed from: m */
        public boolean f6183m;

        /* renamed from: n */
        public long f6184n;

        /* renamed from: o */
        public long f6185o;

        /* renamed from: p */
        public int f6186p;

        /* renamed from: q */
        public int f6187q;

        /* renamed from: r */
        public long f6188r;

        /* renamed from: a */
        public Object f6172a = f6168s;

        /* renamed from: c */
        public C5319sd f6174c = f6170u;

        /* renamed from: a */
        public static C4410d m99097a(Bundle bundle) {
            Bundle bundle2 = bundle.getBundle(m99098a(1));
            C5319sd c5319sd = bundle2 != null ? (C5319sd) C5319sd.f9640h.mo92505a(bundle2) : null;
            long j = bundle.getLong(m99098a(2), -9223372036854775807L);
            long j2 = bundle.getLong(m99098a(3), -9223372036854775807L);
            long j3 = bundle.getLong(m99098a(4), -9223372036854775807L);
            boolean z = bundle.getBoolean(m99098a(5), false);
            boolean z2 = bundle.getBoolean(m99098a(6), false);
            Bundle bundle3 = bundle.getBundle(m99098a(7));
            C5319sd.C5326f c5326f = bundle3 != null ? (C5319sd.C5326f) C5319sd.C5326f.f9684h.mo92505a(bundle3) : null;
            boolean z3 = bundle.getBoolean(m99098a(8), false);
            long j4 = bundle.getLong(m99098a(9), 0L);
            long j5 = bundle.getLong(m99098a(10), -9223372036854775807L);
            int i = bundle.getInt(m99098a(11), 0);
            int i2 = bundle.getInt(m99098a(12), 0);
            long j6 = bundle.getLong(m99098a(13), 0L);
            C4410d c4410d = new C4410d();
            c4410d.m99096a(f6169t, c5319sd, null, j, j2, j3, z, z2, c5326f, j4, j5, i, i2, j6);
            c4410d.f6183m = z3;
            return c4410d;
        }

        /* renamed from: b */
        public static /* synthetic */ C4410d m99094b(Bundle bundle) {
            return m99097a(bundle);
        }

        /* renamed from: c */
        public long m99093c() {
            return this.f6184n;
        }

        /* renamed from: d */
        public long m99092d() {
            return AbstractC5538t2.m94552b(this.f6185o);
        }

        /* renamed from: e */
        public boolean m99091e() {
            boolean z;
            boolean z2;
            boolean z3 = this.f6181k;
            if (this.f6182l != null) {
                z = true;
            } else {
                z = false;
            }
            if (z3 == z) {
                z2 = true;
            } else {
                z2 = false;
            }
            AbstractC4100b1.m100577b(z2);
            if (this.f6182l != null) {
                return true;
            }
            return false;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !C4410d.class.equals(obj.getClass())) {
                return false;
            }
            C4410d c4410d = (C4410d) obj;
            if (AbstractC5863xp.m93016a(this.f6172a, c4410d.f6172a) && AbstractC5863xp.m93016a(this.f6174c, c4410d.f6174c) && AbstractC5863xp.m93016a(this.f6175d, c4410d.f6175d) && AbstractC5863xp.m93016a(this.f6182l, c4410d.f6182l) && this.f6176f == c4410d.f6176f && this.f6177g == c4410d.f6177g && this.f6178h == c4410d.f6178h && this.f6179i == c4410d.f6179i && this.f6180j == c4410d.f6180j && this.f6183m == c4410d.f6183m && this.f6184n == c4410d.f6184n && this.f6185o == c4410d.f6185o && this.f6186p == c4410d.f6186p && this.f6187q == c4410d.f6187q && this.f6188r == c4410d.f6188r) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            int hashCode;
            int hashCode2 = (((this.f6172a.hashCode() + 217) * 31) + this.f6174c.hashCode()) * 31;
            Object obj = this.f6175d;
            int i = 0;
            if (obj == null) {
                hashCode = 0;
            } else {
                hashCode = obj.hashCode();
            }
            int i2 = (hashCode2 + hashCode) * 31;
            C5319sd.C5326f c5326f = this.f6182l;
            if (c5326f != null) {
                i = c5326f.hashCode();
            }
            long j = this.f6176f;
            long j2 = this.f6177g;
            long j3 = this.f6178h;
            long j4 = this.f6184n;
            long j5 = this.f6185o;
            long j6 = this.f6188r;
            return ((((((((((((((((((((((i2 + i) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 31) + (this.f6179i ? 1 : 0)) * 31) + (this.f6180j ? 1 : 0)) * 31) + (this.f6183m ? 1 : 0)) * 31) + ((int) (j4 ^ (j4 >>> 32)))) * 31) + ((int) (j5 ^ (j5 >>> 32)))) * 31) + this.f6186p) * 31) + this.f6187q) * 31) + ((int) (j6 ^ (j6 >>> 32)));
        }

        /* renamed from: b */
        public long m99095b() {
            return AbstractC5538t2.m94552b(this.f6184n);
        }

        /* renamed from: a */
        public long m99099a() {
            return AbstractC5863xp.m93038a(this.f6178h);
        }

        /* renamed from: a */
        private static String m99098a(int i) {
            return Integer.toString(i, 36);
        }

        /* renamed from: a */
        public C4410d m99096a(Object obj, C5319sd c5319sd, Object obj2, long j, long j2, long j3, boolean z, boolean z2, C5319sd.C5326f c5326f, long j4, long j5, int i, int i2, long j6) {
            C5319sd.C5328g c5328g;
            this.f6172a = obj;
            this.f6174c = c5319sd != null ? c5319sd : f6170u;
            this.f6173b = (c5319sd == null || (c5328g = c5319sd.f9642b) == null) ? null : c5328g.f9701g;
            this.f6175d = obj2;
            this.f6176f = j;
            this.f6177g = j2;
            this.f6178h = j3;
            this.f6179i = z;
            this.f6180j = z2;
            this.f6181k = c5326f != null;
            this.f6182l = c5326f;
            this.f6184n = j4;
            this.f6185o = j5;
            this.f6186p = i;
            this.f6187q = i2;
            this.f6188r = j6;
            this.f6183m = false;
            return this;
        }
    }

    /* renamed from: a */
    public static AbstractC4406fo m99130a(Bundle bundle) {
        AbstractC4247db m99127a = m99127a(C4410d.f6171v, AbstractC4985n2.m97039a(bundle, m99122c(0)));
        AbstractC4247db m99127a2 = m99127a(C4408b.f6156i, AbstractC4985n2.m97039a(bundle, m99122c(1)));
        int[] intArray = bundle.getIntArray(m99122c(2));
        if (intArray == null) {
            intArray = m99134a(m99127a.size());
        }
        return new C4409c(m99127a, m99127a2, intArray);
    }

    /* renamed from: b */
    public static /* synthetic */ AbstractC4406fo m99124b(Bundle bundle) {
        return m99130a(bundle);
    }

    /* renamed from: a */
    public abstract int mo93564a();

    /* renamed from: a */
    public abstract int mo93561a(Object obj);

    /* renamed from: a */
    public abstract C4408b mo93563a(int i, C4408b c4408b, boolean z);

    /* renamed from: a */
    public abstract C4410d mo93562a(int i, C4410d c4410d, long j);

    /* renamed from: b */
    public abstract int mo93560b();

    /* renamed from: b */
    public abstract Object mo93559b(int i);

    /* renamed from: c */
    public final boolean m99123c() {
        return mo93560b() == 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AbstractC4406fo)) {
            return false;
        }
        AbstractC4406fo abstractC4406fo = (AbstractC4406fo) obj;
        if (abstractC4406fo.mo93560b() != mo93560b() || abstractC4406fo.mo93564a() != mo93564a()) {
            return false;
        }
        C4410d c4410d = new C4410d();
        C4408b c4408b = new C4408b();
        C4410d c4410d2 = new C4410d();
        C4408b c4408b2 = new C4408b();
        for (int i = 0; i < mo93560b(); i++) {
            if (!m99131a(i, c4410d).equals(abstractC4406fo.m99131a(i, c4410d2))) {
                return false;
            }
        }
        for (int i2 = 0; i2 < mo93564a(); i2++) {
            if (!mo93563a(i2, c4408b, true).equals(abstractC4406fo.mo93563a(i2, c4408b2, true))) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        C4410d c4410d = new C4410d();
        C4408b c4408b = new C4408b();
        int mo93560b = mo93560b() + 217;
        for (int i = 0; i < mo93560b(); i++) {
            mo93560b = (mo93560b * 31) + m99131a(i, c4410d).hashCode();
        }
        int mo93564a = (mo93560b * 31) + mo93564a();
        for (int i2 = 0; i2 < mo93564a(); i2++) {
            mo93564a = (mo93564a * 31) + mo93563a(i2, c4408b, true).hashCode();
        }
        return mo93564a;
    }

    /* renamed from: com.applovin.impl.fo$c */
    /* loaded from: classes2.dex */
    public static final class C4409c extends AbstractC4406fo {

        /* renamed from: c */
        private final AbstractC4247db f6164c;

        /* renamed from: d */
        private final AbstractC4247db f6165d;

        /* renamed from: f */
        private final int[] f6166f;

        /* renamed from: g */
        private final int[] f6167g;

        public C4409c(AbstractC4247db abstractC4247db, AbstractC4247db abstractC4247db2, int[] iArr) {
            boolean z;
            if (abstractC4247db.size() == iArr.length) {
                z = true;
            } else {
                z = false;
            }
            AbstractC4100b1.m100580a(z);
            this.f6164c = abstractC4247db;
            this.f6165d = abstractC4247db2;
            this.f6166f = iArr;
            this.f6167g = new int[iArr.length];
            for (int i = 0; i < iArr.length; i++) {
                this.f6167g[iArr[i]] = i;
            }
        }

        @Override // com.applovin.impl.AbstractC4406fo
        /* renamed from: a */
        public int mo98766a(boolean z) {
            if (m99123c()) {
                return -1;
            }
            if (z) {
                return this.f6166f[0];
            }
            return 0;
        }

        @Override // com.applovin.impl.AbstractC4406fo
        /* renamed from: b */
        public int mo98764b(boolean z) {
            if (m99123c()) {
                return -1;
            }
            if (z) {
                return this.f6166f[mo93560b() - 1];
            }
            return mo93560b() - 1;
        }

        @Override // com.applovin.impl.AbstractC4406fo
        /* renamed from: a */
        public int mo98767a(int i, int i2, boolean z) {
            if (i2 == 1) {
                return i;
            }
            if (i != mo98764b(z)) {
                return z ? this.f6166f[this.f6167g[i] + 1] : i + 1;
            } else if (i2 == 2) {
                return mo98766a(z);
            } else {
                return -1;
            }
        }

        @Override // com.applovin.impl.AbstractC4406fo
        /* renamed from: b */
        public int mo98765b(int i, int i2, boolean z) {
            if (i2 == 1) {
                return i;
            }
            if (i != mo98766a(z)) {
                return z ? this.f6166f[this.f6167g[i] - 1] : i - 1;
            } else if (i2 == 2) {
                return mo98764b(z);
            } else {
                return -1;
            }
        }

        @Override // com.applovin.impl.AbstractC4406fo
        /* renamed from: a */
        public C4408b mo93563a(int i, C4408b c4408b, boolean z) {
            C4408b c4408b2 = (C4408b) this.f6165d.get(i);
            c4408b.m99114a(c4408b2.f6157a, c4408b2.f6158b, c4408b2.f6159c, c4408b2.f6160d, c4408b2.f6161f, c4408b2.f6163h, c4408b2.f6162g);
            return c4408b;
        }

        @Override // com.applovin.impl.AbstractC4406fo
        /* renamed from: b */
        public int mo93560b() {
            return this.f6164c.size();
        }

        @Override // com.applovin.impl.AbstractC4406fo
        /* renamed from: b */
        public Object mo93559b(int i) {
            throw new UnsupportedOperationException();
        }

        @Override // com.applovin.impl.AbstractC4406fo
        /* renamed from: a */
        public int mo93564a() {
            return this.f6165d.size();
        }

        @Override // com.applovin.impl.AbstractC4406fo
        /* renamed from: a */
        public C4410d mo93562a(int i, C4410d c4410d, long j) {
            C4410d c4410d2 = (C4410d) this.f6164c.get(i);
            c4410d.m99096a(c4410d2.f6172a, c4410d2.f6174c, c4410d2.f6175d, c4410d2.f6176f, c4410d2.f6177g, c4410d2.f6178h, c4410d2.f6179i, c4410d2.f6180j, c4410d2.f6182l, c4410d2.f6184n, c4410d2.f6185o, c4410d2.f6186p, c4410d2.f6187q, c4410d2.f6188r);
            c4410d.f6183m = c4410d2.f6183m;
            return c4410d;
        }

        @Override // com.applovin.impl.AbstractC4406fo
        /* renamed from: a */
        public int mo93561a(Object obj) {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: c */
    private static String m99122c(int i) {
        return Integer.toString(i, 36);
    }

    /* renamed from: b */
    public int mo98764b(boolean z) {
        if (m99123c()) {
            return -1;
        }
        return mo93560b() - 1;
    }

    /* renamed from: b */
    public int mo98765b(int i, int i2, boolean z) {
        if (i2 == 0) {
            if (i == mo98766a(z)) {
                return -1;
            }
            return i - 1;
        } else if (i2 != 1) {
            if (i2 == 2) {
                return i == mo98766a(z) ? mo98764b(z) : i - 1;
            }
            throw new IllegalStateException();
        } else {
            return i;
        }
    }

    /* renamed from: b */
    public final boolean m99125b(int i, C4408b c4408b, C4410d c4410d, int i2, boolean z) {
        return m99132a(i, c4408b, c4410d, i2, z) == -1;
    }

    /* renamed from: a */
    private static AbstractC4247db m99127a(InterfaceC5044o2.InterfaceC5045a interfaceC5045a, IBinder iBinder) {
        if (iBinder == null) {
            return AbstractC4247db.m99829h();
        }
        AbstractC4247db.C4248a c4248a = new AbstractC4247db.C4248a();
        AbstractC4247db m97614a = AbstractBinderC4807m2.m97614a(iBinder);
        for (int i = 0; i < m97614a.size(); i++) {
            c4248a.m99827b(interfaceC5045a.mo92505a((Bundle) m97614a.get(i)));
        }
        return c4248a.m99828a();
    }

    /* renamed from: a */
    private static int[] m99134a(int i) {
        int[] iArr = new int[i];
        for (int i2 = 0; i2 < i; i2++) {
            iArr[i2] = i2;
        }
        return iArr;
    }

    /* renamed from: a */
    public int mo98766a(boolean z) {
        return m99123c() ? -1 : 0;
    }

    /* renamed from: a */
    public final int m99132a(int i, C4408b c4408b, C4410d c4410d, int i2, boolean z) {
        int i3 = m99133a(i, c4408b).f6159c;
        if (m99131a(i3, c4410d).f6187q == i) {
            int mo98767a = mo98767a(i3, i2, z);
            if (mo98767a == -1) {
                return -1;
            }
            return m99131a(mo98767a, c4410d).f6186p;
        }
        return i + 1;
    }

    /* renamed from: a */
    public int mo98767a(int i, int i2, boolean z) {
        if (i2 == 0) {
            if (i == mo98764b(z)) {
                return -1;
            }
            return i + 1;
        } else if (i2 != 1) {
            if (i2 == 2) {
                return i == mo98764b(z) ? mo98766a(z) : i + 1;
            }
            throw new IllegalStateException();
        } else {
            return i;
        }
    }

    /* renamed from: a */
    public final C4408b m99133a(int i, C4408b c4408b) {
        return mo93563a(i, c4408b, false);
    }

    /* renamed from: a */
    public C4408b mo99126a(Object obj, C4408b c4408b) {
        return mo93563a(mo93561a(obj), c4408b, true);
    }

    /* renamed from: a */
    public final Pair m99129a(C4410d c4410d, C4408b c4408b, int i, long j) {
        return (Pair) AbstractC4100b1.m100583a(m99128a(c4410d, c4408b, i, j, 0L));
    }

    /* renamed from: a */
    public final Pair m99128a(C4410d c4410d, C4408b c4408b, int i, long j, long j2) {
        AbstractC4100b1.m100584a(i, 0, mo93560b());
        mo93562a(i, c4410d, j2);
        if (j == -9223372036854775807L) {
            j = c4410d.m99093c();
            if (j == -9223372036854775807L) {
                return null;
            }
        }
        int i2 = c4410d.f6186p;
        m99133a(i2, c4408b);
        while (i2 < c4410d.f6187q && c4408b.f6161f != j) {
            int i3 = i2 + 1;
            if (m99133a(i3, c4408b).f6161f > j) {
                break;
            }
            i2 = i3;
        }
        mo93563a(i2, c4408b, true);
        long j3 = j - c4408b.f6161f;
        long j4 = c4408b.f6160d;
        if (j4 != -9223372036854775807L) {
            j3 = Math.min(j3, j4 - 1);
        }
        return Pair.create(AbstractC4100b1.m100583a(c4408b.f6158b), Long.valueOf(Math.max(0L, j3)));
    }

    /* renamed from: a */
    public final C4410d m99131a(int i, C4410d c4410d) {
        return mo93562a(i, c4410d, 0L);
    }
}
