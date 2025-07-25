package com.iab.omid.library.smaato.devicevolume;

import android.content.Context;
import android.database.ContentObserver;
import android.media.AudioManager;
import android.os.Handler;
import android.provider.Settings;

/* renamed from: com.iab.omid.library.smaato.devicevolume.d */
/* loaded from: classes6.dex */
public final class C18565d extends ContentObserver {

    /* renamed from: a */
    private final Context f46480a;

    /* renamed from: b */
    private final AudioManager f46481b;

    /* renamed from: c */
    private final C18562a f46482c;

    /* renamed from: d */
    private final InterfaceC18564c f46483d;

    /* renamed from: e */
    private float f46484e;

    public C18565d(Handler handler, Context context, C18562a c18562a, InterfaceC18564c interfaceC18564c) {
        super(handler);
        this.f46480a = context;
        this.f46481b = (AudioManager) context.getSystemService("audio");
        this.f46482c = c18562a;
        this.f46483d = interfaceC18564c;
    }

    /* renamed from: a */
    private float m62256a() {
        return this.f46482c.m62258a(this.f46481b.getStreamVolume(3), this.f46481b.getStreamMaxVolume(3));
    }

    /* renamed from: b */
    private void m62254b() {
        this.f46483d.mo62194a(this.f46484e);
    }

    /* renamed from: c */
    public void m62253c() {
        this.f46484e = m62256a();
        m62254b();
        this.f46480a.getContentResolver().registerContentObserver(Settings.System.CONTENT_URI, true, this);
    }

    /* renamed from: d */
    public void m62252d() {
        this.f46480a.getContentResolver().unregisterContentObserver(this);
    }

    @Override // android.database.ContentObserver
    public void onChange(boolean z) {
        super.onChange(z);
        float m62256a = m62256a();
        if (m62255a(m62256a)) {
            this.f46484e = m62256a;
            m62254b();
        }
    }

    /* renamed from: a */
    private boolean m62255a(float f) {
        return f != this.f46484e;
    }
}
