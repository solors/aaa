package com.iab.omid.library.vungle.internal;

import android.annotation.SuppressLint;
import android.view.View;
import com.iab.omid.library.vungle.adsession.C18737a;

/* renamed from: com.iab.omid.library.vungle.internal.b */
/* loaded from: classes6.dex */
public class C18746b extends C18748d {
    @SuppressLint({"StaticFieldLeak"})

    /* renamed from: d */
    private static C18746b f46882d = new C18746b();

    private C18746b() {
    }

    /* renamed from: g */
    public static C18746b m61523g() {
        return f46882d;
    }

    @Override // com.iab.omid.library.vungle.internal.C18748d
    /* renamed from: b */
    public void mo61510b(boolean z) {
        for (C18737a c18737a : C18747c.m61518c().m61520b()) {
            c18737a.getAdSessionStatePublisher().m61439a(z);
        }
    }

    @Override // com.iab.omid.library.vungle.internal.C18748d
    /* renamed from: d */
    public boolean mo61508d() {
        for (C18737a c18737a : C18747c.m61518c().m61522a()) {
            View m61559c = c18737a.m61559c();
            if (m61559c != null && m61559c.hasWindowFocus()) {
                return true;
            }
        }
        return false;
    }
}
