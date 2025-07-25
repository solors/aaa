package com.unity3d.ads.core.domain;

import com.unity3d.ads.core.data.manager.SDKPropertiesManager;
import com.unity3d.ads.core.data.model.InitializationState;
import com.unity3d.ads.core.data.model.InitializationStateKt;
import com.unity3d.ads.core.data.repository.SessionRepository;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: CommonGetInitializationState.kt */
@Metadata
/* loaded from: classes7.dex */
public final class CommonGetInitializationState implements GetInitializationState {
    @NotNull
    private final SDKPropertiesManager sdkPropertiesManager;
    @NotNull
    private final SessionRepository sessionRepository;

    public CommonGetInitializationState(@NotNull SessionRepository sessionRepository, @NotNull SDKPropertiesManager sdkPropertiesManager) {
        Intrinsics.checkNotNullParameter(sessionRepository, "sessionRepository");
        Intrinsics.checkNotNullParameter(sdkPropertiesManager, "sdkPropertiesManager");
        this.sessionRepository = sessionRepository;
        this.sdkPropertiesManager = sdkPropertiesManager;
    }

    @Override // com.unity3d.ads.core.domain.GetInitializationState
    @NotNull
    public InitializationState invoke(boolean z) {
        if (z) {
            return InitializationStateKt.toBold(this.sdkPropertiesManager.getCurrentInitializationState());
        }
        return this.sessionRepository.getInitializationState();
    }
}
