package com.ironsource.mediationsdk;

import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.FrameLayout;
import com.ironsource.C19619b7;
import com.ironsource.C20009gs;
import com.ironsource.C20053hj;
import com.ironsource.C20086i9;
import com.ironsource.C20154ji;
import com.ironsource.C20200kb;
import com.ironsource.C21008ta;
import com.ironsource.C21108v2;
import com.ironsource.InterfaceC20480mo;
import com.ironsource.InterfaceC20792s7;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdData;
import com.ironsource.mediationsdk.bidding.BiddingDataCallback;
import com.ironsource.mediationsdk.config.ConfigFile;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.sdk.BannerSmashListener;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* renamed from: com.ironsource.mediationsdk.x */
/* loaded from: classes6.dex */
public class C20463x extends AbstractC20465y implements BannerSmashListener, C20009gs.InterfaceC20010a, InterfaceC20792s7 {

    /* renamed from: h */
    private C20409k f52001h;

    /* renamed from: i */
    private C20009gs f52002i;

    /* renamed from: j */
    private EnumC20464a f52003j;

    /* renamed from: k */
    private InterfaceC20480mo f52004k;

    /* renamed from: l */
    private IronSourceBannerLayout f52005l;

    /* renamed from: m */
    private String f52006m;

    /* renamed from: n */
    private JSONObject f52007n;

    /* renamed from: o */
    private int f52008o;

    /* renamed from: p */
    private String f52009p;

    /* renamed from: q */
    private C19619b7 f52010q;

    /* renamed from: r */
    private final Object f52011r;

    /* renamed from: s */
    private C21008ta f52012s;

    /* renamed from: t */
    private boolean f52013t;

    /* renamed from: u */
    private boolean f52014u;

    /* renamed from: v */
    private JSONObject f52015v;

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: com.ironsource.mediationsdk.x$a */
    /* loaded from: classes6.dex */
    public enum EnumC20464a {
        NONE,
        INIT_IN_PROGRESS,
        READY_TO_LOAD,
        LOADING,
        LOADED,
        LOAD_FAILED,
        DESTROYED
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C20463x(C20409k c20409k, InterfaceC20480mo interfaceC20480mo, NetworkSettings networkSettings, AbstractAdapter abstractAdapter, int i, String str, JSONObject jSONObject, int i2, String str2, boolean z) {
        super(new C21108v2(networkSettings, networkSettings.getBannerSettings(), IronSource.AD_UNIT.BANNER), abstractAdapter);
        this.f52011r = new Object();
        this.f52003j = EnumC20464a.NONE;
        this.f52001h = c20409k;
        this.f52002i = new C20009gs(c20409k.m56805e());
        this.f52004k = interfaceC20480mo;
        this.f52029f = i;
        this.f52006m = str;
        this.f52008o = i2;
        this.f52009p = str2;
        this.f52007n = jSONObject;
        this.f52013t = z;
        this.f52015v = null;
        if (m56346r()) {
            m56373u();
        }
    }

    /* renamed from: A */
    private void m56389A() {
        IronLog.INTERNAL.verbose();
        m56378a(EnumC20464a.INIT_IN_PROGRESS);
        m56384F();
        try {
            if (this.f52024a != null) {
                if (m56348p()) {
                    this.f52024a.initBannerForBidding(this.f52001h.m56809a(), this.f52001h.m56800j(), this.f52027d, this);
                } else {
                    this.f52024a.initBanners(this.f52001h.m56809a(), this.f52001h.m56800j(), this.f52027d, this);
                }
            }
        } catch (Throwable th) {
            C20086i9.m57997d().m58003a(th);
            IronLog ironLog = IronLog.INTERNAL;
            ironLog.error("Exception while trying to init banner from " + this.f52024a.getProviderName() + ", exception =  " + th.getLocalizedMessage());
            onBannerInitFailed(new IronSourceError(612, th.getLocalizedMessage()));
            m56381a(IronSourceConstants.TROUBLESHOOTING_BN_SMASH_UNEXPECTED_EXCEPTION, new Object[][]{new Object[]{"errorCode", Integer.valueOf((int) IronSourceConstants.errorCode_initFailed)}, new Object[]{"reason", th.getLocalizedMessage()}});
        }
    }

    /* renamed from: B */
    private boolean m56388B() {
        boolean z;
        synchronized (this.f52011r) {
            if (this.f52003j == EnumC20464a.DESTROYED) {
                z = true;
            } else {
                z = false;
            }
        }
        return z;
    }

    /* renamed from: C */
    private boolean m56387C() {
        boolean z;
        synchronized (this.f52011r) {
            if (this.f52003j == EnumC20464a.LOADED) {
                z = true;
            } else {
                z = false;
            }
        }
        return z;
    }

    /* renamed from: F */
    private void m56384F() {
        if (this.f52024a == null) {
            return;
        }
        try {
            String pluginType = ConfigFile.getConfigFile().getPluginType();
            if (!TextUtils.isEmpty(pluginType)) {
                this.f52024a.setPluginData(pluginType);
            }
        } catch (Throwable th) {
            C20086i9.m57997d().m58003a(th);
            IronLog ironLog = IronLog.INTERNAL;
            ironLog.error("Exception while trying to set custom params from " + this.f52024a.getProviderName() + ", exception =  " + th.getLocalizedMessage());
            m56381a(IronSourceConstants.TROUBLESHOOTING_BN_SMASH_UNEXPECTED_EXCEPTION, new Object[][]{new Object[]{"errorCode", Integer.valueOf((int) IronSourceConstants.errorCode_internal)}, new Object[]{"reason", th.getLocalizedMessage()}});
        }
    }

    /* renamed from: b */
    private boolean m56375b(int i) {
        if (i != 3005 && i != 3002 && i != 3012 && i != 3015 && i != 3008 && i != 3305 && i != 3300 && i != 3306 && i != 3307 && i != 3302 && i != 3303 && i != 3304 && i != 3009) {
            return false;
        }
        return true;
    }

    /* renamed from: u */
    private void m56373u() {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose("isBidder = " + m56348p() + ", shouldEarlyInit = " + m56345s());
        this.f52014u = true;
        m56389A();
    }

    /* renamed from: D */
    public void m56386D() {
        this.f52024a.onBannerViewBound(this.f52025b.m54532h().getBannerSettings());
    }

    /* renamed from: E */
    public void m56385E() {
        this.f52024a.onBannerViewWillBind(this.f52025b.m54532h().getBannerSettings());
    }

    @Override // com.ironsource.InterfaceC20792s7
    /* renamed from: a */
    public Map<String, Object> mo55385a(AdData adData) {
        AbstractAdapter abstractAdapter;
        JSONObject m58126a = adData != null ? C20053hj.m58126a(adData.getAdUnitData()) : null;
        if (!m56348p() || (abstractAdapter = this.f52024a) == null) {
            return null;
        }
        return abstractAdapter.getBannerBiddingData(this.f52027d, m58126a);
    }

    @Override // com.ironsource.mediationsdk.AbstractC20465y
    /* renamed from: d */
    public IronSource.AD_UNIT mo56360d() {
        return IronSource.AD_UNIT.BANNER;
    }

    @Override // com.ironsource.mediationsdk.AbstractC20465y
    /* renamed from: k */
    public String mo56353k() {
        return "ProgBannerSmash";
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerSmashListener
    public void onBannerAdClicked() {
        IronLog.INTERNAL.verbose(m56358f());
        m56382a(3008);
        InterfaceC20480mo interfaceC20480mo = this.f52004k;
        if (interfaceC20480mo != null) {
            interfaceC20480mo.mo56252b(this);
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerSmashListener
    public void onBannerAdLeftApplication() {
        IronLog.INTERNAL.verbose(m56358f());
        m56382a(3304);
        InterfaceC20480mo interfaceC20480mo = this.f52004k;
        if (interfaceC20480mo != null) {
            interfaceC20480mo.mo56251c(this);
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerSmashListener
    public void onBannerAdLoadFailed(IronSourceError ironSourceError) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(m56369y() + "error = " + ironSourceError);
        this.f52002i.m58322e();
        if (m56377a(EnumC20464a.LOADING, EnumC20464a.LOAD_FAILED)) {
            m56379a(ironSourceError);
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerSmashListener
    public void onBannerAdLoaded(View view, FrameLayout.LayoutParams layoutParams) {
        int i;
        int i2;
        IronLog.INTERNAL.verbose(m56358f());
        this.f52002i.m58322e();
        if (m56377a(EnumC20464a.LOADING, EnumC20464a.LOADED)) {
            if (this.f52013t) {
                i2 = IronSourceConstants.BN_INSTANCE_RELOAD_SUCCESS;
            } else {
                i2 = 3005;
            }
            m56381a(i2, new Object[][]{new Object[]{"duration", Long.valueOf(C21008ta.m54805a(this.f52012s))}});
            InterfaceC20480mo interfaceC20480mo = this.f52004k;
            if (interfaceC20480mo != null) {
                interfaceC20480mo.mo56253a(this, view, layoutParams);
                return;
            }
            return;
        }
        if (this.f52013t) {
            i = IronSourceConstants.BN_INSTANCE_UNEXPECTED_RELOAD_SUCCESS;
        } else {
            i = IronSourceConstants.BN_INSTANCE_UNEXPECTED_LOAD_SUCCESS;
        }
        m56382a(i);
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerSmashListener
    public void onBannerAdScreenDismissed() {
        IronLog.INTERNAL.verbose(m56358f());
        m56382a(IronSourceConstants.BN_INSTANCE_DISMISS_SCREEN);
        InterfaceC20480mo interfaceC20480mo = this.f52004k;
        if (interfaceC20480mo != null) {
            interfaceC20480mo.mo56249e(this);
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerSmashListener
    public void onBannerAdScreenPresented() {
        IronLog.INTERNAL.verbose(m56358f());
        m56382a(IronSourceConstants.BN_INSTANCE_PRESENT_SCREEN);
        InterfaceC20480mo interfaceC20480mo = this.f52004k;
        if (interfaceC20480mo != null) {
            interfaceC20480mo.mo56250d(this);
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerSmashListener
    public void onBannerAdShown() {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(m56358f());
        if (m56387C()) {
            m56382a(3009);
            InterfaceC20480mo interfaceC20480mo = this.f52004k;
            if (interfaceC20480mo != null) {
                interfaceC20480mo.mo56254a(this);
                return;
            }
            return;
        }
        ironLog.warning("wrong state - mState = " + this.f52003j);
        m56381a(IronSourceConstants.TROUBLESHOOTING_BN_SMASH_UNEXPECTED_STATE, new Object[][]{new Object[]{"errorCode", 1}, new Object[]{"reason", "Wrong State - " + this.f52003j}, new Object[]{IronSourceConstants.EVENTS_EXT1, mo56362c()}});
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerSmashListener
    public void onBannerInitFailed(IronSourceError ironSourceError) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(m56369y() + "error = " + ironSourceError);
        this.f52002i.m58322e();
        if (m56377a(EnumC20464a.INIT_IN_PROGRESS, EnumC20464a.NONE)) {
            InterfaceC20480mo interfaceC20480mo = this.f52004k;
            if (interfaceC20480mo != null) {
                interfaceC20480mo.mo56255a(ironSourceError, this, false);
                return;
            }
            return;
        }
        ironLog.warning("wrong state - mState = " + this.f52003j);
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerSmashListener
    public void onBannerInitSuccess() {
        String str;
        IronLog.INTERNAL.verbose(m56358f());
        if (m56377a(EnumC20464a.INIT_IN_PROGRESS, EnumC20464a.READY_TO_LOAD)) {
            if (this.f52014u) {
                this.f52014u = false;
            } else if (!m56348p()) {
                if (!C20410l.m56779c(this.f52005l)) {
                    if (this.f52005l == null) {
                        str = "banner is null";
                    } else {
                        str = "banner is destroyed";
                    }
                    this.f52004k.mo56255a(new IronSourceError(605, str), this, false);
                    return;
                }
                m56376a((String) null, this.f52015v);
            }
        }
    }

    @Override // com.ironsource.mediationsdk.AbstractC20465y
    /* renamed from: q */
    public void mo56347q() {
        this.f52002i.m58737d();
        super.mo56347q();
    }

    /* renamed from: t */
    public void m56374t() {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(m56358f());
        m56382a(3305);
        m56378a(EnumC20464a.DESTROYED);
        AbstractAdapter abstractAdapter = this.f52024a;
        if (abstractAdapter == null) {
            ironLog.warning("mAdapter == null");
            return;
        }
        try {
            abstractAdapter.destroyBanner(this.f52025b.m54532h().getBannerSettings());
        } catch (Throwable th) {
            C20086i9.m57997d().m58003a(th);
            IronLog ironLog2 = IronLog.INTERNAL;
            ironLog2.error("Exception while trying to destroy banner from " + this.f52024a.getProviderName() + ", exception =  " + th.getLocalizedMessage());
            m56381a(IronSourceConstants.TROUBLESHOOTING_BN_SMASH_UNEXPECTED_EXCEPTION, new Object[][]{new Object[]{"errorCode", Integer.valueOf((int) IronSourceConstants.errorCode_destroy)}, new Object[]{"reason", th.getLocalizedMessage()}});
        }
    }

    /* renamed from: v */
    public String m56372v() {
        if (!TextUtils.isEmpty(this.f52025b.m54532h().getAdSourceNameForEvents())) {
            return this.f52025b.m54532h().getAdSourceNameForEvents();
        }
        return m56355i();
    }

    /* renamed from: w */
    public AbstractAdapter m56371w() {
        return this.f52024a;
    }

    /* renamed from: x */
    public String m56370x() {
        return this.f52006m;
    }

    /* renamed from: y */
    public String m56369y() {
        return String.format("%s - ", m56358f());
    }

    /* renamed from: z */
    public String m56368z() {
        return this.f52025b.m54531i();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C20463x(C20409k c20409k, InterfaceC20480mo interfaceC20480mo, NetworkSettings networkSettings, AbstractAdapter abstractAdapter, int i, boolean z) {
        this(c20409k, interfaceC20480mo, networkSettings, abstractAdapter, i, "", null, 0, "", z);
    }

    @Override // com.ironsource.C20009gs.InterfaceC20010a
    /* renamed from: a */
    public void mo56383a() {
        IronSourceError ironSourceError;
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(m56358f());
        EnumC20464a enumC20464a = EnumC20464a.INIT_IN_PROGRESS;
        EnumC20464a enumC20464a2 = EnumC20464a.LOAD_FAILED;
        if (m56377a(enumC20464a, enumC20464a2)) {
            ironLog.verbose("init timed out");
            ironSourceError = new IronSourceError(607, "Timed out");
        } else if (!m56377a(EnumC20464a.LOADING, enumC20464a2)) {
            ironLog.error("unexpected state - " + this.f52003j);
            return;
        } else {
            ironLog.verbose("load timed out");
            ironSourceError = new IronSourceError(608, "Timed out");
        }
        m56379a(ironSourceError);
    }

    /* renamed from: a */
    public void m56382a(int i) {
        m56381a(i, (Object[][]) null);
    }

    /* renamed from: a */
    public void m56381a(int i, Object[][] objArr) {
        Map<String, Object> m56351m = m56351m();
        if (m56388B()) {
            m56351m.put("reason", "banner is destroyed");
        } else {
            IronSourceBannerLayout ironSourceBannerLayout = this.f52005l;
            if (ironSourceBannerLayout != null) {
                C20410l.m56784a(m56351m, ironSourceBannerLayout.getSize());
            }
        }
        if (!TextUtils.isEmpty(this.f52006m)) {
            m56351m.put("auctionId", this.f52006m);
        }
        JSONObject jSONObject = this.f52007n;
        if (jSONObject != null && jSONObject.length() > 0) {
            m56351m.put("genericParams", this.f52007n);
        }
        C19619b7 c19619b7 = this.f52010q;
        if (c19619b7 != null) {
            m56351m.put("placement", c19619b7.getPlacementName());
        }
        if (m56375b(i)) {
            C20154ji.m57833i().m57260a(m56351m, this.f52008o, this.f52009p);
        }
        m56351m.put("sessionDepth", Integer.valueOf(this.f52029f));
        if (objArr != null) {
            try {
                for (Object[] objArr2 : objArr) {
                    m56351m.put(objArr2[0].toString(), objArr2[1]);
                }
            } catch (Exception e) {
                C20086i9.m57997d().m58003a(e);
                IronLog.INTERNAL.error(mo56362c() + " smash: BN sendMediationEvent " + Log.getStackTraceString(e));
            }
        }
        C20154ji.m57833i().mo57283a(new C20200kb(i, new JSONObject(m56351m)));
    }

    /* renamed from: a */
    public void m56380a(IronSourceBannerLayout ironSourceBannerLayout, C19619b7 c19619b7, String str, JSONObject jSONObject) {
        InterfaceC20480mo interfaceC20480mo;
        IronSourceError ironSourceError;
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(m56358f());
        this.f52010q = c19619b7;
        this.f52015v = jSONObject;
        if (!C20410l.m56779c(ironSourceBannerLayout)) {
            String str2 = ironSourceBannerLayout == null ? "banner is null" : "banner is destroyed";
            ironLog.verbose(str2);
            interfaceC20480mo = this.f52004k;
            ironSourceError = new IronSourceError(610, str2);
        } else if (this.f52024a != null) {
            this.f52005l = ironSourceBannerLayout;
            this.f52002i.m58323a((C20009gs.InterfaceC20010a) this);
            try {
                if (m56348p()) {
                    m56376a(str, this.f52015v);
                } else {
                    m56389A();
                }
                return;
            } catch (Throwable th) {
                C20086i9.m57997d().m58003a(th);
                IronLog ironLog2 = IronLog.INTERNAL;
                ironLog2.error("exception = " + th.getLocalizedMessage());
                onBannerAdLoadFailed(new IronSourceError(605, th.getLocalizedMessage()));
                return;
            }
        } else {
            ironLog.verbose("mAdapter is null");
            interfaceC20480mo = this.f52004k;
            ironSourceError = new IronSourceError(611, "mAdapter is null");
        }
        interfaceC20480mo.mo56255a(ironSourceError, this, false);
    }

    @Override // com.ironsource.InterfaceC20792s7
    /* renamed from: a */
    public void mo55384a(AdData adData, @NotNull BiddingDataCallback biddingDataCallback) {
        m56382a(IronSourceConstants.BN_INSTANCE_COLLECT_TOKEN);
        try {
            this.f52024a.collectBannerBiddingData(this.f52027d, adData != null ? C20053hj.m58126a(adData.getAdUnitData()) : null, biddingDataCallback);
        } catch (Throwable th) {
            C20086i9.m57997d().m58003a(th);
            IronLog ironLog = IronLog.INTERNAL;
            ironLog.error("Exception while trying to collectBannerBiddingData from " + this.f52024a.getProviderName() + ", exception =  " + th.getLocalizedMessage());
        }
    }

    /* renamed from: a */
    private void m56379a(IronSourceError ironSourceError) {
        boolean z = ironSourceError.getErrorCode() == 606;
        boolean z2 = this.f52013t;
        if (z) {
            m56381a(z2 ? IronSourceConstants.BN_INSTANCE_RELOAD_NO_FILL : 3306, new Object[][]{new Object[]{"duration", Long.valueOf(C21008ta.m54805a(this.f52012s))}});
        } else {
            m56381a(z2 ? IronSourceConstants.BN_INSTANCE_RELOAD_ERROR : 3300, new Object[][]{new Object[]{"errorCode", Integer.valueOf(ironSourceError.getErrorCode())}, new Object[]{"reason", ironSourceError.getErrorMessage()}, new Object[]{"duration", Long.valueOf(C21008ta.m54805a(this.f52012s))}});
        }
        InterfaceC20480mo interfaceC20480mo = this.f52004k;
        if (interfaceC20480mo != null) {
            interfaceC20480mo.mo56255a(ironSourceError, this, z);
        }
    }

    /* renamed from: a */
    private void m56378a(EnumC20464a enumC20464a) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(m56369y() + "state = " + enumC20464a.name());
        synchronized (this.f52011r) {
            this.f52003j = enumC20464a;
        }
    }

    /* renamed from: a */
    private void m56376a(String str, JSONObject jSONObject) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(m56358f());
        if (!m56377a(EnumC20464a.READY_TO_LOAD, EnumC20464a.LOADING)) {
            ironLog.error("wrong state - state = " + this.f52003j);
            return;
        }
        this.f52012s = new C21008ta();
        m56382a(this.f52013t ? IronSourceConstants.BN_INSTANCE_RELOAD : 3002);
        if (this.f52024a != null) {
            try {
                if (m56348p()) {
                    this.f52024a.loadBannerForBidding(this.f52027d, this.f52015v, str, this.f52005l, this);
                } else {
                    this.f52024a.loadBanner(this.f52027d, this.f52015v, this.f52005l, this);
                }
            } catch (Throwable th) {
                C20086i9.m57997d().m58003a(th);
                IronLog ironLog2 = IronLog.INTERNAL;
                ironLog2.error("Exception while trying to load banner from " + this.f52024a.getProviderName() + ", exception =  " + th.getLocalizedMessage());
                onBannerAdLoadFailed(new IronSourceError(605, th.getLocalizedMessage()));
                m56381a(IronSourceConstants.TROUBLESHOOTING_BN_SMASH_UNEXPECTED_EXCEPTION, new Object[][]{new Object[]{"errorCode", Integer.valueOf((int) IronSourceConstants.errorCode_loadException)}, new Object[]{"reason", th.getLocalizedMessage()}});
            }
        }
    }

    /* renamed from: a */
    private boolean m56377a(EnumC20464a enumC20464a, EnumC20464a enumC20464a2) {
        boolean z;
        synchronized (this.f52011r) {
            if (this.f52003j == enumC20464a) {
                IronLog ironLog = IronLog.INTERNAL;
                ironLog.verbose(m56369y() + "set state from '" + this.f52003j + "' to '" + enumC20464a2 + "'");
                this.f52003j = enumC20464a2;
                z = true;
            } else {
                z = false;
            }
        }
        return z;
    }
}
