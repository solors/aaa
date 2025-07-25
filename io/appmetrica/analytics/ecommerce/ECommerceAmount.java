package io.appmetrica.analytics.ecommerce;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.impl.AbstractC34679kn;
import java.math.BigDecimal;

/* loaded from: classes9.dex */
public class ECommerceAmount {

    /* renamed from: a */
    private final BigDecimal f92481a;

    /* renamed from: b */
    private final String f92482b;

    public ECommerceAmount(long j, @NonNull String str) {
        this(AbstractC34679kn.m21475a(j), str);
    }

    @NonNull
    public BigDecimal getAmount() {
        return this.f92481a;
    }

    @NonNull
    public String getUnit() {
        return this.f92482b;
    }

    @NonNull
    public String toString() {
        return "ECommerceAmount{amount=" + this.f92481a + ", unit='" + this.f92482b + "'}";
    }

    public ECommerceAmount(double d, @NonNull String str) {
        this(new BigDecimal(AbstractC34679kn.m21476a(d)), str);
    }

    public ECommerceAmount(@NonNull BigDecimal bigDecimal, @NonNull String str) {
        this.f92481a = bigDecimal;
        this.f92482b = str;
    }
}
