package com.mbridge.msdk.newreward.p477a;

import android.os.HandlerThread;
import android.text.TextUtils;
import com.iab.omid.library.mmadbridge.adsession.AdEvents;
import com.iab.omid.library.mmadbridge.adsession.AdSession;
import com.iab.omid.library.mmadbridge.adsession.media.MediaEvents;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.CommonConst;
import com.mbridge.msdk.newout.RewardVideoListener;
import com.mbridge.msdk.newreward.function.p485c.p486a.MBridgeCampaign;
import com.mbridge.msdk.newreward.function.p492e.CampaignModel;
import com.mbridge.msdk.newreward.function.p492e.MetricsModel;
import com.mbridge.msdk.newreward.function.p492e.MoreOfferCampaignModel;
import com.mbridge.msdk.newreward.function.p492e.ResourceModel;
import com.mbridge.msdk.newreward.function.p492e.SettingModel;
import com.mbridge.msdk.newreward.function.p494g.IOCBean;
import com.mbridge.msdk.newreward.function.p495h.MBridgeCommonUtils;
import com.mbridge.msdk.out.MBridgeIds;
import com.mbridge.msdk.videocommon.p538d.RewardSetting;
import java.io.File;
import org.json.JSONArray;

/* renamed from: com.mbridge.msdk.newreward.a.e */
/* loaded from: classes6.dex */
public final class AdapterModel {

    /* renamed from: A */
    private String f58140A;

    /* renamed from: B */
    private String f58141B;

    /* renamed from: D */
    private int f58143D;

    /* renamed from: E */
    private long f58144E;

    /* renamed from: O */
    private MBridgeIds f58154O;

    /* renamed from: P */
    private DevExtraData f58155P;

    /* renamed from: Q */
    private IOCBean f58156Q;

    /* renamed from: Z */
    private AdSession f58165Z;

    /* renamed from: a */
    public Adapter f58166a;

    /* renamed from: aa */
    private AdEvents f58167aa;

    /* renamed from: ab */
    private MediaEvents f58168ab;

    /* renamed from: ac */
    private boolean f58169ac;

    /* renamed from: af */
    private HandlerThread f58172af;

    /* renamed from: ag */
    private RewardVideoListener f58173ag;

    /* renamed from: b */
    int f58174b;

    /* renamed from: c */
    private String f58175c;

    /* renamed from: d */
    private CampaignEx f58176d;

    /* renamed from: e */
    private boolean f58177e;

    /* renamed from: f */
    private int f58178f;

    /* renamed from: g */
    private int f58179g;

    /* renamed from: h */
    private int f58180h;

    /* renamed from: i */
    private int f58181i;

    /* renamed from: m */
    private boolean f58185m;

    /* renamed from: n */
    private boolean f58186n;

    /* renamed from: p */
    private long f58188p;

    /* renamed from: q */
    private long f58189q;

    /* renamed from: u */
    private String f58193u;

    /* renamed from: v */
    private boolean f58194v;

    /* renamed from: x */
    private String f58196x;

    /* renamed from: y */
    private String f58197y;

    /* renamed from: z */
    private int f58198z;

    /* renamed from: j */
    private int f58182j = CommonConst.f56437F;

    /* renamed from: k */
    private int f58183k = 2;

    /* renamed from: l */
    private int f58184l = 60000;

    /* renamed from: o */
    private boolean f58187o = false;

    /* renamed from: r */
    private boolean f58190r = false;

    /* renamed from: s */
    private int f58191s = 0;

    /* renamed from: t */
    private int f58192t = 0;

    /* renamed from: w */
    private boolean f58195w = false;

    /* renamed from: C */
    private String f58142C = "";

    /* renamed from: F */
    private boolean f58145F = false;

    /* renamed from: G */
    private boolean f58146G = false;

    /* renamed from: H */
    private boolean f58147H = false;

    /* renamed from: I */
    private CampaignModel f58148I = new CampaignModel();

    /* renamed from: J */
    private ResourceModel f58149J = new ResourceModel();

    /* renamed from: K */
    private SettingModel f58150K = new SettingModel();

    /* renamed from: L */
    private MetricsModel f58151L = new MetricsModel();

    /* renamed from: M */
    private MoreOfferCampaignModel f58152M = new MoreOfferCampaignModel();

    /* renamed from: N */
    private int f58153N = 25000;

    /* renamed from: R */
    private boolean f58157R = false;

    /* renamed from: S */
    private boolean f58158S = false;

    /* renamed from: T */
    private boolean f58159T = false;

    /* renamed from: U */
    private boolean f58160U = false;

    /* renamed from: V */
    private boolean f58161V = false;

    /* renamed from: W */
    private boolean f58162W = false;

    /* renamed from: X */
    private boolean f58163X = false;

    /* renamed from: Y */
    private boolean f58164Y = false;

    /* renamed from: ad */
    private int f58170ad = 0;

    /* renamed from: ae */
    private JSONArray f58171ae = new JSONArray();

    public AdapterModel(boolean z, int i, String str, String str2, boolean z2) {
        this.f58177e = z;
        this.f58198z = i;
        this.f58196x = str;
        this.f58197y = str2;
        this.f58186n = z2;
    }

    /* renamed from: A */
    public final int m50818A() {
        return this.f58174b;
    }

    /* renamed from: B */
    public final String m50817B() {
        return this.f58140A;
    }

    /* renamed from: C */
    public final String m50816C() {
        return this.f58141B;
    }

    /* renamed from: D */
    public final CampaignModel m50815D() {
        return this.f58148I;
    }

    /* renamed from: E */
    public final MoreOfferCampaignModel m50814E() {
        return this.f58152M;
    }

    /* renamed from: F */
    public final ResourceModel m50813F() {
        return this.f58149J;
    }

    /* renamed from: G */
    public final String m50812G() {
        return this.f58175c;
    }

    /* renamed from: H */
    public final String m50811H() {
        return this.f58197y;
    }

    /* renamed from: I */
    public final boolean m50810I() {
        return this.f58177e;
    }

    /* renamed from: J */
    public final String m50809J() {
        return this.f58196x;
    }

    /* renamed from: K */
    public final RewardVideoListener m50808K() {
        return this.f58173ag;
    }

    /* renamed from: L */
    public final int m50807L() {
        return this.f58179g;
    }

    /* renamed from: M */
    public final int m50806M() {
        if (this.f58177e) {
            return 2;
        }
        return 3;
    }

    /* renamed from: N */
    public final int m50805N() {
        return this.f58178f;
    }

    /* renamed from: O */
    public final int m50804O() {
        return this.f58183k;
    }

    /* renamed from: P */
    public final int m50803P() {
        int i = this.f58153N;
        if (i <= 0) {
            return 25000;
        }
        return i;
    }

    /* renamed from: Q */
    public final int m50802Q() {
        return this.f58184l;
    }

    /* renamed from: R */
    public final boolean m50801R() {
        return this.f58186n;
    }

    /* renamed from: S */
    public final MBridgeIds m50800S() {
        return this.f58154O;
    }

    /* renamed from: T */
    public final long m50799T() {
        long m48350f;
        CampaignModel campaignModel = this.f58148I;
        if (campaignModel != null && campaignModel.m50341b() != null && this.f58148I.m50341b().m50563p() > 0) {
            return this.f58148I.m50341b().m50563p();
        }
        long currentTimeMillis = System.currentTimeMillis();
        RewardSetting m50313a = this.f58150K.m50313a();
        if (m50313a == null) {
            m48350f = 3600000;
        } else {
            m48350f = m50313a.m48350f();
        }
        return m48350f + currentTimeMillis;
    }

    /* renamed from: U */
    public final CampaignEx m50798U() {
        return this.f58176d;
    }

    /* renamed from: V */
    public final String m50797V() {
        CampaignEx campaignEx = this.f58176d;
        if (campaignEx == null) {
            return "";
        }
        return campaignEx.getRequestIdNotice();
    }

    /* renamed from: W */
    public final DevExtraData m50796W() {
        return this.f58155P;
    }

    /* renamed from: X */
    public final boolean m50795X() {
        return this.f58157R;
    }

    /* renamed from: Y */
    public final boolean m50794Y() {
        return this.f58158S;
    }

    /* renamed from: Z */
    public final boolean m50793Z() {
        return this.f58160U;
    }

    /* renamed from: a */
    public final HandlerThread m50792a() {
        return this.f58172af;
    }

    /* renamed from: aa */
    public final boolean m50775aa() {
        return this.f58161V;
    }

    /* renamed from: ab */
    public final boolean m50774ab() {
        return this.f58162W;
    }

    /* renamed from: ac */
    public final boolean m50773ac() {
        return this.f58163X;
    }

    /* renamed from: ad */
    public final AdSession m50772ad() {
        return this.f58165Z;
    }

    /* renamed from: ae */
    public final AdEvents m50771ae() {
        return this.f58167aa;
    }

    /* renamed from: af */
    public final MediaEvents m50770af() {
        return this.f58168ab;
    }

    /* renamed from: ag */
    public final boolean m50769ag() {
        return this.f58164Y;
    }

    /* renamed from: ah */
    public final boolean m50768ah() {
        return this.f58159T;
    }

    /* renamed from: ai */
    public final String m50767ai() {
        CampaignEx campaignEx = this.f58176d;
        if (campaignEx == null || campaignEx.getRewardTemplateMode() == null) {
            return "904";
        }
        String m52523e = this.f58176d.getRewardTemplateMode().m52523e();
        if (TextUtils.isEmpty(m52523e)) {
            return "904";
        }
        if (this.f58176d.getAdSpaceT() == 2) {
            return "HALF_TEMPLATE";
        }
        boolean m50255b = MBridgeCommonUtils.m50255b(m52523e);
        String valueOf = String.valueOf(this.f58176d.getRewardTemplateMode().m52522f());
        if (!m50255b && this.f58169ac) {
            return "WEB_TEMPLATE";
        }
        return valueOf;
    }

    /* renamed from: aj */
    public final String m50766aj() {
        boolean z;
        CampaignEx campaignEx = this.f58176d;
        if (campaignEx == null) {
            return "404";
        }
        boolean m50255b = MBridgeCommonUtils.m50255b(campaignEx.getendcard_url());
        if (!this.f58176d.isMraid() && m50255b) {
            z = false;
        } else {
            z = true;
        }
        long ecTemplateId = this.f58176d.getEcTemplateId();
        if (ecTemplateId == 0) {
            ecTemplateId = 404;
        }
        if (z && this.f58169ac) {
            return "WEB_EC";
        }
        return String.valueOf(ecTemplateId);
    }

    /* renamed from: ak */
    public final boolean m50765ak() {
        CampaignEx campaignEx = this.f58176d;
        if (campaignEx == null || campaignEx.getPlayable_ads_without_video() != 2) {
            return false;
        }
        return true;
    }

    /* renamed from: al */
    public final String m50764al() {
        boolean z;
        CampaignEx campaignEx = this.f58176d;
        if (campaignEx == null) {
            return "ONLY_PLAYABLE";
        }
        boolean z2 = true;
        if (campaignEx.getPlayable_ads_without_video() == 2) {
            z = true;
        } else {
            z = false;
        }
        if (this.f58176d.getAdSpaceT() != 2) {
            z2 = false;
        }
        if (z && z2) {
            return "HALF_END_CARD";
        }
        if (this.f58169ac) {
            return "ONLY_PLAYABLE";
        }
        return "404";
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0063  */
    /* renamed from: am */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int m50763am() {
        /*
            r5 = this;
            r0 = 0
            com.mbridge.msdk.newreward.function.e.a r1 = r5.f58148I     // Catch: java.lang.Exception -> L51
            if (r1 == 0) goto L34
            java.util.List r1 = r1.m50347a()     // Catch: java.lang.Exception -> L51
            if (r1 == 0) goto L34
            com.mbridge.msdk.newreward.function.e.a r1 = r5.f58148I     // Catch: java.lang.Exception -> L51
            java.util.List r1 = r1.m50347a()     // Catch: java.lang.Exception -> L51
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Exception -> L51
            if (r1 != 0) goto L34
            com.mbridge.msdk.newreward.function.e.a r1 = r5.f58148I     // Catch: java.lang.Exception -> L51
            java.util.List r1 = r1.m50347a()     // Catch: java.lang.Exception -> L51
            java.lang.Object r1 = r1.get(r0)     // Catch: java.lang.Exception -> L51
            com.mbridge.msdk.foundation.entity.CampaignEx r1 = (com.mbridge.msdk.foundation.entity.CampaignEx) r1     // Catch: java.lang.Exception -> L51
            if (r1 == 0) goto L34
            com.mbridge.msdk.foundation.entity.CampaignEx$c r2 = r1.getRewardTemplateMode()     // Catch: java.lang.Exception -> L51
            if (r2 == 0) goto L34
            com.mbridge.msdk.foundation.entity.CampaignEx$c r1 = r1.getRewardTemplateMode()     // Catch: java.lang.Exception -> L51
            int r1 = r1.m52527b()     // Catch: java.lang.Exception -> L51
            goto L35
        L34:
            r1 = r0
        L35:
            if (r1 != 0) goto L5b
            com.mbridge.msdk.newreward.function.e.f r2 = r5.f58150K     // Catch: java.lang.Exception -> L4c
            if (r2 == 0) goto L5b
            com.mbridge.msdk.videocommon.d.c r2 = r2.m50306b()     // Catch: java.lang.Exception -> L4c
            if (r2 == 0) goto L5b
            com.mbridge.msdk.newreward.function.e.f r2 = r5.f58150K     // Catch: java.lang.Exception -> L4c
            com.mbridge.msdk.videocommon.d.c r2 = r2.m50306b()     // Catch: java.lang.Exception -> L4c
            int r1 = r2.m48302c()     // Catch: java.lang.Exception -> L4c
            goto L5b
        L4c:
            r2 = move-exception
            r4 = r2
            r2 = r1
            r1 = r4
            goto L53
        L51:
            r1 = move-exception
            r2 = r0
        L53:
            boolean r3 = com.mbridge.msdk.MBridgeConstans.DEBUG
            if (r3 == 0) goto L5a
            r1.printStackTrace()
        L5a:
            r1 = r2
        L5b:
            r2 = 1
            if (r1 == r2) goto L63
            r2 = 2
            if (r1 == r2) goto L64
            r0 = -1
            goto L64
        L63:
            r0 = r2
        L64:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.newreward.p477a.AdapterModel.m50763am():int");
    }

    /* renamed from: b */
    public final String m50762b() {
        JSONArray jSONArray = this.f58171ae;
        return jSONArray == null ? "" : jSONArray.toString();
    }

    /* renamed from: c */
    public final IOCBean m50757c() {
        return this.f58156Q;
    }

    /* renamed from: d */
    public final boolean m50752d() {
        return this.f58147H;
    }

    /* renamed from: e */
    public final boolean m50748e() {
        return this.f58146G;
    }

    /* renamed from: f */
    public final boolean m50744f() {
        return this.f58145F;
    }

    /* renamed from: g */
    public final long m50740g() {
        return this.f58144E;
    }

    /* renamed from: h */
    public final int m50736h() {
        return this.f58198z;
    }

    /* renamed from: i */
    public final String m50734i() {
        return this.f58142C;
    }

    /* renamed from: j */
    public final boolean m50732j() {
        return this.f58194v;
    }

    /* renamed from: k */
    public final String m50730k() {
        return this.f58193u;
    }

    /* renamed from: l */
    public final void m50728l() {
        this.f58191s++;
    }

    /* renamed from: m */
    public final void m50726m() {
        this.f58192t++;
    }

    /* renamed from: n */
    public final boolean m50724n() {
        return this.f58190r;
    }

    /* renamed from: o */
    public final long m50722o() {
        return this.f58189q;
    }

    /* renamed from: p */
    public final long m50720p() {
        return this.f58188p;
    }

    /* renamed from: q */
    public final boolean m50718q() {
        return this.f58187o;
    }

    /* renamed from: r */
    public final boolean m50716r() {
        return this.f58185m;
    }

    /* renamed from: s */
    public final boolean m50715s() {
        return this.f58195w;
    }

    /* renamed from: t */
    public final int m50714t() {
        return this.f58179g;
    }

    /* renamed from: u */
    public final int m50713u() {
        return this.f58180h;
    }

    /* renamed from: v */
    public final int m50712v() {
        return this.f58181i;
    }

    /* renamed from: w */
    public final int m50711w() {
        return this.f58182j;
    }

    /* renamed from: x */
    public final SettingModel m50710x() {
        return this.f58150K;
    }

    /* renamed from: y */
    public final int m50709y() {
        return this.f58143D;
    }

    /* renamed from: z */
    public final MetricsModel m50708z() {
        return this.f58151L;
    }

    /* renamed from: a */
    public final void m50788a(HandlerThread handlerThread) {
        this.f58172af = handlerThread;
    }

    /* renamed from: c */
    public final void m50753c(boolean z) {
        this.f58145F = z;
    }

    /* renamed from: d */
    public final void m50749d(boolean z) {
        this.f58194v = z;
    }

    /* renamed from: e */
    public final void m50745e(boolean z) {
        this.f58190r = z;
    }

    /* renamed from: f */
    public final void m50741f(boolean z) {
        this.f58187o = z;
    }

    /* renamed from: g */
    public final void m50737g(boolean z) {
        this.f58185m = z;
    }

    /* renamed from: h */
    public final void m50735h(boolean z) {
        this.f58195w = z;
    }

    /* renamed from: i */
    public final void m50733i(boolean z) {
        this.f58157R = z;
    }

    /* renamed from: j */
    public final void m50731j(boolean z) {
        this.f58158S = z;
    }

    /* renamed from: k */
    public final void m50729k(boolean z) {
        this.f58160U = z;
    }

    /* renamed from: l */
    public final void m50727l(boolean z) {
        this.f58161V = z;
    }

    /* renamed from: m */
    public final void m50725m(boolean z) {
        this.f58162W = z;
    }

    /* renamed from: n */
    public final void m50723n(boolean z) {
        this.f58163X = z;
    }

    /* renamed from: o */
    public final void m50721o(boolean z) {
        this.f58164Y = z;
    }

    /* renamed from: p */
    public final void m50719p(boolean z) {
        this.f58169ac = z;
    }

    /* renamed from: q */
    public final void m50717q(boolean z) {
        this.f58159T = z;
    }

    /* renamed from: a */
    public final void m50777a(String str) {
        if (this.f58171ae == null) {
            this.f58171ae = new JSONArray();
        }
        this.f58171ae.put(str);
    }

    /* renamed from: b */
    public final void m50758b(boolean z) {
        this.f58146G = z;
    }

    /* renamed from: c */
    public final void m50754c(String str) {
        this.f58193u = str;
    }

    /* renamed from: d */
    public final void m50751d(int i) {
        this.f58174b = i;
    }

    /* renamed from: e */
    public final void m50746e(String str) {
        this.f58141B = str;
    }

    /* renamed from: f */
    public final void m50742f(String str) {
        this.f58175c = str;
    }

    /* renamed from: g */
    public final void m50739g(int i) {
        this.f58184l = i;
    }

    /* renamed from: b */
    public final void m50759b(String str) {
        this.f58142C = str;
    }

    /* renamed from: c */
    public final void m50755c(long j) {
        this.f58188p = j;
    }

    /* renamed from: d */
    public final void m50750d(String str) {
        this.f58140A = str;
    }

    /* renamed from: e */
    public final void m50747e(int i) {
        this.f58183k = i;
    }

    /* renamed from: f */
    public final void m50743f(int i) {
        this.f58153N = i;
    }

    /* renamed from: g */
    public final File m50738g(String str) {
        for (MBridgeCampaign mBridgeCampaign : this.f58148I.m50341b().m50558u()) {
            if (mBridgeCampaign.m50626g().equals(str)) {
                return mBridgeCampaign.m50629d().m50502g();
            }
        }
        return null;
    }

    /* renamed from: b */
    public final void m50760b(long j) {
        this.f58189q = j;
    }

    /* renamed from: c */
    public final void m50756c(int i) {
        this.f58143D = i;
    }

    /* renamed from: a */
    public final void m50779a(IOCBean iOCBean) {
        this.f58156Q = iOCBean;
    }

    /* renamed from: b */
    public final void m50761b(int i) {
        this.f58182j = i;
    }

    /* renamed from: a */
    public final void m50776a(boolean z) {
        this.f58147H = z;
    }

    /* renamed from: a */
    public final void m50789a(long j) {
        this.f58144E = j;
    }

    /* renamed from: a */
    public final void m50791a(int i) {
        this.f58178f = i;
    }

    /* renamed from: a */
    public final void m50780a(SettingModel settingModel) {
        this.f58150K = settingModel;
    }

    /* renamed from: a */
    public final void m50781a(CampaignModel campaignModel) {
        this.f58148I = campaignModel;
    }

    /* renamed from: a */
    public final void m50783a(RewardVideoListener rewardVideoListener) {
        this.f58173ag = rewardVideoListener;
    }

    /* renamed from: a */
    public final void m50778a(MBridgeIds mBridgeIds) {
        this.f58154O = mBridgeIds;
    }

    /* renamed from: a */
    public final void m50782a(DevExtraData devExtraData) {
        this.f58155P = devExtraData;
    }

    /* renamed from: a */
    public final void m50784a(CampaignEx campaignEx) {
        this.f58176d = campaignEx;
    }

    /* renamed from: a */
    public final void m50786a(AdSession adSession) {
        this.f58165Z = adSession;
    }

    /* renamed from: a */
    public final void m50787a(AdEvents adEvents) {
        this.f58167aa = adEvents;
    }

    /* renamed from: a */
    public final void m50785a(MediaEvents mediaEvents) {
        this.f58168ab = mediaEvents;
    }

    /* renamed from: a */
    public final void m50790a(int i, int i2, int i3) {
        this.f58179g = i;
        this.f58180h = i2;
        this.f58181i = i3;
    }
}
