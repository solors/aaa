package com.unity3d.ads.core.domain;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: AndroidGetInitializationData.kt */
@Metadata
/* loaded from: classes7.dex */
public final class AndroidGetInitializationData implements GetInitializationData {
    @NotNull
    private final GetInitializationRequestPayload getInitializeRequestPayload;
    @NotNull
    private final GetUniversalRequestSharedData getUniversalRequestSharedData;

    public AndroidGetInitializationData(@NotNull GetInitializationRequestPayload getInitializeRequestPayload, @NotNull GetUniversalRequestSharedData getUniversalRequestSharedData) {
        Intrinsics.checkNotNullParameter(getInitializeRequestPayload, "getInitializeRequestPayload");
        Intrinsics.checkNotNullParameter(getUniversalRequestSharedData, "getUniversalRequestSharedData");
        this.getInitializeRequestPayload = getInitializeRequestPayload;
        this.getUniversalRequestSharedData = getUniversalRequestSharedData;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0093 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0094  */
    @Override // com.unity3d.ads.core.domain.GetInitializationData
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object invoke(@org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super gatewayprotocol.p687v1.InitializationDataOuterClass.InitializationData> r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof com.unity3d.ads.core.domain.AndroidGetInitializationData$invoke$1
            if (r0 == 0) goto L13
            r0 = r9
            com.unity3d.ads.core.domain.AndroidGetInitializationData$invoke$1 r0 = (com.unity3d.ads.core.domain.AndroidGetInitializationData$invoke$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.unity3d.ads.core.domain.AndroidGetInitializationData$invoke$1 r0 = new com.unity3d.ads.core.domain.AndroidGetInitializationData$invoke$1
            r0.<init>(r8, r9)
        L18:
            java.lang.Object r9 = r0.result
            java.lang.Object r1 = sd.C42683b.m6964e()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L53
            if (r2 == r4) goto L3c
            if (r2 != r3) goto L34
            java.lang.Object r1 = r0.L$1
            gatewayprotocol.v1.InitializationDataKt$Dsl r1 = (gatewayprotocol.p687v1.InitializationDataKt.Dsl) r1
            java.lang.Object r0 = r0.L$0
            gatewayprotocol.v1.InitializationDataKt$Dsl r0 = (gatewayprotocol.p687v1.InitializationDataKt.Dsl) r0
            p804nd.C38508r.m14539b(r9)
            goto L96
        L34:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L3c:
            java.lang.Object r2 = r0.L$3
            gatewayprotocol.v1.InitializationDataKt$Dsl r2 = (gatewayprotocol.p687v1.InitializationDataKt.Dsl) r2
            java.lang.Object r4 = r0.L$2
            gatewayprotocol.v1.InitializationDataKt$Dsl r4 = (gatewayprotocol.p687v1.InitializationDataKt.Dsl) r4
            java.lang.Object r5 = r0.L$1
            gatewayprotocol.v1.InitializationDataKt$Dsl r5 = (gatewayprotocol.p687v1.InitializationDataKt.Dsl) r5
            java.lang.Object r6 = r0.L$0
            com.unity3d.ads.core.domain.AndroidGetInitializationData r6 = (com.unity3d.ads.core.domain.AndroidGetInitializationData) r6
            p804nd.C38508r.m14539b(r9)
            r7 = r5
            r5 = r2
            r2 = r7
            goto L7b
        L53:
            p804nd.C38508r.m14539b(r9)
            gatewayprotocol.v1.InitializationDataKt$Dsl$Companion r9 = gatewayprotocol.p687v1.InitializationDataKt.Dsl.Companion
            gatewayprotocol.v1.InitializationDataOuterClass$InitializationData$Builder r2 = gatewayprotocol.p687v1.InitializationDataOuterClass.InitializationData.newBuilder()
            java.lang.String r5 = "newBuilder()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r5)
            gatewayprotocol.v1.InitializationDataKt$Dsl r2 = r9._create(r2)
            com.unity3d.ads.core.domain.GetInitializationRequestPayload r9 = r8.getInitializeRequestPayload
            r0.L$0 = r8
            r0.L$1 = r2
            r0.L$2 = r2
            r0.L$3 = r2
            r0.label = r4
            java.lang.Object r9 = r9.invoke(r0)
            if (r9 != r1) goto L78
            return r1
        L78:
            r6 = r8
            r4 = r2
            r5 = r4
        L7b:
            gatewayprotocol.v1.InitializationRequestOuterClass$InitializationRequest r9 = (gatewayprotocol.p687v1.InitializationRequestOuterClass.InitializationRequest) r9
            r5.setInitializationRequest(r9)
            com.unity3d.ads.core.domain.GetUniversalRequestSharedData r9 = r6.getUniversalRequestSharedData
            r0.L$0 = r2
            r0.L$1 = r4
            r5 = 0
            r0.L$2 = r5
            r0.L$3 = r5
            r0.label = r3
            java.lang.Object r9 = r9.invoke(r0)
            if (r9 != r1) goto L94
            return r1
        L94:
            r0 = r2
            r1 = r4
        L96:
            gatewayprotocol.v1.UniversalRequestOuterClass$UniversalRequest$SharedData r9 = (gatewayprotocol.p687v1.UniversalRequestOuterClass.UniversalRequest.SharedData) r9
            r1.setSharedData(r9)
            gatewayprotocol.v1.InitializationDataOuterClass$InitializationData r9 = r0._build()
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.AndroidGetInitializationData.invoke(kotlin.coroutines.d):java.lang.Object");
    }
}
