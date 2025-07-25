package sg.bigo.ads.api.core;

import org.json.JSONObject;

/* renamed from: sg.bigo.ads.api.core.q */
/* loaded from: classes10.dex */
public final class C43579q {

    /* renamed from: a */
    public boolean f114128a = false;

    /* renamed from: b */
    private String f114129b = "";

    /* renamed from: c */
    private int f114130c = 0;

    /* renamed from: d */
    private int f114131d = 0;

    public C43579q() {
        m5374a();
    }

    /* renamed from: a */
    private void m5374a() {
        this.f114128a = false;
        this.f114129b = "";
        this.f114130c = 3;
        this.f114131d = 20000;
    }

    /* renamed from: b */
    public final boolean m5370b(int i) {
        if (i < this.f114130c) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final void m5371a(JSONObject jSONObject) {
        if (jSONObject == null) {
            m5374a();
            return;
        }
        this.f114128a = true;
        this.f114129b = jSONObject.optString("http_succ_code");
        this.f114130c = jSONObject.optInt("retry_cnt", 3);
        int optInt = jSONObject.optInt("retry_interval") * 1000;
        this.f114131d = optInt;
        if (optInt < 20000) {
            this.f114131d = 20000;
        }
    }

    /* renamed from: a */
    public final boolean m5373a(int i) {
        if (i >= 100) {
            return this.f114129b.contains(String.valueOf(i));
        }
        return false;
    }

    /* renamed from: a */
    public final boolean m5372a(long j, long j2) {
        return j + ((long) this.f114131d) < j2;
    }
}
