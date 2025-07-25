package sg.bigo.ads.controller.p947c;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import org.json.JSONArray;
import org.json.JSONObject;
import sg.bigo.ads.api.core.InterfaceC43550c;

/* renamed from: sg.bigo.ads.controller.c.p */
/* loaded from: classes10.dex */
public final class C43995p implements InterfaceC43550c.InterfaceC43556f {

    /* renamed from: a */
    private final JSONObject f115392a;

    /* renamed from: b */
    private final int f115393b;

    /* renamed from: c */
    private final String f115394c;

    /* renamed from: d */
    private final String f115395d;

    /* renamed from: e */
    private final String f115396e;

    /* renamed from: f */
    private final int f115397f;

    /* renamed from: g */
    private final int f115398g;

    /* renamed from: h */
    private final String[] f115399h;

    /* renamed from: i */
    private final String[] f115400i;

    public C43995p(@NonNull JSONObject jSONObject) {
        this.f115392a = jSONObject;
        this.f115393b = jSONObject.optInt("type", 0);
        this.f115394c = jSONObject.optString("value", "");
        this.f115395d = jSONObject.optString("name", "");
        this.f115396e = jSONObject.optString(CommonUrlParts.UUID, "");
        this.f115397f = jSONObject.optInt("replace", 0);
        this.f115398g = jSONObject.optInt("norepeat", 0);
        JSONArray optJSONArray = jSONObject.optJSONArray("reg");
        if (optJSONArray != null) {
            this.f115399h = new String[optJSONArray.length()];
            this.f115400i = new String[optJSONArray.length()];
            for (int i = 0; i < optJSONArray.length(); i++) {
                JSONObject optJSONObject = optJSONArray.optJSONObject(i);
                if (optJSONObject != null) {
                    this.f115399h[i] = optJSONObject.optString("token", "");
                    this.f115400i[i] = optJSONObject.optString("value", "");
                }
            }
            return;
        }
        this.f115399h = new String[0];
        this.f115400i = new String[0];
    }

    @Override // sg.bigo.ads.api.core.InterfaceC43550c.InterfaceC43556f
    /* renamed from: a */
    public final JSONObject mo4206a() {
        return this.f115392a;
    }
}
