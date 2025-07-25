package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import java.util.HashMap;

/* renamed from: io.appmetrica.analytics.impl.Ih */
/* loaded from: classes9.dex */
public final class C33972Ih {

    /* renamed from: a */
    public final HashMap f93032a = new HashMap();

    /* renamed from: b */
    public final C34844r0 f93033b;

    public C33972Ih(C34844r0 c34844r0) {
        this.f93033b = c34844r0;
    }

    /* renamed from: a */
    public static C33972Ih m22540a() {
        return AbstractC33948Hh.f92969a;
    }

    /* renamed from: a */
    public final C33773Ah m22539a(Context context, String str) {
        C33773Ah c33773Ah = (C33773Ah) this.f93032a.get(str);
        if (c33773Ah == null) {
            synchronized (this.f93032a) {
                c33773Ah = (C33773Ah) this.f93032a.get(str);
                if (c33773Ah == null) {
                    IHandlerExecutor m21639a = C34848r4.m21050i().f95251c.m21639a();
                    this.f93033b.getClass();
                    if (C34818q0.f95195e == null) {
                        ((C35009x9) m21639a).f95592b.post(new RunnableC33923Gh(this, context));
                    }
                    c33773Ah = new C33773Ah(context.getApplicationContext(), str, new C34844r0());
                    this.f93032a.put(str, c33773Ah);
                    c33773Ah.m22771c(str);
                }
            }
        }
        return c33773Ah;
    }
}
