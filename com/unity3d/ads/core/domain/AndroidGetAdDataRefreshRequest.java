package com.unity3d.ads.core.domain;

import com.unity3d.ads.core.data.repository.CampaignRepository;
import com.unity3d.ads.core.data.repository.DeviceInfoRepository;
import com.unity3d.ads.core.data.repository.SessionRepository;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: AndroidGetAdDataRefreshRequest.kt */
@Metadata
/* loaded from: classes7.dex */
public final class AndroidGetAdDataRefreshRequest implements GetAdDataRefreshRequest {
    @NotNull
    private final CampaignRepository campaignRepository;
    @NotNull
    private final DeviceInfoRepository deviceInfoRepository;
    @NotNull
    private final GetUniversalRequestForPayLoad getUniversalRequestForPayLoad;
    @NotNull
    private final SessionRepository sessionRepository;

    public AndroidGetAdDataRefreshRequest(@NotNull GetUniversalRequestForPayLoad getUniversalRequestForPayLoad, @NotNull SessionRepository sessionRepository, @NotNull DeviceInfoRepository deviceInfoRepository, @NotNull CampaignRepository campaignRepository) {
        Intrinsics.checkNotNullParameter(getUniversalRequestForPayLoad, "getUniversalRequestForPayLoad");
        Intrinsics.checkNotNullParameter(sessionRepository, "sessionRepository");
        Intrinsics.checkNotNullParameter(deviceInfoRepository, "deviceInfoRepository");
        Intrinsics.checkNotNullParameter(campaignRepository, "campaignRepository");
        this.getUniversalRequestForPayLoad = getUniversalRequestForPayLoad;
        this.sessionRepository = sessionRepository;
        this.deviceInfoRepository = deviceInfoRepository;
        this.campaignRepository = campaignRepository;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00de A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00df A[PHI: r11 
      PHI: (r11v10 java.lang.Object) = (r11v9 java.lang.Object), (r11v1 java.lang.Object) binds: [B:24:0x00dc, B:12:0x002a] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    @Override // com.unity3d.ads.core.domain.GetAdDataRefreshRequest
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object invoke(@org.jetbrains.annotations.NotNull com.google.protobuf.ByteString r9, @org.jetbrains.annotations.NotNull com.google.protobuf.ByteString r10, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super gatewayprotocol.p687v1.UniversalRequestOuterClass.UniversalRequest> r11) {
        /*
            Method dump skipped, instructions count: 224
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.AndroidGetAdDataRefreshRequest.invoke(com.google.protobuf.ByteString, com.google.protobuf.ByteString, kotlin.coroutines.d):java.lang.Object");
    }
}
