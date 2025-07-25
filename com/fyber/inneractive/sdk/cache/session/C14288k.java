package com.fyber.inneractive.sdk.cache.session;

import java.util.PriorityQueue;

/* renamed from: com.fyber.inneractive.sdk.cache.session.k */
/* loaded from: classes4.dex */
public final class C14288k extends PriorityQueue {

    /* renamed from: a */
    public final int f26998a;

    public C14288k(int i) {
        super(1, new C14289l());
        this.f26998a = i;
    }

    @Override // java.util.PriorityQueue, java.util.AbstractQueue, java.util.AbstractCollection, java.util.Collection, java.util.Queue
    public final boolean add(C14284g c14284g) {
        boolean add = super.add((C14288k) c14284g);
        if (super.size() > this.f26998a) {
            poll();
        }
        return add;
    }
}
