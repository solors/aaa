package com.applovin.impl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* renamed from: com.applovin.impl.as */
/* loaded from: classes2.dex */
final class C4088as implements InterfaceC5019nl {

    /* renamed from: a */
    private final List f4849a;

    /* renamed from: b */
    private final long[] f4850b;

    /* renamed from: c */
    private final long[] f4851c;

    public C4088as(List list) {
        this.f4849a = Collections.unmodifiableList(new ArrayList(list));
        this.f4850b = new long[list.size() * 2];
        for (int i = 0; i < list.size(); i++) {
            C5802wr c5802wr = (C5802wr) list.get(i);
            int i2 = i * 2;
            long[] jArr = this.f4850b;
            jArr[i2] = c5802wr.f11814b;
            jArr[i2 + 1] = c5802wr.f11815c;
        }
        long[] jArr2 = this.f4850b;
        long[] copyOf = Arrays.copyOf(jArr2, jArr2.length);
        this.f4851c = copyOf;
        Arrays.sort(copyOf);
    }

    /* renamed from: b */
    public static /* synthetic */ int m100607b(C5802wr c5802wr, C5802wr c5802wr2) {
        return m100608a(c5802wr, c5802wr2);
    }

    @Override // com.applovin.impl.InterfaceC5019nl
    /* renamed from: a */
    public long mo94601a(int i) {
        AbstractC4100b1.m100580a(i >= 0);
        AbstractC4100b1.m100580a(i < this.f4851c.length);
        return this.f4851c[i];
    }

    @Override // com.applovin.impl.InterfaceC5019nl
    /* renamed from: b */
    public List mo94597b(long j) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i = 0; i < this.f4849a.size(); i++) {
            long[] jArr = this.f4850b;
            int i2 = i * 2;
            if (jArr[i2] <= j && j < jArr[i2 + 1]) {
                C5802wr c5802wr = (C5802wr) this.f4849a.get(i);
                C3989a5 c3989a5 = c5802wr.f11813a;
                if (c3989a5.f4492f == -3.4028235E38f) {
                    arrayList2.add(c5802wr);
                } else {
                    arrayList.add(c3989a5);
                }
            }
        }
        Collections.sort(arrayList2, new Comparator() { // from class: com.applovin.impl.qs
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return C4088as.m100607b((C5802wr) obj, (C5802wr) obj2);
            }
        });
        for (int i3 = 0; i3 < arrayList2.size(); i3++) {
            arrayList.add(((C5802wr) arrayList2.get(i3)).f11813a.m101054a().m101048a((-1) - i3, 1).m101050a());
        }
        return arrayList;
    }

    @Override // com.applovin.impl.InterfaceC5019nl
    /* renamed from: a */
    public int mo94602a() {
        return this.f4851c.length;
    }

    @Override // com.applovin.impl.InterfaceC5019nl
    /* renamed from: a */
    public int mo94600a(long j) {
        int m93001a = AbstractC5863xp.m93001a(this.f4851c, j, false, false);
        if (m93001a < this.f4851c.length) {
            return m93001a;
        }
        return -1;
    }

    /* renamed from: a */
    public static /* synthetic */ int m100608a(C5802wr c5802wr, C5802wr c5802wr2) {
        return Long.compare(c5802wr.f11814b, c5802wr2.f11814b);
    }
}
