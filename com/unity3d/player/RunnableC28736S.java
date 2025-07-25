package com.unity3d.player;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.unity3d.player.S */
/* loaded from: classes7.dex */
public class RunnableC28736S implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C28738U f74727a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC28736S(C28738U c28738u) {
        this.f74727a = c28738u;
    }

    @Override // java.lang.Runnable
    public void run() {
        SurfaceHolder$CallbackC28712M surfaceHolder$CallbackC28712M;
        UnityPlayer unityPlayer;
        SurfaceHolder$CallbackC28712M surfaceHolder$CallbackC28712M2;
        C28738U c28738u = this.f74727a;
        surfaceHolder$CallbackC28712M = c28738u.f74734f;
        if (surfaceHolder$CallbackC28712M != null) {
            unityPlayer = c28738u.f74729a;
            unityPlayer.addViewToPlayer(surfaceHolder$CallbackC28712M, true);
            C28738U c28738u2 = this.f74727a;
            c28738u2.f74737i = true;
            surfaceHolder$CallbackC28712M2 = c28738u2.f74734f;
            surfaceHolder$CallbackC28712M2.requestFocus();
        }
    }
}
