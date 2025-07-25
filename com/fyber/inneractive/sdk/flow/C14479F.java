package com.fyber.inneractive.sdk.flow;

import android.app.Application;
import android.os.Looper;
import android.text.TextUtils;
import com.fyber.inneractive.sdk.bidder.adm.C14238y;
import com.fyber.inneractive.sdk.bidder.adm.RunnableC14233t;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.RunnableC14309B;
import com.fyber.inneractive.sdk.config.global.C14388r;
import com.fyber.inneractive.sdk.external.InneractiveAdManager;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.external.InneractiveAdSpot;
import com.fyber.inneractive.sdk.external.InneractiveAdSpotManager;
import com.fyber.inneractive.sdk.external.InneractiveErrorCode;
import com.fyber.inneractive.sdk.external.InneractiveFullscreenUnitController;
import com.fyber.inneractive.sdk.external.InneractiveMediationName;
import com.fyber.inneractive.sdk.external.InneractiveUnitController;
import com.fyber.inneractive.sdk.measurement.C14586e;
import com.fyber.inneractive.sdk.metrics.C14602d;
import com.fyber.inneractive.sdk.network.AbstractC14716m;
import com.fyber.inneractive.sdk.network.C14740w;
import com.fyber.inneractive.sdk.network.EnumC14730t;
import com.fyber.inneractive.sdk.response.AbstractC15386e;
import com.fyber.inneractive.sdk.util.AbstractC15459m;
import com.fyber.inneractive.sdk.util.AbstractC15465p;
import com.fyber.inneractive.sdk.util.IAlog;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.fyber.inneractive.sdk.flow.F */
/* loaded from: classes4.dex */
public final class C14479F implements InterfaceC14480G, InterfaceC14489P {

    /* renamed from: a */
    public final String f27400a;

    /* renamed from: b */
    public InneractiveAdSpot.RequestListener f27401b;

    /* renamed from: c */
    public InneractiveAdRequest f27402c;

    /* renamed from: d */
    public C14477D f27403d;

    /* renamed from: e */
    public AbstractC14552x f27404e;

    /* renamed from: f */
    public AbstractC14490Q f27405f;

    /* renamed from: g */
    public final HashSet f27406g;

    /* renamed from: h */
    public C14531m f27407h;

    /* renamed from: i */
    public InterfaceC14478E f27408i;

    /* renamed from: j */
    public boolean f27409j = true;

    /* renamed from: k */
    public boolean f27410k = false;

    /* renamed from: l */
    public C14534p f27411l;

    public C14479F() {
        String uuid = UUID.randomUUID().toString();
        this.f27400a = uuid;
        this.f27406g = new HashSet();
        IAlog.m76529a("%sInneractiveAdSpotImpl created with UID: %s", IAlog.m76531a(this), uuid);
    }

    @Override // com.fyber.inneractive.sdk.flow.InterfaceC14489P
    /* renamed from: a */
    public final void mo77867a(InterfaceC14478E interfaceC14478E) {
        this.f27408i = interfaceC14478E;
        requestAd(null);
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveAdSpot
    public final void addUnitController(InneractiveUnitController inneractiveUnitController) {
        if (inneractiveUnitController != null) {
            AbstractC14490Q abstractC14490Q = (AbstractC14490Q) inneractiveUnitController;
            abstractC14490Q.setAdSpot(this);
            if (this.f27406g.size() > 0) {
                Iterator it = new HashSet(this.f27406g).iterator();
                while (it.hasNext()) {
                    InneractiveUnitController inneractiveUnitController2 = (InneractiveUnitController) it.next();
                    if (inneractiveUnitController2.getClass().equals(inneractiveUnitController.getClass())) {
                        removeUnitController(inneractiveUnitController2);
                    }
                }
            }
            this.f27406g.add(abstractC14490Q);
            if (this.f27404e != null) {
                Iterator it2 = this.f27406g.iterator();
                while (it2.hasNext()) {
                    AbstractC14490Q abstractC14490Q2 = (AbstractC14490Q) it2.next();
                    if (abstractC14490Q2.supports(this)) {
                        this.f27405f = abstractC14490Q2;
                        return;
                    }
                }
            }
        }
    }

    /* renamed from: b */
    public final void m77872b() {
        Iterator it = this.f27406g.iterator();
        while (it.hasNext()) {
            ((InneractiveUnitController) it.next()).destroy();
        }
        this.f27406g.clear();
        C14534p c14534p = this.f27411l;
        if (c14534p != null) {
            c14534p.mo77823a(true);
            c14534p.f27532b = null;
            this.f27411l = null;
        }
        C14531m c14531m = this.f27407h;
        if (c14531m != null) {
            C14530l c14530l = c14531m.f27530g;
            if (c14530l != null) {
                IAConfigManager.removeListener(c14530l);
            }
            AbstractC14716m abstractC14716m = c14531m.f27534d;
            if (abstractC14716m != null) {
                abstractC14716m.mo77672a();
                c14531m.f27534d = null;
            }
            c14531m.mo77823a(true);
            c14531m.f27532b = null;
            this.f27407h = null;
        }
        this.f27401b = null;
        mo77871a();
        InneractiveAdSpotManager.get().removeSpot(this);
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveAdSpot
    public final void destroy() {
        IAlog.m76529a("%sInneractiveAdSpotImpl spot destroy: %s", IAlog.m76531a(this), this.f27400a);
        if (Looper.myLooper() != null && Looper.getMainLooper() == Looper.myLooper()) {
            m77872b();
        } else {
            AbstractC15465p.f30612b.post(new RunnableC14476C(this));
        }
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveAdSpot
    public final AbstractC14552x getAdContent() {
        return this.f27404e;
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveAdSpot
    public final InneractiveAdRequest getCurrentProcessedRequest() {
        return this.f27402c;
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveAdSpot
    public final String getLocalUniqueId() {
        return this.f27400a;
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveAdSpot
    public final InneractiveMediationName getMediationName() {
        return IAConfigManager.f27060O.f27089m;
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveAdSpot
    public final String getMediationNameString() {
        return IAConfigManager.f27060O.f27088l;
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveAdSpot
    public final String getMediationVersion() {
        return IAConfigManager.f27060O.f27090n;
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveAdSpot
    public final String getRequestedSpotId() {
        InneractiveAdRequest inneractiveAdRequest = this.f27402c;
        if (inneractiveAdRequest != null) {
            return inneractiveAdRequest.getSpotId();
        }
        return "";
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveAdSpot
    public final InneractiveUnitController getSelectedUnitController() {
        return this.f27405f;
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveAdSpot
    public final boolean isReady() {
        boolean z;
        AbstractC14552x abstractC14552x;
        AbstractC15386e mo77807c;
        Long valueOf;
        Long valueOf2;
        AbstractC14552x abstractC14552x2 = this.f27404e;
        if (abstractC14552x2 == null) {
            return false;
        }
        if (abstractC14552x2.mo77807c() != null) {
            AbstractC15386e mo77807c2 = this.f27404e.mo77807c();
            mo77807c2.getClass();
            if (mo77807c2.f30457a < System.currentTimeMillis()) {
                z = true;
                if (z && (abstractC14552x = this.f27404e) != null) {
                    mo77807c = abstractC14552x.mo77807c();
                    if (!this.f27410k && mo77807c != null) {
                        long minutes = TimeUnit.MILLISECONDS.toMinutes(System.currentTimeMillis() - mo77807c.f30459c);
                        long j = mo77807c.f30458b;
                        long j2 = minutes - j;
                        IAlog.m76529a("Firing Event 802 - AdExpired - time passed- " + j2 + ", sessionTimeOut - " + j, new Object[0]);
                        EnumC14730t enumC14730t = EnumC14730t.IA_AD_EXPIRED;
                        InneractiveAdRequest inneractiveAdRequest = abstractC14552x.f27572a;
                        JSONArray m77925b = abstractC14552x.f27574c.m77925b();
                        C14740w c14740w = new C14740w(mo77807c);
                        c14740w.f27930b = enumC14730t;
                        c14740w.f27929a = inneractiveAdRequest;
                        c14740w.f27932d = m77925b;
                        JSONObject jSONObject = new JSONObject();
                        valueOf = Long.valueOf(j2);
                        try {
                            jSONObject.put("time_passed", valueOf);
                        } catch (Exception unused) {
                            IAlog.m76524f("Got exception adding param to json object: %s, %s", "time_passed", valueOf);
                        }
                        valueOf2 = Long.valueOf(j);
                        try {
                            jSONObject.put("timeout", valueOf2);
                        } catch (Exception unused2) {
                            IAlog.m76524f("Got exception adding param to json object: %s, %s", "timeout", valueOf2);
                        }
                        c14740w.f27934f.put(jSONObject);
                        c14740w.m77658a((String) null);
                        this.f27410k = true;
                    }
                }
                if (z && this.f27404e.mo77804f()) {
                    return true;
                }
            }
        }
        z = false;
        if (z) {
            mo77807c = abstractC14552x.mo77807c();
            if (!this.f27410k) {
                long minutes2 = TimeUnit.MILLISECONDS.toMinutes(System.currentTimeMillis() - mo77807c.f30459c);
                long j3 = mo77807c.f30458b;
                long j22 = minutes2 - j3;
                IAlog.m76529a("Firing Event 802 - AdExpired - time passed- " + j22 + ", sessionTimeOut - " + j3, new Object[0]);
                EnumC14730t enumC14730t2 = EnumC14730t.IA_AD_EXPIRED;
                InneractiveAdRequest inneractiveAdRequest2 = abstractC14552x.f27572a;
                JSONArray m77925b2 = abstractC14552x.f27574c.m77925b();
                C14740w c14740w2 = new C14740w(mo77807c);
                c14740w2.f27930b = enumC14730t2;
                c14740w2.f27929a = inneractiveAdRequest2;
                c14740w2.f27932d = m77925b2;
                JSONObject jSONObject2 = new JSONObject();
                valueOf = Long.valueOf(j22);
                jSONObject2.put("time_passed", valueOf);
                valueOf2 = Long.valueOf(j3);
                jSONObject2.put("timeout", valueOf2);
                c14740w2.f27934f.put(jSONObject2);
                c14740w2.m77658a((String) null);
                this.f27410k = true;
            }
        }
        return z ? false : false;
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveAdSpot
    public final void loadAd(String str) {
        IAlog.m76529a("%s : InneractiveAdSpotImpl Start load ad process", IAlog.m76531a(this));
        if (IAConfigManager.m77993d()) {
            IAlog.m76529a("%sIAB TCF purpose 1 disabled, dropping request", IAlog.m76531a(this));
            InneractiveAdSpot.RequestListener requestListener = this.f27401b;
            if (requestListener != null) {
                requestListener.onInneractiveFailedAdRequest(this, InneractiveErrorCode.IAB_TCF_PURPOSE_1_DISABLED);
            }
        } else if (str != null && !TextUtils.isEmpty(str)) {
            if (!InneractiveAdManager.wasInitialized()) {
                InneractiveAdSpot.RequestListener requestListener2 = this.f27401b;
                if (requestListener2 != null) {
                    requestListener2.onInneractiveFailedAdRequest(this, InneractiveErrorCode.SDK_NOT_INITIALIZED);
                    return;
                }
                return;
            }
            C14602d.f27666d.m77771a(this.f27400a).mo77767c();
            String str2 = this.f27400a;
            this.f27411l = new C14534p(str2);
            if (this.f27403d == null) {
                this.f27403d = new C14477D(this);
            }
            C14238y c14238y = new C14238y(str, str2);
            C14388r m77929a = C14388r.m77929a();
            C14475B c14475b = new C14475B(this, c14238y, m77929a, str);
            IAlog.m76529a("%s initOmidSdkIfNeeded", IAlog.m76531a(this));
            IAConfigManager iAConfigManager = IAConfigManager.f27060O;
            C14586e c14586e = iAConfigManager.f27073K;
            if (c14586e == null || !c14586e.f27618a) {
                Application application = AbstractC15459m.f30607a;
                IAlog.m76527c("initOmidSdk", new Object[0]);
                AbstractC15465p.f30611a.execute(new RunnableC14309B(iAConfigManager, application));
            }
            iAConfigManager.f27070H.m78016a();
            AbstractC15465p.f30611a.execute(new RunnableC14233t(c14238y, c14475b, m77929a));
        } else {
            InneractiveAdSpot.RequestListener requestListener3 = this.f27401b;
            if (requestListener3 != null) {
                requestListener3.onInneractiveFailedAdRequest(this, InneractiveErrorCode.INVALID_INPUT);
            }
        }
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveAdSpot
    public final void removeUnitController(InneractiveUnitController inneractiveUnitController) {
        if (inneractiveUnitController != null) {
            AbstractC14490Q abstractC14490Q = this.f27405f;
            if (abstractC14490Q != null && abstractC14490Q.equals(inneractiveUnitController)) {
                this.f27405f.destroy();
                this.f27405f = null;
            }
            this.f27406g.remove(inneractiveUnitController);
        }
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveAdSpot
    public final void requestAd(InneractiveAdRequest inneractiveAdRequest) {
        InneractiveAdRequest inneractiveAdRequest2;
        boolean z;
        if (IAConfigManager.m77993d()) {
            IAlog.m76529a("%sIAB TCF purpose 1 disabled, dropping request", IAlog.m76531a(this));
            InneractiveAdSpot.RequestListener requestListener = this.f27401b;
            if (requestListener != null) {
                requestListener.onInneractiveFailedAdRequest(this, InneractiveErrorCode.IAB_TCF_PURPOSE_1_DISABLED);
                return;
            }
            return;
        }
        IAlog.m76529a("%srequestAd called with request: %s", IAlog.m76531a(this), inneractiveAdRequest);
        if (inneractiveAdRequest == null && this.f27402c == null) {
            IAlog.m76528b("%srequestAd called with a null request, but no previous request is available! Cannot continue", IAlog.m76531a(this));
            InneractiveAdSpot.RequestListener requestListener2 = this.f27401b;
            if (requestListener2 != null) {
                requestListener2.onInneractiveFailedAdRequest(this, InneractiveErrorCode.INVALID_INPUT);
            }
        } else if (!InneractiveAdManager.wasInitialized()) {
            InneractiveAdSpot.RequestListener requestListener3 = this.f27401b;
            if (requestListener3 != null) {
                requestListener3.onInneractiveFailedAdRequest(this, InneractiveErrorCode.SDK_NOT_INITIALIZED);
            }
        } else {
            if (inneractiveAdRequest != null) {
                inneractiveAdRequest2 = inneractiveAdRequest;
            } else {
                inneractiveAdRequest2 = this.f27402c;
            }
            String str = this.f27400a;
            inneractiveAdRequest2.f27434b = str;
            C14602d.f27666d.m77771a(str).mo77767c();
            if (this.f27406g.isEmpty()) {
                IAlog.m76528b("%srequestAd called but no AdUnitControllers exist! Cannot continue", IAlog.m76531a(this));
                if (this.f27401b != null) {
                    if (inneractiveAdRequest == null) {
                        inneractiveAdRequest = this.f27402c;
                    }
                    m77873a(inneractiveAdRequest, null);
                    this.f27401b.onInneractiveFailedAdRequest(this, InneractiveErrorCode.INVALID_INPUT);
                    return;
                }
                return;
            }
            IAConfigManager.m77995b();
            C14531m c14531m = this.f27407h;
            if (c14531m != null) {
                if (inneractiveAdRequest == null && this.f27402c != null) {
                    z = false;
                } else {
                    z = true;
                }
                C14530l c14530l = c14531m.f27530g;
                if (c14530l != null) {
                    IAConfigManager.removeListener(c14530l);
                }
                AbstractC14716m abstractC14716m = c14531m.f27534d;
                if (abstractC14716m != null) {
                    abstractC14716m.mo77672a();
                    c14531m.f27534d = null;
                }
                c14531m.mo77823a(z);
                c14531m.f27532b = null;
            }
            if (inneractiveAdRequest != null) {
                InneractiveAdRequest inneractiveAdRequest3 = this.f27402c;
                if (inneractiveAdRequest3 != null) {
                    inneractiveAdRequest.setSelectedUnitConfig(inneractiveAdRequest3.getSelectedUnitConfig());
                }
                this.f27402c = inneractiveAdRequest;
                AbstractC14552x abstractC14552x = this.f27404e;
                if (abstractC14552x != null) {
                    abstractC14552x.mo77811a();
                    this.f27409j = true;
                }
                Iterator it = this.f27406g.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (((AbstractC14490Q) it.next()) instanceof InneractiveFullscreenUnitController) {
                            break;
                        }
                    } else {
                        this.f27402c.f27433a = false;
                        break;
                    }
                }
            }
            this.f27407h = new C14531m(this.f27400a);
            if (this.f27403d == null) {
                this.f27403d = new C14477D(this);
            }
            IAlog.m76529a("%sFound ad source for request! %s", IAlog.m76531a(this), this.f27407h);
            IAlog.m76529a("%s initOmidSdkIfNeeded", IAlog.m76531a(this));
            IAConfigManager iAConfigManager = IAConfigManager.f27060O;
            C14586e c14586e = iAConfigManager.f27073K;
            if (c14586e == null || !c14586e.f27618a) {
                Application application = AbstractC15459m.f30607a;
                IAlog.m76527c("initOmidSdk", new Object[0]);
                AbstractC15465p.f30611a.execute(new RunnableC14309B(iAConfigManager, application));
            }
            iAConfigManager.f27070H.m78016a();
            C14531m c14531m2 = this.f27407h;
            if (c14531m2 != null) {
                InneractiveAdRequest inneractiveAdRequest4 = this.f27402c;
                c14531m2.f27532b = this.f27403d;
                if (IAConfigManager.m77992e()) {
                    c14531m2.m77828c(inneractiveAdRequest4);
                    return;
                }
                C14530l c14530l2 = new C14530l(c14531m2, inneractiveAdRequest4);
                c14531m2.f27530g = c14530l2;
                IAConfigManager.addListener(c14530l2);
                IAConfigManager.m77997a();
            }
        }
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveAdSpot
    public final void setMediationName(InneractiveMediationName inneractiveMediationName) {
        InneractiveAdManager.setMediationName(inneractiveMediationName);
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveAdSpot
    public final void setMediationVersion(String str) {
        InneractiveAdManager.setMediationVersion(str);
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveAdSpot
    public final void setRequestListener(InneractiveAdSpot.RequestListener requestListener) {
        IAlog.m76529a("%ssetRequestListener called with: %s", IAlog.m76531a(this), requestListener);
        this.f27401b = requestListener;
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveAdSpot
    public final void setMediationName(String str) {
        InneractiveAdManager.setMediationName(str);
    }

    @Override // com.fyber.inneractive.sdk.flow.InterfaceC14480G
    /* renamed from: a */
    public final void mo77871a() {
        AbstractC14552x abstractC14552x;
        JSONArray m77925b;
        C14388r c14388r;
        AbstractC14552x abstractC14552x2 = this.f27404e;
        if (abstractC14552x2 != null) {
            if (abstractC14552x2.mo77806d() && (abstractC14552x = this.f27404e) != null && !abstractC14552x.f27576e) {
                String arrays = Arrays.toString(Thread.currentThread().getStackTrace());
                IAlog.m76529a("Firing Event 803 - Stack trace - %s", arrays);
                EnumC14730t enumC14730t = EnumC14730t.IA_AD_DESTROYED_WITHOUT_SHOW;
                AbstractC14552x abstractC14552x3 = this.f27404e;
                InneractiveAdRequest inneractiveAdRequest = abstractC14552x3.f27572a;
                AbstractC15386e mo77807c = abstractC14552x3.mo77807c();
                C14531m c14531m = this.f27407h;
                C14534p c14534p = this.f27411l;
                C14388r c14388r2 = c14534p != null ? c14534p.f27533c : null;
                if (c14531m != null && (c14388r = c14531m.f27533c) != null) {
                    m77925b = c14388r.m77925b();
                } else {
                    m77925b = c14388r2 != null ? c14388r2.m77925b() : null;
                }
                C14740w c14740w = new C14740w(mo77807c);
                c14740w.f27930b = enumC14730t;
                c14740w.f27929a = inneractiveAdRequest;
                c14740w.f27932d = m77925b;
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("stack_trace", arrays);
                } catch (Exception unused) {
                    IAlog.m76524f("Got exception adding param to json object: %s, %s", "stack_trace", arrays);
                }
                c14740w.f27934f.put(jSONObject);
                c14740w.m77658a((String) null);
            }
            this.f27404e.mo77811a();
            this.f27404e = null;
        }
        this.f27405f = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x004f  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m77873a(com.fyber.inneractive.sdk.external.InneractiveAdRequest r10, com.fyber.inneractive.sdk.response.AbstractC15386e r11) {
        /*
            r9 = this;
            r0 = 0
            if (r10 == 0) goto L33
            com.fyber.inneractive.sdk.config.U r1 = r10.getSelectedUnitConfig()
            if (r1 == 0) goto L33
            com.fyber.inneractive.sdk.config.U r1 = r10.getSelectedUnitConfig()
            com.fyber.inneractive.sdk.config.T r1 = (com.fyber.inneractive.sdk.config.C14326T) r1
            com.fyber.inneractive.sdk.config.M r1 = r1.f27122c
            if (r1 == 0) goto L1e
            com.fyber.inneractive.sdk.config.U r1 = r10.getSelectedUnitConfig()
            com.fyber.inneractive.sdk.config.T r1 = (com.fyber.inneractive.sdk.config.C14326T) r1
            com.fyber.inneractive.sdk.config.M r1 = r1.f27122c
            com.fyber.inneractive.sdk.config.enums.UnitDisplayType r1 = r1.f27111b
            goto L34
        L1e:
            com.fyber.inneractive.sdk.config.U r1 = r10.getSelectedUnitConfig()
            com.fyber.inneractive.sdk.config.T r1 = (com.fyber.inneractive.sdk.config.C14326T) r1
            com.fyber.inneractive.sdk.config.V r1 = r1.f27125f
            if (r1 == 0) goto L33
            com.fyber.inneractive.sdk.config.U r1 = r10.getSelectedUnitConfig()
            com.fyber.inneractive.sdk.config.T r1 = (com.fyber.inneractive.sdk.config.C14326T) r1
            com.fyber.inneractive.sdk.config.V r1 = r1.f27125f
            com.fyber.inneractive.sdk.config.enums.UnitDisplayType r1 = r1.f27136j
            goto L34
        L33:
            r1 = r0
        L34:
            com.fyber.inneractive.sdk.flow.x r2 = r9.f27404e
            if (r2 == 0) goto L3e
            com.fyber.inneractive.sdk.response.e r2 = r2.f27573b
            if (r2 == 0) goto L3e
            r4 = r2
            goto L3f
        L3e:
            r4 = r11
        L3f:
            java.lang.String r6 = r9.f27400a
            if (r1 != 0) goto L47
            if (r4 == 0) goto L47
            com.fyber.inneractive.sdk.config.enums.UnitDisplayType r1 = r4.f30472p
        L47:
            r7 = r1
            com.fyber.inneractive.sdk.metrics.c r11 = new com.fyber.inneractive.sdk.metrics.c
            com.fyber.inneractive.sdk.flow.x r1 = r9.f27404e
            if (r1 != 0) goto L4f
            goto L55
        L4f:
            com.fyber.inneractive.sdk.config.global.r r0 = r1.f27574c
            org.json.JSONArray r0 = r0.m77925b()
        L55:
            r8 = r0
            r3 = r11
            r5 = r10
            r3.<init>(r4, r5, r6, r7, r8)
            r11.m77772a()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.flow.C14479F.m77873a(com.fyber.inneractive.sdk.external.InneractiveAdRequest, com.fyber.inneractive.sdk.response.e):void");
    }
}
