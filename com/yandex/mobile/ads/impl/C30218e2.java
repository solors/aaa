package com.yandex.mobile.ads.impl;

import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.yandex.mobile.ads.impl.e2 */
/* loaded from: classes8.dex */
public final class C30218e2 {
    @NotNull

    /* renamed from: c */
    private static final Object f78418c = new Object();
    @NotNull

    /* renamed from: a */
    private final sp0 f78419a;
    @Nullable

    /* renamed from: b */
    private volatile C29982b2 f78420b;

    public C30218e2(@NotNull sp0 localStorage) {
        Intrinsics.checkNotNullParameter(localStorage, "localStorage");
        this.f78419a = localStorage;
    }

    /* renamed from: a */
    public static void m34705a(C30218e2 c30218e2, Boolean bool, EnumC31944z1 enumC31944z1, Long l, Integer num, int i) {
        if ((i & 1) != 0) {
            bool = null;
        }
        if ((i & 2) != 0) {
            enumC31944z1 = null;
        }
        if ((i & 4) != 0) {
            l = null;
        }
        if ((i & 8) != 0) {
            num = null;
        }
        c30218e2.getClass();
        synchronized (f78418c) {
            boolean booleanValue = bool != null ? bool.booleanValue() : c30218e2.m34704b().m35681d();
            if (enumC31944z1 == null) {
                enumC31944z1 = c30218e2.m34704b().m35682c();
            }
            C29982b2 c29982b2 = new C29982b2(booleanValue, enumC31944z1, l != null ? l.longValue() : c30218e2.m34704b().m35683b(), num != null ? num.intValue() : c30218e2.m34704b().m35684a());
            c30218e2.f78419a.mo29085b("AdBlockerDetected", c29982b2.m35681d());
            c30218e2.f78419a.mo29092a("AdBlockerRequestPolicy", c29982b2.m35682c().name());
            c30218e2.f78419a.mo29093a("AdBlockerLastUpdate", c29982b2.m35683b());
            c30218e2.f78419a.mo29097a(c29982b2.m35684a(), "AdBlockerFailedRequestsCount");
            c30218e2.f78420b = c29982b2;
            Unit unit = Unit.f99208a;
        }
    }

    @NotNull
    /* renamed from: b */
    public final C29982b2 m34704b() {
        C29982b2 c29982b2;
        C29982b2 c29982b22 = this.f78420b;
        if (c29982b22 == null) {
            synchronized (f78418c) {
                c29982b2 = this.f78420b;
                if (c29982b2 == null) {
                    boolean mo29089a = this.f78419a.mo29089a("AdBlockerDetected", false);
                    String mo29082d = this.f78419a.mo29082d("AdBlockerRequestPolicy");
                    if (mo29082d == null) {
                        mo29082d = "TCP";
                    }
                    c29982b2 = new C29982b2(mo29089a, EnumC31944z1.valueOf(mo29082d), this.f78419a.mo29086b("AdBlockerLastUpdate"), this.f78419a.mo29088b(0, "AdBlockerFailedRequestsCount"));
                    this.f78420b = c29982b2;
                }
            }
            return c29982b2;
        }
        return c29982b22;
    }

    /* renamed from: c */
    public final void m34703c() {
        synchronized (f78418c) {
            m34705a(this, null, null, null, Integer.valueOf(m34704b().m35684a() + 1), 7);
            Unit unit = Unit.f99208a;
        }
    }

    /* renamed from: a */
    public final void m34706a() {
        synchronized (f78418c) {
            m34705a(this, null, null, null, 0, 7);
            Unit unit = Unit.f99208a;
        }
    }
}
