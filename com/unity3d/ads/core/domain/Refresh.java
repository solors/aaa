package com.unity3d.ads.core.domain;

import com.google.protobuf.ByteString;
import gatewayprotocol.p687v1.AdDataRefreshResponseOuterClass;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Refresh.kt */
@Metadata
/* loaded from: classes7.dex */
public interface Refresh {
    @Nullable
    Object invoke(@NotNull ByteString byteString, @NotNull ByteString byteString2, @NotNull Continuation<? super AdDataRefreshResponseOuterClass.AdDataRefreshResponse> continuation);
}
