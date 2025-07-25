package com.google.firebase.crashlytics.internal.model;

import androidx.annotation.NonNull;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;

/* renamed from: com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_Session_Event_RolloutAssignment_RolloutVariant */
/* loaded from: classes4.dex */
final class C17335x87204092 extends CrashlyticsReport.Session.Event.RolloutAssignment.RolloutVariant {

    /* renamed from: a */
    private final String f42863a;

    /* renamed from: b */
    private final String f42864b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_Session_Event_RolloutAssignment_RolloutVariant$Builder */
    /* loaded from: classes4.dex */
    public static final class Builder extends CrashlyticsReport.Session.Event.RolloutAssignment.RolloutVariant.Builder {

        /* renamed from: a */
        private String f42865a;

        /* renamed from: b */
        private String f42866b;

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.RolloutAssignment.RolloutVariant.Builder
        public CrashlyticsReport.Session.Event.RolloutAssignment.RolloutVariant build() {
            String str = "";
            if (this.f42865a == null) {
                str = " rolloutId";
            }
            if (this.f42866b == null) {
                str = str + " variantId";
            }
            if (str.isEmpty()) {
                return new C17335x87204092(this.f42865a, this.f42866b);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.RolloutAssignment.RolloutVariant.Builder
        public CrashlyticsReport.Session.Event.RolloutAssignment.RolloutVariant.Builder setRolloutId(String str) {
            if (str != null) {
                this.f42865a = str;
                return this;
            }
            throw new NullPointerException("Null rolloutId");
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.RolloutAssignment.RolloutVariant.Builder
        public CrashlyticsReport.Session.Event.RolloutAssignment.RolloutVariant.Builder setVariantId(String str) {
            if (str != null) {
                this.f42866b = str;
                return this;
            }
            throw new NullPointerException("Null variantId");
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CrashlyticsReport.Session.Event.RolloutAssignment.RolloutVariant)) {
            return false;
        }
        CrashlyticsReport.Session.Event.RolloutAssignment.RolloutVariant rolloutVariant = (CrashlyticsReport.Session.Event.RolloutAssignment.RolloutVariant) obj;
        if (this.f42863a.equals(rolloutVariant.getRolloutId()) && this.f42864b.equals(rolloutVariant.getVariantId())) {
            return true;
        }
        return false;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.RolloutAssignment.RolloutVariant
    @NonNull
    public String getRolloutId() {
        return this.f42863a;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.RolloutAssignment.RolloutVariant
    @NonNull
    public String getVariantId() {
        return this.f42864b;
    }

    public int hashCode() {
        return ((this.f42863a.hashCode() ^ 1000003) * 1000003) ^ this.f42864b.hashCode();
    }

    public String toString() {
        return "RolloutVariant{rolloutId=" + this.f42863a + ", variantId=" + this.f42864b + "}";
    }

    private C17335x87204092(String str, String str2) {
        this.f42863a = str;
        this.f42864b = str2;
    }
}
