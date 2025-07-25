package com.applovin.impl;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.applovin.impl.sh */
/* loaded from: classes2.dex */
final class C5515sh extends AbstractC4096b {

    /* renamed from: g */
    private final int f10352g;

    /* renamed from: h */
    private final int f10353h;

    /* renamed from: i */
    private final int[] f10354i;

    /* renamed from: j */
    private final int[] f10355j;

    /* renamed from: k */
    private final AbstractC4406fo[] f10356k;

    /* renamed from: l */
    private final Object[] f10357l;

    /* renamed from: m */
    private final HashMap f10358m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5515sh(Collection collection, InterfaceC5783wj interfaceC5783wj) {
        super(false, interfaceC5783wj);
        int i = 0;
        int size = collection.size();
        this.f10354i = new int[size];
        this.f10355j = new int[size];
        this.f10356k = new AbstractC4406fo[size];
        this.f10357l = new Object[size];
        this.f10358m = new HashMap();
        Iterator it = collection.iterator();
        int i2 = 0;
        int i3 = 0;
        while (it.hasNext()) {
            InterfaceC4255de interfaceC4255de = (InterfaceC4255de) it.next();
            this.f10356k[i3] = interfaceC4255de.mo99529b();
            this.f10355j[i3] = i;
            this.f10354i[i3] = i2;
            i += this.f10356k[i3].mo93560b();
            i2 += this.f10356k[i3].mo93564a();
            this.f10357l[i3] = interfaceC4255de.mo99531a();
            this.f10358m.put(this.f10357l[i3], Integer.valueOf(i3));
            i3++;
        }
        this.f10352g = i;
        this.f10353h = i2;
    }

    @Override // com.applovin.impl.AbstractC4406fo
    /* renamed from: a */
    public int mo93564a() {
        return this.f10353h;
    }

    @Override // com.applovin.impl.AbstractC4096b
    /* renamed from: b */
    protected int mo94615b(Object obj) {
        Integer num = (Integer) this.f10358m.get(obj);
        if (num == null) {
            return -1;
        }
        return num.intValue();
    }

    @Override // com.applovin.impl.AbstractC4096b
    /* renamed from: d */
    protected int mo94613d(int i) {
        return AbstractC5863xp.m93003a(this.f10354i, i + 1, false, false);
    }

    @Override // com.applovin.impl.AbstractC4096b
    /* renamed from: e */
    protected int mo94612e(int i) {
        return AbstractC5863xp.m93003a(this.f10355j, i + 1, false, false);
    }

    @Override // com.applovin.impl.AbstractC4096b
    /* renamed from: f */
    protected Object mo94611f(int i) {
        return this.f10357l[i];
    }

    @Override // com.applovin.impl.AbstractC4096b
    /* renamed from: g */
    protected int mo94610g(int i) {
        return this.f10354i[i];
    }

    @Override // com.applovin.impl.AbstractC4096b
    /* renamed from: h */
    protected int mo94609h(int i) {
        return this.f10355j[i];
    }

    @Override // com.applovin.impl.AbstractC4096b
    /* renamed from: i */
    protected AbstractC4406fo mo94608i(int i) {
        return this.f10356k[i];
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public List m94614d() {
        return Arrays.asList(this.f10356k);
    }

    @Override // com.applovin.impl.AbstractC4406fo
    /* renamed from: b */
    public int mo93560b() {
        return this.f10352g;
    }
}
