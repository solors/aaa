package com.ironsource.mediationsdk.adunit.adapter.internal;

import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.LoadWhileShowSupportState;
import com.ironsource.mediationsdk.model.NetworkSettings;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes6.dex */
public interface AdapterSettingsInterface {
    LoadWhileShowSupportState getBannerLoadWhileShowSupportedState(NetworkSettings networkSettings);

    LoadWhileShowSupportState getLoadWhileShowSupportedState(NetworkSettings networkSettings);

    boolean isUsingActivityBeforeImpression(@NotNull IronSource.AD_UNIT ad_unit);
}
