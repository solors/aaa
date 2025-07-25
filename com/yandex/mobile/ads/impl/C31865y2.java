package com.yandex.mobile.ads.impl;

import java.util.Comparator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges._Ranges;

/* renamed from: com.yandex.mobile.ads.impl.y2 */
/* loaded from: classes8.dex */
public final class C31865y2 {

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.yandex.mobile.ads.impl.y2$a */
    /* loaded from: classes8.dex */
    public static final class C31866a implements Comparator<C31920yr> {
        @Override // java.util.Comparator
        public final int compare(C31920yr c31920yr, C31920yr c31920yr2) {
            long m16906p;
            C31920yr first = c31920yr;
            C31920yr second = c31920yr2;
            Intrinsics.checkNotNullParameter(first, "first");
            Intrinsics.checkNotNullParameter(second, "second");
            m16906p = _Ranges.m16906p(first.m26633b().m26011b() - second.m26633b().m26011b(), -1L, 1L);
            return (int) m16906p;
        }
    }
}
