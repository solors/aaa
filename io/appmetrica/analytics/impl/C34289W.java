package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.ecommerce.ECommerceAmount;
import java.math.BigDecimal;

/* renamed from: io.appmetrica.analytics.impl.W */
/* loaded from: classes9.dex */
public final class C34289W {

    /* renamed from: a */
    public final BigDecimal f93624a;

    /* renamed from: b */
    public final String f93625b;

    public C34289W(ECommerceAmount eCommerceAmount) {
        this(eCommerceAmount.getAmount(), eCommerceAmount.getUnit());
    }

    public final String toString() {
        return "AmountWrapper{amount=" + this.f93624a + ", unit='" + this.f93625b + "'}";
    }

    public C34289W(BigDecimal bigDecimal, String str) {
        this.f93624a = bigDecimal;
        this.f93625b = str;
    }
}
