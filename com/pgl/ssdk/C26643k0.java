package com.pgl.ssdk;

import android.content.Context;
import com.pgl.ssdk.ces.C26614a;
import com.pgl.ssdk.ces.C26615b;

/* renamed from: com.pgl.ssdk.k0 */
/* loaded from: classes7.dex */
public class C26643k0 extends AbstractC26647m0 {

    /* renamed from: p */
    private Context f69916p;

    public C26643k0(Context context, String str) {
        super(context, str);
        this.f69916p = context;
        this.f69925c = C26645l0.m40834a() + m40838b();
    }

    @Override // com.pgl.ssdk.AbstractC26647m0
    /* renamed from: a */
    public boolean mo40825a(int i, byte[] bArr) {
        if (i == 200 && bArr != null) {
            try {
                if (bArr.length > 0) {
                    if (((Integer) C26614a.meta(223, null, bArr)).intValue() == 0) {
                        C26615b.f69861c = true;
                    } else {
                        C26615b.f69861c = false;
                    }
                }
            } catch (Throwable unused) {
                C26615b.f69861c = false;
            }
        }
        return true;
    }

    /* renamed from: b */
    public String m40838b() {
        return ((("?os=0&ver=6.4.0.0.overseas-rc.5&mode=1&app_ver=" + String.valueOf(C26682z.m40686g(this.f69916p))) + "&region=" + C26608b0.m40937a()) + "&did=" + C26615b.m40901e()) + "&aid=" + C26615b.m40903d();
    }
}
