package com.iab.omid.library.amazon;

import android.content.Context;
import com.iab.omid.library.amazon.internal.C17746a;
import com.iab.omid.library.amazon.internal.C17747b;
import com.iab.omid.library.amazon.internal.C17753g;
import com.iab.omid.library.amazon.internal.C17756i;
import com.iab.omid.library.amazon.utils.C17767a;
import com.iab.omid.library.amazon.utils.C17769c;
import com.iab.omid.library.amazon.utils.C17773e;
import com.iab.omid.library.amazon.utils.C17776g;

/* renamed from: com.iab.omid.library.amazon.b */
/* loaded from: classes6.dex */
public class C17739b {

    /* renamed from: a */
    private boolean f44786a;

    /* renamed from: b */
    private void m65406b(Context context) {
        C17776g.m65257a(context, "Application Context cannot be null");
    }

    /* renamed from: a */
    public String m65410a() {
        return "1.4.10-Amazon";
    }

    /* renamed from: c */
    public void m65405c() {
        C17776g.m65260a();
        C17746a.m65390a().m65386d();
    }

    /* renamed from: a */
    public void m65409a(Context context) {
        m65406b(context);
        if (m65407b()) {
            return;
        }
        m65408a(true);
        C17756i.m65331c().m65334a(context);
        C17747b.m65385g().m65376a(context);
        C17767a.m65294a(context);
        C17769c.m65287a(context);
        C17773e.m65264a(context);
        C17753g.m65354b().m65355a(context);
        C17746a.m65390a().m65389a(context);
    }

    /* renamed from: b */
    public boolean m65407b() {
        return this.f44786a;
    }

    /* renamed from: a */
    void m65408a(boolean z) {
        this.f44786a = z;
    }
}
