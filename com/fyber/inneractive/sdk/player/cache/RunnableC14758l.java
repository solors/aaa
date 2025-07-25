package com.fyber.inneractive.sdk.player.cache;

import com.fyber.inneractive.sdk.network.AbstractC14743z;
import com.fyber.inneractive.sdk.util.IAlog;
import java.io.File;

/* renamed from: com.fyber.inneractive.sdk.player.cache.l */
/* loaded from: classes4.dex */
public final class RunnableC14758l implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C14759m f27974a;

    public RunnableC14758l(C14759m c14759m) {
        this.f27974a = c14759m;
    }

    @Override // java.lang.Runnable
    public final void run() {
        long j;
        File m77640a = C14759m.m77640a(this.f27974a.f27976a, "fyb.vamp.vid.cache");
        if (m77640a != null) {
            try {
                IAlog.m76529a("VideoCache opening the cache in directory - %s", m77640a);
                this.f27974a.f27977b = C14752f.m77646b(m77640a);
                C14752f c14752f = this.f27974a.f27977b;
                c14752f.getClass();
                IAlog.m76525e("DiskLruCache delete cache", new Object[0]);
                c14752f.close();
                AbstractC14757k.m77641a(c14752f.f27952a);
                this.f27974a.f27977b = C14752f.m77646b(m77640a);
                C14752f c14752f2 = this.f27974a.f27977b;
                synchronized (c14752f2) {
                    j = c14752f2.f27959h;
                }
                IAlog.m76529a("VideoCache opened the cache in directory - %s current size is %d", m77640a, Long.valueOf(j));
                C14759m c14759m = this.f27974a;
                c14759m.f27977b.f27963l = c14759m;
                c14759m.f27978c = true;
            } catch (Throwable th) {
                AbstractC14743z.m77654a("Failed to open cache directory", th.getMessage(), null, null);
                IAlog.m76530a("Failed to open cache directory", th, new Object[0]);
            }
        }
    }
}
