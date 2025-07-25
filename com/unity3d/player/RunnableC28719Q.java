package com.unity3d.player;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.unity3d.player.Q */
/* loaded from: classes7.dex */
public class RunnableC28719Q implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C28738U f74600a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC28719Q(C28738U c28738u) {
        this.f74600a = c28738u;
    }

    @Override // java.lang.Runnable
    public void run() {
        UnityPlayer unityPlayer;
        unityPlayer = this.f74600a.f74729a;
        unityPlayer.onPause();
    }
}
