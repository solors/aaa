package com.iab.omid.library.appodeal.internal;

import android.annotation.SuppressLint;
import android.content.Context;

/* renamed from: com.iab.omid.library.appodeal.internal.g */
/* loaded from: classes6.dex */
public class C17882g {
    @SuppressLint({"StaticFieldLeak"})

    /* renamed from: b */
    private static C17882g f45076b = new C17882g();

    /* renamed from: a */
    private Context f45077a;

    private C17882g() {
    }

    /* renamed from: b */
    public static C17882g m64872b() {
        return f45076b;
    }

    /* renamed from: a */
    public Context m64874a() {
        return this.f45077a;
    }

    /* renamed from: a */
    public void m64873a(Context context) {
        this.f45077a = context != null ? context.getApplicationContext() : null;
    }
}
