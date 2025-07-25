package com.facebook.ads;

import androidx.annotation.Keep;
import com.facebook.ads.InterfaceC10846Ad;

/* loaded from: classes3.dex */
public interface FullScreenAd extends InterfaceC10846Ad {

    @Keep
    /* loaded from: classes3.dex */
    public interface ShowAdConfig {
    }

    @Keep
    /* loaded from: classes3.dex */
    public interface ShowConfigBuilder {
        ShowAdConfig build();
    }

    InterfaceC10846Ad.LoadConfigBuilder buildLoadAdConfig();

    ShowConfigBuilder buildShowAdConfig();

    boolean show();
}
