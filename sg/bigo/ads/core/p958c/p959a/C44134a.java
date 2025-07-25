package sg.bigo.ads.core.p958c.p959a;

import com.zeus.gmc.sdk.mobileads.columbus.remote.module.util.TimeUtils;
import java.util.HashMap;
import org.json.JSONArray;
import org.json.JSONObject;
import sg.bigo.ads.common.p932t.C43782a;
import sg.bigo.ads.common.utils.C43836q;

/* renamed from: sg.bigo.ads.core.c.a.a */
/* loaded from: classes10.dex */
public final class C44134a {

    /* renamed from: a */
    public int f115826a = 10;

    /* renamed from: b */
    public int f115827b = TimeUtils.FIFTEEN_MINUTES_IN_MS;

    /* renamed from: c */
    public final HashMap<String, C44135a> f115828c;

    /* renamed from: sg.bigo.ads.core.c.a.a$a */
    /* loaded from: classes10.dex */
    public static class C44135a {

        /* renamed from: a */
        String f115829a;

        /* renamed from: b */
        boolean f115830b;

        /* renamed from: c */
        public boolean f115831c;

        /* renamed from: d */
        public int f115832d;

        /* renamed from: a */
        public static C44135a m3912a(String str) {
            C44135a c44135a = new C44135a();
            c44135a.f115829a = str;
            c44135a.f115830b = true;
            c44135a.f115831c = true;
            c44135a.f115832d = 86400000;
            return c44135a;
        }

        /* renamed from: a */
        public final void m3911a(JSONObject jSONObject) {
            if (jSONObject == null) {
                C43782a.m5009a(0, "Stats", "eventConfig is null.");
                return;
            }
            this.f115829a = jSONObject.optString("event_id");
            this.f115830b = jSONObject.optInt("status") == 1;
            this.f115831c = jSONObject.optInt("delay") == 1;
            int optInt = jSONObject.optInt("expired") * 1000;
            this.f115832d = optInt;
            if (optInt == 0) {
                this.f115832d = 86400000;
            }
        }
    }

    public C44134a() {
        HashMap<String, C44135a> hashMap = new HashMap<>();
        this.f115828c = hashMap;
        m3913b();
        hashMap.put("06002002", C44135a.m3912a("06002002"));
        hashMap.put("06002007", C44135a.m3912a("06002007"));
    }

    /* renamed from: b */
    private void m3913b() {
        this.f115826a = 10;
        this.f115827b = TimeUtils.FIFTEEN_MINUTES_IN_MS;
        this.f115828c.clear();
    }

    /* renamed from: a */
    public final int m3916a() {
        return Math.round(this.f115826a * 0.8f);
    }

    /* renamed from: a */
    public final void m3914a(JSONObject jSONObject) {
        if (jSONObject == null) {
            m3913b();
            return;
        }
        this.f115826a = jSONObject.optInt("delay_num", 10);
        int optInt = jSONObject.optInt("delay_interval") * 1000;
        this.f115827b = optInt;
        if (optInt == 0) {
            this.f115827b = TimeUtils.FIFTEEN_MINUTES_IN_MS;
        }
        JSONArray optJSONArray = jSONObject.optJSONArray("event_config");
        if (optJSONArray == null || optJSONArray.length() <= 0) {
            return;
        }
        for (int i = 0; i < optJSONArray.length(); i++) {
            C44135a c44135a = new C44135a();
            c44135a.m3911a(optJSONArray.optJSONObject(i));
            if (C43836q.m4827b((CharSequence) c44135a.f115829a)) {
                this.f115828c.put(c44135a.f115829a, c44135a);
            }
        }
    }

    /* renamed from: a */
    public final boolean m3915a(String str) {
        C44135a c44135a = this.f115828c.get(str);
        if (c44135a == null) {
            return false;
        }
        return c44135a.f115830b;
    }
}
