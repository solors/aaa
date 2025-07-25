package com.iab.omid.library.appodeal;

import android.content.Context;
import com.iab.omid.library.appodeal.internal.C17875a;
import com.iab.omid.library.appodeal.internal.C17876b;
import com.iab.omid.library.appodeal.internal.C17882g;
import com.iab.omid.library.appodeal.internal.C17885i;
import com.iab.omid.library.appodeal.internal.C17886j;
import com.iab.omid.library.appodeal.utils.C17898a;
import com.iab.omid.library.appodeal.utils.C17900c;
import com.iab.omid.library.appodeal.utils.C17904e;
import com.iab.omid.library.appodeal.utils.C17907g;

/* renamed from: com.iab.omid.library.appodeal.b */
/* loaded from: classes6.dex */
public class C17868b {

    /* renamed from: a */
    private boolean f45044a;

    /* renamed from: b */
    private void m64924b(Context context) {
        C17907g.m64766a(context, "Application Context cannot be null");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public String m64928a() {
        return "1.5.2-Appodeal";
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public void m64923c() {
        C17907g.m64769a();
        C17875a.m64908a().m64904d();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m64927a(Context context) {
        m64924b(context);
        if (m64925b()) {
            return;
        }
        m64926a(true);
        C17885i.m64848c().m64851a(context);
        C17876b.m64903g().m64894a(context);
        C17898a.m64804a(context);
        C17900c.m64797a(context);
        C17904e.m64773a(context);
        C17882g.m64872b().m64873a(context);
        C17875a.m64908a().m64907a(context);
        C17886j.m64840b().m64844a(context);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public boolean m64925b() {
        return this.f45044a;
    }

    /* renamed from: a */
    void m64926a(boolean z) {
        this.f45044a = z;
    }
}
