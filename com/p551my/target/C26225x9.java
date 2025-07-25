package com.p551my.target;

import android.content.Context;

/* renamed from: com.my.target.x9 */
/* loaded from: classes7.dex */
public class C26225x9 extends AbstractC25993p {
    /* renamed from: a */
    public static C26225x9 m42433a() {
        return new C26225x9();
    }

    @Override // com.p551my.target.AbstractC25993p
    /* renamed from: a */
    public C26253y9 mo42432a(C26253y9 c26253y9, C25832j c25832j, C25923n c25923n, Context context) {
        C26066r9 m42293c = c26253y9.m42293c();
        if (m42293c != null) {
            C25669c adChoices = m42293c.getAdChoices();
            if (adChoices == null) {
                return c26253y9;
            }
            C25974o2.m43281a(adChoices.m44130c()).m43284a(c25832j.getSlotId(), m42293c.getId()).m43283a(context);
            return c26253y9;
        }
        C25821i5 m43190b = c26253y9.m43190b();
        if (m43190b == null || !m43190b.m43754b()) {
            c25923n.m43428a(C25902m.f67236r);
            return null;
        }
        return c26253y9;
    }
}
