package com.iab.omid.library.appodeal.devicevolume;

import android.content.Context;
import android.database.ContentObserver;
import android.media.AudioManager;
import android.os.Handler;
import android.provider.Settings;

/* renamed from: com.iab.omid.library.appodeal.devicevolume.d */
/* loaded from: classes6.dex */
public final class C17873d extends ContentObserver {

    /* renamed from: a */
    private final Context f45052a;

    /* renamed from: b */
    private final AudioManager f45053b;

    /* renamed from: c */
    private final C17870a f45054c;

    /* renamed from: d */
    private final InterfaceC17872c f45055d;

    /* renamed from: e */
    private float f45056e;

    public C17873d(Handler handler, Context context, C17870a c17870a, InterfaceC17872c interfaceC17872c) {
        super(handler);
        this.f45052a = context;
        this.f45053b = (AudioManager) context.getSystemService("audio");
        this.f45054c = c17870a;
        this.f45055d = interfaceC17872c;
    }

    /* renamed from: a */
    private float m64914a() {
        return this.f45054c.m64916a(this.f45053b.getStreamVolume(3), this.f45053b.getStreamMaxVolume(3));
    }

    /* renamed from: b */
    private void m64912b() {
        this.f45055d.mo64852a(this.f45056e);
    }

    /* renamed from: c */
    public void m64911c() {
        this.f45056e = m64914a();
        m64912b();
        this.f45052a.getContentResolver().registerContentObserver(Settings.System.CONTENT_URI, true, this);
    }

    /* renamed from: d */
    public void m64910d() {
        this.f45052a.getContentResolver().unregisterContentObserver(this);
    }

    @Override // android.database.ContentObserver
    public void onChange(boolean z) {
        super.onChange(z);
        float m64914a = m64914a();
        if (m64913a(m64914a)) {
            this.f45056e = m64914a;
            m64912b();
        }
    }

    /* renamed from: a */
    private boolean m64913a(float f) {
        return f != this.f45056e;
    }
}
