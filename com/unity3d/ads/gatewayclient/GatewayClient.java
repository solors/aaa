package com.unity3d.ads.gatewayclient;

import com.unity3d.ads.core.data.model.OperationType;
import com.unity3d.services.UnityAdsConstants;
import gatewayprotocol.p687v1.UniversalRequestOuterClass;
import gatewayprotocol.p687v1.UniversalResponseOuterClass;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: GatewayClient.kt */
@Metadata
/* loaded from: classes7.dex */
public interface GatewayClient {

    /* compiled from: GatewayClient.kt */
    @Metadata
    /* loaded from: classes7.dex */
    public static final class DefaultImpls {
        public static /* synthetic */ Object request$default(GatewayClient gatewayClient, String str, UniversalRequestOuterClass.UniversalRequest universalRequest, RequestPolicy requestPolicy, OperationType operationType, Continuation continuation, int i, Object obj) {
            if (obj == null) {
                if ((i & 1) != 0) {
                    str = UnityAdsConstants.DefaultUrls.GATEWAY_URL;
                }
                String str2 = str;
                if ((i & 8) != 0) {
                    operationType = OperationType.UNKNOWN;
                }
                return gatewayClient.request(str2, universalRequest, requestPolicy, operationType, continuation);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: request");
        }
    }

    @Nullable
    Object request(@NotNull String str, @NotNull UniversalRequestOuterClass.UniversalRequest universalRequest, @NotNull RequestPolicy requestPolicy, @NotNull OperationType operationType, @NotNull Continuation<? super UniversalResponseOuterClass.UniversalResponse> continuation);
}
