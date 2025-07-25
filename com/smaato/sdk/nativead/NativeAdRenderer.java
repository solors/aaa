package com.smaato.sdk.nativead;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* loaded from: classes7.dex */
public interface NativeAdRenderer {
    @Nullable
    String creativeId();

    @NonNull
    NativeAdAssets getAssets();

    void onDestroyView();

    void registerForClicks(@NonNull Iterable<? extends View> iterable);

    void registerForClicks(@NonNull View... viewArr);

    void registerForImpression(@NonNull View view);

    void renderInView(@NonNull NativeAdView nativeAdView);

    @Nullable
    String sessionId();
}
