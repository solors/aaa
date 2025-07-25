package com.mbridge.msdk.videocommon.p538d;

import android.text.TextUtils;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.videocommon.p536b.Reward;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import net.pubnative.lite.sdk.analytics.Reporting;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.mbridge.msdk.videocommon.d.a */
/* loaded from: classes6.dex */
public class RewardSetting {

    /* renamed from: a */
    private Map<String, Integer> f61253a;

    /* renamed from: b */
    private Map<String, Reward> f61254b;

    /* renamed from: c */
    private long f61255c;

    /* renamed from: d */
    private long f61256d;

    /* renamed from: e */
    private long f61257e;

    /* renamed from: f */
    private long f61258f;

    /* renamed from: g */
    private long f61259g;

    /* renamed from: h */
    private long f61260h;

    /* renamed from: j */
    private String f61262j;

    /* renamed from: i */
    private int f61261i = 0;

    /* renamed from: k */
    private String f61263k = "";

    /* renamed from: l */
    private String f61264l = "";

    /* renamed from: a */
    public final String m48364a() {
        return this.f61263k;
    }

    /* renamed from: b */
    public final String m48359b() {
        return this.f61262j;
    }

    /* renamed from: c */
    public final String m48356c() {
        return this.f61264l;
    }

    /* renamed from: d */
    public final long m48354d() {
        return this.f61255c * 1000;
    }

    /* renamed from: e */
    public final long m48352e() {
        return this.f61256d * 1000;
    }

    /* renamed from: f */
    public final long m48350f() {
        return this.f61257e * 1000;
    }

    /* renamed from: g */
    public final long m48349g() {
        return this.f61258f;
    }

    /* renamed from: h */
    public final long m48348h() {
        return this.f61259g;
    }

    /* renamed from: i */
    public final long m48347i() {
        return this.f61260h;
    }

    /* renamed from: j */
    public final Map<String, Reward> m48346j() {
        return this.f61254b;
    }

    /* renamed from: k */
    public final JSONObject m48345k() {
        JSONObject jSONObject = new JSONObject();
        try {
            Map<String, Integer> map = this.f61253a;
            if (map != null && map.size() > 0) {
                try {
                    JSONObject jSONObject2 = new JSONObject();
                    for (Map.Entry<String, Integer> entry : this.f61253a.entrySet()) {
                        jSONObject2.put(entry.getKey(), entry.getValue().intValue());
                    }
                    jSONObject.put("caplist", jSONObject2);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            Map<String, Reward> map2 = this.f61254b;
            if (map2 != null && map2.size() > 0) {
                try {
                    JSONArray jSONArray = new JSONArray();
                    for (Map.Entry<String, Reward> entry2 : this.f61254b.entrySet()) {
                        JSONObject jSONObject3 = new JSONObject();
                        String key = entry2.getKey();
                        Reward value = entry2.getValue();
                        if (value != null) {
                            jSONObject3.put("name", value.m48381a());
                            jSONObject3.put("amount", value.m48376b());
                            jSONObject3.put("id", key);
                        }
                        jSONArray.put(jSONObject3);
                    }
                    jSONObject.put(Reporting.EventType.REWARD, jSONArray);
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
            }
            jSONObject.put("getpf", this.f61255c);
            jSONObject.put("ruct", this.f61256d);
            jSONObject.put(CampaignEx.JSON_KEY_PLCT, this.f61257e);
            jSONObject.put("dlct", this.f61258f);
            jSONObject.put("vcct", this.f61259g);
            jSONObject.put("current_time", this.f61260h);
            jSONObject.put("vtag", this.f61263k);
            jSONObject.put("isDefault", this.f61261i);
            return jSONObject;
        } catch (Exception e3) {
            e3.printStackTrace();
            return jSONObject;
        }
    }

    /* renamed from: a */
    public final void m48362a(long j) {
        this.f61255c = j;
    }

    /* renamed from: b */
    public final void m48358b(long j) {
        this.f61256d = j;
    }

    /* renamed from: c */
    public final void m48355c(long j) {
        this.f61257e = j;
    }

    /* renamed from: d */
    public final void m48353d(long j) {
        this.f61258f = j;
    }

    /* renamed from: e */
    public final void m48351e(long j) {
        this.f61259g = j;
    }

    /* renamed from: a */
    public final void m48360a(Map<String, Integer> map) {
        this.f61253a = map;
    }

    /* renamed from: b */
    public final void m48357b(Map<String, Reward> map) {
        this.f61254b = map;
    }

    /* renamed from: a */
    public final void m48363a(int i) {
        this.f61261i = i;
    }

    /* renamed from: a */
    public static RewardSetting m48361a(String str) {
        RewardSetting rewardSetting = null;
        if (!TextUtils.isEmpty(str)) {
            try {
                RewardSetting rewardSetting2 = new RewardSetting();
                try {
                    JSONObject jSONObject = new JSONObject(str);
                    JSONObject optJSONObject = jSONObject.optJSONObject("caplist");
                    rewardSetting2.f61262j = jSONObject.optString("ab_id", "");
                    rewardSetting2.f61264l = jSONObject.optString("rid", "");
                    if (optJSONObject != null && optJSONObject.length() > 0) {
                        HashMap hashMap = new HashMap();
                        Iterator<String> keys = optJSONObject.keys();
                        while (keys != null && keys.hasNext()) {
                            String next = keys.next();
                            int intValue = Integer.valueOf(optJSONObject.optInt(next, 1000)).intValue();
                            if (!TextUtils.isEmpty(next)) {
                                if (!TextUtils.isEmpty(next) && intValue == 0) {
                                    hashMap.put(next, 1000);
                                } else {
                                    hashMap.put(next, Integer.valueOf(intValue));
                                }
                            }
                        }
                        rewardSetting2.f61253a = hashMap;
                    }
                    rewardSetting2.f61254b = Reward.m48378a(jSONObject.optJSONArray(Reporting.EventType.REWARD));
                    rewardSetting2.f61255c = jSONObject.optLong("getpf", 43200L);
                    rewardSetting2.f61256d = jSONObject.optLong("ruct", 5400L);
                    rewardSetting2.f61257e = jSONObject.optLong(CampaignEx.JSON_KEY_PLCT, 3600L);
                    rewardSetting2.f61258f = jSONObject.optLong("dlct", 3600L);
                    rewardSetting2.f61259g = jSONObject.optLong("vcct", 5L);
                    rewardSetting2.f61260h = jSONObject.optLong("current_time");
                    rewardSetting2.f61263k = jSONObject.optString("vtag", "");
                    return rewardSetting2;
                } catch (Exception e) {
                    e = e;
                    rewardSetting = rewardSetting2;
                    e.printStackTrace();
                    return rewardSetting;
                }
            } catch (Exception e2) {
                e = e2;
            }
        }
        return rewardSetting;
    }
}
