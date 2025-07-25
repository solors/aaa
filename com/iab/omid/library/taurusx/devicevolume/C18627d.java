package com.iab.omid.library.taurusx.devicevolume;

import android.content.Context;
import android.database.ContentObserver;
import android.media.AudioManager;
import android.os.Handler;
import android.provider.Settings;

/* renamed from: com.iab.omid.library.taurusx.devicevolume.d */
/* loaded from: classes6.dex */
public final class C18627d extends ContentObserver {

    /* renamed from: a */
    private final Context f46616a;

    /* renamed from: b */
    private final AudioManager f46617b;

    /* renamed from: c */
    private final C18624a f46618c;

    /* renamed from: d */
    private final InterfaceC18626c f46619d;

    /* renamed from: e */
    private float f46620e;

    public C18627d(Handler handler, Context context, C18624a c18624a, InterfaceC18626c interfaceC18626c) {
        super(handler);
        this.f46616a = context;
        this.f46617b = (AudioManager) context.getSystemService("audio");
        this.f46618c = c18624a;
        this.f46619d = interfaceC18626c;
    }

    /* renamed from: a */
    private float m62000a() {
        return this.f46618c.m62002a(this.f46617b.getStreamVolume(3), this.f46617b.getStreamMaxVolume(3));
    }

    /* renamed from: b */
    private void m61998b() {
        this.f46619d.mo61945a(this.f46620e);
    }

    /* renamed from: c */
    public void m61997c() {
        this.f46620e = m62000a();
        m61998b();
        this.f46616a.getContentResolver().registerContentObserver(Settings.System.CONTENT_URI, true, this);
    }

    /* renamed from: d */
    public void m61996d() {
        this.f46616a.getContentResolver().unregisterContentObserver(this);
    }

    @Override // android.database.ContentObserver
    public void onChange(boolean z) {
        super.onChange(z);
        float m62000a = m62000a();
        if (m61999a(m62000a)) {
            this.f46620e = m62000a;
            m61998b();
        }
    }

    /* renamed from: a */
    private boolean m61999a(float f) {
        return f != this.f46620e;
    }
}
