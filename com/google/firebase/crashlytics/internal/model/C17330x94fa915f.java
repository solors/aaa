package com.google.firebase.crashlytics.internal.model;

import androidx.annotation.NonNull;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;

/* renamed from: com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_Session_Event_Application_ProcessDetails */
/* loaded from: classes4.dex */
final class C17330x94fa915f extends CrashlyticsReport.Session.Event.Application.ProcessDetails {

    /* renamed from: a */
    private final String f42833a;

    /* renamed from: b */
    private final int f42834b;

    /* renamed from: c */
    private final int f42835c;

    /* renamed from: d */
    private final boolean f42836d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_Session_Event_Application_ProcessDetails$Builder */
    /* loaded from: classes4.dex */
    public static final class Builder extends CrashlyticsReport.Session.Event.Application.ProcessDetails.Builder {

        /* renamed from: a */
        private String f42837a;

        /* renamed from: b */
        private Integer f42838b;

        /* renamed from: c */
        private Integer f42839c;

        /* renamed from: d */
        private Boolean f42840d;

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.ProcessDetails.Builder
        public CrashlyticsReport.Session.Event.Application.ProcessDetails build() {
            String str = "";
            if (this.f42837a == null) {
                str = " processName";
            }
            if (this.f42838b == null) {
                str = str + " pid";
            }
            if (this.f42839c == null) {
                str = str + " importance";
            }
            if (this.f42840d == null) {
                str = str + " defaultProcess";
            }
            if (str.isEmpty()) {
                return new C17330x94fa915f(this.f42837a, this.f42838b.intValue(), this.f42839c.intValue(), this.f42840d.booleanValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.ProcessDetails.Builder
        public CrashlyticsReport.Session.Event.Application.ProcessDetails.Builder setDefaultProcess(boolean z) {
            this.f42840d = Boolean.valueOf(z);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.ProcessDetails.Builder
        public CrashlyticsReport.Session.Event.Application.ProcessDetails.Builder setImportance(int i) {
            this.f42839c = Integer.valueOf(i);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.ProcessDetails.Builder
        public CrashlyticsReport.Session.Event.Application.ProcessDetails.Builder setPid(int i) {
            this.f42838b = Integer.valueOf(i);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.ProcessDetails.Builder
        public CrashlyticsReport.Session.Event.Application.ProcessDetails.Builder setProcessName(String str) {
            if (str != null) {
                this.f42837a = str;
                return this;
            }
            throw new NullPointerException("Null processName");
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CrashlyticsReport.Session.Event.Application.ProcessDetails)) {
            return false;
        }
        CrashlyticsReport.Session.Event.Application.ProcessDetails processDetails = (CrashlyticsReport.Session.Event.Application.ProcessDetails) obj;
        if (this.f42833a.equals(processDetails.getProcessName()) && this.f42834b == processDetails.getPid() && this.f42835c == processDetails.getImportance() && this.f42836d == processDetails.isDefaultProcess()) {
            return true;
        }
        return false;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.ProcessDetails
    public int getImportance() {
        return this.f42835c;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.ProcessDetails
    public int getPid() {
        return this.f42834b;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.ProcessDetails
    @NonNull
    public String getProcessName() {
        return this.f42833a;
    }

    public int hashCode() {
        int i;
        int hashCode = (((((this.f42833a.hashCode() ^ 1000003) * 1000003) ^ this.f42834b) * 1000003) ^ this.f42835c) * 1000003;
        if (this.f42836d) {
            i = 1231;
        } else {
            i = 1237;
        }
        return hashCode ^ i;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.ProcessDetails
    public boolean isDefaultProcess() {
        return this.f42836d;
    }

    public String toString() {
        return "ProcessDetails{processName=" + this.f42833a + ", pid=" + this.f42834b + ", importance=" + this.f42835c + ", defaultProcess=" + this.f42836d + "}";
    }

    private C17330x94fa915f(String str, int i, int i2, boolean z) {
        this.f42833a = str;
        this.f42834b = i;
        this.f42835c = i2;
        this.f42836d = z;
    }
}
