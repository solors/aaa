package com.iab.omid.library.inmobi.internal;

import android.annotation.SuppressLint;
import android.view.View;
import com.iab.omid.library.inmobi.adsession.C18169a;

/* renamed from: com.iab.omid.library.inmobi.internal.b */
/* loaded from: classes6.dex */
public class C18178b extends C18180d {
    @SuppressLint({"StaticFieldLeak"})

    /* renamed from: d */
    private static C18178b f45697d = new C18178b();

    private C18178b() {
    }

    /* renamed from: g */
    public static C18178b m63733g() {
        return f45697d;
    }

    @Override // com.iab.omid.library.inmobi.internal.C18180d
    /* renamed from: b */
    public void mo63720b(boolean z) {
        for (C18169a c18169a : C18179c.m63728c().m63730b()) {
            c18169a.getAdSessionStatePublisher().m63656a(z);
        }
    }

    @Override // com.iab.omid.library.inmobi.internal.C18180d
    /* renamed from: d */
    public boolean mo63718d() {
        for (C18169a c18169a : C18179c.m63728c().m63732a()) {
            View m63769c = c18169a.m63769c();
            if (m63769c != null && m63769c.hasWindowFocus()) {
                return true;
            }
        }
        return false;
    }
}
