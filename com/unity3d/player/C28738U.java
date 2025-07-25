package com.unity3d.player;

import android.app.Activity;
import android.content.Context;
import com.unity3d.player.UnityPlayer;
import java.util.concurrent.Semaphore;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: com.unity3d.player.U */
/* loaded from: classes7.dex */
public class C28738U {

    /* renamed from: a */
    private UnityPlayer f74729a;

    /* renamed from: c */
    private InterfaceC28739a f74731c;

    /* renamed from: b */
    private Context f74730b = null;

    /* renamed from: d */
    private final Semaphore f74732d = new Semaphore(0);

    /* renamed from: e */
    private final Lock f74733e = new ReentrantLock();

    /* renamed from: f */
    private SurfaceHolder$CallbackC28712M f74734f = null;

    /* renamed from: g */
    private int f74735g = 2;

    /* renamed from: h */
    private boolean f74736h = false;

    /* renamed from: i */
    private boolean f74737i = false;

    /* renamed from: com.unity3d.player.U$a */
    /* loaded from: classes7.dex */
    public interface InterfaceC28739a {
    }

    public C28738U(UnityPlayer unityPlayer) {
        this.f74729a = null;
        this.f74729a = unityPlayer;
    }

    public void runOnUiThread(Runnable runnable) {
        Context context = this.f74730b;
        if (context instanceof Activity) {
            ((Activity) context).runOnUiThread(runnable);
        } else {
            AbstractC28798u.Log(5, "Not running from an Activity; Ignoring execution request...");
        }
    }

    /* renamed from: a */
    public void m37697a() {
        SurfaceHolder$CallbackC28712M surfaceHolder$CallbackC28712M = this.f74734f;
        if (surfaceHolder$CallbackC28712M != null) {
            this.f74729a.removeViewFromPlayer(surfaceHolder$CallbackC28712M);
            this.f74737i = false;
            this.f74734f.destroyPlayer();
            this.f74734f = null;
            InterfaceC28739a interfaceC28739a = this.f74731c;
            if (interfaceC28739a != null) {
                ((UnityPlayer.C28762n) interfaceC28739a).m37643a();
            }
        }
    }

    /* renamed from: b */
    public void m37694b() {
        this.f74733e.lock();
        SurfaceHolder$CallbackC28712M surfaceHolder$CallbackC28712M = this.f74734f;
        if (surfaceHolder$CallbackC28712M != null) {
            surfaceHolder$CallbackC28712M.updateVideoLayout();
        }
        this.f74733e.unlock();
    }

    /* renamed from: c */
    public void m37692c() {
        this.f74733e.lock();
        SurfaceHolder$CallbackC28712M surfaceHolder$CallbackC28712M = this.f74734f;
        if (surfaceHolder$CallbackC28712M != null) {
            if (this.f74735g == 0) {
                surfaceHolder$CallbackC28712M.cancelOnPrepare();
            } else if (this.f74737i) {
                boolean m37722a = surfaceHolder$CallbackC28712M.m37722a();
                this.f74736h = m37722a;
                if (!m37722a) {
                    this.f74734f.pause();
                }
            }
        }
        this.f74733e.unlock();
    }

    /* renamed from: d */
    public void m37690d() {
        this.f74733e.lock();
        SurfaceHolder$CallbackC28712M surfaceHolder$CallbackC28712M = this.f74734f;
        if (surfaceHolder$CallbackC28712M != null && this.f74737i && !this.f74736h) {
            surfaceHolder$CallbackC28712M.start();
        }
        this.f74733e.unlock();
    }

    /* renamed from: a */
    public boolean m37696a(Context context, String str, int i, int i2, int i3, boolean z, long j, long j2, InterfaceC28739a interfaceC28739a) {
        this.f74733e.lock();
        this.f74731c = interfaceC28739a;
        this.f74730b = context;
        this.f74732d.drainPermits();
        this.f74735g = 2;
        runOnUiThread(new RunnableC28716P(this, str, i, i2, i3, z, j, j2));
        boolean z2 = false;
        try {
            this.f74733e.unlock();
            this.f74732d.acquire();
            this.f74733e.lock();
            if (this.f74735g != 2) {
                z2 = true;
            }
        } catch (InterruptedException unused) {
        }
        runOnUiThread(new RunnableC28719Q(this));
        runOnUiThread((!z2 || this.f74735g == 3) ? new RunnableC28737T(this) : new RunnableC28736S(this));
        this.f74733e.unlock();
        return z2;
    }
}
