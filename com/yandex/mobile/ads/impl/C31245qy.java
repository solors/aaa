package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.C30847mg;
import com.yandex.mobile.ads.impl.hs0;
import com.yandex.mobile.ads.impl.yy1;
import java.io.IOException;

/* renamed from: com.yandex.mobile.ads.impl.qy */
/* loaded from: classes8.dex */
public final class C31245qy implements hs0.InterfaceC30497b {
    @Override // com.yandex.mobile.ads.impl.hs0.InterfaceC30497b
    /* renamed from: a */
    public final hs0 mo26515a(hs0.C30496a c30496a) throws IOException {
        int i = y32.f88010a;
        if (i >= 23 && i >= 31) {
            int m29900c = rx0.m29900c(c30496a.f80172c.f86623m);
            gq0.m33793c("DMCodecAdapterFactory", "Creating an asynchronous MediaCodec adapter for track type " + y32.m27050d(m29900c));
            return new C30847mg.C30848a(m29900c).mo26515a(c30496a);
        }
        return new yy1.C31939a().mo26515a(c30496a);
    }
}
