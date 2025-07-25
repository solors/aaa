package io.appmetrica.analytics.ecommerce;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.impl.AbstractC34679kn;
import java.math.BigDecimal;

/* loaded from: classes9.dex */
public class ECommerceCartItem {

    /* renamed from: a */
    private final ECommerceProduct f92483a;

    /* renamed from: b */
    private final BigDecimal f92484b;

    /* renamed from: c */
    private final ECommercePrice f92485c;

    /* renamed from: d */
    private ECommerceReferrer f92486d;

    public ECommerceCartItem(@NonNull ECommerceProduct eCommerceProduct, @NonNull ECommercePrice eCommercePrice, long j) {
        this(eCommerceProduct, eCommercePrice, AbstractC34679kn.m21475a(j));
    }

    @NonNull
    public ECommerceProduct getProduct() {
        return this.f92483a;
    }

    @NonNull
    public BigDecimal getQuantity() {
        return this.f92484b;
    }

    @Nullable
    public ECommerceReferrer getReferrer() {
        return this.f92486d;
    }

    @NonNull
    public ECommercePrice getRevenue() {
        return this.f92485c;
    }

    @NonNull
    public ECommerceCartItem setReferrer(@Nullable ECommerceReferrer eCommerceReferrer) {
        this.f92486d = eCommerceReferrer;
        return this;
    }

    public String toString() {
        return "ECommerceCartItem{product=" + this.f92483a + ", quantity=" + this.f92484b + ", revenue=" + this.f92485c + ", referrer=" + this.f92486d + '}';
    }

    public ECommerceCartItem(@NonNull ECommerceProduct eCommerceProduct, @NonNull ECommercePrice eCommercePrice, double d) {
        this(eCommerceProduct, eCommercePrice, new BigDecimal(AbstractC34679kn.m21476a(d)));
    }

    public ECommerceCartItem(@NonNull ECommerceProduct eCommerceProduct, @NonNull ECommercePrice eCommercePrice, @NonNull BigDecimal bigDecimal) {
        this.f92483a = eCommerceProduct;
        this.f92484b = bigDecimal;
        this.f92485c = eCommercePrice;
    }
}
