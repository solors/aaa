package com.fyber.inneractive.sdk.player.cache;

import java.util.concurrent.Callable;

/* renamed from: com.fyber.inneractive.sdk.player.cache.a */
/* loaded from: classes4.dex */
public final class CallableC14747a implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C14752f f27943a;

    public CallableC14747a(C14752f c14752f) {
        this.f27943a = c14752f;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        boolean z;
        synchronized (this.f27943a) {
            C14752f c14752f = this.f27943a;
            if (c14752f.f27960i != null) {
                c14752f.m77643d();
                C14752f c14752f2 = this.f27943a;
                int i = c14752f2.f27962k;
                if (i >= 2000 && i >= c14752f2.f27961j.size()) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    this.f27943a.m77644c();
                    this.f27943a.f27962k = 0;
                }
                return null;
            }
            return null;
        }
    }
}
