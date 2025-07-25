package com.iab.omid.library.vungle;

import android.content.Context;
import com.iab.omid.library.vungle.internal.C18745a;
import com.iab.omid.library.vungle.internal.C18746b;
import com.iab.omid.library.vungle.internal.C18752g;
import com.iab.omid.library.vungle.internal.C18755i;
import com.iab.omid.library.vungle.internal.C18756j;
import com.iab.omid.library.vungle.utils.C18768a;
import com.iab.omid.library.vungle.utils.C18770c;
import com.iab.omid.library.vungle.utils.C18774e;
import com.iab.omid.library.vungle.utils.C18777g;

/* renamed from: com.iab.omid.library.vungle.b */
/* loaded from: classes6.dex */
public class C18738b {

    /* renamed from: a */
    private boolean f46863a;

    /* renamed from: b */
    private void m61544b(Context context) {
        C18777g.m61386a(context, "Application Context cannot be null");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public String m61548a() {
        return "1.5.0-Vungle";
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public void m61543c() {
        C18777g.m61389a();
        C18745a.m61528a().m61524d();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m61547a(Context context) {
        m61544b(context);
        if (m61545b()) {
            return;
        }
        m61546a(true);
        C18755i.m61468c().m61471a(context);
        C18746b.m61523g().m61514a(context);
        C18768a.m61424a(context);
        C18770c.m61417a(context);
        C18774e.m61393a(context);
        C18752g.m61492b().m61493a(context);
        C18745a.m61528a().m61527a(context);
        C18756j.m61460b().m61464a(context);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public boolean m61545b() {
        return this.f46863a;
    }

    /* renamed from: a */
    void m61546a(boolean z) {
        this.f46863a = z;
    }
}
