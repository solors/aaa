package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.impl.C30284f2;
import java.util.Set;
import kotlin.collections.C37572z0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.yandex.mobile.ads.impl.g2 */
/* loaded from: classes8.dex */
public final class C30356g2 {
    @NotNull

    /* renamed from: b */
    private static final Set<em1> f79432b;
    @NotNull

    /* renamed from: c */
    private static final Object f79433c;
    @Nullable

    /* renamed from: d */
    private static volatile C30356g2 f79434d;

    /* renamed from: e */
    public static final /* synthetic */ int f79435e = 0;
    @NotNull

    /* renamed from: a */
    private final C30218e2 f79436a;

    /* renamed from: com.yandex.mobile.ads.impl.g2$a */
    /* loaded from: classes8.dex */
    public static final class C30357a {
        private C30357a() {
        }

        /* renamed from: a */
        public static C30356g2 m33996a(Context context) {
            C30356g2 c30356g2;
            int i = C30356g2.f79435e;
            int i2 = C30284f2.f78883d;
            C30218e2 adBlockerStateStorage = C30284f2.C30285a.m34382a(context).m34383c();
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(adBlockerStateStorage, "adBlockerStateStorage");
            C30356g2 c30356g22 = C30356g2.f79434d;
            if (c30356g22 == null) {
                synchronized (C30356g2.f79433c) {
                    c30356g2 = C30356g2.f79434d;
                    if (c30356g2 == null) {
                        c30356g2 = new C30356g2(adBlockerStateStorage, 0);
                        C30356g2.f79434d = c30356g2;
                    }
                }
                return c30356g2;
            }
            return c30356g22;
        }

        public /* synthetic */ C30357a(int i) {
            this();
        }
    }

    static {
        Set<em1> m17119j;
        m17119j = C37572z0.m17119j(em1.f78711c, em1.f78713e, em1.f78712d);
        f79432b = m17119j;
        f79433c = new Object();
    }

    private C30356g2(C30218e2 c30218e2) {
        this.f79436a = c30218e2;
    }

    /* renamed from: a */
    public final void m34000a(@NotNull em1 requestType, @Nullable Integer num) {
        Intrinsics.checkNotNullParameter(requestType, "requestType");
        if (f79432b.contains(requestType)) {
            if (num != null && num.intValue() < 500) {
                this.f79436a.m34706a();
            } else {
                this.f79436a.m34703c();
            }
        }
    }

    public /* synthetic */ C30356g2(C30218e2 c30218e2, int i) {
        this(c30218e2);
    }

    /* renamed from: a */
    public final void m33998a(@Nullable Boolean bool, @NotNull EnumC31944z1 requestPolicy) {
        Intrinsics.checkNotNullParameter(requestPolicy, "requestPolicy");
        if (bool != null) {
            C30218e2.m34705a(this.f79436a, bool, requestPolicy, Long.valueOf(System.currentTimeMillis()), null, 8);
        }
    }
}
