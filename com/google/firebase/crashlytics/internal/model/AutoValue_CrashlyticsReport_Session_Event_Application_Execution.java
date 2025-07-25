package com.google.firebase.crashlytics.internal.model;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import java.util.List;

/* loaded from: classes4.dex */
final class AutoValue_CrashlyticsReport_Session_Event_Application_Execution extends CrashlyticsReport.Session.Event.Application.Execution {

    /* renamed from: a */
    private final List<CrashlyticsReport.Session.Event.Application.Execution.Thread> f42783a;

    /* renamed from: b */
    private final CrashlyticsReport.Session.Event.Application.Execution.Exception f42784b;

    /* renamed from: c */
    private final CrashlyticsReport.ApplicationExitInfo f42785c;

    /* renamed from: d */
    private final CrashlyticsReport.Session.Event.Application.Execution.Signal f42786d;

    /* renamed from: e */
    private final List<CrashlyticsReport.Session.Event.Application.Execution.BinaryImage> f42787e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class Builder extends CrashlyticsReport.Session.Event.Application.Execution.Builder {

        /* renamed from: a */
        private List<CrashlyticsReport.Session.Event.Application.Execution.Thread> f42788a;

        /* renamed from: b */
        private CrashlyticsReport.Session.Event.Application.Execution.Exception f42789b;

        /* renamed from: c */
        private CrashlyticsReport.ApplicationExitInfo f42790c;

        /* renamed from: d */
        private CrashlyticsReport.Session.Event.Application.Execution.Signal f42791d;

        /* renamed from: e */
        private List<CrashlyticsReport.Session.Event.Application.Execution.BinaryImage> f42792e;

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Builder
        public CrashlyticsReport.Session.Event.Application.Execution build() {
            String str = "";
            if (this.f42791d == null) {
                str = " signal";
            }
            if (this.f42792e == null) {
                str = str + " binaries";
            }
            if (str.isEmpty()) {
                return new AutoValue_CrashlyticsReport_Session_Event_Application_Execution(this.f42788a, this.f42789b, this.f42790c, this.f42791d, this.f42792e);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Builder
        public CrashlyticsReport.Session.Event.Application.Execution.Builder setAppExitInfo(CrashlyticsReport.ApplicationExitInfo applicationExitInfo) {
            this.f42790c = applicationExitInfo;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Builder
        public CrashlyticsReport.Session.Event.Application.Execution.Builder setBinaries(List<CrashlyticsReport.Session.Event.Application.Execution.BinaryImage> list) {
            if (list != null) {
                this.f42792e = list;
                return this;
            }
            throw new NullPointerException("Null binaries");
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Builder
        public CrashlyticsReport.Session.Event.Application.Execution.Builder setException(CrashlyticsReport.Session.Event.Application.Execution.Exception exception) {
            this.f42789b = exception;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Builder
        public CrashlyticsReport.Session.Event.Application.Execution.Builder setSignal(CrashlyticsReport.Session.Event.Application.Execution.Signal signal) {
            if (signal != null) {
                this.f42791d = signal;
                return this;
            }
            throw new NullPointerException("Null signal");
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Builder
        public CrashlyticsReport.Session.Event.Application.Execution.Builder setThreads(List<CrashlyticsReport.Session.Event.Application.Execution.Thread> list) {
            this.f42788a = list;
            return this;
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CrashlyticsReport.Session.Event.Application.Execution)) {
            return false;
        }
        CrashlyticsReport.Session.Event.Application.Execution execution = (CrashlyticsReport.Session.Event.Application.Execution) obj;
        List<CrashlyticsReport.Session.Event.Application.Execution.Thread> list = this.f42783a;
        if (list != null ? list.equals(execution.getThreads()) : execution.getThreads() == null) {
            CrashlyticsReport.Session.Event.Application.Execution.Exception exception = this.f42784b;
            if (exception != null ? exception.equals(execution.getException()) : execution.getException() == null) {
                CrashlyticsReport.ApplicationExitInfo applicationExitInfo = this.f42785c;
                if (applicationExitInfo != null ? applicationExitInfo.equals(execution.getAppExitInfo()) : execution.getAppExitInfo() == null) {
                    if (this.f42786d.equals(execution.getSignal()) && this.f42787e.equals(execution.getBinaries())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution
    @Nullable
    public CrashlyticsReport.ApplicationExitInfo getAppExitInfo() {
        return this.f42785c;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution
    @NonNull
    public List<CrashlyticsReport.Session.Event.Application.Execution.BinaryImage> getBinaries() {
        return this.f42787e;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution
    @Nullable
    public CrashlyticsReport.Session.Event.Application.Execution.Exception getException() {
        return this.f42784b;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution
    @NonNull
    public CrashlyticsReport.Session.Event.Application.Execution.Signal getSignal() {
        return this.f42786d;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution
    @Nullable
    public List<CrashlyticsReport.Session.Event.Application.Execution.Thread> getThreads() {
        return this.f42783a;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        List<CrashlyticsReport.Session.Event.Application.Execution.Thread> list = this.f42783a;
        int i = 0;
        if (list == null) {
            hashCode = 0;
        } else {
            hashCode = list.hashCode();
        }
        int i2 = (hashCode ^ 1000003) * 1000003;
        CrashlyticsReport.Session.Event.Application.Execution.Exception exception = this.f42784b;
        if (exception == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = exception.hashCode();
        }
        int i3 = (i2 ^ hashCode2) * 1000003;
        CrashlyticsReport.ApplicationExitInfo applicationExitInfo = this.f42785c;
        if (applicationExitInfo != null) {
            i = applicationExitInfo.hashCode();
        }
        return ((((i3 ^ i) * 1000003) ^ this.f42786d.hashCode()) * 1000003) ^ this.f42787e.hashCode();
    }

    public String toString() {
        return "Execution{threads=" + this.f42783a + ", exception=" + this.f42784b + ", appExitInfo=" + this.f42785c + ", signal=" + this.f42786d + ", binaries=" + this.f42787e + "}";
    }

    private AutoValue_CrashlyticsReport_Session_Event_Application_Execution(@Nullable List<CrashlyticsReport.Session.Event.Application.Execution.Thread> list, @Nullable CrashlyticsReport.Session.Event.Application.Execution.Exception exception, @Nullable CrashlyticsReport.ApplicationExitInfo applicationExitInfo, CrashlyticsReport.Session.Event.Application.Execution.Signal signal, List<CrashlyticsReport.Session.Event.Application.Execution.BinaryImage> list2) {
        this.f42783a = list;
        this.f42784b = exception;
        this.f42785c = applicationExitInfo;
        this.f42786d = signal;
        this.f42787e = list2;
    }
}
