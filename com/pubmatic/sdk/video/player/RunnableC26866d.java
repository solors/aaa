package com.pubmatic.sdk.video.player;

import com.pubmatic.sdk.video.player.POBMediaPlayer;

/* renamed from: com.pubmatic.sdk.video.player.d */
/* loaded from: classes7.dex */
class RunnableC26866d implements Runnable {

    /* renamed from: a */
    final /* synthetic */ POBMediaPlayer.C26837q f70987a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC26866d(POBMediaPlayer.C26837q c26837q) {
        this.f70987a = c26837q;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (POBMediaPlayer.this.f70839a != null) {
            POBMediaPlayer.this.f70839a.onFailure(POBPlayer.MEDIA_DISPLAY_ERROR, "MEDIA_DISPLAY_ERROR");
        }
    }
}
