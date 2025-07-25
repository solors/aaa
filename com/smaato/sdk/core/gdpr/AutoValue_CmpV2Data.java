package com.smaato.sdk.core.gdpr;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.smaato.sdk.core.gdpr.CmpV2Data;
import java.util.Set;

/* renamed from: com.smaato.sdk.core.gdpr.b */
/* loaded from: classes7.dex */
final class AutoValue_CmpV2Data extends CmpV2Data {

    /* renamed from: a */
    private final boolean f71538a;

    /* renamed from: b */
    private final SubjectToGdpr f71539b;

    /* renamed from: c */
    private final String f71540c;

    /* renamed from: d */
    private final Set<Integer> f71541d;

    /* renamed from: e */
    private final Set<Integer> f71542e;

    /* renamed from: f */
    private final String f71543f;

    /* renamed from: g */
    private final String f71544g;

    /* renamed from: h */
    private final String f71545h;

    /* renamed from: i */
    private final String f71546i;

    /* renamed from: j */
    private final Boolean f71547j;

    /* renamed from: k */
    private final Boolean f71548k;

    /* renamed from: l */
    private final Set<Integer> f71549l;

    /* renamed from: m */
    private final Set<Integer> f71550m;

    /* renamed from: n */
    private final Set<Integer> f71551n;

    /* renamed from: o */
    private final String f71552o;

    /* renamed from: p */
    private final Set<Integer> f71553p;

    /* renamed from: q */
    private final Set<Integer> f71554q;

    /* renamed from: r */
    private final Set<Integer> f71555r;

    /* renamed from: s */
    private final Set<Integer> f71556s;

    /* compiled from: AutoValue_CmpV2Data.java */
    /* renamed from: com.smaato.sdk.core.gdpr.b$b */
    /* loaded from: classes7.dex */
    static final class C27113b extends CmpV2Data.Builder {

        /* renamed from: a */
        private Boolean f71557a;

        /* renamed from: b */
        private SubjectToGdpr f71558b;

        /* renamed from: c */
        private String f71559c;

        /* renamed from: d */
        private Set<Integer> f71560d;

        /* renamed from: e */
        private Set<Integer> f71561e;

        /* renamed from: f */
        private String f71562f;

        /* renamed from: g */
        private String f71563g;

        /* renamed from: h */
        private String f71564h;

        /* renamed from: i */
        private String f71565i;

        /* renamed from: j */
        private Boolean f71566j;

        /* renamed from: k */
        private Boolean f71567k;

        /* renamed from: l */
        private Set<Integer> f71568l;

        /* renamed from: m */
        private Set<Integer> f71569m;

        /* renamed from: n */
        private Set<Integer> f71570n;

        /* renamed from: o */
        private String f71571o;

        /* renamed from: p */
        private Set<Integer> f71572p;

        /* renamed from: q */
        private Set<Integer> f71573q;

        /* renamed from: r */
        private Set<Integer> f71574r;

        /* renamed from: s */
        private Set<Integer> f71575s;

        @Override // com.smaato.sdk.core.gdpr.CmpV2Data.Builder
        public CmpV2Data build() {
            String str = "";
            if (this.f71557a == null) {
                str = " cmpPresent";
            }
            if (this.f71558b == null) {
                str = str + " subjectToGdpr";
            }
            if (this.f71559c == null) {
                str = str + " consentString";
            }
            if (this.f71560d == null) {
                str = str + " vendorConsent";
            }
            if (this.f71561e == null) {
                str = str + " purposesConsent";
            }
            if (this.f71562f == null) {
                str = str + " sdkId";
            }
            if (this.f71563g == null) {
                str = str + " cmpSdkVersion";
            }
            if (this.f71564h == null) {
                str = str + " policyVersion";
            }
            if (this.f71565i == null) {
                str = str + " publisherCC";
            }
            if (this.f71566j == null) {
                str = str + " purposeOneTreatment";
            }
            if (this.f71567k == null) {
                str = str + " useNonStandardStacks";
            }
            if (this.f71568l == null) {
                str = str + " vendorLegitimateInterests";
            }
            if (this.f71569m == null) {
                str = str + " purposeLegitimateInterests";
            }
            if (this.f71570n == null) {
                str = str + " specialFeaturesOptIns";
            }
            if (str.isEmpty()) {
                return new AutoValue_CmpV2Data(this.f71557a.booleanValue(), this.f71558b, this.f71559c, this.f71560d, this.f71561e, this.f71562f, this.f71563g, this.f71564h, this.f71565i, this.f71566j, this.f71567k, this.f71568l, this.f71569m, this.f71570n, this.f71571o, this.f71572p, this.f71573q, this.f71574r, this.f71575s);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.smaato.sdk.core.gdpr.CmpV2Data.Builder
        public CmpV2Data.Builder setCmpPresent(boolean z) {
            this.f71557a = Boolean.valueOf(z);
            return this;
        }

        @Override // com.smaato.sdk.core.gdpr.CmpV2Data.Builder
        public CmpV2Data.Builder setCmpSdkVersion(String str) {
            if (str != null) {
                this.f71563g = str;
                return this;
            }
            throw new NullPointerException("Null cmpSdkVersion");
        }

        @Override // com.smaato.sdk.core.gdpr.CmpV2Data.Builder
        public CmpV2Data.Builder setConsentString(String str) {
            if (str != null) {
                this.f71559c = str;
                return this;
            }
            throw new NullPointerException("Null consentString");
        }

        @Override // com.smaato.sdk.core.gdpr.CmpV2Data.Builder
        public CmpV2Data.Builder setPolicyVersion(String str) {
            if (str != null) {
                this.f71564h = str;
                return this;
            }
            throw new NullPointerException("Null policyVersion");
        }

        @Override // com.smaato.sdk.core.gdpr.CmpV2Data.Builder
        public CmpV2Data.Builder setPublisherCC(String str) {
            if (str != null) {
                this.f71565i = str;
                return this;
            }
            throw new NullPointerException("Null publisherCC");
        }

        @Override // com.smaato.sdk.core.gdpr.CmpV2Data.Builder
        public CmpV2Data.Builder setPublisherConsent(Set<Integer> set) {
            this.f71572p = set;
            return this;
        }

        @Override // com.smaato.sdk.core.gdpr.CmpV2Data.Builder
        public CmpV2Data.Builder setPublisherCustomPurposesConsents(Set<Integer> set) {
            this.f71574r = set;
            return this;
        }

        @Override // com.smaato.sdk.core.gdpr.CmpV2Data.Builder
        public CmpV2Data.Builder setPublisherCustomPurposesLegitimateInterests(Set<Integer> set) {
            this.f71575s = set;
            return this;
        }

        @Override // com.smaato.sdk.core.gdpr.CmpV2Data.Builder
        public CmpV2Data.Builder setPublisherLegitimateInterests(Set<Integer> set) {
            this.f71573q = set;
            return this;
        }

        @Override // com.smaato.sdk.core.gdpr.CmpV2Data.Builder
        public CmpV2Data.Builder setPublisherRestrictions(String str) {
            this.f71571o = str;
            return this;
        }

        @Override // com.smaato.sdk.core.gdpr.CmpV2Data.Builder
        public CmpV2Data.Builder setPurposeLegitimateInterests(Set<Integer> set) {
            if (set != null) {
                this.f71569m = set;
                return this;
            }
            throw new NullPointerException("Null purposeLegitimateInterests");
        }

        @Override // com.smaato.sdk.core.gdpr.CmpV2Data.Builder
        public CmpV2Data.Builder setPurposeOneTreatment(Boolean bool) {
            if (bool != null) {
                this.f71566j = bool;
                return this;
            }
            throw new NullPointerException("Null purposeOneTreatment");
        }

        @Override // com.smaato.sdk.core.gdpr.CmpV2Data.Builder
        public CmpV2Data.Builder setPurposesConsent(Set<Integer> set) {
            if (set != null) {
                this.f71561e = set;
                return this;
            }
            throw new NullPointerException("Null purposesConsent");
        }

        @Override // com.smaato.sdk.core.gdpr.CmpV2Data.Builder
        public CmpV2Data.Builder setSdkId(String str) {
            if (str != null) {
                this.f71562f = str;
                return this;
            }
            throw new NullPointerException("Null sdkId");
        }

        @Override // com.smaato.sdk.core.gdpr.CmpV2Data.Builder
        public CmpV2Data.Builder setSpecialFeaturesOptIns(Set<Integer> set) {
            if (set != null) {
                this.f71570n = set;
                return this;
            }
            throw new NullPointerException("Null specialFeaturesOptIns");
        }

        @Override // com.smaato.sdk.core.gdpr.CmpV2Data.Builder
        public CmpV2Data.Builder setSubjectToGdpr(SubjectToGdpr subjectToGdpr) {
            if (subjectToGdpr != null) {
                this.f71558b = subjectToGdpr;
                return this;
            }
            throw new NullPointerException("Null subjectToGdpr");
        }

        @Override // com.smaato.sdk.core.gdpr.CmpV2Data.Builder
        public CmpV2Data.Builder setUseNonStandardStacks(Boolean bool) {
            if (bool != null) {
                this.f71567k = bool;
                return this;
            }
            throw new NullPointerException("Null useNonStandardStacks");
        }

        @Override // com.smaato.sdk.core.gdpr.CmpV2Data.Builder
        public CmpV2Data.Builder setVendorConsent(Set<Integer> set) {
            if (set != null) {
                this.f71560d = set;
                return this;
            }
            throw new NullPointerException("Null vendorConsent");
        }

        @Override // com.smaato.sdk.core.gdpr.CmpV2Data.Builder
        public CmpV2Data.Builder setVendorLegitimateInterests(Set<Integer> set) {
            if (set != null) {
                this.f71568l = set;
                return this;
            }
            throw new NullPointerException("Null vendorLegitimateInterests");
        }
    }

    public boolean equals(Object obj) {
        String str;
        Set<Integer> set;
        Set<Integer> set2;
        Set<Integer> set3;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CmpV2Data)) {
            return false;
        }
        CmpV2Data cmpV2Data = (CmpV2Data) obj;
        if (this.f71538a == cmpV2Data.isCmpPresent() && this.f71539b.equals(cmpV2Data.getSubjectToGdpr()) && this.f71540c.equals(cmpV2Data.getConsentString()) && this.f71541d.equals(cmpV2Data.getVendorConsent()) && this.f71542e.equals(cmpV2Data.getPurposesConsent()) && this.f71543f.equals(cmpV2Data.getSdkId()) && this.f71544g.equals(cmpV2Data.getCmpSdkVersion()) && this.f71545h.equals(cmpV2Data.getPolicyVersion()) && this.f71546i.equals(cmpV2Data.getPublisherCC()) && this.f71547j.equals(cmpV2Data.getPurposeOneTreatment()) && this.f71548k.equals(cmpV2Data.getUseNonStandardStacks()) && this.f71549l.equals(cmpV2Data.getVendorLegitimateInterests()) && this.f71550m.equals(cmpV2Data.getPurposeLegitimateInterests()) && this.f71551n.equals(cmpV2Data.getSpecialFeaturesOptIns()) && ((str = this.f71552o) != null ? str.equals(cmpV2Data.getPublisherRestrictions()) : cmpV2Data.getPublisherRestrictions() == null) && ((set = this.f71553p) != null ? set.equals(cmpV2Data.getPublisherConsent()) : cmpV2Data.getPublisherConsent() == null) && ((set2 = this.f71554q) != null ? set2.equals(cmpV2Data.getPublisherLegitimateInterests()) : cmpV2Data.getPublisherLegitimateInterests() == null) && ((set3 = this.f71555r) != null ? set3.equals(cmpV2Data.getPublisherCustomPurposesConsents()) : cmpV2Data.getPublisherCustomPurposesConsents() == null)) {
            Set<Integer> set4 = this.f71556s;
            if (set4 == null) {
                if (cmpV2Data.getPublisherCustomPurposesLegitimateInterests() == null) {
                    return true;
                }
            } else if (set4.equals(cmpV2Data.getPublisherCustomPurposesLegitimateInterests())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.smaato.sdk.core.gdpr.CmpV2Data
    @NonNull
    public String getCmpSdkVersion() {
        return this.f71544g;
    }

    @Override // com.smaato.sdk.core.gdpr.CmpV2Data, com.smaato.sdk.core.gdpr.CmpData
    @NonNull
    public String getConsentString() {
        return this.f71540c;
    }

    @Override // com.smaato.sdk.core.gdpr.CmpV2Data
    @NonNull
    public String getPolicyVersion() {
        return this.f71545h;
    }

    @Override // com.smaato.sdk.core.gdpr.CmpV2Data
    @NonNull
    public String getPublisherCC() {
        return this.f71546i;
    }

    @Override // com.smaato.sdk.core.gdpr.CmpV2Data
    @Nullable
    public Set<Integer> getPublisherConsent() {
        return this.f71553p;
    }

    @Override // com.smaato.sdk.core.gdpr.CmpV2Data
    @Nullable
    public Set<Integer> getPublisherCustomPurposesConsents() {
        return this.f71555r;
    }

    @Override // com.smaato.sdk.core.gdpr.CmpV2Data
    @Nullable
    public Set<Integer> getPublisherCustomPurposesLegitimateInterests() {
        return this.f71556s;
    }

    @Override // com.smaato.sdk.core.gdpr.CmpV2Data
    @Nullable
    public Set<Integer> getPublisherLegitimateInterests() {
        return this.f71554q;
    }

    @Override // com.smaato.sdk.core.gdpr.CmpV2Data
    @Nullable
    public String getPublisherRestrictions() {
        return this.f71552o;
    }

    @Override // com.smaato.sdk.core.gdpr.CmpV2Data
    @NonNull
    public Set<Integer> getPurposeLegitimateInterests() {
        return this.f71550m;
    }

    @Override // com.smaato.sdk.core.gdpr.CmpV2Data
    @NonNull
    public Boolean getPurposeOneTreatment() {
        return this.f71547j;
    }

    @Override // com.smaato.sdk.core.gdpr.CmpV2Data, com.smaato.sdk.core.gdpr.CmpData
    @NonNull
    public Set<Integer> getPurposesConsent() {
        return this.f71542e;
    }

    @Override // com.smaato.sdk.core.gdpr.CmpV2Data
    @NonNull
    public String getSdkId() {
        return this.f71543f;
    }

    @Override // com.smaato.sdk.core.gdpr.CmpV2Data
    @NonNull
    public Set<Integer> getSpecialFeaturesOptIns() {
        return this.f71551n;
    }

    @Override // com.smaato.sdk.core.gdpr.CmpV2Data, com.smaato.sdk.core.gdpr.CmpData
    @NonNull
    public SubjectToGdpr getSubjectToGdpr() {
        return this.f71539b;
    }

    @Override // com.smaato.sdk.core.gdpr.CmpV2Data
    @NonNull
    public Boolean getUseNonStandardStacks() {
        return this.f71548k;
    }

    @Override // com.smaato.sdk.core.gdpr.CmpV2Data, com.smaato.sdk.core.gdpr.CmpData
    @NonNull
    public Set<Integer> getVendorConsent() {
        return this.f71541d;
    }

    @Override // com.smaato.sdk.core.gdpr.CmpV2Data
    @NonNull
    public Set<Integer> getVendorLegitimateInterests() {
        return this.f71549l;
    }

    public int hashCode() {
        int i;
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        if (this.f71538a) {
            i = 1231;
        } else {
            i = 1237;
        }
        int hashCode5 = (((((((((((((((((((((((((((i ^ 1000003) * 1000003) ^ this.f71539b.hashCode()) * 1000003) ^ this.f71540c.hashCode()) * 1000003) ^ this.f71541d.hashCode()) * 1000003) ^ this.f71542e.hashCode()) * 1000003) ^ this.f71543f.hashCode()) * 1000003) ^ this.f71544g.hashCode()) * 1000003) ^ this.f71545h.hashCode()) * 1000003) ^ this.f71546i.hashCode()) * 1000003) ^ this.f71547j.hashCode()) * 1000003) ^ this.f71548k.hashCode()) * 1000003) ^ this.f71549l.hashCode()) * 1000003) ^ this.f71550m.hashCode()) * 1000003) ^ this.f71551n.hashCode()) * 1000003;
        String str = this.f71552o;
        int i2 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i3 = (hashCode5 ^ hashCode) * 1000003;
        Set<Integer> set = this.f71553p;
        if (set == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = set.hashCode();
        }
        int i4 = (i3 ^ hashCode2) * 1000003;
        Set<Integer> set2 = this.f71554q;
        if (set2 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = set2.hashCode();
        }
        int i5 = (i4 ^ hashCode3) * 1000003;
        Set<Integer> set3 = this.f71555r;
        if (set3 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = set3.hashCode();
        }
        int i6 = (i5 ^ hashCode4) * 1000003;
        Set<Integer> set4 = this.f71556s;
        if (set4 != null) {
            i2 = set4.hashCode();
        }
        return i6 ^ i2;
    }

    @Override // com.smaato.sdk.core.gdpr.CmpV2Data, com.smaato.sdk.core.gdpr.CmpData
    public boolean isCmpPresent() {
        return this.f71538a;
    }

    public String toString() {
        return "CmpV2Data{cmpPresent=" + this.f71538a + ", subjectToGdpr=" + this.f71539b + ", consentString=" + this.f71540c + ", vendorConsent=" + this.f71541d + ", purposesConsent=" + this.f71542e + ", sdkId=" + this.f71543f + ", cmpSdkVersion=" + this.f71544g + ", policyVersion=" + this.f71545h + ", publisherCC=" + this.f71546i + ", purposeOneTreatment=" + this.f71547j + ", useNonStandardStacks=" + this.f71548k + ", vendorLegitimateInterests=" + this.f71549l + ", purposeLegitimateInterests=" + this.f71550m + ", specialFeaturesOptIns=" + this.f71551n + ", publisherRestrictions=" + this.f71552o + ", publisherConsent=" + this.f71553p + ", publisherLegitimateInterests=" + this.f71554q + ", publisherCustomPurposesConsents=" + this.f71555r + ", publisherCustomPurposesLegitimateInterests=" + this.f71556s + "}";
    }

    private AutoValue_CmpV2Data(boolean z, SubjectToGdpr subjectToGdpr, String str, Set<Integer> set, Set<Integer> set2, String str2, String str3, String str4, String str5, Boolean bool, Boolean bool2, Set<Integer> set3, Set<Integer> set4, Set<Integer> set5, @Nullable String str6, @Nullable Set<Integer> set6, @Nullable Set<Integer> set7, @Nullable Set<Integer> set8, @Nullable Set<Integer> set9) {
        this.f71538a = z;
        this.f71539b = subjectToGdpr;
        this.f71540c = str;
        this.f71541d = set;
        this.f71542e = set2;
        this.f71543f = str2;
        this.f71544g = str3;
        this.f71545h = str4;
        this.f71546i = str5;
        this.f71547j = bool;
        this.f71548k = bool2;
        this.f71549l = set3;
        this.f71550m = set4;
        this.f71551n = set5;
        this.f71552o = str6;
        this.f71553p = set6;
        this.f71554q = set7;
        this.f71555r = set8;
        this.f71556s = set9;
    }
}
