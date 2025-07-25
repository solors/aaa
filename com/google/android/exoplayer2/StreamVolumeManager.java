package com.google.android.exoplayer2;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioManager;
import android.os.Handler;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.Util;

/* loaded from: classes4.dex */
public final class StreamVolumeManager {

    /* renamed from: a */
    private final Context f31983a;

    /* renamed from: b */
    private final Handler f31984b;

    /* renamed from: c */
    private final Listener f31985c;

    /* renamed from: d */
    private final AudioManager f31986d;
    @Nullable

    /* renamed from: e */
    private VolumeChangeReceiver f31987e;

    /* renamed from: f */
    private int f31988f;

    /* renamed from: g */
    private int f31989g;

    /* renamed from: h */
    private boolean f31990h;

    /* loaded from: classes4.dex */
    public interface Listener {
        void onStreamTypeChanged(int i);

        void onStreamVolumeChanged(int i, boolean z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes4.dex */
    public final class VolumeChangeReceiver extends BroadcastReceiver {
        private VolumeChangeReceiver() {
            StreamVolumeManager.this = r1;
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            Handler handler = StreamVolumeManager.this.f31984b;
            final StreamVolumeManager streamVolumeManager = StreamVolumeManager.this;
            handler.post(new Runnable() { // from class: com.google.android.exoplayer2.z4
                @Override // java.lang.Runnable
                public final void run() {
                    StreamVolumeManager.m75324b(streamVolumeManager);
                }
            });
        }
    }

    public StreamVolumeManager(Context context, Handler handler, Listener listener) {
        Context applicationContext = context.getApplicationContext();
        this.f31983a = applicationContext;
        this.f31984b = handler;
        this.f31985c = listener;
        AudioManager audioManager = (AudioManager) Assertions.checkStateNotNull((AudioManager) applicationContext.getSystemService("audio"));
        this.f31986d = audioManager;
        this.f31988f = 3;
        this.f31989g = m75322d(audioManager, 3);
        this.f31990h = m75323c(audioManager, this.f31988f);
        VolumeChangeReceiver volumeChangeReceiver = new VolumeChangeReceiver();
        try {
            applicationContext.registerReceiver(volumeChangeReceiver, new IntentFilter("android.media.VOLUME_CHANGED_ACTION"));
            this.f31987e = volumeChangeReceiver;
        } catch (RuntimeException e) {
            Log.m72601w("StreamVolumeManager", "Error registering stream volume receiver", e);
        }
    }

    /* renamed from: b */
    public static /* synthetic */ void m75324b(StreamVolumeManager streamVolumeManager) {
        streamVolumeManager.m75321e();
    }

    /* renamed from: c */
    private static boolean m75323c(AudioManager audioManager, int i) {
        if (Util.SDK_INT >= 23) {
            return audioManager.isStreamMute(i);
        }
        if (m75322d(audioManager, i) == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    private static int m75322d(AudioManager audioManager, int i) {
        try {
            return audioManager.getStreamVolume(i);
        } catch (RuntimeException e) {
            Log.m72601w("StreamVolumeManager", "Could not retrieve stream volume for stream type " + i, e);
            return audioManager.getStreamMaxVolume(i);
        }
    }

    /* renamed from: e */
    public void m75321e() {
        int m75322d = m75322d(this.f31986d, this.f31988f);
        boolean m75323c = m75323c(this.f31986d, this.f31988f);
        if (this.f31989g != m75322d || this.f31990h != m75323c) {
            this.f31989g = m75322d;
            this.f31990h = m75323c;
            this.f31985c.onStreamVolumeChanged(m75322d, m75323c);
        }
    }

    public void decreaseVolume() {
        if (this.f31989g <= getMinVolume()) {
            return;
        }
        this.f31986d.adjustStreamVolume(this.f31988f, -1, 1);
        m75321e();
    }

    public int getMaxVolume() {
        return this.f31986d.getStreamMaxVolume(this.f31988f);
    }

    public int getMinVolume() {
        int streamMinVolume;
        if (Util.SDK_INT >= 28) {
            streamMinVolume = this.f31986d.getStreamMinVolume(this.f31988f);
            return streamMinVolume;
        }
        return 0;
    }

    public int getVolume() {
        return this.f31989g;
    }

    public void increaseVolume() {
        if (this.f31989g >= getMaxVolume()) {
            return;
        }
        this.f31986d.adjustStreamVolume(this.f31988f, 1, 1);
        m75321e();
    }

    public boolean isMuted() {
        return this.f31990h;
    }

    public void release() {
        VolumeChangeReceiver volumeChangeReceiver = this.f31987e;
        if (volumeChangeReceiver != null) {
            try {
                this.f31983a.unregisterReceiver(volumeChangeReceiver);
            } catch (RuntimeException e) {
                Log.m72601w("StreamVolumeManager", "Error unregistering stream volume receiver", e);
            }
            this.f31987e = null;
        }
    }

    public void setMuted(boolean z) {
        int i;
        if (Util.SDK_INT >= 23) {
            AudioManager audioManager = this.f31986d;
            int i2 = this.f31988f;
            if (z) {
                i = -100;
            } else {
                i = 100;
            }
            audioManager.adjustStreamVolume(i2, i, 1);
        } else {
            this.f31986d.setStreamMute(this.f31988f, z);
        }
        m75321e();
    }

    public void setStreamType(int i) {
        if (this.f31988f == i) {
            return;
        }
        this.f31988f = i;
        m75321e();
        this.f31985c.onStreamTypeChanged(i);
    }

    public void setVolume(int i) {
        if (i >= getMinVolume() && i <= getMaxVolume()) {
            this.f31986d.setStreamVolume(this.f31988f, i, 1);
            m75321e();
        }
    }
}
