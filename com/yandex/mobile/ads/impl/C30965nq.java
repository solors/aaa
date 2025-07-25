package com.yandex.mobile.ads.impl;

import android.content.Context;
import be.MathJVM;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges._Ranges;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.yandex.mobile.ads.impl.nq */
/* loaded from: classes8.dex */
public final class C30965nq implements InterfaceC30948ni {
    @Override // com.yandex.mobile.ads.impl.InterfaceC30948ni
    /* renamed from: a */
    public final int mo31439a(@NotNull Context context, int i, @NotNull nb1 orientation) {
        float m16913i;
        int m103792c;
        int m16912j;
        int m16917e;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(orientation, "orientation");
        m16913i = _Ranges.m16913i(100.0f, cc2.m35259a(context, orientation) * 0.15f);
        if (i > 655) {
            m103792c = MathJVM.m103792c((i / 728.0d) * 90.0d);
        } else if (i > 632) {
            m103792c = 81;
        } else {
            m103792c = i > 526 ? MathJVM.m103792c((i / 468.0d) * 60.0d) : i > 432 ? 68 : MathJVM.m103792c((i / 320.0d) * 50.0d);
        }
        m16912j = _Ranges.m16912j(m103792c, (int) m16913i);
        m16917e = _Ranges.m16917e(m16912j, 50);
        return m16917e;
    }
}
