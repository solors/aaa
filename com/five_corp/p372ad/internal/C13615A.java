package com.five_corp.p372ad.internal;

import com.five_corp.p372ad.internal.p373ad.C13627a;
import com.five_corp.p372ad.internal.p373ad.C13692v;
import com.five_corp.p372ad.internal.p373ad.format_config.C13658a;
import java.util.Iterator;

/* renamed from: com.five_corp.ad.internal.A */
/* loaded from: classes4.dex */
public final class C13615A {
    static {
        C13615A.class.toString();
    }

    /* renamed from: a */
    public static boolean m78526a(C13627a c13627a, long j) {
        boolean z = false;
        if (c13627a.f25188f.longValue() < j) {
            return false;
        }
        for (C13658a c13658a : c13627a.f25208z) {
            Iterator it = c13627a.f25207y.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (((C13692v) it.next()).f25407b == c13658a.f25338a) {
                        z = true;
                        continue;
                        break;
                    }
                } else {
                    break;
                }
            }
            if (z) {
                break;
            }
        }
        return z;
    }
}
