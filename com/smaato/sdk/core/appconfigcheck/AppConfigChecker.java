package com.smaato.sdk.core.appconfigcheck;

import androidx.annotation.NonNull;
import com.smaato.sdk.core.log.LogDomain;
import com.smaato.sdk.core.log.Logger;
import com.smaato.sdk.core.util.AppMetaData;
import com.smaato.sdk.core.util.Joiner;
import com.smaato.sdk.core.util.Objects;
import com.smaato.sdk.core.util.collections.Lists;
import com.smaato.sdk.core.util.p574fi.Predicate;
import java.util.List;

/* loaded from: classes7.dex */
public final class AppConfigChecker {
    @NonNull
    private final AppMetaData appMetaData;
    @NonNull
    private final ExpectedManifestEntries expectedManifestEntries;
    @NonNull
    private final Logger logger;

    public AppConfigChecker(@NonNull Logger logger, @NonNull ExpectedManifestEntries expectedManifestEntries, @NonNull AppMetaData appMetaData) {
        this.logger = (Logger) Objects.requireNonNull(logger, "Parameter logger cannot be null for AppManifestConfigChecker::new");
        this.expectedManifestEntries = (ExpectedManifestEntries) Objects.requireNonNull(expectedManifestEntries, "Parameter expectedManifestEntries cannot be null for AppManifestConfigChecker::new");
        this.appMetaData = (AppMetaData) Objects.requireNonNull(appMetaData, "Parameter permissionChecker cannot be null for AppManifestConfigChecker::new");
    }

    private boolean allActivitiesDeclared() {
        List filter = Lists.filter(this.expectedManifestEntries.getActivities(), new Predicate() { // from class: com.smaato.sdk.core.appconfigcheck.b
            {
                AppConfigChecker.this = this;
            }

            @Override // com.smaato.sdk.core.util.p574fi.Predicate
            public final boolean test(Object obj) {
                boolean lambda$allActivitiesDeclared$1;
                lambda$allActivitiesDeclared$1 = AppConfigChecker.this.lambda$allActivitiesDeclared$1((Class) obj);
                return lambda$allActivitiesDeclared$1;
            }
        });
        boolean isEmpty = filter.isEmpty();
        if (!isEmpty) {
            this.logger.error(LogDomain.APP_CONFIG_CHECK, "Mandatory activities are not declared in the application manifest: %s", Joiner.join(", ", filter));
        }
        return isEmpty;
    }

    private boolean allMandatoryPermissionsDeclared() {
        List filter = Lists.filter(this.expectedManifestEntries.getPermissionsMandatory(), new Predicate() { // from class: com.smaato.sdk.core.appconfigcheck.a
            {
                AppConfigChecker.this = this;
            }

            @Override // com.smaato.sdk.core.util.p574fi.Predicate
            public final boolean test(Object obj) {
                boolean lambda$allMandatoryPermissionsDeclared$0;
                lambda$allMandatoryPermissionsDeclared$0 = AppConfigChecker.this.lambda$allMandatoryPermissionsDeclared$0((String) obj);
                return lambda$allMandatoryPermissionsDeclared$0;
            }
        });
        boolean isEmpty = filter.isEmpty();
        if (!isEmpty) {
            this.logger.error(LogDomain.APP_CONFIG_CHECK, "Mandatory permissions are not granted: %s", Joiner.join(", ", filter));
        }
        return isEmpty;
    }

    public /* synthetic */ boolean lambda$allActivitiesDeclared$1(Class cls) {
        return !this.appMetaData.isActivityRegistered(cls);
    }

    public /* synthetic */ boolean lambda$allMandatoryPermissionsDeclared$0(String str) {
        return !this.appMetaData.isPermissionGranted(str);
    }

    @NonNull
    public AppConfigCheckResult check() {
        return new AppConfigCheckResult(allMandatoryPermissionsDeclared(), allActivitiesDeclared());
    }
}
