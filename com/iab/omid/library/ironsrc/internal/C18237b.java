package com.iab.omid.library.ironsrc.internal;

import android.annotation.SuppressLint;
import android.view.View;
import com.iab.omid.library.ironsrc.adsession.C18228a;

/* renamed from: com.iab.omid.library.ironsrc.internal.b */
/* loaded from: classes6.dex */
public class C18237b extends C18239d {
    @SuppressLint({"StaticFieldLeak"})

    /* renamed from: d */
    private static C18237b f45827d = new C18237b();

    private C18237b() {
    }

    /* renamed from: g */
    public static C18237b m63489g() {
        return f45827d;
    }

    @Override // com.iab.omid.library.ironsrc.internal.C18239d
    /* renamed from: b */
    public void mo63476b(boolean z) {
        for (C18228a c18228a : C18238c.m63484c().m63486b()) {
            c18228a.getAdSessionStatePublisher().m63418a(z);
        }
    }

    @Override // com.iab.omid.library.ironsrc.internal.C18239d
    /* renamed from: d */
    public boolean mo63474d() {
        for (C18228a c18228a : C18238c.m63484c().m63488a()) {
            View m63527c = c18228a.m63527c();
            if (m63527c != null && m63527c.hasWindowFocus()) {
                return true;
            }
        }
        return false;
    }
}
