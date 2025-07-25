package io.appmetrica.analytics.ecommerce;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* loaded from: classes9.dex */
public class ECommerceReferrer {

    /* renamed from: a */
    private String f92499a;

    /* renamed from: b */
    private String f92500b;

    /* renamed from: c */
    private ECommerceScreen f92501c;

    @Nullable
    public String getIdentifier() {
        return this.f92500b;
    }

    @Nullable
    public ECommerceScreen getScreen() {
        return this.f92501c;
    }

    @Nullable
    public String getType() {
        return this.f92499a;
    }

    @NonNull
    public ECommerceReferrer setIdentifier(@Nullable String str) {
        this.f92500b = str;
        return this;
    }

    @NonNull
    public ECommerceReferrer setScreen(@Nullable ECommerceScreen eCommerceScreen) {
        this.f92501c = eCommerceScreen;
        return this;
    }

    @NonNull
    public ECommerceReferrer setType(@Nullable String str) {
        this.f92499a = str;
        return this;
    }

    public String toString() {
        return "ECommerceReferrer{type='" + this.f92499a + "', identifier='" + this.f92500b + "', screen=" + this.f92501c + '}';
    }
}
