package com.yandex.mobile.ads.impl;

import java.util.ArrayList;
import kotlin.collections._Collections;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.yandex.mobile.ads.impl.t3 */
/* loaded from: classes8.dex */
public final class C31422t3 {
    /* renamed from: a */
    public static final void m29312a(@NotNull String adType, @NotNull ArrayList errors) {
        String m17521z0;
        Intrinsics.checkNotNullParameter(adType, "adType");
        Intrinsics.checkNotNullParameter(errors, "errors");
        if (!errors.isEmpty()) {
            m17521z0 = _Collections.m17521z0(errors, "\n - ", "\n - ", null, 0, null, null, 60, null);
            km0.m32488a(C31714w0.m28089a(new Object[]{adType, m17521z0}, 2, "Found following errors for %s ad type: %s", "format(...)"), new Object[0]);
        }
    }

    /* renamed from: a */
    public static final void m29313a(@NotNull String adConfigurationInfo) {
        Intrinsics.checkNotNullParameter(adConfigurationInfo, "adConfigurationInfo");
        km0.m32486b(C31714w0.m28089a(new Object[]{adConfigurationInfo}, 1, "Ad type %s was integrated successfully", "format(...)"), new Object[0]);
    }
}
