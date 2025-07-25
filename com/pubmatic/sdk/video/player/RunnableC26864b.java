package com.pubmatic.sdk.video.player;

import com.pubmatic.sdk.video.player.POBMediaPlayer;

/* renamed from: com.pubmatic.sdk.video.player.b */
/* loaded from: classes7.dex */
class RunnableC26864b implements Runnable {

    /* renamed from: a */
    final /* synthetic */ POBMediaPlayer.RunnableC26821a f70985a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC26864b(POBMediaPlayer.RunnableC26821a runnableC26821a) {
        this.f70985a = runnableC26821a;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (POBMediaPlayer.this.f70839a != null) {
            POBMediaPlayer.this.f70839a.onPause();
        }
    }
}
