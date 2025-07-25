package com.google.firebase.crashlytics.internal.model;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import java.util.List;

/* loaded from: classes4.dex */
final class AutoValue_CrashlyticsReport_ApplicationExitInfo extends CrashlyticsReport.ApplicationExitInfo {

    /* renamed from: a */
    private final int f42663a;

    /* renamed from: b */
    private final String f42664b;

    /* renamed from: c */
    private final int f42665c;

    /* renamed from: d */
    private final int f42666d;

    /* renamed from: e */
    private final long f42667e;

    /* renamed from: f */
    private final long f42668f;

    /* renamed from: g */
    private final long f42669g;

    /* renamed from: h */
    private final String f42670h;

    /* renamed from: i */
    private final List<CrashlyticsReport.ApplicationExitInfo.BuildIdMappingForArch> f42671i;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class Builder extends CrashlyticsReport.ApplicationExitInfo.Builder {

        /* renamed from: a */
        private Integer f42672a;

        /* renamed from: b */
        private String f42673b;

        /* renamed from: c */
        private Integer f42674c;

        /* renamed from: d */
        private Integer f42675d;

        /* renamed from: e */
        private Long f42676e;

        /* renamed from: f */
        private Long f42677f;

        /* renamed from: g */
        private Long f42678g;

        /* renamed from: h */
        private String f42679h;

        /* renamed from: i */
        private List<CrashlyticsReport.ApplicationExitInfo.BuildIdMappingForArch> f42680i;

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo.Builder
        public CrashlyticsReport.ApplicationExitInfo build() {
            String str = "";
            if (this.f42672a == null) {
                str = " pid";
            }
            if (this.f42673b == null) {
                str = str + " processName";
            }
            if (this.f42674c == null) {
                str = str + " reasonCode";
            }
            if (this.f42675d == null) {
                str = str + " importance";
            }
            if (this.f42676e == null) {
                str = str + " pss";
            }
            if (this.f42677f == null) {
                str = str + " rss";
            }
            if (this.f42678g == null) {
                str = str + " timestamp";
            }
            if (str.isEmpty()) {
                return new AutoValue_CrashlyticsReport_ApplicationExitInfo(this.f42672a.intValue(), this.f42673b, this.f42674c.intValue(), this.f42675d.intValue(), this.f42676e.longValue(), this.f42677f.longValue(), this.f42678g.longValue(), this.f42679h, this.f42680i);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo.Builder
        public CrashlyticsReport.ApplicationExitInfo.Builder setBuildIdMappingForArch(@Nullable List<CrashlyticsReport.ApplicationExitInfo.BuildIdMappingForArch> list) {
            this.f42680i = list;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo.Builder
        public CrashlyticsReport.ApplicationExitInfo.Builder setImportance(int i) {
            this.f42675d = Integer.valueOf(i);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo.Builder
        public CrashlyticsReport.ApplicationExitInfo.Builder setPid(int i) {
            this.f42672a = Integer.valueOf(i);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo.Builder
        public CrashlyticsReport.ApplicationExitInfo.Builder setProcessName(String str) {
            if (str != null) {
                this.f42673b = str;
                return this;
            }
            throw new NullPointerException("Null processName");
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo.Builder
        public CrashlyticsReport.ApplicationExitInfo.Builder setPss(long j) {
            this.f42676e = Long.valueOf(j);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo.Builder
        public CrashlyticsReport.ApplicationExitInfo.Builder setReasonCode(int i) {
            this.f42674c = Integer.valueOf(i);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo.Builder
        public CrashlyticsReport.ApplicationExitInfo.Builder setRss(long j) {
            this.f42677f = Long.valueOf(j);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo.Builder
        public CrashlyticsReport.ApplicationExitInfo.Builder setTimestamp(long j) {
            this.f42678g = Long.valueOf(j);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo.Builder
        public CrashlyticsReport.ApplicationExitInfo.Builder setTraceFile(@Nullable String str) {
            this.f42679h = str;
            return this;
        }
    }

    public boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CrashlyticsReport.ApplicationExitInfo)) {
            return false;
        }
        CrashlyticsReport.ApplicationExitInfo applicationExitInfo = (CrashlyticsReport.ApplicationExitInfo) obj;
        if (this.f42663a == applicationExitInfo.getPid() && this.f42664b.equals(applicationExitInfo.getProcessName()) && this.f42665c == applicationExitInfo.getReasonCode() && this.f42666d == applicationExitInfo.getImportance() && this.f42667e == applicationExitInfo.getPss() && this.f42668f == applicationExitInfo.getRss() && this.f42669g == applicationExitInfo.getTimestamp() && ((str = this.f42670h) != null ? str.equals(applicationExitInfo.getTraceFile()) : applicationExitInfo.getTraceFile() == null)) {
            List<CrashlyticsReport.ApplicationExitInfo.BuildIdMappingForArch> list = this.f42671i;
            if (list == null) {
                if (applicationExitInfo.getBuildIdMappingForArch() == null) {
                    return true;
                }
            } else if (list.equals(applicationExitInfo.getBuildIdMappingForArch())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo
    @Nullable
    public List<CrashlyticsReport.ApplicationExitInfo.BuildIdMappingForArch> getBuildIdMappingForArch() {
        return this.f42671i;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo
    @NonNull
    public int getImportance() {
        return this.f42666d;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo
    @NonNull
    public int getPid() {
        return this.f42663a;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo
    @NonNull
    public String getProcessName() {
        return this.f42664b;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo
    @NonNull
    public long getPss() {
        return this.f42667e;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo
    @NonNull
    public int getReasonCode() {
        return this.f42665c;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo
    @NonNull
    public long getRss() {
        return this.f42668f;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo
    @NonNull
    public long getTimestamp() {
        return this.f42669g;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo
    @Nullable
    public String getTraceFile() {
        return this.f42670h;
    }

    public int hashCode() {
        int hashCode;
        long j = this.f42667e;
        long j2 = this.f42668f;
        long j3 = this.f42669g;
        int hashCode2 = (((((((((((((this.f42663a ^ 1000003) * 1000003) ^ this.f42664b.hashCode()) * 1000003) ^ this.f42665c) * 1000003) ^ this.f42666d) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003;
        String str = this.f42670h;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = (hashCode2 ^ hashCode) * 1000003;
        List<CrashlyticsReport.ApplicationExitInfo.BuildIdMappingForArch> list = this.f42671i;
        if (list != null) {
            i = list.hashCode();
        }
        return i2 ^ i;
    }

    public String toString() {
        return "ApplicationExitInfo{pid=" + this.f42663a + ", processName=" + this.f42664b + ", reasonCode=" + this.f42665c + ", importance=" + this.f42666d + ", pss=" + this.f42667e + ", rss=" + this.f42668f + ", timestamp=" + this.f42669g + ", traceFile=" + this.f42670h + ", buildIdMappingForArch=" + this.f42671i + "}";
    }

    private AutoValue_CrashlyticsReport_ApplicationExitInfo(int i, String str, int i2, int i3, long j, long j2, long j3, @Nullable String str2, @Nullable List<CrashlyticsReport.ApplicationExitInfo.BuildIdMappingForArch> list) {
        this.f42663a = i;
        this.f42664b = str;
        this.f42665c = i2;
        this.f42666d = i3;
        this.f42667e = j;
        this.f42668f = j2;
        this.f42669g = j3;
        this.f42670h = str2;
        this.f42671i = list;
    }
}
