package com.ironsource;

import java.util.Date;

/* renamed from: com.ironsource.ta */
/* loaded from: classes6.dex */
public class C21008ta {

    /* renamed from: a */
    private long f53557a = new Date().getTime();

    /* renamed from: a */
    public static long m54805a(C21008ta c21008ta) {
        if (c21008ta == null) {
            return 0L;
        }
        return new Date().getTime() - c21008ta.f53557a;
    }
}
