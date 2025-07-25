package com.iab.omid.library.ironsrc;

import android.content.Context;
import com.iab.omid.library.ironsrc.internal.C18236a;
import com.iab.omid.library.ironsrc.internal.C18237b;
import com.iab.omid.library.ironsrc.internal.C18242f;
import com.iab.omid.library.ironsrc.internal.C18245h;
import com.iab.omid.library.ironsrc.utils.C18255a;
import com.iab.omid.library.ironsrc.utils.C18257c;
import com.iab.omid.library.ironsrc.utils.C18261e;
import com.iab.omid.library.ironsrc.utils.C18264g;

/* renamed from: com.iab.omid.library.ironsrc.b */
/* loaded from: classes6.dex */
public class C18229b {

    /* renamed from: a */
    private boolean f45808a;

    /* renamed from: b */
    private void m63510b(Context context) {
        C18264g.m63368a(context, "Application Context cannot be null");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public String m63514a() {
        return "1.4.2-Ironsrc";
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public void m63509c() {
        C18264g.m63371a();
        C18236a.m63494a().m63490d();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m63513a(Context context) {
        m63510b(context);
        if (m63511b()) {
            return;
        }
        m63512a(true);
        C18245h.m63441c().m63444a(context);
        C18237b.m63489g().m63480a(context);
        C18255a.m63404a(context);
        C18257c.m63397a(context);
        C18261e.m63375a(context);
        C18242f.m63465b().m63466a(context);
        C18236a.m63494a().m63493a(context);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public boolean m63511b() {
        return this.f45808a;
    }

    /* renamed from: a */
    void m63512a(boolean z) {
        this.f45808a = z;
    }
}
