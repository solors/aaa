package com.google.firebase.crashlytics.internal.model;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import com.google.firebase.encoders.annotations.Encodable;
import java.util.List;

/* loaded from: classes4.dex */
final class AutoValue_CrashlyticsReport_Session extends CrashlyticsReport.Session {

    /* renamed from: a */
    private final String f42699a;

    /* renamed from: b */
    private final String f42700b;

    /* renamed from: c */
    private final String f42701c;

    /* renamed from: d */
    private final long f42702d;

    /* renamed from: e */
    private final Long f42703e;

    /* renamed from: f */
    private final boolean f42704f;

    /* renamed from: g */
    private final CrashlyticsReport.Session.Application f42705g;

    /* renamed from: h */
    private final CrashlyticsReport.Session.User f42706h;

    /* renamed from: i */
    private final CrashlyticsReport.Session.OperatingSystem f42707i;

    /* renamed from: j */
    private final CrashlyticsReport.Session.Device f42708j;

    /* renamed from: k */
    private final List<CrashlyticsReport.Session.Event> f42709k;

    /* renamed from: l */
    private final int f42710l;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class Builder extends CrashlyticsReport.Session.Builder {

        /* renamed from: a */
        private String f42711a;

        /* renamed from: b */
        private String f42712b;

        /* renamed from: c */
        private String f42713c;

        /* renamed from: d */
        private Long f42714d;

        /* renamed from: e */
        private Long f42715e;

        /* renamed from: f */
        private Boolean f42716f;

        /* renamed from: g */
        private CrashlyticsReport.Session.Application f42717g;

        /* renamed from: h */
        private CrashlyticsReport.Session.User f42718h;

        /* renamed from: i */
        private CrashlyticsReport.Session.OperatingSystem f42719i;

        /* renamed from: j */
        private CrashlyticsReport.Session.Device f42720j;

        /* renamed from: k */
        private List<CrashlyticsReport.Session.Event> f42721k;

        /* renamed from: l */
        private Integer f42722l;

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Builder
        public CrashlyticsReport.Session build() {
            String str = "";
            if (this.f42711a == null) {
                str = " generator";
            }
            if (this.f42712b == null) {
                str = str + " identifier";
            }
            if (this.f42714d == null) {
                str = str + " startedAt";
            }
            if (this.f42716f == null) {
                str = str + " crashed";
            }
            if (this.f42717g == null) {
                str = str + " app";
            }
            if (this.f42722l == null) {
                str = str + " generatorType";
            }
            if (str.isEmpty()) {
                return new AutoValue_CrashlyticsReport_Session(this.f42711a, this.f42712b, this.f42713c, this.f42714d.longValue(), this.f42715e, this.f42716f.booleanValue(), this.f42717g, this.f42718h, this.f42719i, this.f42720j, this.f42721k, this.f42722l.intValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Builder
        public CrashlyticsReport.Session.Builder setApp(CrashlyticsReport.Session.Application application) {
            if (application != null) {
                this.f42717g = application;
                return this;
            }
            throw new NullPointerException("Null app");
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Builder
        public CrashlyticsReport.Session.Builder setAppQualitySessionId(@Nullable String str) {
            this.f42713c = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Builder
        public CrashlyticsReport.Session.Builder setCrashed(boolean z) {
            this.f42716f = Boolean.valueOf(z);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Builder
        public CrashlyticsReport.Session.Builder setDevice(CrashlyticsReport.Session.Device device) {
            this.f42720j = device;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Builder
        public CrashlyticsReport.Session.Builder setEndedAt(Long l) {
            this.f42715e = l;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Builder
        public CrashlyticsReport.Session.Builder setEvents(List<CrashlyticsReport.Session.Event> list) {
            this.f42721k = list;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Builder
        public CrashlyticsReport.Session.Builder setGenerator(String str) {
            if (str != null) {
                this.f42711a = str;
                return this;
            }
            throw new NullPointerException("Null generator");
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Builder
        public CrashlyticsReport.Session.Builder setGeneratorType(int i) {
            this.f42722l = Integer.valueOf(i);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Builder
        public CrashlyticsReport.Session.Builder setIdentifier(String str) {
            if (str != null) {
                this.f42712b = str;
                return this;
            }
            throw new NullPointerException("Null identifier");
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Builder
        public CrashlyticsReport.Session.Builder setOs(CrashlyticsReport.Session.OperatingSystem operatingSystem) {
            this.f42719i = operatingSystem;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Builder
        public CrashlyticsReport.Session.Builder setStartedAt(long j) {
            this.f42714d = Long.valueOf(j);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Builder
        public CrashlyticsReport.Session.Builder setUser(CrashlyticsReport.Session.User user) {
            this.f42718h = user;
            return this;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public Builder() {
        }

        private Builder(CrashlyticsReport.Session session) {
            this.f42711a = session.getGenerator();
            this.f42712b = session.getIdentifier();
            this.f42713c = session.getAppQualitySessionId();
            this.f42714d = Long.valueOf(session.getStartedAt());
            this.f42715e = session.getEndedAt();
            this.f42716f = Boolean.valueOf(session.isCrashed());
            this.f42717g = session.getApp();
            this.f42718h = session.getUser();
            this.f42719i = session.getOs();
            this.f42720j = session.getDevice();
            this.f42721k = session.getEvents();
            this.f42722l = Integer.valueOf(session.getGeneratorType());
        }
    }

    public boolean equals(Object obj) {
        String str;
        Long l;
        CrashlyticsReport.Session.User user;
        CrashlyticsReport.Session.OperatingSystem operatingSystem;
        CrashlyticsReport.Session.Device device;
        List<CrashlyticsReport.Session.Event> list;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CrashlyticsReport.Session)) {
            return false;
        }
        CrashlyticsReport.Session session = (CrashlyticsReport.Session) obj;
        if (this.f42699a.equals(session.getGenerator()) && this.f42700b.equals(session.getIdentifier()) && ((str = this.f42701c) != null ? str.equals(session.getAppQualitySessionId()) : session.getAppQualitySessionId() == null) && this.f42702d == session.getStartedAt() && ((l = this.f42703e) != null ? l.equals(session.getEndedAt()) : session.getEndedAt() == null) && this.f42704f == session.isCrashed() && this.f42705g.equals(session.getApp()) && ((user = this.f42706h) != null ? user.equals(session.getUser()) : session.getUser() == null) && ((operatingSystem = this.f42707i) != null ? operatingSystem.equals(session.getOs()) : session.getOs() == null) && ((device = this.f42708j) != null ? device.equals(session.getDevice()) : session.getDevice() == null) && ((list = this.f42709k) != null ? list.equals(session.getEvents()) : session.getEvents() == null) && this.f42710l == session.getGeneratorType()) {
            return true;
        }
        return false;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session
    @NonNull
    public CrashlyticsReport.Session.Application getApp() {
        return this.f42705g;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session
    @Nullable
    public String getAppQualitySessionId() {
        return this.f42701c;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session
    @Nullable
    public CrashlyticsReport.Session.Device getDevice() {
        return this.f42708j;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session
    @Nullable
    public Long getEndedAt() {
        return this.f42703e;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session
    @Nullable
    public List<CrashlyticsReport.Session.Event> getEvents() {
        return this.f42709k;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session
    @NonNull
    public String getGenerator() {
        return this.f42699a;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session
    public int getGeneratorType() {
        return this.f42710l;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session
    @NonNull
    @Encodable.Ignore
    public String getIdentifier() {
        return this.f42700b;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session
    @Nullable
    public CrashlyticsReport.Session.OperatingSystem getOs() {
        return this.f42707i;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session
    public long getStartedAt() {
        return this.f42702d;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session
    @Nullable
    public CrashlyticsReport.Session.User getUser() {
        return this.f42706h;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int i;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int hashCode6 = (((this.f42699a.hashCode() ^ 1000003) * 1000003) ^ this.f42700b.hashCode()) * 1000003;
        String str = this.f42701c;
        int i2 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        long j = this.f42702d;
        int i3 = (((hashCode6 ^ hashCode) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        Long l = this.f42703e;
        if (l == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = l.hashCode();
        }
        int i4 = (i3 ^ hashCode2) * 1000003;
        if (this.f42704f) {
            i = 1231;
        } else {
            i = 1237;
        }
        int hashCode7 = (((i4 ^ i) * 1000003) ^ this.f42705g.hashCode()) * 1000003;
        CrashlyticsReport.Session.User user = this.f42706h;
        if (user == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = user.hashCode();
        }
        int i5 = (hashCode7 ^ hashCode3) * 1000003;
        CrashlyticsReport.Session.OperatingSystem operatingSystem = this.f42707i;
        if (operatingSystem == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = operatingSystem.hashCode();
        }
        int i6 = (i5 ^ hashCode4) * 1000003;
        CrashlyticsReport.Session.Device device = this.f42708j;
        if (device == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = device.hashCode();
        }
        int i7 = (i6 ^ hashCode5) * 1000003;
        List<CrashlyticsReport.Session.Event> list = this.f42709k;
        if (list != null) {
            i2 = list.hashCode();
        }
        return ((i7 ^ i2) * 1000003) ^ this.f42710l;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session
    public boolean isCrashed() {
        return this.f42704f;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session
    public CrashlyticsReport.Session.Builder toBuilder() {
        return new Builder(this);
    }

    public String toString() {
        return "Session{generator=" + this.f42699a + ", identifier=" + this.f42700b + ", appQualitySessionId=" + this.f42701c + ", startedAt=" + this.f42702d + ", endedAt=" + this.f42703e + ", crashed=" + this.f42704f + ", app=" + this.f42705g + ", user=" + this.f42706h + ", os=" + this.f42707i + ", device=" + this.f42708j + ", events=" + this.f42709k + ", generatorType=" + this.f42710l + "}";
    }

    private AutoValue_CrashlyticsReport_Session(String str, String str2, @Nullable String str3, long j, @Nullable Long l, boolean z, CrashlyticsReport.Session.Application application, @Nullable CrashlyticsReport.Session.User user, @Nullable CrashlyticsReport.Session.OperatingSystem operatingSystem, @Nullable CrashlyticsReport.Session.Device device, @Nullable List<CrashlyticsReport.Session.Event> list, int i) {
        this.f42699a = str;
        this.f42700b = str2;
        this.f42701c = str3;
        this.f42702d = j;
        this.f42703e = l;
        this.f42704f = z;
        this.f42705g = application;
        this.f42706h = user;
        this.f42707i = operatingSystem;
        this.f42708j = device;
        this.f42709k = list;
        this.f42710l = i;
    }
}
