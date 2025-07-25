package com.iab.omid.library.mmadbridge;

import android.content.Context;
import com.iab.omid.library.mmadbridge.internal.C18294a;
import com.iab.omid.library.mmadbridge.internal.C18295b;
import com.iab.omid.library.mmadbridge.internal.C18301g;
import com.iab.omid.library.mmadbridge.internal.C18304i;
import com.iab.omid.library.mmadbridge.internal.C18305j;
import com.iab.omid.library.mmadbridge.utils.C18317a;
import com.iab.omid.library.mmadbridge.utils.C18319c;
import com.iab.omid.library.mmadbridge.utils.C18323e;
import com.iab.omid.library.mmadbridge.utils.C18326g;

/* renamed from: com.iab.omid.library.mmadbridge.b */
/* loaded from: classes6.dex */
public class C18287b {

    /* renamed from: a */
    private boolean f45932a;

    /* renamed from: b */
    private void m63278b(Context context) {
        C18326g.m63120a(context, "Application Context cannot be null");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public String m63282a() {
        return "1.4.13-Mmadbridge";
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public void m63277c() {
        C18326g.m63123a();
        C18294a.m63262a().m63258d();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m63281a(Context context) {
        m63278b(context);
        if (m63279b()) {
            return;
        }
        m63280a(true);
        C18304i.m63202c().m63205a(context);
        C18295b.m63257g().m63248a(context);
        C18317a.m63158a(context);
        C18319c.m63151a(context);
        C18323e.m63127a(context);
        C18301g.m63226b().m63227a(context);
        C18294a.m63262a().m63261a(context);
        C18305j.m63194b().m63198a(context);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public boolean m63279b() {
        return this.f45932a;
    }

    /* renamed from: a */
    void m63280a(boolean z) {
        this.f45932a = z;
    }
}
