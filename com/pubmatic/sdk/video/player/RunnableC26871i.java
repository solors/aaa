package com.pubmatic.sdk.video.player;

import com.pubmatic.sdk.video.player.POBMediaPlayer;

/* renamed from: com.pubmatic.sdk.video.player.i */
/* loaded from: classes7.dex */
class RunnableC26871i implements Runnable {

    /* renamed from: a */
    final /* synthetic */ POBMediaPlayer.RunnableC26843w f70992a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC26871i(POBMediaPlayer.RunnableC26843w runnableC26843w) {
        this.f70992a = runnableC26843w;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (POBMediaPlayer.this.f70839a != null) {
            POBMediaPlayer.this.f70839a.onResume();
        }
    }
}
