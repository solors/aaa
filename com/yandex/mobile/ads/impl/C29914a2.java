package com.yandex.mobile.ads.impl;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.yandex.mobile.ads.impl.a2 */
/* loaded from: classes8.dex */
public final class C29914a2 {
    @NotNull

    /* renamed from: a */
    private final C31715w1 f76663a;
    @NotNull

    /* renamed from: b */
    private final C30139d2 f76664b;
    @NotNull

    /* renamed from: c */
    private final C30067c2 f76665c;

    public /* synthetic */ C29914a2(Context context) {
        this(context, new C31715w1(context), new C30139d2(context), new C30067c2(context));
    }

    @Nullable
    /* renamed from: a */
    public final EnumC31944z1 m36010a() {
        C29982b2 m35122a = this.f76664b.m35122a();
        if (!this.f76665c.m35378a(m35122a)) {
            return null;
        }
        if (this.f76663a.m28077a(m35122a)) {
            return EnumC31944z1.f88657c;
        }
        return EnumC31944z1.f88656b;
    }

    public C29914a2(@NotNull Context context, @NotNull C31715w1 adBlockerDetectorHttpUsageChecker, @NotNull C30139d2 adBlockerStateProvider, @NotNull C30067c2 adBlockerStateExpiredValidator) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(adBlockerDetectorHttpUsageChecker, "adBlockerDetectorHttpUsageChecker");
        Intrinsics.checkNotNullParameter(adBlockerStateProvider, "adBlockerStateProvider");
        Intrinsics.checkNotNullParameter(adBlockerStateExpiredValidator, "adBlockerStateExpiredValidator");
        this.f76663a = adBlockerDetectorHttpUsageChecker;
        this.f76664b = adBlockerStateProvider;
        this.f76665c = adBlockerStateExpiredValidator;
    }
}
