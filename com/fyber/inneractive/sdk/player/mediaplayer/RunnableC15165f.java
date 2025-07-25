package com.fyber.inneractive.sdk.player.mediaplayer;

import android.view.Surface;

/* renamed from: com.fyber.inneractive.sdk.player.mediaplayer.f */
/* loaded from: classes4.dex */
public final class RunnableC15165f implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ Surface f29964a;

    /* renamed from: b */
    public final /* synthetic */ C15175p f29965b;

    public RunnableC15165f(C15175p c15175p, Surface surface) {
        this.f29965b = c15175p;
        this.f29964a = surface;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C15175p.m77116a(this.f29965b, this.f29964a);
    }
}
