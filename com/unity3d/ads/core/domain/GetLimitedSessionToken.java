package com.unity3d.ads.core.domain;

import gatewayprotocol.p687v1.UniversalRequestOuterClass;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: GetLimitedSessionToken.kt */
@Metadata
/* loaded from: classes7.dex */
public interface GetLimitedSessionToken {
    @Nullable
    Object invoke(@NotNull Continuation<? super UniversalRequestOuterClass.LimitedSessionToken> continuation);
}
