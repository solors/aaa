package com.yandex.mobile.ads.impl;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes8.dex */
public final class hf1 extends AbstractC30429h {

    /* renamed from: f */
    private final int f80056f;

    /* renamed from: g */
    private final int f80057g;

    /* renamed from: h */
    private final int[] f80058h;

    /* renamed from: i */
    private final int[] f80059i;

    /* renamed from: j */
    private final g02[] f80060j;

    /* renamed from: k */
    private final Object[] f80061k;

    /* renamed from: l */
    private final HashMap<Object, Integer> f80062l;

    public hf1(List list, st1 st1Var) {
        super(st1Var);
        int size = list.size();
        this.f80058h = new int[size];
        this.f80059i = new int[size];
        this.f80060j = new g02[size];
        this.f80061k = new Object[size];
        this.f80062l = new HashMap<>();
        Iterator it = list.iterator();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (it.hasNext()) {
            xt0 xt0Var = (xt0) it.next();
            this.f80060j[i3] = xt0Var.mo26583b();
            this.f80059i[i3] = i;
            this.f80058h[i3] = i2;
            i += this.f80060j[i3].mo31764b();
            i2 += this.f80060j[i3].mo31769a();
            this.f80061k[i3] = xt0Var.mo26584a();
            this.f80062l.put(this.f80061k[i3], Integer.valueOf(i3));
            i3++;
        }
        this.f80056f = i;
        this.f80057g = i2;
    }

    @Override // com.yandex.mobile.ads.impl.g02
    /* renamed from: a */
    public final int mo31769a() {
        return this.f80057g;
    }

    @Override // com.yandex.mobile.ads.impl.AbstractC30429h
    /* renamed from: b */
    protected final int mo33564b(Object obj) {
        Integer num = this.f80062l.get(obj);
        if (num == null) {
            return -1;
        }
        return num.intValue();
    }

    @Override // com.yandex.mobile.ads.impl.AbstractC30429h
    /* renamed from: c */
    protected final int mo33563c(int i) {
        return y32.m27069a(this.f80059i, i + 1, false, false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public final List<g02> m33562d() {
        return Arrays.asList(this.f80060j);
    }

    @Override // com.yandex.mobile.ads.impl.AbstractC30429h
    /* renamed from: e */
    protected final int mo33560e(int i) {
        return this.f80058h[i];
    }

    @Override // com.yandex.mobile.ads.impl.AbstractC30429h
    /* renamed from: f */
    protected final int mo33559f(int i) {
        return this.f80059i[i];
    }

    @Override // com.yandex.mobile.ads.impl.AbstractC30429h
    /* renamed from: g */
    protected final g02 mo33558g(int i) {
        return this.f80060j[i];
    }

    @Override // com.yandex.mobile.ads.impl.AbstractC30429h
    /* renamed from: d */
    protected final Object mo33561d(int i) {
        return this.f80061k[i];
    }

    @Override // com.yandex.mobile.ads.impl.AbstractC30429h
    /* renamed from: b */
    protected final int mo33565b(int i) {
        return y32.m27069a(this.f80058h, i + 1, false, false);
    }

    @Override // com.yandex.mobile.ads.impl.g02
    /* renamed from: b */
    public final int mo31764b() {
        return this.f80056f;
    }
}
