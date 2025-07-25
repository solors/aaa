package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.ecommerce.ECommerceCartItem;
import java.math.BigDecimal;

/* renamed from: io.appmetrica.analytics.impl.C3 */
/* loaded from: classes9.dex */
public final class C33809C3 {

    /* renamed from: a */
    public final C34328Xe f92666a;

    /* renamed from: b */
    public final BigDecimal f92667b;

    /* renamed from: c */
    public final C34161Qe f92668c;

    /* renamed from: d */
    public final C34138Pf f92669d;

    public C33809C3(ECommerceCartItem eCommerceCartItem) {
        this(new C34328Xe(eCommerceCartItem.getProduct()), eCommerceCartItem.getQuantity(), new C34161Qe(eCommerceCartItem.getRevenue()), eCommerceCartItem.getReferrer() == null ? null : new C34138Pf(eCommerceCartItem.getReferrer()));
    }

    public final String toString() {
        return "CartItemWrapper{product=" + this.f92666a + ", quantity=" + this.f92667b + ", revenue=" + this.f92668c + ", referrer=" + this.f92669d + '}';
    }

    public C33809C3(C34328Xe c34328Xe, BigDecimal bigDecimal, C34161Qe c34161Qe, C34138Pf c34138Pf) {
        this.f92666a = c34328Xe;
        this.f92667b = bigDecimal;
        this.f92668c = c34161Qe;
        this.f92669d = c34138Pf;
    }
}
