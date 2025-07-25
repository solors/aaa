package com.unity3d.player;

import android.content.Context;
import android.graphics.Rect;
import android.view.Surface;
import p685g8.InterfaceC33217a;

/* loaded from: classes7.dex */
public class Camera2Wrapper implements InterfaceC33217a {

    /* renamed from: a */
    private Context f74523a;

    /* renamed from: b */
    private C28796s f74524b = null;

    public Camera2Wrapper(Context context) {
        this.f74523a = context;
        initCamera2Jni();
    }

    private final native void deinitCamera2Jni();

    private final native void initCamera2Jni();

    private final native void nativeFrameReady(Object obj, Object obj2, Object obj3, int i, int i2, int i3);

    private final native void nativeSurfaceTextureReady(Object obj);

    /* renamed from: a */
    public void m37755a() {
        deinitCamera2Jni();
        closeCamera2();
    }

    protected void closeCamera2() {
        C28796s c28796s = this.f74524b;
        if (c28796s != null) {
            c28796s.m37620a();
        }
        this.f74524b = null;
    }

    protected int getCamera2Count() {
        return C28796s.m37618a(this.f74523a);
    }

    protected int getCamera2FocalLengthEquivalent(int i) {
        return C28796s.m37617a(this.f74523a, i);
    }

    protected int[] getCamera2Resolutions(int i) {
        return C28796s.m37609b(this.f74523a, i);
    }

    protected int getCamera2SensorOrientation(int i) {
        return C28796s.m37605c(this.f74523a, i);
    }

    protected Rect getFrameSizeCamera2() {
        C28796s c28796s = this.f74524b;
        if (c28796s != null) {
            return c28796s.m37611b();
        }
        return new Rect();
    }

    protected boolean initializeCamera2(int i, int i2, int i3, int i4, int i5, Surface surface) {
        if (this.f74524b == null && UnityPlayer.currentActivity != null) {
            C28796s c28796s = new C28796s(this);
            this.f74524b = c28796s;
            return c28796s.m37616a(this.f74523a, i, i2, i3, i4, i5, surface);
        }
        return false;
    }

    protected boolean isCamera2AutoFocusPointSupported(int i) {
        return C28796s.m37602d(this.f74523a, i);
    }

    protected boolean isCamera2FrontFacing(int i) {
        return C28796s.m37599e(this.f74523a, i);
    }

    protected void pauseCamera2() {
        C28796s c28796s = this.f74524b;
        if (c28796s != null) {
            c28796s.m37607c();
        }
    }

    protected boolean setAutoFocusPoint(float f, float f2) {
        C28796s c28796s = this.f74524b;
        if (c28796s != null) {
            return c28796s.m37619a(f, f2);
        }
        return false;
    }

    protected void startCamera2() {
        C28796s c28796s = this.f74524b;
        if (c28796s != null) {
            c28796s.m37595g();
        }
    }

    protected void stopCamera2() {
        C28796s c28796s = this.f74524b;
        if (c28796s != null) {
            c28796s.m37593h();
        }
    }

    /* renamed from: a */
    public void m37754a(Object obj) {
        nativeSurfaceTextureReady(obj);
    }

    /* renamed from: a */
    public void m37753a(Object obj, Object obj2, Object obj3, int i, int i2, int i3) {
        nativeFrameReady(obj, obj2, obj3, i, i2, i3);
    }
}
