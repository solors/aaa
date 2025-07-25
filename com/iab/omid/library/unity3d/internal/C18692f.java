package com.iab.omid.library.unity3d.internal;

import android.annotation.SuppressLint;
import android.content.Context;

/* renamed from: com.iab.omid.library.unity3d.internal.f */
/* loaded from: classes6.dex */
public class C18692f {
    @SuppressLint({"StaticFieldLeak"})

    /* renamed from: b */
    private static C18692f f46766b = new C18692f();

    /* renamed from: a */
    private Context f46767a;

    private C18692f() {
    }

    /* renamed from: b */
    public static C18692f m61730b() {
        return f46766b;
    }

    /* renamed from: a */
    public Context m61732a() {
        return this.f46767a;
    }

    /* renamed from: a */
    public void m61731a(Context context) {
        this.f46767a = context != null ? context.getApplicationContext() : null;
    }
}
