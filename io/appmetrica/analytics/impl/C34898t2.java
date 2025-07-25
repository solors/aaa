package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.billinginterface.internal.BillingInfo;
import io.appmetrica.analytics.billinginterface.internal.ProductType;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import java.util.ArrayList;

/* renamed from: io.appmetrica.analytics.impl.t2 */
/* loaded from: classes9.dex */
public final class C34898t2 implements ProtobufConverter {

    /* renamed from: a */
    public final C34443c3 f95369a;

    public C34898t2() {
        this(new C34443c3());
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* renamed from: a */
    public final C34950v2 fromModel(@NonNull C34872s2 c34872s2) {
        C34950v2 c34950v2 = new C34950v2();
        c34950v2.f95497a = new C34924u2[c34872s2.f95316a.size()];
        int i = 0;
        for (BillingInfo billingInfo : c34872s2.f95316a) {
            C34924u2[] c34924u2Arr = c34950v2.f95497a;
            this.f95369a.getClass();
            c34924u2Arr[i] = C34443c3.m21917a(billingInfo);
            i++;
        }
        c34950v2.f95498b = c34872s2.f95317b;
        return c34950v2;
    }

    public C34898t2(C34443c3 c34443c3) {
        this.f95369a = c34443c3;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* renamed from: a */
    public final C34872s2 toModel(@NonNull C34950v2 c34950v2) {
        C34924u2[] c34924u2Arr;
        ProductType productType;
        ArrayList arrayList = new ArrayList(c34950v2.f95497a.length);
        for (C34924u2 c34924u2 : c34950v2.f95497a) {
            this.f95369a.getClass();
            int i = c34924u2.f95444a;
            if (i == 2) {
                productType = ProductType.INAPP;
            } else if (i != 3) {
                productType = ProductType.UNKNOWN;
            } else {
                productType = ProductType.SUBS;
            }
            arrayList.add(new BillingInfo(productType, c34924u2.f95445b, c34924u2.f95446c, c34924u2.f95447d, c34924u2.f95448e));
        }
        return new C34872s2(arrayList, c34950v2.f95498b);
    }
}
