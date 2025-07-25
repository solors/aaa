package com.iab.omid.library.unity3d.internal;

import android.annotation.SuppressLint;
import android.view.View;
import com.iab.omid.library.unity3d.adsession.C18678a;

/* renamed from: com.iab.omid.library.unity3d.internal.b */
/* loaded from: classes6.dex */
public class C18687b extends C18689d {
    @SuppressLint({"StaticFieldLeak"})

    /* renamed from: d */
    private static C18687b f46755d = new C18687b();

    private C18687b() {
    }

    /* renamed from: g */
    public static C18687b m61754g() {
        return f46755d;
    }

    @Override // com.iab.omid.library.unity3d.internal.C18689d
    /* renamed from: b */
    public void mo61741b(boolean z) {
        for (C18678a c18678a : C18688c.m61749c().m61751b()) {
            c18678a.getAdSessionStatePublisher().m61684a(z);
        }
    }

    @Override // com.iab.omid.library.unity3d.internal.C18689d
    /* renamed from: d */
    public boolean mo61739d() {
        for (C18678a c18678a : C18688c.m61749c().m61753a()) {
            View m61792c = c18678a.m61792c();
            if (m61792c != null && m61792c.hasWindowFocus()) {
                return true;
            }
        }
        return false;
    }
}
