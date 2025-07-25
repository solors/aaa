package com.pgl.ssdk;

import android.content.Context;
import com.pgl.ssdk.ces.C26615b;

/* renamed from: com.pgl.ssdk.e1 */
/* loaded from: classes7.dex */
public class C26628e1 extends AbstractC26647m0 {

    /* renamed from: p */
    private Context f69900p;

    public C26628e1(Context context, String str) {
        super(context, str);
        this.f69900p = context;
        this.f69925c = C26645l0.m40832b() + m40877b();
    }

    @Override // com.pgl.ssdk.AbstractC26647m0
    /* renamed from: a */
    public boolean mo40825a(int i, byte[] bArr) {
        Object m40928a;
        try {
            m40928a = C26609b1.m40928a(bArr);
        } catch (Throwable unused) {
        }
        if ((m40928a instanceof Integer) && ((Integer) m40928a).intValue() == 0) {
            C26609b1.f69845a = 200;
            return true;
        }
        if (m40928a instanceof String) {
            C26609b1.f69848d = (String) m40928a;
            C26609b1.f69845a = 200;
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public String m40877b() {
        return "?os=android&app_id=" + C26609b1.f69847c + "&did=" + C26615b.m40901e() + "&app_ver=" + C26682z.m40686g(this.f69900p) + "&platform=android&ver=6.4.0.0.overseas-rc.5&mode=1";
    }
}
