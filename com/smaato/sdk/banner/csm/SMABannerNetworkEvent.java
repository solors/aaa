package com.smaato.sdk.banner.csm;

import android.content.Context;
import androidx.annotation.NonNull;
import java.util.Map;

/* loaded from: classes7.dex */
public interface SMABannerNetworkEvent {
    @NonNull
    String getNetworkName();

    void onDestroy();

    void requestBanner(@NonNull Context context, @NonNull SMABannerNetworkEventListener sMABannerNetworkEventListener, @NonNull Map<String, String> map, @NonNull Map<String, Object> map2);
}
