package com.unity3d.ads.core.domain;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: AndroidGetInitializationRequest.kt */
@Metadata
/* loaded from: classes7.dex */
public final class AndroidGetInitializationRequest implements GetInitializationRequest {
    @NotNull
    private final GetInitializationRequestPayload getInitializationRequestPayload;
    @NotNull
    private final GetUniversalRequestForPayLoad getUniversalRequestForPayLoad;

    public AndroidGetInitializationRequest(@NotNull GetInitializationRequestPayload getInitializationRequestPayload, @NotNull GetUniversalRequestForPayLoad getUniversalRequestForPayLoad) {
        Intrinsics.checkNotNullParameter(getInitializationRequestPayload, "getInitializationRequestPayload");
        Intrinsics.checkNotNullParameter(getUniversalRequestForPayLoad, "getUniversalRequestForPayLoad");
        this.getInitializationRequestPayload = getInitializationRequestPayload;
        this.getUniversalRequestForPayLoad = getUniversalRequestForPayLoad;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0074 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0075 A[PHI: r8 
      PHI: (r8v8 java.lang.Object) = (r8v7 java.lang.Object), (r8v1 java.lang.Object) binds: [B:21:0x0072, B:12:0x0028] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    @Override // com.unity3d.ads.core.domain.GetInitializationRequest
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object invoke(@org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super gatewayprotocol.p687v1.UniversalRequestOuterClass.UniversalRequest> r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof com.unity3d.ads.core.domain.AndroidGetInitializationRequest$invoke$1
            if (r0 == 0) goto L13
            r0 = r8
            com.unity3d.ads.core.domain.AndroidGetInitializationRequest$invoke$1 r0 = (com.unity3d.ads.core.domain.AndroidGetInitializationRequest$invoke$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.unity3d.ads.core.domain.AndroidGetInitializationRequest$invoke$1 r0 = new com.unity3d.ads.core.domain.AndroidGetInitializationRequest$invoke$1
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = sd.C42683b.m6964e()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3c
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            p804nd.C38508r.m14539b(r8)
            goto L75
        L2c:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L34:
            java.lang.Object r2 = r0.L$0
            com.unity3d.ads.core.domain.AndroidGetInitializationRequest r2 = (com.unity3d.ads.core.domain.AndroidGetInitializationRequest) r2
            p804nd.C38508r.m14539b(r8)
            goto L4d
        L3c:
            p804nd.C38508r.m14539b(r8)
            com.unity3d.ads.core.domain.GetInitializationRequestPayload r8 = r7.getInitializationRequestPayload
            r0.L$0 = r7
            r0.label = r4
            java.lang.Object r8 = r8.invoke(r0)
            if (r8 != r1) goto L4c
            return r1
        L4c:
            r2 = r7
        L4d:
            gatewayprotocol.v1.InitializationRequestOuterClass$InitializationRequest r8 = (gatewayprotocol.p687v1.InitializationRequestOuterClass.InitializationRequest) r8
            gatewayprotocol.v1.UniversalRequestKt r4 = gatewayprotocol.p687v1.UniversalRequestKt.INSTANCE
            gatewayprotocol.v1.UniversalRequestKt$PayloadKt$Dsl$Companion r4 = gatewayprotocol.p687v1.UniversalRequestKt.PayloadKt.Dsl.Companion
            gatewayprotocol.v1.UniversalRequestOuterClass$UniversalRequest$Payload$Builder r5 = gatewayprotocol.p687v1.UniversalRequestOuterClass.UniversalRequest.Payload.newBuilder()
            java.lang.String r6 = "newBuilder()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r6)
            gatewayprotocol.v1.UniversalRequestKt$PayloadKt$Dsl r4 = r4._create(r5)
            r4.setInitializationRequest(r8)
            gatewayprotocol.v1.UniversalRequestOuterClass$UniversalRequest$Payload r8 = r4._build()
            com.unity3d.ads.core.domain.GetUniversalRequestForPayLoad r2 = r2.getUniversalRequestForPayLoad
            r4 = 0
            r0.L$0 = r4
            r0.label = r3
            java.lang.Object r8 = r2.invoke(r8, r0)
            if (r8 != r1) goto L75
            return r1
        L75:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.AndroidGetInitializationRequest.invoke(kotlin.coroutines.d):java.lang.Object");
    }
}
