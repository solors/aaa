package com.facebook.ads.internal.api;

import android.content.res.Configuration;
import androidx.annotation.Keep;
import androidx.annotation.UiThread;
import com.facebook.ads.AdView;
import com.facebook.ads.ExtraHints;
import com.facebook.ads.InterfaceC10846Ad;
import com.facebook.proguard.annotations.DoNotStripAny;

@Keep
@DoNotStripAny
@UiThread
/* loaded from: classes3.dex */
public interface AdViewApi extends AdViewParentApi, InterfaceC10846Ad {
    AdView.AdViewLoadConfigBuilder buildLoadAdConfig();

    void loadAd(AdView.AdViewLoadConfig adViewLoadConfig);

    @Override // com.facebook.ads.internal.api.AdViewParentApi
    void onConfigurationChanged(Configuration configuration);

    @Override // com.facebook.ads.InterfaceC10846Ad
    @Deprecated
    void setExtraHints(ExtraHints extraHints);
}
