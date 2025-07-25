package com.applovin.impl;

import java.util.Collections;
import java.util.List;

/* renamed from: com.applovin.impl.kl */
/* loaded from: classes2.dex */
final class C4722kl implements InterfaceC5019nl {

    /* renamed from: a */
    private final C3989a5[] f7557a;

    /* renamed from: b */
    private final long[] f7558b;

    public C4722kl(C3989a5[] c3989a5Arr, long[] jArr) {
        this.f7557a = c3989a5Arr;
        this.f7558b = jArr;
    }

    @Override // com.applovin.impl.InterfaceC5019nl
    /* renamed from: a */
    public long mo94601a(int i) {
        AbstractC4100b1.m100580a(i >= 0);
        AbstractC4100b1.m100580a(i < this.f7558b.length);
        return this.f7558b[i];
    }

    @Override // com.applovin.impl.InterfaceC5019nl
    /* renamed from: b */
    public List mo94597b(long j) {
        C3989a5 c3989a5;
        int m92980b = AbstractC5863xp.m92980b(this.f7558b, j, true, false);
        if (m92980b != -1 && (c3989a5 = this.f7557a[m92980b]) != C3989a5.f4486s) {
            return Collections.singletonList(c3989a5);
        }
        return Collections.emptyList();
    }

    @Override // com.applovin.impl.InterfaceC5019nl
    /* renamed from: a */
    public int mo94602a() {
        return this.f7558b.length;
    }

    @Override // com.applovin.impl.InterfaceC5019nl
    /* renamed from: a */
    public int mo94600a(long j) {
        int m93001a = AbstractC5863xp.m93001a(this.f7558b, j, false, false);
        if (m93001a < this.f7558b.length) {
            return m93001a;
        }
        return -1;
    }
}
