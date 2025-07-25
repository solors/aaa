package com.yandex.mobile.ads.impl;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes8.dex */
final class r22 implements oy1 {

    /* renamed from: b */
    private final n22 f84609b;

    /* renamed from: c */
    private final long[] f84610c;

    /* renamed from: d */
    private final Map<String, q22> f84611d;

    /* renamed from: e */
    private final Map<String, o22> f84612e;

    /* renamed from: f */
    private final Map<String, String> f84613f;

    public r22(n22 n22Var, HashMap hashMap, HashMap hashMap2, HashMap hashMap3) {
        this.f84609b = n22Var;
        this.f84612e = hashMap2;
        this.f84613f = hashMap3;
        this.f84611d = Collections.unmodifiableMap(hashMap);
        this.f84610c = n22Var.m31679b();
    }

    @Override // com.yandex.mobile.ads.impl.oy1
    /* renamed from: a */
    public final long mo26263a(int i) {
        return this.f84610c[i];
    }

    @Override // com.yandex.mobile.ads.impl.oy1
    /* renamed from: b */
    public final List<C31840xt> mo26261b(long j) {
        return this.f84609b.m31686a(j, this.f84611d, this.f84612e, this.f84613f);
    }

    @Override // com.yandex.mobile.ads.impl.oy1
    /* renamed from: a */
    public final int mo26264a() {
        return this.f84610c.length;
    }

    @Override // com.yandex.mobile.ads.impl.oy1
    /* renamed from: a */
    public final int mo26262a(long j) {
        int m27067a = y32.m27067a(this.f84610c, j, false);
        if (m27067a < this.f84610c.length) {
            return m27067a;
        }
        return -1;
    }
}
