package com.chartboost.sdk.impl;

import android.content.Context;
import android.database.ContentObserver;
import android.media.AudioManager;
import android.os.Handler;
import android.provider.Settings;

/* renamed from: com.chartboost.sdk.impl.fd */
/* loaded from: classes3.dex */
public final class C9854fd extends ContentObserver {

    /* renamed from: a */
    public final Context f22027a;

    /* renamed from: b */
    public final AudioManager f22028b;

    /* renamed from: c */
    public final C9772cc f22029c;

    /* renamed from: d */
    public final InterfaceC10272uc f22030d;

    /* renamed from: e */
    public float f22031e;

    public C9854fd(Handler handler, Context context, C9772cc c9772cc, InterfaceC10272uc interfaceC10272uc) {
        super(handler);
        this.f22027a = context;
        this.f22028b = (AudioManager) context.getSystemService("audio");
        this.f22029c = c9772cc;
        this.f22030d = interfaceC10272uc;
    }

    /* renamed from: a */
    public final float m81684a() {
        return this.f22029c.m81895a(this.f22028b.getStreamVolume(3), this.f22028b.getStreamMaxVolume(3));
    }

    /* renamed from: b */
    public final void m81682b() {
        this.f22030d.mo80361a(this.f22031e);
    }

    /* renamed from: c */
    public void m81681c() {
        this.f22031e = m81684a();
        m81682b();
        this.f22027a.getContentResolver().registerContentObserver(Settings.System.CONTENT_URI, true, this);
    }

    /* renamed from: d */
    public void m81680d() {
        this.f22027a.getContentResolver().unregisterContentObserver(this);
    }

    @Override // android.database.ContentObserver
    public void onChange(boolean z) {
        super.onChange(z);
        float m81684a = m81684a();
        if (m81683a(m81684a)) {
            this.f22031e = m81684a;
            m81682b();
        }
    }

    /* renamed from: a */
    public final boolean m81683a(float f) {
        return f != this.f22031e;
    }
}
