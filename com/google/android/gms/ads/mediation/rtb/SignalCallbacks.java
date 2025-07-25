package com.google.android.gms.ads.mediation.rtb;

import androidx.annotation.NonNull;
import com.google.android.gms.ads.AdError;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* loaded from: classes4.dex */
public interface SignalCallbacks {
    void onFailure(@NonNull AdError adError);

    @Deprecated
    void onFailure(@NonNull String str);

    void onSuccess(@NonNull String str);
}
