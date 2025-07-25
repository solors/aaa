package com.five_corp.p372ad.internal.movie;

import android.view.Surface;

/* renamed from: com.five_corp.ad.internal.movie.H */
/* loaded from: classes4.dex */
public final class RunnableC13848H implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ InterfaceC13852L f25876a;

    /* renamed from: b */
    public final /* synthetic */ Surface f25877b;

    public RunnableC13848H(InterfaceC13852L interfaceC13852L, Surface surface) {
        this.f25876a = interfaceC13852L;
        this.f25877b = surface;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f25876a.mo78151a(this.f25877b);
    }
}
