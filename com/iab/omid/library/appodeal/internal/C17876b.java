package com.iab.omid.library.appodeal.internal;

import android.annotation.SuppressLint;
import android.view.View;
import com.iab.omid.library.appodeal.adsession.C17867a;

/* renamed from: com.iab.omid.library.appodeal.internal.b */
/* loaded from: classes6.dex */
public class C17876b extends C17878d {
    @SuppressLint({"StaticFieldLeak"})

    /* renamed from: d */
    private static C17876b f45063d = new C17876b();

    private C17876b() {
    }

    /* renamed from: g */
    public static C17876b m64903g() {
        return f45063d;
    }

    @Override // com.iab.omid.library.appodeal.internal.C17878d
    /* renamed from: b */
    public void mo64890b(boolean z) {
        for (C17867a c17867a : C17877c.m64898c().m64900b()) {
            c17867a.getAdSessionStatePublisher().m64819a(z);
        }
    }

    @Override // com.iab.omid.library.appodeal.internal.C17878d
    /* renamed from: d */
    public boolean mo64888d() {
        for (C17867a c17867a : C17877c.m64898c().m64902a()) {
            View m64939c = c17867a.m64939c();
            if (m64939c != null && m64939c.hasWindowFocus()) {
                return true;
            }
        }
        return false;
    }
}
