package io.appmetrica.analytics.ecommerce;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.List;
import java.util.Map;

/* loaded from: classes9.dex */
public class ECommerceOrder {

    /* renamed from: a */
    private final String f92487a;

    /* renamed from: b */
    private final List f92488b;

    /* renamed from: c */
    private Map f92489c;

    public ECommerceOrder(@NonNull String str, @NonNull List<ECommerceCartItem> list) {
        this.f92487a = str;
        this.f92488b = list;
    }

    @NonNull
    public List<ECommerceCartItem> getCartItems() {
        return this.f92488b;
    }

    @NonNull
    public String getIdentifier() {
        return this.f92487a;
    }

    @Nullable
    public Map<String, String> getPayload() {
        return this.f92489c;
    }

    public ECommerceOrder setPayload(@Nullable Map<String, String> map) {
        this.f92489c = map;
        return this;
    }

    public String toString() {
        return "ECommerceOrder{identifier='" + this.f92487a + "', cartItems=" + this.f92488b + ", payload=" + this.f92489c + '}';
    }
}
