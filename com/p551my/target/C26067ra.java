package com.p551my.target;

import android.content.Context;
import com.p551my.target.AbstractC25749f5;

/* renamed from: com.my.target.ra */
/* loaded from: classes7.dex */
public final class C26067ra extends AbstractC25749f5 {

    /* renamed from: b */
    public static volatile C26067ra f67790b;

    /* renamed from: a */
    public static C26067ra m43019a() {
        C26067ra c26067ra = f67790b;
        if (c26067ra == null) {
            synchronized (C25926n2.class) {
                c26067ra = f67790b;
                if (c26067ra == null) {
                    c26067ra = new C26067ra();
                    f67790b = c26067ra;
                }
            }
        }
        return c26067ra;
    }

    /* renamed from: b */
    public static /* synthetic */ void m43017b(C26067ra c26067ra, String str, AbstractC25749f5.InterfaceC25750a interfaceC25750a, Context context) {
        c26067ra.m43018a(str, interfaceC25750a, context);
    }

    /* renamed from: a */
    public /* synthetic */ void m43018a(String str, AbstractC25749f5.InterfaceC25750a interfaceC25750a, Context context) {
        if (m43932a(str, interfaceC25750a)) {
            AbstractC25846ja.m43680a("VideoLoader: can't load. Video already loading");
            return;
        }
        m43931a(str, (String) C25727e2.m43981a().m44185a(str, null, context.getApplicationContext()).m44112c());
    }

    /* renamed from: b */
    public void m43016b(final String str, final AbstractC25749f5.InterfaceC25750a interfaceC25750a, final Context context) {
        AbstractC25671c0.m44123c(new Runnable() { // from class: com.my.target.ue
            @Override // java.lang.Runnable
            public final void run() {
                C26067ra.m43017b(C26067ra.this, str, interfaceC25750a, context);
            }
        });
    }
}
