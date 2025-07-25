package io.appmetrica.analytics.impl;

import android.content.Context;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: io.appmetrica.analytics.impl.u9 */
/* loaded from: classes9.dex */
public final class C34931u9 {

    /* renamed from: a */
    public final ReentrantLock f95458a;

    /* renamed from: b */
    public final C34299W9 f95459b;

    public C34931u9(Context context, String str) {
        this(new ReentrantLock(), new C34299W9(context, str));
    }

    /* renamed from: a */
    public final void m20919a() {
        this.f95458a.lock();
        this.f95459b.m22133a();
    }

    /* renamed from: b */
    public final void m20918b() {
        this.f95459b.m22131b();
        this.f95458a.unlock();
    }

    /* renamed from: c */
    public final void m20917c() {
        C34299W9 c34299w9 = this.f95459b;
        synchronized (c34299w9) {
            c34299w9.m22131b();
            c34299w9.f93641a.delete();
        }
        this.f95458a.unlock();
    }

    public C34931u9(ReentrantLock reentrantLock, C34299W9 c34299w9) {
        this.f95458a = reentrantLock;
        this.f95459b = c34299w9;
    }
}
