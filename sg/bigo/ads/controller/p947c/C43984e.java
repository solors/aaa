package sg.bigo.ads.controller.p947c;

import androidx.annotation.NonNull;
import org.json.JSONObject;
import sg.bigo.ads.api.core.InterfaceC43565i;

/* renamed from: sg.bigo.ads.controller.c.e */
/* loaded from: classes10.dex */
public final class C43984e implements InterfaceC43565i.InterfaceC43566a {

    /* renamed from: a */
    private final boolean f115312a;

    public C43984e(@NonNull JSONObject jSONObject) {
        this.f115312a = jSONObject.optInt("banner_pre_load", 0) == 1;
    }

    @Override // sg.bigo.ads.api.core.InterfaceC43565i.InterfaceC43566a
    /* renamed from: a */
    public final boolean mo4315a() {
        return this.f115312a;
    }

    @Override // sg.bigo.ads.api.core.InterfaceC43565i.InterfaceC43566a
    @NonNull
    /* renamed from: b */
    public final String[] mo4314b() {
        return new String[0];
    }
}
