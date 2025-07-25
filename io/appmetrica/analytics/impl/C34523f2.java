package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;

/* renamed from: io.appmetrica.analytics.impl.f2 */
/* loaded from: classes9.dex */
public final class C34523f2 {

    /* renamed from: a */
    public final C34301Wb f94299a;

    /* renamed from: b */
    public final ICommonExecutor f94300b;

    /* renamed from: c */
    public final long f94301c;

    /* renamed from: d */
    public boolean f94302d = true;

    /* renamed from: e */
    public final Runnable f94303e = new Runnable() { // from class: io.appmetrica.analytics.impl.xo
        {
            C34523f2.this = this;
        }

        @Override // java.lang.Runnable
        public final void run() {
            C34523f2.m21761a(C34523f2.this);
        }
    };

    public C34523f2(C34301Wb c34301Wb, IHandlerExecutor iHandlerExecutor, long j) {
        this.f94299a = c34301Wb;
        this.f94300b = iHandlerExecutor;
        this.f94301c = j;
    }

    /* renamed from: a */
    public static final void m21761a(C34523f2 c34523f2) {
        C34325Xb c34325Xb = c34523f2.f94299a.f93646a;
        C34140Ph c34140Ph = c34325Xb.f93436h;
        c34140Ph.f93361c.m22335a(c34325Xb.f93430b.f93860a);
    }
}
