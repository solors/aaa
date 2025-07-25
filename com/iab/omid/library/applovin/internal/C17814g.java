package com.iab.omid.library.applovin.internal;

import android.annotation.SuppressLint;
import android.content.Context;

/* renamed from: com.iab.omid.library.applovin.internal.g */
/* loaded from: classes6.dex */
public class C17814g {
    @SuppressLint({"StaticFieldLeak"})

    /* renamed from: b */
    private static C17814g f44947b = new C17814g();

    /* renamed from: a */
    private Context f44948a;

    private C17814g() {
    }

    /* renamed from: b */
    public static C17814g m65113b() {
        return f44947b;
    }

    /* renamed from: a */
    public Context m65115a() {
        return this.f44948a;
    }

    /* renamed from: a */
    public void m65114a(Context context) {
        this.f44948a = context != null ? context.getApplicationContext() : null;
    }
}
