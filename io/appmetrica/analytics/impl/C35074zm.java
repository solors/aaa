package io.appmetrica.analytics.impl;

import android.os.Looper;
import java.util.Map;

/* renamed from: io.appmetrica.analytics.impl.zm */
/* loaded from: classes9.dex */
public final class C35074zm implements InterfaceC33803Bm {
    @Override // io.appmetrica.analytics.impl.InterfaceC33803Bm
    /* renamed from: a */
    public final Thread mo20706a() {
        return Looper.getMainLooper().getThread();
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC33803Bm
    /* renamed from: b */
    public final StackTraceElement[] mo20705b() {
        return null;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC33803Bm
    /* renamed from: c */
    public final Map mo20704c() {
        return Thread.getAllStackTraces();
    }
}
