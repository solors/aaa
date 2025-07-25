package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.billinginterface.internal.BillingInfo;
import io.appmetrica.analytics.billinginterface.internal.ProductType;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;

/* renamed from: io.appmetrica.analytics.impl.c3 */
/* loaded from: classes9.dex */
public final class C34443c3 implements ProtobufConverter {
    /* renamed from: a */
    public static C34924u2 m21917a(BillingInfo billingInfo) {
        C34924u2 c34924u2 = new C34924u2();
        int i = AbstractC34416b3.f94006a[billingInfo.type.ordinal()];
        int i2 = 2;
        if (i != 1) {
            if (i != 2) {
                i2 = 1;
            } else {
                i2 = 3;
            }
        }
        c34924u2.f95444a = i2;
        c34924u2.f95445b = billingInfo.productId;
        c34924u2.f95446c = billingInfo.purchaseToken;
        c34924u2.f95447d = billingInfo.purchaseTime;
        c34924u2.f95448e = billingInfo.sendTime;
        return c34924u2;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final /* bridge */ /* synthetic */ Object fromModel(Object obj) {
        return m21917a((BillingInfo) obj);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        ProductType productType;
        C34924u2 c34924u2 = (C34924u2) obj;
        int i = c34924u2.f95444a;
        if (i != 2) {
            if (i != 3) {
                productType = ProductType.UNKNOWN;
            } else {
                productType = ProductType.SUBS;
            }
        } else {
            productType = ProductType.INAPP;
        }
        return new BillingInfo(productType, c34924u2.f95445b, c34924u2.f95446c, c34924u2.f95447d, c34924u2.f95448e);
    }
}
