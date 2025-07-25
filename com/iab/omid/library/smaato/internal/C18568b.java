package com.iab.omid.library.smaato.internal;

import android.annotation.SuppressLint;
import android.view.View;
import com.iab.omid.library.smaato.adsession.C18559a;

/* renamed from: com.iab.omid.library.smaato.internal.b */
/* loaded from: classes6.dex */
public class C18568b extends C18570d {
    @SuppressLint({"StaticFieldLeak"})

    /* renamed from: d */
    private static C18568b f46491d = new C18568b();

    private C18568b() {
    }

    /* renamed from: g */
    public static C18568b m62245g() {
        return f46491d;
    }

    @Override // com.iab.omid.library.smaato.internal.C18570d
    /* renamed from: b */
    public void mo62232b(boolean z) {
        for (C18559a c18559a : C18569c.m62240c().m62242b()) {
            c18559a.getAdSessionStatePublisher().m62161a(z);
        }
    }

    @Override // com.iab.omid.library.smaato.internal.C18570d
    /* renamed from: d */
    public boolean mo62230d() {
        for (C18559a c18559a : C18569c.m62240c().m62244a()) {
            View m62281c = c18559a.m62281c();
            if (m62281c != null && m62281c.hasWindowFocus()) {
                return true;
            }
        }
        return false;
    }
}
