package com.yandex.mobile.ads.impl;

import android.annotation.SuppressLint;
import android.content.Context;

/* loaded from: classes8.dex */
public final class ti2 {
    @SuppressLint({"StaticFieldLeak"})

    /* renamed from: b */
    private static ti2 f85713b = new ti2();

    /* renamed from: a */
    private Context f85714a;

    private ti2() {
    }

    /* renamed from: a */
    public static ti2 m29147a() {
        return f85713b;
    }

    /* renamed from: b */
    public final Context m29145b() {
        return this.f85714a;
    }

    /* renamed from: a */
    public final void m29146a(Context context) {
        this.f85714a = context != null ? context.getApplicationContext() : null;
    }
}
