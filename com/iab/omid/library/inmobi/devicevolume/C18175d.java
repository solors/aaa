package com.iab.omid.library.inmobi.devicevolume;

import android.content.Context;
import android.database.ContentObserver;
import android.media.AudioManager;
import android.os.Handler;
import android.provider.Settings;

/* renamed from: com.iab.omid.library.inmobi.devicevolume.d */
/* loaded from: classes6.dex */
public final class C18175d extends ContentObserver {

    /* renamed from: a */
    private final Context f45686a;

    /* renamed from: b */
    private final AudioManager f45687b;

    /* renamed from: c */
    private final C18172a f45688c;

    /* renamed from: d */
    private final InterfaceC18174c f45689d;

    /* renamed from: e */
    private float f45690e;

    public C18175d(Handler handler, Context context, C18172a c18172a, InterfaceC18174c interfaceC18174c) {
        super(handler);
        this.f45686a = context;
        this.f45687b = (AudioManager) context.getSystemService("audio");
        this.f45688c = c18172a;
        this.f45689d = interfaceC18174c;
    }

    /* renamed from: a */
    private float m63744a() {
        return this.f45688c.m63746a(this.f45687b.getStreamVolume(3), this.f45687b.getStreamMaxVolume(3));
    }

    /* renamed from: b */
    private void m63742b() {
        this.f45689d.mo63683a(this.f45690e);
    }

    /* renamed from: c */
    public void m63741c() {
        this.f45690e = m63744a();
        m63742b();
        this.f45686a.getContentResolver().registerContentObserver(Settings.System.CONTENT_URI, true, this);
    }

    /* renamed from: d */
    public void m63740d() {
        this.f45686a.getContentResolver().unregisterContentObserver(this);
    }

    @Override // android.database.ContentObserver
    public void onChange(boolean z) {
        super.onChange(z);
        float m63744a = m63744a();
        if (m63743a(m63744a)) {
            this.f45690e = m63744a;
            m63742b();
        }
    }

    /* renamed from: a */
    private boolean m63743a(float f) {
        return f != this.f45690e;
    }
}
