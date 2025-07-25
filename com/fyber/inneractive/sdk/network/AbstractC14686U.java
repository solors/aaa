package com.fyber.inneractive.sdk.network;

import android.util.Log;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.global.C14388r;
import com.fyber.inneractive.sdk.config.global.features.C14365l;
import com.fyber.inneractive.sdk.factories.AbstractC14468d;
import com.fyber.inneractive.sdk.factories.C14470f;
import com.fyber.inneractive.sdk.factories.InterfaceC14469e;
import com.fyber.inneractive.sdk.p374dv.C14449j;
import com.fyber.inneractive.sdk.response.AbstractC15383b;
import com.fyber.inneractive.sdk.response.AbstractC15386e;
import com.fyber.inneractive.sdk.response.C15392k;
import com.fyber.inneractive.sdk.response.EnumC15382a;
import com.fyber.inneractive.sdk.response.InterfaceC15391j;
import com.fyber.inneractive.sdk.util.AbstractC15459m;
import com.fyber.inneractive.sdk.util.AbstractC15465p;
import com.fyber.inneractive.sdk.util.IAlog;
import com.learnings.purchase.event.EventUploader;
import java.util.Map;
import java.util.UUID;

/* renamed from: com.fyber.inneractive.sdk.network.U */
/* loaded from: classes4.dex */
public abstract class AbstractC14686U {

    /* renamed from: a */
    public volatile boolean f27824a;

    /* renamed from: b */
    public final InterfaceC14671E f27825b;

    /* renamed from: c */
    public final InterfaceC14706h f27826c;

    /* renamed from: d */
    public InterfaceC14682P f27827d;

    /* renamed from: e */
    public C14714l f27828e;

    /* renamed from: f */
    public volatile EnumC14709i0 f27829f;

    /* renamed from: g */
    public final String f27830g;

    /* renamed from: h */
    public final C14388r f27831h;

    /* renamed from: i */
    public long f27832i;

    /* renamed from: j */
    public long f27833j;

    /* renamed from: k */
    public int f27834k;

    /* renamed from: l */
    public boolean f27835l;

    /* renamed from: m */
    public boolean f27836m;

    /* renamed from: n */
    public final Object f27837n;

    /* renamed from: o */
    public boolean f27838o;

    public AbstractC14686U(InterfaceC14671E interfaceC14671E, InterfaceC14706h interfaceC14706h, C14388r c14388r) {
        this.f27824a = false;
        this.f27829f = EnumC14709i0.INITIAL;
        this.f27832i = 0L;
        this.f27833j = 0L;
        this.f27834k = 0;
        this.f27835l = false;
        this.f27836m = false;
        this.f27837n = new Object();
        this.f27838o = false;
        this.f27825b = interfaceC14671E;
        this.f27826c = interfaceC14706h;
        this.f27830g = UUID.randomUUID().toString();
        this.f27831h = c14388r;
    }

    /* renamed from: a */
    public abstract C14681O mo77696a(C14714l c14714l, Map map, int i);

    /* renamed from: a */
    public void mo77715a(C14681O c14681o, String str, String str2) {
    }

    /* renamed from: b */
    public void mo77705b(long j) {
        synchronized (this.f27837n) {
            if (this.f27836m) {
                this.f27834k = (int) ((j - this.f27832i) + this.f27834k);
                this.f27836m = false;
            }
        }
    }

    /* renamed from: c */
    public void mo77704c() {
        boolean z;
        synchronized (this.f27837n) {
            z = this.f27835l;
        }
        if (z) {
            mo77707a(System.currentTimeMillis());
        } else if (m77717r()) {
            mo77705b(System.currentTimeMillis());
        }
    }

    /* renamed from: d */
    public byte[] mo77711d() {
        return null;
    }

    /* renamed from: e */
    public abstract int mo77695e();

    /* renamed from: f */
    public String mo77714f() {
        return null;
    }

    /* renamed from: g */
    public C14692a mo77713g() {
        return null;
    }

    /* renamed from: h */
    public int mo77701h() {
        return this.f27834k;
    }

    /* renamed from: i */
    public C14388r mo77700i() {
        return this.f27831h;
    }

    /* renamed from: j */
    public Map mo77718j() {
        return null;
    }

    /* renamed from: k */
    public abstract EnumC14679M mo77694k();

    /* renamed from: l */
    public String mo77710l() {
        return EventUploader.MEDIA_TYPE_JSON;
    }

    /* renamed from: m */
    public abstract EnumC14705g0 mo77693m();

    /* renamed from: n */
    public C14715l0 mo77699n() {
        IAConfigManager iAConfigManager = IAConfigManager.f27060O;
        return new C14715l0(iAConfigManager.f27097u.f27275b.m77919a("connect_timeout", 5000, 1), iAConfigManager.f27097u.f27275b.m77919a("read_timeout", 5000, 1));
    }

    /* renamed from: o */
    public int mo77698o() {
        int i;
        synchronized (this.f27837n) {
            i = this.f27834k;
        }
        return i;
    }

    /* renamed from: p */
    public abstract String mo77692p();

    /* renamed from: q */
    public int mo77697q() {
        Integer mo77934a;
        C14388r c14388r = this.f27831h;
        if (c14388r == null || (mo77934a = ((C14365l) c14388r.m77927a(C14365l.class)).mo77934a("watchdog_buffer_time_ms")) == null) {
            return 500;
        }
        return mo77934a.intValue();
    }

    /* renamed from: r */
    public final boolean m77717r() {
        boolean z;
        synchronized (this.f27837n) {
            z = this.f27836m;
        }
        return z;
    }

    /* renamed from: s */
    public abstract boolean mo77691s();

    /* JADX WARN: Removed duplicated region for block: B:42:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:45:? A[RETURN, SYNTHETIC] */
    /* renamed from: t */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean m77716t() {
        /*
            r4 = this;
            boolean r0 = r4.f27838o
            r1 = 0
            if (r0 == 0) goto L39
            com.fyber.inneractive.sdk.config.IAConfigManager r0 = com.fyber.inneractive.sdk.config.IAConfigManager.f27060O
            com.fyber.inneractive.sdk.config.global.r r0 = r0.f27075M
            java.lang.Class<com.fyber.inneractive.sdk.config.global.features.l> r2 = com.fyber.inneractive.sdk.config.global.features.C14365l.class
            com.fyber.inneractive.sdk.config.global.features.h r0 = r0.m77927a(r2)
            com.fyber.inneractive.sdk.config.global.features.l r0 = (com.fyber.inneractive.sdk.config.global.features.C14365l) r0
            java.lang.String r2 = "should_add_request_watchdog"
            java.lang.Boolean r2 = r0.mo77930c(r2)
            if (r2 == 0) goto L1e
            boolean r2 = r2.booleanValue()
            goto L1f
        L1e:
            r2 = r1
        L1f:
            r3 = 1
            if (r2 != 0) goto L35
            java.lang.String r2 = "should_report_request_watchdog"
            java.lang.Boolean r0 = r0.mo77930c(r2)
            if (r0 == 0) goto L2f
            boolean r0 = r0.booleanValue()
            goto L30
        L2f:
            r0 = r1
        L30:
            if (r0 == 0) goto L33
            goto L35
        L33:
            r0 = r1
            goto L36
        L35:
            r0 = r3
        L36:
            if (r0 == 0) goto L39
            r1 = r3
        L39:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.network.AbstractC14686U.m77716t():boolean");
    }

    /* renamed from: a */
    public C14714l mo77706a(String str) {
        try {
            InterfaceC14682P interfaceC14682P = this.f27827d;
            if (interfaceC14682P != null) {
                interfaceC14682P.mo77674a("sdkInitNetworkRequest");
            }
            this.f27828e = this.f27826c.mo77679a(this, AbstractC15459m.m76473i(), str);
            InterfaceC14682P interfaceC14682P2 = this.f27827d;
            if (interfaceC14682P2 != null) {
                interfaceC14682P2.mo77674a("sdkGotServerResponse");
            }
            return this.f27828e;
        } catch (C14694b e) {
            IAlog.m76530a("failed start network request", e, new Object[0]);
            throw e;
        } catch (C14725q0 e2) {
            IAlog.m76530a("failed read network response", e2, new Object[0]);
            throw e2;
        } catch (Exception e3) {
            IAlog.m76530a("failed start network request", e3, new Object[0]);
            throw e3;
        }
    }

    /* renamed from: d */
    public void mo77702d(long j) {
        synchronized (this.f27837n) {
            if (!this.f27836m) {
                this.f27836m = true;
                this.f27832i = j;
            }
        }
    }

    /* renamed from: c */
    public void mo77703c(long j) {
        synchronized (this.f27837n) {
            if (!this.f27835l) {
                this.f27835l = true;
                this.f27833j = j;
            }
        }
    }

    public AbstractC14686U(AbstractC14686U abstractC14686U) {
        this.f27824a = false;
        this.f27829f = EnumC14709i0.INITIAL;
        this.f27832i = 0L;
        this.f27833j = 0L;
        this.f27834k = 0;
        this.f27835l = false;
        this.f27836m = false;
        this.f27837n = new Object();
        this.f27838o = false;
        this.f27825b = abstractC14686U.f27825b;
        this.f27826c = abstractC14686U.f27826c;
        this.f27830g = UUID.randomUUID().toString();
        this.f27831h = abstractC14686U.f27831h;
        this.f27834k = abstractC14686U.f27834k;
        this.f27832i = abstractC14686U.f27832i;
        this.f27833j = abstractC14686U.f27833j;
    }

    /* renamed from: a */
    public final void m77719a(Object obj, Exception exc, boolean z) {
        InterfaceC14682P interfaceC14682P;
        if (!z) {
            EnumC14709i0 enumC14709i0 = EnumC14709i0.RESOLVED;
            this.f27829f = enumC14709i0;
            if (enumC14709i0 == EnumC14709i0.QUEUED_FOR_RETRY && (interfaceC14682P = this.f27827d) != null) {
                interfaceC14682P.mo77674a("sdkRequestEndedButWillBeRetried");
            }
        }
        AbstractC15465p.f30612b.post(new RunnableC14685T(this, obj, exc, z));
    }

    /* renamed from: a */
    public final AbstractC15386e m77720a(int i, InterfaceC14720o interfaceC14720o, InterfaceC15391j interfaceC15391j, C14449j c14449j) {
        try {
            EnumC15382a m76585a = EnumC15382a.m76585a(i);
            if (m76585a == null) {
                m76585a = EnumC15382a.RETURNED_ADTYPE_MRAID;
            }
            C14470f c14470f = AbstractC14468d.f27380a;
            InterfaceC14469e interfaceC14469e = (InterfaceC14469e) c14470f.f27381a.get(m76585a);
            AbstractC15383b mo76441b = interfaceC14469e != null ? interfaceC14469e.mo76441b() : null;
            if (mo76441b == null) {
                IAlog.m76524f("Received ad type %s does not have an appropriate parser!", Integer.valueOf(i));
                if (c14470f.f27381a.size() == 0) {
                    Log.e("Inneractive_error", "Critical error raised while fetching an ad - please make sure you have added all the required fyber libraries (ia-mraid-kit, ia-video-kit) to your project");
                }
                throw new C14680N("Could not find parser for ad type " + i);
            }
            IAlog.m76529a("Received ad type %s - Got parser! %s", Integer.valueOf(i), mo76441b);
            if (interfaceC15391j != null) {
                mo76441b.f30437c = interfaceC15391j;
            }
            mo76441b.f30435a = mo76441b.mo76583a();
            if (interfaceC14720o != null) {
                mo76441b.f30437c = new C15392k(interfaceC14720o);
            }
            AbstractC15386e m76584a = mo76441b.m76584a(null);
            m76584a.f30455K = mo77701h();
            if (c14449j != null) {
                m76584a.f30477u = c14449j;
            }
            InterfaceC14682P interfaceC14682P = this.f27827d;
            if (interfaceC14682P != null) {
                interfaceC14682P.mo77674a("sdkParsedResponse");
            }
            return m76584a;
        } catch (Exception e) {
            IAlog.m76530a("failed parse ad network request", e, new Object[0]);
            throw new C14680N(e);
        }
    }

    /* renamed from: a */
    public void mo77707a(long j) {
        synchronized (this.f27837n) {
            if (this.f27835l) {
                this.f27834k = (int) ((j - this.f27833j) + this.f27834k);
                this.f27835l = false;
            }
        }
    }
}
