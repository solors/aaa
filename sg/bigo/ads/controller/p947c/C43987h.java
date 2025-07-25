package sg.bigo.ads.controller.p947c;

import androidx.annotation.NonNull;
import com.pubmatic.sdk.nativead.POBNativeConstants;
import org.json.JSONObject;
import sg.bigo.ads.api.core.InterfaceC43565i;

/* renamed from: sg.bigo.ads.controller.c.h */
/* loaded from: classes10.dex */
public final class C43987h implements InterfaceC43565i.InterfaceC43567b {

    /* renamed from: a */
    private final int f115318a;

    /* renamed from: b */
    private final int f115319b;

    /* renamed from: c */
    private final String f115320c;

    public C43987h(@NonNull JSONObject jSONObject) {
        this.f115318a = jSONObject.optInt(POBNativeConstants.NATIVE_IMAGE_WIDTH);
        this.f115319b = jSONObject.optInt("h");
        this.f115320c = jSONObject.optString("data");
    }

    @Override // sg.bigo.ads.api.core.InterfaceC43565i.InterfaceC43567b
    /* renamed from: a */
    public final int mo4311a() {
        return this.f115318a;
    }

    @Override // sg.bigo.ads.api.core.InterfaceC43565i.InterfaceC43567b
    /* renamed from: b */
    public final int mo4310b() {
        return this.f115319b;
    }

    @Override // sg.bigo.ads.api.core.InterfaceC43565i.InterfaceC43567b
    /* renamed from: c */
    public final String mo4309c() {
        return this.f115320c;
    }
}
