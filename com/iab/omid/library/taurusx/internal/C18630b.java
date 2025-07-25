package com.iab.omid.library.taurusx.internal;

import android.annotation.SuppressLint;
import android.view.View;
import com.iab.omid.library.taurusx.adsession.C18621a;

/* renamed from: com.iab.omid.library.taurusx.internal.b */
/* loaded from: classes6.dex */
public class C18630b extends C18632d {
    @SuppressLint({"StaticFieldLeak"})

    /* renamed from: d */
    private static C18630b f46627d = new C18630b();

    private C18630b() {
    }

    /* renamed from: g */
    public static C18630b m61989g() {
        return f46627d;
    }

    @Override // com.iab.omid.library.taurusx.internal.C18632d
    /* renamed from: b */
    public void mo61976b(boolean z) {
        for (C18621a c18621a : C18631c.m61984c().m61986b()) {
            c18621a.getAdSessionStatePublisher().m61918a(z);
        }
    }

    @Override // com.iab.omid.library.taurusx.internal.C18632d
    /* renamed from: d */
    public boolean mo61974d() {
        for (C18621a c18621a : C18631c.m61984c().m61988a()) {
            View m62027c = c18621a.m62027c();
            if (m62027c != null && m62027c.hasWindowFocus()) {
                return true;
            }
        }
        return false;
    }
}
