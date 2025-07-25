package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.impl.as1;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.yandex.mobile.ads.impl.h2 */
/* loaded from: classes8.dex */
public final class C30432h2 {

    /* renamed from: c */
    private static final long f79846c = TimeUnit.HOURS.toMillis(1);
    @NotNull

    /* renamed from: a */
    private final as1 f79847a;
    @NotNull

    /* renamed from: b */
    private final Context f79848b;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C30432h2(Context context) {
        this(context, as1.C29962a.m35776a());
        int i = as1.f76895l;
    }

    /* renamed from: a */
    public final long m33722a() {
        Long l;
        yp1 m35796a = this.f79847a.m35796a(this.f79848b);
        if (m35796a != null) {
            l = m35796a.m26766c();
        } else {
            l = null;
        }
        if (l != null) {
            return l.longValue();
        }
        return f79846c;
    }

    public C30432h2(@NotNull Context context, @NotNull as1 sdkSettings) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(sdkSettings, "sdkSettings");
        this.f79847a = sdkSettings;
        Context applicationContext = context.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
        this.f79848b = applicationContext;
    }
}
