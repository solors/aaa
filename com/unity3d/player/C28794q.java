package com.unity3d.player;

import android.graphics.SurfaceTexture;
import p685g8.InterfaceC33217a;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.unity3d.player.q */
/* loaded from: classes7.dex */
public class C28794q implements SurfaceTexture.OnFrameAvailableListener {

    /* renamed from: a */
    final /* synthetic */ C28796s f74864a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C28794q(C28796s c28796s) {
        this.f74864a = c28796s;
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public void onFrameAvailable(SurfaceTexture surfaceTexture) {
        InterfaceC33217a interfaceC33217a;
        interfaceC33217a = this.f74864a.f74872a;
        ((Camera2Wrapper) interfaceC33217a).m37754a(surfaceTexture);
    }
}
