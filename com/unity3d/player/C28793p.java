package com.unity3d.player;

import android.media.Image;
import android.media.ImageReader;
import java.util.concurrent.Semaphore;
import p685g8.InterfaceC33217a;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.unity3d.player.p */
/* loaded from: classes7.dex */
public class C28793p implements ImageReader.OnImageAvailableListener {

    /* renamed from: a */
    final /* synthetic */ C28796s f74863a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C28793p(C28796s c28796s) {
        this.f74863a = c28796s;
    }

    @Override // android.media.ImageReader.OnImageAvailableListener
    public void onImageAvailable(ImageReader imageReader) {
        Semaphore semaphore;
        Semaphore semaphore2;
        Image image;
        InterfaceC33217a interfaceC33217a;
        semaphore = C28796s.f74870D;
        if (semaphore.tryAcquire()) {
            Image acquireNextImage = imageReader.acquireNextImage();
            if (acquireNextImage != null) {
                Image.Plane[] planes = acquireNextImage.getPlanes();
                if (acquireNextImage.getFormat() == 35 && planes != null && planes.length == 3) {
                    interfaceC33217a = this.f74863a.f74872a;
                    ((Camera2Wrapper) interfaceC33217a).m37753a(planes[0].getBuffer(), planes[1].getBuffer(), planes[2].getBuffer(), planes[0].getRowStride(), planes[1].getRowStride(), planes[1].getPixelStride());
                } else {
                    AbstractC28798u.Log(6, "Camera2: Wrong image format.");
                }
                image = this.f74863a.f74887p;
                if (image != null) {
                    image.close();
                }
                this.f74863a.f74887p = acquireNextImage;
            }
            semaphore2 = C28796s.f74870D;
            semaphore2.release();
        }
    }
}
