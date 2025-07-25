package com.iab.omid.library.bytedance2.internal;

import android.annotation.SuppressLint;
import android.view.View;
import com.iab.omid.library.bytedance2.adsession.C17981a;

/* renamed from: com.iab.omid.library.bytedance2.internal.b */
/* loaded from: classes6.dex */
public class C17990b extends C17992d {
    @SuppressLint({"StaticFieldLeak"})

    /* renamed from: d */
    private static C17990b f45319d = new C17990b();

    private C17990b() {
    }

    /* renamed from: g */
    public static C17990b m64436g() {
        return f45319d;
    }

    @Override // com.iab.omid.library.bytedance2.internal.C17992d
    /* renamed from: b */
    public void mo64423b(boolean z) {
        for (C17981a c17981a : C17991c.m64431c().m64433b()) {
            c17981a.getAdSessionStatePublisher().m64359a(z);
        }
    }

    @Override // com.iab.omid.library.bytedance2.internal.C17992d
    /* renamed from: d */
    public boolean mo64421d() {
        for (C17981a c17981a : C17991c.m64431c().m64435a()) {
            View m64472c = c17981a.m64472c();
            if (m64472c != null && m64472c.hasWindowFocus()) {
                return true;
            }
        }
        return false;
    }
}
