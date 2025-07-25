package com.google.firebase.crashlytics.internal.model;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import java.util.List;

/* renamed from: com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Exception */
/* loaded from: classes4.dex */
final class C17322xc2f5febc extends CrashlyticsReport.Session.Event.Application.Execution.Exception {

    /* renamed from: a */
    private final String f42801a;

    /* renamed from: b */
    private final String f42802b;

    /* renamed from: c */
    private final List<CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame> f42803c;

    /* renamed from: d */
    private final CrashlyticsReport.Session.Event.Application.Execution.Exception f42804d;

    /* renamed from: e */
    private final int f42805e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Exception$Builder */
    /* loaded from: classes4.dex */
    public static final class Builder extends CrashlyticsReport.Session.Event.Application.Execution.Exception.Builder {

        /* renamed from: a */
        private String f42806a;

        /* renamed from: b */
        private String f42807b;

        /* renamed from: c */
        private List<CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame> f42808c;

        /* renamed from: d */
        private CrashlyticsReport.Session.Event.Application.Execution.Exception f42809d;

        /* renamed from: e */
        private Integer f42810e;

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Exception.Builder
        public CrashlyticsReport.Session.Event.Application.Execution.Exception build() {
            String str = "";
            if (this.f42806a == null) {
                str = " type";
            }
            if (this.f42808c == null) {
                str = str + " frames";
            }
            if (this.f42810e == null) {
                str = str + " overflowCount";
            }
            if (str.isEmpty()) {
                return new C17322xc2f5febc(this.f42806a, this.f42807b, this.f42808c, this.f42809d, this.f42810e.intValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Exception.Builder
        public CrashlyticsReport.Session.Event.Application.Execution.Exception.Builder setCausedBy(CrashlyticsReport.Session.Event.Application.Execution.Exception exception) {
            this.f42809d = exception;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Exception.Builder
        public CrashlyticsReport.Session.Event.Application.Execution.Exception.Builder setFrames(List<CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame> list) {
            if (list != null) {
                this.f42808c = list;
                return this;
            }
            throw new NullPointerException("Null frames");
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Exception.Builder
        public CrashlyticsReport.Session.Event.Application.Execution.Exception.Builder setOverflowCount(int i) {
            this.f42810e = Integer.valueOf(i);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Exception.Builder
        public CrashlyticsReport.Session.Event.Application.Execution.Exception.Builder setReason(String str) {
            this.f42807b = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Exception.Builder
        public CrashlyticsReport.Session.Event.Application.Execution.Exception.Builder setType(String str) {
            if (str != null) {
                this.f42806a = str;
                return this;
            }
            throw new NullPointerException("Null type");
        }
    }

    public boolean equals(Object obj) {
        String str;
        CrashlyticsReport.Session.Event.Application.Execution.Exception exception;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CrashlyticsReport.Session.Event.Application.Execution.Exception)) {
            return false;
        }
        CrashlyticsReport.Session.Event.Application.Execution.Exception exception2 = (CrashlyticsReport.Session.Event.Application.Execution.Exception) obj;
        if (this.f42801a.equals(exception2.getType()) && ((str = this.f42802b) != null ? str.equals(exception2.getReason()) : exception2.getReason() == null) && this.f42803c.equals(exception2.getFrames()) && ((exception = this.f42804d) != null ? exception.equals(exception2.getCausedBy()) : exception2.getCausedBy() == null) && this.f42805e == exception2.getOverflowCount()) {
            return true;
        }
        return false;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Exception
    @Nullable
    public CrashlyticsReport.Session.Event.Application.Execution.Exception getCausedBy() {
        return this.f42804d;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Exception
    @NonNull
    public List<CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame> getFrames() {
        return this.f42803c;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Exception
    public int getOverflowCount() {
        return this.f42805e;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Exception
    @Nullable
    public String getReason() {
        return this.f42802b;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Exception
    @NonNull
    public String getType() {
        return this.f42801a;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = (this.f42801a.hashCode() ^ 1000003) * 1000003;
        String str = this.f42802b;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int hashCode3 = (((hashCode2 ^ hashCode) * 1000003) ^ this.f42803c.hashCode()) * 1000003;
        CrashlyticsReport.Session.Event.Application.Execution.Exception exception = this.f42804d;
        if (exception != null) {
            i = exception.hashCode();
        }
        return ((hashCode3 ^ i) * 1000003) ^ this.f42805e;
    }

    public String toString() {
        return "Exception{type=" + this.f42801a + ", reason=" + this.f42802b + ", frames=" + this.f42803c + ", causedBy=" + this.f42804d + ", overflowCount=" + this.f42805e + "}";
    }

    private C17322xc2f5febc(String str, @Nullable String str2, List<CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame> list, @Nullable CrashlyticsReport.Session.Event.Application.Execution.Exception exception, int i) {
        this.f42801a = str;
        this.f42802b = str2;
        this.f42803c = list;
        this.f42804d = exception;
        this.f42805e = i;
    }
}
