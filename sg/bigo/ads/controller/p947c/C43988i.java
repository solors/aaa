package sg.bigo.ads.controller.p947c;

import androidx.annotation.NonNull;
import com.pubmatic.sdk.nativead.POBNativeConstants;
import org.json.JSONObject;
import sg.bigo.ads.api.core.InterfaceC43573o;

/* renamed from: sg.bigo.ads.controller.c.i */
/* loaded from: classes10.dex */
public final class C43988i implements InterfaceC43573o.InterfaceC43574a {

    /* renamed from: a */
    private final int f115321a;

    /* renamed from: b */
    private final int f115322b;

    /* renamed from: c */
    private final String f115323c;

    /* renamed from: d */
    private final String f115324d;

    public C43988i(@NonNull JSONObject jSONObject) {
        this.f115321a = jSONObject.optInt(POBNativeConstants.NATIVE_IMAGE_WIDTH);
        this.f115322b = jSONObject.optInt("h");
        this.f115323c = jSONObject.optString("url");
        this.f115324d = jSONObject.optString("md5");
    }

    @Override // sg.bigo.ads.api.core.InterfaceC43573o.InterfaceC43574a
    /* renamed from: a */
    public final int mo4308a() {
        return this.f115321a;
    }

    @Override // sg.bigo.ads.api.core.InterfaceC43573o.InterfaceC43574a
    /* renamed from: b */
    public final int mo4307b() {
        return this.f115322b;
    }

    @Override // sg.bigo.ads.api.core.InterfaceC43573o.InterfaceC43574a
    /* renamed from: c */
    public final String mo4306c() {
        return this.f115323c;
    }
}
