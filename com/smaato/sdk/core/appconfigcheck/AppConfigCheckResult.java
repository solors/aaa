package com.smaato.sdk.core.appconfigcheck;

/* loaded from: classes7.dex */
public final class AppConfigCheckResult {
    private final boolean allActivitiesDeclared;
    private final boolean allMandatoryPermissionsDeclared;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AppConfigCheckResult(boolean z, boolean z2) {
        this.allMandatoryPermissionsDeclared = z;
        this.allActivitiesDeclared = z2;
    }

    boolean allActivitiesDeclared() {
        return this.allActivitiesDeclared;
    }

    boolean allMandatoryPermissionsDeclared() {
        return this.allMandatoryPermissionsDeclared;
    }

    public boolean isAppConfiguredProperly() {
        if (this.allMandatoryPermissionsDeclared && this.allActivitiesDeclared) {
            return true;
        }
        return false;
    }
}
