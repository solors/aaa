package io.bidmachine.media3.exoplayer.audio;

import android.content.BroadcastReceiver;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.database.ContentObserver;
import android.media.AudioDeviceCallback;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.net.Uri;
import android.os.Handler;
import androidx.annotation.DoNotInline;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import io.bidmachine.media3.common.util.Assertions;
import io.bidmachine.media3.common.util.UnstableApi;
import io.bidmachine.media3.common.util.Util;

@UnstableApi
/* loaded from: classes9.dex */
public final class AudioCapabilitiesReceiver {
    @Nullable
    AudioCapabilities audioCapabilities;
    @Nullable
    private final C36081c audioDeviceCallback;
    private final Context context;
    @Nullable
    private final C36082d externalSurroundSoundSettingObserver;
    private final Handler handler;
    @Nullable
    private final BroadcastReceiver hdmiAudioPlugBroadcastReceiver;
    private final Listener listener;
    private boolean registered;

    /* loaded from: classes9.dex */
    public interface Listener {
        void onAudioCapabilitiesChanged(AudioCapabilities audioCapabilities);
    }

    @RequiresApi(23)
    /* renamed from: io.bidmachine.media3.exoplayer.audio.AudioCapabilitiesReceiver$b */
    /* loaded from: classes9.dex */
    private static final class C36080b {
        private C36080b() {
        }

        @DoNotInline
        public static void registerAudioDeviceCallback(Context context, AudioDeviceCallback audioDeviceCallback, Handler handler) {
            ((AudioManager) Assertions.checkNotNull((AudioManager) context.getSystemService("audio"))).registerAudioDeviceCallback(audioDeviceCallback, handler);
        }

        @DoNotInline
        public static void unregisterAudioDeviceCallback(Context context, AudioDeviceCallback audioDeviceCallback) {
            ((AudioManager) Assertions.checkNotNull((AudioManager) context.getSystemService("audio"))).unregisterAudioDeviceCallback(audioDeviceCallback);
        }
    }

    @RequiresApi(23)
    /* renamed from: io.bidmachine.media3.exoplayer.audio.AudioCapabilitiesReceiver$c */
    /* loaded from: classes9.dex */
    private final class C36081c extends AudioDeviceCallback {
        private C36081c() {
        }

        @Override // android.media.AudioDeviceCallback
        public void onAudioDevicesAdded(AudioDeviceInfo[] audioDeviceInfoArr) {
            AudioCapabilitiesReceiver audioCapabilitiesReceiver = AudioCapabilitiesReceiver.this;
            audioCapabilitiesReceiver.onNewAudioCapabilities(AudioCapabilities.getCapabilities(audioCapabilitiesReceiver.context));
        }

        @Override // android.media.AudioDeviceCallback
        public void onAudioDevicesRemoved(AudioDeviceInfo[] audioDeviceInfoArr) {
            AudioCapabilitiesReceiver audioCapabilitiesReceiver = AudioCapabilitiesReceiver.this;
            audioCapabilitiesReceiver.onNewAudioCapabilities(AudioCapabilities.getCapabilities(audioCapabilitiesReceiver.context));
        }
    }

    /* renamed from: io.bidmachine.media3.exoplayer.audio.AudioCapabilitiesReceiver$d */
    /* loaded from: classes9.dex */
    private final class C36082d extends ContentObserver {
        private final ContentResolver resolver;
        private final Uri settingUri;

        public C36082d(Handler handler, ContentResolver contentResolver, Uri uri) {
            super(handler);
            this.resolver = contentResolver;
            this.settingUri = uri;
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean z) {
            AudioCapabilitiesReceiver audioCapabilitiesReceiver = AudioCapabilitiesReceiver.this;
            audioCapabilitiesReceiver.onNewAudioCapabilities(AudioCapabilities.getCapabilities(audioCapabilitiesReceiver.context));
        }

        public void register() {
            this.resolver.registerContentObserver(this.settingUri, false, this);
        }

        public void unregister() {
            this.resolver.unregisterContentObserver(this);
        }
    }

    /* renamed from: io.bidmachine.media3.exoplayer.audio.AudioCapabilitiesReceiver$e */
    /* loaded from: classes9.dex */
    private final class C36083e extends BroadcastReceiver {
        private C36083e() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (!isInitialStickyBroadcast()) {
                AudioCapabilitiesReceiver.this.onNewAudioCapabilities(AudioCapabilities.getCapabilities(context, intent));
            }
        }
    }

    public AudioCapabilitiesReceiver(Context context, Listener listener) {
        C36081c c36081c;
        C36083e c36083e;
        Context applicationContext = context.getApplicationContext();
        this.context = applicationContext;
        this.listener = (Listener) Assertions.checkNotNull(listener);
        Handler createHandlerForCurrentOrMainLooper = Util.createHandlerForCurrentOrMainLooper();
        this.handler = createHandlerForCurrentOrMainLooper;
        int i = Util.SDK_INT;
        if (i >= 23) {
            c36081c = new C36081c();
        } else {
            c36081c = null;
        }
        this.audioDeviceCallback = c36081c;
        if (i >= 21) {
            c36083e = new C36083e();
        } else {
            c36083e = null;
        }
        this.hdmiAudioPlugBroadcastReceiver = c36083e;
        Uri externalSurroundSoundGlobalSettingUri = AudioCapabilities.getExternalSurroundSoundGlobalSettingUri();
        this.externalSurroundSoundSettingObserver = externalSurroundSoundGlobalSettingUri != null ? new C36082d(createHandlerForCurrentOrMainLooper, applicationContext.getContentResolver(), externalSurroundSoundGlobalSettingUri) : null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onNewAudioCapabilities(AudioCapabilities audioCapabilities) {
        if (this.registered && !audioCapabilities.equals(this.audioCapabilities)) {
            this.audioCapabilities = audioCapabilities;
            this.listener.onAudioCapabilitiesChanged(audioCapabilities);
        }
    }

    public AudioCapabilities register() {
        C36081c c36081c;
        if (this.registered) {
            return (AudioCapabilities) Assertions.checkNotNull(this.audioCapabilities);
        }
        this.registered = true;
        C36082d c36082d = this.externalSurroundSoundSettingObserver;
        if (c36082d != null) {
            c36082d.register();
        }
        if (Util.SDK_INT >= 23 && (c36081c = this.audioDeviceCallback) != null) {
            C36080b.registerAudioDeviceCallback(this.context, c36081c, this.handler);
        }
        Intent intent = null;
        if (this.hdmiAudioPlugBroadcastReceiver != null) {
            intent = this.context.registerReceiver(this.hdmiAudioPlugBroadcastReceiver, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG"), null, this.handler);
        }
        AudioCapabilities capabilities = AudioCapabilities.getCapabilities(this.context, intent);
        this.audioCapabilities = capabilities;
        return capabilities;
    }

    public void unregister() {
        C36081c c36081c;
        if (!this.registered) {
            return;
        }
        this.audioCapabilities = null;
        if (Util.SDK_INT >= 23 && (c36081c = this.audioDeviceCallback) != null) {
            C36080b.unregisterAudioDeviceCallback(this.context, c36081c);
        }
        BroadcastReceiver broadcastReceiver = this.hdmiAudioPlugBroadcastReceiver;
        if (broadcastReceiver != null) {
            this.context.unregisterReceiver(broadcastReceiver);
        }
        C36082d c36082d = this.externalSurroundSoundSettingObserver;
        if (c36082d != null) {
            c36082d.unregister();
        }
        this.registered = false;
    }
}
