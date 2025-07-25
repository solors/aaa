package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.executors.InterruptionSafeThread;
import java.util.HashMap;

/* renamed from: io.appmetrica.analytics.impl.mb */
/* loaded from: classes9.dex */
public final class C34721mb extends InterruptionSafeThread {

    /* renamed from: a */
    public final /* synthetic */ C34748nb f94921a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C34721mb(C34748nb c34748nb, String str) {
        super(str);
        this.f94921a = c34748nb;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        HashMap hashMap;
        synchronized (this.f94921a.f94997a) {
            C34748nb.m21304a(this.f94921a);
            this.f94921a.f95001e = true;
            this.f94921a.f94997a.notifyAll();
        }
        while (isRunning()) {
            synchronized (this) {
                if (this.f94921a.f94998b.size() == 0) {
                    try {
                        wait();
                    } catch (InterruptedException unused) {
                    }
                }
                hashMap = new HashMap(this.f94921a.f94998b);
                this.f94921a.f94998b.clear();
            }
            if (hashMap.size() > 0) {
                C34748nb.m21303a(this.f94921a, hashMap);
                hashMap.clear();
            }
        }
    }
}
