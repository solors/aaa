package com.unity3d.player;

import android.content.Context;
import android.media.AudioManager;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.unity3d.player.l */
/* loaded from: classes7.dex */
public class C28789l {

    /* renamed from: a */
    private final Context f74857a;

    /* renamed from: b */
    private final AudioManager f74858b;

    /* renamed from: c */
    private C28787j f74859c;

    public C28789l(Context context) {
        this.f74857a = context;
        this.f74858b = (AudioManager) context.getSystemService("audio");
    }

    /* renamed from: a */
    public void m37622a() {
        if (this.f74859c != null) {
            this.f74857a.getContentResolver().unregisterContentObserver(this.f74859c);
            this.f74859c = null;
        }
    }

    /* renamed from: a */
    public void m37621a(int i, InterfaceC28788k interfaceC28788k) {
        this.f74859c = new C28787j(this, new Handler(Looper.getMainLooper()), this.f74858b, i, interfaceC28788k);
        this.f74857a.getContentResolver().registerContentObserver(Settings.System.CONTENT_URI, true, this.f74859c);
    }
}
