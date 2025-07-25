package com.yandex.mobile.ads.impl;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.yandex.mobile.ads.impl.cr */
/* loaded from: classes8.dex */
public final class C30114cr {
    @NotNull
    /* renamed from: a */
    public static final nb1 m35177a(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        int i = context.getResources().getConfiguration().orientation;
        if (i != 1) {
            if (i != 2) {
                return nb1.f82660e;
            }
            return nb1.f82658c;
        }
        return nb1.f82659d;
    }
}
