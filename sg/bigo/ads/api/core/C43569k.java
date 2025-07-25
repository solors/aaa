package sg.bigo.ads.api.core;

import androidx.annotation.NonNull;
import com.pubmatic.sdk.nativead.POBNativeConstants;
import org.json.JSONObject;
import sg.bigo.ads.api.p903a.InterfaceC43522f;

/* renamed from: sg.bigo.ads.api.core.k */
/* loaded from: classes10.dex */
public final class C43569k implements InterfaceC43522f {

    /* renamed from: a */
    private final int f114111a;

    /* renamed from: b */
    private final int f114112b;

    /* renamed from: c */
    private final String f114113c;

    /* renamed from: d */
    private final String f114114d;

    public C43569k(@NonNull JSONObject jSONObject) {
        this.f114111a = jSONObject.optInt(POBNativeConstants.NATIVE_IMAGE_WIDTH);
        this.f114112b = jSONObject.optInt("h");
        this.f114113c = jSONObject.optString("url");
        this.f114114d = jSONObject.optString("md5");
    }

    @Override // sg.bigo.ads.api.p903a.InterfaceC43522f
    /* renamed from: a */
    public final int mo5382a() {
        return this.f114111a;
    }

    @Override // sg.bigo.ads.api.p903a.InterfaceC43522f
    /* renamed from: b */
    public final int mo5381b() {
        return this.f114112b;
    }

    @Override // sg.bigo.ads.api.p903a.InterfaceC43522f
    /* renamed from: c */
    public final String mo5380c() {
        return this.f114113c;
    }
}
