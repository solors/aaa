package com.google.firebase.crashlytics.internal.model;

import com.google.firebase.crashlytics.internal.DevelopmentPlatformProvider;
import com.google.firebase.crashlytics.internal.model.StaticSessionData;

/* loaded from: classes4.dex */
final class AutoValue_StaticSessionData_AppData extends StaticSessionData.AppData {

    /* renamed from: a */
    private final String f42882a;

    /* renamed from: b */
    private final String f42883b;

    /* renamed from: c */
    private final String f42884c;

    /* renamed from: d */
    private final String f42885d;

    /* renamed from: e */
    private final int f42886e;

    /* renamed from: f */
    private final DevelopmentPlatformProvider f42887f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AutoValue_StaticSessionData_AppData(String str, String str2, String str3, String str4, int i, DevelopmentPlatformProvider developmentPlatformProvider) {
        if (str != null) {
            this.f42882a = str;
            if (str2 != null) {
                this.f42883b = str2;
                if (str3 != null) {
                    this.f42884c = str3;
                    if (str4 != null) {
                        this.f42885d = str4;
                        this.f42886e = i;
                        if (developmentPlatformProvider != null) {
                            this.f42887f = developmentPlatformProvider;
                            return;
                        }
                        throw new NullPointerException("Null developmentPlatformProvider");
                    }
                    throw new NullPointerException("Null installUuid");
                }
                throw new NullPointerException("Null versionName");
            }
            throw new NullPointerException("Null versionCode");
        }
        throw new NullPointerException("Null appIdentifier");
    }

    @Override // com.google.firebase.crashlytics.internal.model.StaticSessionData.AppData
    public String appIdentifier() {
        return this.f42882a;
    }

    @Override // com.google.firebase.crashlytics.internal.model.StaticSessionData.AppData
    public int deliveryMechanism() {
        return this.f42886e;
    }

    @Override // com.google.firebase.crashlytics.internal.model.StaticSessionData.AppData
    public DevelopmentPlatformProvider developmentPlatformProvider() {
        return this.f42887f;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof StaticSessionData.AppData)) {
            return false;
        }
        StaticSessionData.AppData appData = (StaticSessionData.AppData) obj;
        if (this.f42882a.equals(appData.appIdentifier()) && this.f42883b.equals(appData.versionCode()) && this.f42884c.equals(appData.versionName()) && this.f42885d.equals(appData.installUuid()) && this.f42886e == appData.deliveryMechanism() && this.f42887f.equals(appData.developmentPlatformProvider())) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((((((((((this.f42882a.hashCode() ^ 1000003) * 1000003) ^ this.f42883b.hashCode()) * 1000003) ^ this.f42884c.hashCode()) * 1000003) ^ this.f42885d.hashCode()) * 1000003) ^ this.f42886e) * 1000003) ^ this.f42887f.hashCode();
    }

    @Override // com.google.firebase.crashlytics.internal.model.StaticSessionData.AppData
    public String installUuid() {
        return this.f42885d;
    }

    public String toString() {
        return "AppData{appIdentifier=" + this.f42882a + ", versionCode=" + this.f42883b + ", versionName=" + this.f42884c + ", installUuid=" + this.f42885d + ", deliveryMechanism=" + this.f42886e + ", developmentPlatformProvider=" + this.f42887f + "}";
    }

    @Override // com.google.firebase.crashlytics.internal.model.StaticSessionData.AppData
    public String versionCode() {
        return this.f42883b;
    }

    @Override // com.google.firebase.crashlytics.internal.model.StaticSessionData.AppData
    public String versionName() {
        return this.f42884c;
    }
}
