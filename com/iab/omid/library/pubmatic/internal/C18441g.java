package com.iab.omid.library.pubmatic.internal;

import android.annotation.SuppressLint;
import android.content.Context;

/* renamed from: com.iab.omid.library.pubmatic.internal.g */
/* loaded from: classes6.dex */
public class C18441g {
    @SuppressLint({"StaticFieldLeak"})

    /* renamed from: b */
    private static C18441g f46234b = new C18441g();

    /* renamed from: a */
    private Context f46235a;

    private C18441g() {
    }

    /* renamed from: b */
    public static C18441g m62720b() {
        return f46234b;
    }

    /* renamed from: a */
    public Context m62722a() {
        return this.f46235a;
    }

    /* renamed from: a */
    public void m62721a(Context context) {
        this.f46235a = context != null ? context.getApplicationContext() : null;
    }
}
