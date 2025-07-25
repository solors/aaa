package com.p551my.target.common.models;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* renamed from: com.my.target.common.models.ShoppableAdsItem */
/* loaded from: classes7.dex */
public abstract class ShoppableAdsItem {
    @Nullable
    public final String deeplink;
    @Nullable
    public final String deeplinkFallbackUrl;
    @NonNull

    /* renamed from: id */
    public final String f66721id;
    @Nullable
    public final String oldPrice;
    @NonNull
    public final String picture;
    @Nullable
    public final String price;
    @NonNull
    public final String text;
    @NonNull
    public final String url;

    public ShoppableAdsItem(@NonNull String str, @NonNull String str2, @NonNull String str3, @NonNull String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8) {
        this.url = str;
        this.f66721id = str2;
        this.picture = str3;
        this.text = str4;
        this.price = str5;
        this.oldPrice = str6;
        this.deeplink = str7;
        this.deeplinkFallbackUrl = str8;
    }
}
