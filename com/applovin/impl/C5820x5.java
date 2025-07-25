package com.applovin.impl;

import android.media.ResourceBusyException;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import com.applovin.impl.C5750w5;
import com.applovin.impl.C5820x5;
import com.applovin.impl.C5829x6;
import com.applovin.impl.InterfaceC3993a7;
import com.applovin.impl.InterfaceC5897y6;
import com.applovin.impl.InterfaceC5899y7;
import com.applovin.impl.InterfaceC5956z6;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.UUID;

/* renamed from: com.applovin.impl.x5 */
/* loaded from: classes2.dex */
public class C5820x5 implements InterfaceC3993a7 {

    /* renamed from: c */
    private final UUID f11890c;

    /* renamed from: d */
    private final InterfaceC5899y7.InterfaceC5902c f11891d;

    /* renamed from: e */
    private final InterfaceC5119pd f11892e;

    /* renamed from: f */
    private final HashMap f11893f;

    /* renamed from: g */
    private final boolean f11894g;

    /* renamed from: h */
    private final int[] f11895h;

    /* renamed from: i */
    private final boolean f11896i;

    /* renamed from: j */
    private final C5827g f11897j;

    /* renamed from: k */
    private final InterfaceC4768lc f11898k;

    /* renamed from: l */
    private final C5828h f11899l;

    /* renamed from: m */
    private final long f11900m;

    /* renamed from: n */
    private final List f11901n;

    /* renamed from: o */
    private final Set f11902o;

    /* renamed from: p */
    private final Set f11903p;

    /* renamed from: q */
    private int f11904q;

    /* renamed from: r */
    private InterfaceC5899y7 f11905r;

    /* renamed from: s */
    private C5750w5 f11906s;

    /* renamed from: t */
    private C5750w5 f11907t;

    /* renamed from: u */
    private Looper f11908u;

    /* renamed from: v */
    private Handler f11909v;

    /* renamed from: w */
    private int f11910w;

    /* renamed from: x */
    private byte[] f11911x;

    /* renamed from: y */
    volatile HandlerC5824d f11912y;

    /* renamed from: com.applovin.impl.x5$b */
    /* loaded from: classes2.dex */
    public static final class C5822b {

        /* renamed from: d */
        private boolean f11916d;

        /* renamed from: f */
        private boolean f11918f;

        /* renamed from: a */
        private final HashMap f11913a = new HashMap();

        /* renamed from: b */
        private UUID f11914b = AbstractC5538t2.f10801d;

        /* renamed from: c */
        private InterfaceC5899y7.InterfaceC5902c f11915c = C4762l9.f7708d;

        /* renamed from: g */
        private InterfaceC4768lc f11919g = new C4380f6();

        /* renamed from: e */
        private int[] f11917e = new int[0];

        /* renamed from: h */
        private long f11920h = 300000;

        /* renamed from: a */
        public C5822b m93242a(boolean z) {
            this.f11916d = z;
            return this;
        }

        /* renamed from: b */
        public C5822b m93240b(boolean z) {
            this.f11918f = z;
            return this;
        }

        /* renamed from: a */
        public C5822b m93241a(int... iArr) {
            for (int i : iArr) {
                boolean z = true;
                if (i != 2 && i != 1) {
                    z = false;
                }
                AbstractC4100b1.m100580a(z);
            }
            this.f11917e = (int[]) iArr.clone();
            return this;
        }

        /* renamed from: a */
        public C5822b m93243a(UUID uuid, InterfaceC5899y7.InterfaceC5902c interfaceC5902c) {
            this.f11914b = (UUID) AbstractC4100b1.m100583a(uuid);
            this.f11915c = (InterfaceC5899y7.InterfaceC5902c) AbstractC4100b1.m100583a(interfaceC5902c);
            return this;
        }

        /* renamed from: a */
        public C5820x5 m93244a(InterfaceC5119pd interfaceC5119pd) {
            return new C5820x5(this.f11914b, this.f11915c, interfaceC5119pd, this.f11913a, this.f11916d, this.f11917e, this.f11918f, this.f11919g, this.f11920h);
        }
    }

    /* renamed from: com.applovin.impl.x5$c */
    /* loaded from: classes2.dex */
    private class C5823c implements InterfaceC5899y7.InterfaceC5901b {
        private C5823c() {
            C5820x5.this = r1;
        }

        @Override // com.applovin.impl.InterfaceC5899y7.InterfaceC5901b
        /* renamed from: a */
        public void mo92792a(InterfaceC5899y7 interfaceC5899y7, byte[] bArr, int i, int i2, byte[] bArr2) {
            ((HandlerC5824d) AbstractC4100b1.m100583a(C5820x5.this.f11912y)).obtainMessage(i, bArr).sendToTarget();
        }
    }

    /* renamed from: com.applovin.impl.x5$d */
    /* loaded from: classes2.dex */
    public class HandlerC5824d extends Handler {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public HandlerC5824d(Looper looper) {
            super(looper);
            C5820x5.this = r1;
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            byte[] bArr = (byte[]) message.obj;
            if (bArr == null) {
                return;
            }
            for (C5750w5 c5750w5 : C5820x5.this.f11901n) {
                if (c5750w5.m93691a(bArr)) {
                    c5750w5.m93701a(message.what);
                    return;
                }
            }
        }
    }

    /* renamed from: com.applovin.impl.x5$e */
    /* loaded from: classes2.dex */
    public static final class C5825e extends Exception {
        private C5825e(UUID uuid) {
            super("Media does not support uuid: " + uuid);
        }
    }

    /* renamed from: com.applovin.impl.x5$f */
    /* loaded from: classes2.dex */
    public class C5826f implements InterfaceC3993a7.InterfaceC3995b {

        /* renamed from: b */
        private final InterfaceC5956z6.C5957a f11923b;

        /* renamed from: c */
        private InterfaceC5897y6 f11924c;

        /* renamed from: d */
        private boolean f11925d;

        public C5826f(InterfaceC5956z6.C5957a c5957a) {
            C5820x5.this = r1;
            this.f11923b = c5957a;
        }

        /* renamed from: c */
        public /* synthetic */ void m93234c() {
            if (this.f11925d) {
                return;
            }
            InterfaceC5897y6 interfaceC5897y6 = this.f11924c;
            if (interfaceC5897y6 != null) {
                interfaceC5897y6.mo92815a(this.f11923b);
            }
            C5820x5.this.f11902o.remove(this);
            this.f11925d = true;
        }

        /* renamed from: b */
        public /* synthetic */ void m93236b(C4310e9 c4310e9) {
            if (C5820x5.this.f11904q == 0 || this.f11925d) {
                return;
            }
            C5820x5 c5820x5 = C5820x5.this;
            this.f11924c = c5820x5.m93272a((Looper) AbstractC4100b1.m100583a(c5820x5.f11908u), this.f11923b, c4310e9, false);
            C5820x5.this.f11902o.add(this);
        }

        /* renamed from: a */
        public void m93238a(final C4310e9 c4310e9) {
            ((Handler) AbstractC4100b1.m100583a(C5820x5.this.f11909v)).post(new Runnable() { // from class: com.applovin.impl.m80
                {
                    C5820x5.C5826f.this = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    C5820x5.C5826f.this.m93236b(c4310e9);
                }
            });
        }

        @Override // com.applovin.impl.InterfaceC3993a7.InterfaceC3995b
        /* renamed from: a */
        public void mo93239a() {
            AbstractC5863xp.m93028a((Handler) AbstractC4100b1.m100583a(C5820x5.this.f11909v), new Runnable() { // from class: com.applovin.impl.l80
                {
                    C5820x5.C5826f.this = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    C5820x5.C5826f.this.m93234c();
                }
            });
        }
    }

    /* renamed from: com.applovin.impl.x5$h */
    /* loaded from: classes2.dex */
    public class C5828h implements C5750w5.InterfaceC5752b {
        private C5828h() {
            C5820x5.this = r1;
        }

        @Override // com.applovin.impl.C5750w5.InterfaceC5752b
        /* renamed from: a */
        public void mo93228a(C5750w5 c5750w5, int i) {
            if (C5820x5.this.f11900m != -9223372036854775807L) {
                C5820x5.this.f11903p.remove(c5750w5);
                ((Handler) AbstractC4100b1.m100583a(C5820x5.this.f11909v)).removeCallbacksAndMessages(c5750w5);
            }
        }

        @Override // com.applovin.impl.C5750w5.InterfaceC5752b
        /* renamed from: b */
        public void mo93226b(final C5750w5 c5750w5, int i) {
            if (i == 1 && C5820x5.this.f11904q > 0 && C5820x5.this.f11900m != -9223372036854775807L) {
                C5820x5.this.f11903p.add(c5750w5);
                ((Handler) AbstractC4100b1.m100583a(C5820x5.this.f11909v)).postAtTime(new Runnable() { // from class: com.applovin.impl.n80
                    @Override // java.lang.Runnable
                    public final void run() {
                        C5750w5.this.mo92815a((InterfaceC5956z6.C5957a) null);
                    }
                }, c5750w5, SystemClock.uptimeMillis() + C5820x5.this.f11900m);
            } else if (i == 0) {
                C5820x5.this.f11901n.remove(c5750w5);
                if (C5820x5.this.f11906s == c5750w5) {
                    C5820x5.this.f11906s = null;
                }
                if (C5820x5.this.f11907t == c5750w5) {
                    C5820x5.this.f11907t = null;
                }
                C5820x5.this.f11897j.m93230b(c5750w5);
                if (C5820x5.this.f11900m != -9223372036854775807L) {
                    ((Handler) AbstractC4100b1.m100583a(C5820x5.this.f11909v)).removeCallbacksAndMessages(c5750w5);
                    C5820x5.this.f11903p.remove(c5750w5);
                }
            }
            C5820x5.this.m93256c();
        }
    }

    private C5820x5(UUID uuid, InterfaceC5899y7.InterfaceC5902c interfaceC5902c, InterfaceC5119pd interfaceC5119pd, HashMap hashMap, boolean z, int[] iArr, boolean z2, InterfaceC4768lc interfaceC4768lc, long j) {
        AbstractC4100b1.m100583a(uuid);
        AbstractC4100b1.m100579a(!AbstractC5538t2.f10799b.equals(uuid), "Use C.CLEARKEY_UUID instead");
        this.f11890c = uuid;
        this.f11891d = interfaceC5902c;
        this.f11892e = interfaceC5119pd;
        this.f11893f = hashMap;
        this.f11894g = z;
        this.f11895h = iArr;
        this.f11896i = z2;
        this.f11898k = interfaceC4768lc;
        this.f11897j = new C5827g();
        this.f11899l = new C5828h();
        this.f11910w = 0;
        this.f11901n = new ArrayList();
        this.f11902o = AbstractC5270rj.m95830b();
        this.f11903p = AbstractC5270rj.m95830b();
        this.f11900m = j;
    }

    /* renamed from: c */
    public void m93256c() {
        if (this.f11905r != null && this.f11904q == 0 && this.f11901n.isEmpty() && this.f11902o.isEmpty()) {
            ((InterfaceC5899y7) AbstractC4100b1.m100583a(this.f11905r)).mo92807a();
            this.f11905r = null;
        }
    }

    /* renamed from: d */
    private void m93254d() {
        AbstractC5139pp it = AbstractC4518hb.m98743a((Collection) this.f11903p).iterator();
        while (it.hasNext()) {
            ((InterfaceC5897y6) it.next()).mo92815a((InterfaceC5956z6.C5957a) null);
        }
    }

    /* renamed from: e */
    private void m93252e() {
        AbstractC5139pp it = AbstractC4518hb.m98743a((Collection) this.f11902o).iterator();
        while (it.hasNext()) {
            ((C5826f) it.next()).mo93239a();
        }
    }

    /* renamed from: b */
    private void m93260b(Looper looper) {
        if (this.f11912y == null) {
            this.f11912y = new HandlerC5824d(looper);
        }
    }

    @Override // com.applovin.impl.InterfaceC3993a7
    /* renamed from: a */
    public InterfaceC5897y6 mo93273a(Looper looper, InterfaceC5956z6.C5957a c5957a, C4310e9 c4310e9) {
        AbstractC4100b1.m100577b(this.f11904q > 0);
        m93274a(looper);
        return m93272a(looper, c5957a, c4310e9, true);
    }

    @Override // com.applovin.impl.InterfaceC3993a7
    /* renamed from: b */
    public InterfaceC3993a7.InterfaceC3995b mo93259b(Looper looper, InterfaceC5956z6.C5957a c5957a, C4310e9 c4310e9) {
        AbstractC4100b1.m100577b(this.f11904q > 0);
        m93274a(looper);
        C5826f c5826f = new C5826f(c5957a);
        c5826f.m93238a(c4310e9);
        return c5826f;
    }

    /* renamed from: com.applovin.impl.x5$g */
    /* loaded from: classes2.dex */
    public class C5827g implements C5750w5.InterfaceC5751a {

        /* renamed from: a */
        private final Set f11927a = new HashSet();

        /* renamed from: b */
        private C5750w5 f11928b;

        public C5827g() {
            C5820x5.this = r1;
        }

        @Override // com.applovin.impl.C5750w5.InterfaceC5751a
        /* renamed from: a */
        public void mo93233a() {
            this.f11928b = null;
            AbstractC4247db m99838a = AbstractC4247db.m99838a((Collection) this.f11927a);
            this.f11927a.clear();
            AbstractC5139pp it = m99838a.iterator();
            while (it.hasNext()) {
                ((C5750w5) it.next()).m93682i();
            }
        }

        /* renamed from: b */
        public void m93230b(C5750w5 c5750w5) {
            this.f11927a.remove(c5750w5);
            if (this.f11928b == c5750w5) {
                this.f11928b = null;
                if (!this.f11927a.isEmpty()) {
                    C5750w5 c5750w52 = (C5750w5) this.f11927a.iterator().next();
                    this.f11928b = c5750w52;
                    c5750w52.m93680k();
                }
            }
        }

        @Override // com.applovin.impl.C5750w5.InterfaceC5751a
        /* renamed from: a */
        public void mo93231a(Exception exc, boolean z) {
            this.f11928b = null;
            AbstractC4247db m99838a = AbstractC4247db.m99838a((Collection) this.f11927a);
            this.f11927a.clear();
            AbstractC5139pp it = m99838a.iterator();
            while (it.hasNext()) {
                ((C5750w5) it.next()).m93687b(exc, z);
            }
        }

        @Override // com.applovin.impl.C5750w5.InterfaceC5751a
        /* renamed from: a */
        public void mo93232a(C5750w5 c5750w5) {
            this.f11927a.add(c5750w5);
            if (this.f11928b != null) {
                return;
            }
            this.f11928b = c5750w5;
            c5750w5.m93680k();
        }
    }

    /* renamed from: a */
    public InterfaceC5897y6 m93272a(Looper looper, InterfaceC5956z6.C5957a c5957a, C4310e9 c4310e9, boolean z) {
        List list;
        m93260b(looper);
        C5829x6 c5829x6 = c4310e9.f5816p;
        if (c5829x6 == null) {
            return m93276a(AbstractC4524hf.m98695e(c4310e9.f5813m), z);
        }
        C5750w5 c5750w5 = null;
        if (this.f11911x == null) {
            list = m93266a((C5829x6) AbstractC4100b1.m100583a(c5829x6), this.f11890c, false);
            if (list.isEmpty()) {
                C5825e c5825e = new C5825e(this.f11890c);
                AbstractC5063oc.m96808a("DefaultDrmSessionMgr", "DRM error", c5825e);
                if (c5957a != null) {
                    c5957a.m92489a(c5825e);
                }
                return new C5543t7(new InterfaceC5897y6.C5898a(c5825e, 6003));
            }
        } else {
            list = null;
        }
        if (!this.f11894g) {
            c5750w5 = this.f11907t;
        } else {
            Iterator it = this.f11901n.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                C5750w5 c5750w52 = (C5750w5) it.next();
                if (AbstractC5863xp.m93016a(c5750w52.f11639a, list)) {
                    c5750w5 = c5750w52;
                    break;
                }
            }
        }
        if (c5750w5 == null) {
            c5750w5 = m93262a(list, false, c5957a, z);
            if (!this.f11894g) {
                this.f11907t = c5750w5;
            }
            this.f11901n.add(c5750w5);
        } else {
            c5750w5.mo92812b(c5957a);
        }
        return c5750w5;
    }

    @Override // com.applovin.impl.InterfaceC3993a7
    /* renamed from: b */
    public final void mo93261b() {
        int i = this.f11904q;
        this.f11904q = i + 1;
        if (i != 0) {
            return;
        }
        if (this.f11905r == null) {
            InterfaceC5899y7 mo92304a = this.f11891d.mo92304a(this.f11890c);
            this.f11905r = mo92304a;
            mo92304a.mo92806a(new C5823c());
        } else if (this.f11900m != -9223372036854775807L) {
            for (int i2 = 0; i2 < this.f11901n.size(); i2++) {
                ((C5750w5) this.f11901n.get(i2)).mo92812b(null);
            }
        }
    }

    /* renamed from: a */
    private static boolean m93265a(InterfaceC5897y6 interfaceC5897y6) {
        return interfaceC5897y6.mo92813b() == 1 && (AbstractC5863xp.f12151a < 19 || (((InterfaceC5897y6.C5898a) AbstractC4100b1.m100583a(interfaceC5897y6.getError())).getCause() instanceof ResourceBusyException));
    }

    /* renamed from: a */
    private boolean m93267a(C5829x6 c5829x6) {
        if (this.f11911x != null) {
            return true;
        }
        if (m93266a(c5829x6, this.f11890c, true).isEmpty()) {
            if (c5829x6.f11936d != 1 || !c5829x6.m93225a(0).m93220a(AbstractC5538t2.f10799b)) {
                return false;
            }
            AbstractC5063oc.m96800d("DefaultDrmSessionMgr", "DrmInitData only contains common PSSH SchemeData. Assuming support for: " + this.f11890c);
        }
        String str = c5829x6.f11935c;
        if (str == null || "cenc".equals(str)) {
            return true;
        }
        return "cbcs".equals(str) ? AbstractC5863xp.f12151a >= 25 : ("cbc1".equals(str) || "cens".equals(str)) ? false : true;
    }

    /* renamed from: a */
    private C5750w5 m93263a(List list, boolean z, InterfaceC5956z6.C5957a c5957a) {
        AbstractC4100b1.m100583a(this.f11905r);
        C5750w5 c5750w5 = new C5750w5(this.f11890c, this.f11905r, this.f11897j, this.f11899l, list, this.f11910w, this.f11896i | z, z, this.f11911x, this.f11893f, this.f11892e, (Looper) AbstractC4100b1.m100583a(this.f11908u), this.f11898k);
        c5750w5.mo92812b(c5957a);
        if (this.f11900m != -9223372036854775807L) {
            c5750w5.mo92812b(null);
        }
        return c5750w5;
    }

    /* renamed from: a */
    private C5750w5 m93262a(List list, boolean z, InterfaceC5956z6.C5957a c5957a, boolean z2) {
        C5750w5 m93263a = m93263a(list, z, c5957a);
        if (m93265a(m93263a) && !this.f11903p.isEmpty()) {
            m93254d();
            m93264a(m93263a, c5957a);
            m93263a = m93263a(list, z, c5957a);
        }
        if (m93265a(m93263a) && z2 && !this.f11902o.isEmpty()) {
            m93252e();
            if (!this.f11903p.isEmpty()) {
                m93254d();
            }
            m93264a(m93263a, c5957a);
            return m93263a(list, z, c5957a);
        }
        return m93263a;
    }

    @Override // com.applovin.impl.InterfaceC3993a7
    /* renamed from: a */
    public int mo93271a(C4310e9 c4310e9) {
        int mo92798c = ((InterfaceC5899y7) AbstractC4100b1.m100583a(this.f11905r)).mo92798c();
        C5829x6 c5829x6 = c4310e9.f5816p;
        if (c5829x6 == null) {
            if (AbstractC5863xp.m93004a(this.f11895h, AbstractC4524hf.m98695e(c4310e9.f5813m)) != -1) {
                return mo92798c;
            }
            return 0;
        } else if (m93267a(c5829x6)) {
            return mo92798c;
        } else {
            return 1;
        }
    }

    /* renamed from: a */
    private synchronized void m93274a(Looper looper) {
        Looper looper2 = this.f11908u;
        if (looper2 == null) {
            this.f11908u = looper;
            this.f11909v = new Handler(looper);
        } else {
            AbstractC4100b1.m100577b(looper2 == looper);
            AbstractC4100b1.m100583a(this.f11909v);
        }
    }

    /* renamed from: a */
    private InterfaceC5897y6 m93276a(int i, boolean z) {
        InterfaceC5899y7 interfaceC5899y7 = (InterfaceC5899y7) AbstractC4100b1.m100583a(this.f11905r);
        if ((interfaceC5899y7.mo92798c() == 2 && C4704k9.f7396d) || AbstractC5863xp.m93004a(this.f11895h, i) == -1 || interfaceC5899y7.mo92798c() == 1) {
            return null;
        }
        C5750w5 c5750w5 = this.f11906s;
        if (c5750w5 == null) {
            C5750w5 m93262a = m93262a((List) AbstractC4247db.m99829h(), true, (InterfaceC5956z6.C5957a) null, z);
            this.f11901n.add(m93262a);
            this.f11906s = m93262a;
        } else {
            c5750w5.mo92812b(null);
        }
        return this.f11906s;
    }

    @Override // com.applovin.impl.InterfaceC3993a7
    /* renamed from: a */
    public final void mo93277a() {
        int i = this.f11904q - 1;
        this.f11904q = i;
        if (i != 0) {
            return;
        }
        if (this.f11900m != -9223372036854775807L) {
            ArrayList arrayList = new ArrayList(this.f11901n);
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                ((C5750w5) arrayList.get(i2)).mo92815a((InterfaceC5956z6.C5957a) null);
            }
        }
        m93252e();
        m93256c();
    }

    /* renamed from: a */
    public void m93275a(int i, byte[] bArr) {
        AbstractC4100b1.m100577b(this.f11901n.isEmpty());
        if (i == 1 || i == 3) {
            AbstractC4100b1.m100583a(bArr);
        }
        this.f11910w = i;
        this.f11911x = bArr;
    }

    /* renamed from: a */
    private void m93264a(InterfaceC5897y6 interfaceC5897y6, InterfaceC5956z6.C5957a c5957a) {
        interfaceC5897y6.mo92815a(c5957a);
        if (this.f11900m != -9223372036854775807L) {
            interfaceC5897y6.mo92815a((InterfaceC5956z6.C5957a) null);
        }
    }

    /* renamed from: a */
    private static List m93266a(C5829x6 c5829x6, UUID uuid, boolean z) {
        ArrayList arrayList = new ArrayList(c5829x6.f11936d);
        for (int i = 0; i < c5829x6.f11936d; i++) {
            C5829x6.C5831b m93225a = c5829x6.m93225a(i);
            if ((m93225a.m93220a(uuid) || (AbstractC5538t2.f10800c.equals(uuid) && m93225a.m93220a(AbstractC5538t2.f10799b))) && (m93225a.f11941f != null || z)) {
                arrayList.add(m93225a);
            }
        }
        return arrayList;
    }
}
