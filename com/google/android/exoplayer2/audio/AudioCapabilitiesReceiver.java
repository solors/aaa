package com.google.android.exoplayer2.audio;

import android.content.BroadcastReceiver;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Util;

/* loaded from: classes4.dex */
public final class AudioCapabilitiesReceiver {

    /* renamed from: a */
    private final Context f32356a;

    /* renamed from: b */
    private final Listener f32357b;

    /* renamed from: c */
    private final Handler f32358c;
    @Nullable

    /* renamed from: d */
    private final BroadcastReceiver f32359d;
    @Nullable

    /* renamed from: e */
    private final ExternalSurroundSoundSettingObserver f32360e;
    @Nullable

    /* renamed from: f */
    AudioCapabilities f32361f;

    /* renamed from: g */
    private boolean f32362g;

    /* loaded from: classes4.dex */
    private final class ExternalSurroundSoundSettingObserver extends ContentObserver {

        /* renamed from: a */
        private final ContentResolver f32363a;

        /* renamed from: b */
        private final Uri f32364b;

        public ExternalSurroundSoundSettingObserver(Handler handler, ContentResolver contentResolver, Uri uri) {
            super(handler);
            this.f32363a = contentResolver;
            this.f32364b = uri;
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean z) {
            AudioCapabilitiesReceiver audioCapabilitiesReceiver = AudioCapabilitiesReceiver.this;
            audioCapabilitiesReceiver.m75078c(AudioCapabilities.getCapabilities(audioCapabilitiesReceiver.f32356a));
        }

        public void register() {
            this.f32363a.registerContentObserver(this.f32364b, false, this);
        }

        public void unregister() {
            this.f32363a.unregisterContentObserver(this);
        }
    }

    /* loaded from: classes4.dex */
    private final class HdmiAudioPlugBroadcastReceiver extends BroadcastReceiver {
        private HdmiAudioPlugBroadcastReceiver() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (!isInitialStickyBroadcast()) {
                AudioCapabilitiesReceiver.this.m75078c(AudioCapabilities.m75084c(context, intent));
            }
        }
    }

    /* loaded from: classes4.dex */
    public interface Listener {
        void onAudioCapabilitiesChanged(AudioCapabilities audioCapabilities);
    }

    public AudioCapabilitiesReceiver(Context context, Listener listener) {
        HdmiAudioPlugBroadcastReceiver hdmiAudioPlugBroadcastReceiver;
        Context applicationContext = context.getApplicationContext();
        this.f32356a = applicationContext;
        this.f32357b = (Listener) Assertions.checkNotNull(listener);
        Handler createHandlerForCurrentOrMainLooper = Util.createHandlerForCurrentOrMainLooper();
        this.f32358c = createHandlerForCurrentOrMainLooper;
        if (Util.SDK_INT >= 21) {
            hdmiAudioPlugBroadcastReceiver = new HdmiAudioPlugBroadcastReceiver();
        } else {
            hdmiAudioPlugBroadcastReceiver = null;
        }
        this.f32359d = hdmiAudioPlugBroadcastReceiver;
        Uri m75082e = AudioCapabilities.m75082e();
        this.f32360e = m75082e != null ? new ExternalSurroundSoundSettingObserver(createHandlerForCurrentOrMainLooper, applicationContext.getContentResolver(), m75082e) : null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public void m75078c(AudioCapabilities audioCapabilities) {
        if (this.f32362g && !audioCapabilities.equals(this.f32361f)) {
            this.f32361f = audioCapabilities;
            this.f32357b.onAudioCapabilitiesChanged(audioCapabilities);
        }
    }

    public AudioCapabilities register() {
        if (this.f32362g) {
            return (AudioCapabilities) Assertions.checkNotNull(this.f32361f);
        }
        this.f32362g = true;
        ExternalSurroundSoundSettingObserver externalSurroundSoundSettingObserver = this.f32360e;
        if (externalSurroundSoundSettingObserver != null) {
            externalSurroundSoundSettingObserver.register();
        }
        Intent intent = null;
        if (this.f32359d != null) {
            intent = this.f32356a.registerReceiver(this.f32359d, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG"), null, this.f32358c);
        }
        AudioCapabilities m75084c = AudioCapabilities.m75084c(this.f32356a, intent);
        this.f32361f = m75084c;
        return m75084c;
    }

    public void unregister() {
        if (!this.f32362g) {
            return;
        }
        this.f32361f = null;
        BroadcastReceiver broadcastReceiver = this.f32359d;
        if (broadcastReceiver != null) {
            this.f32356a.unregisterReceiver(broadcastReceiver);
        }
        ExternalSurroundSoundSettingObserver externalSurroundSoundSettingObserver = this.f32360e;
        if (externalSurroundSoundSettingObserver != null) {
            externalSurroundSoundSettingObserver.unregister();
        }
        this.f32362g = false;
    }
}
