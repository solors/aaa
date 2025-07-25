package com.iab.omid.library.pubnativenet.devicevolume;

import android.content.Context;
import android.database.ContentObserver;
import android.media.AudioManager;
import android.os.Handler;
import android.provider.Settings;

/* renamed from: com.iab.omid.library.pubnativenet.devicevolume.d */
/* loaded from: classes6.dex */
public final class C18502d extends ContentObserver {

    /* renamed from: a */
    private final Context f46345a;

    /* renamed from: b */
    private final AudioManager f46346b;

    /* renamed from: c */
    private final C18499a f46347c;

    /* renamed from: d */
    private final InterfaceC18501c f46348d;

    /* renamed from: e */
    private float f46349e;

    public C18502d(Handler handler, Context context, C18499a c18499a, InterfaceC18501c interfaceC18501c) {
        super(handler);
        this.f46345a = context;
        this.f46346b = (AudioManager) context.getSystemService("audio");
        this.f46347c = c18499a;
        this.f46348d = interfaceC18501c;
    }

    /* renamed from: a */
    private float m62509a() {
        return this.f46347c.m62511a(this.f46346b.getStreamVolume(3), this.f46346b.getStreamMaxVolume(3));
    }

    /* renamed from: b */
    private void m62507b() {
        this.f46348d.mo62447a(this.f46349e);
    }

    /* renamed from: c */
    public void m62506c() {
        this.f46349e = m62509a();
        m62507b();
        this.f46345a.getContentResolver().registerContentObserver(Settings.System.CONTENT_URI, true, this);
    }

    /* renamed from: d */
    public void m62505d() {
        this.f46345a.getContentResolver().unregisterContentObserver(this);
    }

    @Override // android.database.ContentObserver
    public void onChange(boolean z) {
        super.onChange(z);
        float m62509a = m62509a();
        if (m62508a(m62509a)) {
            this.f46349e = m62509a;
            m62507b();
        }
    }

    /* renamed from: a */
    private boolean m62508a(float f) {
        return f != this.f46349e;
    }
}
