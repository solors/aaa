package com.five_corp.p372ad;

import androidx.annotation.NonNull;

/* renamed from: com.five_corp.ad.FiveAdViewEventListener */
/* loaded from: classes4.dex */
public interface FiveAdViewEventListener {
    void onFiveAdClick(@NonNull FiveAdInterface fiveAdInterface);

    void onFiveAdClose(@NonNull FiveAdInterface fiveAdInterface);

    void onFiveAdImpression(@NonNull FiveAdInterface fiveAdInterface);

    void onFiveAdPause(@NonNull FiveAdInterface fiveAdInterface);

    void onFiveAdRecover(@NonNull FiveAdInterface fiveAdInterface);

    void onFiveAdReplay(@NonNull FiveAdInterface fiveAdInterface);

    void onFiveAdResume(@NonNull FiveAdInterface fiveAdInterface);

    void onFiveAdStall(@NonNull FiveAdInterface fiveAdInterface);

    void onFiveAdStart(@NonNull FiveAdInterface fiveAdInterface);

    void onFiveAdViewError(@NonNull FiveAdInterface fiveAdInterface, @NonNull FiveAdErrorCode fiveAdErrorCode);

    void onFiveAdViewThrough(@NonNull FiveAdInterface fiveAdInterface);
}
