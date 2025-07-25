package com.iab.omid.library.ironsrc.devicevolume;

import android.content.Context;
import android.database.ContentObserver;
import android.media.AudioManager;
import android.os.Handler;
import android.provider.Settings;

/* renamed from: com.iab.omid.library.ironsrc.devicevolume.d */
/* loaded from: classes6.dex */
public final class C18234d extends ContentObserver {

    /* renamed from: a */
    private final Context f45816a;

    /* renamed from: b */
    private final AudioManager f45817b;

    /* renamed from: c */
    private final C18231a f45818c;

    /* renamed from: d */
    private final InterfaceC18233c f45819d;

    /* renamed from: e */
    private float f45820e;

    public C18234d(Handler handler, Context context, C18231a c18231a, InterfaceC18233c interfaceC18233c) {
        super(handler);
        this.f45816a = context;
        this.f45817b = (AudioManager) context.getSystemService("audio");
        this.f45818c = c18231a;
        this.f45819d = interfaceC18233c;
    }

    /* renamed from: a */
    private float m63500a() {
        return this.f45818c.m63502a(this.f45817b.getStreamVolume(3), this.f45817b.getStreamMaxVolume(3));
    }

    /* renamed from: b */
    private void m63498b() {
        this.f45819d.mo63445a(this.f45820e);
    }

    /* renamed from: c */
    public void m63497c() {
        this.f45820e = m63500a();
        m63498b();
        this.f45816a.getContentResolver().registerContentObserver(Settings.System.CONTENT_URI, true, this);
    }

    /* renamed from: d */
    public void m63496d() {
        this.f45816a.getContentResolver().unregisterContentObserver(this);
    }

    @Override // android.database.ContentObserver
    public void onChange(boolean z) {
        super.onChange(z);
        float m63500a = m63500a();
        if (m63499a(m63500a)) {
            this.f45820e = m63500a;
            m63498b();
        }
    }

    /* renamed from: a */
    private boolean m63499a(float f) {
        return f != this.f45820e;
    }
}
