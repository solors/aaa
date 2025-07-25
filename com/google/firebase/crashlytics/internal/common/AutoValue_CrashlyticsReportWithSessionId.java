package com.google.firebase.crashlytics.internal.common;

import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import java.io.File;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class AutoValue_CrashlyticsReportWithSessionId extends CrashlyticsReportWithSessionId {

    /* renamed from: a */
    private final CrashlyticsReport f42286a;

    /* renamed from: b */
    private final String f42287b;

    /* renamed from: c */
    private final File f42288c;

    public AutoValue_CrashlyticsReportWithSessionId(CrashlyticsReport crashlyticsReport, String str, File file) {
        if (crashlyticsReport != null) {
            this.f42286a = crashlyticsReport;
            if (str != null) {
                this.f42287b = str;
                if (file != null) {
                    this.f42288c = file;
                    return;
                }
                throw new NullPointerException("Null reportFile");
            }
            throw new NullPointerException("Null sessionId");
        }
        throw new NullPointerException("Null report");
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CrashlyticsReportWithSessionId)) {
            return false;
        }
        CrashlyticsReportWithSessionId crashlyticsReportWithSessionId = (CrashlyticsReportWithSessionId) obj;
        if (this.f42286a.equals(crashlyticsReportWithSessionId.getReport()) && this.f42287b.equals(crashlyticsReportWithSessionId.getSessionId()) && this.f42288c.equals(crashlyticsReportWithSessionId.getReportFile())) {
            return true;
        }
        return false;
    }

    @Override // com.google.firebase.crashlytics.internal.common.CrashlyticsReportWithSessionId
    public CrashlyticsReport getReport() {
        return this.f42286a;
    }

    @Override // com.google.firebase.crashlytics.internal.common.CrashlyticsReportWithSessionId
    public File getReportFile() {
        return this.f42288c;
    }

    @Override // com.google.firebase.crashlytics.internal.common.CrashlyticsReportWithSessionId
    public String getSessionId() {
        return this.f42287b;
    }

    public int hashCode() {
        return ((((this.f42286a.hashCode() ^ 1000003) * 1000003) ^ this.f42287b.hashCode()) * 1000003) ^ this.f42288c.hashCode();
    }

    public String toString() {
        return "CrashlyticsReportWithSessionId{report=" + this.f42286a + ", sessionId=" + this.f42287b + ", reportFile=" + this.f42288c + "}";
    }
}
