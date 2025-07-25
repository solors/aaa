package com.iab.omid.library.applovin.internal;

import android.annotation.SuppressLint;
import android.view.View;
import com.iab.omid.library.applovin.adsession.C17799a;

/* renamed from: com.iab.omid.library.applovin.internal.b */
/* loaded from: classes6.dex */
public class C17808b extends C17810d {
    @SuppressLint({"StaticFieldLeak"})

    /* renamed from: d */
    private static C17808b f44934d = new C17808b();

    private C17808b() {
    }

    /* renamed from: g */
    public static C17808b m65144g() {
        return f44934d;
    }

    @Override // com.iab.omid.library.applovin.internal.C17810d
    /* renamed from: b */
    public void mo65131b(boolean z) {
        for (C17799a c17799a : C17809c.m65139c().m65141b()) {
            c17799a.getAdSessionStatePublisher().m65067a(z);
        }
    }

    @Override // com.iab.omid.library.applovin.internal.C17810d
    /* renamed from: d */
    public boolean mo65129d() {
        for (C17799a c17799a : C17809c.m65139c().m65143a()) {
            View m65180c = c17799a.m65180c();
            if (m65180c != null && m65180c.hasWindowFocus()) {
                return true;
            }
        }
        return false;
    }
}
