package com.mbridge.msdk.newreward.function.p485c.p487b;

import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import com.amazon.aps.shared.metrics.model.ApsMetricsDataMap;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.controller.MBSDKContext;
import com.mbridge.msdk.foundation.entity.BaseCampaignUnit;
import com.mbridge.msdk.foundation.entity.CampaignUnit;
import com.mbridge.msdk.foundation.same.CommonConst;
import com.mbridge.msdk.foundation.tools.SameLogTool;
import com.mbridge.msdk.newreward.function.common.MBridgeGlobalCommon;
import com.mbridge.msdk.newreward.function.common.VolleyErrorUtils;
import com.mbridge.msdk.newreward.function.p485c.p486a.MBridgeCampaigns;
import com.mbridge.msdk.newreward.p477a.p480c.MBridgeTimer;
import com.mbridge.msdk.tracker.network.AbstractC22898ad;
import com.mbridge.msdk.tracker.network.AbstractC22930u;
import com.mbridge.msdk.tracker.network.C22905e;
import com.mbridge.msdk.tracker.network.C22913r;
import com.mbridge.msdk.tracker.network.C22915t;
import com.mbridge.msdk.tracker.network.C22937w;
import com.mbridge.msdk.tracker.network.InterfaceC22941z;
import com.mbridge.msdk.tracker.network.ResponseError;
import com.mbridge.msdk.tracker.network.UnKnownError;
import com.mbridge.msdk.tracker.network.toolbox.C22921f;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: BaseCampaignRequest.java */
/* renamed from: com.mbridge.msdk.newreward.function.c.b.a */
/* loaded from: classes6.dex */
public class C22346a extends AbstractC22930u<JSONObject> implements C22937w.InterfaceC22938a {

    /* renamed from: a */
    protected MBridgeCampaigns f58299a;

    /* renamed from: b */
    protected Context f58300b;

    /* renamed from: c */
    protected int f58301c;

    /* renamed from: d */
    protected String f58302d;

    /* renamed from: e */
    protected String f58303e;

    /* renamed from: f */
    protected String f58304f;

    /* renamed from: g */
    private Map<String, String> f58305g;

    /* renamed from: h */
    private CampaignRequestListener f58306h;

    /* renamed from: i */
    private InterfaceC22941z f58307i;

    /* renamed from: j */
    private long f58308j;

    /* renamed from: k */
    private long f58309k;

    /* renamed from: l */
    private String f58310l;

    /* renamed from: m */
    private String f58311m;

    /* renamed from: n */
    private String f58312n;

    /* renamed from: o */
    private String f58313o;

    /* renamed from: p */
    private Map<String, String> f58314p;

    /* renamed from: q */
    private long f58315q;

    /* compiled from: BaseCampaignRequest.java */
    /* renamed from: com.mbridge.msdk.newreward.function.c.b.a$a */
    /* loaded from: classes6.dex */
    private static final class C22347a implements MBridgeTimer.InterfaceC22333a {

        /* renamed from: a */
        private final C22346a f58316a;

        /* renamed from: b */
        private final MBridgeCampaigns f58317b;

        public C22347a(C22346a c22346a, MBridgeCampaigns mBridgeCampaigns) {
            this.f58316a = c22346a;
            this.f58317b = mBridgeCampaigns;
        }

        @Override // com.mbridge.msdk.newreward.p477a.p480c.MBridgeTimer.InterfaceC22333a
        /* renamed from: a */
        public final void mo50400a(String str, long j) {
            SameLogTool.m51827a("BaseCampaignRequest", "onTimeout taskID = " + str + ", timeout = " + j);
            C22346a.m50552a(this.f58316a, this.f58317b, j);
        }
    }

    public C22346a(int i, String str, String str2, String str3, long j, String str4, String str5) {
        super(0, str4, 0, str5);
        this.f58300b = MBSDKContext.m52746m().m52792c();
        this.f58301c = i;
        this.f58302d = str;
        this.f58303e = str2;
        this.f58304f = str3;
        this.f58310l = UUID.randomUUID().toString();
        this.f58308j = SystemClock.elapsedRealtime();
        this.f58313o = str4;
        this.f58299a = new MBridgeCampaigns(this.f58301c, this.f58302d, this.f58303e, this.f58304f);
        m49420a((C22937w.InterfaceC22938a) this);
        m49409d(true);
        m49411c(true);
        this.f58315q = j <= 0 ? 30000L : j;
        MBridgeTimer.m50850a().m50848a(this.f58310l, this.f58315q, new C22347a(this, this.f58299a));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.mbridge.msdk.tracker.network.AbstractC22930u
    /* renamed from: a */
    public final /* synthetic */ void mo49320a(JSONObject jSONObject) {
        CampaignRequestListener campaignRequestListener;
        JSONObject jSONObject2 = jSONObject;
        if (MBridgeConstans.DEBUG) {
            SameLogTool.m51827a("BaseCampaignRequest", "deliverResponse: " + jSONObject2);
        }
        MBridgeTimer.m50850a().m50849a(this.f58310l);
        int optInt = jSONObject2.optInt("status");
        if (optInt == 1) {
            JSONObject optJSONObject = jSONObject2.optJSONObject("data");
            if (optJSONObject != null) {
                CampaignUnit parseCampaignUnit = BaseCampaignUnit.parseCampaignUnit(optJSONObject, this.f58311m);
                this.f58299a.m50603a(optJSONObject);
                this.f58299a.m50581f(optJSONObject.optString(ApsMetricsDataMap.APSMETRICS_FIELD_CUSTOM));
                this.f58299a.m50584e(optJSONObject.optString("b"));
                this.f58299a.m50588d(optJSONObject.optString("a"));
                this.f58299a.m50590d(optJSONObject.optInt("template"));
                this.f58299a.m50606a(System.currentTimeMillis());
                this.f58299a.m50592c(this.f58311m);
                this.f58299a.m50578g(optJSONObject.optString(CommonConst.f56451T));
                this.f58299a.m50594c(1);
                this.f58299a.m50586e(0);
                this.f58299a.m50605a(parseCampaignUnit.getRequestId());
                this.f58299a.m50608a(parseCampaignUnit.getEcppv());
                this.f58299a.m50572i(this.f58313o);
                this.f58299a.m50607a(parseCampaignUnit.getSecondRequestIndex());
                this.f58299a.m50600b(parseCampaignUnit.getSecondShowIndex());
                MBridgeGlobalCommon.handlerCampaigns(this.f58312n, this.f58299a, parseCampaignUnit.getAds(), new ArrayList());
                MBridgeCampaigns mBridgeCampaigns = this.f58299a;
                if (mBridgeCampaigns != null && (campaignRequestListener = this.f58306h) != null) {
                    try {
                        campaignRequestListener.mo50533a(mBridgeCampaigns, this);
                    } catch (Exception e) {
                        if (MBridgeConstans.DEBUG) {
                            SameLogTool.m51823b("BaseCampaignRequest", "handlerOnSuccessEvent Exception: ", e);
                        }
                    }
                }
            } else {
                m50551a(this, this.f58299a, new CampaignRequestError(7, "data is null"));
            }
        } else {
            CampaignRequestError campaignRequestError = new CampaignRequestError(9);
            campaignRequestError.m50541a(jSONObject2.optString("msg", ""));
            campaignRequestError.m50543a(optInt);
            campaignRequestError.m50537c(jSONObject2.toString());
            m50551a(this, this.f58299a, campaignRequestError);
        }
        this.f58309k = SystemClock.elapsedRealtime();
    }

    /* renamed from: b */
    public final void m50546b(String str) {
        m49412c("local_id", str);
        m49412c("ad_type", String.valueOf(this.f58301c));
        this.f58312n = str;
    }

    @Override // com.mbridge.msdk.tracker.network.AbstractC22930u
    /* renamed from: c */
    public final Map<String, String> mo49317c() {
        if (this.f58314p == null) {
            this.f58314p = new HashMap();
        }
        this.f58314p.put("Charset", "UTF-8");
        return this.f58314p;
    }

    @Override // com.mbridge.msdk.tracker.network.AbstractC22930u
    /* renamed from: d */
    public final boolean mo49316d() {
        return true;
    }

    @Override // com.mbridge.msdk.tracker.network.AbstractC22930u
    /* renamed from: b */
    public final InterfaceC22941z mo49318b() {
        if (this.f58307i == null) {
            this.f58307i = new C22905e(10000, this.f58315q, 5);
        }
        return this.f58307i;
    }

    /* renamed from: b */
    public final void m50545b(String str, String str2) {
        if (this.f58314p == null) {
            this.f58314p = new HashMap();
        }
        this.f58314p.put(str, str2);
    }

    /* renamed from: a */
    public final void m50550a(CampaignRequestListener campaignRequestListener) {
        this.f58306h = campaignRequestListener;
    }

    /* renamed from: a */
    public final void m50548a(String str, String str2) {
        if (this.f58305g == null) {
            this.f58305g = new HashMap();
        }
        if (TextUtils.isEmpty(str)) {
            return;
        }
        Map<String, String> map = this.f58305g;
        if (str2 == null) {
            str2 = "";
        }
        map.put(str, str2);
    }

    /* renamed from: a */
    public final void m50549a(String str) {
        this.f58311m = str;
    }

    /* renamed from: a */
    public final void m50547a(Map<String, String> map) {
        if (this.f58305g == null) {
            this.f58305g = new HashMap();
        }
        if (map == null || map.size() == 0) {
            return;
        }
        this.f58305g.putAll(map);
    }

    @Override // com.mbridge.msdk.tracker.network.AbstractC22930u
    /* renamed from: a */
    protected final Map<String, String> mo49325a() {
        if (this.f58305g == null) {
            this.f58305g = new HashMap();
        }
        return this.f58305g;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.mbridge.msdk.tracker.network.AbstractC22930u
    /* renamed from: a */
    public final C22937w<JSONObject> mo49324a(C22913r c22913r) {
        if (c22913r != null) {
            try {
                byte[] bArr = c22913r.f59817b;
                if (bArr != null && bArr.length != 0) {
                    return C22937w.m49373a(new JSONObject(new String(bArr, StandardCharsets.UTF_8)), C22921f.m49444a(c22913r));
                }
            } catch (JSONException e) {
                if (MBridgeConstans.DEBUG) {
                    SameLogTool.m51823b("BaseCampaignRequest", "parseNetworkResponse JSONException: ", e);
                }
                return C22937w.m49374a(new C22915t(e));
            } catch (Exception e2) {
                if (MBridgeConstans.DEBUG) {
                    SameLogTool.m51823b("BaseCampaignRequest", "parseNetworkResponse Exception: ", e2);
                }
                return C22937w.m49374a(new UnKnownError(e2));
            }
        }
        return C22937w.m49374a(new ResponseError());
    }

    @Override // com.mbridge.msdk.tracker.network.C22937w.InterfaceC22938a
    /* renamed from: a */
    public final void mo49372a(AbstractC22898ad abstractC22898ad) {
        CampaignRequestListener campaignRequestListener;
        MBridgeTimer.m50850a().m50849a(this.f58310l);
        if (MBridgeConstans.DEBUG) {
            SameLogTool.m51824b("BaseCampaignRequest", "onErrorResponse: " + abstractC22898ad.getMessage());
        }
        MBridgeCampaigns mBridgeCampaigns = this.f58299a;
        if (mBridgeCampaigns == null || (campaignRequestListener = this.f58306h) == null) {
            return;
        }
        try {
            campaignRequestListener.mo50530b(mBridgeCampaigns, this, VolleyErrorUtils.parseVolleyError(abstractC22898ad));
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                SameLogTool.m51823b("BaseCampaignRequest", "onError Exception: ", e);
            }
        }
    }

    /* renamed from: a */
    private static void m50551a(C22346a c22346a, MBridgeCampaigns mBridgeCampaigns, CampaignRequestError campaignRequestError) {
        CampaignRequestListener campaignRequestListener;
        if (c22346a == null || mBridgeCampaigns == null || (campaignRequestListener = c22346a.f58306h) == null) {
            return;
        }
        try {
            campaignRequestListener.mo50531a(mBridgeCampaigns, c22346a, campaignRequestError);
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                SameLogTool.m51823b("BaseCampaignRequest", "handlerOnFailedEvent Exception: ", e);
            }
        }
    }

    /* renamed from: a */
    static /* synthetic */ void m50552a(C22346a c22346a, MBridgeCampaigns mBridgeCampaigns, long j) {
        CampaignRequestListener campaignRequestListener;
        if (c22346a == null || mBridgeCampaigns == null || (campaignRequestListener = c22346a.f58306h) == null) {
            return;
        }
        try {
            campaignRequestListener.mo50532a(mBridgeCampaigns, c22346a, j, new CampaignRequestError(10, "v3 is timeout"));
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                SameLogTool.m51823b("BaseCampaignRequest", "onTimeout Exception: ", e);
            }
        }
    }
}
