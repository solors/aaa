package com.unity3d.player;

import android.content.Context;

/* loaded from: classes7.dex */
public class AudioVolumeHandler implements InterfaceC28788k {

    /* renamed from: a */
    private C28789l f74511a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AudioVolumeHandler(Context context) {
        C28789l c28789l = new C28789l(context);
        this.f74511a = c28789l;
        c28789l.m37621a(3, this);
    }

    /* renamed from: a */
    public void m37769a() {
        this.f74511a.m37622a();
        this.f74511a = null;
    }

    public final native void onAudioVolumeChanged(int i);
}
