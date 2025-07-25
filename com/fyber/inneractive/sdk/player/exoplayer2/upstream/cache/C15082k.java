package com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache;

import android.os.ConditionVariable;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache.k */
/* loaded from: classes4.dex */
public final class C15082k extends Thread {

    /* renamed from: a */
    public final /* synthetic */ ConditionVariable f29675a;

    /* renamed from: b */
    public final /* synthetic */ C15083l f29676b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15082k(C15083l c15083l, ConditionVariable conditionVariable) {
        super("SimpleCache.initialize()");
        this.f29676b = c15083l;
        this.f29675a = conditionVariable;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        synchronized (this.f29676b) {
            this.f29675a.open();
            try {
                C15083l.m77251a(this.f29676b);
            } catch (C15072a e) {
                this.f29676b.f29682f = e;
            }
            this.f29676b.f29678b.getClass();
        }
    }
}
