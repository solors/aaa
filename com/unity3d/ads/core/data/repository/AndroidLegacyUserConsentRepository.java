package com.unity3d.ads.core.data.repository;

import com.unity3d.ads.core.data.datasource.LegacyUserConsentDataSource;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: AndroidLegacyUserConsentRepository.kt */
@Metadata
/* loaded from: classes7.dex */
public final class AndroidLegacyUserConsentRepository implements LegacyUserConsentRepository {
    @NotNull
    private final LegacyUserConsentDataSource legacyUserConsentDataSource;

    public AndroidLegacyUserConsentRepository(@NotNull LegacyUserConsentDataSource legacyUserConsentDataSource) {
        Intrinsics.checkNotNullParameter(legacyUserConsentDataSource, "legacyUserConsentDataSource");
        this.legacyUserConsentDataSource = legacyUserConsentDataSource;
    }

    @Override // com.unity3d.ads.core.data.repository.LegacyUserConsentRepository
    @Nullable
    public String getLegacyFlowUserConsent() {
        return this.legacyUserConsentDataSource.getPrivacyData();
    }
}
