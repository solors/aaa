package com.pubmatic.sdk.video.player;

import com.pubmatic.sdk.video.player.POBPlayer;

/* renamed from: com.pubmatic.sdk.video.player.f */
/* loaded from: classes7.dex */
class RunnableC26868f implements Runnable {

    /* renamed from: a */
    final /* synthetic */ RunnableC26869g f70989a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC26868f(RunnableC26869g runnableC26869g) {
        this.f70989a = runnableC26869g;
    }

    @Override // java.lang.Runnable
    public void run() {
        int i;
        if (POBMediaPlayer.this.f70839a != null) {
            POBPlayer.POBPlayerListener pOBPlayerListener = POBMediaPlayer.this.f70839a;
            i = POBMediaPlayer.this.f70845g;
            pOBPlayerListener.onProgressUpdate(i);
        }
    }
}
