package com.fyber.inneractive.sdk.player.mediaplayer;

import android.media.AudioManager;
import com.fyber.inneractive.sdk.util.IAlog;

/* renamed from: com.fyber.inneractive.sdk.player.mediaplayer.m */
/* loaded from: classes4.dex */
public final class RunnableC15172m implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C15175p f29973a;

    public RunnableC15172m(C15175p c15175p) {
        this.f29973a = c15175p;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C15175p c15175p = this.f29973a;
        String m77112b = c15175p.m77112b();
        long currentTimeMillis = System.currentTimeMillis();
        AudioManager audioManager = (AudioManager) c15175p.f29974a.getSystemService("audio");
        int streamVolume = audioManager.getStreamVolume(3);
        int streamMaxVolume = audioManager.getStreamMaxVolume(3);
        float f = streamVolume / streamMaxVolume;
        IAlog.m76529a("%s unmute maxVolume = %d currentVolume = %d targetVolume = %s", c15175p.m77112b(), Integer.valueOf(streamMaxVolume), Integer.valueOf(streamVolume), Float.valueOf(f));
        if (f == 0.0f) {
            f = 0.1f;
        }
        c15175p.setVolume(f, f);
        IAlog.m76525e(m77112b + "timelog: unmute took " + (System.currentTimeMillis() - currentTimeMillis) + " msec", new Object[0]);
    }
}
