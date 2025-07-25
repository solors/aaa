package com.p551my.target;

import android.content.Context;
import com.p551my.target.AbstractC26098t;
import java.util.Map;

/* renamed from: com.my.target.w6 */
/* loaded from: classes7.dex */
public class C26192w6 extends AbstractC26098t.C26099a {
    /* renamed from: b */
    public static C26192w6 m42583b() {
        return new C26192w6();
    }

    @Override // com.p551my.target.AbstractC26098t.C26099a
    /* renamed from: a */
    public int mo42585a(C25832j c25832j, Context context) {
        return C25634a8.m44224a(context).m44217c();
    }

    @Override // com.p551my.target.AbstractC26098t.C26099a
    /* renamed from: a */
    public Map mo42584a(C25832j c25832j, C26084s5 c26084s5, Context context) {
        Map mo42584a = super.mo42584a(c25832j, c26084s5, context);
        Map snapshot = C26165v6.m42709d().snapshot();
        if (snapshot != null && snapshot.size() > 0) {
            StringBuilder sb2 = new StringBuilder();
            boolean z = false;
            for (String str : snapshot.keySet()) {
                if (z) {
                    sb2.append(",");
                } else {
                    z = true;
                }
                sb2.append(str);
            }
            String sb3 = sb2.toString();
            mo42584a.put("exb", sb3);
            AbstractC25846ja.m43680a("NativeAdServiceBuilder: Exclude list - " + sb3);
        }
        return mo42584a;
    }
}
