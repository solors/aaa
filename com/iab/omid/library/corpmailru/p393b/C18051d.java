package com.iab.omid.library.corpmailru.p393b;

import android.annotation.SuppressLint;
import android.content.Context;

/* renamed from: com.iab.omid.library.corpmailru.b.d */
/* loaded from: classes6.dex */
public class C18051d {
    @SuppressLint({"StaticFieldLeak"})

    /* renamed from: a */
    private static C18051d f45446a = new C18051d();

    /* renamed from: b */
    private Context f45447b;

    private C18051d() {
    }

    /* renamed from: a */
    public static C18051d m64187a() {
        return f45446a;
    }

    /* renamed from: b */
    public Context m64185b() {
        return this.f45447b;
    }

    /* renamed from: a */
    public void m64186a(Context context) {
        this.f45447b = context != null ? context.getApplicationContext() : null;
    }
}
