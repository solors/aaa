package io.appmetrica.analytics.coreapi.internal.servicecomponents;

import io.appmetrica.analytics.coreapi.internal.model.SdkEnvironment;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes9.dex */
public interface SdkEnvironmentProvider {
    @NotNull
    SdkEnvironment getSdkEnvironment();
}
