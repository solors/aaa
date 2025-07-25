package com.iab.omid.library.amazon.internal;

import android.annotation.SuppressLint;
import android.view.View;
import com.iab.omid.library.amazon.adsession.C17738a;

/* renamed from: com.iab.omid.library.amazon.internal.b */
/* loaded from: classes6.dex */
public class C17747b extends C17749d {
    @SuppressLint({"StaticFieldLeak"})

    /* renamed from: d */
    private static C17747b f44805d = new C17747b();

    private C17747b() {
    }

    /* renamed from: g */
    public static C17747b m65385g() {
        return f44805d;
    }

    @Override // com.iab.omid.library.amazon.internal.C17749d
    /* renamed from: b */
    public void mo65372b(boolean z) {
        for (C17738a c17738a : C17748c.m65380c().m65382b()) {
            c17738a.getAdSessionStatePublisher().m65308a(z);
        }
    }

    @Override // com.iab.omid.library.amazon.internal.C17749d
    /* renamed from: d */
    public boolean mo65370d() {
        for (C17738a c17738a : C17748c.m65380c().m65384a()) {
            View m65421c = c17738a.m65421c();
            if (m65421c != null && m65421c.hasWindowFocus()) {
                return true;
            }
        }
        return false;
    }
}
