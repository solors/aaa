package com.pubmatic.sdk.video.player;

import com.pubmatic.sdk.video.player.POBMediaPlayer;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.pubmatic.sdk.video.player.g */
/* loaded from: classes7.dex */
public class RunnableC26869g implements Runnable {

    /* renamed from: a */
    final /* synthetic */ POBMediaPlayer.C26838r f70990a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC26869g(POBMediaPlayer.C26838r c26838r) {
        this.f70990a = c26838r;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (POBMediaPlayer.this.f70840b != null) {
            POBMediaPlayer pOBMediaPlayer = POBMediaPlayer.this;
            pOBMediaPlayer.f70845g = pOBMediaPlayer.f70840b.getCurrentPosition();
        }
        POBMediaPlayer.this.f70843e.post(new RunnableC26868f(this));
    }
}
