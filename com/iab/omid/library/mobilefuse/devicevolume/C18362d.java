package com.iab.omid.library.mobilefuse.devicevolume;

import android.content.Context;
import android.database.ContentObserver;
import android.media.AudioManager;
import android.os.Handler;
import android.provider.Settings;

/* renamed from: com.iab.omid.library.mobilefuse.devicevolume.d */
/* loaded from: classes6.dex */
public final class C18362d extends ContentObserver {

    /* renamed from: a */
    private final Context f46075a;

    /* renamed from: b */
    private final AudioManager f46076b;

    /* renamed from: c */
    private final C18359a f46077c;

    /* renamed from: d */
    private final InterfaceC18361c f46078d;

    /* renamed from: e */
    private float f46079e;

    public C18362d(Handler handler, Context context, C18359a c18359a, InterfaceC18361c interfaceC18361c) {
        super(handler);
        this.f46075a = context;
        this.f46076b = (AudioManager) context.getSystemService("audio");
        this.f46077c = c18359a;
        this.f46078d = interfaceC18361c;
    }

    /* renamed from: a */
    private float m63015a() {
        return this.f46077c.m63017a(this.f46076b.getStreamVolume(3), this.f46076b.getStreamMaxVolume(3));
    }

    /* renamed from: b */
    private void m63013b() {
        this.f46078d.mo62953a(this.f46079e);
    }

    /* renamed from: c */
    public void m63012c() {
        this.f46079e = m63015a();
        m63013b();
        this.f46075a.getContentResolver().registerContentObserver(Settings.System.CONTENT_URI, true, this);
    }

    /* renamed from: d */
    public void m63011d() {
        this.f46075a.getContentResolver().unregisterContentObserver(this);
    }

    @Override // android.database.ContentObserver
    public void onChange(boolean z) {
        super.onChange(z);
        float m63015a = m63015a();
        if (m63014a(m63015a)) {
            this.f46079e = m63015a;
            m63013b();
        }
    }

    /* renamed from: a */
    private boolean m63014a(float f) {
        return f != this.f46079e;
    }
}
