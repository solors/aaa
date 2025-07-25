package io.appmetrica.analytics.ecommerce;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.List;

/* loaded from: classes9.dex */
public class ECommercePrice {

    /* renamed from: a */
    private final ECommerceAmount f92490a;

    /* renamed from: b */
    private List f92491b;

    public ECommercePrice(@NonNull ECommerceAmount eCommerceAmount) {
        this.f92490a = eCommerceAmount;
    }

    @NonNull
    public ECommerceAmount getFiat() {
        return this.f92490a;
    }

    @Nullable
    public List<ECommerceAmount> getInternalComponents() {
        return this.f92491b;
    }

    public ECommercePrice setInternalComponents(@Nullable List<ECommerceAmount> list) {
        this.f92491b = list;
        return this;
    }

    public String toString() {
        return "ECommercePrice{fiat=" + this.f92490a + ", internalComponents=" + this.f92491b + '}';
    }
}
