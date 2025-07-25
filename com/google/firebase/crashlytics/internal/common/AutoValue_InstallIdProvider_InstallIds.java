package com.google.firebase.crashlytics.internal.common;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.firebase.crashlytics.internal.common.InstallIdProvider;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class AutoValue_InstallIdProvider_InstallIds extends InstallIdProvider.InstallIds {

    /* renamed from: a */
    private final String f42289a;

    /* renamed from: b */
    private final String f42290b;

    /* renamed from: c */
    private final String f42291c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AutoValue_InstallIdProvider_InstallIds(String str, @Nullable String str2, @Nullable String str3) {
        if (str != null) {
            this.f42289a = str;
            this.f42290b = str2;
            this.f42291c = str3;
            return;
        }
        throw new NullPointerException("Null crashlyticsInstallId");
    }

    public boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof InstallIdProvider.InstallIds)) {
            return false;
        }
        InstallIdProvider.InstallIds installIds = (InstallIdProvider.InstallIds) obj;
        if (this.f42289a.equals(installIds.getCrashlyticsInstallId()) && ((str = this.f42290b) != null ? str.equals(installIds.getFirebaseInstallationId()) : installIds.getFirebaseInstallationId() == null)) {
            String str2 = this.f42291c;
            if (str2 == null) {
                if (installIds.getFirebaseAuthenticationToken() == null) {
                    return true;
                }
            } else if (str2.equals(installIds.getFirebaseAuthenticationToken())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.firebase.crashlytics.internal.common.InstallIdProvider.InstallIds
    @NonNull
    public String getCrashlyticsInstallId() {
        return this.f42289a;
    }

    @Override // com.google.firebase.crashlytics.internal.common.InstallIdProvider.InstallIds
    @Nullable
    public String getFirebaseAuthenticationToken() {
        return this.f42291c;
    }

    @Override // com.google.firebase.crashlytics.internal.common.InstallIdProvider.InstallIds
    @Nullable
    public String getFirebaseInstallationId() {
        return this.f42290b;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = (this.f42289a.hashCode() ^ 1000003) * 1000003;
        String str = this.f42290b;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = (hashCode2 ^ hashCode) * 1000003;
        String str2 = this.f42291c;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return i2 ^ i;
    }

    public String toString() {
        return "InstallIds{crashlyticsInstallId=" + this.f42289a + ", firebaseInstallationId=" + this.f42290b + ", firebaseAuthenticationToken=" + this.f42291c + "}";
    }
}
