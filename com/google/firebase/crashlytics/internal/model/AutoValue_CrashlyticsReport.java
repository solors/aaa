package com.google.firebase.crashlytics.internal.model;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;

/* loaded from: classes4.dex */
final class AutoValue_CrashlyticsReport extends CrashlyticsReport {

    /* renamed from: b */
    private final String f42639b;

    /* renamed from: c */
    private final String f42640c;

    /* renamed from: d */
    private final int f42641d;

    /* renamed from: e */
    private final String f42642e;

    /* renamed from: f */
    private final String f42643f;

    /* renamed from: g */
    private final String f42644g;

    /* renamed from: h */
    private final String f42645h;

    /* renamed from: i */
    private final String f42646i;

    /* renamed from: j */
    private final String f42647j;

    /* renamed from: k */
    private final CrashlyticsReport.Session f42648k;

    /* renamed from: l */
    private final CrashlyticsReport.FilesPayload f42649l;

    /* renamed from: m */
    private final CrashlyticsReport.ApplicationExitInfo f42650m;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class Builder extends CrashlyticsReport.Builder {

        /* renamed from: a */
        private String f42651a;

        /* renamed from: b */
        private String f42652b;

        /* renamed from: c */
        private Integer f42653c;

        /* renamed from: d */
        private String f42654d;

        /* renamed from: e */
        private String f42655e;

        /* renamed from: f */
        private String f42656f;

        /* renamed from: g */
        private String f42657g;

        /* renamed from: h */
        private String f42658h;

        /* renamed from: i */
        private String f42659i;

        /* renamed from: j */
        private CrashlyticsReport.Session f42660j;

        /* renamed from: k */
        private CrashlyticsReport.FilesPayload f42661k;

        /* renamed from: l */
        private CrashlyticsReport.ApplicationExitInfo f42662l;

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Builder
        public CrashlyticsReport build() {
            String str = "";
            if (this.f42651a == null) {
                str = " sdkVersion";
            }
            if (this.f42652b == null) {
                str = str + " gmpAppId";
            }
            if (this.f42653c == null) {
                str = str + " platform";
            }
            if (this.f42654d == null) {
                str = str + " installationUuid";
            }
            if (this.f42658h == null) {
                str = str + " buildVersion";
            }
            if (this.f42659i == null) {
                str = str + " displayVersion";
            }
            if (str.isEmpty()) {
                return new AutoValue_CrashlyticsReport(this.f42651a, this.f42652b, this.f42653c.intValue(), this.f42654d, this.f42655e, this.f42656f, this.f42657g, this.f42658h, this.f42659i, this.f42660j, this.f42661k, this.f42662l);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Builder
        public CrashlyticsReport.Builder setAppExitInfo(CrashlyticsReport.ApplicationExitInfo applicationExitInfo) {
            this.f42662l = applicationExitInfo;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Builder
        public CrashlyticsReport.Builder setAppQualitySessionId(@Nullable String str) {
            this.f42657g = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Builder
        public CrashlyticsReport.Builder setBuildVersion(String str) {
            if (str != null) {
                this.f42658h = str;
                return this;
            }
            throw new NullPointerException("Null buildVersion");
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Builder
        public CrashlyticsReport.Builder setDisplayVersion(String str) {
            if (str != null) {
                this.f42659i = str;
                return this;
            }
            throw new NullPointerException("Null displayVersion");
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Builder
        public CrashlyticsReport.Builder setFirebaseAuthenticationToken(@Nullable String str) {
            this.f42656f = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Builder
        public CrashlyticsReport.Builder setFirebaseInstallationId(@Nullable String str) {
            this.f42655e = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Builder
        public CrashlyticsReport.Builder setGmpAppId(String str) {
            if (str != null) {
                this.f42652b = str;
                return this;
            }
            throw new NullPointerException("Null gmpAppId");
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Builder
        public CrashlyticsReport.Builder setInstallationUuid(String str) {
            if (str != null) {
                this.f42654d = str;
                return this;
            }
            throw new NullPointerException("Null installationUuid");
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Builder
        public CrashlyticsReport.Builder setNdkPayload(CrashlyticsReport.FilesPayload filesPayload) {
            this.f42661k = filesPayload;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Builder
        public CrashlyticsReport.Builder setPlatform(int i) {
            this.f42653c = Integer.valueOf(i);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Builder
        public CrashlyticsReport.Builder setSdkVersion(String str) {
            if (str != null) {
                this.f42651a = str;
                return this;
            }
            throw new NullPointerException("Null sdkVersion");
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Builder
        public CrashlyticsReport.Builder setSession(CrashlyticsReport.Session session) {
            this.f42660j = session;
            return this;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public Builder() {
        }

        private Builder(CrashlyticsReport crashlyticsReport) {
            this.f42651a = crashlyticsReport.getSdkVersion();
            this.f42652b = crashlyticsReport.getGmpAppId();
            this.f42653c = Integer.valueOf(crashlyticsReport.getPlatform());
            this.f42654d = crashlyticsReport.getInstallationUuid();
            this.f42655e = crashlyticsReport.getFirebaseInstallationId();
            this.f42656f = crashlyticsReport.getFirebaseAuthenticationToken();
            this.f42657g = crashlyticsReport.getAppQualitySessionId();
            this.f42658h = crashlyticsReport.getBuildVersion();
            this.f42659i = crashlyticsReport.getDisplayVersion();
            this.f42660j = crashlyticsReport.getSession();
            this.f42661k = crashlyticsReport.getNdkPayload();
            this.f42662l = crashlyticsReport.getAppExitInfo();
        }
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport
    /* renamed from: b */
    protected CrashlyticsReport.Builder mo66997b() {
        return new Builder(this);
    }

    public boolean equals(Object obj) {
        String str;
        String str2;
        String str3;
        CrashlyticsReport.Session session;
        CrashlyticsReport.FilesPayload filesPayload;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CrashlyticsReport)) {
            return false;
        }
        CrashlyticsReport crashlyticsReport = (CrashlyticsReport) obj;
        if (this.f42639b.equals(crashlyticsReport.getSdkVersion()) && this.f42640c.equals(crashlyticsReport.getGmpAppId()) && this.f42641d == crashlyticsReport.getPlatform() && this.f42642e.equals(crashlyticsReport.getInstallationUuid()) && ((str = this.f42643f) != null ? str.equals(crashlyticsReport.getFirebaseInstallationId()) : crashlyticsReport.getFirebaseInstallationId() == null) && ((str2 = this.f42644g) != null ? str2.equals(crashlyticsReport.getFirebaseAuthenticationToken()) : crashlyticsReport.getFirebaseAuthenticationToken() == null) && ((str3 = this.f42645h) != null ? str3.equals(crashlyticsReport.getAppQualitySessionId()) : crashlyticsReport.getAppQualitySessionId() == null) && this.f42646i.equals(crashlyticsReport.getBuildVersion()) && this.f42647j.equals(crashlyticsReport.getDisplayVersion()) && ((session = this.f42648k) != null ? session.equals(crashlyticsReport.getSession()) : crashlyticsReport.getSession() == null) && ((filesPayload = this.f42649l) != null ? filesPayload.equals(crashlyticsReport.getNdkPayload()) : crashlyticsReport.getNdkPayload() == null)) {
            CrashlyticsReport.ApplicationExitInfo applicationExitInfo = this.f42650m;
            if (applicationExitInfo == null) {
                if (crashlyticsReport.getAppExitInfo() == null) {
                    return true;
                }
            } else if (applicationExitInfo.equals(crashlyticsReport.getAppExitInfo())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport
    @Nullable
    public CrashlyticsReport.ApplicationExitInfo getAppExitInfo() {
        return this.f42650m;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport
    @Nullable
    public String getAppQualitySessionId() {
        return this.f42645h;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport
    @NonNull
    public String getBuildVersion() {
        return this.f42646i;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport
    @NonNull
    public String getDisplayVersion() {
        return this.f42647j;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport
    @Nullable
    public String getFirebaseAuthenticationToken() {
        return this.f42644g;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport
    @Nullable
    public String getFirebaseInstallationId() {
        return this.f42643f;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport
    @NonNull
    public String getGmpAppId() {
        return this.f42640c;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport
    @NonNull
    public String getInstallationUuid() {
        return this.f42642e;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport
    @Nullable
    public CrashlyticsReport.FilesPayload getNdkPayload() {
        return this.f42649l;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport
    public int getPlatform() {
        return this.f42641d;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport
    @NonNull
    public String getSdkVersion() {
        return this.f42639b;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport
    @Nullable
    public CrashlyticsReport.Session getSession() {
        return this.f42648k;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int hashCode6 = (((((((this.f42639b.hashCode() ^ 1000003) * 1000003) ^ this.f42640c.hashCode()) * 1000003) ^ this.f42641d) * 1000003) ^ this.f42642e.hashCode()) * 1000003;
        String str = this.f42643f;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = (hashCode6 ^ hashCode) * 1000003;
        String str2 = this.f42644g;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i3 = (i2 ^ hashCode2) * 1000003;
        String str3 = this.f42645h;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        int hashCode7 = (((((i3 ^ hashCode3) * 1000003) ^ this.f42646i.hashCode()) * 1000003) ^ this.f42647j.hashCode()) * 1000003;
        CrashlyticsReport.Session session = this.f42648k;
        if (session == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = session.hashCode();
        }
        int i4 = (hashCode7 ^ hashCode4) * 1000003;
        CrashlyticsReport.FilesPayload filesPayload = this.f42649l;
        if (filesPayload == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = filesPayload.hashCode();
        }
        int i5 = (i4 ^ hashCode5) * 1000003;
        CrashlyticsReport.ApplicationExitInfo applicationExitInfo = this.f42650m;
        if (applicationExitInfo != null) {
            i = applicationExitInfo.hashCode();
        }
        return i5 ^ i;
    }

    public String toString() {
        return "CrashlyticsReport{sdkVersion=" + this.f42639b + ", gmpAppId=" + this.f42640c + ", platform=" + this.f42641d + ", installationUuid=" + this.f42642e + ", firebaseInstallationId=" + this.f42643f + ", firebaseAuthenticationToken=" + this.f42644g + ", appQualitySessionId=" + this.f42645h + ", buildVersion=" + this.f42646i + ", displayVersion=" + this.f42647j + ", session=" + this.f42648k + ", ndkPayload=" + this.f42649l + ", appExitInfo=" + this.f42650m + "}";
    }

    private AutoValue_CrashlyticsReport(String str, String str2, int i, String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, String str7, String str8, @Nullable CrashlyticsReport.Session session, @Nullable CrashlyticsReport.FilesPayload filesPayload, @Nullable CrashlyticsReport.ApplicationExitInfo applicationExitInfo) {
        this.f42639b = str;
        this.f42640c = str2;
        this.f42641d = i;
        this.f42642e = str3;
        this.f42643f = str4;
        this.f42644g = str5;
        this.f42645h = str6;
        this.f42646i = str7;
        this.f42647j = str8;
        this.f42648k = session;
        this.f42649l = filesPayload;
        this.f42650m = applicationExitInfo;
    }
}
