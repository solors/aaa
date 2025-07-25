package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.backport.Consumer;
import java.io.File;

/* renamed from: io.appmetrica.analytics.impl.E1 */
/* loaded from: classes9.dex */
public final class C33857E1 implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C33907G1 f92755a;

    public C33857E1(C33907G1 c33907g1) {
        this.f92755a = c33907g1;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.backport.Consumer
    public final void consume(Object obj) {
        this.f92755a.m22592a((File) obj);
    }
}
