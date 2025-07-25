package com.iab.omid.library.amazon.internal;

import android.annotation.SuppressLint;
import android.content.Context;

/* renamed from: com.iab.omid.library.amazon.internal.g */
/* loaded from: classes6.dex */
public class C17753g {
    @SuppressLint({"StaticFieldLeak"})

    /* renamed from: b */
    private static C17753g f44818b = new C17753g();

    /* renamed from: a */
    private Context f44819a;

    private C17753g() {
    }

    /* renamed from: b */
    public static C17753g m65354b() {
        return f44818b;
    }

    /* renamed from: a */
    public Context m65356a() {
        return this.f44819a;
    }

    /* renamed from: a */
    public void m65355a(Context context) {
        this.f44819a = context != null ? context.getApplicationContext() : null;
    }
}
