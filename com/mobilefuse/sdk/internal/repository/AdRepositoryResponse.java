package com.mobilefuse.sdk.internal.repository;

import com.mobilefuse.sdk.network.model.MfxBidResponse;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: AdRepositoryDataModel.kt */
@Metadata
/* loaded from: classes7.dex */
public interface AdRepositoryResponse {
    @NotNull
    MfxBidResponse getBidResponse();
}
