package com.yandex.mobile.ads.impl;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class fw0 implements InterfaceC30948ni {
    @Override // com.yandex.mobile.ads.impl.InterfaceC30948ni
    /* renamed from: a */
    public final int mo31439a(@NotNull Context context, int i, @NotNull nb1 orientation) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(orientation, "orientation");
        float m35259a = cc2.m35259a(context, orientation) * 0.15f;
        if (i > 632 && 90.0f <= m35259a) {
            return 90;
        }
        return 50;
    }
}
