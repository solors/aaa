package com.iab.omid.library.fyber;

import android.content.Context;
import com.iab.omid.library.fyber.internal.C18107a;
import com.iab.omid.library.fyber.internal.C18108b;
import com.iab.omid.library.fyber.internal.C18114g;
import com.iab.omid.library.fyber.internal.C18117i;
import com.iab.omid.library.fyber.internal.C18118j;
import com.iab.omid.library.fyber.utils.C18130a;
import com.iab.omid.library.fyber.utils.C18132c;
import com.iab.omid.library.fyber.utils.C18136e;
import com.iab.omid.library.fyber.utils.C18139g;

/* renamed from: com.iab.omid.library.fyber.b */
/* loaded from: classes6.dex */
public class C18100b {

    /* renamed from: a */
    private boolean f45543a;

    /* renamed from: b */
    private void m64007b(Context context) {
        C18139g.m63849a(context, "Application Context cannot be null");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public String m64011a() {
        return "1.5.1-Fyber";
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public void m64006c() {
        C18139g.m63852a();
        C18107a.m63991a().m63987d();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m64010a(Context context) {
        m64007b(context);
        if (m64008b()) {
            return;
        }
        m64009a(true);
        C18117i.m63931c().m63934a(context);
        C18108b.m63986g().m63977a(context);
        C18130a.m63887a(context);
        C18132c.m63880a(context);
        C18136e.m63856a(context);
        C18114g.m63955b().m63956a(context);
        C18107a.m63991a().m63990a(context);
        C18118j.m63923b().m63927a(context);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public boolean m64008b() {
        return this.f45543a;
    }

    /* renamed from: a */
    void m64009a(boolean z) {
        this.f45543a = z;
    }
}
