package com.bykv.p135vk.openvk.p136bg.p137bg.p149bg.ldr;

import android.view.SurfaceHolder;
import java.lang.ref.WeakReference;

/* renamed from: com.bykv.vk.openvk.bg.bg.bg.ldr.ldr */
/* loaded from: classes3.dex */
public class SurfaceHolder$CallbackC6515ldr implements SurfaceHolder.Callback {

    /* renamed from: bg */
    private final WeakReference<SurfaceHolder.Callback> f13592bg;

    public SurfaceHolder$CallbackC6515ldr(SurfaceHolder.Callback callback) {
        this.f13592bg = new WeakReference<>(callback);
    }

    /* renamed from: bg */
    public SurfaceHolder.Callback m91672bg() {
        return this.f13592bg.get();
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        SurfaceHolder.Callback callback = this.f13592bg.get();
        if (callback != null) {
            callback.surfaceChanged(surfaceHolder, i, i2, i3);
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceCreated(SurfaceHolder surfaceHolder) {
        SurfaceHolder.Callback callback = this.f13592bg.get();
        if (callback != null) {
            callback.surfaceCreated(surfaceHolder);
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        SurfaceHolder.Callback callback = this.f13592bg.get();
        if (callback != null) {
            callback.surfaceDestroyed(surfaceHolder);
        }
    }
}
