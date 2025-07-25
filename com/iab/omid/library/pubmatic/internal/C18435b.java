package com.iab.omid.library.pubmatic.internal;

import android.annotation.SuppressLint;
import android.view.View;
import com.iab.omid.library.pubmatic.adsession.C18426a;

/* renamed from: com.iab.omid.library.pubmatic.internal.b */
/* loaded from: classes6.dex */
public class C18435b extends C18437d {
    @SuppressLint({"StaticFieldLeak"})

    /* renamed from: d */
    private static C18435b f46221d = new C18435b();

    private C18435b() {
    }

    /* renamed from: g */
    public static C18435b m62751g() {
        return f46221d;
    }

    @Override // com.iab.omid.library.pubmatic.internal.C18437d
    /* renamed from: b */
    public void mo62738b(boolean z) {
        for (C18426a c18426a : C18436c.m62746c().m62748b()) {
            c18426a.getAdSessionStatePublisher().m62667a(z);
        }
    }

    @Override // com.iab.omid.library.pubmatic.internal.C18437d
    /* renamed from: d */
    public boolean mo62736d() {
        for (C18426a c18426a : C18436c.m62746c().m62750a()) {
            View m62787c = c18426a.m62787c();
            if (m62787c != null && m62787c.hasWindowFocus()) {
                return true;
            }
        }
        return false;
    }
}
