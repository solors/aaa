package com.taurusx.tax.p597g.p599b.p600r;

import android.text.TextUtils;
import com.taurusx.tax.p597g.p599b.C28412n;

/* renamed from: com.taurusx.tax.g.b.r.e */
/* loaded from: classes7.dex */
public class C28422e {
    /* renamed from: a */
    public String m38100a(String str) {
        String str2;
        int lastIndexOf = str.lastIndexOf(46);
        int lastIndexOf2 = str.lastIndexOf(47);
        if (lastIndexOf != -1 && lastIndexOf > lastIndexOf2 && lastIndexOf + 2 + 4 > str.length()) {
            str2 = str.substring(lastIndexOf + 1, str.length());
        } else {
            str2 = "";
        }
        String m38117a = C28412n.m38117a(str);
        if (!TextUtils.isEmpty(str2)) {
            return m38117a + "." + str2;
        }
        return m38117a;
    }
}
