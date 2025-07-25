package sg.bigo.ads.controller.p947c;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import org.json.JSONObject;
import sg.bigo.ads.api.core.InterfaceC43564h;
import sg.bigo.ads.api.core.InterfaceC43565i;
import sg.bigo.ads.api.p903a.InterfaceC43528l;

/* renamed from: sg.bigo.ads.controller.c.d */
/* loaded from: classes10.dex */
public final class C43983d extends C43981b implements InterfaceC43565i {
    @Nullable

    /* renamed from: C */
    protected InterfaceC43565i.InterfaceC43567b f115308C;
    @NonNull

    /* renamed from: D */
    protected final InterfaceC43565i.InterfaceC43566a f115309D;

    /* renamed from: E */
    private boolean f115310E;

    /* renamed from: F */
    private boolean f115311F;

    /* JADX INFO: Access modifiers changed from: protected */
    public C43983d(long j, @NonNull InterfaceC43564h interfaceC43564h, @NonNull InterfaceC43528l interfaceC43528l, @NonNull JSONObject jSONObject) {
        super(j, interfaceC43564h, interfaceC43528l, jSONObject);
        JSONObject optJSONObject = jSONObject.optJSONObject("display");
        if (optJSONObject != null) {
            this.f115308C = new C43987h(optJSONObject);
        }
        this.f115309D = new C43984e(jSONObject);
    }

    @Override // sg.bigo.ads.api.core.InterfaceC43565i
    /* renamed from: at */
    public final boolean mo4322at() {
        return mo4379a(32);
    }

    @Override // sg.bigo.ads.api.core.InterfaceC43565i
    @Nullable
    /* renamed from: au */
    public final InterfaceC43565i.InterfaceC43567b mo4321au() {
        return this.f115308C;
    }

    @Override // sg.bigo.ads.api.core.InterfaceC43565i
    @NonNull
    /* renamed from: av */
    public final InterfaceC43565i.InterfaceC43566a mo4320av() {
        return this.f115309D;
    }

    @Override // sg.bigo.ads.api.core.InterfaceC43565i
    /* renamed from: aw */
    public final void mo4319aw() {
        this.f115310E = true;
    }

    @Override // sg.bigo.ads.api.core.InterfaceC43565i
    /* renamed from: ax */
    public final boolean mo4318ax() {
        return this.f115310E;
    }

    @Override // sg.bigo.ads.api.core.InterfaceC43565i
    /* renamed from: ay */
    public final void mo4317ay() {
        this.f115311F = true;
    }

    @Override // sg.bigo.ads.api.core.InterfaceC43565i
    /* renamed from: az */
    public final boolean mo4316az() {
        return this.f115311F;
    }
}
