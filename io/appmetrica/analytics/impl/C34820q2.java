package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.billinginterface.internal.config.BillingConfig;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;

/* renamed from: io.appmetrica.analytics.impl.q2 */
/* loaded from: classes9.dex */
public final class C34820q2 implements ProtobufConverter {
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* renamed from: a */
    public final C34891sl fromModel(@NonNull BillingConfig billingConfig) {
        C34891sl c34891sl = new C34891sl();
        c34891sl.f95338a = billingConfig.sendFrequencySeconds;
        c34891sl.f95339b = billingConfig.firstCollectingInappMaxAgeSeconds;
        return c34891sl;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    public final Object toModel(@NonNull Object obj) {
        C34891sl c34891sl = (C34891sl) obj;
        return new BillingConfig(c34891sl.f95338a, c34891sl.f95339b);
    }

    @NonNull
    /* renamed from: a */
    public final BillingConfig m21102a(@NonNull C34891sl c34891sl) {
        return new BillingConfig(c34891sl.f95338a, c34891sl.f95339b);
    }
}
