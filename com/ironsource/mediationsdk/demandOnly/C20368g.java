package com.ironsource.mediationsdk.demandOnly;

import android.text.TextUtils;
import android.util.Log;
import com.ironsource.C19821el;
import com.ironsource.C19897f5;
import com.ironsource.C20086i9;
import com.ironsource.C20154ji;
import com.ironsource.C20200kb;
import com.ironsource.C21008ta;
import com.ironsource.C21108v2;
import com.ironsource.C21110v4;
import com.ironsource.C21253y4;
import com.ironsource.C21259ya;
import com.ironsource.InterfaceC20470mg;
import com.ironsource.InterfaceC21000t4;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.AbstractAdapter;
import com.ironsource.mediationsdk.C20348d;
import com.ironsource.mediationsdk.C20400e;
import com.ironsource.mediationsdk.C20406i;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.demandOnly.C20387m;
import com.ironsource.mediationsdk.demandOnly.InterfaceC20353a;
import com.ironsource.mediationsdk.demandOnly.InterfaceC20363e;
import com.ironsource.mediationsdk.demandOnly.InterfaceC20389n;
import com.ironsource.mediationsdk.demandOnly.InterfaceC20394p;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.sdk.InterstitialSmashListener;
import com.ironsource.mediationsdk.utils.ErrorBuilder;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import java.util.List;
import java.util.Map;
import java.util.TimerTask;
import org.json.JSONObject;

/* renamed from: com.ironsource.mediationsdk.demandOnly.g */
/* loaded from: classes6.dex */
public class C20368g extends C20387m implements InterfaceC20389n.InterfaceC20390a, InterstitialSmashListener, InterfaceC21000t4 {

    /* renamed from: n */
    private C21008ta f51451n;

    /* renamed from: o */
    private C21008ta f51452o;

    /* renamed from: p */
    private ISDemandOnlyInterstitialListener f51453p;

    /* renamed from: q */
    private C21110v4 f51454q;

    /* renamed from: r */
    private C20400e f51455r;

    /* renamed from: s */
    private InterfaceC20394p f51456s;

    /* renamed from: t */
    private final InterfaceC20470mg f51457t;

    /* renamed from: u */
    private final InterfaceC20470mg.InterfaceC20471a f51458u;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.ironsource.mediationsdk.demandOnly.g$a */
    /* loaded from: classes6.dex */
    public class C20369a extends TimerTask {
        C20369a() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            IronLog ironLog = IronLog.INTERNAL;
            ironLog.verbose("load timed out state=" + C20368g.this.m56902k());
            C20368g.this.m56965a(new IronSourceError(1052, "load timed out"));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.ironsource.mediationsdk.demandOnly.g$b */
    /* loaded from: classes6.dex */
    public class C20370b extends TimerTask {
        C20370b() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            IronLog ironLog = IronLog.INTERNAL;
            ironLog.verbose("load timed out state=" + C20368g.this.m56902k());
            C20368g.this.m56965a(new IronSourceError(1052, "load timed out"));
        }
    }

    public C20368g(String str, String str2, NetworkSettings networkSettings, ISDemandOnlyInterstitialListener iSDemandOnlyInterstitialListener, long j, AbstractAdapter abstractAdapter, C20400e c20400e) {
        super(new C21108v2(networkSettings, networkSettings.getInterstitialSettings(), IronSource.AD_UNIT.INTERSTITIAL), abstractAdapter);
        this.f51456s = new InterfaceC20394p.C20396b();
        this.f51457t = C19821el.m58797N().mo57093k();
        this.f51458u = C19821el.m58802I().mo57487e();
        this.f51453p = iSDemandOnlyInterstitialListener;
        this.f51530f = j;
        this.f51455r = c20400e;
        this.f51525a.initInterstitial(str, str2, this.f51527c, this);
    }

    /* renamed from: q */
    private C20406i m56960q() {
        C20406i c20406i = new C20406i(this.f51537m);
        c20406i.m56843b(IronSourceUtils.isEncryptedResponse());
        c20406i.m56846a(true);
        c20406i.m56840c(true);
        c20406i.m56838d(m56904i() + m56905h());
        c20406i.m56841c(m56901l());
        c20406i.m56857a(this.f51457t.mo56312a(this.f51537m));
        C21253y4 c21253y4 = new C21253y4(m56905h(), false);
        c21253y4.m54044a(this.f51456s.value());
        Map<String, Object> interstitialBiddingData = this.f51525a.getInterstitialBiddingData(this.f51527c, new JSONObject());
        if (interstitialBiddingData != null) {
            c21253y4.m54039b(interstitialBiddingData);
        }
        c20406i.m56851a(c21253y4);
        return c20406i;
    }

    /* renamed from: r */
    private void m56959r() {
        this.f51452o = new C21008ta();
        this.f51525a.loadInterstitial(this.f51527c, null, this);
    }

    /* renamed from: s */
    private void m56958s() {
        if (!this.f51455r.m56883a()) {
            IronLog.INTERNAL.verbose("can't load the interstitial the auction isn't enabled");
            m56965a(new IronSourceError(1063, "Missing server configuration"));
            return;
        }
        m56966a(82500, (Object[][]) null);
        C20406i m56960q = m56960q();
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose("auction waterfallString = " + m56960q.m56823q());
        m56966a(82510, new Object[][]{new Object[]{IronSourceConstants.EVENTS_EXT1, m56960q.m56823q()}});
        this.f51455r.m56882a(ContextProvider.getInstance().getApplicationContext(), m56960q, this);
    }

    /* renamed from: t */
    private void m56957t() {
        this.f51531g = null;
        this.f51532h = null;
        this.f51534j = null;
        this.f51454q = new C21110v4();
    }

    /* renamed from: u */
    private void m56956u() {
        this.f51451n = new C21008ta();
        m56913a(new C20370b());
        if (m56899n()) {
            IronSourceError buildLoadFailedError = ErrorBuilder.buildLoadFailedError("loadInterstitial must be called by non bidder instances");
            m56966a(2303, (Object[][]) null);
            m56965a(buildLoadFailedError);
        } else if (m56898o()) {
            m56958s();
        } else {
            m56959r();
        }
    }

    @Override // com.ironsource.InterfaceC20244l4
    /* renamed from: a */
    public void mo56457a(int i, String str, int i2, String str2, long j) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose("error " + i + " - " + str);
        this.f51531g = null;
        this.f51532h = null;
        m56966a(82300, new Object[][]{new Object[]{"errorCode", Integer.valueOf(i)}, new Object[]{"reason", str}, new Object[]{"duration", Long.valueOf(j)}, new Object[]{IronSourceConstants.EVENTS_EXT1, m56902k()}});
        if (m56917a(C20387m.EnumC20388a.LOAD_IN_PROGRESS)) {
            m56965a(new IronSourceError(InterfaceC20363e.C20364a.f51419j, "No available ad to load"));
        }
    }

    @Override // com.ironsource.mediationsdk.demandOnly.InterfaceC20389n.InterfaceC20390a
    /* renamed from: b */
    public void mo56894b() {
        IronSourceError ironSourceError;
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose("instanceName = " + m56905h() + ", state=" + m56902k());
        m56966a(2201, (Object[][]) null);
        C20387m.EnumC20388a enumC20388a = C20387m.EnumC20388a.LOADED;
        C20387m.EnumC20388a enumC20388a2 = C20387m.EnumC20388a.SHOW_IN_PROGRESS;
        if (m56916a(enumC20388a, enumC20388a2)) {
            this.f51525a.showInterstitial(this.f51527c, this);
            return;
        }
        if (m56917a(enumC20388a2)) {
            ironSourceError = new IronSourceError(1064, "showInterstitial error: can't show ad while an ad is already showing");
        } else if (m56917a(C20387m.EnumC20388a.LOAD_IN_PROGRESS)) {
            ironSourceError = new IronSourceError(1065, "showInterstitial error: can't show ad while an ad is loading");
        } else {
            ironSourceError = new IronSourceError(1066, "showInterstitial error: no available ads to show");
        }
        onInterstitialAdShowFailed(ironSourceError);
    }

    @Override // com.ironsource.mediationsdk.demandOnly.InterfaceC20389n.InterfaceC20390a
    /* renamed from: c */
    public void mo56893c() {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose("state=" + m56902k());
        C20387m.EnumC20388a enumC20388a = C20387m.EnumC20388a.NOT_LOADED;
        C20387m.EnumC20388a enumC20388a2 = C20387m.EnumC20388a.LOADED;
        C20387m.EnumC20388a enumC20388a3 = C20387m.EnumC20388a.LOAD_IN_PROGRESS;
        C20387m.EnumC20388a m56910a = m56910a(new C20387m.EnumC20388a[]{enumC20388a, enumC20388a2}, enumC20388a3);
        if (m56910a != enumC20388a && m56910a != enumC20388a2) {
            this.f51453p.onInterstitialAdLoadFailed(m56901l(), new IronSourceError(1050, m56910a == enumC20388a3 ? "load already in progress" : "cannot load because show is in progress"));
            return;
        }
        m56957t();
        m56966a(2002, (Object[][]) null);
        m56956u();
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialSmashListener
    public void onInterstitialAdClicked() {
        IronLog ironLog = IronLog.ADAPTER_CALLBACK;
        ironLog.verbose("instance name= " + m56905h());
        m56966a(2006, new Object[0]);
        this.f51453p.onInterstitialAdClicked(m56901l());
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialSmashListener
    public void onInterstitialAdClosed() {
        m56909b(C20387m.EnumC20388a.NOT_LOADED);
        IronLog ironLog = IronLog.ADAPTER_CALLBACK;
        ironLog.verbose("instance name= " + m56905h());
        m56966a(2204, new Object[][]{new Object[]{"sessionDepth", Integer.valueOf(this.f51457t.mo56312a(this.f51537m))}});
        this.f51458u.mo56311b(this.f51537m);
        this.f51453p.onInterstitialAdClosed(m56901l());
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialSmashListener
    public void onInterstitialAdLoadFailed(IronSourceError ironSourceError) {
        IronLog ironLog = IronLog.ADAPTER_CALLBACK;
        ironLog.verbose("error=" + ironSourceError.getErrorMessage() + " instance name= " + m56905h() + " state=" + m56902k());
        m56966a(InterfaceC20363e.C20366c.f51441d, new Object[][]{new Object[]{"errorCode", Integer.valueOf(ironSourceError.getErrorCode())}, new Object[]{"reason", ironSourceError.getErrorMessage()}, new Object[]{"duration", Long.valueOf(C21008ta.m54805a(this.f51452o))}});
        m56965a(ironSourceError);
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialSmashListener
    public void onInterstitialAdOpened() {
        IronLog ironLog = IronLog.ADAPTER_CALLBACK;
        ironLog.verbose("instance name= " + m56905h());
        m56966a(2005, new Object[0]);
        m56963a(this.f51454q.m54514a(), IronSourceUtils.getCurrentMethodName());
        this.f51453p.onInterstitialAdOpened(m56901l());
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialSmashListener
    public void onInterstitialAdReady() {
        IronLog ironLog = IronLog.ADAPTER_CALLBACK;
        ironLog.verbose("instance name= " + m56905h() + " state=" + m56902k());
        m56897p();
        m56966a(InterfaceC20363e.C20366c.f51440c, new Object[][]{new Object[]{"duration", Long.valueOf(C21008ta.m54805a(this.f51452o))}});
        if (m56916a(C20387m.EnumC20388a.LOAD_IN_PROGRESS, C20387m.EnumC20388a.LOADED)) {
            m56966a(2003, new Object[][]{new Object[]{"duration", Long.valueOf(C21008ta.m54805a(this.f51451n))}});
            m56963a(this.f51454q.m54510c(), IronSourceUtils.getCurrentMethodName());
            this.f51453p.onInterstitialAdReady(m56901l());
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialSmashListener
    public void onInterstitialAdShowFailed(IronSourceError ironSourceError) {
        IronLog ironLog = IronLog.ADAPTER_CALLBACK;
        ironLog.verbose("error=" + ironSourceError.toString() + " instance name= " + m56905h() + " state=" + m56902k());
        m56909b(C20387m.EnumC20388a.NOT_LOADED);
        m56966a(2203, new Object[][]{new Object[]{"errorCode", Integer.valueOf(ironSourceError.getErrorCode())}, new Object[]{"reason", ironSourceError.getErrorMessage()}});
        this.f51453p.onInterstitialAdShowFailed(m56901l(), ironSourceError);
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialSmashListener
    public void onInterstitialAdVisible() {
        IronLog ironLog = IronLog.ADAPTER_CALLBACK;
        ironLog.verbose("instance name= " + m56905h());
        m56966a(2210, new Object[0]);
    }

    /* renamed from: a */
    private void m56966a(int i, Object[][] objArr) {
        Map<String, Object> mo56903j = mo56903j();
        if (objArr != null) {
            try {
                for (Object[] objArr2 : objArr) {
                    mo56903j.put(objArr2[0].toString(), objArr2[1]);
                }
            } catch (Exception e) {
                C20086i9.m57997d().m58003a(e);
                IronLog.INTERNAL.error("Exception: " + Log.getStackTraceString(e));
            }
        }
        C20154ji.m57833i().mo57283a(new C20200kb(i, new JSONObject(mo56903j)));
    }

    /* renamed from: c */
    private void m56962c(InterfaceC20392o interfaceC20392o) {
        this.f51451n = new C21008ta();
        m56913a(new C20369a());
        if (!m56899n()) {
            m56965a(new IronSourceError(2303, "loadInterstitialWithAdm: must be called by bidder instance"));
            return;
        }
        try {
            C20348d.C20349a c20349a = (C20348d.C20349a) interfaceC20392o.mo56888a(new C21259ya());
            C19897f5 mo56986a = new InterfaceC20353a.C20354a(c20349a.m56991h()).mo56986a(m56905h());
            if (mo56986a == null) {
                IronSourceError buildLoadFailedError = ErrorBuilder.buildLoadFailedError("loadInterstitialWithAdm invalid enriched adm");
                m56966a(2303, (Object[][]) null);
                m56965a(buildLoadFailedError);
                return;
            }
            String m58643j = mo56986a.m58643j();
            if (m58643j == null) {
                IronLog.INTERNAL.error("serverData is null");
                m56965a(new IronSourceError(InterfaceC20363e.C20364a.f51418i, "No available ad to load"));
                return;
            }
            m56908b(m58643j);
            m56915a(c20349a.m57007a());
            m56912a(c20349a.m56993f());
            m56966a(82002, (Object[][]) null);
            this.f51454q.m54513a(mo56986a.m58651b());
            this.f51452o = new C21008ta();
            this.f51525a.loadInterstitialForBidding(this.f51527c, null, m58643j, this);
        } catch (Exception e) {
            C20086i9.m57997d().m58003a(e);
            m56965a(ErrorBuilder.buildLoadFailedError("loadInterstitialWithAdm: Exception= " + e.getMessage()));
        }
    }

    /* renamed from: c */
    private void m56961c(String str) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose();
        if (m56917a(C20387m.EnumC20388a.LOAD_IN_PROGRESS)) {
            if (str == null) {
                ironLog.verbose("serverData is null");
                m56965a(new IronSourceError(InterfaceC20363e.C20364a.f51418i, "No available ad to load"));
                return;
            }
            m56966a(82002, (Object[][]) null);
            this.f51525a.loadInterstitialForBidding(this.f51527c, null, str, this);
        }
    }

    @Override // com.ironsource.InterfaceC21000t4
    /* renamed from: a */
    public void mo54823a(C20348d.C20349a c20349a, int i, long j, int i2, String str) {
        String str2;
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose();
        this.f51531g = c20349a.m57007a();
        this.f51532h = c20349a.m56993f();
        this.f51456s = c20349a.m56999a(m56901l());
        InterfaceC20353a.C20354a c20354a = new InterfaceC20353a.C20354a(c20349a.m56991h());
        if (c20354a.isEmpty()) {
            str2 = "";
        } else {
            C19897f5 c19897f5 = c20354a.get(0);
            this.f51454q.m54513a(c19897f5.m58651b());
            this.f51454q.m54509c(c19897f5.m58646g());
            this.f51454q.m54511b(c19897f5.m58647f());
            str2 = c19897f5.m58643j();
            m56908b(str2);
        }
        if (!TextUtils.isEmpty(str)) {
            m56966a(88002, new Object[][]{new Object[]{"errorCode", Integer.valueOf(i2)}, new Object[]{"reason", str}});
        }
        m56966a(82301, new Object[][]{new Object[]{"duration", Long.valueOf(j)}});
        m56966a(82302, new Object[][]{new Object[]{IronSourceConstants.EVENTS_EXT1, c20354a.mo56985b()}});
        if (m56917a(C20387m.EnumC20388a.LOAD_IN_PROGRESS)) {
            if (!c20354a.isEmpty()) {
                m56961c(str2);
                return;
            }
            IronSourceError ironSourceError = new IronSourceError(1158, "There is no available ad to load");
            ironLog.error("interstitial - empty waterfall");
            m56965a(ironSourceError);
        }
    }

    @Override // com.ironsource.mediationsdk.demandOnly.InterfaceC20389n.InterfaceC20390a
    /* renamed from: a */
    public void mo56895a(InterfaceC20392o interfaceC20392o) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose("state=" + m56902k());
        C20387m.EnumC20388a enumC20388a = C20387m.EnumC20388a.NOT_LOADED;
        C20387m.EnumC20388a enumC20388a2 = C20387m.EnumC20388a.LOADED;
        C20387m.EnumC20388a enumC20388a3 = C20387m.EnumC20388a.LOAD_IN_PROGRESS;
        C20387m.EnumC20388a m56910a = m56910a(new C20387m.EnumC20388a[]{enumC20388a, enumC20388a2}, enumC20388a3);
        if (m56910a != enumC20388a && m56910a != enumC20388a2) {
            m56965a(new IronSourceError(1050, m56910a == enumC20388a3 ? "load already in progress" : "cannot load because show is in progress"));
            return;
        }
        m56957t();
        m56966a(2002, (Object[][]) null);
        m56962c(interfaceC20392o);
    }

    /* renamed from: a */
    void m56965a(IronSourceError ironSourceError) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose("instanceName = " + m56905h() + ", error = " + ironSourceError.getErrorMessage());
        m56897p();
        if (m56916a(C20387m.EnumC20388a.LOAD_IN_PROGRESS, C20387m.EnumC20388a.NOT_LOADED)) {
            m56964a(ironSourceError, C21008ta.m54805a(this.f51451n));
            m56963a(this.f51454q.m54512b(), IronSourceUtils.getCurrentMethodName());
            this.f51453p.onInterstitialAdLoadFailed(m56901l(), ironSourceError);
        }
    }

    /* renamed from: a */
    private void m56964a(IronSourceError ironSourceError, long j) {
        if (ironSourceError.getErrorCode() == 1158) {
            m56966a(2213, new Object[][]{new Object[]{"duration", Long.valueOf(j)}, new Object[]{"errorCode", Integer.valueOf(ironSourceError.getErrorCode())}});
        } else {
            m56966a(2200, new Object[][]{new Object[]{"duration", Long.valueOf(j)}, new Object[]{"errorCode", Integer.valueOf(ironSourceError.getErrorCode())}, new Object[]{"reason", ironSourceError.getErrorMessage()}});
        }
    }

    /* renamed from: a */
    private void m56963a(List<String> list, String str) {
        m56914a(list, m56905h(), m56904i(), this.f51534j, str);
    }

    @Override // com.ironsource.InterfaceC20244l4
    /* renamed from: a */
    public void mo56434a(List<C19897f5> list, String str, C19897f5 c19897f5, JSONObject jSONObject, JSONObject jSONObject2, int i, long j, int i2, String str2) {
        IronLog.INTERNAL.error("Deprecated: Please use onAuctionSuccess(AuctionDataUtils.AuctionData auctionData, int auctionTrial, long elapsedTime, int troubleshootingErrorCode, String troubleshootingErrorMessage)");
    }

    @Override // com.ironsource.mediationsdk.demandOnly.InterfaceC20389n.InterfaceC20390a
    /* renamed from: a */
    public boolean mo56896a() {
        boolean z = false;
        if (!m56917a(C20387m.EnumC20388a.LOADED)) {
            m56966a(2212, (Object[][]) null);
            return false;
        }
        try {
            z = this.f51525a.isInterstitialReady(this.f51527c);
            m56966a(z ? 2211 : 2212, (Object[][]) null);
        } catch (Exception e) {
            C20086i9.m57997d().m58003a(e);
            IronLog ironLog = IronLog.INTERNAL;
            ironLog.error("exception=" + e.getMessage());
        }
        return z;
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialSmashListener
    public void onInterstitialAdShowSucceeded() {
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialSmashListener
    public void onInterstitialInitSuccess() {
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialSmashListener
    public void onInterstitialInitFailed(IronSourceError ironSourceError) {
    }
}
