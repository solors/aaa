package com.google.android.datatransport.cct.internal;

import androidx.annotation.Nullable;
import com.google.android.datatransport.cct.internal.AndroidClientInfo;

/* loaded from: classes4.dex */
final class AutoValue_AndroidClientInfo extends AndroidClientInfo {

    /* renamed from: a */
    private final Integer f30914a;

    /* renamed from: b */
    private final String f30915b;

    /* renamed from: c */
    private final String f30916c;

    /* renamed from: d */
    private final String f30917d;

    /* renamed from: e */
    private final String f30918e;

    /* renamed from: f */
    private final String f30919f;

    /* renamed from: g */
    private final String f30920g;

    /* renamed from: h */
    private final String f30921h;

    /* renamed from: i */
    private final String f30922i;

    /* renamed from: j */
    private final String f30923j;

    /* renamed from: k */
    private final String f30924k;

    /* renamed from: l */
    private final String f30925l;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class Builder extends AndroidClientInfo.Builder {

        /* renamed from: a */
        private Integer f30926a;

        /* renamed from: b */
        private String f30927b;

        /* renamed from: c */
        private String f30928c;

        /* renamed from: d */
        private String f30929d;

        /* renamed from: e */
        private String f30930e;

        /* renamed from: f */
        private String f30931f;

        /* renamed from: g */
        private String f30932g;

        /* renamed from: h */
        private String f30933h;

        /* renamed from: i */
        private String f30934i;

        /* renamed from: j */
        private String f30935j;

        /* renamed from: k */
        private String f30936k;

        /* renamed from: l */
        private String f30937l;

        @Override // com.google.android.datatransport.cct.internal.AndroidClientInfo.Builder
        public AndroidClientInfo build() {
            return new AutoValue_AndroidClientInfo(this.f30926a, this.f30927b, this.f30928c, this.f30929d, this.f30930e, this.f30931f, this.f30932g, this.f30933h, this.f30934i, this.f30935j, this.f30936k, this.f30937l);
        }

        @Override // com.google.android.datatransport.cct.internal.AndroidClientInfo.Builder
        public AndroidClientInfo.Builder setApplicationBuild(@Nullable String str) {
            this.f30937l = str;
            return this;
        }

        @Override // com.google.android.datatransport.cct.internal.AndroidClientInfo.Builder
        public AndroidClientInfo.Builder setCountry(@Nullable String str) {
            this.f30935j = str;
            return this;
        }

        @Override // com.google.android.datatransport.cct.internal.AndroidClientInfo.Builder
        public AndroidClientInfo.Builder setDevice(@Nullable String str) {
            this.f30929d = str;
            return this;
        }

        @Override // com.google.android.datatransport.cct.internal.AndroidClientInfo.Builder
        public AndroidClientInfo.Builder setFingerprint(@Nullable String str) {
            this.f30933h = str;
            return this;
        }

        @Override // com.google.android.datatransport.cct.internal.AndroidClientInfo.Builder
        public AndroidClientInfo.Builder setHardware(@Nullable String str) {
            this.f30928c = str;
            return this;
        }

        @Override // com.google.android.datatransport.cct.internal.AndroidClientInfo.Builder
        public AndroidClientInfo.Builder setLocale(@Nullable String str) {
            this.f30934i = str;
            return this;
        }

        @Override // com.google.android.datatransport.cct.internal.AndroidClientInfo.Builder
        public AndroidClientInfo.Builder setManufacturer(@Nullable String str) {
            this.f30932g = str;
            return this;
        }

        @Override // com.google.android.datatransport.cct.internal.AndroidClientInfo.Builder
        public AndroidClientInfo.Builder setMccMnc(@Nullable String str) {
            this.f30936k = str;
            return this;
        }

        @Override // com.google.android.datatransport.cct.internal.AndroidClientInfo.Builder
        public AndroidClientInfo.Builder setModel(@Nullable String str) {
            this.f30927b = str;
            return this;
        }

        @Override // com.google.android.datatransport.cct.internal.AndroidClientInfo.Builder
        public AndroidClientInfo.Builder setOsBuild(@Nullable String str) {
            this.f30931f = str;
            return this;
        }

        @Override // com.google.android.datatransport.cct.internal.AndroidClientInfo.Builder
        public AndroidClientInfo.Builder setProduct(@Nullable String str) {
            this.f30930e = str;
            return this;
        }

        @Override // com.google.android.datatransport.cct.internal.AndroidClientInfo.Builder
        public AndroidClientInfo.Builder setSdkVersion(@Nullable Integer num) {
            this.f30926a = num;
            return this;
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AndroidClientInfo)) {
            return false;
        }
        AndroidClientInfo androidClientInfo = (AndroidClientInfo) obj;
        Integer num = this.f30914a;
        if (num != null ? num.equals(androidClientInfo.getSdkVersion()) : androidClientInfo.getSdkVersion() == null) {
            String str = this.f30915b;
            if (str != null ? str.equals(androidClientInfo.getModel()) : androidClientInfo.getModel() == null) {
                String str2 = this.f30916c;
                if (str2 != null ? str2.equals(androidClientInfo.getHardware()) : androidClientInfo.getHardware() == null) {
                    String str3 = this.f30917d;
                    if (str3 != null ? str3.equals(androidClientInfo.getDevice()) : androidClientInfo.getDevice() == null) {
                        String str4 = this.f30918e;
                        if (str4 != null ? str4.equals(androidClientInfo.getProduct()) : androidClientInfo.getProduct() == null) {
                            String str5 = this.f30919f;
                            if (str5 != null ? str5.equals(androidClientInfo.getOsBuild()) : androidClientInfo.getOsBuild() == null) {
                                String str6 = this.f30920g;
                                if (str6 != null ? str6.equals(androidClientInfo.getManufacturer()) : androidClientInfo.getManufacturer() == null) {
                                    String str7 = this.f30921h;
                                    if (str7 != null ? str7.equals(androidClientInfo.getFingerprint()) : androidClientInfo.getFingerprint() == null) {
                                        String str8 = this.f30922i;
                                        if (str8 != null ? str8.equals(androidClientInfo.getLocale()) : androidClientInfo.getLocale() == null) {
                                            String str9 = this.f30923j;
                                            if (str9 != null ? str9.equals(androidClientInfo.getCountry()) : androidClientInfo.getCountry() == null) {
                                                String str10 = this.f30924k;
                                                if (str10 != null ? str10.equals(androidClientInfo.getMccMnc()) : androidClientInfo.getMccMnc() == null) {
                                                    String str11 = this.f30925l;
                                                    if (str11 == null) {
                                                        if (androidClientInfo.getApplicationBuild() == null) {
                                                            return true;
                                                        }
                                                    } else if (str11.equals(androidClientInfo.getApplicationBuild())) {
                                                        return true;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // com.google.android.datatransport.cct.internal.AndroidClientInfo
    @Nullable
    public String getApplicationBuild() {
        return this.f30925l;
    }

    @Override // com.google.android.datatransport.cct.internal.AndroidClientInfo
    @Nullable
    public String getCountry() {
        return this.f30923j;
    }

    @Override // com.google.android.datatransport.cct.internal.AndroidClientInfo
    @Nullable
    public String getDevice() {
        return this.f30917d;
    }

    @Override // com.google.android.datatransport.cct.internal.AndroidClientInfo
    @Nullable
    public String getFingerprint() {
        return this.f30921h;
    }

    @Override // com.google.android.datatransport.cct.internal.AndroidClientInfo
    @Nullable
    public String getHardware() {
        return this.f30916c;
    }

    @Override // com.google.android.datatransport.cct.internal.AndroidClientInfo
    @Nullable
    public String getLocale() {
        return this.f30922i;
    }

    @Override // com.google.android.datatransport.cct.internal.AndroidClientInfo
    @Nullable
    public String getManufacturer() {
        return this.f30920g;
    }

    @Override // com.google.android.datatransport.cct.internal.AndroidClientInfo
    @Nullable
    public String getMccMnc() {
        return this.f30924k;
    }

    @Override // com.google.android.datatransport.cct.internal.AndroidClientInfo
    @Nullable
    public String getModel() {
        return this.f30915b;
    }

    @Override // com.google.android.datatransport.cct.internal.AndroidClientInfo
    @Nullable
    public String getOsBuild() {
        return this.f30919f;
    }

    @Override // com.google.android.datatransport.cct.internal.AndroidClientInfo
    @Nullable
    public String getProduct() {
        return this.f30918e;
    }

    @Override // com.google.android.datatransport.cct.internal.AndroidClientInfo
    @Nullable
    public Integer getSdkVersion() {
        return this.f30914a;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int hashCode6;
        int hashCode7;
        int hashCode8;
        int hashCode9;
        int hashCode10;
        int hashCode11;
        Integer num = this.f30914a;
        int i = 0;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        int i2 = (hashCode ^ 1000003) * 1000003;
        String str = this.f30915b;
        if (str == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str.hashCode();
        }
        int i3 = (i2 ^ hashCode2) * 1000003;
        String str2 = this.f30916c;
        if (str2 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str2.hashCode();
        }
        int i4 = (i3 ^ hashCode3) * 1000003;
        String str3 = this.f30917d;
        if (str3 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = str3.hashCode();
        }
        int i5 = (i4 ^ hashCode4) * 1000003;
        String str4 = this.f30918e;
        if (str4 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = str4.hashCode();
        }
        int i6 = (i5 ^ hashCode5) * 1000003;
        String str5 = this.f30919f;
        if (str5 == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = str5.hashCode();
        }
        int i7 = (i6 ^ hashCode6) * 1000003;
        String str6 = this.f30920g;
        if (str6 == null) {
            hashCode7 = 0;
        } else {
            hashCode7 = str6.hashCode();
        }
        int i8 = (i7 ^ hashCode7) * 1000003;
        String str7 = this.f30921h;
        if (str7 == null) {
            hashCode8 = 0;
        } else {
            hashCode8 = str7.hashCode();
        }
        int i9 = (i8 ^ hashCode8) * 1000003;
        String str8 = this.f30922i;
        if (str8 == null) {
            hashCode9 = 0;
        } else {
            hashCode9 = str8.hashCode();
        }
        int i10 = (i9 ^ hashCode9) * 1000003;
        String str9 = this.f30923j;
        if (str9 == null) {
            hashCode10 = 0;
        } else {
            hashCode10 = str9.hashCode();
        }
        int i11 = (i10 ^ hashCode10) * 1000003;
        String str10 = this.f30924k;
        if (str10 == null) {
            hashCode11 = 0;
        } else {
            hashCode11 = str10.hashCode();
        }
        int i12 = (i11 ^ hashCode11) * 1000003;
        String str11 = this.f30925l;
        if (str11 != null) {
            i = str11.hashCode();
        }
        return i12 ^ i;
    }

    public String toString() {
        return "AndroidClientInfo{sdkVersion=" + this.f30914a + ", model=" + this.f30915b + ", hardware=" + this.f30916c + ", device=" + this.f30917d + ", product=" + this.f30918e + ", osBuild=" + this.f30919f + ", manufacturer=" + this.f30920g + ", fingerprint=" + this.f30921h + ", locale=" + this.f30922i + ", country=" + this.f30923j + ", mccMnc=" + this.f30924k + ", applicationBuild=" + this.f30925l + "}";
    }

    private AutoValue_AndroidClientInfo(@Nullable Integer num, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable String str9, @Nullable String str10, @Nullable String str11) {
        this.f30914a = num;
        this.f30915b = str;
        this.f30916c = str2;
        this.f30917d = str3;
        this.f30918e = str4;
        this.f30919f = str5;
        this.f30920g = str6;
        this.f30921h = str7;
        this.f30922i = str8;
        this.f30923j = str9;
        this.f30924k = str10;
        this.f30925l = str11;
    }
}
