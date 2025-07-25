package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import java.util.HashMap;

/* renamed from: io.appmetrica.analytics.impl.f0 */
/* loaded from: classes9.dex */
public final class C34521f0 {

    /* renamed from: a */
    public final HashMap f94296a = new HashMap();

    /* renamed from: a */
    public final synchronized C34494e0 m21763a(C34391a5 c34391a5, PublicLogger publicLogger, C34778oe c34778oe) {
        C34494e0 c34494e0;
        c34494e0 = (C34494e0) this.f94296a.get(c34391a5.toString());
        if (c34494e0 == null) {
            C34467d0 m21201d = c34778oe.m21201d();
            c34494e0 = new C34494e0(m21201d.f94134a, m21201d.f94135b, new C34968vk(publicLogger, "[App Environment]"));
            this.f94296a.put(c34391a5.toString(), c34494e0);
        }
        return c34494e0;
    }

    /* renamed from: a */
    public final synchronized void m21762a(C34467d0 c34467d0, C34778oe c34778oe) {
        c34778oe.m21204a(c34467d0).m21149b();
    }
}
