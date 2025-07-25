package com.iab.omid.library.mmadbridge.internal;

import android.annotation.SuppressLint;
import android.view.View;
import com.iab.omid.library.mmadbridge.adsession.C18286a;

/* renamed from: com.iab.omid.library.mmadbridge.internal.b */
/* loaded from: classes6.dex */
public class C18295b extends C18297d {
    @SuppressLint({"StaticFieldLeak"})

    /* renamed from: d */
    private static C18295b f45951d = new C18295b();

    private C18295b() {
    }

    /* renamed from: g */
    public static C18295b m63257g() {
        return f45951d;
    }

    @Override // com.iab.omid.library.mmadbridge.internal.C18297d
    /* renamed from: b */
    public void mo63244b(boolean z) {
        for (C18286a c18286a : C18296c.m63252c().m63254b()) {
            c18286a.getAdSessionStatePublisher().m63173a(z);
        }
    }

    @Override // com.iab.omid.library.mmadbridge.internal.C18297d
    /* renamed from: d */
    public boolean mo63242d() {
        for (C18286a c18286a : C18296c.m63252c().m63256a()) {
            View m63293c = c18286a.m63293c();
            if (m63293c != null && m63293c.hasWindowFocus()) {
                return true;
            }
        }
        return false;
    }
}
