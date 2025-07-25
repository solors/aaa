package com.google.firebase.crashlytics.internal.model;

import androidx.annotation.NonNull;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;

/* loaded from: classes4.dex */
final class AutoValue_CrashlyticsReport_Session_Application_Organization extends CrashlyticsReport.Session.Application.Organization {

    /* renamed from: a */
    private final String f42737a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class Builder extends CrashlyticsReport.Session.Application.Organization.Builder {

        /* renamed from: a */
        private String f42738a;

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Application.Organization.Builder
        public CrashlyticsReport.Session.Application.Organization build() {
            String str = "";
            if (this.f42738a == null) {
                str = " clsId";
            }
            if (str.isEmpty()) {
                return new AutoValue_CrashlyticsReport_Session_Application_Organization(this.f42738a);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Application.Organization.Builder
        public CrashlyticsReport.Session.Application.Organization.Builder setClsId(String str) {
            if (str != null) {
                this.f42738a = str;
                return this;
            }
            throw new NullPointerException("Null clsId");
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public Builder() {
        }

        private Builder(CrashlyticsReport.Session.Application.Organization organization) {
            this.f42738a = organization.getClsId();
        }
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Application.Organization
    /* renamed from: a */
    protected CrashlyticsReport.Session.Application.Organization.Builder mo66989a() {
        return new Builder(this);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof CrashlyticsReport.Session.Application.Organization) {
            return this.f42737a.equals(((CrashlyticsReport.Session.Application.Organization) obj).getClsId());
        }
        return false;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Application.Organization
    @NonNull
    public String getClsId() {
        return this.f42737a;
    }

    public int hashCode() {
        return this.f42737a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "Organization{clsId=" + this.f42737a + "}";
    }

    private AutoValue_CrashlyticsReport_Session_Application_Organization(String str) {
        this.f42737a = str;
    }
}
