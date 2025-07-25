package sg.bigo.ads.controller.p947c;

import androidx.annotation.NonNull;
import com.pubmatic.sdk.nativead.POBNativeConstants;
import org.json.JSONArray;
import org.json.JSONObject;
import sg.bigo.ads.api.core.InterfaceC43550c;

/* renamed from: sg.bigo.ads.controller.c.n */
/* loaded from: classes10.dex */
public final class C43993n implements InterfaceC43550c.InterfaceC43554d {

    /* renamed from: a */
    String f115375a;

    /* renamed from: b */
    String f115376b;

    /* renamed from: c */
    String f115377c;

    /* renamed from: d */
    String f115378d;

    /* renamed from: e */
    String f115379e;

    /* renamed from: f */
    String f115380f;

    /* renamed from: g */
    String[] f115381g;

    /* renamed from: h */
    String[] f115382h;

    /* renamed from: i */
    String f115383i;

    public C43993n(@NonNull JSONObject jSONObject) {
        this.f115375a = jSONObject.optString("icon");
        this.f115376b = jSONObject.optString("title");
        this.f115377c = jSONObject.optString("rate");
        this.f115378d = jSONObject.optString("comments");
        this.f115379e = jSONObject.optString("downloads");
        this.f115380f = jSONObject.optString("description");
        JSONArray optJSONArray = jSONObject.optJSONArray("genre");
        if (optJSONArray != null && optJSONArray.length() > 0) {
            this.f115381g = new String[optJSONArray.length()];
            for (int i = 0; i < optJSONArray.length(); i++) {
                this.f115381g[i] = optJSONArray.optString(i);
            }
        }
        JSONArray optJSONArray2 = jSONObject.optJSONArray(POBNativeConstants.NATIVE_IMAGE);
        if (optJSONArray2 != null && optJSONArray2.length() > 0) {
            this.f115382h = new String[optJSONArray2.length()];
            for (int i2 = 0; i2 < optJSONArray2.length(); i2++) {
                this.f115382h[i2] = optJSONArray2.optString(i2);
            }
        }
        this.f115383i = jSONObject.optString("name");
    }

    @Override // sg.bigo.ads.api.core.InterfaceC43550c.InterfaceC43554d
    /* renamed from: a */
    public final String mo4220a() {
        return this.f115375a;
    }

    @Override // sg.bigo.ads.api.core.InterfaceC43550c.InterfaceC43554d
    /* renamed from: b */
    public final String mo4219b() {
        return this.f115376b;
    }

    @Override // sg.bigo.ads.api.core.InterfaceC43550c.InterfaceC43554d
    /* renamed from: c */
    public final String mo4218c() {
        return this.f115380f;
    }

    @Override // sg.bigo.ads.api.core.InterfaceC43550c.InterfaceC43554d
    /* renamed from: d */
    public final String[] mo4217d() {
        return this.f115381g;
    }

    @Override // sg.bigo.ads.api.core.InterfaceC43550c.InterfaceC43554d
    /* renamed from: e */
    public final String[] mo4216e() {
        return this.f115382h;
    }

    @Override // sg.bigo.ads.api.core.InterfaceC43550c.InterfaceC43554d
    /* renamed from: f */
    public final String mo4215f() {
        return this.f115383i;
    }
}
