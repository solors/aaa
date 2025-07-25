package com.applovin.impl;

import android.os.Trace;

/* renamed from: com.applovin.impl.ko */
/* loaded from: classes2.dex */
public abstract class AbstractC4727ko {
    /* renamed from: a */
    public static void m97907a(String str) {
        if (AbstractC5863xp.f12151a >= 18) {
            m97905b(str);
        }
    }

    /* renamed from: b */
    private static void m97905b(String str) {
        Trace.beginSection(str);
    }

    /* renamed from: b */
    private static void m97906b() {
        Trace.endSection();
    }

    /* renamed from: a */
    public static void m97908a() {
        if (AbstractC5863xp.f12151a >= 18) {
            m97906b();
        }
    }
}
