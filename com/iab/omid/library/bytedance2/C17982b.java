package com.iab.omid.library.bytedance2;

import android.content.Context;
import com.iab.omid.library.bytedance2.internal.C17989a;
import com.iab.omid.library.bytedance2.internal.C17990b;
import com.iab.omid.library.bytedance2.internal.C17996g;
import com.iab.omid.library.bytedance2.internal.C17999i;
import com.iab.omid.library.bytedance2.utils.C18010a;
import com.iab.omid.library.bytedance2.utils.C18012c;
import com.iab.omid.library.bytedance2.utils.C18016e;
import com.iab.omid.library.bytedance2.utils.C18019g;

/* renamed from: com.iab.omid.library.bytedance2.b */
/* loaded from: classes6.dex */
public class C17982b {

    /* renamed from: a */
    private boolean f45300a;

    /* renamed from: b */
    private void m64457b(Context context) {
        C18019g.m64308a(context, "Application Context cannot be null");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public String m64461a() {
        return "1.4.12-Bytedance2";
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public void m64456c() {
        C18019g.m64311a();
        C17989a.m64441a().m64437d();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m64460a(Context context) {
        m64457b(context);
        if (m64458b()) {
            return;
        }
        m64459a(true);
        C17999i.m64382c().m64385a(context);
        C17990b.m64436g().m64427a(context);
        C18010a.m64345a(context);
        C18012c.m64338a(context);
        C18016e.m64315a(context);
        C17996g.m64405b().m64406a(context);
        C17989a.m64441a().m64440a(context);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public boolean m64458b() {
        return this.f45300a;
    }

    /* renamed from: a */
    void m64459a(boolean z) {
        this.f45300a = z;
    }
}
