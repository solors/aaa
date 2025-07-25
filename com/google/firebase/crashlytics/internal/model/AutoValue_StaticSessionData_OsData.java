package com.google.firebase.crashlytics.internal.model;

import com.google.firebase.crashlytics.internal.model.StaticSessionData;

/* loaded from: classes4.dex */
final class AutoValue_StaticSessionData_OsData extends StaticSessionData.OsData {

    /* renamed from: a */
    private final String f42897a;

    /* renamed from: b */
    private final String f42898b;

    /* renamed from: c */
    private final boolean f42899c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AutoValue_StaticSessionData_OsData(String str, String str2, boolean z) {
        if (str != null) {
            this.f42897a = str;
            if (str2 != null) {
                this.f42898b = str2;
                this.f42899c = z;
                return;
            }
            throw new NullPointerException("Null osCodeName");
        }
        throw new NullPointerException("Null osRelease");
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof StaticSessionData.OsData)) {
            return false;
        }
        StaticSessionData.OsData osData = (StaticSessionData.OsData) obj;
        if (this.f42897a.equals(osData.osRelease()) && this.f42898b.equals(osData.osCodeName()) && this.f42899c == osData.isRooted()) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i;
        int hashCode = (((this.f42897a.hashCode() ^ 1000003) * 1000003) ^ this.f42898b.hashCode()) * 1000003;
        if (this.f42899c) {
            i = 1231;
        } else {
            i = 1237;
        }
        return hashCode ^ i;
    }

    @Override // com.google.firebase.crashlytics.internal.model.StaticSessionData.OsData
    public boolean isRooted() {
        return this.f42899c;
    }

    @Override // com.google.firebase.crashlytics.internal.model.StaticSessionData.OsData
    public String osCodeName() {
        return this.f42898b;
    }

    @Override // com.google.firebase.crashlytics.internal.model.StaticSessionData.OsData
    public String osRelease() {
        return this.f42897a;
    }

    public String toString() {
        return "OsData{osRelease=" + this.f42897a + ", osCodeName=" + this.f42898b + ", isRooted=" + this.f42899c + "}";
    }
}
