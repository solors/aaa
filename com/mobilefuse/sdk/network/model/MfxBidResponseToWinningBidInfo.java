package com.mobilefuse.sdk.network.model;

import com.mobilefuse.sdk.WinningBidInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* renamed from: com.mobilefuse.sdk.network.model.MfxBidResponseToWinningBidInfoKt */
/* loaded from: classes7.dex */
public final class MfxBidResponseToWinningBidInfo {
    @NotNull
    public static final WinningBidInfo getWinningBidInfo(@NotNull MfxBidResponse winningBidInfo) {
        Intrinsics.checkNotNullParameter(winningBidInfo, "$this$winningBidInfo");
        return new WinningBidInfo((float) winningBidInfo.getCpm(), winningBidInfo.getCrid(), null, 4, null);
    }
}
