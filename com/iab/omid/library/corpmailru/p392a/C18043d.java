package com.iab.omid.library.corpmailru.p392a;

import android.content.Context;
import android.database.ContentObserver;
import android.media.AudioManager;
import android.os.Handler;
import android.provider.Settings;

/* renamed from: com.iab.omid.library.corpmailru.a.d */
/* loaded from: classes6.dex */
public final class C18043d extends ContentObserver {

    /* renamed from: a */
    private final Context f45414a;

    /* renamed from: b */
    private final AudioManager f45415b;

    /* renamed from: c */
    private final C18040a f45416c;

    /* renamed from: d */
    private final InterfaceC18042c f45417d;

    /* renamed from: e */
    private float f45418e;

    public C18043d(Handler handler, Context context, C18040a c18040a, InterfaceC18042c interfaceC18042c) {
        super(handler);
        this.f45414a = context;
        this.f45415b = (AudioManager) context.getSystemService("audio");
        this.f45416c = c18040a;
        this.f45417d = interfaceC18042c;
    }

    /* renamed from: c */
    private float m64232c() {
        return this.f45416c.m64237a(this.f45415b.getStreamVolume(3), this.f45415b.getStreamMaxVolume(3));
    }

    /* renamed from: d */
    private void m64231d() {
        this.f45417d.mo64166a(this.f45418e);
    }

    /* renamed from: a */
    public void m64235a() {
        this.f45418e = m64232c();
        m64231d();
        this.f45414a.getContentResolver().registerContentObserver(Settings.System.CONTENT_URI, true, this);
    }

    /* renamed from: b */
    public void m64233b() {
        this.f45414a.getContentResolver().unregisterContentObserver(this);
    }

    @Override // android.database.ContentObserver
    public void onChange(boolean z) {
        super.onChange(z);
        float m64232c = m64232c();
        if (m64234a(m64232c)) {
            this.f45418e = m64232c;
            m64231d();
        }
    }

    /* renamed from: a */
    private boolean m64234a(float f) {
        return f != this.f45418e;
    }
}
