package com.unity3d.player;

import android.content.Context;
import java.util.concurrent.Semaphore;

/* renamed from: com.unity3d.player.P */
/* loaded from: classes7.dex */
public class RunnableC28716P implements Runnable {

    /* renamed from: a */
    final /* synthetic */ String f74584a;

    /* renamed from: b */
    final /* synthetic */ int f74585b;

    /* renamed from: c */
    final /* synthetic */ int f74586c;

    /* renamed from: d */
    final /* synthetic */ int f74587d;

    /* renamed from: e */
    final /* synthetic */ boolean f74588e;

    /* renamed from: f */
    final /* synthetic */ long f74589f;

    /* renamed from: g */
    final /* synthetic */ long f74590g;

    /* renamed from: h */
    final /* synthetic */ C28738U f74591h;

    public RunnableC28716P(C28738U c28738u, String str, int i, int i2, int i3, boolean z, long j, long j2) {
        this.f74591h = c28738u;
        this.f74584a = str;
        this.f74585b = i;
        this.f74586c = i2;
        this.f74587d = i3;
        this.f74588e = z;
        this.f74589f = j;
        this.f74590g = j2;
    }

    @Override // java.lang.Runnable
    public void run() {
        SurfaceHolder$CallbackC28712M surfaceHolder$CallbackC28712M;
        Context context;
        SurfaceHolder$CallbackC28712M surfaceHolder$CallbackC28712M2;
        UnityPlayer unityPlayer;
        UnityPlayer unityPlayer2;
        SurfaceHolder$CallbackC28712M surfaceHolder$CallbackC28712M3;
        Semaphore semaphore;
        C28738U c28738u = this.f74591h;
        surfaceHolder$CallbackC28712M = c28738u.f74734f;
        if (surfaceHolder$CallbackC28712M == null) {
            context = this.f74591h.f74730b;
            c28738u.f74734f = new SurfaceHolder$CallbackC28712M(context, this.f74584a, this.f74585b, this.f74586c, this.f74587d, this.f74588e, this.f74589f, this.f74590g, new C28715O(this));
            C28738U c28738u2 = this.f74591h;
            surfaceHolder$CallbackC28712M2 = c28738u2.f74734f;
            if (surfaceHolder$CallbackC28712M2 != null) {
                unityPlayer = c28738u2.f74729a;
                unityPlayer.bringToFront();
                C28738U c28738u3 = this.f74591h;
                unityPlayer2 = c28738u3.f74729a;
                surfaceHolder$CallbackC28712M3 = c28738u3.f74734f;
                unityPlayer2.addView(surfaceHolder$CallbackC28712M3);
                return;
            }
            return;
        }
        AbstractC28798u.Log(5, "Video already playing");
        C28738U c28738u4 = this.f74591h;
        c28738u4.f74735g = 2;
        semaphore = c28738u4.f74732d;
        semaphore.release();
    }
}
