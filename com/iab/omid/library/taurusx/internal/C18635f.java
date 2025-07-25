package com.iab.omid.library.taurusx.internal;

import android.annotation.SuppressLint;
import android.content.Context;

/* renamed from: com.iab.omid.library.taurusx.internal.f */
/* loaded from: classes6.dex */
public class C18635f {
    @SuppressLint({"StaticFieldLeak"})

    /* renamed from: b */
    private static C18635f f46638b = new C18635f();

    /* renamed from: a */
    private Context f46639a;

    private C18635f() {
    }

    /* renamed from: b */
    public static C18635f m61965b() {
        return f46638b;
    }

    /* renamed from: a */
    public Context m61967a() {
        return this.f46639a;
    }

    /* renamed from: a */
    public void m61966a(Context context) {
        this.f46639a = context != null ? context.getApplicationContext() : null;
    }
}
