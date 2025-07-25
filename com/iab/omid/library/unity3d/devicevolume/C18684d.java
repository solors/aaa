package com.iab.omid.library.unity3d.devicevolume;

import android.content.Context;
import android.database.ContentObserver;
import android.media.AudioManager;
import android.os.Handler;
import android.provider.Settings;

/* renamed from: com.iab.omid.library.unity3d.devicevolume.d */
/* loaded from: classes6.dex */
public final class C18684d extends ContentObserver {

    /* renamed from: a */
    private final Context f46744a;

    /* renamed from: b */
    private final AudioManager f46745b;

    /* renamed from: c */
    private final C18681a f46746c;

    /* renamed from: d */
    private final InterfaceC18683c f46747d;

    /* renamed from: e */
    private float f46748e;

    public C18684d(Handler handler, Context context, C18681a c18681a, InterfaceC18683c interfaceC18683c) {
        super(handler);
        this.f46744a = context;
        this.f46745b = (AudioManager) context.getSystemService("audio");
        this.f46746c = c18681a;
        this.f46747d = interfaceC18683c;
    }

    /* renamed from: a */
    private float m61765a() {
        return this.f46746c.m61767a(this.f46745b.getStreamVolume(3), this.f46745b.getStreamMaxVolume(3));
    }

    /* renamed from: b */
    private void m61763b() {
        this.f46747d.mo61711a(this.f46748e);
    }

    /* renamed from: c */
    public void m61762c() {
        this.f46748e = m61765a();
        m61763b();
        this.f46744a.getContentResolver().registerContentObserver(Settings.System.CONTENT_URI, true, this);
    }

    /* renamed from: d */
    public void m61761d() {
        this.f46744a.getContentResolver().unregisterContentObserver(this);
    }

    @Override // android.database.ContentObserver
    public void onChange(boolean z) {
        super.onChange(z);
        float m61765a = m61765a();
        if (m61764a(m61765a)) {
            this.f46748e = m61765a;
            m61763b();
        }
    }

    /* renamed from: a */
    private boolean m61764a(float f) {
        return f != this.f46748e;
    }
}
