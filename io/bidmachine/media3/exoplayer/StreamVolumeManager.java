package io.bidmachine.media3.exoplayer;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioManager;
import android.os.Handler;
import androidx.annotation.Nullable;
import io.bidmachine.media3.common.util.Assertions;
import io.bidmachine.media3.common.util.Log;
import io.bidmachine.media3.common.util.Util;

/* loaded from: classes9.dex */
public final class StreamVolumeManager {
    private static final String TAG = "StreamVolumeManager";
    private static final String VOLUME_CHANGED_ACTION = "android.media.VOLUME_CHANGED_ACTION";
    private final Context applicationContext;
    private final AudioManager audioManager;
    private final Handler eventHandler;
    private final Listener listener;
    private boolean muted;
    @Nullable
    private C35996b receiver;
    private int streamType;
    private int volume;

    /* loaded from: classes9.dex */
    public interface Listener {
        void onStreamTypeChanged(int i);

        void onStreamVolumeChanged(int i, boolean z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: io.bidmachine.media3.exoplayer.StreamVolumeManager$b */
    /* loaded from: classes9.dex */
    public final class C35996b extends BroadcastReceiver {
        private C35996b() {
            StreamVolumeManager.this = r1;
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            Handler handler = StreamVolumeManager.this.eventHandler;
            final StreamVolumeManager streamVolumeManager = StreamVolumeManager.this;
            handler.post(new Runnable() { // from class: io.bidmachine.media3.exoplayer.i2
                @Override // java.lang.Runnable
                public final void run() {
                    StreamVolumeManager.access$200(streamVolumeManager);
                }
            });
        }
    }

    public StreamVolumeManager(Context context, Handler handler, Listener listener) {
        Context applicationContext = context.getApplicationContext();
        this.applicationContext = applicationContext;
        this.eventHandler = handler;
        this.listener = listener;
        AudioManager audioManager = (AudioManager) Assertions.checkStateNotNull((AudioManager) applicationContext.getSystemService("audio"));
        this.audioManager = audioManager;
        this.streamType = 3;
        this.volume = getVolumeFromManager(audioManager, 3);
        this.muted = getMutedFromManager(audioManager, this.streamType);
        C35996b c35996b = new C35996b();
        try {
            applicationContext.registerReceiver(c35996b, new IntentFilter(VOLUME_CHANGED_ACTION));
            this.receiver = c35996b;
        } catch (RuntimeException e) {
            Log.m19944w(TAG, "Error registering stream volume receiver", e);
        }
    }

    public static /* synthetic */ void access$200(StreamVolumeManager streamVolumeManager) {
        streamVolumeManager.updateVolumeAndNotifyIfChanged();
    }

    private static boolean getMutedFromManager(AudioManager audioManager, int i) {
        if (Util.SDK_INT >= 23) {
            return audioManager.isStreamMute(i);
        }
        if (getVolumeFromManager(audioManager, i) == 0) {
            return true;
        }
        return false;
    }

    private static int getVolumeFromManager(AudioManager audioManager, int i) {
        try {
            return audioManager.getStreamVolume(i);
        } catch (RuntimeException e) {
            Log.m19944w(TAG, "Could not retrieve stream volume for stream type " + i, e);
            return audioManager.getStreamMaxVolume(i);
        }
    }

    public void updateVolumeAndNotifyIfChanged() {
        int volumeFromManager = getVolumeFromManager(this.audioManager, this.streamType);
        boolean mutedFromManager = getMutedFromManager(this.audioManager, this.streamType);
        if (this.volume != volumeFromManager || this.muted != mutedFromManager) {
            this.volume = volumeFromManager;
            this.muted = mutedFromManager;
            this.listener.onStreamVolumeChanged(volumeFromManager, mutedFromManager);
        }
    }

    public void decreaseVolume(int i) {
        if (this.volume <= getMinVolume()) {
            return;
        }
        this.audioManager.adjustStreamVolume(this.streamType, -1, i);
        updateVolumeAndNotifyIfChanged();
    }

    public int getMaxVolume() {
        return this.audioManager.getStreamMaxVolume(this.streamType);
    }

    public int getMinVolume() {
        int streamMinVolume;
        if (Util.SDK_INT >= 28) {
            streamMinVolume = this.audioManager.getStreamMinVolume(this.streamType);
            return streamMinVolume;
        }
        return 0;
    }

    public int getVolume() {
        return this.volume;
    }

    public void increaseVolume(int i) {
        if (this.volume >= getMaxVolume()) {
            return;
        }
        this.audioManager.adjustStreamVolume(this.streamType, 1, i);
        updateVolumeAndNotifyIfChanged();
    }

    public boolean isMuted() {
        return this.muted;
    }

    public void release() {
        C35996b c35996b = this.receiver;
        if (c35996b != null) {
            try {
                this.applicationContext.unregisterReceiver(c35996b);
            } catch (RuntimeException e) {
                Log.m19944w(TAG, "Error unregistering stream volume receiver", e);
            }
            this.receiver = null;
        }
    }

    public void setMuted(boolean z, int i) {
        int i2;
        if (Util.SDK_INT >= 23) {
            AudioManager audioManager = this.audioManager;
            int i3 = this.streamType;
            if (z) {
                i2 = -100;
            } else {
                i2 = 100;
            }
            audioManager.adjustStreamVolume(i3, i2, i);
        } else {
            this.audioManager.setStreamMute(this.streamType, z);
        }
        updateVolumeAndNotifyIfChanged();
    }

    public void setStreamType(int i) {
        if (this.streamType == i) {
            return;
        }
        this.streamType = i;
        updateVolumeAndNotifyIfChanged();
        this.listener.onStreamTypeChanged(i);
    }

    public void setVolume(int i, int i2) {
        if (i >= getMinVolume() && i <= getMaxVolume()) {
            this.audioManager.setStreamVolume(this.streamType, i, i2);
            updateVolumeAndNotifyIfChanged();
        }
    }
}
