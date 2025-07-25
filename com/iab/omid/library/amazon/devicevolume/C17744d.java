package com.iab.omid.library.amazon.devicevolume;

import android.content.Context;
import android.database.ContentObserver;
import android.media.AudioManager;
import android.os.Handler;
import android.provider.Settings;

/* renamed from: com.iab.omid.library.amazon.devicevolume.d */
/* loaded from: classes6.dex */
public final class C17744d extends ContentObserver {

    /* renamed from: a */
    private final Context f44794a;

    /* renamed from: b */
    private final AudioManager f44795b;

    /* renamed from: c */
    private final C17741a f44796c;

    /* renamed from: d */
    private final InterfaceC17743c f44797d;

    /* renamed from: e */
    private float f44798e;

    public C17744d(Handler handler, Context context, C17741a c17741a, InterfaceC17743c interfaceC17743c) {
        super(handler);
        this.f44794a = context;
        this.f44795b = (AudioManager) context.getSystemService("audio");
        this.f44796c = c17741a;
        this.f44797d = interfaceC17743c;
    }

    /* renamed from: a */
    private float m65396a() {
        return this.f44796c.m65398a(this.f44795b.getStreamVolume(3), this.f44795b.getStreamMaxVolume(3));
    }

    /* renamed from: b */
    private void m65394b() {
        this.f44797d.mo65335a(this.f44798e);
    }

    /* renamed from: c */
    public void m65393c() {
        this.f44798e = m65396a();
        m65394b();
        this.f44794a.getContentResolver().registerContentObserver(Settings.System.CONTENT_URI, true, this);
    }

    /* renamed from: d */
    public void m65392d() {
        this.f44794a.getContentResolver().unregisterContentObserver(this);
    }

    @Override // android.database.ContentObserver
    public void onChange(boolean z) {
        super.onChange(z);
        float m65396a = m65396a();
        if (m65395a(m65396a)) {
            this.f44798e = m65396a;
            m65394b();
        }
    }

    /* renamed from: a */
    private boolean m65395a(float f) {
        return f != this.f44798e;
    }
}
