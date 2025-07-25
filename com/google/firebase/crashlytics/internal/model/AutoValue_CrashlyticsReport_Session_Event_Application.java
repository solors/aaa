package com.google.firebase.crashlytics.internal.model;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import java.util.List;

/* loaded from: classes4.dex */
final class AutoValue_CrashlyticsReport_Session_Event_Application extends CrashlyticsReport.Session.Event.Application {

    /* renamed from: a */
    private final CrashlyticsReport.Session.Event.Application.Execution f42769a;

    /* renamed from: b */
    private final List<CrashlyticsReport.CustomAttribute> f42770b;

    /* renamed from: c */
    private final List<CrashlyticsReport.CustomAttribute> f42771c;

    /* renamed from: d */
    private final Boolean f42772d;

    /* renamed from: e */
    private final CrashlyticsReport.Session.Event.Application.ProcessDetails f42773e;

    /* renamed from: f */
    private final List<CrashlyticsReport.Session.Event.Application.ProcessDetails> f42774f;

    /* renamed from: g */
    private final int f42775g;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class Builder extends CrashlyticsReport.Session.Event.Application.Builder {

        /* renamed from: a */
        private CrashlyticsReport.Session.Event.Application.Execution f42776a;

        /* renamed from: b */
        private List<CrashlyticsReport.CustomAttribute> f42777b;

        /* renamed from: c */
        private List<CrashlyticsReport.CustomAttribute> f42778c;

        /* renamed from: d */
        private Boolean f42779d;

        /* renamed from: e */
        private CrashlyticsReport.Session.Event.Application.ProcessDetails f42780e;

        /* renamed from: f */
        private List<CrashlyticsReport.Session.Event.Application.ProcessDetails> f42781f;

        /* renamed from: g */
        private Integer f42782g;

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Builder
        public CrashlyticsReport.Session.Event.Application build() {
            String str = "";
            if (this.f42776a == null) {
                str = " execution";
            }
            if (this.f42782g == null) {
                str = str + " uiOrientation";
            }
            if (str.isEmpty()) {
                return new AutoValue_CrashlyticsReport_Session_Event_Application(this.f42776a, this.f42777b, this.f42778c, this.f42779d, this.f42780e, this.f42781f, this.f42782g.intValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Builder
        public CrashlyticsReport.Session.Event.Application.Builder setAppProcessDetails(@Nullable List<CrashlyticsReport.Session.Event.Application.ProcessDetails> list) {
            this.f42781f = list;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Builder
        public CrashlyticsReport.Session.Event.Application.Builder setBackground(@Nullable Boolean bool) {
            this.f42779d = bool;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Builder
        public CrashlyticsReport.Session.Event.Application.Builder setCurrentProcessDetails(@Nullable CrashlyticsReport.Session.Event.Application.ProcessDetails processDetails) {
            this.f42780e = processDetails;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Builder
        public CrashlyticsReport.Session.Event.Application.Builder setCustomAttributes(List<CrashlyticsReport.CustomAttribute> list) {
            this.f42777b = list;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Builder
        public CrashlyticsReport.Session.Event.Application.Builder setExecution(CrashlyticsReport.Session.Event.Application.Execution execution) {
            if (execution != null) {
                this.f42776a = execution;
                return this;
            }
            throw new NullPointerException("Null execution");
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Builder
        public CrashlyticsReport.Session.Event.Application.Builder setInternalKeys(List<CrashlyticsReport.CustomAttribute> list) {
            this.f42778c = list;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Builder
        public CrashlyticsReport.Session.Event.Application.Builder setUiOrientation(int i) {
            this.f42782g = Integer.valueOf(i);
            return this;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public Builder() {
        }

        private Builder(CrashlyticsReport.Session.Event.Application application) {
            this.f42776a = application.getExecution();
            this.f42777b = application.getCustomAttributes();
            this.f42778c = application.getInternalKeys();
            this.f42779d = application.getBackground();
            this.f42780e = application.getCurrentProcessDetails();
            this.f42781f = application.getAppProcessDetails();
            this.f42782g = Integer.valueOf(application.getUiOrientation());
        }
    }

    public boolean equals(Object obj) {
        List<CrashlyticsReport.CustomAttribute> list;
        List<CrashlyticsReport.CustomAttribute> list2;
        Boolean bool;
        CrashlyticsReport.Session.Event.Application.ProcessDetails processDetails;
        List<CrashlyticsReport.Session.Event.Application.ProcessDetails> list3;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CrashlyticsReport.Session.Event.Application)) {
            return false;
        }
        CrashlyticsReport.Session.Event.Application application = (CrashlyticsReport.Session.Event.Application) obj;
        if (this.f42769a.equals(application.getExecution()) && ((list = this.f42770b) != null ? list.equals(application.getCustomAttributes()) : application.getCustomAttributes() == null) && ((list2 = this.f42771c) != null ? list2.equals(application.getInternalKeys()) : application.getInternalKeys() == null) && ((bool = this.f42772d) != null ? bool.equals(application.getBackground()) : application.getBackground() == null) && ((processDetails = this.f42773e) != null ? processDetails.equals(application.getCurrentProcessDetails()) : application.getCurrentProcessDetails() == null) && ((list3 = this.f42774f) != null ? list3.equals(application.getAppProcessDetails()) : application.getAppProcessDetails() == null) && this.f42775g == application.getUiOrientation()) {
            return true;
        }
        return false;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application
    @Nullable
    public List<CrashlyticsReport.Session.Event.Application.ProcessDetails> getAppProcessDetails() {
        return this.f42774f;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application
    @Nullable
    public Boolean getBackground() {
        return this.f42772d;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application
    @Nullable
    public CrashlyticsReport.Session.Event.Application.ProcessDetails getCurrentProcessDetails() {
        return this.f42773e;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application
    @Nullable
    public List<CrashlyticsReport.CustomAttribute> getCustomAttributes() {
        return this.f42770b;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application
    @NonNull
    public CrashlyticsReport.Session.Event.Application.Execution getExecution() {
        return this.f42769a;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application
    @Nullable
    public List<CrashlyticsReport.CustomAttribute> getInternalKeys() {
        return this.f42771c;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application
    public int getUiOrientation() {
        return this.f42775g;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5 = (this.f42769a.hashCode() ^ 1000003) * 1000003;
        List<CrashlyticsReport.CustomAttribute> list = this.f42770b;
        int i = 0;
        if (list == null) {
            hashCode = 0;
        } else {
            hashCode = list.hashCode();
        }
        int i2 = (hashCode5 ^ hashCode) * 1000003;
        List<CrashlyticsReport.CustomAttribute> list2 = this.f42771c;
        if (list2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = list2.hashCode();
        }
        int i3 = (i2 ^ hashCode2) * 1000003;
        Boolean bool = this.f42772d;
        if (bool == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = bool.hashCode();
        }
        int i4 = (i3 ^ hashCode3) * 1000003;
        CrashlyticsReport.Session.Event.Application.ProcessDetails processDetails = this.f42773e;
        if (processDetails == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = processDetails.hashCode();
        }
        int i5 = (i4 ^ hashCode4) * 1000003;
        List<CrashlyticsReport.Session.Event.Application.ProcessDetails> list3 = this.f42774f;
        if (list3 != null) {
            i = list3.hashCode();
        }
        return ((i5 ^ i) * 1000003) ^ this.f42775g;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application
    public CrashlyticsReport.Session.Event.Application.Builder toBuilder() {
        return new Builder(this);
    }

    public String toString() {
        return "Application{execution=" + this.f42769a + ", customAttributes=" + this.f42770b + ", internalKeys=" + this.f42771c + ", background=" + this.f42772d + ", currentProcessDetails=" + this.f42773e + ", appProcessDetails=" + this.f42774f + ", uiOrientation=" + this.f42775g + "}";
    }

    private AutoValue_CrashlyticsReport_Session_Event_Application(CrashlyticsReport.Session.Event.Application.Execution execution, @Nullable List<CrashlyticsReport.CustomAttribute> list, @Nullable List<CrashlyticsReport.CustomAttribute> list2, @Nullable Boolean bool, @Nullable CrashlyticsReport.Session.Event.Application.ProcessDetails processDetails, @Nullable List<CrashlyticsReport.Session.Event.Application.ProcessDetails> list3, int i) {
        this.f42769a = execution;
        this.f42770b = list;
        this.f42771c = list2;
        this.f42772d = bool;
        this.f42773e = processDetails;
        this.f42774f = list3;
        this.f42775g = i;
    }
}
