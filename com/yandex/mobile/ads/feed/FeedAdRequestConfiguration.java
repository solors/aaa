package com.yandex.mobile.ads.feed;

import android.location.Location;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes8.dex */
public final class FeedAdRequestConfiguration {
    @NotNull

    /* renamed from: a */
    private final String f76608a;
    @Nullable

    /* renamed from: b */
    private final String f76609b;
    @Nullable

    /* renamed from: c */
    private final String f76610c;
    @Nullable

    /* renamed from: d */
    private final String f76611d;
    @Nullable

    /* renamed from: e */
    private final List<String> f76612e;
    @Nullable

    /* renamed from: f */
    private final Location f76613f;
    @Nullable

    /* renamed from: g */
    private final Map<String, String> f76614g;

    @Metadata
    /* loaded from: classes8.dex */
    public static final class Builder {
        @NotNull

        /* renamed from: a */
        private final String f76615a;
        @Nullable

        /* renamed from: b */
        private String f76616b;
        @Nullable

        /* renamed from: c */
        private String f76617c;
        @Nullable

        /* renamed from: d */
        private String f76618d;
        @Nullable

        /* renamed from: e */
        private List<String> f76619e;
        @Nullable

        /* renamed from: f */
        private Location f76620f;
        @Nullable

        /* renamed from: g */
        private Map<String, String> f76621g;

        public Builder(@NotNull String adUnitId) {
            Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
            this.f76615a = adUnitId;
        }

        @NotNull
        public final FeedAdRequestConfiguration build() {
            return new FeedAdRequestConfiguration(this.f76615a, this.f76616b, this.f76617c, this.f76618d, this.f76619e, this.f76620f, this.f76621g);
        }

        @NotNull
        public final Builder setAge(@Nullable String str) {
            this.f76616b = str;
            return this;
        }

        @NotNull
        public final Builder setContextQuery(@Nullable String str) {
            this.f76618d = str;
            return this;
        }

        @NotNull
        public final Builder setContextTags(@Nullable List<String> list) {
            this.f76619e = list;
            return this;
        }

        @NotNull
        public final Builder setGender(@Nullable String str) {
            this.f76617c = str;
            return this;
        }

        @NotNull
        public final Builder setLocation(@Nullable Location location) {
            this.f76620f = location;
            return this;
        }

        @NotNull
        public final Builder setParameters(@Nullable Map<String, String> map) {
            this.f76621g = map;
            return this;
        }
    }

    public FeedAdRequestConfiguration(@NotNull String adUnitId, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable List<String> list, @Nullable Location location, @Nullable Map<String, String> map) {
        Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
        this.f76608a = adUnitId;
        this.f76609b = str;
        this.f76610c = str2;
        this.f76611d = str3;
        this.f76612e = list;
        this.f76613f = location;
        this.f76614g = map;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !Intrinsics.m17075f(FeedAdRequestConfiguration.class, obj.getClass())) {
            return false;
        }
        FeedAdRequestConfiguration feedAdRequestConfiguration = (FeedAdRequestConfiguration) obj;
        if (Intrinsics.m17075f(this.f76608a, feedAdRequestConfiguration.f76608a) && Intrinsics.m17075f(this.f76609b, feedAdRequestConfiguration.f76609b) && Intrinsics.m17075f(this.f76610c, feedAdRequestConfiguration.f76610c) && Intrinsics.m17075f(this.f76611d, feedAdRequestConfiguration.f76611d) && Intrinsics.m17075f(this.f76612e, feedAdRequestConfiguration.f76612e) && Intrinsics.m17075f(this.f76613f, feedAdRequestConfiguration.f76613f) && Intrinsics.m17075f(this.f76614g, feedAdRequestConfiguration.f76614g)) {
            return true;
        }
        return false;
    }

    @NotNull
    public final String getAdUnitId() {
        return this.f76608a;
    }

    @Nullable
    public final String getAge() {
        return this.f76609b;
    }

    @Nullable
    public final String getContextQuery() {
        return this.f76611d;
    }

    @Nullable
    public final List<String> getContextTags() {
        return this.f76612e;
    }

    @Nullable
    public final String getGender() {
        return this.f76610c;
    }

    @Nullable
    public final Location getLocation() {
        return this.f76613f;
    }

    @Nullable
    public final Map<String, String> getParameters() {
        return this.f76614g;
    }

    public int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int hashCode = this.f76608a.hashCode() * 31;
        String str = this.f76609b;
        int i6 = 0;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i7 = (hashCode + i) * 31;
        String str2 = this.f76610c;
        if (str2 != null) {
            i2 = str2.hashCode();
        } else {
            i2 = 0;
        }
        int i8 = (i7 + i2) * 31;
        String str3 = this.f76611d;
        if (str3 != null) {
            i3 = str3.hashCode();
        } else {
            i3 = 0;
        }
        int i9 = (i8 + i3) * 31;
        List<String> list = this.f76612e;
        if (list != null) {
            i4 = list.hashCode();
        } else {
            i4 = 0;
        }
        int i10 = (i9 + i4) * 31;
        Location location = this.f76613f;
        if (location != null) {
            i5 = location.hashCode();
        } else {
            i5 = 0;
        }
        int i11 = (i10 + i5) * 31;
        Map<String, String> map = this.f76614g;
        if (map != null) {
            i6 = map.hashCode();
        }
        return i11 + i6;
    }
}
