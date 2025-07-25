package com.iab.omid.library.taurusx;

import android.content.Context;
import com.iab.omid.library.taurusx.internal.C18629a;
import com.iab.omid.library.taurusx.internal.C18630b;
import com.iab.omid.library.taurusx.internal.C18635f;
import com.iab.omid.library.taurusx.internal.C18638h;
import com.iab.omid.library.taurusx.utils.C18649a;
import com.iab.omid.library.taurusx.utils.C18651c;
import com.iab.omid.library.taurusx.utils.C18655e;
import com.iab.omid.library.taurusx.utils.C18658g;

/* renamed from: com.iab.omid.library.taurusx.b */
/* loaded from: classes6.dex */
public class C18622b {

    /* renamed from: a */
    private boolean f46608a;

    /* renamed from: b */
    private void m62010b(Context context) {
        C18658g.m61868a(context, "Application Context cannot be null");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public String m62014a() {
        return "1.4.8-Taurusx";
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public void m62009c() {
        C18658g.m61871a();
        C18629a.m61994a().m61990d();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m62013a(Context context) {
        m62010b(context);
        if (m62011b()) {
            return;
        }
        m62012a(true);
        C18638h.m61941c().m61944a(context);
        C18630b.m61989g().m61980a(context);
        C18649a.m61904a(context);
        C18651c.m61897a(context);
        C18655e.m61875a(context);
        C18635f.m61965b().m61966a(context);
        C18629a.m61994a().m61993a(context);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public boolean m62011b() {
        return this.f46608a;
    }

    /* renamed from: a */
    void m62012a(boolean z) {
        this.f46608a = z;
    }
}
