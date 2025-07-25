package com.unity3d.ads.core.domain;

import gatewayprotocol.p687v1.UniversalRequestOuterClass;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: GetInitializationRequest.kt */
@Metadata
/* loaded from: classes7.dex */
public interface GetInitializationRequest {
    @Nullable
    Object invoke(@NotNull Continuation<? super UniversalRequestOuterClass.UniversalRequest> continuation);
}
