package com.iab.omid.library.applovin;

import android.content.Context;
import com.iab.omid.library.applovin.internal.C17807a;
import com.iab.omid.library.applovin.internal.C17808b;
import com.iab.omid.library.applovin.internal.C17814g;
import com.iab.omid.library.applovin.internal.C17817i;
import com.iab.omid.library.applovin.utils.C17828a;
import com.iab.omid.library.applovin.utils.C17830c;
import com.iab.omid.library.applovin.utils.C17834e;
import com.iab.omid.library.applovin.utils.C17837g;

/* renamed from: com.iab.omid.library.applovin.b */
/* loaded from: classes6.dex */
public class C17800b {

    /* renamed from: a */
    private boolean f44915a;

    /* renamed from: b */
    private void m65165b(Context context) {
        C17837g.m65016a(context, "Application Context cannot be null");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public String m65169a() {
        return "1.4.12-Applovin";
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public void m65164c() {
        C17837g.m65019a();
        C17807a.m65149a().m65145d();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m65168a(Context context) {
        m65165b(context);
        if (m65166b()) {
            return;
        }
        m65167a(true);
        C17817i.m65090c().m65093a(context);
        C17808b.m65144g().m65135a(context);
        C17828a.m65053a(context);
        C17830c.m65046a(context);
        C17834e.m65023a(context);
        C17814g.m65113b().m65114a(context);
        C17807a.m65149a().m65148a(context);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public boolean m65166b() {
        return this.f44915a;
    }

    /* renamed from: a */
    void m65167a(boolean z) {
        this.f44915a = z;
    }
}
