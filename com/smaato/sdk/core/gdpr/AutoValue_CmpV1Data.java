package com.smaato.sdk.core.gdpr;

import androidx.annotation.NonNull;
import com.smaato.sdk.core.gdpr.CmpV1Data;
import java.util.Set;

/* renamed from: com.smaato.sdk.core.gdpr.a */
/* loaded from: classes7.dex */
final class AutoValue_CmpV1Data extends CmpV1Data {

    /* renamed from: a */
    private final boolean f71528a;

    /* renamed from: b */
    private final SubjectToGdpr f71529b;

    /* renamed from: c */
    private final String f71530c;

    /* renamed from: d */
    private final Set<Integer> f71531d;

    /* renamed from: e */
    private final Set<Integer> f71532e;

    /* compiled from: AutoValue_CmpV1Data.java */
    /* renamed from: com.smaato.sdk.core.gdpr.a$b */
    /* loaded from: classes7.dex */
    static final class C27111b extends CmpV1Data.Builder {

        /* renamed from: a */
        private Boolean f71533a;

        /* renamed from: b */
        private SubjectToGdpr f71534b;

        /* renamed from: c */
        private String f71535c;

        /* renamed from: d */
        private Set<Integer> f71536d;

        /* renamed from: e */
        private Set<Integer> f71537e;

        @Override // com.smaato.sdk.core.gdpr.CmpV1Data.Builder
        public CmpV1Data build() {
            String str = "";
            if (this.f71533a == null) {
                str = " cmpPresent";
            }
            if (this.f71534b == null) {
                str = str + " subjectToGdpr";
            }
            if (this.f71535c == null) {
                str = str + " consentString";
            }
            if (this.f71536d == null) {
                str = str + " vendorConsent";
            }
            if (this.f71537e == null) {
                str = str + " purposesConsent";
            }
            if (str.isEmpty()) {
                return new AutoValue_CmpV1Data(this.f71533a.booleanValue(), this.f71534b, this.f71535c, this.f71536d, this.f71537e);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.smaato.sdk.core.gdpr.CmpV1Data.Builder
        public CmpV1Data.Builder setCmpPresent(boolean z) {
            this.f71533a = Boolean.valueOf(z);
            return this;
        }

        @Override // com.smaato.sdk.core.gdpr.CmpV1Data.Builder
        public CmpV1Data.Builder setConsentString(String str) {
            if (str != null) {
                this.f71535c = str;
                return this;
            }
            throw new NullPointerException("Null consentString");
        }

        @Override // com.smaato.sdk.core.gdpr.CmpV1Data.Builder
        public CmpV1Data.Builder setPurposesConsent(Set<Integer> set) {
            if (set != null) {
                this.f71537e = set;
                return this;
            }
            throw new NullPointerException("Null purposesConsent");
        }

        @Override // com.smaato.sdk.core.gdpr.CmpV1Data.Builder
        public CmpV1Data.Builder setSubjectToGdpr(SubjectToGdpr subjectToGdpr) {
            if (subjectToGdpr != null) {
                this.f71534b = subjectToGdpr;
                return this;
            }
            throw new NullPointerException("Null subjectToGdpr");
        }

        @Override // com.smaato.sdk.core.gdpr.CmpV1Data.Builder
        public CmpV1Data.Builder setVendorConsent(Set<Integer> set) {
            if (set != null) {
                this.f71536d = set;
                return this;
            }
            throw new NullPointerException("Null vendorConsent");
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CmpV1Data)) {
            return false;
        }
        CmpV1Data cmpV1Data = (CmpV1Data) obj;
        if (this.f71528a == cmpV1Data.isCmpPresent() && this.f71529b.equals(cmpV1Data.getSubjectToGdpr()) && this.f71530c.equals(cmpV1Data.getConsentString()) && this.f71531d.equals(cmpV1Data.getVendorConsent()) && this.f71532e.equals(cmpV1Data.getPurposesConsent())) {
            return true;
        }
        return false;
    }

    @Override // com.smaato.sdk.core.gdpr.CmpV1Data, com.smaato.sdk.core.gdpr.CmpData
    @NonNull
    public String getConsentString() {
        return this.f71530c;
    }

    @Override // com.smaato.sdk.core.gdpr.CmpV1Data, com.smaato.sdk.core.gdpr.CmpData
    @NonNull
    public Set<Integer> getPurposesConsent() {
        return this.f71532e;
    }

    @Override // com.smaato.sdk.core.gdpr.CmpV1Data, com.smaato.sdk.core.gdpr.CmpData
    @NonNull
    public SubjectToGdpr getSubjectToGdpr() {
        return this.f71529b;
    }

    @Override // com.smaato.sdk.core.gdpr.CmpV1Data, com.smaato.sdk.core.gdpr.CmpData
    @NonNull
    public Set<Integer> getVendorConsent() {
        return this.f71531d;
    }

    public int hashCode() {
        int i;
        if (this.f71528a) {
            i = 1231;
        } else {
            i = 1237;
        }
        return ((((((((i ^ 1000003) * 1000003) ^ this.f71529b.hashCode()) * 1000003) ^ this.f71530c.hashCode()) * 1000003) ^ this.f71531d.hashCode()) * 1000003) ^ this.f71532e.hashCode();
    }

    @Override // com.smaato.sdk.core.gdpr.CmpV1Data, com.smaato.sdk.core.gdpr.CmpData
    public boolean isCmpPresent() {
        return this.f71528a;
    }

    public String toString() {
        return "CmpV1Data{cmpPresent=" + this.f71528a + ", subjectToGdpr=" + this.f71529b + ", consentString=" + this.f71530c + ", vendorConsent=" + this.f71531d + ", purposesConsent=" + this.f71532e + "}";
    }

    private AutoValue_CmpV1Data(boolean z, SubjectToGdpr subjectToGdpr, String str, Set<Integer> set, Set<Integer> set2) {
        this.f71528a = z;
        this.f71529b = subjectToGdpr;
        this.f71530c = str;
        this.f71531d = set;
        this.f71532e = set2;
    }
}
