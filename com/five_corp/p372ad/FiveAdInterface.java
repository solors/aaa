package com.five_corp.p372ad;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* renamed from: com.five_corp.ad.FiveAdInterface */
/* loaded from: classes4.dex */
public interface FiveAdInterface {
    void enableSound(boolean z);

    @NonNull
    CreativeType getCreativeType();

    @Nullable
    String getFiveAdTag();

    @NonNull
    String getSlotId();

    @NonNull
    @Deprecated
    FiveAdState getState();

    boolean isSoundEnabled();

    void setFiveAdTag(@NonNull String str);

    void setLoadListener(@NonNull FiveAdLoadListener fiveAdLoadListener);

    @Deprecated
    void setViewEventListener(@NonNull FiveAdViewEventListener fiveAdViewEventListener);
}
