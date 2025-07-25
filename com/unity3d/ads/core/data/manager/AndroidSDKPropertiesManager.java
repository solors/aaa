package com.unity3d.ads.core.data.manager;

import com.unity3d.services.core.device.Device;
import com.unity3d.services.core.properties.SdkProperties;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: AndroidSDKPropertiesManager.kt */
@Metadata
/* loaded from: classes7.dex */
public final class AndroidSDKPropertiesManager implements SDKPropertiesManager {
    @Override // com.unity3d.ads.core.data.manager.SDKPropertiesManager
    @NotNull
    public SdkProperties.InitializationState getCurrentInitializationState() {
        SdkProperties.InitializationState currentInitializationState = SdkProperties.getCurrentInitializationState();
        Intrinsics.checkNotNullExpressionValue(currentInitializationState, "getCurrentInitializationState()");
        return currentInitializationState;
    }

    @Override // com.unity3d.ads.core.data.manager.SDKPropertiesManager
    public void setInitializationTime() {
        SdkProperties.setInitializationTime(Device.getElapsedRealtime());
    }

    @Override // com.unity3d.ads.core.data.manager.SDKPropertiesManager
    public void setInitializationTimeSinceEpoch() {
        SdkProperties.setInitializationTimeSinceEpoch(System.currentTimeMillis());
    }

    @Override // com.unity3d.ads.core.data.manager.SDKPropertiesManager
    public void setInitializeState(@NotNull SdkProperties.InitializationState initializeState) {
        Intrinsics.checkNotNullParameter(initializeState, "initializeState");
        SdkProperties.setInitializeState(initializeState);
    }

    @Override // com.unity3d.ads.core.data.manager.SDKPropertiesManager
    public void setInitialized(boolean z) {
        SdkProperties.setInitialized(z);
    }
}
