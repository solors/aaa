package sg.bigo.ads.controller.p947c;

import androidx.annotation.NonNull;
import org.json.JSONObject;
import sg.bigo.ads.api.core.InterfaceC43550c;

/* renamed from: sg.bigo.ads.controller.c.o */
/* loaded from: classes10.dex */
public final class C43994o implements InterfaceC43550c.InterfaceC43555e {

    /* renamed from: a */
    private final String f115384a;

    /* renamed from: b */
    private final String f115385b;

    /* renamed from: c */
    private final String f115386c;

    /* renamed from: d */
    private final String f115387d;

    /* renamed from: e */
    private final String f115388e;

    /* renamed from: f */
    private final int f115389f;

    /* renamed from: g */
    private final String f115390g;

    /* renamed from: h */
    private final String f115391h;

    public C43994o(@NonNull JSONObject jSONObject) {
        this.f115384a = jSONObject.optString("imageurl");
        this.f115385b = jSONObject.optString("clickurl");
        this.f115386c = jSONObject.optString("longlegaltext");
        this.f115387d = jSONObject.optString("ad_info");
        this.f115388e = jSONObject.optString("ad_link");
        this.f115389f = jSONObject.optInt("percent");
        this.f115390g = jSONObject.optString("rec_rule");
        this.f115391h = jSONObject.optString("user_privacy");
    }

    @Override // sg.bigo.ads.api.core.InterfaceC43550c.InterfaceC43555e
    /* renamed from: a */
    public final String mo4214a() {
        return this.f115384a;
    }

    @Override // sg.bigo.ads.api.core.InterfaceC43550c.InterfaceC43555e
    /* renamed from: b */
    public final String mo4213b() {
        return this.f115385b;
    }

    @Override // sg.bigo.ads.api.core.InterfaceC43550c.InterfaceC43555e
    /* renamed from: c */
    public final String mo4212c() {
        return this.f115386c;
    }

    @Override // sg.bigo.ads.api.core.InterfaceC43550c.InterfaceC43555e
    /* renamed from: d */
    public final String mo4211d() {
        return this.f115387d;
    }

    @Override // sg.bigo.ads.api.core.InterfaceC43550c.InterfaceC43555e
    /* renamed from: e */
    public final String mo4210e() {
        return this.f115388e;
    }

    @Override // sg.bigo.ads.api.core.InterfaceC43550c.InterfaceC43555e
    /* renamed from: f */
    public final int mo4209f() {
        return this.f115389f;
    }

    @Override // sg.bigo.ads.api.core.InterfaceC43550c.InterfaceC43555e
    /* renamed from: g */
    public final String mo4208g() {
        return this.f115390g;
    }

    @Override // sg.bigo.ads.api.core.InterfaceC43550c.InterfaceC43555e
    /* renamed from: h */
    public final String mo4207h() {
        return this.f115391h;
    }
}
