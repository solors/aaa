package com.iab.omid.library.bytedance2.internal;

import android.annotation.SuppressLint;
import android.content.Context;

/* renamed from: com.iab.omid.library.bytedance2.internal.g */
/* loaded from: classes6.dex */
public class C17996g {
    @SuppressLint({"StaticFieldLeak"})

    /* renamed from: b */
    private static C17996g f45332b = new C17996g();

    /* renamed from: a */
    private Context f45333a;

    private C17996g() {
    }

    /* renamed from: b */
    public static C17996g m64405b() {
        return f45332b;
    }

    /* renamed from: a */
    public Context m64407a() {
        return this.f45333a;
    }

    /* renamed from: a */
    public void m64406a(Context context) {
        this.f45333a = context != null ? context.getApplicationContext() : null;
    }
}
