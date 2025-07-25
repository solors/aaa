package com.google.firebase.crashlytics.internal.model;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import java.util.List;

/* loaded from: classes4.dex */
final class AutoValue_CrashlyticsReport_FilesPayload extends CrashlyticsReport.FilesPayload {

    /* renamed from: a */
    private final List<CrashlyticsReport.FilesPayload.File> f42691a;

    /* renamed from: b */
    private final String f42692b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class Builder extends CrashlyticsReport.FilesPayload.Builder {

        /* renamed from: a */
        private List<CrashlyticsReport.FilesPayload.File> f42693a;

        /* renamed from: b */
        private String f42694b;

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.FilesPayload.Builder
        public CrashlyticsReport.FilesPayload build() {
            String str = "";
            if (this.f42693a == null) {
                str = " files";
            }
            if (str.isEmpty()) {
                return new AutoValue_CrashlyticsReport_FilesPayload(this.f42693a, this.f42694b);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.FilesPayload.Builder
        public CrashlyticsReport.FilesPayload.Builder setFiles(List<CrashlyticsReport.FilesPayload.File> list) {
            if (list != null) {
                this.f42693a = list;
                return this;
            }
            throw new NullPointerException("Null files");
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.FilesPayload.Builder
        public CrashlyticsReport.FilesPayload.Builder setOrgId(String str) {
            this.f42694b = str;
            return this;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public Builder() {
        }

        private Builder(CrashlyticsReport.FilesPayload filesPayload) {
            this.f42693a = filesPayload.getFiles();
            this.f42694b = filesPayload.getOrgId();
        }
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.FilesPayload
    /* renamed from: a */
    CrashlyticsReport.FilesPayload.Builder mo66996a() {
        return new Builder(this);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CrashlyticsReport.FilesPayload)) {
            return false;
        }
        CrashlyticsReport.FilesPayload filesPayload = (CrashlyticsReport.FilesPayload) obj;
        if (this.f42691a.equals(filesPayload.getFiles())) {
            String str = this.f42692b;
            if (str == null) {
                if (filesPayload.getOrgId() == null) {
                    return true;
                }
            } else if (str.equals(filesPayload.getOrgId())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.FilesPayload
    @NonNull
    public List<CrashlyticsReport.FilesPayload.File> getFiles() {
        return this.f42691a;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.FilesPayload
    @Nullable
    public String getOrgId() {
        return this.f42692b;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = (this.f42691a.hashCode() ^ 1000003) * 1000003;
        String str = this.f42692b;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return hashCode2 ^ hashCode;
    }

    public String toString() {
        return "FilesPayload{files=" + this.f42691a + ", orgId=" + this.f42692b + "}";
    }

    private AutoValue_CrashlyticsReport_FilesPayload(List<CrashlyticsReport.FilesPayload.File> list, @Nullable String str) {
        this.f42691a = list;
        this.f42692b = str;
    }
}
