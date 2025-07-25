package com.p551my.target;

import android.content.Context;
import android.graphics.Bitmap;
import com.p551my.target.AbstractC25749f5;

/* renamed from: com.my.target.n2 */
/* loaded from: classes7.dex */
public final class C25926n2 extends AbstractC25749f5 {

    /* renamed from: b */
    public static volatile C25926n2 f67293b;

    /* renamed from: a */
    public static C25926n2 m43418a() {
        C25926n2 c25926n2 = f67293b;
        if (c25926n2 == null) {
            synchronized (C25926n2.class) {
                c25926n2 = f67293b;
                if (c25926n2 == null) {
                    c25926n2 = new C25926n2();
                    f67293b = c25926n2;
                }
            }
        }
        return c25926n2;
    }

    /* renamed from: b */
    public void m43416b(final String str, final AbstractC25749f5.InterfaceC25750a interfaceC25750a, final Context context) {
        AbstractC25671c0.m44123c(new Runnable() { // from class: com.my.target.yc
            @Override // java.lang.Runnable
            public final void run() {
                C25926n2.this.m43417a(str, interfaceC25750a, context);
            }
        });
    }

    /* renamed from: a */
    public final /* synthetic */ void m43417a(String str, AbstractC25749f5.InterfaceC25750a interfaceC25750a, Context context) {
        if (m43932a(str, interfaceC25750a)) {
            AbstractC25846ja.m43680a("ImageLoader: can't load. Image already loading");
            return;
        }
        m43931a(str, (Bitmap) C26263z1.m42275a().m44185a(str, (String) null, context.getApplicationContext()).m44112c());
    }
}
