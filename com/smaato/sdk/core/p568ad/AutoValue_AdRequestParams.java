package com.smaato.sdk.core.p568ad;

import androidx.annotation.Nullable;
import com.smaato.sdk.core.p568ad.AdRequestParams;

/* renamed from: com.smaato.sdk.core.ad.a */
/* loaded from: classes7.dex */
final class AutoValue_AdRequestParams extends AdRequestParams {

    /* renamed from: a */
    private final String f71380a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AutoValue_AdRequestParams.java */
    /* renamed from: com.smaato.sdk.core.ad.a$b */
    /* loaded from: classes7.dex */
    public static final class C27008b extends AdRequestParams.Builder {

        /* renamed from: a */
        private String f71381a;

        @Override // com.smaato.sdk.core.p568ad.AdRequestParams.Builder
        public AdRequestParams build() {
            return new AutoValue_AdRequestParams(this.f71381a);
        }

        @Override // com.smaato.sdk.core.p568ad.AdRequestParams.Builder
        public AdRequestParams.Builder setUBUniqueId(@Nullable String str) {
            this.f71381a = str;
            return this;
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AdRequestParams)) {
            return false;
        }
        String str = this.f71380a;
        String uBUniqueId = ((AdRequestParams) obj).getUBUniqueId();
        if (str == null) {
            if (uBUniqueId == null) {
                return true;
            }
            return false;
        }
        return str.equals(uBUniqueId);
    }

    @Override // com.smaato.sdk.core.p568ad.AdRequestParams
    @Nullable
    public String getUBUniqueId() {
        return this.f71380a;
    }

    public int hashCode() {
        int hashCode;
        String str = this.f71380a;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return hashCode ^ 1000003;
    }

    public String toString() {
        return "AdRequestParams{UBUniqueId=" + this.f71380a + "}";
    }

    private AutoValue_AdRequestParams(@Nullable String str) {
        this.f71380a = str;
    }
}
