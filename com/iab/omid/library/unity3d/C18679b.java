package com.iab.omid.library.unity3d;

import android.content.Context;
import com.iab.omid.library.unity3d.internal.C18686a;
import com.iab.omid.library.unity3d.internal.C18687b;
import com.iab.omid.library.unity3d.internal.C18692f;
import com.iab.omid.library.unity3d.internal.C18695h;
import com.iab.omid.library.unity3d.utils.C18706a;
import com.iab.omid.library.unity3d.utils.C18708c;
import com.iab.omid.library.unity3d.utils.C18712e;
import com.iab.omid.library.unity3d.utils.C18715g;

/* renamed from: com.iab.omid.library.unity3d.b */
/* loaded from: classes6.dex */
public class C18679b {

    /* renamed from: a */
    private boolean f46736a;

    /* renamed from: b */
    private void m61775b(Context context) {
        C18715g.m61634a(context, "Application Context cannot be null");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public String m61779a() {
        return "1.4.9-Unity3d";
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public void m61774c() {
        C18715g.m61637a();
        C18686a.m61759a().m61755d();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m61778a(Context context) {
        m61775b(context);
        if (m61776b()) {
            return;
        }
        m61777a(true);
        C18695h.m61707c().m61710a(context);
        C18687b.m61754g().m61745a(context);
        C18706a.m61670a(context);
        C18708c.m61663a(context);
        C18712e.m61641a(context);
        C18692f.m61730b().m61731a(context);
        C18686a.m61759a().m61758a(context);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public boolean m61776b() {
        return this.f46736a;
    }

    /* renamed from: a */
    void m61777a(boolean z) {
        this.f46736a = z;
    }
}
