package com.unity3d.player;

import android.database.ContentObserver;
import android.media.AudioManager;
import android.net.Uri;
import android.os.Handler;

/* renamed from: com.unity3d.player.j */
/* loaded from: classes7.dex */
class C28787j extends ContentObserver {

    /* renamed from: a */
    private final InterfaceC28788k f74853a;

    /* renamed from: b */
    private final AudioManager f74854b;

    /* renamed from: c */
    private final int f74855c;

    /* renamed from: d */
    private int f74856d;

    public C28787j(C28789l c28789l, Handler handler, AudioManager audioManager, int i, InterfaceC28788k interfaceC28788k) {
        super(handler);
        this.f74854b = audioManager;
        this.f74855c = i;
        this.f74853a = interfaceC28788k;
        this.f74856d = audioManager.getStreamVolume(i);
    }

    @Override // android.database.ContentObserver
    public boolean deliverSelfNotifications() {
        return super.deliverSelfNotifications();
    }

    @Override // android.database.ContentObserver
    public void onChange(boolean z, Uri uri) {
        int streamVolume;
        AudioManager audioManager = this.f74854b;
        if (audioManager != null && this.f74853a != null && (streamVolume = audioManager.getStreamVolume(this.f74855c)) != this.f74856d) {
            this.f74856d = streamVolume;
            ((AudioVolumeHandler) this.f74853a).onAudioVolumeChanged(streamVolume);
        }
    }
}
