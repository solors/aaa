package com.smaato.sdk.core.p568ad;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.smaato.sdk.core.Gender;
import com.smaato.sdk.core.LatLng;

/* renamed from: com.smaato.sdk.core.ad.UserInfo */
/* loaded from: classes7.dex */
public final class UserInfo {
    @Nullable
    private final Integer age;
    private final boolean coppa;
    @Nullable
    private final Gender gender;
    @Nullable
    private final String keywords;
    @Nullable
    private final String language;
    @Nullable
    private final LatLng latLng;
    @Nullable
    private final String region;
    @Nullable
    private final String searchQuery;
    @Nullable
    private final String zip;

    /* renamed from: com.smaato.sdk.core.ad.UserInfo$Builder */
    /* loaded from: classes7.dex */
    public static final class Builder {
        private Integer age;
        private boolean coppa;
        private Gender gender;
        private String keywords;
        private String language;
        private LatLng latLng;
        private String region;
        private String searchQuery;
        private String zip;

        @NonNull
        public UserInfo build() {
            return new UserInfo(this.keywords, this.searchQuery, this.gender, this.age, this.latLng, this.region, this.zip, this.language, this.coppa);
        }

        @NonNull
        public Builder setAge(@Nullable Integer num) {
            this.age = num;
            return this;
        }

        @NonNull
        public Builder setCoppa(boolean z) {
            this.coppa = z;
            return this;
        }

        @NonNull
        public Builder setGender(@Nullable Gender gender) {
            this.gender = gender;
            return this;
        }

        @NonNull
        public Builder setKeywords(@Nullable String str) {
            this.keywords = str;
            return this;
        }

        @NonNull
        public Builder setLanguage(@Nullable String str) {
            this.language = str;
            return this;
        }

        @NonNull
        public Builder setLatLng(@Nullable LatLng latLng) {
            this.latLng = latLng;
            return this;
        }

        @NonNull
        public Builder setRegion(@Nullable String str) {
            this.region = str;
            return this;
        }

        @NonNull
        public Builder setSearchQuery(@Nullable String str) {
            this.searchQuery = str;
            return this;
        }

        @NonNull
        public Builder setZip(@Nullable String str) {
            this.zip = str;
            return this;
        }
    }

    @Nullable
    public Integer getAge() {
        return this.age;
    }

    public boolean getCoppa() {
        return this.coppa;
    }

    @Nullable
    public Gender getGender() {
        return this.gender;
    }

    @Nullable
    public String getKeywords() {
        return this.keywords;
    }

    @Nullable
    public String getLanguage() {
        return this.language;
    }

    @Nullable
    public LatLng getLatLng() {
        return this.latLng;
    }

    @Nullable
    public String getRegion() {
        return this.region;
    }

    @Nullable
    public String getSearchQuery() {
        return this.searchQuery;
    }

    @Nullable
    public String getZip() {
        return this.zip;
    }

    public String toString() {
        return "UserInfo{keywords='" + this.keywords + "', searchQuery='" + this.searchQuery + "', gender=" + this.gender + ", age=" + this.age + ", latLng=" + this.latLng + ", region='" + this.region + "', zip='" + this.zip + "', language='" + this.language + "', coppa='" + this.coppa + "'}";
    }

    private UserInfo(@Nullable String str, @Nullable String str2, @Nullable Gender gender, @Nullable Integer num, @Nullable LatLng latLng, @Nullable String str3, @Nullable String str4, @Nullable String str5, boolean z) {
        this.keywords = str;
        this.searchQuery = str2;
        this.gender = gender;
        this.age = num;
        this.latLng = latLng;
        this.region = str3;
        this.zip = str4;
        this.language = str5;
        this.coppa = z;
    }
}
