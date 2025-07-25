package com.google.firebase.crashlytics.internal.model;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;

/* loaded from: classes4.dex */
final class AutoValue_CrashlyticsReport_Session_Application extends CrashlyticsReport.Session.Application {

    /* renamed from: a */
    private final String f42723a;

    /* renamed from: b */
    private final String f42724b;

    /* renamed from: c */
    private final String f42725c;

    /* renamed from: d */
    private final CrashlyticsReport.Session.Application.Organization f42726d;

    /* renamed from: e */
    private final String f42727e;

    /* renamed from: f */
    private final String f42728f;

    /* renamed from: g */
    private final String f42729g;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class Builder extends CrashlyticsReport.Session.Application.Builder {

        /* renamed from: a */
        private String f42730a;

        /* renamed from: b */
        private String f42731b;

        /* renamed from: c */
        private String f42732c;

        /* renamed from: d */
        private CrashlyticsReport.Session.Application.Organization f42733d;

        /* renamed from: e */
        private String f42734e;

        /* renamed from: f */
        private String f42735f;

        /* renamed from: g */
        private String f42736g;

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Application.Builder
        public CrashlyticsReport.Session.Application build() {
            String str = "";
            if (this.f42730a == null) {
                str = " identifier";
            }
            if (this.f42731b == null) {
                str = str + " version";
            }
            if (str.isEmpty()) {
                return new AutoValue_CrashlyticsReport_Session_Application(this.f42730a, this.f42731b, this.f42732c, this.f42733d, this.f42734e, this.f42735f, this.f42736g);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Application.Builder
        public CrashlyticsReport.Session.Application.Builder setDevelopmentPlatform(@Nullable String str) {
            this.f42735f = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Application.Builder
        public CrashlyticsReport.Session.Application.Builder setDevelopmentPlatformVersion(@Nullable String str) {
            this.f42736g = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Application.Builder
        public CrashlyticsReport.Session.Application.Builder setDisplayVersion(String str) {
            this.f42732c = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Application.Builder
        public CrashlyticsReport.Session.Application.Builder setIdentifier(String str) {
            if (str != null) {
                this.f42730a = str;
                return this;
            }
            throw new NullPointerException("Null identifier");
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Application.Builder
        public CrashlyticsReport.Session.Application.Builder setInstallationUuid(String str) {
            this.f42734e = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Application.Builder
        public CrashlyticsReport.Session.Application.Builder setOrganization(CrashlyticsReport.Session.Application.Organization organization) {
            this.f42733d = organization;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Application.Builder
        public CrashlyticsReport.Session.Application.Builder setVersion(String str) {
            if (str != null) {
                this.f42731b = str;
                return this;
            }
            throw new NullPointerException("Null version");
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public Builder() {
        }

        private Builder(CrashlyticsReport.Session.Application application) {
            this.f42730a = application.getIdentifier();
            this.f42731b = application.getVersion();
            this.f42732c = application.getDisplayVersion();
            this.f42733d = application.getOrganization();
            this.f42734e = application.getInstallationUuid();
            this.f42735f = application.getDevelopmentPlatform();
            this.f42736g = application.getDevelopmentPlatformVersion();
        }
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Application
    /* renamed from: a */
    protected CrashlyticsReport.Session.Application.Builder mo66991a() {
        return new Builder(this);
    }

    public boolean equals(Object obj) {
        String str;
        CrashlyticsReport.Session.Application.Organization organization;
        String str2;
        String str3;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CrashlyticsReport.Session.Application)) {
            return false;
        }
        CrashlyticsReport.Session.Application application = (CrashlyticsReport.Session.Application) obj;
        if (this.f42723a.equals(application.getIdentifier()) && this.f42724b.equals(application.getVersion()) && ((str = this.f42725c) != null ? str.equals(application.getDisplayVersion()) : application.getDisplayVersion() == null) && ((organization = this.f42726d) != null ? organization.equals(application.getOrganization()) : application.getOrganization() == null) && ((str2 = this.f42727e) != null ? str2.equals(application.getInstallationUuid()) : application.getInstallationUuid() == null) && ((str3 = this.f42728f) != null ? str3.equals(application.getDevelopmentPlatform()) : application.getDevelopmentPlatform() == null)) {
            String str4 = this.f42729g;
            if (str4 == null) {
                if (application.getDevelopmentPlatformVersion() == null) {
                    return true;
                }
            } else if (str4.equals(application.getDevelopmentPlatformVersion())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Application
    @Nullable
    public String getDevelopmentPlatform() {
        return this.f42728f;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Application
    @Nullable
    public String getDevelopmentPlatformVersion() {
        return this.f42729g;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Application
    @Nullable
    public String getDisplayVersion() {
        return this.f42725c;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Application
    @NonNull
    public String getIdentifier() {
        return this.f42723a;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Application
    @Nullable
    public String getInstallationUuid() {
        return this.f42727e;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Application
    @Nullable
    public CrashlyticsReport.Session.Application.Organization getOrganization() {
        return this.f42726d;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Application
    @NonNull
    public String getVersion() {
        return this.f42724b;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5 = (((this.f42723a.hashCode() ^ 1000003) * 1000003) ^ this.f42724b.hashCode()) * 1000003;
        String str = this.f42725c;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = (hashCode5 ^ hashCode) * 1000003;
        CrashlyticsReport.Session.Application.Organization organization = this.f42726d;
        if (organization == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = organization.hashCode();
        }
        int i3 = (i2 ^ hashCode2) * 1000003;
        String str2 = this.f42727e;
        if (str2 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str2.hashCode();
        }
        int i4 = (i3 ^ hashCode3) * 1000003;
        String str3 = this.f42728f;
        if (str3 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = str3.hashCode();
        }
        int i5 = (i4 ^ hashCode4) * 1000003;
        String str4 = this.f42729g;
        if (str4 != null) {
            i = str4.hashCode();
        }
        return i5 ^ i;
    }

    public String toString() {
        return "Application{identifier=" + this.f42723a + ", version=" + this.f42724b + ", displayVersion=" + this.f42725c + ", organization=" + this.f42726d + ", installationUuid=" + this.f42727e + ", developmentPlatform=" + this.f42728f + ", developmentPlatformVersion=" + this.f42729g + "}";
    }

    private AutoValue_CrashlyticsReport_Session_Application(String str, String str2, @Nullable String str3, @Nullable CrashlyticsReport.Session.Application.Organization organization, @Nullable String str4, @Nullable String str5, @Nullable String str6) {
        this.f42723a = str;
        this.f42724b = str2;
        this.f42725c = str3;
        this.f42726d = organization;
        this.f42727e = str4;
        this.f42728f = str5;
        this.f42729g = str6;
    }
}
