package com.iab.omid.library.inmobi.internal;

import android.annotation.SuppressLint;
import android.content.Context;

/* renamed from: com.iab.omid.library.inmobi.internal.g */
/* loaded from: classes6.dex */
public class C18184g {
    @SuppressLint({"StaticFieldLeak"})

    /* renamed from: b */
    private static C18184g f45710b = new C18184g();

    /* renamed from: a */
    private Context f45711a;

    private C18184g() {
    }

    /* renamed from: b */
    public static C18184g m63702b() {
        return f45710b;
    }

    /* renamed from: a */
    public Context m63704a() {
        return this.f45711a;
    }

    /* renamed from: a */
    public void m63703a(Context context) {
        this.f45711a = context != null ? context.getApplicationContext() : null;
    }
}
