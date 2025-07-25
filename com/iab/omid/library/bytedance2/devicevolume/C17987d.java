package com.iab.omid.library.bytedance2.devicevolume;

import android.content.Context;
import android.database.ContentObserver;
import android.media.AudioManager;
import android.os.Handler;
import android.provider.Settings;

/* renamed from: com.iab.omid.library.bytedance2.devicevolume.d */
/* loaded from: classes6.dex */
public final class C17987d extends ContentObserver {

    /* renamed from: a */
    private final Context f45308a;

    /* renamed from: b */
    private final AudioManager f45309b;

    /* renamed from: c */
    private final C17984a f45310c;

    /* renamed from: d */
    private final InterfaceC17986c f45311d;

    /* renamed from: e */
    private float f45312e;

    public C17987d(Handler handler, Context context, C17984a c17984a, InterfaceC17986c interfaceC17986c) {
        super(handler);
        this.f45308a = context;
        this.f45309b = (AudioManager) context.getSystemService("audio");
        this.f45310c = c17984a;
        this.f45311d = interfaceC17986c;
    }

    /* renamed from: a */
    private float m64447a() {
        return this.f45310c.m64449a(this.f45309b.getStreamVolume(3), this.f45309b.getStreamMaxVolume(3));
    }

    /* renamed from: b */
    private void m64445b() {
        this.f45311d.mo64386a(this.f45312e);
    }

    /* renamed from: c */
    public void m64444c() {
        this.f45312e = m64447a();
        m64445b();
        this.f45308a.getContentResolver().registerContentObserver(Settings.System.CONTENT_URI, true, this);
    }

    /* renamed from: d */
    public void m64443d() {
        this.f45308a.getContentResolver().unregisterContentObserver(this);
    }

    @Override // android.database.ContentObserver
    public void onChange(boolean z) {
        super.onChange(z);
        float m64447a = m64447a();
        if (m64446a(m64447a)) {
            this.f45312e = m64447a;
            m64445b();
        }
    }

    /* renamed from: a */
    private boolean m64446a(float f) {
        return f != this.f45312e;
    }
}
