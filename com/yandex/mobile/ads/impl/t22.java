package com.yandex.mobile.ads.impl;

import java.util.Collections;
import java.util.List;

/* loaded from: classes8.dex */
final class t22 implements oy1 {

    /* renamed from: c */
    public static final t22 f85491c = new t22();

    /* renamed from: b */
    private final List<C31840xt> f85492b;

    private t22() {
        this.f85492b = Collections.emptyList();
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
            return this.f85492b;
        }
        return Collections.emptyList();
    }

    @Override // com.yandex.mobile.ads.impl.oy1
    /* renamed from: a */
    public final int mo26262a(long j) {
        return j < 0 ? 0 : -1;
    }

    public t22(C31840xt c31840xt) {
        this.f85492b = Collections.singletonList(c31840xt);
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
