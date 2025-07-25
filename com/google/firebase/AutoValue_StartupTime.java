package com.google.firebase;

/* loaded from: classes4.dex */
final class AutoValue_StartupTime extends StartupTime {

    /* renamed from: a */
    private final long f42017a;

    /* renamed from: b */
    private final long f42018b;

    /* renamed from: c */
    private final long f42019c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AutoValue_StartupTime(long j, long j2, long j3) {
        this.f42017a = j;
        this.f42018b = j2;
        this.f42019c = j3;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof StartupTime)) {
            return false;
        }
        StartupTime startupTime = (StartupTime) obj;
        if (this.f42017a == startupTime.getEpochMillis() && this.f42018b == startupTime.getElapsedRealtime() && this.f42019c == startupTime.getUptimeMillis()) {
            return true;
        }
        return false;
    }

    @Override // com.google.firebase.StartupTime
    public long getElapsedRealtime() {
        return this.f42018b;
    }

    @Override // com.google.firebase.StartupTime
    public long getEpochMillis() {
        return this.f42017a;
    }

    @Override // com.google.firebase.StartupTime
    public long getUptimeMillis() {
        return this.f42019c;
    }

    public int hashCode() {
        long j = this.f42017a;
        long j2 = this.f42018b;
        long j3 = this.f42019c;
        return ((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ ((int) ((j3 >>> 32) ^ j3));
    }

    public String toString() {
        return "StartupTime{epochMillis=" + this.f42017a + ", elapsedRealtime=" + this.f42018b + ", uptimeMillis=" + this.f42019c + "}";
    }
}
