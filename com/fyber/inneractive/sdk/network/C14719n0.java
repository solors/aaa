package com.fyber.inneractive.sdk.network;

import java.lang.ref.WeakReference;

/* renamed from: com.fyber.inneractive.sdk.network.n0 */
/* loaded from: classes4.dex */
public final class C14719n0 {

    /* renamed from: a */
    public final WeakReference f27895a;

    /* renamed from: b */
    public final WeakReference f27896b;

    /* renamed from: c */
    public final int f27897c;

    /* renamed from: d */
    public final RunnableC14717m0 f27898d = new RunnableC14717m0(this);

    public C14719n0(AbstractC14686U abstractC14686U, Thread thread, int i) {
        this.f27896b = new WeakReference(abstractC14686U);
        this.f27895a = new WeakReference(thread);
        this.f27897c = i;
    }
}
