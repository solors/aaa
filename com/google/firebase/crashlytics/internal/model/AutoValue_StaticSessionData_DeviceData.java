package com.google.firebase.crashlytics.internal.model;

import com.google.firebase.crashlytics.internal.model.StaticSessionData;

/* loaded from: classes4.dex */
final class AutoValue_StaticSessionData_DeviceData extends StaticSessionData.DeviceData {

    /* renamed from: a */
    private final int f42888a;

    /* renamed from: b */
    private final String f42889b;

    /* renamed from: c */
    private final int f42890c;

    /* renamed from: d */
    private final long f42891d;

    /* renamed from: e */
    private final long f42892e;

    /* renamed from: f */
    private final boolean f42893f;

    /* renamed from: g */
    private final int f42894g;

    /* renamed from: h */
    private final String f42895h;

    /* renamed from: i */
    private final String f42896i;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AutoValue_StaticSessionData_DeviceData(int i, String str, int i2, long j, long j2, boolean z, int i3, String str2, String str3) {
        this.f42888a = i;
        if (str != null) {
            this.f42889b = str;
            this.f42890c = i2;
            this.f42891d = j;
            this.f42892e = j2;
            this.f42893f = z;
            this.f42894g = i3;
            if (str2 != null) {
                this.f42895h = str2;
                if (str3 != null) {
                    this.f42896i = str3;
                    return;
                }
                throw new NullPointerException("Null modelClass");
            }
            throw new NullPointerException("Null manufacturer");
        }
        throw new NullPointerException("Null model");
    }

    @Override // com.google.firebase.crashlytics.internal.model.StaticSessionData.DeviceData
    public int arch() {
        return this.f42888a;
    }

    @Override // com.google.firebase.crashlytics.internal.model.StaticSessionData.DeviceData
    public int availableProcessors() {
        return this.f42890c;
    }

    @Override // com.google.firebase.crashlytics.internal.model.StaticSessionData.DeviceData
    public long diskSpace() {
        return this.f42892e;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof StaticSessionData.DeviceData)) {
            return false;
        }
        StaticSessionData.DeviceData deviceData = (StaticSessionData.DeviceData) obj;
        if (this.f42888a == deviceData.arch() && this.f42889b.equals(deviceData.model()) && this.f42890c == deviceData.availableProcessors() && this.f42891d == deviceData.totalRam() && this.f42892e == deviceData.diskSpace() && this.f42893f == deviceData.isEmulator() && this.f42894g == deviceData.state() && this.f42895h.equals(deviceData.manufacturer()) && this.f42896i.equals(deviceData.modelClass())) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i;
        long j = this.f42891d;
        long j2 = this.f42892e;
        int hashCode = (((((((((this.f42888a ^ 1000003) * 1000003) ^ this.f42889b.hashCode()) * 1000003) ^ this.f42890c) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003;
        if (this.f42893f) {
            i = 1231;
        } else {
            i = 1237;
        }
        return ((((((hashCode ^ i) * 1000003) ^ this.f42894g) * 1000003) ^ this.f42895h.hashCode()) * 1000003) ^ this.f42896i.hashCode();
    }

    @Override // com.google.firebase.crashlytics.internal.model.StaticSessionData.DeviceData
    public boolean isEmulator() {
        return this.f42893f;
    }

    @Override // com.google.firebase.crashlytics.internal.model.StaticSessionData.DeviceData
    public String manufacturer() {
        return this.f42895h;
    }

    @Override // com.google.firebase.crashlytics.internal.model.StaticSessionData.DeviceData
    public String model() {
        return this.f42889b;
    }

    @Override // com.google.firebase.crashlytics.internal.model.StaticSessionData.DeviceData
    public String modelClass() {
        return this.f42896i;
    }

    @Override // com.google.firebase.crashlytics.internal.model.StaticSessionData.DeviceData
    public int state() {
        return this.f42894g;
    }

    public String toString() {
        return "DeviceData{arch=" + this.f42888a + ", model=" + this.f42889b + ", availableProcessors=" + this.f42890c + ", totalRam=" + this.f42891d + ", diskSpace=" + this.f42892e + ", isEmulator=" + this.f42893f + ", state=" + this.f42894g + ", manufacturer=" + this.f42895h + ", modelClass=" + this.f42896i + "}";
    }

    @Override // com.google.firebase.crashlytics.internal.model.StaticSessionData.DeviceData
    public long totalRam() {
        return this.f42891d;
    }
}
