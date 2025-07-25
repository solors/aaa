package com.unity3d.player;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.unity3d.player.N */
/* loaded from: classes7.dex */
public class RunnableC28713N implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C28715O f74576a;

    public RunnableC28713N(C28715O c28715o) {
        this.f74576a = c28715o;
    }

    @Override // java.lang.Runnable
    public void run() {
        UnityPlayer unityPlayer;
        this.f74576a.f74581a.f74591h.m37697a();
        unityPlayer = this.f74576a.f74581a.f74591h.f74729a;
        unityPlayer.onResume();
    }
}
