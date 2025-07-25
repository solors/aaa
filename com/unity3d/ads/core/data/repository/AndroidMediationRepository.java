package com.unity3d.ads.core.data.repository;

import com.unity3d.ads.core.data.datasource.MediationDataSource;
import gatewayprotocol.p687v1.ClientInfoOuterClass;
import kotlin.Metadata;
import kotlin.jvm.functions.Functions;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: AndroidMediationRepository.kt */
@Metadata
/* loaded from: classes7.dex */
public final class AndroidMediationRepository implements MediationRepository {
    @NotNull
    private final MediationDataSource mediationDataSource;

    public AndroidMediationRepository(@NotNull MediationDataSource mediationDataSource) {
        Intrinsics.checkNotNullParameter(mediationDataSource, "mediationDataSource");
        this.mediationDataSource = mediationDataSource;
    }

    @Override // com.unity3d.ads.core.data.repository.MediationRepository
    @NotNull
    public Functions<ClientInfoOuterClass.MediationProvider> getMediationProvider() {
        return new AndroidMediationRepository$mediationProvider$1(this);
    }

    @Override // com.unity3d.ads.core.data.repository.MediationRepository
    @Nullable
    public String getName() {
        return this.mediationDataSource.getName();
    }

    @Override // com.unity3d.ads.core.data.repository.MediationRepository
    @Nullable
    public String getVersion() {
        return this.mediationDataSource.getVersion();
    }
}
