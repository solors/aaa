package com.amazon.aps.ads.listeners;

import androidx.annotation.NonNull;
import com.amazon.aps.ads.ApsAd;
import com.amazon.aps.ads.ApsAdError;

/* loaded from: classes2.dex */
public interface ApsAdRequestListener {
    void onFailure(@NonNull ApsAdError apsAdError);

    void onSuccess(@NonNull ApsAd apsAd);
}
