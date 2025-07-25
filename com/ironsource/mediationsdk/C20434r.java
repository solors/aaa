package com.ironsource.mediationsdk;

import android.text.TextUtils;
import android.util.Log;
import com.ironsource.C19821el;
import com.ironsource.C20053hj;
import com.ironsource.C20086i9;
import com.ironsource.C20200kb;
import com.ironsource.C20772rp;
import com.ironsource.C21108v2;
import com.ironsource.InterfaceC20470mg;
import com.ironsource.InterfaceC20792s7;
import com.ironsource.InterfaceC21081uj;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdData;
import com.ironsource.mediationsdk.bidding.BiddingDataCallback;
import com.ironsource.mediationsdk.config.ConfigFile;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.model.Placement;
import com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import java.util.Date;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* renamed from: com.ironsource.mediationsdk.r */
/* loaded from: classes6.dex */
public class C20434r extends AbstractC20465y implements RewardedVideoSmashListener, InterfaceC20792s7 {

    /* renamed from: h */
    private EnumC20436b f51851h;

    /* renamed from: i */
    private InterfaceC21081uj f51852i;

    /* renamed from: j */
    private Timer f51853j;

    /* renamed from: k */
    private int f51854k;

    /* renamed from: l */
    private String f51855l;

    /* renamed from: m */
    private String f51856m;

    /* renamed from: n */
    private Placement f51857n;

    /* renamed from: o */
    private long f51858o;

    /* renamed from: p */
    private String f51859p;

    /* renamed from: q */
    private JSONObject f51860q;

    /* renamed from: r */
    private int f51861r;

    /* renamed from: s */
    private String f51862s;

    /* renamed from: t */
    private final Object f51863t;

    /* renamed from: u */
    private final Object f51864u;

    /* renamed from: v */
    private long f51865v;

    /* renamed from: w */
    private final InterfaceC20470mg.InterfaceC20471a f51866w;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.ironsource.mediationsdk.r$a */
    /* loaded from: classes6.dex */
    public class C20435a extends TimerTask {
        C20435a() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            int i;
            boolean z;
            EnumC20436b enumC20436b = C20434r.this.f51851h;
            EnumC20436b enumC20436b2 = EnumC20436b.LOAD_IN_PROGRESS;
            String str = "Rewarded Video - load instance time out";
            if (enumC20436b != enumC20436b2 && C20434r.this.f51851h != EnumC20436b.INIT_IN_PROGRESS) {
                i = 510;
                z = false;
            } else {
                if (C20434r.this.f51851h == enumC20436b2) {
                    i = 1025;
                } else {
                    i = 1032;
                    str = "Rewarded Video - init instance time out";
                }
                C20434r.this.m56541a(EnumC20436b.NOT_LOADED);
                z = true;
            }
            C20434r.this.m56367a(str);
            if (z) {
                C20434r.this.m56544a(1200, new Object[][]{new Object[]{"errorCode", Integer.valueOf(i)}, new Object[]{"duration", Long.valueOf(C20434r.this.m56529v())}});
                C20434r.this.m56544a(IronSourceConstants.RV_INSTANCE_LOAD_FAILED_REASON, new Object[][]{new Object[]{"errorCode", Integer.valueOf(i)}, new Object[]{"reason", str}, new Object[]{"duration", Long.valueOf(C20434r.this.m56529v())}});
                C20434r.this.f51852i.mo54630c(C20434r.this);
                return;
            }
            C20434r.this.m56544a(IronSourceConstants.RV_INSTANCE_AVAILABILITY_FALSE, new Object[][]{new Object[]{"errorCode", 1025}, new Object[]{"duration", Long.valueOf(C20434r.this.m56529v())}, new Object[]{IronSourceConstants.EVENTS_EXT1, C20434r.this.f51851h.name()}});
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: com.ironsource.mediationsdk.r$b */
    /* loaded from: classes6.dex */
    public enum EnumC20436b {
        NO_INIT,
        INIT_IN_PROGRESS,
        NOT_LOADED,
        LOAD_IN_PROGRESS,
        LOADED,
        SHOW_IN_PROGRESS,
        ENDED
    }

    public C20434r(C20434r c20434r, InterfaceC21081uj interfaceC21081uj, AbstractAdapter abstractAdapter, int i, String str, JSONObject jSONObject, int i2, String str2) {
        this(c20434r.f51855l, c20434r.f51856m, c20434r.f52025b.m54532h(), interfaceC21081uj, c20434r.f51854k, abstractAdapter, i);
        this.f51859p = str;
        this.f51860q = jSONObject;
        this.f51861r = i2;
        this.f51862s = str2;
    }

    /* renamed from: C */
    private void m56548C() {
        try {
            String pluginType = ConfigFile.getConfigFile().getPluginType();
            if (!TextUtils.isEmpty(pluginType)) {
                this.f52024a.setPluginData(pluginType);
            }
        } catch (Throwable th) {
            C20086i9.m57997d().m58003a(th);
            m56367a("setCustomParams() " + th.getMessage());
        }
    }

    /* renamed from: D */
    private void m56547D() {
        synchronized (this.f51864u) {
            Timer timer = new Timer();
            this.f51853j = timer;
            timer.schedule(new C20435a(), this.f51854k * 1000);
        }
    }

    /* renamed from: E */
    private void m56546E() {
        synchronized (this.f51864u) {
            Timer timer = this.f51853j;
            if (timer != null) {
                timer.cancel();
                this.f51853j = null;
            }
        }
    }

    /* renamed from: t */
    private void m56531t() {
        m56367a("isBidder = " + m56348p() + ", shouldEarlyInit = " + m56345s());
        m56541a(EnumC20436b.INIT_IN_PROGRESS);
        m56548C();
        try {
            this.f52024a.initRewardedVideoWithCallback(this.f51855l, this.f51856m, this.f52027d, this);
        } catch (Throwable th) {
            C20086i9.m57997d().m58003a(th);
            m56363b("initForBidding exception: " + th.getLocalizedMessage());
            onRewardedVideoInitFailed(new IronSourceError(IronSourceError.ERROR_RV_INSTANCE_INIT_EXCEPTION, th.getLocalizedMessage()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: v */
    public long m56529v() {
        return new Date().getTime() - this.f51858o;
    }

    /* renamed from: A */
    public boolean m56550A() {
        if (this.f51851h != EnumC20436b.LOADED) {
            return false;
        }
        try {
            return this.f52024a.isRewardedVideoAvailable(this.f52027d);
        } catch (Throwable th) {
            C20086i9.m57997d().m58003a(th);
            m56363b("isReadyToShow exception: " + th.getLocalizedMessage());
            m56544a(IronSourceConstants.TROUBLESHOOTING_RV_SMASH_UNEXPECTED_EXCEPTION, new Object[][]{new Object[]{"errorCode", 5002}, new Object[]{"reason", th.getLocalizedMessage()}});
            return false;
        }
    }

    /* renamed from: B */
    public void m56549B() {
        m56545a(IronSourceConstants.RV_CAP_SESSION);
    }

    @Override // com.ironsource.mediationsdk.AbstractC20465y
    /* renamed from: d */
    public IronSource.AD_UNIT mo56360d() {
        return IronSource.AD_UNIT.REWARDED_VIDEO;
    }

    @Override // com.ironsource.mediationsdk.AbstractC20465y
    /* renamed from: k */
    public String mo56353k() {
        return "LWSProgRvSmash";
    }

    @Override // com.ironsource.mediationsdk.AbstractC20465y
    /* renamed from: l */
    public int mo56352l() {
        return 2;
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoAdClicked() {
        m56367a("onRewardedVideoAdClicked");
        this.f51852i.mo54631b(this, this.f51857n);
        m56537b(1006);
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoAdClosed() {
        m56367a("onRewardedVideoAdClosed");
        synchronized (this.f51863t) {
            if (this.f51851h != EnumC20436b.SHOW_IN_PROGRESS) {
                m56537b(1203);
                Object[] objArr = {"errorCode", Integer.valueOf((int) IronSourceConstants.errorCode_adClosed)};
                m56544a(IronSourceConstants.RV_SMASH_UNEXPECTED_STATE, new Object[][]{objArr, new Object[]{"reason", "adClosed: " + this.f51851h}});
                return;
            }
            m56541a(EnumC20436b.ENDED);
            this.f51865v = new Date().getTime();
            this.f51852i.mo54632b(this);
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoAdEnded() {
        m56367a("onRewardedVideoAdEnded");
        this.f51852i.mo54627f(this);
        m56537b(IronSourceConstants.RV_INSTANCE_ENDED);
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoAdOpened() {
        m56367a("onRewardedVideoAdOpened");
        this.f51852i.mo54629d(this);
        m56537b(1005);
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoAdRewarded() {
        m56367a("onRewardedVideoAdRewarded");
        long time = new Date().getTime();
        this.f51852i.mo54633a(this, this.f51857n);
        Map<String, Object> m56351m = m56351m();
        Placement placement = this.f51857n;
        if (placement != null) {
            m56351m.put("placement", placement.getPlacementName());
            m56351m.put(IronSourceConstants.EVENTS_REWARD_NAME, this.f51857n.getRewardName());
            m56351m.put(IronSourceConstants.EVENTS_REWARD_AMOUNT, Integer.valueOf(this.f51857n.getRewardAmount()));
        }
        if (!TextUtils.isEmpty(C20423p.m56615m().m56617l())) {
            m56351m.put(IronSourceConstants.EVENTS_DYNAMIC_USER_ID, C20423p.m56615m().m56617l());
        }
        if (C20423p.m56615m().m56603s() != null) {
            for (String str : C20423p.m56615m().m56603s().keySet()) {
                m56351m.put("custom_" + str, C20423p.m56615m().m56603s().get(str));
            }
        }
        if (!TextUtils.isEmpty(this.f51859p)) {
            m56351m.put("auctionId", this.f51859p);
        }
        JSONObject jSONObject = this.f51860q;
        if (jSONObject != null && jSONObject.length() > 0) {
            m56351m.put("genericParams", this.f51860q);
        }
        if (m56533c(1010)) {
            C20772rp.m55443i().m57260a(m56351m, this.f51861r, this.f51862s);
        }
        m56351m.put("sessionDepth", Integer.valueOf(this.f52029f));
        C20200kb c20200kb = new C20200kb(1010, new JSONObject(m56351m));
        c20200kb.m57655a(IronSourceConstants.EVENTS_TRANS_ID, IronSourceUtils.getTransId(c20200kb.m57652d(), mo56362c()));
        long j = this.f51865v;
        if (j != 0) {
            long j2 = time - j;
            m56367a("onRewardedVideoAdRewarded timeAfterClosed=" + j2);
            c20200kb.m57655a("duration", Long.valueOf(j2));
        }
        C20772rp.m55443i().mo57283a(c20200kb);
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoAdShowFailed(IronSourceError ironSourceError) {
        m56367a("onRewardedVideoAdShowFailed error=" + ironSourceError.getErrorMessage());
        m56536b(1202, new Object[][]{new Object[]{"errorCode", Integer.valueOf(ironSourceError.getErrorCode())}, new Object[]{"reason", ironSourceError.getErrorMessage()}});
        synchronized (this.f51863t) {
            if (this.f51851h != EnumC20436b.SHOW_IN_PROGRESS) {
                Object[] objArr = {"errorCode", Integer.valueOf((int) IronSourceConstants.errorCode_showFailed)};
                m56544a(IronSourceConstants.RV_SMASH_UNEXPECTED_STATE, new Object[][]{objArr, new Object[]{"reason", "showFailed: " + this.f51851h}});
                return;
            }
            m56541a(EnumC20436b.ENDED);
            this.f51852i.mo54635a(ironSourceError, this);
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoAdStarted() {
        m56367a("onRewardedVideoAdStarted");
        this.f51852i.mo54634a(this);
        m56537b(IronSourceConstants.RV_INSTANCE_STARTED);
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoAdVisible() {
        m56367a("onRewardedVideoAdVisible");
        m56537b(1206);
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoAvailabilityChanged(boolean z) {
        boolean z2;
        int i;
        EnumC20436b enumC20436b;
        m56367a("onRewardedVideoAvailabilityChanged available=" + z + " state=" + this.f51851h.name());
        synchronized (this.f51863t) {
            if (this.f51851h == EnumC20436b.LOAD_IN_PROGRESS) {
                if (z) {
                    enumC20436b = EnumC20436b.LOADED;
                } else {
                    enumC20436b = EnumC20436b.NOT_LOADED;
                }
                m56541a(enumC20436b);
                z2 = false;
            } else {
                z2 = true;
            }
        }
        if (z2) {
            if (z) {
                m56544a(IronSourceConstants.RV_INSTANCE_AVAILABILITY_TRUE, new Object[][]{new Object[]{IronSourceConstants.EVENTS_EXT1, this.f51851h.name()}});
                return;
            } else {
                m56544a(IronSourceConstants.RV_INSTANCE_AVAILABILITY_FALSE, new Object[][]{new Object[]{"errorCode", Integer.valueOf((int) IronSourceError.ERROR_RV_LOAD_UNEXPECTED_CALLBACK)}, new Object[]{"duration", Long.valueOf(m56529v())}, new Object[]{IronSourceConstants.EVENTS_EXT1, this.f51851h.name()}});
                return;
            }
        }
        m56546E();
        if (z) {
            i = 1002;
        } else {
            i = 1200;
        }
        m56544a(i, new Object[][]{new Object[]{"duration", Long.valueOf(m56529v())}});
        if (z) {
            this.f51852i.mo54628e(this);
        } else {
            this.f51852i.mo54630c(this);
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoInitFailed(IronSourceError ironSourceError) {
        m56367a("onRewardedVideoInitFailed error=" + ironSourceError.getErrorMessage());
        m56546E();
        m56544a(1200, new Object[][]{new Object[]{"errorCode", Integer.valueOf((int) IronSourceError.ERROR_RV_LOAD_FAIL_DUE_TO_INIT)}, new Object[]{"duration", Long.valueOf(m56529v())}});
        m56544a(IronSourceConstants.RV_INSTANCE_LOAD_FAILED_REASON, new Object[][]{new Object[]{"errorCode", Integer.valueOf(ironSourceError.getErrorCode())}, new Object[]{"reason", ironSourceError.getErrorMessage()}, new Object[]{"duration", Long.valueOf(m56529v())}});
        synchronized (this.f51863t) {
            if (this.f51851h != EnumC20436b.INIT_IN_PROGRESS) {
                Object[] objArr = {"errorCode", Integer.valueOf((int) IronSourceConstants.errorCode_initFailed)};
                m56544a(IronSourceConstants.RV_SMASH_UNEXPECTED_STATE, new Object[][]{objArr, new Object[]{"reason", "initFailed: " + this.f51851h}});
                return;
            }
            m56541a(EnumC20436b.NO_INIT);
            this.f51852i.mo54630c(this);
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoInitSuccess() {
        m56367a("onRewardedVideoInitSuccess");
        synchronized (this.f51863t) {
            if (this.f51851h != EnumC20436b.INIT_IN_PROGRESS) {
                Object[] objArr = {"errorCode", Integer.valueOf((int) IronSourceConstants.errorCode_initSuccess)};
                m56544a(IronSourceConstants.RV_SMASH_UNEXPECTED_STATE, new Object[][]{objArr, new Object[]{"reason", "initSuccess: " + this.f51851h}});
                return;
            }
            m56541a(EnumC20436b.NOT_LOADED);
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoLoadFailed(IronSourceError ironSourceError) {
        if (ironSourceError.getErrorCode() == 1058) {
            m56544a(1213, new Object[][]{new Object[]{"errorCode", Integer.valueOf(ironSourceError.getErrorCode())}, new Object[]{"duration", Long.valueOf(m56529v())}});
            return;
        }
        if (ironSourceError.getErrorCode() == 1057) {
            this.f52030g = Long.valueOf(System.currentTimeMillis());
        }
        m56544a(IronSourceConstants.RV_INSTANCE_LOAD_FAILED_REASON, new Object[][]{new Object[]{"errorCode", Integer.valueOf(ironSourceError.getErrorCode())}, new Object[]{"reason", ironSourceError.getErrorMessage()}, new Object[]{"duration", Long.valueOf(m56529v())}});
    }

    /* renamed from: u */
    public String m56530u() {
        return this.f51859p;
    }

    /* renamed from: w */
    public LoadWhileShowSupportState m56528w() {
        try {
            return this.f52024a.getLoadWhileShowSupportState(this.f52027d);
        } catch (Throwable th) {
            C20086i9.m57997d().m58003a(th);
            m56363b("Exception while calling adapter.getLoadWhileShowSupportState() - " + th.getLocalizedMessage());
            return LoadWhileShowSupportState.NONE;
        }
    }

    /* renamed from: x */
    public Placement m56527x() {
        return this.f51857n;
    }

    /* renamed from: y */
    public boolean m56526y() {
        if (this.f51851h == EnumC20436b.LOADED) {
            return true;
        }
        return false;
    }

    /* renamed from: z */
    public boolean m56525z() {
        EnumC20436b enumC20436b = this.f51851h;
        if (enumC20436b != EnumC20436b.INIT_IN_PROGRESS && enumC20436b != EnumC20436b.LOAD_IN_PROGRESS) {
            return false;
        }
        return true;
    }

    public C20434r(String str, String str2, NetworkSettings networkSettings, InterfaceC21081uj interfaceC21081uj, int i, AbstractAdapter abstractAdapter, int i2) {
        super(new C21108v2(networkSettings, networkSettings.getRewardedVideoSettings(), IronSource.AD_UNIT.REWARDED_VIDEO), abstractAdapter);
        this.f51863t = new Object();
        this.f51864u = new Object();
        this.f51866w = C19821el.m58802I().mo57487e();
        this.f51855l = str;
        this.f51856m = str2;
        this.f51852i = interfaceC21081uj;
        this.f51853j = null;
        this.f51854k = i;
        this.f52029f = i2;
        this.f51851h = EnumC20436b.NO_INIT;
        this.f51865v = 0L;
        if (m56346r()) {
            m56531t();
        }
    }

    /* renamed from: b */
    private void m56537b(int i) {
        m56536b(i, null);
    }

    /* renamed from: c */
    private boolean m56533c(int i) {
        return i == 1001 || i == 1002 || i == 1200 || i == 1212 || i == 1213 || i == 1005 || i == 1203 || i == 1201 || i == 1202 || i == 1006 || i == 1010;
    }

    @Override // com.ironsource.InterfaceC20792s7
    /* renamed from: a */
    public Map<String, Object> mo55385a(AdData adData) {
        JSONObject m58126a = adData != null ? C20053hj.m58126a(adData.getAdUnitData()) : null;
        if (m56348p()) {
            return this.f52024a.getRewardedVideoBiddingData(this.f52027d, m58126a);
        }
        return null;
    }

    /* renamed from: a */
    public void m56545a(int i) {
        m56543a(i, null, false);
    }

    /* renamed from: b */
    public void m56536b(int i, Object[][] objArr) {
        m56543a(i, objArr, true);
    }

    /* renamed from: a */
    public void m56544a(int i, Object[][] objArr) {
        m56543a(i, objArr, false);
    }

    /* renamed from: b */
    public void m56534b(boolean z) {
        Object[][] objArr = new Object[1];
        Object[] objArr2 = new Object[2];
        objArr2[0] = "status";
        objArr2[1] = z ? "true" : "false";
        objArr[0] = objArr2;
        m56536b(IronSourceConstants.RV_INSTANCE_SHOW_CHANCE, objArr);
    }

    /* renamed from: a */
    private void m56543a(int i, Object[][] objArr, boolean z) {
        Placement placement;
        Map<String, Object> m56351m = m56351m();
        if (!TextUtils.isEmpty(this.f51859p)) {
            m56351m.put("auctionId", this.f51859p);
        }
        JSONObject jSONObject = this.f51860q;
        if (jSONObject != null && jSONObject.length() > 0) {
            m56351m.put("genericParams", this.f51860q);
        }
        if (z && (placement = this.f51857n) != null && !TextUtils.isEmpty(placement.getPlacementName())) {
            m56351m.put("placement", this.f51857n.getPlacementName());
        }
        if (m56533c(i)) {
            C20772rp.m55443i().m57260a(m56351m, this.f51861r, this.f51862s);
        }
        m56351m.put("sessionDepth", Integer.valueOf(this.f52029f));
        if (objArr != null) {
            try {
                for (Object[] objArr2 : objArr) {
                    m56351m.put(objArr2[0].toString(), objArr2[1]);
                }
            } catch (Exception e) {
                C20086i9.m57997d().m58003a(e);
                IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.INTERNAL, mo56362c() + " smash: RV sendProviderEvent " + Log.getStackTraceString(e), 3);
            }
        }
        C20772rp.m55443i().mo57283a(new C20200kb(i, new JSONObject(m56351m)));
        if (i == 1203) {
            this.f51866w.mo56311b(IronSource.AD_UNIT.REWARDED_VIDEO);
        }
    }

    @Override // com.ironsource.InterfaceC20792s7
    /* renamed from: a */
    public void mo55384a(AdData adData, @NotNull BiddingDataCallback biddingDataCallback) {
        m56545a(1020);
        try {
            this.f52024a.collectRewardedVideoBiddingData(this.f52027d, adData != null ? C20053hj.m58126a(adData.getAdUnitData()) : null, biddingDataCallback);
        } catch (Throwable th) {
            C20086i9.m57997d().m58003a(th);
            m56363b("collectBiddingData exception: " + th.getLocalizedMessage());
            IronLog.INTERNAL.error(th.toString());
        }
    }

    /* renamed from: a */
    public void m56542a(Placement placement) {
        m56546E();
        m56367a("showVideo()");
        this.f51857n = placement;
        m56541a(EnumC20436b.SHOW_IN_PROGRESS);
        m56537b(1201);
        try {
            this.f52024a.showRewardedVideo(this.f52027d, this);
        } catch (Throwable th) {
            C20086i9.m57997d().m58003a(th);
            m56363b("showVideo exception: " + th.getLocalizedMessage());
            onRewardedVideoAdShowFailed(new IronSourceError(IronSourceError.ERROR_RV_SHOW_EXCEPTION, th.getLocalizedMessage()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m56541a(EnumC20436b enumC20436b) {
        m56367a("current state=" + this.f51851h + ", new state=" + enumC20436b);
        synchronized (this.f51863t) {
            this.f51851h = enumC20436b;
        }
    }

    /* renamed from: a */
    public void m56538a(String str, JSONObject jSONObject) {
        EnumC20436b enumC20436b;
        EnumC20436b enumC20436b2;
        m56367a("loadVideo() auctionId: " + this.f51859p + " state: " + this.f51851h);
        this.f52030g = null;
        m56365a(false);
        synchronized (this.f51863t) {
            enumC20436b = this.f51851h;
            enumC20436b2 = EnumC20436b.LOAD_IN_PROGRESS;
            if (enumC20436b != enumC20436b2 && enumC20436b != EnumC20436b.SHOW_IN_PROGRESS) {
                m56541a(enumC20436b2);
            }
        }
        if (enumC20436b == enumC20436b2) {
            m56544a(IronSourceConstants.RV_SMASH_UNEXPECTED_STATE, new Object[][]{new Object[]{"errorCode", 5003}, new Object[]{"reason", "load during load"}});
        } else if (enumC20436b == EnumC20436b.SHOW_IN_PROGRESS) {
            m56544a(IronSourceConstants.RV_SMASH_UNEXPECTED_STATE, new Object[][]{new Object[]{"errorCode", Integer.valueOf((int) IronSourceConstants.errorCode_showInProgress)}, new Object[]{"reason", "load during show"}});
        } else {
            m56547D();
            this.f51858o = new Date().getTime();
            m56545a(1001);
            try {
                if (m56348p()) {
                    this.f52024a.loadRewardedVideoForBidding(this.f52027d, jSONObject, str, this);
                    return;
                }
                m56548C();
                this.f52024a.initAndLoadRewardedVideo(this.f51855l, this.f51856m, this.f52027d, jSONObject, this);
            } catch (Throwable th) {
                C20086i9.m57997d().m58003a(th);
                m56363b("loadVideo exception: " + th.getLocalizedMessage());
                m56544a(IronSourceConstants.TROUBLESHOOTING_RV_SMASH_UNEXPECTED_EXCEPTION, new Object[][]{new Object[]{"errorCode", Integer.valueOf(m56348p() ? IronSourceConstants.errorCode_loadException : IronSourceConstants.errorCode_initFailed)}, new Object[]{"reason", th.getLocalizedMessage()}});
            }
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoLoadSuccess() {
    }
}
