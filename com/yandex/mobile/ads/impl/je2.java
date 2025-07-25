package com.yandex.mobile.ads.impl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* loaded from: classes8.dex */
final class je2 implements oy1 {

    /* renamed from: b */
    private final List<fe2> f80881b;

    /* renamed from: c */
    private final long[] f80882c;

    /* renamed from: d */
    private final long[] f80883d;

    public je2(ArrayList arrayList) {
        this.f80881b = Collections.unmodifiableList(new ArrayList(arrayList));
        this.f80882c = new long[arrayList.size() * 2];
        for (int i = 0; i < arrayList.size(); i++) {
            fe2 fe2Var = (fe2) arrayList.get(i);
            int i2 = i * 2;
            long[] jArr = this.f80882c;
            jArr[i2] = fe2Var.f79063b;
            jArr[i2 + 1] = fe2Var.f79064c;
        }
        long[] jArr2 = this.f80882c;
        long[] copyOf = Arrays.copyOf(jArr2, jArr2.length);
        this.f80883d = copyOf;
        Arrays.sort(copyOf);
    }

    /* renamed from: b */
    public static /* synthetic */ int m32939b(fe2 fe2Var, fe2 fe2Var2) {
        return m32940a(fe2Var, fe2Var2);
    }

    @Override // com.yandex.mobile.ads.impl.oy1
    /* renamed from: a */
    public final long mo26263a(int i) {
        if (i >= 0) {
            long[] jArr = this.f80883d;
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
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i = 0; i < this.f80881b.size(); i++) {
            long[] jArr = this.f80882c;
            int i2 = i * 2;
            if (jArr[i2] <= j && j < jArr[i2 + 1]) {
                fe2 fe2Var = this.f80881b.get(i);
                C31840xt c31840xt = fe2Var.f79062a;
                if (c31840xt.f87811f == -3.4028235E38f) {
                    arrayList2.add(fe2Var);
                } else {
                    arrayList.add(c31840xt);
                }
            }
        }
        Collections.sort(arrayList2, new Comparator() { // from class: com.yandex.mobile.ads.impl.sq2
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return je2.m32939b((fe2) obj, (fe2) obj2);
            }
        });
        for (int i3 = 0; i3 < arrayList2.size(); i3++) {
            arrayList.add(((fe2) arrayList2.get(i3)).f79062a.m27254a().m27248a(1, (-1) - i3).m27251a());
        }
        return arrayList;
    }

    @Override // com.yandex.mobile.ads.impl.oy1
    /* renamed from: a */
    public final int mo26264a() {
        return this.f80883d.length;
    }

    @Override // com.yandex.mobile.ads.impl.oy1
    /* renamed from: a */
    public final int mo26262a(long j) {
        int m27067a = y32.m27067a(this.f80883d, j, false);
        if (m27067a < this.f80883d.length) {
            return m27067a;
        }
        return -1;
    }

    /* renamed from: a */
    public static /* synthetic */ int m32940a(fe2 fe2Var, fe2 fe2Var2) {
        return Long.compare(fe2Var.f79063b, fe2Var2.f79063b);
    }
}
