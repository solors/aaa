package com.yandex.mobile.ads.impl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes8.dex */
final class lx1 implements oy1 {

    /* renamed from: b */
    private final List<List<C31840xt>> f81966b;

    /* renamed from: c */
    private final List<Long> f81967c;

    public lx1(ArrayList arrayList, ArrayList arrayList2) {
        this.f81966b = arrayList;
        this.f81967c = arrayList2;
    }

    @Override // com.yandex.mobile.ads.impl.oy1
    /* renamed from: a */
    public final long mo26263a(int i) {
        if (i >= 0) {
            if (i < this.f81967c.size()) {
                return this.f81967c.get(i).longValue();
            }
            throw new IllegalArgumentException();
        }
        throw new IllegalArgumentException();
    }

    @Override // com.yandex.mobile.ads.impl.oy1
    /* renamed from: b */
    public final List<C31840xt> mo26261b(long j) {
        int m27073a = y32.m27073a((List) this.f81967c, Long.valueOf(j), false);
        if (m27073a == -1) {
            return Collections.emptyList();
        }
        return this.f81966b.get(m27073a);
    }

    @Override // com.yandex.mobile.ads.impl.oy1
    /* renamed from: a */
    public final int mo26264a() {
        return this.f81967c.size();
    }

    @Override // com.yandex.mobile.ads.impl.oy1
    /* renamed from: a */
    public final int mo26262a(long j) {
        int i;
        List<Long> list = this.f81967c;
        Long valueOf = Long.valueOf(j);
        int i2 = y32.f88010a;
        int binarySearch = Collections.binarySearch(list, valueOf);
        if (binarySearch < 0) {
            i = ~binarySearch;
        } else {
            int size = list.size();
            do {
                binarySearch++;
                if (binarySearch >= size) {
                    break;
                }
            } while (list.get(binarySearch).compareTo(valueOf) == 0);
            i = binarySearch;
        }
        if (i < this.f81967c.size()) {
            return i;
        }
        return -1;
    }
}
