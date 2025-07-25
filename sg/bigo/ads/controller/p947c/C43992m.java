package sg.bigo.ads.controller.p947c;

import androidx.annotation.NonNull;
import org.json.JSONObject;
import sg.bigo.ads.api.core.InterfaceC43550c;

/* renamed from: sg.bigo.ads.controller.c.m */
/* loaded from: classes10.dex */
public final class C43992m implements InterfaceC43550c.InterfaceC43553c {

    /* renamed from: a */
    private final String f115372a;

    /* renamed from: b */
    private final String f115373b;

    /* renamed from: c */
    private final String f115374c;

    public C43992m(@NonNull JSONObject jSONObject) {
        this.f115372a = jSONObject.optString("vendor_url");
        this.f115373b = jSONObject.optString("vendor_key");
        this.f115374c = jSONObject.optString("params");
    }

    @Override // sg.bigo.ads.api.core.InterfaceC43550c.InterfaceC43553c
    /* renamed from: a */
    public final String mo4223a() {
        return this.f115372a;
    }

    @Override // sg.bigo.ads.api.core.InterfaceC43550c.InterfaceC43553c
    /* renamed from: b */
    public final String mo4222b() {
        return this.f115373b;
    }

    @Override // sg.bigo.ads.api.core.InterfaceC43550c.InterfaceC43553c
    /* renamed from: c */
    public final String mo4221c() {
        return this.f115374c;
    }
}
