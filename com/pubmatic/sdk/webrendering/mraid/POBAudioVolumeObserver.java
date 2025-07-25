package com.pubmatic.sdk.webrendering.mraid;

import android.content.Context;
import android.database.ContentObserver;
import android.media.AudioManager;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.pubmatic.sdk.common.log.POBLog;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes7.dex */
public class POBAudioVolumeObserver {
    @Nullable

    /* renamed from: a */
    private static volatile POBAudioVolumeObserver f71143a;
    @NonNull

    /* renamed from: b */
    private final Set<InterfaceC26895a> f71144b = new HashSet();
    @Nullable

    /* renamed from: c */
    private C26896b f71145c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.pubmatic.sdk.webrendering.mraid.POBAudioVolumeObserver$a */
    /* loaded from: classes7.dex */
    public interface InterfaceC26895a {
        /* renamed from: a */
        void mo39907a(Double d);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.pubmatic.sdk.webrendering.mraid.POBAudioVolumeObserver$b */
    /* loaded from: classes7.dex */
    public class C26896b extends ContentObserver {

        /* renamed from: a */
        private final AudioManager f71146a;

        /* renamed from: b */
        private int f71147b;

        C26896b(@NonNull Handler handler, @NonNull AudioManager audioManager) {
            super(handler);
            this.f71146a = audioManager;
            this.f71147b = audioManager.getStreamVolume(3);
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean z, Uri uri) {
            AudioManager audioManager = this.f71146a;
            if (audioManager != null) {
                int streamMaxVolume = audioManager.getStreamMaxVolume(3);
                int streamVolume = this.f71146a.getStreamVolume(3);
                if (streamVolume != this.f71147b) {
                    this.f71147b = streamVolume;
                    POBAudioVolumeObserver.this.m39921a(streamVolume, streamMaxVolume);
                }
            }
        }
    }

    private POBAudioVolumeObserver() {
    }

    /* renamed from: b */
    private void m39918b(@NonNull Context context) {
        if (this.f71145c != null) {
            context.getContentResolver().unregisterContentObserver(this.f71145c);
            this.f71145c = null;
        }
    }

    /* renamed from: c */
    private void m39917c(Context context) {
        m39918b(context);
        f71143a = null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Nullable
    public static Double getAudioVolumePercentage(@NonNull Context context) {
        try {
            AudioManager audioManager = (AudioManager) context.getSystemService("audio");
            if (audioManager == null) {
                return null;
            }
            return Double.valueOf((audioManager.getStreamVolume(3) * 100.0d) / audioManager.getStreamMaxVolume(3));
        } catch (Exception e) {
            POBLog.error("POBAudioVolumeObserver", "Error in getting audio manager. Error: %s", e.getMessage());
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void registerListener(@NonNull Context context, @NonNull InterfaceC26895a interfaceC26895a) {
        if (!this.f71144b.contains(interfaceC26895a)) {
            if (this.f71145c == null) {
                m39920a(context);
            }
            this.f71144b.add(interfaceC26895a);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void unregisterListener(@NonNull Context context, InterfaceC26895a interfaceC26895a) {
        this.f71144b.remove(interfaceC26895a);
        if (this.f71144b.isEmpty()) {
            m39917c(context);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static POBAudioVolumeObserver m39922a() {
        if (f71143a == null) {
            synchronized (POBAudioVolumeObserver.class) {
                if (f71143a == null) {
                    f71143a = new POBAudioVolumeObserver();
                }
            }
        }
        return f71143a;
    }

    /* renamed from: a */
    private void m39920a(@NonNull Context context) {
        if (this.f71145c == null) {
            Handler handler = new Handler(Looper.getMainLooper());
            try {
                AudioManager audioManager = (AudioManager) context.getSystemService("audio");
                if (audioManager != null) {
                    this.f71145c = new C26896b(handler, audioManager);
                    context.getContentResolver().registerContentObserver(Settings.System.CONTENT_URI, true, this.f71145c);
                }
            } catch (Exception e) {
                POBLog.warn("POBAudioVolumeObserver", "Error in getting audio manager. Error: %s", e.getMessage());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m39921a(int i, int i2) {
        Double valueOf = Double.valueOf((i * 100.0d) / i2);
        for (InterfaceC26895a interfaceC26895a : this.f71144b) {
            interfaceC26895a.mo39907a(valueOf);
        }
    }
}
