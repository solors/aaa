package com.google.firebase.crashlytics.internal.model;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;

/* renamed from: com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Thread_Frame */
/* loaded from: classes4.dex */
final class C17328xce3d994b extends CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame {

    /* renamed from: a */
    private final long f42823a;

    /* renamed from: b */
    private final String f42824b;

    /* renamed from: c */
    private final String f42825c;

    /* renamed from: d */
    private final long f42826d;

    /* renamed from: e */
    private final int f42827e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Thread_Frame$Builder */
    /* loaded from: classes4.dex */
    public static final class Builder extends CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame.Builder {

        /* renamed from: a */
        private Long f42828a;

        /* renamed from: b */
        private String f42829b;

        /* renamed from: c */
        private String f42830c;

        /* renamed from: d */
        private Long f42831d;

        /* renamed from: e */
        private Integer f42832e;

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame.Builder
        public CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame build() {
            String str = "";
            if (this.f42828a == null) {
                str = " pc";
            }
            if (this.f42829b == null) {
                str = str + " symbol";
            }
            if (this.f42831d == null) {
                str = str + " offset";
            }
            if (this.f42832e == null) {
                str = str + " importance";
            }
            if (str.isEmpty()) {
                return new C17328xce3d994b(this.f42828a.longValue(), this.f42829b, this.f42830c, this.f42831d.longValue(), this.f42832e.intValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame.Builder
        public CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame.Builder setFile(String str) {
            this.f42830c = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame.Builder
        public CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame.Builder setImportance(int i) {
            this.f42832e = Integer.valueOf(i);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame.Builder
        public CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame.Builder setOffset(long j) {
            this.f42831d = Long.valueOf(j);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame.Builder
        public CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame.Builder setPc(long j) {
            this.f42828a = Long.valueOf(j);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame.Builder
        public CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame.Builder setSymbol(String str) {
            if (str != null) {
                this.f42829b = str;
                return this;
            }
            throw new NullPointerException("Null symbol");
        }
    }

    public boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame)) {
            return false;
        }
        CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame frame = (CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame) obj;
        if (this.f42823a == frame.getPc() && this.f42824b.equals(frame.getSymbol()) && ((str = this.f42825c) != null ? str.equals(frame.getFile()) : frame.getFile() == null) && this.f42826d == frame.getOffset() && this.f42827e == frame.getImportance()) {
            return true;
        }
        return false;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame
    @Nullable
    public String getFile() {
        return this.f42825c;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame
    public int getImportance() {
        return this.f42827e;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame
    public long getOffset() {
        return this.f42826d;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame
    public long getPc() {
        return this.f42823a;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame
    @NonNull
    public String getSymbol() {
        return this.f42824b;
    }

    public int hashCode() {
        int hashCode;
        long j = this.f42823a;
        int hashCode2 = (((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.f42824b.hashCode()) * 1000003;
        String str = this.f42825c;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        long j2 = this.f42826d;
        return ((((hashCode2 ^ hashCode) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003) ^ this.f42827e;
    }

    public String toString() {
        return "Frame{pc=" + this.f42823a + ", symbol=" + this.f42824b + ", file=" + this.f42825c + ", offset=" + this.f42826d + ", importance=" + this.f42827e + "}";
    }

    private C17328xce3d994b(long j, String str, @Nullable String str2, long j2, int i) {
        this.f42823a = j;
        this.f42824b = str;
        this.f42825c = str2;
        this.f42826d = j2;
        this.f42827e = i;
    }
}
