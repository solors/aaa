package com.pubmatic.sdk.common;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.pubmatic.sdk.common.base.POBBidsProvider;

/* loaded from: classes7.dex */
public interface POBAdServerSignalingEventListener {
    @Nullable
    POBBidsProvider getBidsProvider();

    void onAdServerWin();

    void onFailed(@NonNull POBError pOBError);

    void onOpenWrapPartnerWin(@Nullable String str);
}
