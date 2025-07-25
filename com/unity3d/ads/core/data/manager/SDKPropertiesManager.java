package com.unity3d.ads.core.data.manager;

import com.unity3d.services.core.properties.SdkProperties;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: SDKPropertiesManager.kt */
@Metadata
/* loaded from: classes7.dex */
public interface SDKPropertiesManager {
    @NotNull
    SdkProperties.InitializationState getCurrentInitializationState();

    void setInitializationTime();

    void setInitializationTimeSinceEpoch();

    void setInitializeState(@NotNull SdkProperties.InitializationState initializationState);

    void setInitialized(boolean z);
}
