package com.iab.omid.library.vungle.internal;

import android.annotation.SuppressLint;
import android.content.Context;

/* renamed from: com.iab.omid.library.vungle.internal.g */
/* loaded from: classes6.dex */
public class C18752g {
    @SuppressLint({"StaticFieldLeak"})

    /* renamed from: b */
    private static C18752g f46895b = new C18752g();

    /* renamed from: a */
    private Context f46896a;

    private C18752g() {
    }

    /* renamed from: b */
    public static C18752g m61492b() {
        return f46895b;
    }

    /* renamed from: a */
    public Context m61494a() {
        return this.f46896a;
    }

    /* renamed from: a */
    public void m61493a(Context context) {
        this.f46896a = context != null ? context.getApplicationContext() : null;
    }
}
