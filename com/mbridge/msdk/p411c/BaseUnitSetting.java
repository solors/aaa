package com.mbridge.msdk.p411c;

import com.mbridge.msdk.foundation.controller.BaseMBSDKContext;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.meevii.adsdk.common.BidderConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.mbridge.msdk.c.c */
/* loaded from: classes6.dex */
public class BaseUnitSetting {

    /* renamed from: A */
    private String f55210A;

    /* renamed from: D */
    private int f55213D;

    /* renamed from: E */
    private int f55214E;

    /* renamed from: I */
    private int f55218I;

    /* renamed from: K */
    private String f55220K;

    /* renamed from: N */
    private int f55223N;

    /* renamed from: b */
    private List<Integer> f55225b;

    /* renamed from: c */
    private List<Integer> f55226c;

    /* renamed from: d */
    private int f55227d;

    /* renamed from: e */
    private int f55228e;

    /* renamed from: f */
    private int f55229f;

    /* renamed from: g */
    private int f55230g;

    /* renamed from: h */
    private int f55231h;

    /* renamed from: i */
    private int f55232i;

    /* renamed from: k */
    private long f55234k;

    /* renamed from: l */
    private long f55235l;

    /* renamed from: m */
    private int f55236m;

    /* renamed from: n */
    private int f55237n;

    /* renamed from: o */
    private int f55238o;

    /* renamed from: p */
    private long f55239p;

    /* renamed from: q */
    private long f55240q;

    /* renamed from: r */
    private int f55241r;

    /* renamed from: s */
    private String f55242s;

    /* renamed from: t */
    private int f55243t;

    /* renamed from: u */
    private int f55244u;

    /* renamed from: z */
    private String f55249z;

    /* renamed from: a */
    private String f55224a = "";

    /* renamed from: j */
    private int f55233j = 0;

    /* renamed from: v */
    private int f55245v = 30;

    /* renamed from: w */
    private int f55246w = 1;

    /* renamed from: x */
    private int f55247x = 10;

    /* renamed from: y */
    private int f55248y = 60;

    /* renamed from: B */
    private int f55211B = 1;

    /* renamed from: C */
    private String f55212C = "";

    /* renamed from: F */
    private int f55215F = 100;

    /* renamed from: G */
    private int f55216G = 60;

    /* renamed from: H */
    private int f55217H = 5000;

    /* renamed from: J */
    private int f55219J = 1;

    /* renamed from: L */
    private String f55221L = "";

    /* renamed from: M */
    private String f55222M = "";

    /* renamed from: a */
    public static UnitSetting m53344a(JSONObject jSONObject) {
        UnitSetting unitSetting = null;
        if (jSONObject == null) {
            return null;
        }
        try {
            UnitSetting unitSetting2 = new UnitSetting();
            try {
                ((BaseUnitSetting) unitSetting2).f55220K = jSONObject.optString(CampaignEx.JSON_KEY_CAMPAIGN_UNITID);
                String optString = jSONObject.optString("ab_id");
                ((BaseUnitSetting) unitSetting2).f55224a = optString;
                BaseMBSDKContext.f56090b.put(((BaseUnitSetting) unitSetting2).f55220K, optString);
                ((BaseUnitSetting) unitSetting2).f55221L = jSONObject.optString("rid");
                JSONArray optJSONArray = jSONObject.optJSONArray("adSourceList");
                if (optJSONArray != null && optJSONArray.length() > 0) {
                    ArrayList arrayList = new ArrayList();
                    for (int i = 0; i < optJSONArray.length(); i++) {
                        arrayList.add(Integer.valueOf(optJSONArray.optInt(i)));
                    }
                    ((BaseUnitSetting) unitSetting2).f55225b = arrayList;
                }
                JSONArray optJSONArray2 = jSONObject.optJSONArray("ad_source_timeout");
                if (optJSONArray2 != null && optJSONArray2.length() > 0) {
                    ArrayList arrayList2 = new ArrayList();
                    for (int i2 = 0; i2 < optJSONArray2.length(); i2++) {
                        arrayList2.add(Integer.valueOf(optJSONArray2.optInt(i2)));
                    }
                    ((BaseUnitSetting) unitSetting2).f55226c = arrayList2;
                }
                ((BaseUnitSetting) unitSetting2).f55218I = jSONObject.optInt("tpqn");
                ((BaseUnitSetting) unitSetting2).f55229f = jSONObject.optInt("aqn");
                ((BaseUnitSetting) unitSetting2).f55228e = jSONObject.optInt("acn");
                ((BaseUnitSetting) unitSetting2).f55223N = jSONObject.optInt("wt");
                int i3 = 1;
                ((BaseUnitSetting) unitSetting2).f55246w = jSONObject.optInt("iscasf", 1);
                ((BaseUnitSetting) unitSetting2).f55217H = jSONObject.optInt("spmxrt", 5000);
                ((BaseUnitSetting) unitSetting2).f55239p = jSONObject.optLong("current_time");
                ((BaseUnitSetting) unitSetting2).f55211B = jSONObject.optInt("offset");
                ((BaseUnitSetting) unitSetting2).f55240q = jSONObject.optLong("dlct", 3600L);
                ((BaseUnitSetting) unitSetting2).f55230g = jSONObject.optInt("autoplay", 0);
                ((BaseUnitSetting) unitSetting2).f55241r = jSONObject.optInt("dlnet", 2);
                ((BaseUnitSetting) unitSetting2).f55210A = jSONObject.optString("no_offer");
                ((BaseUnitSetting) unitSetting2).f55232i = jSONObject.optInt("cb_type");
                ((BaseUnitSetting) unitSetting2).f55235l = jSONObject.optLong("clct", 86400L);
                ((BaseUnitSetting) unitSetting2).f55234k = jSONObject.optLong("clcq", 300L);
                ((BaseUnitSetting) unitSetting2).f55215F = jSONObject.optInt(CampaignEx.JSON_KEY_READY_RATE, 100);
                ((BaseUnitSetting) unitSetting2).f55233j = jSONObject.optInt("cd_rate", 0);
                ((BaseUnitSetting) unitSetting2).f55237n = jSONObject.optInt("content", 1);
                ((BaseUnitSetting) unitSetting2).f55244u = jSONObject.optInt("impt", 0);
                ((BaseUnitSetting) unitSetting2).f55243t = jSONObject.optInt("icon_type", 1);
                ((BaseUnitSetting) unitSetting2).f55249z = jSONObject.optString("no_ads_url", "");
                ((BaseUnitSetting) unitSetting2).f55214E = jSONObject.optInt("playclosebtn_tm", -1);
                ((BaseUnitSetting) unitSetting2).f55213D = jSONObject.optInt("play_ctdown", 0);
                ((BaseUnitSetting) unitSetting2).f55236m = jSONObject.optInt("close_alert", 0);
                ((BaseUnitSetting) unitSetting2).f55245v = jSONObject.optInt("intershowlimit", 30);
                ((BaseUnitSetting) unitSetting2).f55216G = jSONObject.optInt("refreshFq", 60);
                ((BaseUnitSetting) unitSetting2).f55231h = jSONObject.optInt("closeBtn", 0);
                int optInt = jSONObject.optInt("tmorl", 1);
                if (optInt <= 2 && optInt > 0) {
                    i3 = optInt;
                }
                ((BaseUnitSetting) unitSetting2).f55219J = i3;
                ((BaseUnitSetting) unitSetting2).f55212C = jSONObject.optString(BidderConstants.PLACEMENTID, "");
                ((BaseUnitSetting) unitSetting2).f55247x = jSONObject.optInt("ltafemty", 10);
                ((BaseUnitSetting) unitSetting2).f55248y = jSONObject.optInt("ltorwc", 60);
                ((BaseUnitSetting) unitSetting2).f55222M = jSONObject.optString("vtag", "");
                return unitSetting2;
            } catch (Exception e) {
                e = e;
                unitSetting = unitSetting2;
                e.printStackTrace();
                return unitSetting;
            }
        } catch (Exception e2) {
            e = e2;
        }
    }

    /* renamed from: b */
    public final List<Integer> m53343b() {
        return this.f55225b;
    }

    /* renamed from: c */
    public final List<Integer> m53339c() {
        return this.f55226c;
    }

    /* renamed from: d */
    public final int m53337d() {
        return this.f55228e;
    }

    /* renamed from: e */
    public final int m53335e() {
        return this.f55229f;
    }

    /* renamed from: f */
    public final int m53333f() {
        return this.f55231h;
    }

    /* renamed from: g */
    public final int m53331g() {
        return this.f55233j;
    }

    /* renamed from: h */
    public final int m53329h() {
        return this.f55237n;
    }

    /* renamed from: i */
    public final long m53327i() {
        return this.f55239p;
    }

    /* renamed from: j */
    public final long m53325j() {
        return this.f55240q;
    }

    /* renamed from: k */
    public final int m53323k() {
        return this.f55241r;
    }

    /* renamed from: l */
    public final int m53321l() {
        return this.f55244u;
    }

    /* renamed from: m */
    public final int m53319m() {
        return this.f55246w;
    }

    /* renamed from: n */
    public final int m53317n() {
        return this.f55247x;
    }

    /* renamed from: o */
    public final int m53315o() {
        return this.f55248y;
    }

    /* renamed from: p */
    public final int m53313p() {
        return this.f55215F;
    }

    /* renamed from: q */
    public final int m53311q() {
        return this.f55216G;
    }

    /* renamed from: r */
    public final int m53310r() {
        return this.f55217H;
    }

    /* renamed from: s */
    public final String m53309s() {
        return this.f55221L;
    }

    /* renamed from: t */
    public final String m53308t() {
        return this.f55222M;
    }

    public String toString() {
        Iterator<Integer> it;
        List<Integer> list = this.f55225b;
        String str = "";
        if (list != null && list.size() > 0) {
            while (this.f55225b.iterator().hasNext()) {
                str = str + it.next() + ",";
            }
        }
        return "offset = " + this.f55211B + " unitId = " + this.f55220K + " fbPlacementId = " + this.f55242s + str;
    }

    /* renamed from: u */
    public final int m53307u() {
        return this.f55223N;
    }

    /* renamed from: v */
    public final int m53306v() {
        return this.f55230g;
    }

    /* renamed from: w */
    public final int m53305w() {
        return this.f55211B;
    }

    /* renamed from: x */
    public final JSONObject m53304x() {
        JSONObject jSONObject = new JSONObject();
        try {
            List<Integer> list = this.f55225b;
            if (list != null && list.size() > 0) {
                int size = list.size();
                JSONArray jSONArray = new JSONArray();
                for (int i = 0; i < size; i++) {
                    jSONArray.put(list.get(i));
                }
                jSONObject.put("adSourceList", jSONArray);
            }
            List<Integer> list2 = this.f55226c;
            if (list2 != null && list2.size() > 0) {
                int size2 = list2.size();
                JSONArray jSONArray2 = new JSONArray();
                for (int i2 = 0; i2 < size2; i2++) {
                    jSONArray2.put(list2.get(i2));
                }
                jSONObject.put("ad_source_timeout", jSONArray2);
            }
            jSONObject.put("tpqn", this.f55218I);
            jSONObject.put("aqn", this.f55229f);
            jSONObject.put("acn", this.f55228e);
            jSONObject.put("wt", this.f55223N);
            jSONObject.put("current_time", this.f55239p);
            jSONObject.put("offset", this.f55211B);
            jSONObject.put("dlct", this.f55240q);
            jSONObject.put("autoplay", this.f55230g);
            jSONObject.put("dlnet", this.f55241r);
            jSONObject.put("no_offer", this.f55210A);
            jSONObject.put("cb_type", this.f55232i);
            jSONObject.put("clct", this.f55235l);
            jSONObject.put("clcq", this.f55234k);
            jSONObject.put(CampaignEx.JSON_KEY_READY_RATE, this.f55215F);
            jSONObject.put("content", this.f55237n);
            jSONObject.put("impt", this.f55244u);
            jSONObject.put("icon_type", this.f55243t);
            jSONObject.put("no_ads_url", this.f55249z);
            jSONObject.put("playclosebtn_tm", this.f55214E);
            jSONObject.put("play_ctdown", this.f55213D);
            jSONObject.put("close_alert", this.f55236m);
            jSONObject.put("closeBtn", this.f55231h);
            jSONObject.put("refreshFq", this.f55216G);
            jSONObject.put("countdown", this.f55238o);
            jSONObject.put("allowSkip", this.f55227d);
            jSONObject.put("tmorl", this.f55219J);
            jSONObject.put(CampaignEx.JSON_KEY_CAMPAIGN_UNITID, this.f55220K);
            jSONObject.put(BidderConstants.PLACEMENTID, this.f55212C);
            jSONObject.put("ltafemty", this.f55247x);
            jSONObject.put("ltorwc", this.f55248y);
            jSONObject.put("vtag", this.f55222M);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return jSONObject;
    }

    /* renamed from: b */
    public final void m53340b(List<Integer> list) {
        this.f55226c = list;
    }

    /* renamed from: c */
    public final void m53338c(int i) {
        this.f55228e = i;
    }

    /* renamed from: d */
    public final void m53336d(int i) {
        this.f55229f = i;
    }

    /* renamed from: e */
    public final void m53334e(int i) {
        this.f55233j = i;
    }

    /* renamed from: f */
    public final void m53332f(int i) {
        this.f55237n = i;
    }

    /* renamed from: g */
    public final void m53330g(int i) {
        this.f55238o = i;
    }

    /* renamed from: h */
    public final void m53328h(int i) {
        this.f55241r = i;
    }

    /* renamed from: i */
    public final void m53326i(int i) {
        this.f55244u = i;
    }

    /* renamed from: j */
    public final void m53324j(int i) {
        this.f55247x = i;
    }

    /* renamed from: k */
    public final void m53322k(int i) {
        this.f55248y = i;
    }

    /* renamed from: l */
    public final void m53320l(int i) {
        this.f55215F = i;
    }

    /* renamed from: m */
    public final void m53318m(int i) {
        this.f55216G = i;
    }

    /* renamed from: n */
    public final void m53316n(int i) {
        this.f55218I = i;
    }

    /* renamed from: o */
    public final void m53314o(int i) {
        this.f55223N = i;
    }

    /* renamed from: p */
    public final void m53312p(int i) {
        this.f55211B = i;
    }

    /* renamed from: b */
    public final void m53342b(int i) {
        this.f55227d = i;
    }

    /* renamed from: b */
    public final void m53341b(String str) {
        this.f55220K = str;
    }

    /* renamed from: a */
    public final void m53348a(int i) {
        this.f55230g = i;
    }

    /* renamed from: a */
    public final String m53349a() {
        return this.f55224a;
    }

    /* renamed from: a */
    public final void m53345a(List<Integer> list) {
        this.f55225b = list;
    }

    /* renamed from: a */
    public final void m53347a(long j) {
        this.f55240q = j;
    }

    /* renamed from: a */
    public final void m53346a(String str) {
        this.f55212C = str;
    }
}
