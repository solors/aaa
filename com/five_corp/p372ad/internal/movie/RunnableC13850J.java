package com.five_corp.p372ad.internal.movie;

import android.view.Surface;

/* renamed from: com.five_corp.ad.internal.movie.J */
/* loaded from: classes4.dex */
public final class RunnableC13850J implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ InterfaceC13852L f25880a;

    /* renamed from: b */
    public final /* synthetic */ Surface f25881b;

    public RunnableC13850J(InterfaceC13852L interfaceC13852L, Surface surface) {
        this.f25880a = interfaceC13852L;
        this.f25881b = surface;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f25880a.mo78151a(this.f25881b);
    }
}
