package com.ironsource;

import android.text.TextUtils;
import com.ironsource.C20009gs;
import com.ironsource.C21205x1;
import com.ironsource.InterfaceC20127j2;
import com.ironsource.InterfaceC20264lg;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.C20348d;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterAdFullScreenInterface;
import com.ironsource.mediationsdk.adunit.adapter.internal.BaseAdAdapter;
import com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener;
import com.ironsource.mediationsdk.adunit.adapter.listener.NetworkInitializationListener;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdData;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdapterErrorType;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.model.Placement;
import com.ironsource.mediationsdk.utils.ErrorBuilder;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* renamed from: com.ironsource.k7 */
/* loaded from: classes6.dex */
public abstract class AbstractC20186k7<Listener extends InterfaceC20127j2> implements NetworkInitializationListener, C20009gs.InterfaceC20010a, InterfaceC21162w1, AdapterAdListener, InterfaceC20264lg.InterfaceC20266b {

    /* renamed from: a */
    protected C20072i1 f50790a;

    /* renamed from: b */
    protected Listener f50791b;

    /* renamed from: c */
    protected BaseAdAdapter<?, AdapterAdListener> f50792c;

    /* renamed from: d */
    protected C21205x1 f50793d;

    /* renamed from: e */
    protected EnumC20194h f50794e;

    /* renamed from: g */
    protected Placement f50796g;

    /* renamed from: h */
    protected C21108v2 f50797h;

    /* renamed from: i */
    protected JSONObject f50798i;

    /* renamed from: j */
    protected String f50799j;

    /* renamed from: k */
    protected AdData f50800k;

    /* renamed from: l */
    protected Long f50801l;

    /* renamed from: m */
    protected C21008ta f50802m;

    /* renamed from: o */
    private final C19897f5 f50804o;

    /* renamed from: p */
    private final InterfaceC20215ko f50805p;

    /* renamed from: f */
    private AtomicBoolean f50795f = new AtomicBoolean(false);

    /* renamed from: n */
    private C20009gs f50803n = new C20009gs(TimeUnit.SECONDS.toMillis(m57687s()));

    /* renamed from: q */
    protected final Object f50806q = new Object();

    /* renamed from: com.ironsource.k7$a */
    /* loaded from: classes6.dex */
    class C20187a extends AbstractRunnableC21276yp {
        C20187a() {
            AbstractC20186k7.this = r1;
        }

        @Override // com.ironsource.AbstractRunnableC21276yp
        /* renamed from: a */
        public void mo53791a() {
            AbstractC20186k7.this.m57723L();
        }
    }

    /* renamed from: com.ironsource.k7$b */
    /* loaded from: classes6.dex */
    class C20188b extends AbstractRunnableC21276yp {
        C20188b() {
            AbstractC20186k7.this = r1;
        }

        @Override // com.ironsource.AbstractRunnableC21276yp
        /* renamed from: a */
        public void mo53791a() {
            AbstractC20186k7.this.m57724K();
        }
    }

    /* renamed from: com.ironsource.k7$c */
    /* loaded from: classes6.dex */
    public class C20189c extends AbstractRunnableC21276yp {

        /* renamed from: a */
        final /* synthetic */ int f50809a;

        /* renamed from: b */
        final /* synthetic */ String f50810b;

        C20189c(int i, String str) {
            AbstractC20186k7.this = r1;
            this.f50809a = i;
            this.f50810b = str;
        }

        @Override // com.ironsource.AbstractRunnableC21276yp
        /* renamed from: a */
        public void mo53791a() {
            AbstractC20186k7.this.m57719a(this.f50809a, this.f50810b);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.ironsource.k7$d */
    /* loaded from: classes6.dex */
    public class C20190d extends AbstractRunnableC21276yp {
        C20190d() {
            AbstractC20186k7.this = r1;
        }

        @Override // com.ironsource.AbstractRunnableC21276yp
        /* renamed from: a */
        public void mo53791a() {
            AbstractC20186k7.this.m57726I();
        }
    }

    /* renamed from: com.ironsource.k7$e */
    /* loaded from: classes6.dex */
    public class C20191e extends AbstractRunnableC21276yp {

        /* renamed from: a */
        final /* synthetic */ AdapterErrorType f50813a;

        /* renamed from: b */
        final /* synthetic */ int f50814b;

        /* renamed from: c */
        final /* synthetic */ String f50815c;

        C20191e(AdapterErrorType adapterErrorType, int i, String str) {
            AbstractC20186k7.this = r1;
            this.f50813a = adapterErrorType;
            this.f50814b = i;
            this.f50815c = str;
        }

        @Override // com.ironsource.AbstractRunnableC21276yp
        /* renamed from: a */
        public void mo53791a() {
            AbstractC20186k7.this.m57714a(this.f50813a, this.f50814b, this.f50815c);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.ironsource.k7$f */
    /* loaded from: classes6.dex */
    public class C20192f extends AbstractRunnableC21276yp {
        C20192f() {
            AbstractC20186k7.this = r1;
        }

        @Override // com.ironsource.AbstractRunnableC21276yp
        /* renamed from: a */
        public void mo53791a() {
            AbstractC20186k7.this.m57725J();
        }
    }

    /* renamed from: com.ironsource.k7$g */
    /* loaded from: classes6.dex */
    class C20193g extends AbstractRunnableC21276yp {
        C20193g() {
            AbstractC20186k7.this = r1;
        }

        @Override // com.ironsource.AbstractRunnableC21276yp
        /* renamed from: a */
        public void mo53791a() {
            AbstractC20186k7.this.m57727H();
        }
    }

    /* renamed from: com.ironsource.k7$h */
    /* loaded from: classes6.dex */
    public enum EnumC20194h {
        NONE,
        INIT_IN_PROGRESS,
        READY_TO_LOAD,
        LOADING,
        LOADED,
        SHOWING,
        FAILED
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AbstractC20186k7(InterfaceC20215ko interfaceC20215ko, C20072i1 c20072i1, BaseAdAdapter<?, ?> baseAdAdapter, C21108v2 c21108v2, C19897f5 c19897f5, Listener listener) {
        this.f50790a = c20072i1;
        this.f50791b = listener;
        this.f50793d = new C21205x1(c20072i1.m58063a(), C21205x1.EnumC21207b.PROVIDER, this);
        this.f50797h = c21108v2;
        this.f50798i = c21108v2.m54537c();
        this.f50792c = baseAdAdapter;
        this.f50804o = c19897f5;
        this.f50805p = interfaceC20215ko;
        m57718a(EnumC20194h.NONE);
    }

    /* renamed from: D */
    private boolean m57730D() {
        if (this.f50794e == EnumC20194h.INIT_IN_PROGRESS) {
            return true;
        }
        return false;
    }

    /* renamed from: F */
    private void m57728F() {
        IronLog.INTERNAL.verbose(m57704d());
        m57718a(EnumC20194h.LOADING);
        m57709a(false);
        try {
            this.f50803n.m58323a((C20009gs.InterfaceC20010a) this);
            mo54335G();
        } catch (Throwable th) {
            C20086i9.m57997d().m58003a(th);
            String str = "unexpected error while calling adapter.loadAd() - " + th.getMessage() + " - state = " + this.f50794e;
            IronLog.INTERNAL.error(m57712a(str));
            C21205x1 c21205x1 = this.f50793d;
            if (c21205x1 != null) {
                c21205x1.f54409k.m54567f(str);
            }
            onAdLoadFailed(AdapterErrorType.ADAPTER_ERROR_TYPE_INTERNAL, 510, str);
        }
    }

    /* renamed from: H */
    public void m57727H() {
        IronLog.INTERNAL.verbose(m57704d());
        C21205x1 c21205x1 = this.f50793d;
        if (c21205x1 != null) {
            c21205x1.f54408j.m57923a(m57696j());
        }
        this.f50791b.mo57902f(this);
    }

    /* renamed from: I */
    public void m57726I() {
        boolean z;
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(m57704d());
        C20009gs c20009gs = this.f50803n;
        if (c20009gs != null) {
            c20009gs.m58322e();
        }
        synchronized (this.f50806q) {
            EnumC20194h enumC20194h = this.f50794e;
            z = false;
            if (enumC20194h == EnumC20194h.LOADING) {
                long m54805a = C21008ta.m54805a(this.f50802m);
                ironLog.verbose(m57712a("Load duration = " + m54805a));
                if (this.f50793d != null) {
                    if (mo57684v()) {
                        this.f50793d.f54405g.m54945a(m54805a);
                    } else {
                        this.f50793d.f54405g.m54942a(m54805a, false);
                    }
                }
                m57718a(EnumC20194h.LOADED);
                z = mo57720O();
            } else if (enumC20194h != EnumC20194h.FAILED) {
                ironLog.error(m57712a(String.format("unexpected load success for %s, state - %s", m57695k(), this.f50794e)));
                String format = String.format("unexpected load success, state - %s", this.f50794e);
                if (this.f50793d != null) {
                    if (mo57684v()) {
                        this.f50793d.f54409k.m54556q(format);
                    } else {
                        this.f50793d.f54409k.m54559n(format);
                    }
                }
            }
        }
        if (z) {
            this.f50791b.mo57903e(this);
        }
    }

    /* renamed from: J */
    public void m57725J() {
        IronLog.INTERNAL.verbose(m57704d());
        m57718a(EnumC20194h.SHOWING);
        C21205x1 c21205x1 = this.f50793d;
        if (c21205x1 != null) {
            c21205x1.f54408j.m57911g(m57696j());
        }
        this.f50791b.mo53884b(this);
    }

    /* renamed from: K */
    public void m57724K() {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(m57704d());
        if (m57730D()) {
            C20009gs c20009gs = this.f50803n;
            if (c20009gs != null) {
                c20009gs.m58322e();
            }
            m57718a(EnumC20194h.READY_TO_LOAD);
            m57728F();
        } else if (this.f50794e != EnumC20194h.FAILED) {
            ironLog.error(m57712a(String.format("unexpected init success for %s, state - %s", m57695k(), this.f50794e)));
            if (this.f50793d != null) {
                this.f50793d.f54409k.m54561l(String.format("unexpected init success, state - %s", this.f50794e));
            }
        }
    }

    /* renamed from: L */
    public void m57723L() {
        long m54805a = C21008ta.m54805a(this.f50802m);
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(m57712a("Load duration = " + m54805a + ", state = " + this.f50794e + ", isBidder = " + m57683w()));
        synchronized (this.f50806q) {
            if (m57680z()) {
                m57718a(EnumC20194h.FAILED);
                C21205x1 c21205x1 = this.f50793d;
                if (c21205x1 != null) {
                    c21205x1.f54405g.m54944a(m54805a, 1025);
                    this.f50793d.f54405g.m54943a(m54805a, 1025, "time out");
                }
                this.f50791b.mo57904a(ErrorBuilder.buildLoadFailedError("time out"), this);
                return;
            }
            ironLog.error(m57712a(String.format("unexpected timeout for %s, state - %s, error - %s", m57695k(), this.f50794e, 1025)));
            if (this.f50793d != null) {
                this.f50793d.f54409k.m54554s(String.format("unexpected timeout, state - %s, error - %s", this.f50794e, 1025));
            }
        }
    }

    /* renamed from: o */
    private int m57691o() {
        return 1;
    }

    /* renamed from: s */
    private int m57687s() {
        int m58058f;
        C19897f5 c19897f5 = this.f50804o;
        if (c19897f5 == null) {
            return this.f50790a.m58058f();
        }
        Integer m58648e = c19897f5.m58648e();
        if (m58648e != null && m58648e.intValue() > 0) {
            m58058f = m58648e.intValue();
        } else {
            m58058f = this.f50790a.m58058f();
        }
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(m57712a("Load timeout for " + this.f50804o.m58650c() + " - " + m58058f + " seconds"));
        return m58058f;
    }

    /* renamed from: A */
    public AtomicBoolean m57733A() {
        return this.f50795f;
    }

    /* renamed from: B */
    public boolean mo57732B() {
        return m57681y();
    }

    /* renamed from: C */
    public boolean m57731C() {
        if (this.f50794e == EnumC20194h.SHOWING) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r1v16, types: [com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseInterface] */
    /* renamed from: E */
    public void m57729E() {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(m57704d());
        C19897f5 m57697i = m57697i();
        String m58643j = m57697i.m58643j();
        Map<String, Object> m58124a = C20053hj.m58124a(m57697i.m58655a());
        m58124a.put("adUnit", this.f50790a.m58063a());
        m57706b(m58643j);
        try {
            boolean z = false;
            if (mo57684v()) {
                this.f50793d.f54405g.m54947a();
            } else {
                this.f50793d.f54405g.m54940a(false);
            }
            this.f50801l = null;
            this.f50802m = new C21008ta();
            this.f50800k = mo57711a(m58643j, m58124a);
            synchronized (this.f50806q) {
                if (this.f50794e != EnumC20194h.NONE) {
                    z = true;
                } else {
                    m57718a(EnumC20194h.INIT_IN_PROGRESS);
                }
            }
            if (z) {
                String str = "loadAd - incorrect state while loading, state = " + this.f50794e;
                ironLog.error(m57712a(str));
                this.f50793d.f54409k.m54567f(str);
                onInitFailed(C20996t1.m54868c(this.f50790a.m58063a()), str);
                return;
            }
            this.f50803n.m58323a((C20009gs.InterfaceC20010a) this);
            ?? networkAdapter = this.f50792c.getNetworkAdapter();
            if (networkAdapter != 0) {
                networkAdapter.init(this.f50800k, ContextProvider.getInstance().getApplicationContext(), this);
                return;
            }
            String str2 = "loadAd - network adapter not available " + m57695k();
            ironLog.error(m57712a(str2));
            onInitFailed(C20996t1.m54868c(this.f50790a.m58063a()), str2);
        } catch (Throwable th) {
            C20086i9.m57997d().m58003a(th);
            String str3 = "loadAd - exception = " + th.getLocalizedMessage();
            IronLog.INTERNAL.error(m57712a(str3));
            C21205x1 c21205x1 = this.f50793d;
            if (c21205x1 != null) {
                c21205x1.f54409k.m54567f(str3);
            }
            onInitFailed(C20996t1.m54868c(this.f50790a.m58063a()), str3);
        }
    }

    /* renamed from: G */
    protected void mo54335G() {
        BaseAdAdapter<?, AdapterAdListener> baseAdAdapter = this.f50792c;
        if (baseAdAdapter instanceof AdapterAdFullScreenInterface) {
            ((AdapterAdFullScreenInterface) baseAdAdapter).loadAd(this.f50800k, ContextProvider.getInstance().getCurrentActiveActivity(), this);
        } else {
            IronLog.INTERNAL.error(m57712a("adapter not instance of AdapterAdFullScreenInterface"));
        }
    }

    /* renamed from: M */
    public void m57722M() {
        synchronized (this) {
            BaseAdAdapter<?, AdapterAdListener> baseAdAdapter = this.f50792c;
            if (baseAdAdapter != null) {
                try {
                    baseAdAdapter.releaseMemory();
                    this.f50792c = null;
                } catch (Exception e) {
                    C20086i9.m57997d().m58003a(e);
                    String str = "Exception while calling adapter.releaseMemory() from " + this.f50797h.m54534f() + " - " + e.getMessage() + " - state = " + this.f50794e;
                    IronLog.INTERNAL.error(m57712a(str));
                    C21205x1 c21205x1 = this.f50793d;
                    if (c21205x1 != null) {
                        c21205x1.f54409k.m54567f(str);
                    }
                }
            }
            C21205x1 c21205x12 = this.f50793d;
            if (c21205x12 != null) {
                c21205x12.m54199f();
                this.f50793d = null;
            }
            C20009gs c20009gs = this.f50803n;
            if (c20009gs != null) {
                c20009gs.m58737d();
                this.f50803n = null;
            }
        }
    }

    /* renamed from: N */
    public void m57721N() {
        IronLog.INTERNAL.verbose(m57704d());
        C21205x1 c21205x1 = this.f50793d;
        if (c21205x1 != null) {
            c21205x1.f54408j.m57925a();
        }
    }

    /* renamed from: O */
    protected boolean mo57720O() {
        return true;
    }

    /* renamed from: a */
    protected AdData mo57711a(String str, Map<String, Object> map) {
        return new AdData(str, m57689q(), mo57710a(map));
    }

    @Override // com.ironsource.InterfaceC20264lg.InterfaceC20266b
    /* renamed from: b */
    public int mo56364b() {
        return this.f50797h.m54535e();
    }

    @Override // com.ironsource.InterfaceC20264lg.InterfaceC20266b
    /* renamed from: c */
    public String mo56362c() {
        return this.f50797h.m54534f();
    }

    /* renamed from: d */
    public String m57704d() {
        return m57712a((String) null);
    }

    /* renamed from: e */
    public Long m57702e() {
        return this.f50801l;
    }

    /* renamed from: f */
    public AdInfo m57700f() {
        return new AdInfo(this.f50804o.m58654a(m57696j()));
    }

    /* renamed from: g */
    public IronSource.AD_UNIT m57699g() {
        return this.f50790a.m58063a();
    }

    /* renamed from: h */
    public String m57698h() {
        return this.f50790a.m58061c();
    }

    /* renamed from: i */
    public C19897f5 m57697i() {
        return this.f50804o;
    }

    /* renamed from: j */
    public String m57696j() {
        Placement placement = this.f50796g;
        if (placement == null) {
            return "";
        }
        return placement.getPlacementName();
    }

    /* renamed from: k */
    public String m57695k() {
        return String.format("%s %s", mo56362c(), Integer.valueOf(hashCode()));
    }

    /* renamed from: l */
    public int m57694l() {
        return this.f50797h.m54536d();
    }

    /* renamed from: m */
    public String m57693m() {
        if (this.f50797h.m54532h().isMultipleInstances()) {
            return this.f50797h.m54532h().getProviderTypeForReflection();
        }
        return this.f50797h.m54534f();
    }

    /* renamed from: n */
    public String m57692n() {
        return this.f50797h.m54533g();
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener
    public void onAdClicked() {
        if (!this.f50805p.mo57624c()) {
            m57727H();
        } else {
            this.f50805p.mo57625a(new C20193g());
        }
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener
    public void onAdLoadFailed(@NotNull AdapterErrorType adapterErrorType, int i, String str) {
        if (!this.f50805p.mo57624c()) {
            m57714a(adapterErrorType, i, str);
        } else {
            this.f50805p.mo57625a(new C20191e(adapterErrorType, i, str));
        }
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener
    public void onAdLoadSuccess() {
        if (!this.f50805p.mo57624c()) {
            m57726I();
        } else {
            this.f50805p.mo57625a(new C20190d());
        }
    }

    public void onAdOpened() {
        if (!this.f50805p.mo57624c()) {
            m57725J();
        } else {
            this.f50805p.mo57625a(new C20192f());
        }
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.listener.NetworkInitializationListener
    public void onInitFailed(int i, String str) {
        if (!this.f50805p.mo57624c()) {
            m57719a(i, str);
        } else {
            this.f50805p.mo57625a(new C20189c(i, str));
        }
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.listener.NetworkInitializationListener
    public void onInitSuccess() {
        if (!this.f50805p.mo57624c()) {
            m57724K();
        } else {
            this.f50805p.mo57625a(new C20188b());
        }
    }

    /* renamed from: p */
    public NetworkSettings m57690p() {
        return this.f50790a.m58057g();
    }

    /* renamed from: q */
    public Map<String, Object> m57689q() {
        HashMap hashMap = new HashMap();
        hashMap.putAll(C20053hj.m58124a(this.f50798i));
        return hashMap;
    }

    /* renamed from: r */
    public Integer m57688r() {
        C20072i1 c20072i1 = this.f50790a;
        if (c20072i1 != null) {
            return Integer.valueOf(c20072i1.m58056h());
        }
        return null;
    }

    /* renamed from: t */
    public EnumC20194h m57686t() {
        return this.f50794e;
    }

    /* renamed from: u */
    public InterfaceC20215ko m57685u() {
        return this.f50805p;
    }

    /* renamed from: v */
    protected boolean mo57684v() {
        return false;
    }

    /* renamed from: w */
    public boolean m57683w() {
        return this.f50797h.m54530j();
    }

    /* renamed from: x */
    public boolean m57682x() {
        if (this.f50794e == EnumC20194h.FAILED) {
            return true;
        }
        return false;
    }

    /* renamed from: y */
    public boolean m57681y() {
        if (this.f50794e == EnumC20194h.LOADED) {
            return true;
        }
        return false;
    }

    /* renamed from: z */
    public boolean m57680z() {
        EnumC20194h enumC20194h = this.f50794e;
        if (enumC20194h != EnumC20194h.INIT_IN_PROGRESS && enumC20194h != EnumC20194h.LOADING) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public String m57712a(String str) {
        String str2 = this.f50790a.m58063a().name() + " - " + m57695k() + " - state = " + this.f50794e;
        if (TextUtils.isEmpty(str)) {
            return str2;
        }
        return str2 + " - " + str;
    }

    /* JADX WARN: Type inference failed for: r2v16, types: [com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseInterface] */
    /* JADX WARN: Type inference failed for: r2v17, types: [com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseInterface] */
    /* renamed from: a */
    public Map<String, Object> mo53886a(EnumC21057u1 enumC21057u1) {
        HashMap hashMap = new HashMap();
        try {
            BaseAdAdapter<?, AdapterAdListener> baseAdAdapter = this.f50792c;
            hashMap.put(IronSourceConstants.EVENTS_PROVIDER_ADAPTER_VERSION, baseAdAdapter != null ? baseAdAdapter.getNetworkAdapter().getAdapterVersion() : "");
            BaseAdAdapter<?, AdapterAdListener> baseAdAdapter2 = this.f50792c;
            hashMap.put(IronSourceConstants.EVENTS_PROVIDER_SDK_VERSION, baseAdAdapter2 != null ? baseAdAdapter2.getNetworkAdapter().getNetworkSDKVersion() : "");
        } catch (Exception e) {
            C20086i9.m57997d().m58003a(e);
            IronLog.INTERNAL.error(m57712a("could not get adapter version for event data" + m57695k()));
        }
        hashMap.put("spId", this.f50797h.m54531i());
        hashMap.put(IronSourceConstants.EVENTS_PROVIDER, this.f50797h.m54539a());
        hashMap.put("instanceType", Integer.valueOf(m57694l()));
        hashMap.put(IronSourceConstants.EVENTS_PROGRAMMATIC, Integer.valueOf(m57691o()));
        if (!TextUtils.isEmpty(this.f50799j)) {
            hashMap.put("dynamicDemandSource", this.f50799j);
        }
        hashMap.put("sessionDepth", m57688r());
        if (this.f50790a.m58059e() != null && this.f50790a.m58059e().length() > 0) {
            hashMap.put("genericParams", this.f50790a.m58059e());
        }
        if (!TextUtils.isEmpty(this.f50790a.m58061c())) {
            hashMap.put("auctionId", this.f50790a.m58061c());
        }
        if (m57707b(enumC21057u1)) {
            hashMap.put(IronSourceConstants.AUCTION_TRIALS, Integer.valueOf(this.f50790a.m58060d()));
            if (!TextUtils.isEmpty(this.f50790a.m58062b())) {
                hashMap.put(IronSourceConstants.AUCTION_FALLBACK, this.f50790a.m58062b());
            }
        }
        if (!TextUtils.isEmpty(this.f50790a.m58057g().getCustomNetwork())) {
            hashMap.put(IronSourceConstants.EVENTS_CUSTOM_NETWORK_FIELD, this.f50790a.m58057g().getCustomNetwork());
        }
        return hashMap;
    }

    /* renamed from: b */
    public void m57706b(String str) {
        this.f50799j = C20348d.m57010b().m57008c(str);
    }

    /* renamed from: b */
    private boolean m57707b(EnumC21057u1 enumC21057u1) {
        return new ArrayList(Arrays.asList(EnumC21057u1.LOAD_AD, EnumC21057u1.LOAD_AD_SUCCESS, EnumC21057u1.LOAD_AD_FAILED, EnumC21057u1.LOAD_AD_FAILED_WITH_REASON, EnumC21057u1.LOAD_AD_NO_FILL, EnumC21057u1.RELOAD_AD, EnumC21057u1.RELOAD_AD_SUCCESS, EnumC21057u1.RELOAD_AD_FAILED_WITH_REASON, EnumC21057u1.RELOAD_AD_NO_FILL, EnumC21057u1.DESTROY_AD, EnumC21057u1.AD_PRESENT_SCREEN, EnumC21057u1.AD_DISMISS_SCREEN, EnumC21057u1.AD_LEFT_APPLICATION, EnumC21057u1.AD_OPENED, EnumC21057u1.AD_CLOSED, EnumC21057u1.SHOW_AD, EnumC21057u1.SHOW_AD_FAILED, EnumC21057u1.AD_CLICKED, EnumC21057u1.AD_REWARDED)).contains(enumC21057u1);
    }

    /* renamed from: a */
    public Map<String, Object> mo57710a(Map<String, Object> map) {
        if (map == null) {
            map = new HashMap<>();
        }
        map.put("userId", this.f50790a.m58055i());
        return map;
    }

    @Override // com.ironsource.C20009gs.InterfaceC20010a
    /* renamed from: a */
    public void mo56383a() {
        if (this.f50805p.mo57624c()) {
            this.f50805p.mo57625a(new C20187a());
        } else {
            m57723L();
        }
    }

    /* renamed from: a */
    public void m57719a(int i, String str) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(m57712a("error = " + i + ", " + str));
        if (m57730D()) {
            C20009gs c20009gs = this.f50803n;
            if (c20009gs != null) {
                c20009gs.m58322e();
            }
            m57718a(EnumC20194h.FAILED);
            m57713a(AdapterErrorType.ADAPTER_ERROR_TYPE_INTERNAL, i, str, C21008ta.m54805a(this.f50802m));
            this.f50791b.mo57904a(new IronSourceError(i, str), this);
        } else if (this.f50794e == EnumC20194h.FAILED) {
        } else {
            ironLog.error(m57712a(String.format("unexpected init failed for %s, state - %s, error - %s, %s", m57695k(), this.f50794e, Integer.valueOf(i), str)));
            if (this.f50793d != null) {
                this.f50793d.f54409k.m54562k(String.format("unexpected init failed, state - %s, error - %s, %s", this.f50794e, Integer.valueOf(i), str));
            }
        }
    }

    /* renamed from: a */
    public void m57718a(EnumC20194h enumC20194h) {
        IronLog.INTERNAL.verbose(m57704d());
        this.f50794e = enumC20194h;
    }

    /* renamed from: a */
    public void m57714a(@NotNull AdapterErrorType adapterErrorType, int i, String str) {
        long m54805a = C21008ta.m54805a(this.f50802m);
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(m57712a("Load duration = " + m54805a + ", error = " + i + ", " + str));
        C20009gs c20009gs = this.f50803n;
        if (c20009gs != null) {
            c20009gs.m58322e();
        }
        synchronized (this.f50806q) {
            EnumC20194h enumC20194h = this.f50794e;
            if (enumC20194h == EnumC20194h.LOADING) {
                m57713a(adapterErrorType, i, str, m54805a);
                m57718a(EnumC20194h.FAILED);
                this.f50791b.mo57904a(new IronSourceError(i, str), this);
            } else if (enumC20194h == EnumC20194h.FAILED) {
                m57713a(adapterErrorType, i, str, m54805a);
            } else if (enumC20194h == EnumC20194h.LOADED && adapterErrorType == AdapterErrorType.ADAPTER_ERROR_TYPE_AD_EXPIRED) {
                this.f50801l = Long.valueOf(System.currentTimeMillis());
                ironLog.error(m57712a(String.format("ad expired for %s, state = %s", this.f50797h.m54534f(), this.f50794e)));
                C21205x1 c21205x1 = this.f50793d;
                if (c21205x1 != null) {
                    c21205x1.f54409k.m54579a(String.format("ad expired, state = %s", this.f50794e));
                }
            } else {
                ironLog.error(m57712a(String.format("unexpected load failed for %s, state - %s, error - %s, %s", m57695k(), this.f50794e, Integer.valueOf(i), str)));
                String format = String.format("unexpected load failed, state - %s, error - %s, %s", this.f50794e, Integer.valueOf(i), str);
                if (this.f50793d != null) {
                    if (mo57684v()) {
                        this.f50793d.f54409k.m54557p(format);
                    } else if (this.f50790a.m58063a() != IronSource.AD_UNIT.REWARDED_VIDEO || this.f50794e != EnumC20194h.SHOWING) {
                        this.f50793d.f54409k.m54560m(format);
                    }
                }
            }
        }
    }

    /* renamed from: a */
    private void m57713a(AdapterErrorType adapterErrorType, int i, String str, long j) {
        if (this.f50793d != null) {
            if (adapterErrorType == AdapterErrorType.ADAPTER_ERROR_TYPE_NO_FILL) {
                if (mo57684v()) {
                    this.f50793d.f54405g.m54935c(j, i);
                } else {
                    this.f50793d.f54405g.m54937b(j, i);
                }
            } else if (TextUtils.isEmpty(str)) {
                this.f50793d.f54405g.m54944a(j, i);
            } else if (mo57684v()) {
                this.f50793d.f54405g.m54936b(j, i, str);
            } else {
                this.f50793d.f54405g.m54943a(j, i, str);
            }
        }
    }

    /* renamed from: a */
    public void m57709a(boolean z) {
        this.f50795f.set(z);
    }
}
