package com.iab.omid.library.pubnativenet.internal;

import android.annotation.SuppressLint;
import android.content.Context;

/* renamed from: com.iab.omid.library.pubnativenet.internal.g */
/* loaded from: classes6.dex */
public class C18511g {
    @SuppressLint({"StaticFieldLeak"})

    /* renamed from: b */
    private static C18511g f46369b = new C18511g();

    /* renamed from: a */
    private Context f46370a;

    private C18511g() {
    }

    /* renamed from: b */
    public static C18511g m62467b() {
        return f46369b;
    }

    /* renamed from: a */
    public Context m62469a() {
        return this.f46370a;
    }

    /* renamed from: a */
    public void m62468a(Context context) {
        this.f46370a = context != null ? context.getApplicationContext() : null;
    }
}
