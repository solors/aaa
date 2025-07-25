package com.five_corp.p372ad.internal.movie;

import android.graphics.SurfaceTexture;
import android.view.Surface;

/* renamed from: com.five_corp.ad.internal.movie.K */
/* loaded from: classes4.dex */
public final class RunnableC13851K implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ InterfaceC13852L f25882a;

    /* renamed from: b */
    public final /* synthetic */ Surface f25883b;

    /* renamed from: c */
    public final /* synthetic */ SurfaceTexture f25884c;

    public RunnableC13851K(InterfaceC13852L interfaceC13852L, Surface surface, SurfaceTexture surfaceTexture) {
        this.f25882a = interfaceC13852L;
        this.f25883b = surface;
        this.f25884c = surfaceTexture;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f25882a.mo78145c();
        this.f25883b.release();
        this.f25884c.release();
    }
}
