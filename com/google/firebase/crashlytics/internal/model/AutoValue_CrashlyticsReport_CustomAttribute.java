package com.google.firebase.crashlytics.internal.model;

import androidx.annotation.NonNull;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;

/* loaded from: classes4.dex */
final class AutoValue_CrashlyticsReport_CustomAttribute extends CrashlyticsReport.CustomAttribute {

    /* renamed from: a */
    private final String f42687a;

    /* renamed from: b */
    private final String f42688b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class Builder extends CrashlyticsReport.CustomAttribute.Builder {

        /* renamed from: a */
        private String f42689a;

        /* renamed from: b */
        private String f42690b;

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.CustomAttribute.Builder
        public CrashlyticsReport.CustomAttribute build() {
            String str = "";
            if (this.f42689a == null) {
                str = " key";
            }
            if (this.f42690b == null) {
                str = str + " value";
            }
            if (str.isEmpty()) {
                return new AutoValue_CrashlyticsReport_CustomAttribute(this.f42689a, this.f42690b);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.CustomAttribute.Builder
        public CrashlyticsReport.CustomAttribute.Builder setKey(String str) {
            if (str != null) {
                this.f42689a = str;
                return this;
            }
            throw new NullPointerException("Null key");
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.CustomAttribute.Builder
        public CrashlyticsReport.CustomAttribute.Builder setValue(String str) {
            if (str != null) {
                this.f42690b = str;
                return this;
            }
            throw new NullPointerException("Null value");
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CrashlyticsReport.CustomAttribute)) {
            return false;
        }
        CrashlyticsReport.CustomAttribute customAttribute = (CrashlyticsReport.CustomAttribute) obj;
        if (this.f42687a.equals(customAttribute.getKey()) && this.f42688b.equals(customAttribute.getValue())) {
            return true;
        }
        return false;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.CustomAttribute
    @NonNull
    public String getKey() {
        return this.f42687a;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.CustomAttribute
    @NonNull
    public String getValue() {
        return this.f42688b;
    }

    public int hashCode() {
        return ((this.f42687a.hashCode() ^ 1000003) * 1000003) ^ this.f42688b.hashCode();
    }

    public String toString() {
        return "CustomAttribute{key=" + this.f42687a + ", value=" + this.f42688b + "}";
    }

    private AutoValue_CrashlyticsReport_CustomAttribute(String str, String str2) {
        this.f42687a = str;
        this.f42688b = str2;
    }
}
