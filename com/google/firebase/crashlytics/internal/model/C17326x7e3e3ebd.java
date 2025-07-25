package com.google.firebase.crashlytics.internal.model;

import androidx.annotation.NonNull;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import java.util.List;

/* renamed from: com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Thread */
/* loaded from: classes4.dex */
final class C17326x7e3e3ebd extends CrashlyticsReport.Session.Event.Application.Execution.Thread {

    /* renamed from: a */
    private final String f42817a;

    /* renamed from: b */
    private final int f42818b;

    /* renamed from: c */
    private final List<CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame> f42819c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Thread$Builder */
    /* loaded from: classes4.dex */
    public static final class Builder extends CrashlyticsReport.Session.Event.Application.Execution.Thread.Builder {

        /* renamed from: a */
        private String f42820a;

        /* renamed from: b */
        private Integer f42821b;

        /* renamed from: c */
        private List<CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame> f42822c;

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Thread.Builder
        public CrashlyticsReport.Session.Event.Application.Execution.Thread build() {
            String str = "";
            if (this.f42820a == null) {
                str = " name";
            }
            if (this.f42821b == null) {
                str = str + " importance";
            }
            if (this.f42822c == null) {
                str = str + " frames";
            }
            if (str.isEmpty()) {
                return new C17326x7e3e3ebd(this.f42820a, this.f42821b.intValue(), this.f42822c);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Thread.Builder
        public CrashlyticsReport.Session.Event.Application.Execution.Thread.Builder setFrames(List<CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame> list) {
            if (list != null) {
                this.f42822c = list;
                return this;
            }
            throw new NullPointerException("Null frames");
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Thread.Builder
        public CrashlyticsReport.Session.Event.Application.Execution.Thread.Builder setImportance(int i) {
            this.f42821b = Integer.valueOf(i);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Thread.Builder
        public CrashlyticsReport.Session.Event.Application.Execution.Thread.Builder setName(String str) {
            if (str != null) {
                this.f42820a = str;
                return this;
            }
            throw new NullPointerException("Null name");
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CrashlyticsReport.Session.Event.Application.Execution.Thread)) {
            return false;
        }
        CrashlyticsReport.Session.Event.Application.Execution.Thread thread = (CrashlyticsReport.Session.Event.Application.Execution.Thread) obj;
        if (this.f42817a.equals(thread.getName()) && this.f42818b == thread.getImportance() && this.f42819c.equals(thread.getFrames())) {
            return true;
        }
        return false;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Thread
    @NonNull
    public List<CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame> getFrames() {
        return this.f42819c;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Thread
    public int getImportance() {
        return this.f42818b;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Thread
    @NonNull
    public String getName() {
        return this.f42817a;
    }

    public int hashCode() {
        return ((((this.f42817a.hashCode() ^ 1000003) * 1000003) ^ this.f42818b) * 1000003) ^ this.f42819c.hashCode();
    }

    public String toString() {
        return "Thread{name=" + this.f42817a + ", importance=" + this.f42818b + ", frames=" + this.f42819c + "}";
    }

    private C17326x7e3e3ebd(String str, int i, List<CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame> list) {
        this.f42817a = str;
        this.f42818b = i;
        this.f42819c = list;
    }
}
