package com.pubmatic.sdk.video.player;

import com.pubmatic.sdk.video.player.POBMediaPlayer;

/* renamed from: com.pubmatic.sdk.video.player.e */
/* loaded from: classes7.dex */
class RunnableC26867e implements Runnable {

    /* renamed from: a */
    final /* synthetic */ POBMediaPlayer.C26837q f70988a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC26867e(POBMediaPlayer.C26837q c26837q) {
        this.f70988a = c26837q;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (POBMediaPlayer.this.f70840b != null) {
            POBMediaPlayer.this.f70840b.stop();
        }
    }
}
