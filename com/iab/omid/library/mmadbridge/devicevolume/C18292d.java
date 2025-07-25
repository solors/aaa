package com.iab.omid.library.mmadbridge.devicevolume;

import android.content.Context;
import android.database.ContentObserver;
import android.media.AudioManager;
import android.os.Handler;
import android.provider.Settings;

/* renamed from: com.iab.omid.library.mmadbridge.devicevolume.d */
/* loaded from: classes6.dex */
public final class C18292d extends ContentObserver {

    /* renamed from: a */
    private final Context f45940a;

    /* renamed from: b */
    private final AudioManager f45941b;

    /* renamed from: c */
    private final C18289a f45942c;

    /* renamed from: d */
    private final InterfaceC18291c f45943d;

    /* renamed from: e */
    private float f45944e;

    public C18292d(Handler handler, Context context, C18289a c18289a, InterfaceC18291c interfaceC18291c) {
        super(handler);
        this.f45940a = context;
        this.f45941b = (AudioManager) context.getSystemService("audio");
        this.f45942c = c18289a;
        this.f45943d = interfaceC18291c;
    }

    /* renamed from: a */
    private float m63268a() {
        return this.f45942c.m63270a(this.f45941b.getStreamVolume(3), this.f45941b.getStreamMaxVolume(3));
    }

    /* renamed from: b */
    private void m63266b() {
        this.f45943d.mo63206a(this.f45944e);
    }

    /* renamed from: c */
    public void m63265c() {
        this.f45944e = m63268a();
        m63266b();
        this.f45940a.getContentResolver().registerContentObserver(Settings.System.CONTENT_URI, true, this);
    }

    /* renamed from: d */
    public void m63264d() {
        this.f45940a.getContentResolver().unregisterContentObserver(this);
    }

    @Override // android.database.ContentObserver
    public void onChange(boolean z) {
        super.onChange(z);
        float m63268a = m63268a();
        if (m63267a(m63268a)) {
            this.f45944e = m63268a;
            m63266b();
        }
    }

    /* renamed from: a */
    private boolean m63267a(float f) {
        return f != this.f45944e;
    }
}
