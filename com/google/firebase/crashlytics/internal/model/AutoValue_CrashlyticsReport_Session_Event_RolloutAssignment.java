package com.google.firebase.crashlytics.internal.model;

import androidx.annotation.NonNull;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;

/* loaded from: classes4.dex */
final class AutoValue_CrashlyticsReport_Session_Event_RolloutAssignment extends CrashlyticsReport.Session.Event.RolloutAssignment {

    /* renamed from: a */
    private final CrashlyticsReport.Session.Event.RolloutAssignment.RolloutVariant f42855a;

    /* renamed from: b */
    private final String f42856b;

    /* renamed from: c */
    private final String f42857c;

    /* renamed from: d */
    private final long f42858d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class Builder extends CrashlyticsReport.Session.Event.RolloutAssignment.Builder {

        /* renamed from: a */
        private CrashlyticsReport.Session.Event.RolloutAssignment.RolloutVariant f42859a;

        /* renamed from: b */
        private String f42860b;

        /* renamed from: c */
        private String f42861c;

        /* renamed from: d */
        private Long f42862d;

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.RolloutAssignment.Builder
        public CrashlyticsReport.Session.Event.RolloutAssignment build() {
            String str = "";
            if (this.f42859a == null) {
                str = " rolloutVariant";
            }
            if (this.f42860b == null) {
                str = str + " parameterKey";
            }
            if (this.f42861c == null) {
                str = str + " parameterValue";
            }
            if (this.f42862d == null) {
                str = str + " templateVersion";
            }
            if (str.isEmpty()) {
                return new AutoValue_CrashlyticsReport_Session_Event_RolloutAssignment(this.f42859a, this.f42860b, this.f42861c, this.f42862d.longValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.RolloutAssignment.Builder
        public CrashlyticsReport.Session.Event.RolloutAssignment.Builder setParameterKey(String str) {
            if (str != null) {
                this.f42860b = str;
                return this;
            }
            throw new NullPointerException("Null parameterKey");
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.RolloutAssignment.Builder
        public CrashlyticsReport.Session.Event.RolloutAssignment.Builder setParameterValue(String str) {
            if (str != null) {
                this.f42861c = str;
                return this;
            }
            throw new NullPointerException("Null parameterValue");
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.RolloutAssignment.Builder
        public CrashlyticsReport.Session.Event.RolloutAssignment.Builder setRolloutVariant(CrashlyticsReport.Session.Event.RolloutAssignment.RolloutVariant rolloutVariant) {
            if (rolloutVariant != null) {
                this.f42859a = rolloutVariant;
                return this;
            }
            throw new NullPointerException("Null rolloutVariant");
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.RolloutAssignment.Builder
        public CrashlyticsReport.Session.Event.RolloutAssignment.Builder setTemplateVersion(long j) {
            this.f42862d = Long.valueOf(j);
            return this;
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CrashlyticsReport.Session.Event.RolloutAssignment)) {
            return false;
        }
        CrashlyticsReport.Session.Event.RolloutAssignment rolloutAssignment = (CrashlyticsReport.Session.Event.RolloutAssignment) obj;
        if (this.f42855a.equals(rolloutAssignment.getRolloutVariant()) && this.f42856b.equals(rolloutAssignment.getParameterKey()) && this.f42857c.equals(rolloutAssignment.getParameterValue()) && this.f42858d == rolloutAssignment.getTemplateVersion()) {
            return true;
        }
        return false;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.RolloutAssignment
    @NonNull
    public String getParameterKey() {
        return this.f42856b;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.RolloutAssignment
    @NonNull
    public String getParameterValue() {
        return this.f42857c;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.RolloutAssignment
    @NonNull
    public CrashlyticsReport.Session.Event.RolloutAssignment.RolloutVariant getRolloutVariant() {
        return this.f42855a;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.RolloutAssignment
    @NonNull
    public long getTemplateVersion() {
        return this.f42858d;
    }

    public int hashCode() {
        long j = this.f42858d;
        return ((((((this.f42855a.hashCode() ^ 1000003) * 1000003) ^ this.f42856b.hashCode()) * 1000003) ^ this.f42857c.hashCode()) * 1000003) ^ ((int) (j ^ (j >>> 32)));
    }

    public String toString() {
        return "RolloutAssignment{rolloutVariant=" + this.f42855a + ", parameterKey=" + this.f42856b + ", parameterValue=" + this.f42857c + ", templateVersion=" + this.f42858d + "}";
    }

    private AutoValue_CrashlyticsReport_Session_Event_RolloutAssignment(CrashlyticsReport.Session.Event.RolloutAssignment.RolloutVariant rolloutVariant, String str, String str2, long j) {
        this.f42855a = rolloutVariant;
        this.f42856b = str;
        this.f42857c = str2;
        this.f42858d = j;
    }
}
