package com.iab.omid.library.ironsrc.internal;

import android.annotation.SuppressLint;
import android.content.Context;

/* renamed from: com.iab.omid.library.ironsrc.internal.f */
/* loaded from: classes6.dex */
public class C18242f {
    @SuppressLint({"StaticFieldLeak"})

    /* renamed from: b */
    private static C18242f f45838b = new C18242f();

    /* renamed from: a */
    private Context f45839a;

    private C18242f() {
    }

    /* renamed from: b */
    public static C18242f m63465b() {
        return f45838b;
    }

    /* renamed from: a */
    public Context m63467a() {
        return this.f45839a;
    }

    /* renamed from: a */
    public void m63466a(Context context) {
        this.f45839a = context != null ? context.getApplicationContext() : null;
    }
}
