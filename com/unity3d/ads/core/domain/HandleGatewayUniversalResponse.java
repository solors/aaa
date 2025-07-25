package com.unity3d.ads.core.domain;

import gatewayprotocol.p687v1.UniversalResponseOuterClass;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: HandleGatewayUniversalResponse.kt */
@Metadata
/* loaded from: classes7.dex */
public interface HandleGatewayUniversalResponse {
    @Nullable
    Object invoke(@NotNull UniversalResponseOuterClass.UniversalResponse universalResponse, @NotNull Continuation<? super Unit> continuation);
}
