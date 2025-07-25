package com.unity3d.ads.core.domain;

import com.unity3d.ads.core.data.repository.CampaignRepository;
import com.unity3d.ads.core.data.repository.DeviceInfoRepository;
import com.unity3d.ads.core.data.repository.SessionRepository;
import com.unity3d.ads.core.data.repository.TcfRepository;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: AndroidBuildHeaderBiddingToken.kt */
@Metadata
/* loaded from: classes7.dex */
public final class AndroidBuildHeaderBiddingToken implements BuildHeaderBiddingToken {
    @NotNull
    private final CampaignRepository campaignRepository;
    @NotNull
    private final DeviceInfoRepository deviceInfoRepository;
    @NotNull
    private final GetByteStringId generateId;
    @NotNull
    private final GetClientInfo getClientInfo;
    @NotNull
    private final GetInitializationData getInitializationData;
    @NotNull
    private final GetLimitedSessionToken getLimitedSessionToken;
    @NotNull
    private final GetSharedDataTimestamps getTimestamps;
    @NotNull
    private final SessionRepository sessionRepository;
    @NotNull
    private final TcfRepository tcfRepository;
    @NotNull
    private final AndroidTestDataInfo testDataInfo;

    public AndroidBuildHeaderBiddingToken(@NotNull GetByteStringId generateId, @NotNull GetClientInfo getClientInfo, @NotNull GetSharedDataTimestamps getTimestamps, @NotNull GetLimitedSessionToken getLimitedSessionToken, @NotNull GetInitializationData getInitializationData, @NotNull DeviceInfoRepository deviceInfoRepository, @NotNull SessionRepository sessionRepository, @NotNull CampaignRepository campaignRepository, @NotNull TcfRepository tcfRepository, @NotNull AndroidTestDataInfo testDataInfo) {
        Intrinsics.checkNotNullParameter(generateId, "generateId");
        Intrinsics.checkNotNullParameter(getClientInfo, "getClientInfo");
        Intrinsics.checkNotNullParameter(getTimestamps, "getTimestamps");
        Intrinsics.checkNotNullParameter(getLimitedSessionToken, "getLimitedSessionToken");
        Intrinsics.checkNotNullParameter(getInitializationData, "getInitializationData");
        Intrinsics.checkNotNullParameter(deviceInfoRepository, "deviceInfoRepository");
        Intrinsics.checkNotNullParameter(sessionRepository, "sessionRepository");
        Intrinsics.checkNotNullParameter(campaignRepository, "campaignRepository");
        Intrinsics.checkNotNullParameter(tcfRepository, "tcfRepository");
        Intrinsics.checkNotNullParameter(testDataInfo, "testDataInfo");
        this.generateId = generateId;
        this.getClientInfo = getClientInfo;
        this.getTimestamps = getTimestamps;
        this.getLimitedSessionToken = getLimitedSessionToken;
        this.getInitializationData = getInitializationData;
        this.deviceInfoRepository = deviceInfoRepository;
        this.sessionRepository = sessionRepository;
        this.campaignRepository = campaignRepository;
        this.tcfRepository = tcfRepository;
        this.testDataInfo = testDataInfo;
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x016e, code lost:
        if (r1 == true) goto L43;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01cc A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01dc  */
    @Override // com.unity3d.ads.core.domain.BuildHeaderBiddingToken
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object invoke(boolean r18, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super gatewayprotocol.p687v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken> r19) {
        /*
            Method dump skipped, instructions count: 549
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.AndroidBuildHeaderBiddingToken.invoke(boolean, kotlin.coroutines.d):java.lang.Object");
    }
}
