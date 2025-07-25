package io.bidmachine.media3.exoplayer;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;

/* loaded from: classes9.dex */
final class AudioBecomingNoisyManager {
    private final Context context;
    private final RunnableC35971a receiver;
    private boolean receiverRegistered;

    /* loaded from: classes9.dex */
    public interface EventListener {
        void onAudioBecomingNoisy();
    }

    /* renamed from: io.bidmachine.media3.exoplayer.AudioBecomingNoisyManager$a */
    /* loaded from: classes9.dex */
    private final class RunnableC35971a extends BroadcastReceiver implements Runnable {
        private final Handler eventHandler;
        private final EventListener listener;

        public RunnableC35971a(Handler handler, EventListener eventListener) {
            this.eventHandler = handler;
            this.listener = eventListener;
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if ("android.media.AUDIO_BECOMING_NOISY".equals(intent.getAction())) {
                this.eventHandler.post(this);
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            if (AudioBecomingNoisyManager.this.receiverRegistered) {
                this.listener.onAudioBecomingNoisy();
            }
        }
    }

    public AudioBecomingNoisyManager(Context context, Handler handler, EventListener eventListener) {
        this.context = context.getApplicationContext();
        this.receiver = new RunnableC35971a(handler, eventListener);
    }

    public void setEnabled(boolean z) {
        if (z && !this.receiverRegistered) {
            this.context.registerReceiver(this.receiver, new IntentFilter("android.media.AUDIO_BECOMING_NOISY"));
            this.receiverRegistered = true;
        } else if (!z && this.receiverRegistered) {
            this.context.unregisterReceiver(this.receiver);
            this.receiverRegistered = false;
        }
    }
}
