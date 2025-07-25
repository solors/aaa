package sg.bigo.ads.controller.p947c;

import androidx.annotation.NonNull;
import com.pubmatic.sdk.nativead.POBNativeConstants;
import org.json.JSONObject;
import sg.bigo.ads.api.core.InterfaceC43573o;

/* renamed from: sg.bigo.ads.controller.c.q */
/* loaded from: classes10.dex */
public final class C43996q implements InterfaceC43573o.InterfaceC43576c {

    /* renamed from: a */
    private final int f115401a;

    /* renamed from: b */
    private final int f115402b;

    /* renamed from: c */
    private final String f115403c;

    public C43996q(@NonNull JSONObject jSONObject) {
        this.f115401a = jSONObject.optInt(POBNativeConstants.NATIVE_IMAGE_WIDTH);
        this.f115402b = jSONObject.optInt("h");
        this.f115403c = jSONObject.optString("data");
    }

    @Override // sg.bigo.ads.api.core.InterfaceC43573o.InterfaceC43576c
    /* renamed from: a */
    public final int mo4205a() {
        return this.f115401a;
    }

    @Override // sg.bigo.ads.api.core.InterfaceC43573o.InterfaceC43576c
    /* renamed from: b */
    public final int mo4204b() {
        return this.f115402b;
    }

    @Override // sg.bigo.ads.api.core.InterfaceC43573o.InterfaceC43576c
    /* renamed from: c */
    public final String mo4203c() {
        return this.f115403c;
    }
}
