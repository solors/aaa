package com.google.firebase.crashlytics.internal.model;

import androidx.annotation.Nullable;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;

/* loaded from: classes4.dex */
final class AutoValue_CrashlyticsReport_Session_Event_Device extends CrashlyticsReport.Session.Event.Device {

    /* renamed from: a */
    private final Double f42841a;

    /* renamed from: b */
    private final int f42842b;

    /* renamed from: c */
    private final boolean f42843c;

    /* renamed from: d */
    private final int f42844d;

    /* renamed from: e */
    private final long f42845e;

    /* renamed from: f */
    private final long f42846f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class Builder extends CrashlyticsReport.Session.Event.Device.Builder {

        /* renamed from: a */
        private Double f42847a;

        /* renamed from: b */
        private Integer f42848b;

        /* renamed from: c */
        private Boolean f42849c;

        /* renamed from: d */
        private Integer f42850d;

        /* renamed from: e */
        private Long f42851e;

        /* renamed from: f */
        private Long f42852f;

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Device.Builder
        public CrashlyticsReport.Session.Event.Device build() {
            String str = "";
            if (this.f42848b == null) {
                str = " batteryVelocity";
            }
            if (this.f42849c == null) {
                str = str + " proximityOn";
            }
            if (this.f42850d == null) {
                str = str + " orientation";
            }
            if (this.f42851e == null) {
                str = str + " ramUsed";
            }
            if (this.f42852f == null) {
                str = str + " diskUsed";
            }
            if (str.isEmpty()) {
                return new AutoValue_CrashlyticsReport_Session_Event_Device(this.f42847a, this.f42848b.intValue(), this.f42849c.booleanValue(), this.f42850d.intValue(), this.f42851e.longValue(), this.f42852f.longValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Device.Builder
        public CrashlyticsReport.Session.Event.Device.Builder setBatteryLevel(Double d) {
            this.f42847a = d;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Device.Builder
        public CrashlyticsReport.Session.Event.Device.Builder setBatteryVelocity(int i) {
            this.f42848b = Integer.valueOf(i);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Device.Builder
        public CrashlyticsReport.Session.Event.Device.Builder setDiskUsed(long j) {
            this.f42852f = Long.valueOf(j);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Device.Builder
        public CrashlyticsReport.Session.Event.Device.Builder setOrientation(int i) {
            this.f42850d = Integer.valueOf(i);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Device.Builder
        public CrashlyticsReport.Session.Event.Device.Builder setProximityOn(boolean z) {
            this.f42849c = Boolean.valueOf(z);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Device.Builder
        public CrashlyticsReport.Session.Event.Device.Builder setRamUsed(long j) {
            this.f42851e = Long.valueOf(j);
            return this;
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CrashlyticsReport.Session.Event.Device)) {
            return false;
        }
        CrashlyticsReport.Session.Event.Device device = (CrashlyticsReport.Session.Event.Device) obj;
        Double d = this.f42841a;
        if (d != null ? d.equals(device.getBatteryLevel()) : device.getBatteryLevel() == null) {
            if (this.f42842b == device.getBatteryVelocity() && this.f42843c == device.isProximityOn() && this.f42844d == device.getOrientation() && this.f42845e == device.getRamUsed() && this.f42846f == device.getDiskUsed()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Device
    @Nullable
    public Double getBatteryLevel() {
        return this.f42841a;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Device
    public int getBatteryVelocity() {
        return this.f42842b;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Device
    public long getDiskUsed() {
        return this.f42846f;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Device
    public int getOrientation() {
        return this.f42844d;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Device
    public long getRamUsed() {
        return this.f42845e;
    }

    public int hashCode() {
        int hashCode;
        int i;
        Double d = this.f42841a;
        if (d == null) {
            hashCode = 0;
        } else {
            hashCode = d.hashCode();
        }
        int i2 = (((hashCode ^ 1000003) * 1000003) ^ this.f42842b) * 1000003;
        if (this.f42843c) {
            i = 1231;
        } else {
            i = 1237;
        }
        long j = this.f42845e;
        long j2 = this.f42846f;
        return ((((((i2 ^ i) * 1000003) ^ this.f42844d) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)));
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Device
    public boolean isProximityOn() {
        return this.f42843c;
    }

    public String toString() {
        return "Device{batteryLevel=" + this.f42841a + ", batteryVelocity=" + this.f42842b + ", proximityOn=" + this.f42843c + ", orientation=" + this.f42844d + ", ramUsed=" + this.f42845e + ", diskUsed=" + this.f42846f + "}";
    }

    private AutoValue_CrashlyticsReport_Session_Event_Device(@Nullable Double d, int i, boolean z, int i2, long j, long j2) {
        this.f42841a = d;
        this.f42842b = i;
        this.f42843c = z;
        this.f42844d = i2;
        this.f42845e = j;
        this.f42846f = j2;
    }
}
