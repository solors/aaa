package com.five_corp.p372ad;

import androidx.annotation.NonNull;

/* renamed from: com.five_corp.ad.FiveAdNativeEventListener */
/* loaded from: classes4.dex */
public interface FiveAdNativeEventListener {
    void onViewError(@NonNull FiveAdNative fiveAdNative, @NonNull FiveAdErrorCode fiveAdErrorCode);

    default void onClick(@NonNull FiveAdNative fiveAdNative) {
    }

    default void onImpression(@NonNull FiveAdNative fiveAdNative) {
    }

    default void onPause(@NonNull FiveAdNative fiveAdNative) {
    }

    default void onPlay(@NonNull FiveAdNative fiveAdNative) {
    }

    default void onRemove(@NonNull FiveAdNative fiveAdNative) {
    }

    default void onViewThrough(@NonNull FiveAdNative fiveAdNative) {
    }
}
