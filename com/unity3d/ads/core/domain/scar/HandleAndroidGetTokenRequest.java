package com.unity3d.ads.core.domain.scar;

import com.unity3d.ads.core.domain.GetRequestPolicy;
import com.unity3d.ads.core.domain.GetUniversalRequestForPayLoad;
import com.unity3d.ads.gatewayclient.GatewayClient;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: HandleAndroidGetTokenRequest.kt */
@Metadata
/* loaded from: classes7.dex */
public final class HandleAndroidGetTokenRequest implements HandleGetTokenRequest {
    @NotNull
    private final GatewayClient gatewayClient;
    @NotNull
    private final GetHbTokenEventRequest getHbTokenEventRequest;
    @NotNull
    private final GetRequestPolicy getRequestPolicy;
    @NotNull
    private final GetUniversalRequestForPayLoad getUniversalRequestForPayLoad;

    public HandleAndroidGetTokenRequest(@NotNull GetUniversalRequestForPayLoad getUniversalRequestForPayLoad, @NotNull GetHbTokenEventRequest getHbTokenEventRequest, @NotNull GetRequestPolicy getRequestPolicy, @NotNull GatewayClient gatewayClient) {
        Intrinsics.checkNotNullParameter(getUniversalRequestForPayLoad, "getUniversalRequestForPayLoad");
        Intrinsics.checkNotNullParameter(getHbTokenEventRequest, "getHbTokenEventRequest");
        Intrinsics.checkNotNullParameter(getRequestPolicy, "getRequestPolicy");
        Intrinsics.checkNotNullParameter(gatewayClient, "gatewayClient");
        this.getUniversalRequestForPayLoad = getUniversalRequestForPayLoad;
        this.getHbTokenEventRequest = getHbTokenEventRequest;
        this.getRequestPolicy = getRequestPolicy;
        this.gatewayClient = gatewayClient;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x007f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x009c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x009d A[PHI: r12 
      PHI: (r12v10 java.lang.Object) = (r12v9 java.lang.Object), (r12v1 java.lang.Object) binds: [B:26:0x009a, B:13:0x002c] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    @Override // com.unity3d.ads.core.domain.scar.HandleGetTokenRequest
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object invoke(@org.jetbrains.annotations.NotNull com.google.protobuf.ByteString r10, @org.jetbrains.annotations.NotNull com.unity3d.services.ads.gmascar.models.BiddingSignals r11, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super gatewayprotocol.p687v1.UniversalResponseOuterClass.UniversalResponse> r12) {
        /*
            r9 = this;
            boolean r0 = r12 instanceof com.unity3d.ads.core.domain.scar.HandleAndroidGetTokenRequest$invoke$1
            if (r0 == 0) goto L13
            r0 = r12
            com.unity3d.ads.core.domain.scar.HandleAndroidGetTokenRequest$invoke$1 r0 = (com.unity3d.ads.core.domain.scar.HandleAndroidGetTokenRequest$invoke$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.unity3d.ads.core.domain.scar.HandleAndroidGetTokenRequest$invoke$1 r0 = new com.unity3d.ads.core.domain.scar.HandleAndroidGetTokenRequest$invoke$1
            r0.<init>(r9, r12)
        L18:
            r6 = r0
            java.lang.Object r12 = r6.result
            java.lang.Object r0 = sd.C42683b.m6964e()
            int r1 = r6.label
            r2 = 3
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L48
            if (r1 == r4) goto L40
            if (r1 == r3) goto L38
            if (r1 != r2) goto L30
            p804nd.C38508r.m14539b(r12)
            goto L9d
        L30:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L38:
            java.lang.Object r10 = r6.L$0
            com.unity3d.ads.core.domain.scar.HandleAndroidGetTokenRequest r10 = (com.unity3d.ads.core.domain.scar.HandleAndroidGetTokenRequest) r10
            p804nd.C38508r.m14539b(r12)
            goto L80
        L40:
            java.lang.Object r10 = r6.L$0
            com.unity3d.ads.core.domain.scar.HandleAndroidGetTokenRequest r10 = (com.unity3d.ads.core.domain.scar.HandleAndroidGetTokenRequest) r10
            p804nd.C38508r.m14539b(r12)
            goto L59
        L48:
            p804nd.C38508r.m14539b(r12)
            com.unity3d.ads.core.domain.scar.GetHbTokenEventRequest r12 = r9.getHbTokenEventRequest
            r6.L$0 = r9
            r6.label = r4
            java.lang.Object r12 = r12.invoke(r10, r11, r6)
            if (r12 != r0) goto L58
            return r0
        L58:
            r10 = r9
        L59:
            gatewayprotocol.v1.GetTokenEventRequestOuterClass$GetTokenEventRequest r12 = (gatewayprotocol.p687v1.GetTokenEventRequestOuterClass.GetTokenEventRequest) r12
            gatewayprotocol.v1.UniversalRequestKt r11 = gatewayprotocol.p687v1.UniversalRequestKt.INSTANCE
            gatewayprotocol.v1.UniversalRequestKt$PayloadKt$Dsl$Companion r11 = gatewayprotocol.p687v1.UniversalRequestKt.PayloadKt.Dsl.Companion
            gatewayprotocol.v1.UniversalRequestOuterClass$UniversalRequest$Payload$Builder r1 = gatewayprotocol.p687v1.UniversalRequestOuterClass.UniversalRequest.Payload.newBuilder()
            java.lang.String r4 = "newBuilder()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r4)
            gatewayprotocol.v1.UniversalRequestKt$PayloadKt$Dsl r11 = r11._create(r1)
            r11.setGetTokenEventRequest(r12)
            gatewayprotocol.v1.UniversalRequestOuterClass$UniversalRequest$Payload r11 = r11._build()
            com.unity3d.ads.core.domain.GetUniversalRequestForPayLoad r12 = r10.getUniversalRequestForPayLoad
            r6.L$0 = r10
            r6.label = r3
            java.lang.Object r12 = r12.invoke(r11, r6)
            if (r12 != r0) goto L80
            return r0
        L80:
            r3 = r12
            gatewayprotocol.v1.UniversalRequestOuterClass$UniversalRequest r3 = (gatewayprotocol.p687v1.UniversalRequestOuterClass.UniversalRequest) r3
            com.unity3d.ads.core.domain.GetRequestPolicy r11 = r10.getRequestPolicy
            com.unity3d.ads.gatewayclient.RequestPolicy r4 = r11.invoke()
            com.unity3d.ads.gatewayclient.GatewayClient r1 = r10.gatewayClient
            r10 = 0
            r5 = 0
            r7 = 9
            r8 = 0
            r11 = 0
            r6.L$0 = r11
            r6.label = r2
            r2 = r10
            java.lang.Object r12 = com.unity3d.ads.gatewayclient.GatewayClient.DefaultImpls.request$default(r1, r2, r3, r4, r5, r6, r7, r8)
            if (r12 != r0) goto L9d
            return r0
        L9d:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.scar.HandleAndroidGetTokenRequest.invoke(com.google.protobuf.ByteString, com.unity3d.services.ads.gmascar.models.BiddingSignals, kotlin.coroutines.d):java.lang.Object");
    }
}
