package com.google.firebase.crashlytics.internal.model;

import androidx.annotation.NonNull;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;

/* renamed from: com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Signal */
/* loaded from: classes4.dex */
final class C17324x7c929f5b extends CrashlyticsReport.Session.Event.Application.Execution.Signal {

    /* renamed from: a */
    private final String f42811a;

    /* renamed from: b */
    private final String f42812b;

    /* renamed from: c */
    private final long f42813c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Signal$Builder */
    /* loaded from: classes4.dex */
    public static final class Builder extends CrashlyticsReport.Session.Event.Application.Execution.Signal.Builder {

        /* renamed from: a */
        private String f42814a;

        /* renamed from: b */
        private String f42815b;

        /* renamed from: c */
        private Long f42816c;

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Signal.Builder
        public CrashlyticsReport.Session.Event.Application.Execution.Signal build() {
            String str = "";
            if (this.f42814a == null) {
                str = " name";
            }
            if (this.f42815b == null) {
                str = str + " code";
            }
            if (this.f42816c == null) {
                str = str + " address";
            }
            if (str.isEmpty()) {
                return new C17324x7c929f5b(this.f42814a, this.f42815b, this.f42816c.longValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Signal.Builder
        public CrashlyticsReport.Session.Event.Application.Execution.Signal.Builder setAddress(long j) {
            this.f42816c = Long.valueOf(j);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Signal.Builder
        public CrashlyticsReport.Session.Event.Application.Execution.Signal.Builder setCode(String str) {
            if (str != null) {
                this.f42815b = str;
                return this;
            }
            throw new NullPointerException("Null code");
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Signal.Builder
        public CrashlyticsReport.Session.Event.Application.Execution.Signal.Builder setName(String str) {
            if (str != null) {
                this.f42814a = str;
                return this;
            }
            throw new NullPointerException("Null name");
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CrashlyticsReport.Session.Event.Application.Execution.Signal)) {
            return false;
        }
        CrashlyticsReport.Session.Event.Application.Execution.Signal signal = (CrashlyticsReport.Session.Event.Application.Execution.Signal) obj;
        if (this.f42811a.equals(signal.getName()) && this.f42812b.equals(signal.getCode()) && this.f42813c == signal.getAddress()) {
            return true;
        }
        return false;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Signal
    @NonNull
    public long getAddress() {
        return this.f42813c;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Signal
    @NonNull
    public String getCode() {
        return this.f42812b;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Signal
    @NonNull
    public String getName() {
        return this.f42811a;
    }

    public int hashCode() {
        long j = this.f42813c;
        return ((((this.f42811a.hashCode() ^ 1000003) * 1000003) ^ this.f42812b.hashCode()) * 1000003) ^ ((int) (j ^ (j >>> 32)));
    }

    public String toString() {
        return "Signal{name=" + this.f42811a + ", code=" + this.f42812b + ", address=" + this.f42813c + "}";
    }

    private C17324x7c929f5b(String str, String str2, long j) {
        this.f42811a = str;
        this.f42812b = str2;
        this.f42813c = j;
    }
}
