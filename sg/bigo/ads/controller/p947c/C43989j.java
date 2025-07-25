package sg.bigo.ads.controller.p947c;

import androidx.annotation.NonNull;
import org.json.JSONObject;
import sg.bigo.ads.api.core.InterfaceC43573o;

/* renamed from: sg.bigo.ads.controller.c.j */
/* loaded from: classes10.dex */
public final class C43989j implements InterfaceC43573o.InterfaceC43575b {

    /* renamed from: a */
    private final int f115325a;

    /* renamed from: b */
    private final long f115326b;

    /* renamed from: c */
    private final int f115327c;

    /* renamed from: d */
    private final long f115328d;

    public C43989j(@NonNull JSONObject jSONObject) {
        this.f115325a = jSONObject.optInt("video_impression_area_rate", 0);
        this.f115326b = jSONObject.optLong("video_impression_time", 0L);
        this.f115327c = jSONObject.optInt("image_impression_area_rate", 0);
        this.f115328d = jSONObject.optLong("image_impression_time", 0L);
    }

    @Override // sg.bigo.ads.api.core.InterfaceC43573o.InterfaceC43575b
    /* renamed from: a */
    public final int mo4305a() {
        return this.f115325a;
    }

    @Override // sg.bigo.ads.api.core.InterfaceC43573o.InterfaceC43575b
    /* renamed from: b */
    public final long mo4304b() {
        return this.f115326b;
    }

    @Override // sg.bigo.ads.api.core.InterfaceC43573o.InterfaceC43575b
    /* renamed from: c */
    public final int mo4303c() {
        return this.f115327c;
    }

    @Override // sg.bigo.ads.api.core.InterfaceC43573o.InterfaceC43575b
    /* renamed from: d */
    public final long mo4302d() {
        return this.f115328d;
    }
}
