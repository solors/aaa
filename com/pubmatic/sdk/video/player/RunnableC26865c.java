package com.pubmatic.sdk.video.player;

import com.pubmatic.sdk.video.player.POBMediaPlayer;

/* renamed from: com.pubmatic.sdk.video.player.c */
/* loaded from: classes7.dex */
class RunnableC26865c implements Runnable {

    /* renamed from: a */
    final /* synthetic */ POBMediaPlayer.RunnableC26822b f70986a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC26865c(POBMediaPlayer.RunnableC26822b runnableC26822b) {
        this.f70986a = runnableC26822b;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (POBMediaPlayer.this.f70839a != null) {
            POBMediaPlayer.this.f70839a.onStop();
        }
    }
}
