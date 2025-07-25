package com.iab.omid.library.applovin.devicevolume;

import android.content.Context;
import android.database.ContentObserver;
import android.media.AudioManager;
import android.os.Handler;
import android.provider.Settings;

/* renamed from: com.iab.omid.library.applovin.devicevolume.d */
/* loaded from: classes6.dex */
public final class C17805d extends ContentObserver {

    /* renamed from: a */
    private final Context f44923a;

    /* renamed from: b */
    private final AudioManager f44924b;

    /* renamed from: c */
    private final C17802a f44925c;

    /* renamed from: d */
    private final InterfaceC17804c f44926d;

    /* renamed from: e */
    private float f44927e;

    public C17805d(Handler handler, Context context, C17802a c17802a, InterfaceC17804c interfaceC17804c) {
        super(handler);
        this.f44923a = context;
        this.f44924b = (AudioManager) context.getSystemService("audio");
        this.f44925c = c17802a;
        this.f44926d = interfaceC17804c;
    }

    /* renamed from: a */
    private float m65155a() {
        return this.f44925c.m65157a(this.f44924b.getStreamVolume(3), this.f44924b.getStreamMaxVolume(3));
    }

    /* renamed from: b */
    private void m65153b() {
        this.f44926d.mo65094a(this.f44927e);
    }

    /* renamed from: c */
    public void m65152c() {
        this.f44927e = m65155a();
        m65153b();
        this.f44923a.getContentResolver().registerContentObserver(Settings.System.CONTENT_URI, true, this);
    }

    /* renamed from: d */
    public void m65151d() {
        this.f44923a.getContentResolver().unregisterContentObserver(this);
    }

    @Override // android.database.ContentObserver
    public void onChange(boolean z) {
        super.onChange(z);
        float m65155a = m65155a();
        if (m65154a(m65155a)) {
            this.f44927e = m65155a;
            m65153b();
        }
    }

    /* renamed from: a */
    private boolean m65154a(float f) {
        return f != this.f44927e;
    }
}
