package com.yandex.mobile.ads.impl;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.yandex.mobile.ads.impl.gi */
/* loaded from: classes8.dex */
public final class C30394gi implements InterfaceC31874y8 {
    @Override // com.yandex.mobile.ads.impl.InterfaceC31874y8
    /* renamed from: a */
    public final boolean mo27004a(@NotNull Context context, @NotNull qu1 sizeInfo) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(sizeInfo, "sizeInfo");
        int mo29651c = sizeInfo.mo29651c(context);
        int mo29653a = sizeInfo.mo29653a(context);
        if (mo29651c >= 0 && mo29653a >= 0) {
            return true;
        }
        return false;
    }
}
