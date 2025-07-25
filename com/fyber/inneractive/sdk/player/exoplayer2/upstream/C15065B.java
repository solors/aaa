package com.fyber.inneractive.sdk.player.exoplayer2.upstream;

import com.fyber.inneractive.sdk.player.exoplayer2.source.RunnableC15032k;
import com.fyber.inneractive.sdk.player.exoplayer2.util.AbstractC15133z;
import com.fyber.inneractive.sdk.player.exoplayer2.util.ThreadFactoryC15132y;
import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.upstream.B */
/* loaded from: classes4.dex */
public final class C15065B {

    /* renamed from: a */
    public final ExecutorService f29611a;

    /* renamed from: b */
    public HandlerC15106y f29612b;

    /* renamed from: c */
    public IOException f29613c;

    public C15065B(String str) {
        int i = AbstractC15133z.f29832a;
        this.f29611a = Executors.newSingleThreadExecutor(new ThreadFactoryC15132y(str));
    }

    /* renamed from: a */
    public final boolean m77266a() {
        return this.f29612b != null;
    }

    /* renamed from: b */
    public final void m77264b() {
        IOException iOException = this.f29613c;
        if (iOException == null) {
            HandlerC15106y handlerC15106y = this.f29612b;
            if (handlerC15106y != null) {
                int i = handlerC15106y.f29763c;
                IOException iOException2 = handlerC15106y.f29765e;
                if (iOException2 != null && handlerC15106y.f29766f > i) {
                    throw iOException2;
                }
                return;
            }
            return;
        }
        throw iOException;
    }

    /* renamed from: a */
    public final void m77265a(RunnableC15032k runnableC15032k) {
        HandlerC15106y handlerC15106y = this.f29612b;
        if (handlerC15106y != null) {
            handlerC15106y.m77228a(true);
        }
        if (runnableC15032k != null) {
            this.f29611a.execute(runnableC15032k);
        }
        this.f29611a.shutdown();
    }
}
