package com.unity3d.ads.core.domain;

import android.content.Context;
import com.google.protobuf.ByteString;
import com.unity3d.ads.UnityAdsLoadOptions;
import com.unity3d.ads.core.data.model.LoadResult;
import gatewayprotocol.p687v1.AdResponseOuterClass;
import gatewayprotocol.p687v1.DiagnosticEventRequestOuterClass;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: HandleGatewayAdResponse.kt */
@Metadata
/* loaded from: classes7.dex */
public interface HandleGatewayAdResponse {
    @Nullable
    Object invoke(@NotNull UnityAdsLoadOptions unityAdsLoadOptions, @NotNull ByteString byteString, @NotNull AdResponseOuterClass.AdResponse adResponse, @NotNull Context context, @NotNull String str, @NotNull DiagnosticEventRequestOuterClass.DiagnosticAdType diagnosticAdType, boolean z, @NotNull Continuation<? super LoadResult> continuation);
}
