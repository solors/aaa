package com.iab.omid.library.pubmatic;

import android.content.Context;
import com.iab.omid.library.pubmatic.internal.C18434a;
import com.iab.omid.library.pubmatic.internal.C18435b;
import com.iab.omid.library.pubmatic.internal.C18441g;
import com.iab.omid.library.pubmatic.internal.C18444i;
import com.iab.omid.library.pubmatic.internal.C18445j;
import com.iab.omid.library.pubmatic.utils.C18457a;
import com.iab.omid.library.pubmatic.utils.C18459c;
import com.iab.omid.library.pubmatic.utils.C18463e;
import com.iab.omid.library.pubmatic.utils.C18466g;

/* renamed from: com.iab.omid.library.pubmatic.b */
/* loaded from: classes6.dex */
public class C18427b {

    /* renamed from: a */
    private boolean f46202a;

    /* renamed from: b */
    private void m62772b(Context context) {
        C18466g.m62614a(context, "Application Context cannot be null");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public String m62776a() {
        return "1.5.1-Pubmatic";
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public void m62771c() {
        C18466g.m62617a();
        C18434a.m62756a().m62752d();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m62775a(Context context) {
        m62772b(context);
        if (m62773b()) {
            return;
        }
        m62774a(true);
        C18444i.m62696c().m62699a(context);
        C18435b.m62751g().m62742a(context);
        C18457a.m62652a(context);
        C18459c.m62645a(context);
        C18463e.m62621a(context);
        C18441g.m62720b().m62721a(context);
        C18434a.m62756a().m62755a(context);
        C18445j.m62688b().m62692a(context);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public boolean m62773b() {
        return this.f46202a;
    }

    /* renamed from: a */
    void m62774a(boolean z) {
        this.f46202a = z;
    }
}
