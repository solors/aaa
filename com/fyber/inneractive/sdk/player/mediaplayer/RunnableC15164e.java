package com.fyber.inneractive.sdk.player.mediaplayer;

import android.view.SurfaceHolder;

/* renamed from: com.fyber.inneractive.sdk.player.mediaplayer.e */
/* loaded from: classes4.dex */
public final class RunnableC15164e implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ SurfaceHolder f29962a;

    /* renamed from: b */
    public final /* synthetic */ C15175p f29963b;

    public RunnableC15164e(C15175p c15175p, SurfaceHolder surfaceHolder) {
        this.f29963b = c15175p;
        this.f29962a = surfaceHolder;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C15175p.m77115a(this.f29963b, this.f29962a);
    }
}
