package com.yandex.mobile.ads.impl;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class su1 {
    /* renamed from: a */
    public static final boolean m29530a(@NotNull Context context, @NotNull C30149d8<?> adResponse, @NotNull qu1 responseSizeInfo, @NotNull InterfaceC31874y8 adSizeValidator, @NotNull qu1 containerSizeInfo) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(adResponse, "adResponse");
        Intrinsics.checkNotNullParameter(responseSizeInfo, "responseSizeInfo");
        Intrinsics.checkNotNullParameter(adSizeValidator, "adSizeValidator");
        Intrinsics.checkNotNullParameter(containerSizeInfo, "containerSizeInfo");
        boolean mo27004a = adSizeValidator.mo27004a(context, responseSizeInfo);
        boolean m35076L = adResponse.m35076L();
        Context applicationContext = context.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
        boolean m34645a = C30226ea.m34645a(applicationContext, responseSizeInfo, containerSizeInfo);
        if (!m35076L && (!mo27004a || !m34645a)) {
            return false;
        }
        return true;
    }
}
