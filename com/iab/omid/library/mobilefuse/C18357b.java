package com.iab.omid.library.mobilefuse;

import android.content.Context;
import com.iab.omid.library.mobilefuse.internal.C18364a;
import com.iab.omid.library.mobilefuse.internal.C18365b;
import com.iab.omid.library.mobilefuse.internal.C18371g;
import com.iab.omid.library.mobilefuse.internal.C18374i;
import com.iab.omid.library.mobilefuse.internal.C18375j;
import com.iab.omid.library.mobilefuse.utils.C18387a;
import com.iab.omid.library.mobilefuse.utils.C18389c;
import com.iab.omid.library.mobilefuse.utils.C18393e;
import com.iab.omid.library.mobilefuse.utils.C18396g;

/* renamed from: com.iab.omid.library.mobilefuse.b */
/* loaded from: classes6.dex */
public class C18357b {

    /* renamed from: a */
    private boolean f46067a;

    /* renamed from: b */
    private void m63025b(Context context) {
        C18396g.m62867a(context, "Application Context cannot be null");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public String m63029a() {
        return "1.4.13-Mobilefuse";
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public void m63024c() {
        C18396g.m62870a();
        C18364a.m63009a().m63005d();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m63028a(Context context) {
        m63025b(context);
        if (m63026b()) {
            return;
        }
        m63027a(true);
        C18374i.m62949c().m62952a(context);
        C18365b.m63004g().m62995a(context);
        C18387a.m62905a(context);
        C18389c.m62898a(context);
        C18393e.m62874a(context);
        C18371g.m62973b().m62974a(context);
        C18364a.m63009a().m63008a(context);
        C18375j.m62941b().m62945a(context);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public boolean m63026b() {
        return this.f46067a;
    }

    /* renamed from: a */
    void m63027a(boolean z) {
        this.f46067a = z;
    }
}
