package com.mbridge.msdk.videocommon.p538d;

import android.text.TextUtils;
import com.mbridge.msdk.foundation.controller.BaseMBSDKContext;
import com.mbridge.msdk.foundation.controller.MBSDKContext;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.entity.RewardPlus;
import com.mbridge.msdk.foundation.p434db.CommonSDKDBHelper;
import com.mbridge.msdk.foundation.tools.SameBase64Tool;
import com.mbridge.msdk.newreward.function.common.MBridgeCommon;
import com.mbridge.msdk.videocommon.p536b.AdUnitInfo;
import com.meevii.adsdk.common.BidderConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.mbridge.msdk.videocommon.d.c */
/* loaded from: classes6.dex */
public final class RewardUnitSetting {

    /* renamed from: H */
    private static CommonSDKDBHelper f61273H;

    /* renamed from: a */
    public static String f61274a;

    /* renamed from: F */
    private int f61280F;

    /* renamed from: I */
    private int f61282I;

    /* renamed from: W */
    private JSONArray f61296W;

    /* renamed from: X */
    private JSONObject f61297X;

    /* renamed from: b */
    private String f61298b;

    /* renamed from: c */
    private String f61299c;

    /* renamed from: d */
    private List<AdUnitInfo> f61300d;

    /* renamed from: e */
    private long f61301e;

    /* renamed from: u */
    private ArrayList<Integer> f61317u;

    /* renamed from: f */
    private int f61302f = -1;

    /* renamed from: g */
    private int f61303g = 0;

    /* renamed from: h */
    private int f61304h = 0;

    /* renamed from: i */
    private int f61305i = 1;

    /* renamed from: j */
    private int f61306j = 1;

    /* renamed from: k */
    private int f61307k = 1;

    /* renamed from: l */
    private int f61308l = 1;

    /* renamed from: m */
    private int f61309m = 5;

    /* renamed from: n */
    private int f61310n = 1;

    /* renamed from: o */
    private int f61311o = 3;

    /* renamed from: p */
    private int f61312p = 80;

    /* renamed from: q */
    private int f61313q = 100;

    /* renamed from: r */
    private int f61314r = 0;

    /* renamed from: s */
    private double f61315s = 1.0d;

    /* renamed from: t */
    private int f61316t = -1;

    /* renamed from: v */
    private int f61318v = 3;

    /* renamed from: w */
    private int f61319w = 1;

    /* renamed from: x */
    private int f61320x = 100;

    /* renamed from: y */
    private int f61321y = 60;

    /* renamed from: z */
    private int f61322z = 0;

    /* renamed from: A */
    private int f61275A = 70;

    /* renamed from: B */
    private int f61276B = 0;

    /* renamed from: C */
    private int f61277C = -1;

    /* renamed from: D */
    private int f61278D = -1;

    /* renamed from: E */
    private int f61279E = -1;

    /* renamed from: G */
    private int f61281G = 20;

    /* renamed from: J */
    private int f61283J = 0;

    /* renamed from: K */
    private int f61284K = 1;

    /* renamed from: L */
    private String f61285L = "";

    /* renamed from: M */
    private int f61286M = 1;

    /* renamed from: N */
    private String f61287N = "";

    /* renamed from: O */
    private int f61288O = 1;

    /* renamed from: P */
    private String f61289P = "Virtual Item";

    /* renamed from: Q */
    private String f61290Q = "";

    /* renamed from: R */
    private String f61291R = "";

    /* renamed from: S */
    private int f61292S = 0;

    /* renamed from: T */
    private int f61293T = 1;

    /* renamed from: U */
    private int f61294U = 60;

    /* renamed from: V */
    private String f61295V = "";

    /* renamed from: y */
    private void m48254y(int i) {
        if (i <= 0) {
            this.f61286M = 1;
        } else {
            this.f61286M = i;
        }
    }

    /* renamed from: A */
    public final int m48318A() {
        return this.f61318v;
    }

    /* renamed from: B */
    public final Queue<Integer> m48317B() {
        LinkedList linkedList;
        Exception e;
        List<AdUnitInfo> list;
        try {
            list = this.f61300d;
        } catch (Exception e2) {
            linkedList = null;
            e = e2;
        }
        if (list == null || list.size() <= 0) {
            return null;
        }
        linkedList = new LinkedList();
        for (int i = 0; i < this.f61300d.size(); i++) {
            try {
                linkedList.add(Integer.valueOf(this.f61300d.get(i).m48382b()));
            } catch (Exception e3) {
                e = e3;
                e.printStackTrace();
                return linkedList;
            }
        }
        return linkedList;
    }

    /* renamed from: C */
    public final int m48316C() {
        return this.f61293T;
    }

    /* renamed from: D */
    public final int m48315D() {
        return this.f61294U;
    }

    /* renamed from: E */
    public final JSONObject m48314E() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(CampaignEx.JSON_KEY_CAMPAIGN_UNITID, this.f61298b);
            jSONObject.put("callbackType", this.f61305i);
            List<AdUnitInfo> list = this.f61300d;
            if (list != null && list.size() > 0) {
                JSONArray jSONArray = new JSONArray();
                for (AdUnitInfo adUnitInfo : this.f61300d) {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("id", adUnitInfo.m48384a());
                    jSONObject2.put("timeout", adUnitInfo.m48382b());
                    jSONArray.put(jSONObject2);
                }
                jSONObject.put("adSourceList", jSONArray);
            }
            jSONObject.put("aqn", this.f61306j);
            jSONObject.put("acn", this.f61307k);
            jSONObject.put("vcn", this.f61308l);
            jSONObject.put("offset", this.f61309m);
            jSONObject.put("dlnet", this.f61310n);
            jSONObject.put("tv_start", this.f61311o);
            jSONObject.put("tv_end", this.f61312p);
            jSONObject.put(CampaignEx.JSON_KEY_READY_RATE, this.f61313q);
            jSONObject.put("endscreen_type", this.f61282I);
            jSONObject.put("daily_play_cap", this.f61276B);
            jSONObject.put("video_skip_time", this.f61277C);
            jSONObject.put("video_skip_result", this.f61278D);
            jSONObject.put("video_interactive_type", this.f61279E);
            jSONObject.put("orientation", this.f61322z);
            jSONObject.put("close_button_delay", this.f61280F);
            jSONObject.put("playclosebtn_tm", this.f61302f);
            jSONObject.put("play_ctdown", this.f61303g);
            jSONObject.put("close_alert", this.f61304h);
            jSONObject.put("rfpv", this.f61316t);
            jSONObject.put("vdcmp", this.f61315s);
            JSONArray jSONArray2 = new JSONArray();
            ArrayList<Integer> arrayList = this.f61317u;
            if (arrayList != null) {
                if (arrayList.size() > 0) {
                    Iterator<Integer> it = this.f61317u.iterator();
                    while (it.hasNext()) {
                        jSONArray2.put(it.next());
                    }
                }
                jSONObject.put("atl_type", jSONArray2);
            }
            jSONObject.put("atl_dyt", this.f61318v);
            jSONObject.put("tmorl", this.f61319w);
            jSONObject.put(BidderConstants.PLACEMENTID, this.f61299c);
            jSONObject.put("ltafemty", this.f61320x);
            jSONObject.put("ltorwc", this.f61321y);
            jSONObject.put(RewardPlus.AMOUNT_MAX, this.f61283J);
            jSONObject.put(RewardPlus.CALLBACK_RULE, this.f61284K);
            jSONObject.put(RewardPlus.VIRTUAL_CURRENCY, this.f61285L);
            jSONObject.put("amount", this.f61286M);
            jSONObject.put("icon", this.f61287N);
            jSONObject.put(RewardPlus.CURRENCY_ID, this.f61288O);
            jSONObject.put("name", this.f61289P);
            jSONObject.put("isDefault", this.f61292S);
            jSONObject.put("video_error_rule", this.f61293T);
            jSONObject.put("loadtmo", this.f61294U);
            jSONObject.put("vtag", this.f61295V);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return jSONObject;
    }

    /* renamed from: F */
    public final int m48313F() {
        return this.f61275A;
    }

    /* renamed from: G */
    public final JSONArray m48312G() {
        return this.f61296W;
    }

    /* renamed from: a */
    public final int m48311a() {
        return this.f61320x;
    }

    /* renamed from: b */
    public final int m48305b() {
        return this.f61321y;
    }

    /* renamed from: c */
    public final int m48302c() {
        return this.f61322z;
    }

    /* renamed from: d */
    public final int m48299d() {
        return this.f61276B;
    }

    /* renamed from: e */
    public final int m48296e() {
        return this.f61277C;
    }

    /* renamed from: f */
    public final int m48293f() {
        return this.f61278D;
    }

    /* renamed from: g */
    public final int m48291g() {
        return this.f61279E;
    }

    /* renamed from: h */
    public final int m48289h() {
        return this.f61302f;
    }

    /* renamed from: i */
    public final int m48287i() {
        return this.f61304h;
    }

    /* renamed from: j */
    public final String m48285j() {
        return this.f61295V;
    }

    /* renamed from: k */
    public final String m48283k() {
        return this.f61290Q;
    }

    /* renamed from: l */
    public final String m48281l() {
        return this.f61291R;
    }

    /* renamed from: m */
    public final int m48279m() {
        return this.f61286M;
    }

    /* renamed from: n */
    public final String m48277n() {
        return this.f61289P;
    }

    /* renamed from: o */
    public final int m48275o() {
        return this.f61281G;
    }

    /* renamed from: p */
    public final int m48273p() {
        return this.f61280F;
    }

    /* renamed from: q */
    public final int m48271q() {
        return this.f61282I;
    }

    /* renamed from: r */
    public final int m48269r() {
        return this.f61313q;
    }

    /* renamed from: s */
    public final int m48267s() {
        return this.f61314r;
    }

    /* renamed from: t */
    public final int m48265t() {
        return this.f61306j;
    }

    /* renamed from: u */
    public final int m48263u() {
        return this.f61307k;
    }

    /* renamed from: v */
    public final int m48261v() {
        return this.f61309m;
    }

    /* renamed from: w */
    public final int m48259w() {
        return this.f61310n;
    }

    /* renamed from: x */
    public final long m48257x() {
        return this.f61301e;
    }

    /* renamed from: z */
    public final String m48253z() {
        return this.f61299c;
    }

    /* renamed from: a */
    public final void m48308a(ArrayList<Integer> arrayList) {
        this.f61317u = arrayList;
    }

    /* renamed from: b */
    public final void m48304b(int i) {
        this.f61276B = i;
    }

    /* renamed from: c */
    public final void m48301c(int i) {
        this.f61277C = i;
    }

    /* renamed from: d */
    public final void m48298d(int i) {
        this.f61278D = i;
    }

    /* renamed from: e */
    public final void m48295e(int i) {
        this.f61279E = i;
    }

    /* renamed from: f */
    public final void m48292f(int i) {
        this.f61280F = i;
    }

    /* renamed from: g */
    public final void m48290g(int i) {
        this.f61282I = i;
    }

    /* renamed from: h */
    public final void m48288h(int i) {
        this.f61311o = i;
    }

    /* renamed from: i */
    public final void m48286i(int i) {
        this.f61312p = i;
    }

    /* renamed from: j */
    public final void m48284j(int i) {
        this.f61313q = i;
    }

    /* renamed from: k */
    public final void m48282k(int i) {
        this.f61314r = i;
    }

    /* renamed from: l */
    public final void m48280l(int i) {
        this.f61306j = i;
    }

    /* renamed from: m */
    public final void m48278m(int i) {
        this.f61307k = i;
    }

    /* renamed from: n */
    public final void m48276n(int i) {
        this.f61308l = i;
    }

    /* renamed from: o */
    public final void m48274o(int i) {
        this.f61309m = i;
    }

    /* renamed from: p */
    public final void m48272p(int i) {
        this.f61310n = i;
    }

    /* renamed from: q */
    public final void m48270q(int i) {
        this.f61305i = i;
    }

    /* renamed from: r */
    public final void m48268r(int i) {
        this.f61319w = i;
    }

    /* renamed from: s */
    public final boolean m48266s(int i) {
        ArrayList<Integer> arrayList = this.f61317u;
        if (arrayList == null || arrayList.size() <= 0) {
            return false;
        }
        return this.f61317u.contains(Integer.valueOf(i));
    }

    /* renamed from: t */
    public final void m48264t(int i) {
        this.f61318v = i;
    }

    /* renamed from: u */
    public final void m48262u(int i) {
        this.f61292S = i;
    }

    /* renamed from: v */
    public final void m48260v(int i) {
        this.f61293T = i;
    }

    /* renamed from: w */
    public final void m48258w(int i) {
        this.f61294U = i;
    }

    /* renamed from: x */
    public final void m48256x(int i) {
        this.f61275A = i;
    }

    /* renamed from: c */
    public static RewardUnitSetting m48300c(String str) {
        JSONObject optJSONObject;
        if (f61273H == null) {
            f61273H = CommonSDKDBHelper.m52593a(MBSDKContext.m52746m().m52792c());
        }
        RewardUnitSetting rewardUnitSetting = null;
        if (!TextUtils.isEmpty(str)) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                String optString = jSONObject.optString("vtag", "");
                String optString2 = jSONObject.optString("rid", "");
                JSONArray optJSONArray = jSONObject.optJSONArray("unitSetting");
                if (optJSONArray == null || (optJSONObject = optJSONArray.optJSONObject(0)) == null) {
                    return null;
                }
                String optString3 = optJSONObject.optString(CampaignEx.JSON_KEY_CAMPAIGN_UNITID);
                if (TextUtils.isEmpty(optString3)) {
                    return null;
                }
                RewardUnitSetting rewardUnitSetting2 = new RewardUnitSetting();
                try {
                    rewardUnitSetting2.f61295V = optString;
                    rewardUnitSetting2.f61291R = optString2;
                    List<AdUnitInfo> m48383a = AdUnitInfo.m48383a(optJSONObject.optJSONArray("adSourceList"));
                    rewardUnitSetting2.f61298b = optString3;
                    rewardUnitSetting2.f61300d = m48383a;
                    rewardUnitSetting2.f61305i = optJSONObject.optInt("callbackType");
                    int optInt = optJSONObject.optInt("aqn", 1);
                    if (optInt <= 0) {
                        optInt = 1;
                    }
                    rewardUnitSetting2.f61306j = optInt;
                    int optInt2 = optJSONObject.optInt("acn", 1);
                    if (optInt2 < 0) {
                        optInt2 = 1;
                    }
                    rewardUnitSetting2.f61307k = optInt2;
                    rewardUnitSetting2.f61308l = optJSONObject.optInt("vcn", 5);
                    rewardUnitSetting2.f61309m = optJSONObject.optInt("offset", 5);
                    rewardUnitSetting2.f61310n = optJSONObject.optInt("dlnet", 1);
                    rewardUnitSetting2.f61282I = optJSONObject.optInt("endscreen_type", 2);
                    rewardUnitSetting2.f61311o = optJSONObject.optInt("tv_start", 3);
                    rewardUnitSetting2.f61312p = optJSONObject.optInt("tv_end", 80);
                    rewardUnitSetting2.f61313q = optJSONObject.optInt(CampaignEx.JSON_KEY_READY_RATE, 100);
                    rewardUnitSetting2.f61314r = optJSONObject.optInt("cd_rate", 0);
                    rewardUnitSetting2.f61301e = jSONObject.optLong("current_time");
                    rewardUnitSetting2.f61322z = optJSONObject.optInt("orientation", 0);
                    rewardUnitSetting2.f61276B = optJSONObject.optInt("daily_play_cap", 0);
                    rewardUnitSetting2.f61277C = optJSONObject.optInt("video_skip_time", -1);
                    rewardUnitSetting2.f61278D = optJSONObject.optInt("video_skip_result", 2);
                    rewardUnitSetting2.f61279E = optJSONObject.optInt("video_interactive_type", -1);
                    rewardUnitSetting2.f61280F = optJSONObject.optInt("close_button_delay", 1);
                    rewardUnitSetting2.f61302f = optJSONObject.optInt("playclosebtn_tm", -1);
                    rewardUnitSetting2.f61303g = optJSONObject.optInt("play_ctdown", 0);
                    rewardUnitSetting2.f61304h = optJSONObject.optInt("close_alert", 0);
                    rewardUnitSetting2.f61281G = optJSONObject.optInt("rdrct", 20);
                    rewardUnitSetting2.f61275A = optJSONObject.optInt("load_global_timeout", 70);
                    rewardUnitSetting2.f61316t = optJSONObject.optInt("rfpv", -1);
                    rewardUnitSetting2.f61315s = optJSONObject.optDouble("vdcmp", 1.0d);
                    f61274a = optJSONObject.optString("atzu");
                    JSONArray optJSONArray2 = optJSONObject.optJSONArray("atl_type");
                    ArrayList<Integer> arrayList = new ArrayList<>();
                    try {
                        if (optJSONArray2 != null) {
                            for (int i = 0; i < optJSONArray2.length(); i++) {
                                arrayList.add(Integer.valueOf(optJSONArray2.getInt(i)));
                            }
                        } else {
                            arrayList.add(4);
                            arrayList.add(6);
                        }
                        rewardUnitSetting2.f61317u = arrayList;
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    int optInt3 = optJSONObject.optInt("atl_dyt", 0);
                    rewardUnitSetting2.f61318v = optInt3 > 0 ? optInt3 : 3;
                    int optInt4 = optJSONObject.optInt("tmorl", 1);
                    rewardUnitSetting2.f61319w = (optInt4 > 2 || optInt4 <= 0) ? 1 : 1;
                    rewardUnitSetting2.f61299c = optJSONObject.optString(BidderConstants.PLACEMENTID);
                    rewardUnitSetting2.f61320x = optJSONObject.optInt("ltafemty", 10);
                    rewardUnitSetting2.f61321y = optJSONObject.optInt("ltorwc", 60);
                    rewardUnitSetting2.m48297d(optJSONObject.optString("ab_id"));
                    rewardUnitSetting2.f61283J = optJSONObject.optInt(RewardPlus.AMOUNT_MAX, 0);
                    rewardUnitSetting2.f61284K = optJSONObject.optInt(RewardPlus.CALLBACK_RULE, 1);
                    rewardUnitSetting2.f61285L = optJSONObject.optString(RewardPlus.VIRTUAL_CURRENCY, "");
                    rewardUnitSetting2.m48254y(optJSONObject.optInt("amount", 1));
                    rewardUnitSetting2.f61287N = optJSONObject.optString("icon", "");
                    rewardUnitSetting2.f61288O = optJSONObject.optInt(RewardPlus.CURRENCY_ID, 1);
                    rewardUnitSetting2.m48294e(optJSONObject.optString("name", "Virtual Item"));
                    rewardUnitSetting2.f61293T = optJSONObject.optInt("video_error_rule", 1);
                    rewardUnitSetting2.f61294U = optJSONObject.optInt("loadtmo", 60);
                    rewardUnitSetting2.f61296W = optJSONObject.optJSONArray("local_cache_info");
                    try {
                        String optString4 = optJSONObject.optString(MBridgeCommon.SettingConfig.KEY_SETTING_CONFIG_RETRY_STRATEGY);
                        if (!TextUtils.isEmpty(optString4)) {
                            String m51603a = SameBase64Tool.m51603a(optString4);
                            if (!TextUtils.isEmpty(m51603a)) {
                                rewardUnitSetting2.f61297X = new JSONObject(m51603a);
                            }
                        }
                    } catch (Exception unused) {
                    }
                    return rewardUnitSetting2;
                } catch (Exception e2) {
                    e = e2;
                    rewardUnitSetting = rewardUnitSetting2;
                    e.printStackTrace();
                    return rewardUnitSetting;
                }
            } catch (Exception e3) {
                e = e3;
            }
        }
        return rewardUnitSetting;
    }

    /* renamed from: d */
    private void m48297d(String str) {
        this.f61290Q = str;
        BaseMBSDKContext.f56090b.put(this.f61298b, str);
    }

    /* renamed from: e */
    private void m48294e(String str) {
        if (TextUtils.isEmpty(str)) {
            this.f61289P = this.f61285L;
        } else {
            this.f61289P = str;
        }
    }

    /* renamed from: a */
    public final void m48310a(int i) {
        this.f61322z = i;
    }

    /* renamed from: b */
    public final void m48303b(String str) {
        this.f61299c = str;
    }

    /* renamed from: y */
    public final int m48255y() {
        return this.f61319w;
    }

    /* renamed from: a */
    public final void m48309a(String str) {
        this.f61298b = str;
    }

    /* renamed from: a */
    public final void m48307a(List<AdUnitInfo> list) {
        this.f61300d = list;
    }

    /* renamed from: a */
    public static RewardUnitSetting m48306a(JSONObject jSONObject) {
        RewardUnitSetting rewardUnitSetting = null;
        if (jSONObject == null) {
            return null;
        }
        try {
            RewardUnitSetting rewardUnitSetting2 = new RewardUnitSetting();
            try {
                rewardUnitSetting2.f61300d = AdUnitInfo.m48383a(jSONObject.optJSONArray("adSourceList"));
                rewardUnitSetting2.f61305i = jSONObject.optInt("callbackType");
                int optInt = jSONObject.optInt("aqn", 1);
                if (optInt <= 0) {
                    optInt = 1;
                }
                rewardUnitSetting2.f61306j = optInt;
                int optInt2 = jSONObject.optInt("acn", 1);
                if (optInt2 < 0) {
                    optInt2 = 1;
                }
                rewardUnitSetting2.f61307k = optInt2;
                rewardUnitSetting2.f61308l = jSONObject.optInt("vcn", 5);
                rewardUnitSetting2.f61309m = jSONObject.optInt("offset", 5);
                rewardUnitSetting2.f61310n = jSONObject.optInt("dlnet", 1);
                rewardUnitSetting2.f61282I = jSONObject.optInt("endscreen_type", 2);
                rewardUnitSetting2.f61311o = jSONObject.optInt("tv_start", 3);
                rewardUnitSetting2.f61312p = jSONObject.optInt("tv_end", 80);
                rewardUnitSetting2.f61313q = jSONObject.optInt(CampaignEx.JSON_KEY_READY_RATE, 100);
                rewardUnitSetting2.f61301e = jSONObject.optLong("current_time");
                rewardUnitSetting2.f61322z = jSONObject.optInt("orientation", 0);
                rewardUnitSetting2.f61276B = jSONObject.optInt("daily_play_cap", 0);
                rewardUnitSetting2.f61277C = jSONObject.optInt("video_skip_time", -1);
                rewardUnitSetting2.f61278D = jSONObject.optInt("video_skip_result", 2);
                rewardUnitSetting2.f61279E = jSONObject.optInt("video_interactive_type", -1);
                rewardUnitSetting2.f61280F = jSONObject.optInt("close_button_delay", 1);
                rewardUnitSetting2.f61302f = jSONObject.optInt("playclosebtn_tm", -1);
                rewardUnitSetting2.f61303g = jSONObject.optInt("play_ctdown", 0);
                rewardUnitSetting2.f61304h = jSONObject.optInt("close_alert", 0);
                rewardUnitSetting2.f61281G = jSONObject.optInt("rdrct", 20);
                rewardUnitSetting2.f61316t = jSONObject.optInt("rfpv", -1);
                rewardUnitSetting2.f61315s = jSONObject.optDouble("vdcmp", 1.0d);
                rewardUnitSetting2.f61275A = jSONObject.optInt("load_global_timeout", 70);
                JSONArray optJSONArray = jSONObject.optJSONArray("atl_type");
                ArrayList<Integer> arrayList = new ArrayList<>();
                try {
                    if (optJSONArray != null) {
                        for (int i = 0; i < optJSONArray.length(); i++) {
                            arrayList.add(Integer.valueOf(optJSONArray.getInt(i)));
                        }
                    } else {
                        arrayList.add(4);
                        arrayList.add(6);
                    }
                    rewardUnitSetting2.f61317u = arrayList;
                } catch (Exception e) {
                    e.printStackTrace();
                }
                rewardUnitSetting2.f61318v = jSONObject.optInt("atl_dyt", 3);
                int optInt3 = jSONObject.optInt("tmorl", 1);
                rewardUnitSetting2.f61319w = (optInt3 > 2 || optInt3 <= 0) ? 1 : 1;
                rewardUnitSetting2.f61299c = jSONObject.optString(BidderConstants.PLACEMENTID);
                rewardUnitSetting2.f61320x = jSONObject.optInt("ltafemty", 10);
                rewardUnitSetting2.f61321y = jSONObject.optInt("ltorwc", 60);
                rewardUnitSetting2.m48297d(jSONObject.optString("ab_id"));
                rewardUnitSetting2.f61291R = jSONObject.optString("rid", "");
                rewardUnitSetting2.f61283J = jSONObject.optInt(RewardPlus.AMOUNT_MAX, 0);
                rewardUnitSetting2.f61284K = jSONObject.optInt(RewardPlus.CALLBACK_RULE, 1);
                rewardUnitSetting2.f61285L = jSONObject.optString(RewardPlus.VIRTUAL_CURRENCY, "");
                rewardUnitSetting2.m48254y(jSONObject.optInt("amount", 1));
                rewardUnitSetting2.f61287N = jSONObject.optString("icon", "");
                rewardUnitSetting2.f61288O = jSONObject.optInt(RewardPlus.CURRENCY_ID, 1);
                rewardUnitSetting2.m48294e(jSONObject.optString("name", "Virtual Item"));
                rewardUnitSetting2.f61293T = jSONObject.optInt("video_error_rule", 1);
                rewardUnitSetting2.f61294U = jSONObject.optInt("loadtmo", 60);
                rewardUnitSetting2.f61295V = jSONObject.optString("vtag", "");
                rewardUnitSetting2.f61296W = jSONObject.optJSONArray("local_cache_info");
                try {
                    String optString = jSONObject.optString(MBridgeCommon.SettingConfig.KEY_SETTING_CONFIG_RETRY_STRATEGY);
                    if (!TextUtils.isEmpty(optString)) {
                        String m51603a = SameBase64Tool.m51603a(optString);
                        if (!TextUtils.isEmpty(m51603a)) {
                            rewardUnitSetting2.f61297X = new JSONObject(m51603a);
                        }
                    }
                } catch (Exception unused) {
                }
                return rewardUnitSetting2;
            } catch (Exception e2) {
                e = e2;
                rewardUnitSetting = rewardUnitSetting2;
                e.printStackTrace();
                return rewardUnitSetting;
            }
        } catch (Exception e3) {
            e = e3;
        }
    }
}
