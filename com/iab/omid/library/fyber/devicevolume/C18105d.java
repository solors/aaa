package com.iab.omid.library.fyber.devicevolume;

import android.content.Context;
import android.database.ContentObserver;
import android.media.AudioManager;
import android.os.Handler;
import android.provider.Settings;

/* renamed from: com.iab.omid.library.fyber.devicevolume.d */
/* loaded from: classes6.dex */
public final class C18105d extends ContentObserver {

    /* renamed from: a */
    private final Context f45551a;

    /* renamed from: b */
    private final AudioManager f45552b;

    /* renamed from: c */
    private final C18102a f45553c;

    /* renamed from: d */
    private final InterfaceC18104c f45554d;

    /* renamed from: e */
    private float f45555e;

    public C18105d(Handler handler, Context context, C18102a c18102a, InterfaceC18104c interfaceC18104c) {
        super(handler);
        this.f45551a = context;
        this.f45552b = (AudioManager) context.getSystemService("audio");
        this.f45553c = c18102a;
        this.f45554d = interfaceC18104c;
    }

    /* renamed from: a */
    private float m63997a() {
        return this.f45553c.m63999a(this.f45552b.getStreamVolume(3), this.f45552b.getStreamMaxVolume(3));
    }

    /* renamed from: b */
    private void m63995b() {
        this.f45554d.mo63935a(this.f45555e);
    }

    /* renamed from: c */
    public void m63994c() {
        this.f45555e = m63997a();
        m63995b();
        this.f45551a.getContentResolver().registerContentObserver(Settings.System.CONTENT_URI, true, this);
    }

    /* renamed from: d */
    public void m63993d() {
        this.f45551a.getContentResolver().unregisterContentObserver(this);
    }

    @Override // android.database.ContentObserver
    public void onChange(boolean z) {
        super.onChange(z);
        float m63997a = m63997a();
        if (m63996a(m63997a)) {
            this.f45555e = m63997a;
            m63995b();
        }
    }

    /* renamed from: a */
    private boolean m63996a(float f) {
        return f != this.f45555e;
    }
}
