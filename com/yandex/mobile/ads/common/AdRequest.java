package com.yandex.mobile.ads.common;

import android.location.Location;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes8.dex */
public final class AdRequest {
    @Nullable

    /* renamed from: a */
    private final String f76521a;
    @Nullable

    /* renamed from: b */
    private final String f76522b;
    @Nullable

    /* renamed from: c */
    private final Location f76523c;
    @Nullable

    /* renamed from: d */
    private final String f76524d;
    @Nullable

    /* renamed from: e */
    private final List<String> f76525e;
    @Nullable

    /* renamed from: f */
    private final Map<String, String> f76526f;
    @Nullable

    /* renamed from: g */
    private final String f76527g;
    @Nullable

    /* renamed from: h */
    private final AdTheme f76528h;

    @Metadata
    /* loaded from: classes8.dex */
    public static final class Builder {
        @Nullable

        /* renamed from: a */
        private String f76529a;
        @Nullable

        /* renamed from: b */
        private String f76530b;
        @Nullable

        /* renamed from: c */
        private Location f76531c;
        @Nullable

        /* renamed from: d */
        private String f76532d;
        @Nullable

        /* renamed from: e */
        private List<String> f76533e;
        @Nullable

        /* renamed from: f */
        private Map<String, String> f76534f;
        @Nullable

        /* renamed from: g */
        private String f76535g;
        @Nullable

        /* renamed from: h */
        private AdTheme f76536h;

        @NotNull
        public final AdRequest build() {
            return new AdRequest(this.f76529a, this.f76530b, this.f76531c, this.f76532d, this.f76533e, this.f76534f, this.f76535g, this.f76536h, null);
        }

        @NotNull
        public final Builder setAge(@Nullable String str) {
            this.f76529a = str;
            return this;
        }

        @NotNull
        public final Builder setBiddingData(@Nullable String str) {
            this.f76535g = str;
            return this;
        }

        @NotNull
        public final Builder setContextQuery(@Nullable String str) {
            this.f76532d = str;
            return this;
        }

        @NotNull
        public final Builder setContextTags(@Nullable List<String> list) {
            this.f76533e = list;
            return this;
        }

        @NotNull
        public final Builder setGender(@Nullable String str) {
            this.f76530b = str;
            return this;
        }

        @NotNull
        public final Builder setLocation(@Nullable Location location) {
            this.f76531c = location;
            return this;
        }

        @NotNull
        public final Builder setParameters(@Nullable Map<String, String> map) {
            this.f76534f = map;
            return this;
        }

        @NotNull
        public final Builder setPreferredTheme(@Nullable AdTheme adTheme) {
            this.f76536h = adTheme;
            return this;
        }
    }

    public /* synthetic */ AdRequest(String str, String str2, Location location, String str3, List list, Map map, String str4, AdTheme adTheme, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, location, str3, list, map, str4, adTheme);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !Intrinsics.m17075f(AdRequest.class, obj.getClass())) {
            return false;
        }
        AdRequest adRequest = (AdRequest) obj;
        if (!Intrinsics.m17075f(this.f76521a, adRequest.f76521a) || !Intrinsics.m17075f(this.f76522b, adRequest.f76522b) || !Intrinsics.m17075f(this.f76524d, adRequest.f76524d) || !Intrinsics.m17075f(this.f76525e, adRequest.f76525e) || !Intrinsics.m17075f(this.f76523c, adRequest.f76523c) || !Intrinsics.m17075f(this.f76526f, adRequest.f76526f)) {
            return false;
        }
        if (Intrinsics.m17075f(this.f76527g, adRequest.f76527g) && this.f76528h == adRequest.f76528h) {
            return true;
        }
        return false;
    }

    @Nullable
    public final String getAge() {
        return this.f76521a;
    }

    @Nullable
    public final String getBiddingData() {
        return this.f76527g;
    }

    @Nullable
    public final String getContextQuery() {
        return this.f76524d;
    }

    @Nullable
    public final List<String> getContextTags() {
        return this.f76525e;
    }

    @Nullable
    public final String getGender() {
        return this.f76522b;
    }

    @Nullable
    public final Location getLocation() {
        return this.f76523c;
    }

    @Nullable
    public final Map<String, String> getParameters() {
        return this.f76526f;
    }

    @Nullable
    public final AdTheme getPreferredTheme() {
        return this.f76528h;
    }

    public int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        String str = this.f76521a;
        int i8 = 0;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i9 = i * 31;
        String str2 = this.f76522b;
        if (str2 != null) {
            i2 = str2.hashCode();
        } else {
            i2 = 0;
        }
        int i10 = (i9 + i2) * 31;
        String str3 = this.f76524d;
        if (str3 != null) {
            i3 = str3.hashCode();
        } else {
            i3 = 0;
        }
        int i11 = (i10 + i3) * 31;
        List<String> list = this.f76525e;
        if (list != null) {
            i4 = list.hashCode();
        } else {
            i4 = 0;
        }
        int i12 = (i11 + i4) * 31;
        Location location = this.f76523c;
        if (location != null) {
            i5 = location.hashCode();
        } else {
            i5 = 0;
        }
        int i13 = (i12 + i5) * 31;
        Map<String, String> map = this.f76526f;
        if (map != null) {
            i6 = map.hashCode();
        } else {
            i6 = 0;
        }
        int i14 = (i13 + i6) * 31;
        String str4 = this.f76527g;
        if (str4 != null) {
            i7 = str4.hashCode();
        } else {
            i7 = 0;
        }
        int i15 = (i14 + i7) * 31;
        AdTheme adTheme = this.f76528h;
        if (adTheme != null) {
            i8 = adTheme.hashCode();
        }
        return i15 + i8;
    }

    private AdRequest(String str, String str2, Location location, String str3, List<String> list, Map<String, String> map, String str4, AdTheme adTheme) {
        this.f76521a = str;
        this.f76522b = str2;
        this.f76523c = location;
        this.f76524d = str3;
        this.f76525e = list;
        this.f76526f = map;
        this.f76527g = str4;
        this.f76528h = adTheme;
    }
}
