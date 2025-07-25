package com.five_corp.p372ad.internal.movie;

import android.view.Surface;

/* renamed from: com.five_corp.ad.internal.movie.I */
/* loaded from: classes4.dex */
public final class RunnableC13849I implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ InterfaceC13852L f25878a;

    /* renamed from: b */
    public final /* synthetic */ Surface f25879b;

    public RunnableC13849I(InterfaceC13852L interfaceC13852L, Surface surface) {
        this.f25878a = interfaceC13852L;
        this.f25879b = surface;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f25878a.mo78145c();
        this.f25879b.release();
    }
}
