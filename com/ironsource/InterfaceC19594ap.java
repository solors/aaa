package com.ironsource;

import com.ironsource.mediationsdk.logger.IronSourceError;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata
/* renamed from: com.ironsource.ap */
/* loaded from: classes6.dex */
public interface InterfaceC19594ap {
    void onAdInstanceDidBecomeVisible();

    void onRewardedAdClicked();

    void onRewardedAdDismissed();

    void onRewardedAdFailedToShow(@NotNull IronSourceError ironSourceError);

    void onRewardedAdShown();

    void onUserEarnedReward();
}
