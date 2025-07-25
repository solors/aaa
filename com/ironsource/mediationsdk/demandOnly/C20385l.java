package com.ironsource.mediationsdk.demandOnly;

import android.text.TextUtils;
import android.util.Log;
import com.ironsource.C19821el;
import com.ironsource.C19897f5;
import com.ironsource.C20086i9;
import com.ironsource.C20200kb;
import com.ironsource.C20772rp;
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
import com.ironsource.mediationsdk.C20423p;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.demandOnly.C20387m;
import com.ironsource.mediationsdk.demandOnly.InterfaceC20353a;
import com.ironsource.mediationsdk.demandOnly.InterfaceC20380j;
import com.ironsource.mediationsdk.demandOnly.InterfaceC20389n;
import com.ironsource.mediationsdk.demandOnly.InterfaceC20394p;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.model.Placement;
import com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener;
import com.ironsource.mediationsdk.utils.ErrorBuilder;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import java.util.List;
import java.util.Map;
import java.util.TimerTask;
import org.json.JSONObject;

/* renamed from: com.ironsource.mediationsdk.demandOnly.l */
/* loaded from: classes6.dex */
public class C20385l extends C20387m implements InterfaceC20389n.InterfaceC20391b, RewardedVideoSmashListener, InterfaceC21000t4 {

    /* renamed from: n */
    private C21008ta f51516n;

    /* renamed from: o */
    private C21008ta f51517o;

    /* renamed from: p */
    private ISDemandOnlyRewardedVideoListener f51518p;

    /* renamed from: q */
    private C21110v4 f51519q;

    /* renamed from: r */
    private C20400e f51520r;

    /* renamed from: s */
    private InterfaceC20394p f51521s;

    /* renamed from: t */
    private final InterfaceC20470mg f51522t;

    /* renamed from: u */
    private final InterfaceC20470mg.InterfaceC20471a f51523u;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.ironsource.mediationsdk.demandOnly.l$a */
    /* loaded from: classes6.dex */
    public class C20386a extends TimerTask {
        C20386a() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            IronLog ironLog = IronLog.INTERNAL;
            ironLog.verbose("load timed out state=" + C20385l.this.m56902k());
            C20385l.this.m56929a(new IronSourceError(1055, "load timed out"));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C20385l(String str, String str2, NetworkSettings networkSettings, ISDemandOnlyRewardedVideoListener iSDemandOnlyRewardedVideoListener, long j, AbstractAdapter abstractAdapter, C20400e c20400e) {
        super(new C21108v2(networkSettings, networkSettings.getRewardedVideoSettings(), IronSource.AD_UNIT.REWARDED_VIDEO), abstractAdapter);
        this.f51521s = new InterfaceC20394p.C20396b();
        this.f51522t = C19821el.m58797N().mo57093k();
        this.f51523u = C19821el.m58802I().mo57487e();
        this.f51518p = iSDemandOnlyRewardedVideoListener;
        this.f51530f = j;
        this.f51520r = c20400e;
        this.f51525a.initRewardedVideoForDemandOnly(str, str2, this.f51527c, this);
    }

    /* renamed from: c */
    private void m56926c(InterfaceC20392o interfaceC20392o) {
        this.f51516n = new C21008ta();
        m56913a(m56922s());
        if (!m56899n()) {
            m56929a(new IronSourceError(InterfaceC20380j.C20381a.f51485k, "loadRewardedVideoWithAdm: must be called by bidder instance"));
            return;
        }
        try {
            C20348d.C20349a c20349a = (C20348d.C20349a) interfaceC20392o.mo56888a(new C21259ya());
            C19897f5 mo56986a = new InterfaceC20353a.C20354a(c20349a.m56991h()).mo56986a(m56905h());
            if (mo56986a == null) {
                IronSourceError buildLoadFailedError = ErrorBuilder.buildLoadFailedError("loadRewardedVideoWithAdm invalid enriched adm");
                m56930a(InterfaceC20380j.C20381a.f51485k, (Object[][]) null);
                m56929a(buildLoadFailedError);
                return;
            }
            String m58643j = mo56986a.m58643j();
            if (m58643j == null) {
                IronLog.INTERNAL.error("serverData is null");
                m56929a(new IronSourceError(1062, "No available ad to load"));
                return;
            }
            m56908b(m58643j);
            m56915a(c20349a.m57007a());
            m56912a(c20349a.m56993f());
            m56930a(81002, (Object[][]) null);
            this.f51519q.m54513a(mo56986a.m58651b());
            this.f51517o = new C21008ta();
            this.f51525a.loadRewardedVideoForBidding(this.f51527c, null, m58643j, this);
        } catch (Exception e) {
            C20086i9.m57997d().m58003a(e);
            m56929a(ErrorBuilder.buildLoadFailedError("loadRewardedVideoWithAdm: Exception= " + e.getMessage()));
        }
    }

    /* renamed from: q */
    private IronSourceError m56924q() {
        if (m56917a(C20387m.EnumC20388a.SHOW_IN_PROGRESS)) {
            return new IronSourceError(1067, "showRewardedVideo error: can't show ad while an ad is already showing");
        }
        if (m56917a(C20387m.EnumC20388a.LOAD_IN_PROGRESS)) {
            return new IronSourceError(1068, "showRewardedVideo error: can't show ad while an ad is loading");
        }
        return new IronSourceError(1069, "showRewardedVideo error: no available ads to show");
    }

    /* renamed from: r */
    private C20406i m56923r() {
        C20406i c20406i = new C20406i(this.f51537m);
        c20406i.m56843b(IronSourceUtils.isEncryptedResponse());
        c20406i.m56846a(true);
        c20406i.m56840c(true);
        c20406i.m56838d(m56904i() + m56905h());
        c20406i.m56841c(m56901l());
        c20406i.m56857a(this.f51522t.mo56312a(this.f51537m));
        C21253y4 c21253y4 = new C21253y4(m56905h(), false);
        c21253y4.m54044a(this.f51521s.value());
        Map<String, Object> rewardedVideoBiddingData = this.f51525a.getRewardedVideoBiddingData(this.f51527c, new JSONObject());
        if (rewardedVideoBiddingData != null) {
            c21253y4.m54039b(rewardedVideoBiddingData);
        }
        c20406i.m56851a(c21253y4);
        return c20406i;
    }

    /* renamed from: s */
    private TimerTask m56922s() {
        return new C20386a();
    }

    /* renamed from: t */
    private void m56921t() {
        this.f51517o = new C21008ta();
        this.f51525a.loadRewardedVideo(this.f51527c, null, this);
    }

    /* renamed from: u */
    private void m56920u() {
        if (!this.f51520r.m56883a()) {
            IronLog.INTERNAL.verbose("can't load the rewarded video the auction isn't enabled");
            m56929a(new IronSourceError(1063, "Missing server configuration"));
            return;
        }
        m56930a(81500, (Object[][]) null);
        C20406i m56923r = m56923r();
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose("auction waterfallString = " + m56923r.m56823q());
        m56930a(81510, new Object[][]{new Object[]{IronSourceConstants.EVENTS_EXT1, m56923r.m56823q()}});
        this.f51520r.m56882a(ContextProvider.getInstance().getApplicationContext(), m56923r, this);
    }

    /* renamed from: v */
    private void m56919v() {
        this.f51531g = null;
        this.f51532h = null;
        this.f51534j = null;
        this.f51519q = new C21110v4();
    }

    /* renamed from: w */
    private void m56918w() {
        this.f51516n = new C21008ta();
        m56913a(m56922s());
        if (m56899n()) {
            IronSourceError buildLoadFailedError = ErrorBuilder.buildLoadFailedError("loadRewardedVideo must be called by non bidder instances");
            m56930a(InterfaceC20380j.C20381a.f51485k, (Object[][]) null);
            m56929a(buildLoadFailedError);
        } else if (m56898o()) {
            m56920u();
        } else {
            m56921t();
        }
    }

    @Override // com.ironsource.InterfaceC20244l4
    /* renamed from: a */
    public void mo56457a(int i, String str, int i2, String str2, long j) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose("Auction failed. error " + i + " - " + str);
        this.f51531g = null;
        this.f51532h = null;
        m56930a(81300, new Object[][]{new Object[]{"errorCode", Integer.valueOf(i)}, new Object[]{"reason", str}, new Object[]{"duration", Long.valueOf(j)}, new Object[]{IronSourceConstants.EVENTS_EXT1, m56902k()}});
        if (m56917a(C20387m.EnumC20388a.LOAD_IN_PROGRESS)) {
            m56929a(new IronSourceError(InterfaceC20380j.C20381a.f51484j, "No available ad to load"));
        }
    }

    @Override // com.ironsource.mediationsdk.demandOnly.InterfaceC20389n.InterfaceC20391b
    /* renamed from: b */
    public void mo56891b(InterfaceC20392o interfaceC20392o) {
        String str;
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose("state=" + m56902k());
        C20387m.EnumC20388a enumC20388a = C20387m.EnumC20388a.NOT_LOADED;
        C20387m.EnumC20388a enumC20388a2 = C20387m.EnumC20388a.LOADED;
        C20387m.EnumC20388a enumC20388a3 = C20387m.EnumC20388a.LOAD_IN_PROGRESS;
        C20387m.EnumC20388a m56910a = m56910a(new C20387m.EnumC20388a[]{enumC20388a, enumC20388a2}, enumC20388a3);
        if (m56910a != enumC20388a && m56910a != enumC20388a2) {
            if (m56910a == enumC20388a3) {
                str = "load already in progress";
            } else {
                str = "cannot load because show is in progress";
            }
            m56929a(new IronSourceError(1053, str));
            return;
        }
        m56919v();
        m56930a(1001, (Object[][]) null);
        m56926c(interfaceC20392o);
    }

    @Override // com.ironsource.mediationsdk.demandOnly.InterfaceC20389n.InterfaceC20391b
    /* renamed from: d */
    public void mo56890d() {
        String str;
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose("state=" + m56902k());
        C20387m.EnumC20388a enumC20388a = C20387m.EnumC20388a.NOT_LOADED;
        C20387m.EnumC20388a enumC20388a2 = C20387m.EnumC20388a.LOADED;
        C20387m.EnumC20388a enumC20388a3 = C20387m.EnumC20388a.LOAD_IN_PROGRESS;
        C20387m.EnumC20388a m56910a = m56910a(new C20387m.EnumC20388a[]{enumC20388a, enumC20388a2}, enumC20388a3);
        if (m56910a != enumC20388a && m56910a != enumC20388a2) {
            if (m56910a == enumC20388a3) {
                str = "load already in progress";
            } else {
                str = "cannot load because show is in progress";
            }
            this.f51518p.onRewardedVideoAdLoadFailed(m56901l(), new IronSourceError(1053, str));
            return;
        }
        m56919v();
        m56930a(1001, (Object[][]) null);
        m56918w();
    }

    @Override // com.ironsource.mediationsdk.demandOnly.InterfaceC20389n.InterfaceC20391b
    /* renamed from: e */
    public void mo56889e() {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose("instanceName = " + m56905h() + ", state=" + m56902k());
        m56930a(1201, (Object[][]) null);
        if (m56916a(C20387m.EnumC20388a.LOADED, C20387m.EnumC20388a.SHOW_IN_PROGRESS)) {
            this.f51525a.showRewardedVideo(this.f51527c, this);
        } else {
            onRewardedVideoAdShowFailed(m56924q());
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoAdClicked() {
        IronLog ironLog = IronLog.ADAPTER_CALLBACK;
        ironLog.verbose("instance name= " + m56905h());
        m56930a(1006, new Object[0]);
        this.f51518p.onRewardedVideoAdClicked(m56901l());
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoAdClosed() {
        m56909b(C20387m.EnumC20388a.NOT_LOADED);
        IronLog ironLog = IronLog.ADAPTER_CALLBACK;
        ironLog.verbose("instance name= " + m56905h());
        m56930a(1203, new Object[][]{new Object[]{"sessionDepth", Integer.valueOf(this.f51522t.mo56312a(this.f51537m))}});
        this.f51523u.mo56311b(this.f51537m);
        this.f51518p.onRewardedVideoAdClosed(m56901l());
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoAdOpened() {
        IronLog ironLog = IronLog.ADAPTER_CALLBACK;
        ironLog.verbose("instance name= " + m56905h());
        m56930a(1005, new Object[0]);
        m56927a(this.f51519q.m54514a(), IronSourceUtils.getCurrentMethodName());
        this.f51518p.onRewardedVideoAdOpened(m56901l());
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoAdRewarded() {
        IronLog ironLog = IronLog.ADAPTER_CALLBACK;
        ironLog.verbose("instance name= " + m56905h());
        Map<String, Object> mo56903j = mo56903j();
        if (!TextUtils.isEmpty(C20423p.m56615m().m56617l())) {
            mo56903j.put(IronSourceConstants.EVENTS_DYNAMIC_USER_ID, C20423p.m56615m().m56617l());
        }
        if (C20423p.m56615m().m56603s() != null) {
            for (String str : C20423p.m56615m().m56603s().keySet()) {
                mo56903j.put("custom_" + str, C20423p.m56615m().m56603s().get(str));
            }
        }
        Placement m55770a = C20423p.m56615m().m56624h().m59048c().m57209f().m55770a();
        if (m55770a != null) {
            mo56903j.put("placement", m55770a.getPlacementName());
            mo56903j.put(IronSourceConstants.EVENTS_REWARD_NAME, m55770a.getRewardName());
            mo56903j.put(IronSourceConstants.EVENTS_REWARD_AMOUNT, Integer.valueOf(m55770a.getRewardAmount()));
        } else {
            IronLog.INTERNAL.error("defaultPlacement is null");
        }
        C20200kb c20200kb = new C20200kb(1010, new JSONObject(mo56903j));
        c20200kb.m57655a(IronSourceConstants.EVENTS_TRANS_ID, IronSourceUtils.getTransId(c20200kb.m57652d(), m56905h()));
        C20772rp.m55443i().mo57283a(c20200kb);
        this.f51518p.onRewardedVideoAdRewarded(m56901l());
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoAdShowFailed(IronSourceError ironSourceError) {
        IronLog ironLog = IronLog.ADAPTER_CALLBACK;
        ironLog.verbose("error=" + ironSourceError.toString() + " instance name= " + m56905h() + " state=" + m56902k());
        m56909b(C20387m.EnumC20388a.NOT_LOADED);
        m56930a(1202, new Object[][]{new Object[]{"errorCode", Integer.valueOf(ironSourceError.getErrorCode())}, new Object[]{"reason", ironSourceError.getErrorMessage()}});
        this.f51518p.onRewardedVideoAdShowFailed(m56901l(), ironSourceError);
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoAdVisible() {
        IronLog ironLog = IronLog.ADAPTER_CALLBACK;
        ironLog.verbose("instance name= " + m56905h());
        m56930a(1206, new Object[0]);
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoLoadFailed(IronSourceError ironSourceError) {
        IronLog ironLog = IronLog.ADAPTER_CALLBACK;
        ironLog.verbose("error=" + ironSourceError.getErrorMessage() + "instance name= " + m56905h() + " state=" + m56902k());
        m56930a(InterfaceC20380j.C20383c.f51506d, new Object[][]{new Object[]{"errorCode", Integer.valueOf(ironSourceError.getErrorCode())}, new Object[]{"reason", ironSourceError.getErrorMessage()}, new Object[]{"duration", Long.valueOf(C21008ta.m54805a(this.f51517o))}});
        m56929a(ironSourceError);
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoLoadSuccess() {
        IronLog ironLog = IronLog.ADAPTER_CALLBACK;
        ironLog.verbose("instance name= " + m56905h() + " state=" + m56902k());
        m56897p();
        m56930a(InterfaceC20380j.C20383c.f51505c, new Object[][]{new Object[]{"duration", Long.valueOf(C21008ta.m54805a(this.f51517o))}});
        if (m56916a(C20387m.EnumC20388a.LOAD_IN_PROGRESS, C20387m.EnumC20388a.LOADED)) {
            m56930a(1002, new Object[][]{new Object[]{"duration", Long.valueOf(C21008ta.m54805a(this.f51516n))}});
            m56927a(this.f51519q.m54510c(), IronSourceUtils.getCurrentMethodName());
            this.f51518p.onRewardedVideoAdLoadSuccess(m56901l());
        }
    }

    /* renamed from: a */
    private void m56930a(int i, Object[][] objArr) {
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
        C20772rp.m55443i().mo57283a(new C20200kb(i, new JSONObject(mo56903j)));
    }

    /* renamed from: c */
    private void m56925c(String str) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose();
        if (m56917a(C20387m.EnumC20388a.LOAD_IN_PROGRESS)) {
            if (str == null) {
                ironLog.verbose("serverData is null");
                m56929a(new IronSourceError(1062, "No available ad to load"));
                return;
            }
            m56930a(81002, (Object[][]) null);
            this.f51525a.loadRewardedVideoForBidding(this.f51527c, null, str, this);
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
        this.f51521s = c20349a.m56999a(m56901l());
        InterfaceC20353a.C20354a c20354a = new InterfaceC20353a.C20354a(c20349a.m56991h());
        if (c20354a.isEmpty()) {
            str2 = "";
        } else {
            C19897f5 c19897f5 = c20354a.get(0);
            this.f51519q.m54513a(c19897f5.m58651b());
            this.f51519q.m54509c(c19897f5.m58646g());
            this.f51519q.m54511b(c19897f5.m58647f());
            str2 = c19897f5.m58643j();
            m56908b(str2);
        }
        if (!TextUtils.isEmpty(str)) {
            m56930a(88002, new Object[][]{new Object[]{"errorCode", Integer.valueOf(i2)}, new Object[]{"reason", str}});
        }
        m56930a(81301, new Object[][]{new Object[]{"duration", Long.valueOf(j)}});
        m56930a(81302, new Object[][]{new Object[]{IronSourceConstants.EVENTS_EXT1, c20354a.mo56985b()}});
        if (m56917a(C20387m.EnumC20388a.LOAD_IN_PROGRESS)) {
            if (!c20354a.isEmpty()) {
                m56925c(str2);
                return;
            }
            IronSourceError ironSourceError = new IronSourceError(1058, "There is no available ad to load");
            ironLog.error("rewardedVideo - empty waterfall");
            m56929a(ironSourceError);
        }
    }

    /* renamed from: a */
    void m56929a(IronSourceError ironSourceError) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose("instanceName = " + m56905h() + ", error = " + ironSourceError.getErrorMessage());
        m56897p();
        if (m56916a(C20387m.EnumC20388a.LOAD_IN_PROGRESS, C20387m.EnumC20388a.NOT_LOADED)) {
            m56928a(ironSourceError, C21008ta.m54805a(this.f51516n));
            m56927a(this.f51519q.m54512b(), IronSourceUtils.getCurrentMethodName());
            this.f51518p.onRewardedVideoAdLoadFailed(m56901l(), ironSourceError);
        }
    }

    /* renamed from: a */
    private void m56928a(IronSourceError ironSourceError, long j) {
        if (ironSourceError.getErrorCode() == 1058) {
            m56930a(1213, new Object[][]{new Object[]{"duration", Long.valueOf(j)}, new Object[]{"errorCode", Integer.valueOf(ironSourceError.getErrorCode())}});
        } else {
            m56930a(1200, new Object[][]{new Object[]{"duration", Long.valueOf(j)}, new Object[]{"errorCode", Integer.valueOf(ironSourceError.getErrorCode())}, new Object[]{"reason", ironSourceError.getErrorMessage()}});
        }
    }

    /* renamed from: a */
    private void m56927a(List<String> list, String str) {
        m56914a(list, m56905h(), m56904i(), this.f51534j, str);
    }

    @Override // com.ironsource.InterfaceC20244l4
    /* renamed from: a */
    public void mo56434a(List<C19897f5> list, String str, C19897f5 c19897f5, JSONObject jSONObject, JSONObject jSONObject2, int i, long j, int i2, String str2) {
        IronLog.INTERNAL.error("Deprecated: Please use onAuctionSuccess(AuctionDataUtils.AuctionData auctionData, int auctionTrial, long elapsedTime, int troubleshootingErrorCode, String troubleshootingErrorMessage)");
    }

    @Override // com.ironsource.mediationsdk.demandOnly.InterfaceC20389n.InterfaceC20391b
    /* renamed from: a */
    public boolean mo56892a() {
        boolean z = false;
        if (!m56917a(C20387m.EnumC20388a.LOADED)) {
            m56930a(1211, (Object[][]) null);
            return false;
        }
        try {
            z = this.f51525a.isRewardedVideoAvailable(this.f51527c);
            m56930a(z ? 1210 : 1211, (Object[][]) null);
        } catch (Exception e) {
            C20086i9.m57997d().m58003a(e);
            IronLog ironLog = IronLog.INTERNAL;
            ironLog.error("exception=" + e.getMessage());
        }
        return z;
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoAdEnded() {
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoAdStarted() {
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoInitSuccess() {
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoAvailabilityChanged(boolean z) {
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoInitFailed(IronSourceError ironSourceError) {
    }
}
