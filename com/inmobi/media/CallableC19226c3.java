package com.inmobi.media;

import java.util.Map;
import java.util.concurrent.Callable;

/* renamed from: com.inmobi.media.c3 */
/* loaded from: classes6.dex */
public final class CallableC19226c3 implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C19310i3 f48124a;

    public CallableC19226c3(C19310i3 c19310i3) {
        this.f48124a = c19310i3;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        synchronized (this.f48124a) {
            C19310i3 c19310i3 = this.f48124a;
            if (c19310i3.f48346j != null) {
                while (c19310i3.f48345i > c19310i3.f48342f) {
                    c19310i3.m60247d((String) ((Map.Entry) c19310i3.f48347k.entrySet().iterator().next()).getKey());
                }
                if (this.f48124a.m60255a()) {
                    this.f48124a.m60248d();
                    this.f48124a.f48348l = 0;
                }
                return null;
            }
            return null;
        }
    }
}
