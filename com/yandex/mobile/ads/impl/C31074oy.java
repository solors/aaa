package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.fp0;
import com.yandex.mobile.ads.impl.jp0;
import java.io.FileNotFoundException;

/* renamed from: com.yandex.mobile.ads.impl.oy */
/* loaded from: classes8.dex */
public final class C31074oy implements fp0 {
    public C31074oy() {
        this(0);
    }

    @Override // com.yandex.mobile.ads.impl.fp0
    /* renamed from: a */
    public final int mo30865a(int i) {
        return i == 7 ? 6 : 3;
    }

    public C31074oy(int i) {
    }

    @Override // com.yandex.mobile.ads.impl.fp0
    /* renamed from: a */
    public final long mo30864a(fp0.C30331a c30331a) {
        Throwable th = c30331a.f79195a;
        if (!(th instanceof gc1) && !(th instanceof FileNotFoundException) && !(th instanceof ye0) && !(th instanceof jp0.C30651g)) {
            int i = C30748ku.f81571c;
            while (th != null) {
                if (!(th instanceof C30748ku) || ((C30748ku) th).f81572b != 2008) {
                    th = th.getCause();
                }
            }
            return Math.min((c30331a.f79196b - 1) * 1000, 5000);
        }
        return -9223372036854775807L;
    }
}
