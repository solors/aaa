package com.google.firebase.crashlytics.internal.model;

import androidx.annotation.NonNull;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;

/* loaded from: classes4.dex */
final class AutoValue_CrashlyticsReport_Session_Device extends CrashlyticsReport.Session.Device {

    /* renamed from: a */
    private final int f42739a;

    /* renamed from: b */
    private final String f42740b;

    /* renamed from: c */
    private final int f42741c;

    /* renamed from: d */
    private final long f42742d;

    /* renamed from: e */
    private final long f42743e;

    /* renamed from: f */
    private final boolean f42744f;

    /* renamed from: g */
    private final int f42745g;

    /* renamed from: h */
    private final String f42746h;

    /* renamed from: i */
    private final String f42747i;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class Builder extends CrashlyticsReport.Session.Device.Builder {

        /* renamed from: a */
        private Integer f42748a;

        /* renamed from: b */
        private String f42749b;

        /* renamed from: c */
        private Integer f42750c;

        /* renamed from: d */
        private Long f42751d;

        /* renamed from: e */
        private Long f42752e;

        /* renamed from: f */
        private Boolean f42753f;

        /* renamed from: g */
        private Integer f42754g;

        /* renamed from: h */
        private String f42755h;

        /* renamed from: i */
        private String f42756i;

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Device.Builder
        public CrashlyticsReport.Session.Device build() {
            String str = "";
            if (this.f42748a == null) {
                str = " arch";
            }
            if (this.f42749b == null) {
                str = str + " model";
            }
            if (this.f42750c == null) {
                str = str + " cores";
            }
            if (this.f42751d == null) {
                str = str + " ram";
            }
            if (this.f42752e == null) {
                str = str + " diskSpace";
            }
            if (this.f42753f == null) {
                str = str + " simulator";
            }
            if (this.f42754g == null) {
                str = str + " state";
            }
            if (this.f42755h == null) {
                str = str + " manufacturer";
            }
            if (this.f42756i == null) {
                str = str + " modelClass";
            }
            if (str.isEmpty()) {
                return new AutoValue_CrashlyticsReport_Session_Device(this.f42748a.intValue(), this.f42749b, this.f42750c.intValue(), this.f42751d.longValue(), this.f42752e.longValue(), this.f42753f.booleanValue(), this.f42754g.intValue(), this.f42755h, this.f42756i);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Device.Builder
        public CrashlyticsReport.Session.Device.Builder setArch(int i) {
            this.f42748a = Integer.valueOf(i);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Device.Builder
        public CrashlyticsReport.Session.Device.Builder setCores(int i) {
            this.f42750c = Integer.valueOf(i);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Device.Builder
        public CrashlyticsReport.Session.Device.Builder setDiskSpace(long j) {
            this.f42752e = Long.valueOf(j);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Device.Builder
        public CrashlyticsReport.Session.Device.Builder setManufacturer(String str) {
            if (str != null) {
                this.f42755h = str;
                return this;
            }
            throw new NullPointerException("Null manufacturer");
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Device.Builder
        public CrashlyticsReport.Session.Device.Builder setModel(String str) {
            if (str != null) {
                this.f42749b = str;
                return this;
            }
            throw new NullPointerException("Null model");
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Device.Builder
        public CrashlyticsReport.Session.Device.Builder setModelClass(String str) {
            if (str != null) {
                this.f42756i = str;
                return this;
            }
            throw new NullPointerException("Null modelClass");
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Device.Builder
        public CrashlyticsReport.Session.Device.Builder setRam(long j) {
            this.f42751d = Long.valueOf(j);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Device.Builder
        public CrashlyticsReport.Session.Device.Builder setSimulator(boolean z) {
            this.f42753f = Boolean.valueOf(z);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Device.Builder
        public CrashlyticsReport.Session.Device.Builder setState(int i) {
            this.f42754g = Integer.valueOf(i);
            return this;
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CrashlyticsReport.Session.Device)) {
            return false;
        }
        CrashlyticsReport.Session.Device device = (CrashlyticsReport.Session.Device) obj;
        if (this.f42739a == device.getArch() && this.f42740b.equals(device.getModel()) && this.f42741c == device.getCores() && this.f42742d == device.getRam() && this.f42743e == device.getDiskSpace() && this.f42744f == device.isSimulator() && this.f42745g == device.getState() && this.f42746h.equals(device.getManufacturer()) && this.f42747i.equals(device.getModelClass())) {
            return true;
        }
        return false;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Device
    @NonNull
    public int getArch() {
        return this.f42739a;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Device
    public int getCores() {
        return this.f42741c;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Device
    public long getDiskSpace() {
        return this.f42743e;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Device
    @NonNull
    public String getManufacturer() {
        return this.f42746h;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Device
    @NonNull
    public String getModel() {
        return this.f42740b;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Device
    @NonNull
    public String getModelClass() {
        return this.f42747i;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Device
    public long getRam() {
        return this.f42742d;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Device
    public int getState() {
        return this.f42745g;
    }

    public int hashCode() {
        int i;
        long j = this.f42742d;
        long j2 = this.f42743e;
        int hashCode = (((((((((this.f42739a ^ 1000003) * 1000003) ^ this.f42740b.hashCode()) * 1000003) ^ this.f42741c) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003;
        if (this.f42744f) {
            i = 1231;
        } else {
            i = 1237;
        }
        return ((((((hashCode ^ i) * 1000003) ^ this.f42745g) * 1000003) ^ this.f42746h.hashCode()) * 1000003) ^ this.f42747i.hashCode();
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Device
    public boolean isSimulator() {
        return this.f42744f;
    }

    public String toString() {
        return "Device{arch=" + this.f42739a + ", model=" + this.f42740b + ", cores=" + this.f42741c + ", ram=" + this.f42742d + ", diskSpace=" + this.f42743e + ", simulator=" + this.f42744f + ", state=" + this.f42745g + ", manufacturer=" + this.f42746h + ", modelClass=" + this.f42747i + "}";
    }

    private AutoValue_CrashlyticsReport_Session_Device(int i, String str, int i2, long j, long j2, boolean z, int i3, String str2, String str3) {
        this.f42739a = i;
        this.f42740b = str;
        this.f42741c = i2;
        this.f42742d = j;
        this.f42743e = j2;
        this.f42744f = z;
        this.f42745g = i3;
        this.f42746h = str2;
        this.f42747i = str3;
    }
}
