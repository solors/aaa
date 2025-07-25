package com.iab.omid.library.inmobi;

import android.content.Context;
import com.iab.omid.library.inmobi.internal.C18177a;
import com.iab.omid.library.inmobi.internal.C18178b;
import com.iab.omid.library.inmobi.internal.C18184g;
import com.iab.omid.library.inmobi.internal.C18187i;
import com.iab.omid.library.inmobi.utils.C18198a;
import com.iab.omid.library.inmobi.utils.C18200c;
import com.iab.omid.library.inmobi.utils.C18204e;
import com.iab.omid.library.inmobi.utils.C18207g;

/* renamed from: com.iab.omid.library.inmobi.b */
/* loaded from: classes6.dex */
public class C18170b {

    /* renamed from: a */
    private boolean f45678a;

    /* renamed from: b */
    private void m63754b(Context context) {
        C18207g.m63605a(context, "Application Context cannot be null");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public String m63758a() {
        return "1.4.12-Inmobi";
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public void m63753c() {
        C18207g.m63608a();
        C18177a.m63738a().m63734d();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m63757a(Context context) {
        m63754b(context);
        if (m63755b()) {
            return;
        }
        m63756a(true);
        C18187i.m63679c().m63682a(context);
        C18178b.m63733g().m63724a(context);
        C18198a.m63642a(context);
        C18200c.m63635a(context);
        C18204e.m63612a(context);
        C18184g.m63702b().m63703a(context);
        C18177a.m63738a().m63737a(context);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public boolean m63755b() {
        return this.f45678a;
    }

    /* renamed from: a */
    void m63756a(boolean z) {
        this.f45678a = z;
    }
}
