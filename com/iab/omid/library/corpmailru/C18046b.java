package com.iab.omid.library.corpmailru;

import android.content.Context;
import com.iab.omid.library.corpmailru.p393b.C18048b;
import com.iab.omid.library.corpmailru.p393b.C18051d;
import com.iab.omid.library.corpmailru.p393b.C18054f;
import com.iab.omid.library.corpmailru.p395d.C18062b;
import com.iab.omid.library.corpmailru.p395d.C18066e;

/* renamed from: com.iab.omid.library.corpmailru.b */
/* loaded from: classes6.dex */
public class C18046b {

    /* renamed from: a */
    private boolean f45434a;

    /* renamed from: b */
    private void m64207b(Context context) {
        C18066e.m64120a(context, "Application Context cannot be null");
    }

    /* renamed from: a */
    public String m64211a() {
        return "1.3.20-Corpmailru";
    }

    /* renamed from: a */
    public void m64210a(Context context) {
        m64207b(context);
        if (m64208b()) {
            return;
        }
        m64209a(true);
        C18054f.m64167a().m64165a(context);
        C18048b.m64199a().m64198a(context);
        C18062b.m64140a(context);
        C18051d.m64187a().m64186a(context);
    }

    /* renamed from: b */
    public boolean m64208b() {
        return this.f45434a;
    }

    /* renamed from: a */
    public void m64209a(boolean z) {
        this.f45434a = z;
    }
}
