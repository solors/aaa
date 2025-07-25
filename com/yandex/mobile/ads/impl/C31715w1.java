package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.impl.as1;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.yandex.mobile.ads.impl.w1 */
/* loaded from: classes8.dex */
public final class C31715w1 {

    /* renamed from: b */
    private static final long f87079b = TimeUnit.DAYS.toMillis(1);
    @NotNull

    /* renamed from: a */
    private final Context f87080a;

    public C31715w1(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f87080a = context;
    }

    /* renamed from: a */
    public final boolean m28077a(@NotNull C29982b2 adBlockerState) {
        int i;
        Integer m26768b;
        Intrinsics.checkNotNullParameter(adBlockerState, "adBlockerState");
        int i2 = as1.f76895l;
        yp1 m35796a = as1.C29962a.m35776a().m35796a(this.f87080a);
        if (m35796a != null && m35796a.m26770a()) {
            return false;
        }
        if (!adBlockerState.m35681d() || adBlockerState.m35682c() != EnumC31944z1.f88657c || System.currentTimeMillis() - adBlockerState.m35683b() >= f87079b) {
            if (adBlockerState.m35681d()) {
                return false;
            }
            int m35684a = adBlockerState.m35684a();
            yp1 m35796a2 = as1.C29962a.m35776a().m35796a(this.f87080a);
            if (m35796a2 != null && (m26768b = m35796a2.m26768b()) != null) {
                i = m26768b.intValue();
            } else {
                i = 5;
            }
            if (m35684a < i) {
                return false;
            }
        }
        return true;
    }
}
