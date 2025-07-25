package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.backport.Provider;

/* renamed from: io.appmetrica.analytics.impl.F */
/* loaded from: classes9.dex */
public final class C33880F implements Provider {

    /* renamed from: a */
    public final /* synthetic */ Context f92805a;

    /* renamed from: b */
    public final /* synthetic */ InterfaceC34355Yh f92806b;

    /* renamed from: c */
    public final /* synthetic */ C33905G f92807c;

    public C33880F(C33905G c33905g, Context context, InterfaceC34355Yh interfaceC34355Yh) {
        this.f92807c = c33905g;
        this.f92805a = context;
        this.f92806b = interfaceC34355Yh;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.backport.Provider
    public final Object get() {
        return this.f92807c.f92879a.mo22313a(this.f92805a, this.f92806b);
    }
}
