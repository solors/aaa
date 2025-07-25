package com.iab.omid.library.fyber.internal;

import android.annotation.SuppressLint;
import android.view.View;
import com.iab.omid.library.fyber.adsession.C18099a;

/* renamed from: com.iab.omid.library.fyber.internal.b */
/* loaded from: classes6.dex */
public class C18108b extends C18110d {
    @SuppressLint({"StaticFieldLeak"})

    /* renamed from: d */
    private static C18108b f45562d = new C18108b();

    private C18108b() {
    }

    /* renamed from: g */
    public static C18108b m63986g() {
        return f45562d;
    }

    @Override // com.iab.omid.library.fyber.internal.C18110d
    /* renamed from: b */
    public void mo63973b(boolean z) {
        for (C18099a c18099a : C18109c.m63981c().m63983b()) {
            c18099a.getAdSessionStatePublisher().m63902a(z);
        }
    }

    @Override // com.iab.omid.library.fyber.internal.C18110d
    /* renamed from: d */
    public boolean mo63971d() {
        for (C18099a c18099a : C18109c.m63981c().m63985a()) {
            View m64022c = c18099a.m64022c();
            if (m64022c != null && m64022c.hasWindowFocus()) {
                return true;
            }
        }
        return false;
    }
}
