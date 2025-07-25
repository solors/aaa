package com.mbridge.msdk.videocommon.p536b;

import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.mbridge.msdk.videocommon.b.c */
/* loaded from: classes6.dex */
public final class Reward {

    /* renamed from: a */
    private String f61243a;

    /* renamed from: b */
    private int f61244b;

    public Reward(String str, int i) {
        this.f61243a = str;
        this.f61244b = i;
    }

    /* renamed from: c */
    private static Reward m48374c() {
        return new Reward("Virtual Item", 1);
    }

    /* renamed from: a */
    public final String m48381a() {
        return this.f61243a;
    }

    /* renamed from: b */
    public final int m48376b() {
        return this.f61244b;
    }

    public final String toString() {
        return "Reward{name='" + this.f61243a + "', amount=" + this.f61244b + '}';
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002a A[Catch: Exception -> 0x002f, TRY_LEAVE, TryCatch #0 {Exception -> 0x002f, blocks: (B:3:0x0001, B:5:0x000f, B:12:0x002a, B:8:0x0017, B:10:0x001d), top: B:17:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.mbridge.msdk.videocommon.p536b.Reward m48375b(java.lang.String r3) {
        /*
            r0 = 0
            com.mbridge.msdk.videocommon.d.b r1 = com.mbridge.msdk.videocommon.p538d.RewardSettingManager.m48344a()     // Catch: java.lang.Exception -> L2f
            com.mbridge.msdk.videocommon.d.a r1 = r1.m48336b()     // Catch: java.lang.Exception -> L2f
            boolean r2 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.Exception -> L2f
            if (r2 == 0) goto L15
            com.mbridge.msdk.videocommon.b.c r3 = m48374c()     // Catch: java.lang.Exception -> L2f
        L13:
            r0 = r3
            goto L28
        L15:
            if (r1 == 0) goto L28
            java.util.Map r2 = r1.m48346j()     // Catch: java.lang.Exception -> L2f
            if (r2 == 0) goto L28
            java.util.Map r1 = r1.m48346j()     // Catch: java.lang.Exception -> L2f
            java.lang.Object r3 = r1.get(r3)     // Catch: java.lang.Exception -> L2f
            com.mbridge.msdk.videocommon.b.c r3 = (com.mbridge.msdk.videocommon.p536b.Reward) r3     // Catch: java.lang.Exception -> L2f
            goto L13
        L28:
            if (r0 != 0) goto L33
            com.mbridge.msdk.videocommon.b.c r0 = m48374c()     // Catch: java.lang.Exception -> L2f
            goto L33
        L2f:
            r3 = move-exception
            r3.printStackTrace()
        L33:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.videocommon.p536b.Reward.m48375b(java.lang.String):com.mbridge.msdk.videocommon.b.c");
    }

    /* renamed from: a */
    public final void m48379a(String str) {
        this.f61243a = str;
    }

    /* renamed from: a */
    public final void m48380a(int i) {
        this.f61244b = i;
    }

    /* renamed from: a */
    public static Map<String, Reward> m48378a(JSONArray jSONArray) {
        if (jSONArray == null || jSONArray.length() <= 0) {
            return null;
        }
        try {
            HashMap hashMap = new HashMap();
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject optJSONObject = jSONArray.optJSONObject(i);
                hashMap.put(optJSONObject.optString("id"), new Reward(optJSONObject.optString("name"), optJSONObject.optInt("amount")));
            }
            return hashMap;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: a */
    public static Reward m48377a(JSONObject jSONObject) {
        if (jSONObject != null) {
            try {
                String optString = jSONObject.optString("name");
                int optInt = jSONObject.optInt("amount");
                jSONObject.optString("id");
                return new Reward(optString, optInt);
            } catch (Exception e) {
                e.printStackTrace();
                return null;
            }
        }
        return null;
    }
}
