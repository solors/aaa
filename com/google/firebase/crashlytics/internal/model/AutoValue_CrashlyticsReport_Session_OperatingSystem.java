package com.google.firebase.crashlytics.internal.model;

import androidx.annotation.NonNull;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;

/* loaded from: classes4.dex */
final class AutoValue_CrashlyticsReport_Session_OperatingSystem extends CrashlyticsReport.Session.OperatingSystem {

    /* renamed from: a */
    private final int f42869a;

    /* renamed from: b */
    private final String f42870b;

    /* renamed from: c */
    private final String f42871c;

    /* renamed from: d */
    private final boolean f42872d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class Builder extends CrashlyticsReport.Session.OperatingSystem.Builder {

        /* renamed from: a */
        private Integer f42873a;

        /* renamed from: b */
        private String f42874b;

        /* renamed from: c */
        private String f42875c;

        /* renamed from: d */
        private Boolean f42876d;

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.OperatingSystem.Builder
        public CrashlyticsReport.Session.OperatingSystem build() {
            String str = "";
            if (this.f42873a == null) {
                str = " platform";
            }
            if (this.f42874b == null) {
                str = str + " version";
            }
            if (this.f42875c == null) {
                str = str + " buildVersion";
            }
            if (this.f42876d == null) {
                str = str + " jailbroken";
            }
            if (str.isEmpty()) {
                return new AutoValue_CrashlyticsReport_Session_OperatingSystem(this.f42873a.intValue(), this.f42874b, this.f42875c, this.f42876d.booleanValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.OperatingSystem.Builder
        public CrashlyticsReport.Session.OperatingSystem.Builder setBuildVersion(String str) {
            if (str != null) {
                this.f42875c = str;
                return this;
            }
            throw new NullPointerException("Null buildVersion");
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.OperatingSystem.Builder
        public CrashlyticsReport.Session.OperatingSystem.Builder setJailbroken(boolean z) {
            this.f42876d = Boolean.valueOf(z);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.OperatingSystem.Builder
        public CrashlyticsReport.Session.OperatingSystem.Builder setPlatform(int i) {
            this.f42873a = Integer.valueOf(i);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.OperatingSystem.Builder
        public CrashlyticsReport.Session.OperatingSystem.Builder setVersion(String str) {
            if (str != null) {
                this.f42874b = str;
                return this;
            }
            throw new NullPointerException("Null version");
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CrashlyticsReport.Session.OperatingSystem)) {
            return false;
        }
        CrashlyticsReport.Session.OperatingSystem operatingSystem = (CrashlyticsReport.Session.OperatingSystem) obj;
        if (this.f42869a == operatingSystem.getPlatform() && this.f42870b.equals(operatingSystem.getVersion()) && this.f42871c.equals(operatingSystem.getBuildVersion()) && this.f42872d == operatingSystem.isJailbroken()) {
            return true;
        }
        return false;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.OperatingSystem
    @NonNull
    public String getBuildVersion() {
        return this.f42871c;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.OperatingSystem
    public int getPlatform() {
        return this.f42869a;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.OperatingSystem
    @NonNull
    public String getVersion() {
        return this.f42870b;
    }

    public int hashCode() {
        int i;
        int hashCode = (((((this.f42869a ^ 1000003) * 1000003) ^ this.f42870b.hashCode()) * 1000003) ^ this.f42871c.hashCode()) * 1000003;
        if (this.f42872d) {
            i = 1231;
        } else {
            i = 1237;
        }
        return hashCode ^ i;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.OperatingSystem
    public boolean isJailbroken() {
        return this.f42872d;
    }

    public String toString() {
        return "OperatingSystem{platform=" + this.f42869a + ", version=" + this.f42870b + ", buildVersion=" + this.f42871c + ", jailbroken=" + this.f42872d + "}";
    }

    private AutoValue_CrashlyticsReport_Session_OperatingSystem(int i, String str, String str2, boolean z) {
        this.f42869a = i;
        this.f42870b = str;
        this.f42871c = str2;
        this.f42872d = z;
    }
}
