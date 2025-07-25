package com.iab.omid.library.bigosg.p386a;

import android.content.Context;
import android.database.ContentObserver;
import android.media.AudioManager;
import android.os.Handler;
import android.provider.Settings;

/* renamed from: com.iab.omid.library.bigosg.a.d */
/* loaded from: classes6.dex */
public final class C17931d extends ContentObserver {

    /* renamed from: a */
    private final Context f45164a;

    /* renamed from: b */
    private final AudioManager f45165b;

    /* renamed from: c */
    private final C17928a f45166c;

    /* renamed from: d */
    private final InterfaceC17930c f45167d;

    /* renamed from: e */
    private float f45168e;

    public C17931d(Handler handler, Context context, C17928a c17928a, InterfaceC17930c interfaceC17930c) {
        super(handler);
        this.f45164a = context;
        this.f45165b = (AudioManager) context.getSystemService("audio");
        this.f45166c = c17928a;
        this.f45167d = interfaceC17930c;
    }

    /* renamed from: c */
    private float m64687c() {
        return this.f45166c.m64692a(this.f45165b.getStreamVolume(3), this.f45165b.getStreamMaxVolume(3));
    }

    /* renamed from: d */
    private void m64686d() {
        this.f45167d.mo64616a(this.f45168e);
    }

    /* renamed from: a */
    public final void m64690a() {
        this.f45168e = m64687c();
        m64686d();
        this.f45164a.getContentResolver().registerContentObserver(Settings.System.CONTENT_URI, true, this);
    }

    /* renamed from: b */
    public final void m64688b() {
        this.f45164a.getContentResolver().unregisterContentObserver(this);
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        super.onChange(z);
        float m64687c = m64687c();
        if (m64689a(m64687c)) {
            this.f45168e = m64687c;
            m64686d();
        }
    }

    /* renamed from: a */
    private boolean m64689a(float f) {
        return f != this.f45168e;
    }
}
