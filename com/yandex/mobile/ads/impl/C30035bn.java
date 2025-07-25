package com.yandex.mobile.ads.impl;

import java.util.Collections;
import java.util.List;

/* renamed from: com.yandex.mobile.ads.impl.bn */
/* loaded from: classes8.dex */
final class C30035bn implements oy1 {

    /* renamed from: b */
    private final List<C31840xt> f77362b;

    public C30035bn(List<C31840xt> list) {
        this.f77362b = list;
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
            return this.f77362b;
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
