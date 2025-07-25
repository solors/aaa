package com.yandex.mobile.ads.nativeads;

import android.location.Location;
import com.yandex.mobile.ads.common.AdTheme;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes8.dex */
public final class NativeAdRequestConfiguration {
    @NotNull

    /* renamed from: a */
    private final String f89204a;
    @Nullable

    /* renamed from: b */
    private final String f89205b;
    @Nullable

    /* renamed from: c */
    private final String f89206c;
    @Nullable

    /* renamed from: d */
    private final String f89207d;
    @Nullable

    /* renamed from: e */
    private final List<String> f89208e;
    @Nullable

    /* renamed from: f */
    private final Location f89209f;
    @Nullable

    /* renamed from: g */
    private final Map<String, String> f89210g;
    @Nullable

    /* renamed from: h */
    private final String f89211h;
    @Nullable

    /* renamed from: i */
    private final AdTheme f89212i;

    /* renamed from: j */
    private final boolean f89213j;

    @Metadata
    /* loaded from: classes8.dex */
    public static final class Builder {
        @NotNull

        /* renamed from: a */
        private final String f89214a;
        @Nullable

        /* renamed from: b */
        private String f89215b;
        @Nullable

        /* renamed from: c */
        private String f89216c;
        @Nullable

        /* renamed from: d */
        private Location f89217d;
        @Nullable

        /* renamed from: e */
        private String f89218e;
        @Nullable

        /* renamed from: f */
        private List<String> f89219f;
        @Nullable

        /* renamed from: g */
        private Map<String, String> f89220g;
        @Nullable

        /* renamed from: h */
        private String f89221h;
        @Nullable

        /* renamed from: i */
        private AdTheme f89222i;

        /* renamed from: j */
        private boolean f89223j;

        public Builder(@NotNull String adUnitId) {
            Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
            this.f89214a = adUnitId;
            this.f89223j = true;
        }

        @NotNull
        public final NativeAdRequestConfiguration build() {
            return new NativeAdRequestConfiguration(this.f89214a, this.f89215b, this.f89216c, this.f89218e, this.f89219f, this.f89217d, this.f89220g, this.f89221h, this.f89222i, this.f89223j, null);
        }

        @NotNull
        public final Builder setAge(@NotNull String age) {
            Intrinsics.checkNotNullParameter(age, "age");
            this.f89215b = age;
            return this;
        }

        @NotNull
        public final Builder setBiddingData(@NotNull String biddingData) {
            Intrinsics.checkNotNullParameter(biddingData, "biddingData");
            this.f89221h = biddingData;
            return this;
        }

        @NotNull
        public final Builder setContextQuery(@NotNull String contextQuery) {
            Intrinsics.checkNotNullParameter(contextQuery, "contextQuery");
            this.f89218e = contextQuery;
            return this;
        }

        @NotNull
        public final Builder setContextTags(@NotNull List<String> contextTags) {
            Intrinsics.checkNotNullParameter(contextTags, "contextTags");
            this.f89219f = contextTags;
            return this;
        }

        @NotNull
        public final Builder setGender(@NotNull String gender) {
            Intrinsics.checkNotNullParameter(gender, "gender");
            this.f89216c = gender;
            return this;
        }

        @NotNull
        public final Builder setLocation(@NotNull Location location) {
            Intrinsics.checkNotNullParameter(location, "location");
            this.f89217d = location;
            return this;
        }

        @NotNull
        public final Builder setParameters(@NotNull Map<String, String> parameters) {
            Intrinsics.checkNotNullParameter(parameters, "parameters");
            this.f89220g = parameters;
            return this;
        }

        @NotNull
        public final Builder setPreferredTheme(@NotNull AdTheme preferredTheme) {
            Intrinsics.checkNotNullParameter(preferredTheme, "preferredTheme");
            this.f89222i = preferredTheme;
            return this;
        }

        @NotNull
        public final Builder setShouldLoadImagesAutomatically(boolean z) {
            this.f89223j = z;
            return this;
        }
    }

    public /* synthetic */ NativeAdRequestConfiguration(String str, String str2, String str3, String str4, List list, Location location, Map map, String str5, AdTheme adTheme, boolean z, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, list, location, map, str5, adTheme, z);
    }

    @NotNull
    public final String getAdUnitId() {
        return this.f89204a;
    }

    @Nullable
    public final String getAge() {
        return this.f89205b;
    }

    @Nullable
    public final String getBiddingData() {
        return this.f89211h;
    }

    @Nullable
    public final String getContextQuery() {
        return this.f89207d;
    }

    @Nullable
    public final List<String> getContextTags() {
        return this.f89208e;
    }

    @Nullable
    public final String getGender() {
        return this.f89206c;
    }

    @Nullable
    public final Location getLocation() {
        return this.f89209f;
    }

    @Nullable
    public final Map<String, String> getParameters() {
        return this.f89210g;
    }

    @Nullable
    public final AdTheme getPreferredTheme() {
        return this.f89212i;
    }

    public final boolean getShouldLoadImagesAutomatically() {
        return this.f89213j;
    }

    private NativeAdRequestConfiguration(String str, String str2, String str3, String str4, List<String> list, Location location, Map<String, String> map, String str5, AdTheme adTheme, boolean z) {
        this.f89204a = str;
        this.f89205b = str2;
        this.f89206c = str3;
        this.f89207d = str4;
        this.f89208e = list;
        this.f89209f = location;
        this.f89210g = map;
        this.f89211h = str5;
        this.f89212i = adTheme;
        this.f89213j = z;
    }
}
