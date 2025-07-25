package com.unity3d.player;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import android.view.PixelCopy;
import android.view.SurfaceHolder;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.unity3d.player.H */
/* loaded from: classes7.dex */
public class SurfaceHolder$CallbackC28705H implements SurfaceHolder.Callback {

    /* renamed from: a */
    final /* synthetic */ C28708I f74530a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public SurfaceHolder$CallbackC28705H(C28708I c28708i) {
        this.f74530a = c28708i;
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        UnityPlayer unityPlayer;
        UnityPlayer unityPlayer2;
        unityPlayer = this.f74530a.f74541b;
        unityPlayer.updateGLDisplay(0, surfaceHolder.getSurface());
        unityPlayer2 = this.f74530a.f74541b;
        unityPlayer2.sendSurfaceChangedEvent();
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceCreated(SurfaceHolder surfaceHolder) {
        UnityPlayer unityPlayer;
        C28800w c28800w;
        UnityPlayer unityPlayer2;
        unityPlayer = this.f74530a.f74541b;
        unityPlayer.updateGLDisplay(0, surfaceHolder.getSurface());
        C28708I c28708i = this.f74530a;
        c28800w = c28708i.f74542c;
        unityPlayer2 = c28708i.f74541b;
        PixelCopy$OnPixelCopyFinishedListenerC28799v pixelCopy$OnPixelCopyFinishedListenerC28799v = c28800w.f74901b;
        if (pixelCopy$OnPixelCopyFinishedListenerC28799v != null && pixelCopy$OnPixelCopyFinishedListenerC28799v.getParent() == null) {
            unityPlayer2.addView(c28800w.f74901b);
            unityPlayer2.bringChildToFront(c28800w.f74901b);
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        C28800w c28800w;
        C28775a c28775a;
        UnityPlayer unityPlayer;
        C28708I c28708i = this.f74530a;
        c28800w = c28708i.f74542c;
        c28775a = c28708i.f74540a;
        c28800w.getClass();
        if (PlatformSupport.NOUGAT_SUPPORT && c28800w.f74900a != null) {
            if (c28800w.f74901b == null) {
                c28800w.f74901b = new PixelCopy$OnPixelCopyFinishedListenerC28799v(c28800w, c28800w.f74900a);
            }
            PixelCopy$OnPixelCopyFinishedListenerC28799v pixelCopy$OnPixelCopyFinishedListenerC28799v = c28800w.f74901b;
            pixelCopy$OnPixelCopyFinishedListenerC28799v.getClass();
            Bitmap createBitmap = Bitmap.createBitmap(c28775a.getWidth(), c28775a.getHeight(), Bitmap.Config.ARGB_8888);
            pixelCopy$OnPixelCopyFinishedListenerC28799v.f74899a = createBitmap;
            PixelCopy.request(c28775a, createBitmap, pixelCopy$OnPixelCopyFinishedListenerC28799v, new Handler(Looper.getMainLooper()));
        }
        unityPlayer = this.f74530a.f74541b;
        unityPlayer.updateGLDisplay(0, null);
    }
}
