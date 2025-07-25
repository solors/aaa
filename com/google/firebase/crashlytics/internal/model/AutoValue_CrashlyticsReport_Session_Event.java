package com.google.firebase.crashlytics.internal.model;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;

/* loaded from: classes4.dex */
final class AutoValue_CrashlyticsReport_Session_Event extends CrashlyticsReport.Session.Event {

    /* renamed from: a */
    private final long f42757a;

    /* renamed from: b */
    private final String f42758b;

    /* renamed from: c */
    private final CrashlyticsReport.Session.Event.Application f42759c;

    /* renamed from: d */
    private final CrashlyticsReport.Session.Event.Device f42760d;

    /* renamed from: e */
    private final CrashlyticsReport.Session.Event.Log f42761e;

    /* renamed from: f */
    private final CrashlyticsReport.Session.Event.RolloutsState f42762f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class Builder extends CrashlyticsReport.Session.Event.Builder {

        /* renamed from: a */
        private Long f42763a;

        /* renamed from: b */
        private String f42764b;

        /* renamed from: c */
        private CrashlyticsReport.Session.Event.Application f42765c;

        /* renamed from: d */
        private CrashlyticsReport.Session.Event.Device f42766d;

        /* renamed from: e */
        private CrashlyticsReport.Session.Event.Log f42767e;

        /* renamed from: f */
        private CrashlyticsReport.Session.Event.RolloutsState f42768f;

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Builder
        public CrashlyticsReport.Session.Event build() {
            String str = "";
            if (this.f42763a == null) {
                str = " timestamp";
            }
            if (this.f42764b == null) {
                str = str + " type";
            }
            if (this.f42765c == null) {
                str = str + " app";
            }
            if (this.f42766d == null) {
                str = str + " device";
            }
            if (str.isEmpty()) {
                return new AutoValue_CrashlyticsReport_Session_Event(this.f42763a.longValue(), this.f42764b, this.f42765c, this.f42766d, this.f42767e, this.f42768f);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Builder
        public CrashlyticsReport.Session.Event.Builder setApp(CrashlyticsReport.Session.Event.Application application) {
            if (application != null) {
                this.f42765c = application;
                return this;
            }
            throw new NullPointerException("Null app");
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Builder
        public CrashlyticsReport.Session.Event.Builder setDevice(CrashlyticsReport.Session.Event.Device device) {
            if (device != null) {
                this.f42766d = device;
                return this;
            }
            throw new NullPointerException("Null device");
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Builder
        public CrashlyticsReport.Session.Event.Builder setLog(CrashlyticsReport.Session.Event.Log log) {
            this.f42767e = log;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Builder
        public CrashlyticsReport.Session.Event.Builder setRollouts(CrashlyticsReport.Session.Event.RolloutsState rolloutsState) {
            this.f42768f = rolloutsState;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Builder
        public CrashlyticsReport.Session.Event.Builder setTimestamp(long j) {
            this.f42763a = Long.valueOf(j);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Builder
        public CrashlyticsReport.Session.Event.Builder setType(String str) {
            if (str != null) {
                this.f42764b = str;
                return this;
            }
            throw new NullPointerException("Null type");
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public Builder() {
        }

        private Builder(CrashlyticsReport.Session.Event event) {
            this.f42763a = Long.valueOf(event.getTimestamp());
            this.f42764b = event.getType();
            this.f42765c = event.getApp();
            this.f42766d = event.getDevice();
            this.f42767e = event.getLog();
            this.f42768f = event.getRollouts();
        }
    }

    public boolean equals(Object obj) {
        CrashlyticsReport.Session.Event.Log log;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CrashlyticsReport.Session.Event)) {
            return false;
        }
        CrashlyticsReport.Session.Event event = (CrashlyticsReport.Session.Event) obj;
        if (this.f42757a == event.getTimestamp() && this.f42758b.equals(event.getType()) && this.f42759c.equals(event.getApp()) && this.f42760d.equals(event.getDevice()) && ((log = this.f42761e) != null ? log.equals(event.getLog()) : event.getLog() == null)) {
            CrashlyticsReport.Session.Event.RolloutsState rolloutsState = this.f42762f;
            if (rolloutsState == null) {
                if (event.getRollouts() == null) {
                    return true;
                }
            } else if (rolloutsState.equals(event.getRollouts())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event
    @NonNull
    public CrashlyticsReport.Session.Event.Application getApp() {
        return this.f42759c;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event
    @NonNull
    public CrashlyticsReport.Session.Event.Device getDevice() {
        return this.f42760d;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event
    @Nullable
    public CrashlyticsReport.Session.Event.Log getLog() {
        return this.f42761e;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event
    @Nullable
    public CrashlyticsReport.Session.Event.RolloutsState getRollouts() {
        return this.f42762f;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event
    public long getTimestamp() {
        return this.f42757a;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event
    @NonNull
    public String getType() {
        return this.f42758b;
    }

    public int hashCode() {
        int hashCode;
        long j = this.f42757a;
        int hashCode2 = (((((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.f42758b.hashCode()) * 1000003) ^ this.f42759c.hashCode()) * 1000003) ^ this.f42760d.hashCode()) * 1000003;
        CrashlyticsReport.Session.Event.Log log = this.f42761e;
        int i = 0;
        if (log == null) {
            hashCode = 0;
        } else {
            hashCode = log.hashCode();
        }
        int i2 = (hashCode2 ^ hashCode) * 1000003;
        CrashlyticsReport.Session.Event.RolloutsState rolloutsState = this.f42762f;
        if (rolloutsState != null) {
            i = rolloutsState.hashCode();
        }
        return i2 ^ i;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event
    public CrashlyticsReport.Session.Event.Builder toBuilder() {
        return new Builder(this);
    }

    public String toString() {
        return "Event{timestamp=" + this.f42757a + ", type=" + this.f42758b + ", app=" + this.f42759c + ", device=" + this.f42760d + ", log=" + this.f42761e + ", rollouts=" + this.f42762f + "}";
    }

    private AutoValue_CrashlyticsReport_Session_Event(long j, String str, CrashlyticsReport.Session.Event.Application application, CrashlyticsReport.Session.Event.Device device, @Nullable CrashlyticsReport.Session.Event.Log log, @Nullable CrashlyticsReport.Session.Event.RolloutsState rolloutsState) {
        this.f42757a = j;
        this.f42758b = str;
        this.f42759c = application;
        this.f42760d = device;
        this.f42761e = log;
        this.f42762f = rolloutsState;
    }
}
