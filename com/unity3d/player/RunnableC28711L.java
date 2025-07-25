package com.unity3d.player;

/* renamed from: com.unity3d.player.L */
/* loaded from: classes7.dex */
public class RunnableC28711L implements Runnable {

    /* renamed from: a */
    private SurfaceHolder$CallbackC28712M f74548a;

    /* renamed from: b */
    private boolean f74549b = false;

    public RunnableC28711L(SurfaceHolder$CallbackC28712M surfaceHolder$CallbackC28712M, SurfaceHolder$CallbackC28712M surfaceHolder$CallbackC28712M2) {
        this.f74548a = surfaceHolder$CallbackC28712M2;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            Thread.sleep(5000L);
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
        if (!this.f74549b) {
            int i = SurfaceHolder$CallbackC28712M.f74550z;
            this.f74548a.cancelOnPrepare();
        }
    }
}
