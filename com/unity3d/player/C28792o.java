package com.unity3d.player;

import android.hardware.camera2.CameraDevice;
import java.util.concurrent.Semaphore;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.unity3d.player.o */
/* loaded from: classes7.dex */
public class C28792o extends CameraDevice.StateCallback {

    /* renamed from: a */
    final /* synthetic */ C28796s f74862a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C28792o(C28796s c28796s) {
        this.f74862a = c28796s;
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public void onClosed(CameraDevice cameraDevice) {
        Semaphore semaphore;
        semaphore = C28796s.f74870D;
        semaphore.release();
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public void onDisconnected(CameraDevice cameraDevice) {
        Semaphore semaphore;
        AbstractC28798u.Log(5, "Camera2: CameraDevice disconnected.");
        this.f74862a.m37614a(cameraDevice);
        semaphore = C28796s.f74870D;
        semaphore.release();
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public void onError(CameraDevice cameraDevice, int i) {
        Semaphore semaphore;
        AbstractC28798u.Log(6, "Camera2: Error opeining CameraDevice " + i);
        this.f74862a.m37614a(cameraDevice);
        semaphore = C28796s.f74870D;
        semaphore.release();
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public void onOpened(CameraDevice cameraDevice) {
        Semaphore semaphore;
        this.f74862a.f74873b = cameraDevice;
        semaphore = C28796s.f74870D;
        semaphore.release();
    }
}
