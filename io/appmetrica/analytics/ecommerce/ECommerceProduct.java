package io.appmetrica.analytics.ecommerce;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.List;
import java.util.Map;

/* loaded from: classes9.dex */
public class ECommerceProduct {

    /* renamed from: a */
    private final String f92492a;

    /* renamed from: b */
    private String f92493b;

    /* renamed from: c */
    private List f92494c;

    /* renamed from: d */
    private Map f92495d;

    /* renamed from: e */
    private ECommercePrice f92496e;

    /* renamed from: f */
    private ECommercePrice f92497f;

    /* renamed from: g */
    private List f92498g;

    public ECommerceProduct(@NonNull String str) {
        this.f92492a = str;
    }

    @Nullable
    public ECommercePrice getActualPrice() {
        return this.f92496e;
    }

    @Nullable
    public List<String> getCategoriesPath() {
        return this.f92494c;
    }

    @Nullable
    public String getName() {
        return this.f92493b;
    }

    @Nullable
    public ECommercePrice getOriginalPrice() {
        return this.f92497f;
    }

    @Nullable
    public Map<String, String> getPayload() {
        return this.f92495d;
    }

    @Nullable
    public List<String> getPromocodes() {
        return this.f92498g;
    }

    @NonNull
    public String getSku() {
        return this.f92492a;
    }

    @NonNull
    public ECommerceProduct setActualPrice(@Nullable ECommercePrice eCommercePrice) {
        this.f92496e = eCommercePrice;
        return this;
    }

    @NonNull
    public ECommerceProduct setCategoriesPath(@Nullable List<String> list) {
        this.f92494c = list;
        return this;
    }

    @NonNull
    public ECommerceProduct setName(@Nullable String str) {
        this.f92493b = str;
        return this;
    }

    @NonNull
    public ECommerceProduct setOriginalPrice(@Nullable ECommercePrice eCommercePrice) {
        this.f92497f = eCommercePrice;
        return this;
    }

    @NonNull
    public ECommerceProduct setPayload(@Nullable Map<String, String> map) {
        this.f92495d = map;
        return this;
    }

    @NonNull
    public ECommerceProduct setPromocodes(@Nullable List<String> list) {
        this.f92498g = list;
        return this;
    }

    public String toString() {
        return "ECommerceProduct{sku='" + this.f92492a + "', name='" + this.f92493b + "', categoriesPath=" + this.f92494c + ", payload=" + this.f92495d + ", actualPrice=" + this.f92496e + ", originalPrice=" + this.f92497f + ", promocodes=" + this.f92498g + '}';
    }
}
