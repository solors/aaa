package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.impl.as1;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.yandex.mobile.ads.impl.t7 */
/* loaded from: classes8.dex */
public final class C31429t7 {
    @NotNull

    /* renamed from: a */
    private final C30832m7 f85543a = new C30832m7();

    static {
        TimeUnit.SECONDS.toMillis(10L);
    }

    @NotNull
    /* renamed from: a */
    public final C31859xy m29265a(@NotNull Context context, int i) {
        int i2;
        Integer m26758g;
        Intrinsics.checkNotNullParameter(context, "context");
        this.f85543a.getClass();
        Intrinsics.checkNotNullParameter(context, "context");
        int i3 = as1.f76895l;
        yp1 m35796a = as1.C29962a.m35776a().m35796a(context);
        if (m35796a != null && (m26758g = m35796a.m26758g()) != null) {
            i2 = m26758g.intValue();
        } else {
            i2 = 0;
        }
        return new C31859xy(1.0f, i, i2);
    }
}
