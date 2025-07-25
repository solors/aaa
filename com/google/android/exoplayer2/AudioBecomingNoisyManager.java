package com.google.android.exoplayer2;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;

/* loaded from: classes4.dex */
final class AudioBecomingNoisyManager {

    /* renamed from: a */
    private final Context f31331a;

    /* renamed from: b */
    private final AudioBecomingNoisyReceiver f31332b;

    /* renamed from: c */
    private boolean f31333c;

    /* loaded from: classes4.dex */
    private final class AudioBecomingNoisyReceiver extends BroadcastReceiver implements Runnable {

        /* renamed from: b */
        private final EventListener f31334b;

        /* renamed from: c */
        private final Handler f31335c;

        public AudioBecomingNoisyReceiver(Handler handler, EventListener eventListener) {
            this.f31335c = handler;
            this.f31334b = eventListener;
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if ("android.media.AUDIO_BECOMING_NOISY".equals(intent.getAction())) {
                this.f31335c.post(this);
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            if (AudioBecomingNoisyManager.this.f31333c) {
                this.f31334b.onAudioBecomingNoisy();
            }
        }
    }

    /* loaded from: classes4.dex */
    public interface EventListener {
        void onAudioBecomingNoisy();
    }

    public AudioBecomingNoisyManager(Context context, Handler handler, EventListener eventListener) {
        this.f31331a = context.getApplicationContext();
        this.f31332b = new AudioBecomingNoisyReceiver(handler, eventListener);
    }

    public void setEnabled(boolean z) {
        if (z && !this.f31333c) {
            this.f31331a.registerReceiver(this.f31332b, new IntentFilter("android.media.AUDIO_BECOMING_NOISY"));
            this.f31333c = true;
        } else if (!z && this.f31333c) {
            this.f31331a.unregisterReceiver(this.f31332b);
            this.f31333c = false;
        }
    }
}
