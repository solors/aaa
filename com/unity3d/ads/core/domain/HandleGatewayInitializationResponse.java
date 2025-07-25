package com.unity3d.ads.core.domain;

import gatewayprotocol.p687v1.InitializationResponseOuterClass;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: HandleGatewayInitializationResponse.kt */
@Metadata
/* loaded from: classes7.dex */
public interface HandleGatewayInitializationResponse {
    @Nullable
    Object invoke(@NotNull InitializationResponseOuterClass.InitializationResponse initializationResponse, @NotNull Continuation<? super Unit> continuation);
}
