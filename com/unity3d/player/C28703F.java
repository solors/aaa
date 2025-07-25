package com.unity3d.player;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.unity3d.player.F */
/* loaded from: classes7.dex */
public class C28703F {

    /* renamed from: a */
    private Context f74526a;

    /* renamed from: b */
    private C28702E f74527b;

    public C28703F(Context context) {
        this.f74526a = context;
    }

    /* renamed from: a */
    public void m37752a() {
        if (this.f74527b != null) {
            this.f74526a.getContentResolver().unregisterContentObserver(this.f74527b);
            this.f74527b = null;
        }
    }

    /* renamed from: a */
    public void m37751a(InterfaceC28701D interfaceC28701D, String str) {
        this.f74527b = new C28702E(this, new Handler(Looper.getMainLooper()), interfaceC28701D);
        this.f74526a.getContentResolver().registerContentObserver(Settings.System.getUriFor(str), true, this.f74527b);
    }
}
