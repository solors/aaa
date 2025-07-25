package com.unity3d.ads.core.domain;

import com.unity3d.ads.core.data.repository.DeviceInfoRepository;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: AndroidGetInitializationCompletedRequest.kt */
@Metadata
/* loaded from: classes7.dex */
public final class AndroidGetInitializationCompletedRequest implements GetInitializationCompletedRequest {
    @NotNull
    private final DeviceInfoRepository deviceInfoRepository;
    @NotNull
    private final GetUniversalRequestForPayLoad getUniversalRequestForPayLoad;

    public AndroidGetInitializationCompletedRequest(@NotNull GetUniversalRequestForPayLoad getUniversalRequestForPayLoad, @NotNull DeviceInfoRepository deviceInfoRepository) {
        Intrinsics.checkNotNullParameter(getUniversalRequestForPayLoad, "getUniversalRequestForPayLoad");
        Intrinsics.checkNotNullParameter(deviceInfoRepository, "deviceInfoRepository");
        this.getUniversalRequestForPayLoad = getUniversalRequestForPayLoad;
        this.deviceInfoRepository = deviceInfoRepository;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00ac A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00ad A[PHI: r9 
      PHI: (r9v12 java.lang.Object) = (r9v11 java.lang.Object), (r9v1 java.lang.Object) binds: [B:21:0x00aa, B:12:0x002a] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    @Override // com.unity3d.ads.core.domain.GetInitializationCompletedRequest
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object invoke(@org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super gatewayprotocol.p687v1.UniversalRequestOuterClass.UniversalRequest> r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof com.unity3d.ads.core.domain.AndroidGetInitializationCompletedRequest$invoke$1
            if (r0 == 0) goto L13
            r0 = r9
            com.unity3d.ads.core.domain.AndroidGetInitializationCompletedRequest$invoke$1 r0 = (com.unity3d.ads.core.domain.AndroidGetInitializationCompletedRequest$invoke$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.unity3d.ads.core.domain.AndroidGetInitializationCompletedRequest$invoke$1 r0 = new com.unity3d.ads.core.domain.AndroidGetInitializationCompletedRequest$invoke$1
            r0.<init>(r8, r9)
        L18:
            java.lang.Object r9 = r0.result
            java.lang.Object r1 = sd.C42683b.m6964e()
            int r2 = r0.label
            java.lang.String r3 = "newBuilder()"
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L4b
            if (r2 == r5) goto L37
            if (r2 != r4) goto L2f
            p804nd.C38508r.m14539b(r9)
            goto Lad
        L2f:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L37:
            java.lang.Object r2 = r0.L$3
            gatewayprotocol.v1.InitializationCompletedEventRequestKt$Dsl r2 = (gatewayprotocol.p687v1.InitializationCompletedEventRequestKt.Dsl) r2
            java.lang.Object r5 = r0.L$2
            gatewayprotocol.v1.InitializationCompletedEventRequestKt$Dsl r5 = (gatewayprotocol.p687v1.InitializationCompletedEventRequestKt.Dsl) r5
            java.lang.Object r6 = r0.L$1
            gatewayprotocol.v1.InitializationCompletedEventRequestKt$Dsl r6 = (gatewayprotocol.p687v1.InitializationCompletedEventRequestKt.Dsl) r6
            java.lang.Object r7 = r0.L$0
            com.unity3d.ads.core.domain.AndroidGetInitializationCompletedRequest r7 = (com.unity3d.ads.core.domain.AndroidGetInitializationCompletedRequest) r7
            p804nd.C38508r.m14539b(r9)
            goto L71
        L4b:
            p804nd.C38508r.m14539b(r9)
            gatewayprotocol.v1.InitializationCompletedEventRequestKt$Dsl$Companion r9 = gatewayprotocol.p687v1.InitializationCompletedEventRequestKt.Dsl.Companion
            gatewayprotocol.v1.InitializationCompletedEventRequestOuterClass$InitializationCompletedEventRequest$Builder r2 = gatewayprotocol.p687v1.InitializationCompletedEventRequestOuterClass.InitializationCompletedEventRequest.newBuilder()
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r3)
            gatewayprotocol.v1.InitializationCompletedEventRequestKt$Dsl r2 = r9._create(r2)
            com.unity3d.ads.core.data.repository.DeviceInfoRepository r9 = r8.deviceInfoRepository
            r0.L$0 = r8
            r0.L$1 = r2
            r0.L$2 = r2
            r0.L$3 = r2
            r0.label = r5
            java.lang.Object r9 = r9.staticDeviceInfo(r0)
            if (r9 != r1) goto L6e
            return r1
        L6e:
            r7 = r8
            r5 = r2
            r6 = r5
        L71:
            gatewayprotocol.v1.StaticDeviceInfoOuterClass$StaticDeviceInfo r9 = (gatewayprotocol.p687v1.StaticDeviceInfoOuterClass.StaticDeviceInfo) r9
            r2.setStaticDeviceInfo(r9)
            com.unity3d.ads.core.data.repository.DeviceInfoRepository r9 = r7.deviceInfoRepository
            gatewayprotocol.v1.DynamicDeviceInfoOuterClass$DynamicDeviceInfo r9 = r9.getDynamicDeviceInfo()
            r5.setDynamicDeviceInfo(r9)
            gatewayprotocol.v1.InitializationCompletedEventRequestOuterClass$InitializationCompletedEventRequest r9 = r6._build()
            gatewayprotocol.v1.UniversalRequestKt r2 = gatewayprotocol.p687v1.UniversalRequestKt.INSTANCE
            gatewayprotocol.v1.UniversalRequestKt$PayloadKt$Dsl$Companion r2 = gatewayprotocol.p687v1.UniversalRequestKt.PayloadKt.Dsl.Companion
            gatewayprotocol.v1.UniversalRequestOuterClass$UniversalRequest$Payload$Builder r5 = gatewayprotocol.p687v1.UniversalRequestOuterClass.UniversalRequest.Payload.newBuilder()
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r3)
            gatewayprotocol.v1.UniversalRequestKt$PayloadKt$Dsl r2 = r2._create(r5)
            r2.setInitializationCompletedEventRequest(r9)
            gatewayprotocol.v1.UniversalRequestOuterClass$UniversalRequest$Payload r9 = r2._build()
            com.unity3d.ads.core.domain.GetUniversalRequestForPayLoad r2 = r7.getUniversalRequestForPayLoad
            r3 = 0
            r0.L$0 = r3
            r0.L$1 = r3
            r0.L$2 = r3
            r0.L$3 = r3
            r0.label = r4
            java.lang.Object r9 = r2.invoke(r9, r0)
            if (r9 != r1) goto Lad
            return r1
        Lad:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.AndroidGetInitializationCompletedRequest.invoke(kotlin.coroutines.d):java.lang.Object");
    }
}
