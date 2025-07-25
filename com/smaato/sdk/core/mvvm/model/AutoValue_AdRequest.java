package com.smaato.sdk.core.mvvm.model;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.smaato.sdk.core.mvvm.model.AdRequest;
import com.smaato.sdk.core.p568ad.AdFormat;
import com.smaato.sdk.core.p568ad.KeyValuePairs;
import java.util.Map;

/* renamed from: com.smaato.sdk.core.mvvm.model.a */
/* loaded from: classes7.dex */
final class AutoValue_AdRequest extends AdRequest {

    /* renamed from: a */
    private final AdFormat f71658a;

    /* renamed from: b */
    private final String f71659b;

    /* renamed from: c */
    private final String f71660c;

    /* renamed from: d */
    private final KeyValuePairs f71661d;

    /* renamed from: e */
    private final Map<String, Object> f71662e;

    /* renamed from: f */
    private final String f71663f;

    /* renamed from: g */
    private final String f71664g;

    /* renamed from: h */
    private final String f71665h;

    /* renamed from: i */
    private final Runnable f71666i;

    /* renamed from: j */
    private final Runnable f71667j;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AutoValue_AdRequest.java */
    /* renamed from: com.smaato.sdk.core.mvvm.model.a$b */
    /* loaded from: classes7.dex */
    public static final class C27171b extends AdRequest.Builder {

        /* renamed from: a */
        private AdFormat f71668a;

        /* renamed from: b */
        private String f71669b;

        /* renamed from: c */
        private String f71670c;

        /* renamed from: d */
        private KeyValuePairs f71671d;

        /* renamed from: e */
        private Map<String, Object> f71672e;

        /* renamed from: f */
        private String f71673f;

        /* renamed from: g */
        private String f71674g;

        /* renamed from: h */
        private String f71675h;

        /* renamed from: i */
        private Runnable f71676i;

        /* renamed from: j */
        private Runnable f71677j;

        @Override // com.smaato.sdk.core.mvvm.model.AdRequest.Builder
        public AdRequest build() {
            String str = "";
            if (this.f71668a == null) {
                str = " adFormat";
            }
            if (this.f71669b == null) {
                str = str + " adSpaceId";
            }
            if (this.f71676i == null) {
                str = str + " onCsmAdExpired";
            }
            if (this.f71677j == null) {
                str = str + " onCsmAdClicked";
            }
            if (str.isEmpty()) {
                return new AutoValue_AdRequest(this.f71668a, this.f71669b, this.f71670c, this.f71671d, this.f71672e, this.f71673f, this.f71674g, this.f71675h, this.f71676i, this.f71677j);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.smaato.sdk.core.mvvm.model.AdRequest.Builder
        public AdRequest.Builder setAdFormat(AdFormat adFormat) {
            if (adFormat != null) {
                this.f71668a = adFormat;
                return this;
            }
            throw new NullPointerException("Null adFormat");
        }

        @Override // com.smaato.sdk.core.mvvm.model.AdRequest.Builder
        public AdRequest.Builder setAdSpaceId(String str) {
            if (str != null) {
                this.f71669b = str;
                return this;
            }
            throw new NullPointerException("Null adSpaceId");
        }

        @Override // com.smaato.sdk.core.mvvm.model.AdRequest.Builder
        public AdRequest.Builder setKeyValuePairs(KeyValuePairs keyValuePairs) {
            this.f71671d = keyValuePairs;
            return this;
        }

        @Override // com.smaato.sdk.core.mvvm.model.AdRequest.Builder
        public AdRequest.Builder setMediationAdapterVersion(String str) {
            this.f71675h = str;
            return this;
        }

        @Override // com.smaato.sdk.core.mvvm.model.AdRequest.Builder
        public AdRequest.Builder setMediationNetworkName(String str) {
            this.f71673f = str;
            return this;
        }

        @Override // com.smaato.sdk.core.mvvm.model.AdRequest.Builder
        public AdRequest.Builder setMediationNetworkSdkVersion(String str) {
            this.f71674g = str;
            return this;
        }

        @Override // com.smaato.sdk.core.mvvm.model.AdRequest.Builder
        public AdRequest.Builder setObjectExtras(Map<String, Object> map) {
            this.f71672e = map;
            return this;
        }

        @Override // com.smaato.sdk.core.mvvm.model.AdRequest.Builder
        public AdRequest.Builder setOnCsmAdClicked(Runnable runnable) {
            if (runnable != null) {
                this.f71677j = runnable;
                return this;
            }
            throw new NullPointerException("Null onCsmAdClicked");
        }

        @Override // com.smaato.sdk.core.mvvm.model.AdRequest.Builder
        public AdRequest.Builder setOnCsmAdExpired(Runnable runnable) {
            if (runnable != null) {
                this.f71676i = runnable;
                return this;
            }
            throw new NullPointerException("Null onCsmAdExpired");
        }

        @Override // com.smaato.sdk.core.mvvm.model.AdRequest.Builder
        public AdRequest.Builder setUBUniqueId(String str) {
            this.f71670c = str;
            return this;
        }
    }

    public boolean equals(Object obj) {
        String str;
        KeyValuePairs keyValuePairs;
        Map<String, Object> map;
        String str2;
        String str3;
        String str4;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AdRequest)) {
            return false;
        }
        AdRequest adRequest = (AdRequest) obj;
        if (this.f71658a.equals(adRequest.getAdFormat()) && this.f71659b.equals(adRequest.getAdSpaceId()) && ((str = this.f71660c) != null ? str.equals(adRequest.getUBUniqueId()) : adRequest.getUBUniqueId() == null) && ((keyValuePairs = this.f71661d) != null ? keyValuePairs.equals(adRequest.getKeyValuePairs()) : adRequest.getKeyValuePairs() == null) && ((map = this.f71662e) != null ? map.equals(adRequest.getObjectExtras()) : adRequest.getObjectExtras() == null) && ((str2 = this.f71663f) != null ? str2.equals(adRequest.getMediationNetworkName()) : adRequest.getMediationNetworkName() == null) && ((str3 = this.f71664g) != null ? str3.equals(adRequest.getMediationNetworkSdkVersion()) : adRequest.getMediationNetworkSdkVersion() == null) && ((str4 = this.f71665h) != null ? str4.equals(adRequest.getMediationAdapterVersion()) : adRequest.getMediationAdapterVersion() == null) && this.f71666i.equals(adRequest.getOnCsmAdExpired()) && this.f71667j.equals(adRequest.getOnCsmAdClicked())) {
            return true;
        }
        return false;
    }

    @Override // com.smaato.sdk.core.mvvm.model.AdRequest
    @NonNull
    public AdFormat getAdFormat() {
        return this.f71658a;
    }

    @Override // com.smaato.sdk.core.mvvm.model.AdRequest
    @NonNull
    public String getAdSpaceId() {
        return this.f71659b;
    }

    @Override // com.smaato.sdk.core.mvvm.model.AdRequest
    @Nullable
    public KeyValuePairs getKeyValuePairs() {
        return this.f71661d;
    }

    @Override // com.smaato.sdk.core.mvvm.model.AdRequest
    @Nullable
    public String getMediationAdapterVersion() {
        return this.f71665h;
    }

    @Override // com.smaato.sdk.core.mvvm.model.AdRequest
    @Nullable
    public String getMediationNetworkName() {
        return this.f71663f;
    }

    @Override // com.smaato.sdk.core.mvvm.model.AdRequest
    @Nullable
    public String getMediationNetworkSdkVersion() {
        return this.f71664g;
    }

    @Override // com.smaato.sdk.core.mvvm.model.AdRequest
    @Nullable
    public Map<String, Object> getObjectExtras() {
        return this.f71662e;
    }

    @Override // com.smaato.sdk.core.mvvm.model.AdRequest
    @NonNull
    public Runnable getOnCsmAdClicked() {
        return this.f71667j;
    }

    @Override // com.smaato.sdk.core.mvvm.model.AdRequest
    @NonNull
    public Runnable getOnCsmAdExpired() {
        return this.f71666i;
    }

    @Override // com.smaato.sdk.core.mvvm.model.AdRequest
    @Nullable
    public String getUBUniqueId() {
        return this.f71660c;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int hashCode6 = (((this.f71658a.hashCode() ^ 1000003) * 1000003) ^ this.f71659b.hashCode()) * 1000003;
        String str = this.f71660c;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = (hashCode6 ^ hashCode) * 1000003;
        KeyValuePairs keyValuePairs = this.f71661d;
        if (keyValuePairs == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = keyValuePairs.hashCode();
        }
        int i3 = (i2 ^ hashCode2) * 1000003;
        Map<String, Object> map = this.f71662e;
        if (map == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = map.hashCode();
        }
        int i4 = (i3 ^ hashCode3) * 1000003;
        String str2 = this.f71663f;
        if (str2 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = str2.hashCode();
        }
        int i5 = (i4 ^ hashCode4) * 1000003;
        String str3 = this.f71664g;
        if (str3 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = str3.hashCode();
        }
        int i6 = (i5 ^ hashCode5) * 1000003;
        String str4 = this.f71665h;
        if (str4 != null) {
            i = str4.hashCode();
        }
        return ((((i6 ^ i) * 1000003) ^ this.f71666i.hashCode()) * 1000003) ^ this.f71667j.hashCode();
    }

    public String toString() {
        return "AdRequest{adFormat=" + this.f71658a + ", adSpaceId=" + this.f71659b + ", UBUniqueId=" + this.f71660c + ", keyValuePairs=" + this.f71661d + ", objectExtras=" + this.f71662e + ", mediationNetworkName=" + this.f71663f + ", mediationNetworkSdkVersion=" + this.f71664g + ", mediationAdapterVersion=" + this.f71665h + ", onCsmAdExpired=" + this.f71666i + ", onCsmAdClicked=" + this.f71667j + "}";
    }

    private AutoValue_AdRequest(AdFormat adFormat, String str, @Nullable String str2, @Nullable KeyValuePairs keyValuePairs, @Nullable Map<String, Object> map, @Nullable String str3, @Nullable String str4, @Nullable String str5, Runnable runnable, Runnable runnable2) {
        this.f71658a = adFormat;
        this.f71659b = str;
        this.f71660c = str2;
        this.f71661d = keyValuePairs;
        this.f71662e = map;
        this.f71663f = str3;
        this.f71664g = str4;
        this.f71665h = str5;
        this.f71666i = runnable;
        this.f71667j = runnable2;
    }
}
