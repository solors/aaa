package com.iab.omid.library.vungle.devicevolume;

import android.content.Context;
import android.database.ContentObserver;
import android.media.AudioManager;
import android.os.Handler;
import android.provider.Settings;

/* renamed from: com.iab.omid.library.vungle.devicevolume.d */
/* loaded from: classes6.dex */
public final class C18743d extends ContentObserver {

    /* renamed from: a */
    private final Context f46871a;

    /* renamed from: b */
    private final AudioManager f46872b;

    /* renamed from: c */
    private final C18740a f46873c;

    /* renamed from: d */
    private final InterfaceC18742c f46874d;

    /* renamed from: e */
    private float f46875e;

    public C18743d(Handler handler, Context context, C18740a c18740a, InterfaceC18742c interfaceC18742c) {
        super(handler);
        this.f46871a = context;
        this.f46872b = (AudioManager) context.getSystemService("audio");
        this.f46873c = c18740a;
        this.f46874d = interfaceC18742c;
    }

    /* renamed from: a */
    private float m61534a() {
        return this.f46873c.m61536a(this.f46872b.getStreamVolume(3), this.f46872b.getStreamMaxVolume(3));
    }

    /* renamed from: b */
    private void m61532b() {
        this.f46874d.mo61472a(this.f46875e);
    }

    /* renamed from: c */
    public void m61531c() {
        this.f46875e = m61534a();
        m61532b();
        this.f46871a.getContentResolver().registerContentObserver(Settings.System.CONTENT_URI, true, this);
    }

    /* renamed from: d */
    public void m61530d() {
        this.f46871a.getContentResolver().unregisterContentObserver(this);
    }

    @Override // android.database.ContentObserver
    public void onChange(boolean z) {
        super.onChange(z);
        float m61534a = m61534a();
        if (m61533a(m61534a)) {
            this.f46875e = m61534a;
            m61532b();
        }
    }

    /* renamed from: a */
    private boolean m61533a(float f) {
        return f != this.f46875e;
    }
}
