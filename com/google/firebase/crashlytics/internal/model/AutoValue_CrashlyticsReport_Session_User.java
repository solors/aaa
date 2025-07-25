package com.google.firebase.crashlytics.internal.model;

import androidx.annotation.NonNull;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;

/* loaded from: classes4.dex */
final class AutoValue_CrashlyticsReport_Session_User extends CrashlyticsReport.Session.User {

    /* renamed from: a */
    private final String f42877a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class Builder extends CrashlyticsReport.Session.User.Builder {

        /* renamed from: a */
        private String f42878a;

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.User.Builder
        public CrashlyticsReport.Session.User build() {
            String str = "";
            if (this.f42878a == null) {
                str = " identifier";
            }
            if (str.isEmpty()) {
                return new AutoValue_CrashlyticsReport_Session_User(this.f42878a);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.User.Builder
        public CrashlyticsReport.Session.User.Builder setIdentifier(String str) {
            if (str != null) {
                this.f42878a = str;
                return this;
            }
            throw new NullPointerException("Null identifier");
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof CrashlyticsReport.Session.User) {
            return this.f42877a.equals(((CrashlyticsReport.Session.User) obj).getIdentifier());
        }
        return false;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.User
    @NonNull
    public String getIdentifier() {
        return this.f42877a;
    }

    public int hashCode() {
        return this.f42877a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "User{identifier=" + this.f42877a + "}";
    }

    private AutoValue_CrashlyticsReport_Session_User(String str) {
        this.f42877a = str;
    }
}
