package com.unity3d.ads.core.domain;

import com.google.protobuf.ByteString;
import gatewayprotocol.p687v1.UniversalRequestOuterClass;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: GetAdDataRefreshRequest.kt */
@Metadata
/* loaded from: classes7.dex */
public interface GetAdDataRefreshRequest {
    @Nullable
    Object invoke(@NotNull ByteString byteString, @NotNull ByteString byteString2, @NotNull Continuation<? super UniversalRequestOuterClass.UniversalRequest> continuation);
}
