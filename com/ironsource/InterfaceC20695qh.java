package com.ironsource;

import com.ironsource.mediationsdk.logger.IronSourceError;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* renamed from: com.ironsource.qh */
/* loaded from: classes6.dex */
public interface InterfaceC20695qh {
    void onAdInstanceDidBecomeVisible();

    void onAdInstanceDidClick();

    void onAdInstanceDidDismiss();

    void onAdInstanceDidFailedToShow(@NotNull IronSourceError ironSourceError);

    void onAdInstanceDidReward(@Nullable String str, int i);

    void onAdInstanceDidShow();
}
