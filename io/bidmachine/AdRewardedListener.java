package io.bidmachine;

import androidx.annotation.NonNull;
import io.bidmachine.IAd;

/* loaded from: classes9.dex */
public interface AdRewardedListener<AdType extends IAd> {
    void onAdRewarded(@NonNull AdType adtype);
}
