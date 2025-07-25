package com.unity3d.ads.core.data.repository;

import gatewayprotocol.p687v1.ClientInfoOuterClass;
import kotlin.Metadata;
import kotlin.jvm.functions.Functions;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: MediationRepository.kt */
@Metadata
/* loaded from: classes7.dex */
public interface MediationRepository {
    @NotNull
    Functions<ClientInfoOuterClass.MediationProvider> getMediationProvider();

    @Nullable
    String getName();

    @Nullable
    String getVersion();
}
