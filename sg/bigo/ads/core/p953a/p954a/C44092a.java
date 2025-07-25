package sg.bigo.ads.core.p953a.p954a;

import com.zeus.gmc.sdk.mobileads.columbus.remote.module.util.TimeUtils;
import org.json.JSONObject;

/* renamed from: sg.bigo.ads.core.a.a.a */
/* loaded from: classes10.dex */
public final class C44092a {

    /* renamed from: a */
    public int f115728a = 10;

    /* renamed from: b */
    public int f115729b = TimeUtils.FIFTEEN_MINUTES_IN_MS;

    /* renamed from: c */
    public int f115730c = 259200000;

    public C44092a() {
        m3974b();
    }

    /* renamed from: b */
    private void m3974b() {
        this.f115728a = 10;
        this.f115729b = TimeUtils.FIFTEEN_MINUTES_IN_MS;
        this.f115730c = 259200000;
    }

    /* renamed from: a */
    public final int m3976a() {
        return Math.round(this.f115728a * 0.8f);
    }

    /* renamed from: a */
    public final void m3975a(JSONObject jSONObject) {
        if (jSONObject == null) {
            m3974b();
            return;
        }
        this.f115728a = jSONObject.optInt("num", 10);
        int optInt = jSONObject.optInt("interval") * 1000;
        this.f115729b = optInt;
        if (optInt == 0) {
            this.f115729b = TimeUtils.FIFTEEN_MINUTES_IN_MS;
        }
        this.f115730c = jSONObject.optInt("expired") * 1000;
    }
}
