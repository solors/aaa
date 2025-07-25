package com.yandex.mobile.ads.common;

import com.yandex.mobile.ads.banner.BannerAdSize;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes8.dex */
public final class BidderTokenRequestConfiguration {
    @NotNull

    /* renamed from: a */
    private final AdType f76565a;
    @Nullable

    /* renamed from: b */
    private final BannerAdSize f76566b;
    @Nullable

    /* renamed from: c */
    private final Map<String, String> f76567c;

    @Metadata
    /* loaded from: classes8.dex */
    public static final class Builder {
        @NotNull

        /* renamed from: a */
        private final AdType f76568a;
        @Nullable

        /* renamed from: b */
        private BannerAdSize f76569b;
        @Nullable

        /* renamed from: c */
        private Map<String, String> f76570c;

        public Builder(@NotNull AdType adType) {
            Intrinsics.checkNotNullParameter(adType, "adType");
            this.f76568a = adType;
        }

        @NotNull
        public final BidderTokenRequestConfiguration build() {
            return new BidderTokenRequestConfiguration(this.f76568a, this.f76569b, this.f76570c, null);
        }

        @NotNull
        public final Builder setBannerAdSize(@Nullable BannerAdSize bannerAdSize) {
            this.f76569b = bannerAdSize;
            return this;
        }

        @NotNull
        public final Builder setParameters(@Nullable Map<String, String> map) {
            this.f76570c = map;
            return this;
        }
    }

    public /* synthetic */ BidderTokenRequestConfiguration(AdType adType, BannerAdSize bannerAdSize, Map map, DefaultConstructorMarker defaultConstructorMarker) {
        this(adType, bannerAdSize, map);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !Intrinsics.m17075f(BidderTokenRequestConfiguration.class, obj.getClass())) {
            return false;
        }
        BidderTokenRequestConfiguration bidderTokenRequestConfiguration = (BidderTokenRequestConfiguration) obj;
        if (this.f76565a != bidderTokenRequestConfiguration.f76565a || !Intrinsics.m17075f(this.f76566b, bidderTokenRequestConfiguration.f76566b)) {
            return false;
        }
        return Intrinsics.m17075f(this.f76567c, bidderTokenRequestConfiguration.f76567c);
    }

    @NotNull
    public final AdType getAdType() {
        return this.f76565a;
    }

    @Nullable
    public final BannerAdSize getBannerAdSize() {
        return this.f76566b;
    }

    @Nullable
    public final Map<String, String> getParameters() {
        return this.f76567c;
    }

    public int hashCode() {
        int i;
        int hashCode = this.f76565a.hashCode() * 31;
        BannerAdSize bannerAdSize = this.f76566b;
        int i2 = 0;
        if (bannerAdSize != null) {
            i = bannerAdSize.hashCode();
        } else {
            i = 0;
        }
        int i3 = (hashCode + i) * 31;
        Map<String, String> map = this.f76567c;
        if (map != null) {
            i2 = map.hashCode();
        }
        return i3 + i2;
    }

    private BidderTokenRequestConfiguration(AdType adType, BannerAdSize bannerAdSize, Map<String, String> map) {
        this.f76565a = adType;
        this.f76566b = bannerAdSize;
        this.f76567c = map;
    }
}
