package com.mbridge.msdk.p411c;

import com.mbridge.msdk.foundation.same.net.p447e.RequestUrlUtil;
import org.json.JSONObject;

/* renamed from: com.mbridge.msdk.c.a */
/* loaded from: classes6.dex */
public final class BCP {

    /* renamed from: e */
    private String f55071e;

    /* renamed from: f */
    private String f55072f;

    /* renamed from: g */
    private int f55073g;

    /* renamed from: a */
    private int f55067a = 1;

    /* renamed from: b */
    private int f55068b = 0;

    /* renamed from: c */
    private int f55069c = 0;

    /* renamed from: d */
    private int f55070d = 0;

    /* renamed from: h */
    private int f55074h = 0;

    /* renamed from: a */
    public static BCP m53516a(String str) {
        Exception e;
        BCP bcp;
        try {
            JSONObject jSONObject = new JSONObject(str);
            bcp = new BCP();
            try {
                bcp.f55071e = jSONObject.optString("http_domain", RequestUrlUtil.m52180f().f56653g);
                bcp.f55072f = jSONObject.optString("tcp_domain", RequestUrlUtil.m52180f().f56657k);
                bcp.f55073g = jSONObject.optInt("tcp_port", RequestUrlUtil.m52180f().f56661o);
                bcp.f55074h = jSONObject.optInt("type", 0);
                int i = 1;
                int optInt = jSONObject.optInt("batch_size", 1);
                if (optInt >= 1) {
                    i = optInt;
                }
                bcp.f55067a = i;
                bcp.f55069c = jSONObject.optInt("duration", 0);
                bcp.f55068b = jSONObject.optInt("disable", 0);
                bcp.f55070d = jSONObject.optInt("e_t_l", 0);
            } catch (Exception e2) {
                e = e2;
                e.printStackTrace();
                return bcp;
            }
        } catch (Exception e3) {
            e = e3;
            bcp = null;
        }
        return bcp;
    }

    /* renamed from: b */
    public final int m53515b() {
        return this.f55068b;
    }

    /* renamed from: c */
    public final int m53514c() {
        return this.f55069c;
    }

    /* renamed from: d */
    public final int m53513d() {
        return this.f55070d;
    }

    /* renamed from: e */
    public final String m53512e() {
        return this.f55071e;
    }

    /* renamed from: f */
    public final String m53511f() {
        return this.f55072f;
    }

    /* renamed from: g */
    public final int m53510g() {
        return this.f55073g;
    }

    /* renamed from: h */
    public final int m53509h() {
        return this.f55074h;
    }

    /* renamed from: a */
    public final int m53517a() {
        return this.f55067a;
    }
}
