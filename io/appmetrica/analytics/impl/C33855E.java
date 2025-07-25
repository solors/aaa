package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.backport.Provider;
import io.appmetrica.analytics.coreapi.internal.identifiers.AdTrackingInfoResult;

/* renamed from: io.appmetrica.analytics.impl.E */
/* loaded from: classes9.dex */
public final class C33855E implements Provider {

    /* renamed from: a */
    public final /* synthetic */ Context f92749a;

    /* renamed from: b */
    public final /* synthetic */ C33905G f92750b;

    public C33855E(C33905G c33905g, Context context) {
        this.f92750b = c33905g;
        this.f92749a = context;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.backport.Provider
    /* renamed from: a */
    public final AdTrackingInfoResult get() {
        return this.f92750b.f92879a.mo22314a(this.f92749a);
    }
}
