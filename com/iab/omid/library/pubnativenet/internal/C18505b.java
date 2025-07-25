package com.iab.omid.library.pubnativenet.internal;

import android.annotation.SuppressLint;
import android.view.View;
import com.iab.omid.library.pubnativenet.adsession.C18496a;

/* renamed from: com.iab.omid.library.pubnativenet.internal.b */
/* loaded from: classes6.dex */
public class C18505b extends C18507d {
    @SuppressLint({"StaticFieldLeak"})

    /* renamed from: d */
    private static C18505b f46356d = new C18505b();

    private C18505b() {
    }

    /* renamed from: g */
    public static C18505b m62498g() {
        return f46356d;
    }

    @Override // com.iab.omid.library.pubnativenet.internal.C18507d
    /* renamed from: b */
    public void mo62485b(boolean z) {
        for (C18496a c18496a : C18506c.m62493c().m62495b()) {
            c18496a.getAdSessionStatePublisher().m62414a(z);
        }
    }

    @Override // com.iab.omid.library.pubnativenet.internal.C18507d
    /* renamed from: d */
    public boolean mo62483d() {
        for (C18496a c18496a : C18506c.m62493c().m62497a()) {
            View m62534c = c18496a.m62534c();
            if (m62534c != null && m62534c.hasWindowFocus()) {
                return true;
            }
        }
        return false;
    }
}
