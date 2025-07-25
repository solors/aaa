package com.iab.omid.library.mobilefuse.internal;

import android.annotation.SuppressLint;
import android.content.Context;

/* renamed from: com.iab.omid.library.mobilefuse.internal.g */
/* loaded from: classes6.dex */
public class C18371g {
    @SuppressLint({"StaticFieldLeak"})

    /* renamed from: b */
    private static C18371g f46099b = new C18371g();

    /* renamed from: a */
    private Context f46100a;

    private C18371g() {
    }

    /* renamed from: b */
    public static C18371g m62973b() {
        return f46099b;
    }

    /* renamed from: a */
    public Context m62975a() {
        return this.f46100a;
    }

    /* renamed from: a */
    public void m62974a(Context context) {
        this.f46100a = context != null ? context.getApplicationContext() : null;
    }
}
