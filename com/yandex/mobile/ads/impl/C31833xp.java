package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.tr0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.yandex.mobile.ads.impl.xp */
/* loaded from: classes8.dex */
public final class C31833xp implements tr0 {
    @NotNull

    /* renamed from: a */
    private final tr0.C31476a f87771a;
    @NotNull

    /* renamed from: b */
    private final tr0[] f87772b;

    public C31833xp(@NotNull tr0... measureSpecProviders) {
        Intrinsics.checkNotNullParameter(measureSpecProviders, "measureSpecProviders");
        this.f87771a = new tr0.C31476a();
        this.f87772b = measureSpecProviders;
    }

    @Override // com.yandex.mobile.ads.impl.tr0
    @NotNull
    /* renamed from: a */
    public final tr0.C31476a mo27438a(int i, int i2) {
        tr0[] tr0VarArr = this.f87772b;
        int length = tr0VarArr.length;
        int i3 = 0;
        while (i3 < length) {
            tr0.C31476a mo27438a = tr0VarArr[i3].mo27438a(i, i2);
            int i4 = mo27438a.f85812a;
            i3++;
            i2 = mo27438a.f85813b;
            i = i4;
        }
        tr0.C31476a c31476a = this.f87771a;
        c31476a.f85812a = i;
        c31476a.f85813b = i2;
        return c31476a;
    }
}
