package com.google.firebase.crashlytics.internal.model;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import com.google.firebase.encoders.annotations.Encodable;

/* renamed from: com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_Session_Event_Application_Execution_BinaryImage */
/* loaded from: classes4.dex */
final class C17320xfe724d07 extends CrashlyticsReport.Session.Event.Application.Execution.BinaryImage {

    /* renamed from: a */
    private final long f42793a;

    /* renamed from: b */
    private final long f42794b;

    /* renamed from: c */
    private final String f42795c;

    /* renamed from: d */
    private final String f42796d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_Session_Event_Application_Execution_BinaryImage$Builder */
    /* loaded from: classes4.dex */
    public static final class Builder extends CrashlyticsReport.Session.Event.Application.Execution.BinaryImage.Builder {

        /* renamed from: a */
        private Long f42797a;

        /* renamed from: b */
        private Long f42798b;

        /* renamed from: c */
        private String f42799c;

        /* renamed from: d */
        private String f42800d;

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.BinaryImage.Builder
        public CrashlyticsReport.Session.Event.Application.Execution.BinaryImage build() {
            String str = "";
            if (this.f42797a == null) {
                str = " baseAddress";
            }
            if (this.f42798b == null) {
                str = str + " size";
            }
            if (this.f42799c == null) {
                str = str + " name";
            }
            if (str.isEmpty()) {
                return new C17320xfe724d07(this.f42797a.longValue(), this.f42798b.longValue(), this.f42799c, this.f42800d);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.BinaryImage.Builder
        public CrashlyticsReport.Session.Event.Application.Execution.BinaryImage.Builder setBaseAddress(long j) {
            this.f42797a = Long.valueOf(j);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.BinaryImage.Builder
        public CrashlyticsReport.Session.Event.Application.Execution.BinaryImage.Builder setName(String str) {
            if (str != null) {
                this.f42799c = str;
                return this;
            }
            throw new NullPointerException("Null name");
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.BinaryImage.Builder
        public CrashlyticsReport.Session.Event.Application.Execution.BinaryImage.Builder setSize(long j) {
            this.f42798b = Long.valueOf(j);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.BinaryImage.Builder
        public CrashlyticsReport.Session.Event.Application.Execution.BinaryImage.Builder setUuid(@Nullable String str) {
            this.f42800d = str;
            return this;
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CrashlyticsReport.Session.Event.Application.Execution.BinaryImage)) {
            return false;
        }
        CrashlyticsReport.Session.Event.Application.Execution.BinaryImage binaryImage = (CrashlyticsReport.Session.Event.Application.Execution.BinaryImage) obj;
        if (this.f42793a == binaryImage.getBaseAddress() && this.f42794b == binaryImage.getSize() && this.f42795c.equals(binaryImage.getName())) {
            String str = this.f42796d;
            if (str == null) {
                if (binaryImage.getUuid() == null) {
                    return true;
                }
            } else if (str.equals(binaryImage.getUuid())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.BinaryImage
    @NonNull
    public long getBaseAddress() {
        return this.f42793a;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.BinaryImage
    @NonNull
    public String getName() {
        return this.f42795c;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.BinaryImage
    public long getSize() {
        return this.f42794b;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.BinaryImage
    @Nullable
    @Encodable.Ignore
    public String getUuid() {
        return this.f42796d;
    }

    public int hashCode() {
        int hashCode;
        long j = this.f42793a;
        long j2 = this.f42794b;
        int hashCode2 = (((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003) ^ this.f42795c.hashCode()) * 1000003;
        String str = this.f42796d;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return hashCode2 ^ hashCode;
    }

    public String toString() {
        return "BinaryImage{baseAddress=" + this.f42793a + ", size=" + this.f42794b + ", name=" + this.f42795c + ", uuid=" + this.f42796d + "}";
    }

    private C17320xfe724d07(long j, long j2, String str, @Nullable String str2) {
        this.f42793a = j;
        this.f42794b = j2;
        this.f42795c = str;
        this.f42796d = str2;
    }
}
