package com.yandex.mobile.ads.impl;

import java.util.Collections;
import java.util.List;

/* loaded from: classes8.dex */
final class ny1 implements oy1 {

    /* renamed from: b */
    private final C31840xt[] f83199b;

    /* renamed from: c */
    private final long[] f83200c;

    public ny1(C31840xt[] c31840xtArr, long[] jArr) {
        this.f83199b = c31840xtArr;
        this.f83200c = jArr;
    }

    @Override // com.yandex.mobile.ads.impl.oy1
    /* renamed from: a */
    public final long mo26263a(int i) {
        if (i >= 0) {
            long[] jArr = this.f83200c;
            if (i < jArr.length) {
                return jArr[i];
            }
            throw new IllegalArgumentException();
        }
        throw new IllegalArgumentException();
    }

    @Override // com.yandex.mobile.ads.impl.oy1
    /* renamed from: b */
    public final List<C31840xt> mo26261b(long j) {
        C31840xt c31840xt;
        int m27056b = y32.m27056b(this.f83200c, j, false);
        if (m27056b != -1 && (c31840xt = this.f83199b[m27056b]) != C31840xt.f87805s) {
            return Collections.singletonList(c31840xt);
        }
        return Collections.emptyList();
    }

    @Override // com.yandex.mobile.ads.impl.oy1
    /* renamed from: a */
    public final int mo26264a() {
        return this.f83200c.length;
    }

    @Override // com.yandex.mobile.ads.impl.oy1
    /* renamed from: a */
    public final int mo26262a(long j) {
        int m27067a = y32.m27067a(this.f83200c, j, false);
        if (m27067a < this.f83200c.length) {
            return m27067a;
        }
        return -1;
    }
}
