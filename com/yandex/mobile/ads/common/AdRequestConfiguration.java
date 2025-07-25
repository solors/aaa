package com.yandex.mobile.ads.common;

import android.location.Location;
import com.yandex.mobile.ads.impl.C31014o3;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes8.dex */
public final class AdRequestConfiguration {
    @NotNull

    /* renamed from: a */
    private final String f76537a;
    @Nullable

    /* renamed from: b */
    private final String f76538b;
    @Nullable

    /* renamed from: c */
    private final String f76539c;
    @Nullable

    /* renamed from: d */
    private final String f76540d;
    @Nullable

    /* renamed from: e */
    private final List<String> f76541e;
    @Nullable

    /* renamed from: f */
    private final Location f76542f;
    @Nullable

    /* renamed from: g */
    private final Map<String, String> f76543g;
    @Nullable

    /* renamed from: h */
    private final String f76544h;
    @Nullable

    /* renamed from: i */
    private final AdTheme f76545i;

    @Metadata
    /* loaded from: classes8.dex */
    public static final class Builder {
        @NotNull

        /* renamed from: a */
        private final String f76546a;
        @Nullable

        /* renamed from: b */
        private String f76547b;
        @Nullable

        /* renamed from: c */
        private String f76548c;
        @Nullable

        /* renamed from: d */
        private Location f76549d;
        @Nullable

        /* renamed from: e */
        private String f76550e;
        @Nullable

        /* renamed from: f */
        private List<String> f76551f;
        @Nullable

        /* renamed from: g */
        private Map<String, String> f76552g;
        @Nullable

        /* renamed from: h */
        private String f76553h;
        @Nullable

        /* renamed from: i */
        private AdTheme f76554i;

        public Builder(@NotNull String adUnitId) {
            Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
            this.f76546a = adUnitId;
        }

        @NotNull
        public final AdRequestConfiguration build() {
            return new AdRequestConfiguration(this.f76546a, this.f76547b, this.f76548c, this.f76550e, this.f76551f, this.f76549d, this.f76552g, this.f76553h, this.f76554i, null);
        }

        @NotNull
        public final Builder setAge(@Nullable String str) {
            this.f76547b = str;
            return this;
        }

        @NotNull
        public final Builder setBiddingData(@Nullable String str) {
            this.f76553h = str;
            return this;
        }

        @NotNull
        public final Builder setContextQuery(@Nullable String str) {
            this.f76550e = str;
            return this;
        }

        @NotNull
        public final Builder setContextTags(@Nullable List<String> list) {
            this.f76551f = list;
            return this;
        }

        @NotNull
        public final Builder setGender(@Nullable String str) {
            this.f76548c = str;
            return this;
        }

        @NotNull
        public final Builder setLocation(@Nullable Location location) {
            this.f76549d = location;
            return this;
        }

        @NotNull
        public final Builder setParameters(@Nullable Map<String, String> map) {
            this.f76552g = map;
            return this;
        }

        @NotNull
        public final Builder setPreferredTheme(@Nullable AdTheme adTheme) {
            this.f76554i = adTheme;
            return this;
        }
    }

    public /* synthetic */ AdRequestConfiguration(String str, String str2, String str3, String str4, List list, Location location, Map map, String str5, AdTheme adTheme, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, list, location, map, str5, adTheme);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !Intrinsics.m17075f(AdRequestConfiguration.class, obj.getClass())) {
            return false;
        }
        AdRequestConfiguration adRequestConfiguration = (AdRequestConfiguration) obj;
        if (!Intrinsics.m17075f(this.f76537a, adRequestConfiguration.f76537a) || !Intrinsics.m17075f(this.f76538b, adRequestConfiguration.f76538b) || !Intrinsics.m17075f(this.f76539c, adRequestConfiguration.f76539c) || !Intrinsics.m17075f(this.f76540d, adRequestConfiguration.f76540d) || !Intrinsics.m17075f(this.f76541e, adRequestConfiguration.f76541e) || !Intrinsics.m17075f(this.f76542f, adRequestConfiguration.f76542f) || !Intrinsics.m17075f(this.f76543g, adRequestConfiguration.f76543g)) {
            return false;
        }
        if (Intrinsics.m17075f(this.f76544h, adRequestConfiguration.f76544h) && this.f76545i == adRequestConfiguration.f76545i) {
            return true;
        }
        return false;
    }

    @NotNull
    public final String getAdUnitId() {
        return this.f76537a;
    }

    @Nullable
    public final String getAge() {
        return this.f76538b;
    }

    @Nullable
    public final String getBiddingData() {
        return this.f76544h;
    }

    @Nullable
    public final String getContextQuery() {
        return this.f76540d;
    }

    @Nullable
    public final List<String> getContextTags() {
        return this.f76541e;
    }

    @Nullable
    public final String getGender() {
        return this.f76539c;
    }

    @Nullable
    public final Location getLocation() {
        return this.f76542f;
    }

    @Nullable
    public final Map<String, String> getParameters() {
        return this.f76543g;
    }

    @Nullable
    public final AdTheme getPreferredTheme() {
        return this.f76545i;
    }

    public int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        String str = this.f76538b;
        int i8 = 0;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int m31189a = C31014o3.m31189a(this.f76537a, i * 31, 31);
        String str2 = this.f76539c;
        if (str2 != null) {
            i2 = str2.hashCode();
        } else {
            i2 = 0;
        }
        int i9 = (m31189a + i2) * 31;
        String str3 = this.f76540d;
        if (str3 != null) {
            i3 = str3.hashCode();
        } else {
            i3 = 0;
        }
        int i10 = (i9 + i3) * 31;
        List<String> list = this.f76541e;
        if (list != null) {
            i4 = list.hashCode();
        } else {
            i4 = 0;
        }
        int i11 = (i10 + i4) * 31;
        Location location = this.f76542f;
        if (location != null) {
            i5 = location.hashCode();
        } else {
            i5 = 0;
        }
        int i12 = (i11 + i5) * 31;
        Map<String, String> map = this.f76543g;
        if (map != null) {
            i6 = map.hashCode();
        } else {
            i6 = 0;
        }
        int i13 = (i12 + i6) * 31;
        String str4 = this.f76544h;
        if (str4 != null) {
            i7 = str4.hashCode();
        } else {
            i7 = 0;
        }
        int i14 = (i13 + i7) * 31;
        AdTheme adTheme = this.f76545i;
        if (adTheme != null) {
            i8 = adTheme.hashCode();
        }
        return i14 + i8;
    }

    private AdRequestConfiguration(String str, String str2, String str3, String str4, List<String> list, Location location, Map<String, String> map, String str5, AdTheme adTheme) {
        this.f76537a = str;
        this.f76538b = str2;
        this.f76539c = str3;
        this.f76540d = str4;
        this.f76541e = list;
        this.f76542f = location;
        this.f76543g = map;
        this.f76544h = str5;
        this.f76545i = adTheme;
    }
}
