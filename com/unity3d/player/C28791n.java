package com.unity3d.player;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.util.Range;
import android.view.Surface;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.unity3d.player.n */
/* loaded from: classes7.dex */
public class C28791n extends CameraCaptureSession.StateCallback {

    /* renamed from: a */
    final /* synthetic */ C28796s f74861a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C28791n(C28796s c28796s) {
        this.f74861a = c28796s;
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public void onConfigureFailed(CameraCaptureSession cameraCaptureSession) {
        AbstractC28798u.Log(6, "Camera2: CaptureSession configuration failed.");
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public void onConfigured(CameraCaptureSession cameraCaptureSession) {
        CameraDevice cameraDevice;
        Object obj;
        StringBuilder sb2;
        CameraDevice cameraDevice2;
        CaptureRequest.Builder builder;
        Surface surface;
        CaptureRequest.Builder builder2;
        Range range;
        C28796s c28796s = this.f74861a;
        cameraDevice = c28796s.f74873b;
        if (cameraDevice != null) {
            obj = c28796s.f74890s;
            synchronized (obj) {
                C28796s c28796s2 = this.f74861a;
                c28796s2.f74889r = cameraCaptureSession;
                try {
                    cameraDevice2 = c28796s2.f74873b;
                    c28796s2.f74888q = cameraDevice2.createCaptureRequest(1);
                    C28796s c28796s3 = this.f74861a;
                    builder = c28796s3.f74888q;
                    surface = c28796s3.f74893v;
                    builder.addTarget(surface);
                    C28796s c28796s4 = this.f74861a;
                    builder2 = c28796s4.f74888q;
                    CaptureRequest.Key key = CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE;
                    range = c28796s4.f74885n;
                    builder2.set(key, range);
                    this.f74861a.m37597f();
                } catch (CameraAccessException e) {
                    sb2 = new StringBuilder();
                    sb2.append("Camera2: CameraAccessException ");
                    sb2.append(e);
                    AbstractC28798u.Log(6, sb2.toString());
                } catch (IllegalStateException e2) {
                    sb2 = new StringBuilder();
                    sb2.append("Camera2: IllegalStateException ");
                    sb2.append(e2);
                    AbstractC28798u.Log(6, sb2.toString());
                }
            }
        }
    }
}
