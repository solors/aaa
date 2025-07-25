package io.appmetrica.analytics.ecommerce;

import androidx.annotation.Nullable;
import java.util.List;
import java.util.Map;

/* loaded from: classes9.dex */
public class ECommerceScreen {

    /* renamed from: a */
    private String f92502a;

    /* renamed from: b */
    private List f92503b;

    /* renamed from: c */
    private String f92504c;

    /* renamed from: d */
    private Map f92505d;

    @Nullable
    public List<String> getCategoriesPath() {
        return this.f92503b;
    }

    @Nullable
    public String getName() {
        return this.f92502a;
    }

    @Nullable
    public Map<String, String> getPayload() {
        return this.f92505d;
    }

    @Nullable
    public String getSearchQuery() {
        return this.f92504c;
    }

    public ECommerceScreen setCategoriesPath(@Nullable List<String> list) {
        this.f92503b = list;
        return this;
    }

    public ECommerceScreen setName(@Nullable String str) {
        this.f92502a = str;
        return this;
    }

    public ECommerceScreen setPayload(@Nullable Map<String, String> map) {
        this.f92505d = map;
        return this;
    }

    public ECommerceScreen setSearchQuery(@Nullable String str) {
        this.f92504c = str;
        return this;
    }

    public String toString() {
        return "ECommerceScreen{name='" + this.f92502a + "', categoriesPath=" + this.f92503b + ", searchQuery='" + this.f92504c + "', payload=" + this.f92505d + '}';
    }
}
