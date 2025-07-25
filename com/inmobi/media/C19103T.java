package com.inmobi.media;

/* renamed from: com.inmobi.media.T */
/* loaded from: classes6.dex */
public final class C19103T implements InterfaceC19442r9 {

    /* renamed from: a */
    public final /* synthetic */ C19142W f47796a;

    /* renamed from: b */
    public final /* synthetic */ boolean f47797b;

    public C19103T(C19142W c19142w, boolean z) {
        this.f47796a = c19142w;
        this.f47797b = z;
    }

    @Override // com.inmobi.media.InterfaceC19442r9
    /* renamed from: a */
    public final void mo59916a(Object obj) {
        ((Boolean) obj).getClass();
        this.f47796a.m60616a("result pushed to queue");
        if (this.f47797b) {
            C19142W c19142w = this.f47796a;
            c19142w.m60616a("session end - cleanup");
            c19142w.f47878g = null;
            c19142w.f47877f.clear();
            c19142w.f47874c.set(false);
            c19142w.f47875d.set(false);
        }
    }

    @Override // com.inmobi.media.InterfaceC19442r9
    public final void onError(Exception exc) {
        this.f47796a.m60617a(exc, "error in pushing to queue");
    }
}
