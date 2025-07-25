package com.five_corp.p372ad;

import androidx.annotation.NonNull;

/* renamed from: com.five_corp.ad.FiveAdLoadListener */
/* loaded from: classes4.dex */
public interface FiveAdLoadListener {
    void onFiveAdLoad(@NonNull FiveAdInterface fiveAdInterface);

    void onFiveAdLoadError(@NonNull FiveAdInterface fiveAdInterface, @NonNull FiveAdErrorCode fiveAdErrorCode);
}
