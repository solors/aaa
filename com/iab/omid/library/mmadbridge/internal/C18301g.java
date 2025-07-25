package com.iab.omid.library.mmadbridge.internal;

import android.annotation.SuppressLint;
import android.content.Context;

/* renamed from: com.iab.omid.library.mmadbridge.internal.g */
/* loaded from: classes6.dex */
public class C18301g {
    @SuppressLint({"StaticFieldLeak"})

    /* renamed from: b */
    private static C18301g f45964b = new C18301g();

    /* renamed from: a */
    private Context f45965a;

    private C18301g() {
    }

    /* renamed from: b */
    public static C18301g m63226b() {
        return f45964b;
    }

    /* renamed from: a */
    public Context m63228a() {
        return this.f45965a;
    }

    /* renamed from: a */
    public void m63227a(Context context) {
        this.f45965a = context != null ? context.getApplicationContext() : null;
    }
}
