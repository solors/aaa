package com.p551my.target;

import android.content.Context;
import com.p551my.target.AbstractC26098t;
import java.util.Map;

/* renamed from: com.my.target.i3 */
/* loaded from: classes7.dex */
public class C25814i3 extends AbstractC26098t.C26099a {

    /* renamed from: b */
    public final int f66964b;

    public C25814i3(int i) {
        this.f66964b = i;
    }

    @Override // com.p551my.target.AbstractC26098t.C26099a
    /* renamed from: a */
    public Map mo42584a(C25832j c25832j, C26084s5 c26084s5, Context context) {
        Map mo42584a = super.mo42584a(c25832j, c26084s5, context);
        mo42584a.put("duration", Integer.toString(this.f66964b));
        return mo42584a;
    }

    /* renamed from: a */
    public static AbstractC26098t m43765a(int i) {
        return new C25814i3(i);
    }
}
