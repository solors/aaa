package com.google.firebase.crashlytics.internal.model;

import com.google.firebase.crashlytics.internal.model.StaticSessionData;

/* loaded from: classes4.dex */
final class AutoValue_StaticSessionData extends StaticSessionData {

    /* renamed from: a */
    private final StaticSessionData.AppData f42879a;

    /* renamed from: b */
    private final StaticSessionData.OsData f42880b;

    /* renamed from: c */
    private final StaticSessionData.DeviceData f42881c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AutoValue_StaticSessionData(StaticSessionData.AppData appData, StaticSessionData.OsData osData, StaticSessionData.DeviceData deviceData) {
        if (appData != null) {
            this.f42879a = appData;
            if (osData != null) {
                this.f42880b = osData;
                if (deviceData != null) {
                    this.f42881c = deviceData;
                    return;
                }
                throw new NullPointerException("Null deviceData");
            }
            throw new NullPointerException("Null osData");
        }
        throw new NullPointerException("Null appData");
    }

    @Override // com.google.firebase.crashlytics.internal.model.StaticSessionData
    public StaticSessionData.AppData appData() {
        return this.f42879a;
    }

    @Override // com.google.firebase.crashlytics.internal.model.StaticSessionData
    public StaticSessionData.DeviceData deviceData() {
        return this.f42881c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof StaticSessionData)) {
            return false;
        }
        StaticSessionData staticSessionData = (StaticSessionData) obj;
        if (this.f42879a.equals(staticSessionData.appData()) && this.f42880b.equals(staticSessionData.osData()) && this.f42881c.equals(staticSessionData.deviceData())) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((((this.f42879a.hashCode() ^ 1000003) * 1000003) ^ this.f42880b.hashCode()) * 1000003) ^ this.f42881c.hashCode();
    }

    @Override // com.google.firebase.crashlytics.internal.model.StaticSessionData
    public StaticSessionData.OsData osData() {
        return this.f42880b;
    }

    public String toString() {
        return "StaticSessionData{appData=" + this.f42879a + ", osData=" + this.f42880b + ", deviceData=" + this.f42881c + "}";
    }
}
