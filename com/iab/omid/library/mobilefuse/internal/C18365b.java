package com.iab.omid.library.mobilefuse.internal;

import android.annotation.SuppressLint;
import android.view.View;
import com.iab.omid.library.mobilefuse.adsession.C18356a;

/* renamed from: com.iab.omid.library.mobilefuse.internal.b */
/* loaded from: classes6.dex */
public class C18365b extends C18367d {
    @SuppressLint({"StaticFieldLeak"})

    /* renamed from: d */
    private static C18365b f46086d = new C18365b();

    private C18365b() {
    }

    /* renamed from: g */
    public static C18365b m63004g() {
        return f46086d;
    }

    @Override // com.iab.omid.library.mobilefuse.internal.C18367d
    /* renamed from: b */
    public void mo62991b(boolean z) {
        for (C18356a c18356a : C18366c.m62999c().m63001b()) {
            c18356a.getAdSessionStatePublisher().m62920a(z);
        }
    }

    @Override // com.iab.omid.library.mobilefuse.internal.C18367d
    /* renamed from: d */
    public boolean mo62989d() {
        for (C18356a c18356a : C18366c.m62999c().m63003a()) {
            View m63040c = c18356a.m63040c();
            if (m63040c != null && m63040c.hasWindowFocus()) {
                return true;
            }
        }
        return false;
    }
}
