package com.unity3d.ads.core.data.repository;

import com.google.protobuf.ByteString;
import gatewayprotocol.p687v1.CampaignStateOuterClass;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: CampaignRepository.kt */
@Metadata
/* loaded from: classes7.dex */
public interface CampaignRepository {
    @Nullable
    CampaignStateOuterClass.Campaign getCampaign(@NotNull ByteString byteString);

    @NotNull
    CampaignStateOuterClass.CampaignState getCampaignState();

    void removeState(@NotNull ByteString byteString);

    void setCampaign(@NotNull ByteString byteString, @NotNull CampaignStateOuterClass.Campaign campaign);

    void setLoadTimestamp(@NotNull ByteString byteString);

    void setShowTimestamp(@NotNull ByteString byteString);
}
