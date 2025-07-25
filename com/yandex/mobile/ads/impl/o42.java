package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class o42 implements w72 {
    @NotNull

    /* renamed from: a */
    private final C31093p7 f83299a;

    public o42(@NotNull y42 configuration, @NotNull C31093p7 adRequestParametersProvider) {
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Intrinsics.checkNotNullParameter(adRequestParametersProvider, "adRequestParametersProvider");
        this.f83299a = adRequestParametersProvider;
    }

    @Override // com.yandex.mobile.ads.impl.w72
    @NotNull
    /* renamed from: a */
    public final String mo28016a() {
        String m30828d = this.f83299a.m30828d();
        if (m30828d == null || m30828d.length() == 0) {
            return "undefined";
        }
        return m30828d;
    }

    @Override // com.yandex.mobile.ads.impl.w72
    @NotNull
    /* renamed from: b */
    public final String mo28015b() {
        String m30829c = this.f83299a.m30829c();
        if (m30829c == null || m30829c.length() == 0) {
            return "undefined";
        }
        return m30829c;
    }
}
