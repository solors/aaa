package com.p552ot.pubsub.p561i.p563b;

import android.text.TextUtils;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.p552ot.pubsub.p555c.C26521a;
import com.p552ot.pubsub.p561i.p562a.C26559a;
import com.p552ot.pubsub.util.C26586j;
import org.json.JSONObject;

/* renamed from: com.ot.pubsub.i.b.a */
/* loaded from: classes7.dex */
public class C26561a {

    /* renamed from: h */
    private static final int f69648h = 0;

    /* renamed from: a */
    public int f69649a;

    /* renamed from: b */
    public String f69650b;

    /* renamed from: c */
    public String f69651c;

    /* renamed from: d */
    public String f69652d;

    /* renamed from: e */
    public int f69653e;

    /* renamed from: f */
    public long f69654f;

    /* renamed from: g */
    public String f69655g;

    /* renamed from: a */
    public static C26561a m41182a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        C26561a c26561a = new C26561a();
        try {
            JSONObject jSONObject = new JSONObject(str);
            c26561a.f69649a = jSONObject.optInt(C26559a.f69635d);
            String optString = jSONObject.optString("msg");
            c26561a.f69650b = optString;
            if (c26561a.f69649a == 0) {
                JSONObject optJSONObject = jSONObject.optJSONObject("data");
                if (optJSONObject != null) {
                    String optString2 = optJSONObject.optString(SDKConstants.PARAM_ACCESS_TOKEN);
                    if (!TextUtils.isEmpty(optString2)) {
                        c26561a.f69652d = C26521a.m41363c(optString2, C26521a.f69392a);
                        c26561a.f69653e = optJSONObject.optInt("expires");
                        long optLong = optJSONObject.optLong("local_time", 0L);
                        if (optLong == 0) {
                            long currentTimeMillis = System.currentTimeMillis();
                            c26561a.f69654f = currentTimeMillis;
                            optJSONObject.put("local_time", currentTimeMillis);
                        } else {
                            c26561a.f69654f = optLong;
                        }
                    }
                }
                c26561a.f69655g = jSONObject.toString();
            } else if (!TextUtils.isEmpty(optString)) {
                C26586j.m41074b("TokenBean", "token exception response :" + c26561a.f69650b);
            }
        } catch (Exception unused) {
        }
        return c26561a;
    }

    public String toString() {
        return "TokenBean{code=" + this.f69649a + ", msg='" + this.f69650b + "', data='" + this.f69651c + "', access_token='" + this.f69652d + "', expires=" + this.f69653e + ", local_time=" + this.f69654f + ", response='" + this.f69655g + "'}";
    }
}
