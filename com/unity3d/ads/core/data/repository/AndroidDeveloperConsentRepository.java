package com.unity3d.ads.core.data.repository;

import com.unity3d.ads.core.data.datasource.DeveloperConsentDataSource;
import gatewayprotocol.p687v1.DeveloperConsentOuterClass;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: AndroidDeveloperConsentRepository.kt */
@Metadata
/* loaded from: classes7.dex */
public final class AndroidDeveloperConsentRepository implements DeveloperConsentRepository {
    @NotNull
    private final DeveloperConsentOuterClass.DeveloperConsent developerConsent;

    public AndroidDeveloperConsentRepository(@NotNull DeveloperConsentDataSource developerConsentDataSource) {
        Intrinsics.checkNotNullParameter(developerConsentDataSource, "developerConsentDataSource");
        this.developerConsent = developerConsentDataSource.getDeveloperConsent();
    }

    @Override // com.unity3d.ads.core.data.repository.DeveloperConsentRepository
    @NotNull
    public DeveloperConsentOuterClass.DeveloperConsent getDeveloperConsent() {
        return this.developerConsent;
    }
}
