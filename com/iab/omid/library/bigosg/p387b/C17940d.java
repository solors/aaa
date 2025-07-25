package com.iab.omid.library.bigosg.p387b;

import android.annotation.SuppressLint;
import android.content.Context;

/* renamed from: com.iab.omid.library.bigosg.b.d */
/* loaded from: classes6.dex */
public class C17940d {
    @SuppressLint({"StaticFieldLeak"})

    /* renamed from: a */
    private static C17940d f45204a = new C17940d();

    /* renamed from: b */
    private Context f45205b;

    private C17940d() {
    }

    /* renamed from: a */
    public static C17940d m64637a() {
        return f45204a;
    }

    /* renamed from: b */
    public Context m64635b() {
        return this.f45205b;
    }

    /* renamed from: a */
    public void m64636a(Context context) {
        this.f45205b = context != null ? context.getApplicationContext() : null;
    }
}
