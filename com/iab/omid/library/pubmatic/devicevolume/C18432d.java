package com.iab.omid.library.pubmatic.devicevolume;

import android.content.Context;
import android.database.ContentObserver;
import android.media.AudioManager;
import android.os.Handler;
import android.provider.Settings;

/* renamed from: com.iab.omid.library.pubmatic.devicevolume.d */
/* loaded from: classes6.dex */
public final class C18432d extends ContentObserver {

    /* renamed from: a */
    private final Context f46210a;

    /* renamed from: b */
    private final AudioManager f46211b;

    /* renamed from: c */
    private final C18429a f46212c;

    /* renamed from: d */
    private final InterfaceC18431c f46213d;

    /* renamed from: e */
    private float f46214e;

    public C18432d(Handler handler, Context context, C18429a c18429a, InterfaceC18431c interfaceC18431c) {
        super(handler);
        this.f46210a = context;
        this.f46211b = (AudioManager) context.getSystemService("audio");
        this.f46212c = c18429a;
        this.f46213d = interfaceC18431c;
    }

    /* renamed from: a */
    private float m62762a() {
        return this.f46212c.m62764a(this.f46211b.getStreamVolume(3), this.f46211b.getStreamMaxVolume(3));
    }

    /* renamed from: b */
    private void m62760b() {
        this.f46213d.mo62700a(this.f46214e);
    }

    /* renamed from: c */
    public void m62759c() {
        this.f46214e = m62762a();
        m62760b();
        this.f46210a.getContentResolver().registerContentObserver(Settings.System.CONTENT_URI, true, this);
    }

    /* renamed from: d */
    public void m62758d() {
        this.f46210a.getContentResolver().unregisterContentObserver(this);
    }

    @Override // android.database.ContentObserver
    public void onChange(boolean z) {
        super.onChange(z);
        float m62762a = m62762a();
        if (m62761a(m62762a)) {
            this.f46214e = m62762a;
            m62760b();
        }
    }

    /* renamed from: a */
    private boolean m62761a(float f) {
        return f != this.f46214e;
    }
}
