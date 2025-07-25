package com.google.android.gms.ads.preload;

import androidx.annotation.NonNull;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* loaded from: classes4.dex */
public interface PreloadCallback {
    void onAdsAvailable(@NonNull PreloadConfiguration preloadConfiguration);

    void onAdsExhausted(@NonNull PreloadConfiguration preloadConfiguration);
}
