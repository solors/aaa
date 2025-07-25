package com.mbridge.msdk.p411c;

import com.mbridge.msdk.foundation.same.net.p447e.RequestUrlUtil;
import org.json.JSONObject;

/* renamed from: com.mbridge.msdk.c.d */
/* loaded from: classes6.dex */
public final class EventLibMonitorSetting {

    /* renamed from: f */
    private String f55255f;

    /* renamed from: g */
    private String f55256g;

    /* renamed from: h */
    private int f55257h;

    /* renamed from: a */
    private int f55250a = 1;

    /* renamed from: b */
    private int f55251b = 1;

    /* renamed from: c */
    private int f55252c = 0;

    /* renamed from: d */
    private int f55253d = 30;

    /* renamed from: e */
    private int f55254e = 0;

    /* renamed from: i */
    private int f55258i = 0;

    /* renamed from: a */
    public static EventLibMonitorSetting m53302a(String str) {
        Exception e;
        EventLibMonitorSetting eventLibMonitorSetting;
        try {
            JSONObject jSONObject = new JSONObject(str);
            eventLibMonitorSetting = new EventLibMonitorSetting();
            try {
                eventLibMonitorSetting.f55255f = jSONObject.optString("h_d", RequestUrlUtil.m52180f().f56651e);
                eventLibMonitorSetting.f55256g = jSONObject.optString("t_d", RequestUrlUtil.m52180f().f56656j);
                eventLibMonitorSetting.f55257h = jSONObject.optInt("t_p", RequestUrlUtil.m52180f().f56660n);
                eventLibMonitorSetting.f55258i = jSONObject.optInt("type", 1);
                eventLibMonitorSetting.f55253d = jSONObject.optInt("d_t", 30);
                eventLibMonitorSetting.f55252c = jSONObject.optInt("d_a", 0);
            } catch (Exception e2) {
                e = e2;
                e.printStackTrace();
                return eventLibMonitorSetting;
            }
        } catch (Exception e3) {
            e = e3;
            eventLibMonitorSetting = null;
        }
        return eventLibMonitorSetting;
    }

    /* renamed from: b */
    public final int m53301b() {
        return this.f55253d;
    }

    /* renamed from: c */
    public final String m53300c() {
        return this.f55255f;
    }

    /* renamed from: d */
    public final String m53299d() {
        return this.f55256g;
    }

    /* renamed from: e */
    public final int m53298e() {
        return this.f55257h;
    }

    /* renamed from: a */
    public final int m53303a() {
        return this.f55252c;
    }
}
