package sg.bigo.ads.common.p918h.p919a;

import org.json.JSONObject;

/* renamed from: sg.bigo.ads.common.h.a.a */
/* loaded from: classes10.dex */
public final class C43683a {

    /* renamed from: a */
    public int f114355a = 3;

    /* renamed from: b */
    public int f114356b = 20;

    /* renamed from: c */
    public int f114357c = 40;

    /* renamed from: d */
    public long f114358d = 432000000;

    public C43683a() {
        m5208c();
    }

    /* renamed from: c */
    private void m5208c() {
        this.f114355a = 3;
        this.f114356b = 20;
        this.f114357c = 40;
        this.f114358d = 432000000L;
    }

    /* renamed from: a */
    public final int m5212a() {
        int i = this.f114356b;
        if (i == 0) {
            return Integer.MAX_VALUE;
        }
        return i;
    }

    /* renamed from: b */
    public final boolean m5209b() {
        if (this.f114355a <= 0) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final void m5210a(JSONObject jSONObject) {
        if (jSONObject == null) {
            m5208c();
            return;
        }
        this.f114355a = jSONObject.optInt("download_parallel_num", 3);
        int optInt = jSONObject.optInt("num", 20);
        this.f114356b = optInt;
        this.f114357c = optInt * 2;
        long optInt2 = jSONObject.optInt("valid_period") * 1000;
        if (optInt2 == 0) {
            optInt2 = 432000000;
        }
        this.f114358d = optInt2;
    }
}
