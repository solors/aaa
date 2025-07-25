package com.unity3d.ads.core.domain;

import gatewayprotocol.p687v1.ClientInfoOuterClass;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: GetClientInfo.kt */
@Metadata
/* loaded from: classes7.dex */
public interface GetClientInfo {
    @Nullable
    Object invoke(@NotNull Continuation<? super ClientInfoOuterClass.ClientInfo> continuation);
}
