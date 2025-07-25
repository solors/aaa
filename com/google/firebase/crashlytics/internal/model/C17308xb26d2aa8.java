package com.google.firebase.crashlytics.internal.model;

import androidx.annotation.NonNull;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;

/* renamed from: com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_ApplicationExitInfo_BuildIdMappingForArch */
/* loaded from: classes4.dex */
final class C17308xb26d2aa8 extends CrashlyticsReport.ApplicationExitInfo.BuildIdMappingForArch {

    /* renamed from: a */
    private final String f42681a;

    /* renamed from: b */
    private final String f42682b;

    /* renamed from: c */
    private final String f42683c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_ApplicationExitInfo_BuildIdMappingForArch$Builder */
    /* loaded from: classes4.dex */
    public static final class Builder extends CrashlyticsReport.ApplicationExitInfo.BuildIdMappingForArch.Builder {

        /* renamed from: a */
        private String f42684a;

        /* renamed from: b */
        private String f42685b;

        /* renamed from: c */
        private String f42686c;

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo.BuildIdMappingForArch.Builder
        public CrashlyticsReport.ApplicationExitInfo.BuildIdMappingForArch build() {
            String str = "";
            if (this.f42684a == null) {
                str = " arch";
            }
            if (this.f42685b == null) {
                str = str + " libraryName";
            }
            if (this.f42686c == null) {
                str = str + " buildId";
            }
            if (str.isEmpty()) {
                return new C17308xb26d2aa8(this.f42684a, this.f42685b, this.f42686c);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo.BuildIdMappingForArch.Builder
        public CrashlyticsReport.ApplicationExitInfo.BuildIdMappingForArch.Builder setArch(String str) {
            if (str != null) {
                this.f42684a = str;
                return this;
            }
            throw new NullPointerException("Null arch");
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo.BuildIdMappingForArch.Builder
        public CrashlyticsReport.ApplicationExitInfo.BuildIdMappingForArch.Builder setBuildId(String str) {
            if (str != null) {
                this.f42686c = str;
                return this;
            }
            throw new NullPointerException("Null buildId");
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo.BuildIdMappingForArch.Builder
        public CrashlyticsReport.ApplicationExitInfo.BuildIdMappingForArch.Builder setLibraryName(String str) {
            if (str != null) {
                this.f42685b = str;
                return this;
            }
            throw new NullPointerException("Null libraryName");
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CrashlyticsReport.ApplicationExitInfo.BuildIdMappingForArch)) {
            return false;
        }
        CrashlyticsReport.ApplicationExitInfo.BuildIdMappingForArch buildIdMappingForArch = (CrashlyticsReport.ApplicationExitInfo.BuildIdMappingForArch) obj;
        if (this.f42681a.equals(buildIdMappingForArch.getArch()) && this.f42682b.equals(buildIdMappingForArch.getLibraryName()) && this.f42683c.equals(buildIdMappingForArch.getBuildId())) {
            return true;
        }
        return false;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo.BuildIdMappingForArch
    @NonNull
    public String getArch() {
        return this.f42681a;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo.BuildIdMappingForArch
    @NonNull
    public String getBuildId() {
        return this.f42683c;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo.BuildIdMappingForArch
    @NonNull
    public String getLibraryName() {
        return this.f42682b;
    }

    public int hashCode() {
        return ((((this.f42681a.hashCode() ^ 1000003) * 1000003) ^ this.f42682b.hashCode()) * 1000003) ^ this.f42683c.hashCode();
    }

    public String toString() {
        return "BuildIdMappingForArch{arch=" + this.f42681a + ", libraryName=" + this.f42682b + ", buildId=" + this.f42683c + "}";
    }

    private C17308xb26d2aa8(String str, String str2, String str3) {
        this.f42681a = str;
        this.f42682b = str2;
        this.f42683c = str3;
    }
}
