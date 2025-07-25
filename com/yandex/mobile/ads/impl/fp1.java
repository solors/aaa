package com.yandex.mobile.ads.impl;

import android.content.Context;
import be.MathJVM;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges._Ranges;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class fp1 implements InterfaceC30948ni {
    @Override // com.yandex.mobile.ads.impl.InterfaceC30948ni
    /* renamed from: a */
    public final int mo31439a(@NotNull Context context, int i, @NotNull nb1 orientation) {
        float f;
        float m16913i;
        float m16918d;
        int m103791d;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(orientation, "orientation");
        int m35259a = cc2.m35259a(context, orientation);
        if (orientation == nb1.f82658c) {
            f = 90.0f;
        } else {
            f = 100.0f;
        }
        m16913i = _Ranges.m16913i(f, m35259a * 0.15f);
        m16918d = _Ranges.m16918d(m16913i, 50.0f);
        m103791d = MathJVM.m103791d(m16918d);
        return m103791d;
    }
}
