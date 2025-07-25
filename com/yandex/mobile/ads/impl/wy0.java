package com.yandex.mobile.ads.impl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes8.dex */
final class wy0 implements oy1 {

    /* renamed from: b */
    private final List<C31840xt> f87439b;

    public wy0(ArrayList arrayList) {
        this.f87439b = Collections.unmodifiableList(arrayList);
    }

    @Override // com.yandex.mobile.ads.impl.oy1
    /* renamed from: a */
    public final int mo26264a() {
        return 1;
    }

    @Override // com.yandex.mobile.ads.impl.oy1
    /* renamed from: b */
    public final List<C31840xt> mo26261b(long j) {
        if (j >= 0) {
            return this.f87439b;
        }
        return Collections.emptyList();
    }

    @Override // com.yandex.mobile.ads.impl.oy1
    /* renamed from: a */
    public final int mo26262a(long j) {
        return j < 0 ? 0 : -1;
    }

    @Override // com.yandex.mobile.ads.impl.oy1
    /* renamed from: a */
    public final long mo26263a(int i) {
        if (i == 0) {
            return 0L;
        }
        throw new IllegalArgumentException();
    }
}
