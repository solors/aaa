package com.iab.omid.library.smaato;

import android.content.Context;
import com.iab.omid.library.smaato.internal.C18567a;
import com.iab.omid.library.smaato.internal.C18568b;
import com.iab.omid.library.smaato.internal.C18574g;
import com.iab.omid.library.smaato.internal.C18577i;
import com.iab.omid.library.smaato.internal.C18578j;
import com.iab.omid.library.smaato.utils.C18590a;
import com.iab.omid.library.smaato.utils.C18592c;
import com.iab.omid.library.smaato.utils.C18596e;
import com.iab.omid.library.smaato.utils.C18599g;

/* renamed from: com.iab.omid.library.smaato.b */
/* loaded from: classes6.dex */
public class C18560b {

    /* renamed from: a */
    private boolean f46472a;

    /* renamed from: b */
    private void m62266b(Context context) {
        C18599g.m62108a(context, "Application Context cannot be null");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public String m62270a() {
        return "1.5.0-Smaato";
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public void m62265c() {
        C18599g.m62111a();
        C18567a.m62250a().m62246d();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m62269a(Context context) {
        m62266b(context);
        if (m62267b()) {
            return;
        }
        m62268a(true);
        C18577i.m62190c().m62193a(context);
        C18568b.m62245g().m62236a(context);
        C18590a.m62146a(context);
        C18592c.m62139a(context);
        C18596e.m62115a(context);
        C18574g.m62214b().m62215a(context);
        C18567a.m62250a().m62249a(context);
        C18578j.m62182b().m62186a(context);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public boolean m62267b() {
        return this.f46472a;
    }

    /* renamed from: a */
    void m62268a(boolean z) {
        this.f46472a = z;
    }
}
