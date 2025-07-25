package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.database.ContentObserver;
import android.media.AudioManager;
import android.os.Handler;
import android.provider.Settings;

/* loaded from: classes8.dex */
public final class wi2 extends ContentObserver {

    /* renamed from: a */
    private final Context f87277a;

    /* renamed from: b */
    private final AudioManager f87278b;

    /* renamed from: c */
    private final fi2 f87279c;

    /* renamed from: d */
    private final si2 f87280d;

    /* renamed from: e */
    private float f87281e;

    public wi2(Handler handler, Context context, fi2 fi2Var, si2 si2Var) {
        super(handler);
        this.f87277a = context;
        this.f87278b = (AudioManager) context.getSystemService("audio");
        this.f87279c = fi2Var;
        this.f87280d = si2Var;
    }

    /* renamed from: c */
    private float m27889c() {
        int streamVolume = this.f87278b.getStreamVolume(3);
        int streamMaxVolume = this.f87278b.getStreamMaxVolume(3);
        this.f87279c.getClass();
        if (streamMaxVolume > 0 && streamVolume > 0) {
            float f = streamVolume / streamMaxVolume;
            if (f > 1.0f) {
                return 1.0f;
            }
            return f;
        }
        return 0.0f;
    }

    /* renamed from: a */
    public final void m27891a() {
        float m27889c = m27889c();
        this.f87281e = m27889c;
        ((ej2) this.f87280d).m34514a(m27889c);
        this.f87277a.getContentResolver().registerContentObserver(Settings.System.CONTENT_URI, true, this);
    }

    /* renamed from: b */
    public final void m27890b() {
        this.f87277a.getContentResolver().unregisterContentObserver(this);
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        super.onChange(z);
        float m27889c = m27889c();
        if (m27889c != this.f87281e) {
            this.f87281e = m27889c;
            ((ej2) this.f87280d).m34514a(m27889c);
        }
    }
}
