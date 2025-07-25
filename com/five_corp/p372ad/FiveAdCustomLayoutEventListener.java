package com.five_corp.p372ad;

import androidx.annotation.NonNull;

/* renamed from: com.five_corp.ad.FiveAdCustomLayoutEventListener */
/* loaded from: classes4.dex */
public interface FiveAdCustomLayoutEventListener {
    void onViewError(@NonNull FiveAdCustomLayout fiveAdCustomLayout, @NonNull FiveAdErrorCode fiveAdErrorCode);

    default void onClick(@NonNull FiveAdCustomLayout fiveAdCustomLayout) {
    }

    default void onImpression(@NonNull FiveAdCustomLayout fiveAdCustomLayout) {
    }

    default void onPause(@NonNull FiveAdCustomLayout fiveAdCustomLayout) {
    }

    default void onPlay(@NonNull FiveAdCustomLayout fiveAdCustomLayout) {
    }

    default void onRemove(@NonNull FiveAdCustomLayout fiveAdCustomLayout) {
    }

    default void onViewThrough(@NonNull FiveAdCustomLayout fiveAdCustomLayout) {
    }
}
