package com.iab.omid.library.fyber.internal;

import android.annotation.SuppressLint;
import android.content.Context;

/* renamed from: com.iab.omid.library.fyber.internal.g */
/* loaded from: classes6.dex */
public class C18114g {
    @SuppressLint({"StaticFieldLeak"})

    /* renamed from: b */
    private static C18114g f45575b = new C18114g();

    /* renamed from: a */
    private Context f45576a;

    private C18114g() {
    }

    /* renamed from: b */
    public static C18114g m63955b() {
        return f45575b;
    }

    /* renamed from: a */
    public Context m63957a() {
        return this.f45576a;
    }

    /* renamed from: a */
    public void m63956a(Context context) {
        this.f45576a = context != null ? context.getApplicationContext() : null;
    }
}
