package com.unity3d.ads.core.domain;

import gatewayprotocol.p687v1.InitializationDataOuterClass;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: GetInitializationData.kt */
@Metadata
/* loaded from: classes7.dex */
public interface GetInitializationData {
    @Nullable
    Object invoke(@NotNull Continuation<? super InitializationDataOuterClass.InitializationData> continuation);
}
