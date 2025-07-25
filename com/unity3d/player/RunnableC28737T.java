package com.unity3d.player;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.unity3d.player.T */
/* loaded from: classes7.dex */
public class RunnableC28737T implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C28738U f74728a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC28737T(C28738U c28738u) {
        this.f74728a = c28738u;
    }

    @Override // java.lang.Runnable
    public void run() {
        UnityPlayer unityPlayer;
        this.f74728a.m37697a();
        unityPlayer = this.f74728a.f74729a;
        unityPlayer.onResume();
    }
}
