package com.iab.omid.library.smaato.internal;

import android.annotation.SuppressLint;
import android.content.Context;

/* renamed from: com.iab.omid.library.smaato.internal.g */
/* loaded from: classes6.dex */
public class C18574g {
    @SuppressLint({"StaticFieldLeak"})

    /* renamed from: b */
    private static C18574g f46504b = new C18574g();

    /* renamed from: a */
    private Context f46505a;

    private C18574g() {
    }

    /* renamed from: b */
    public static C18574g m62214b() {
        return f46504b;
    }

    /* renamed from: a */
    public Context m62216a() {
        return this.f46505a;
    }

    /* renamed from: a */
    public void m62215a(Context context) {
        this.f46505a = context != null ? context.getApplicationContext() : null;
    }
}
