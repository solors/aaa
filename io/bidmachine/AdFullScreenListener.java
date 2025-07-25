package io.bidmachine;

import androidx.annotation.NonNull;
import io.bidmachine.IAd;

/* loaded from: classes9.dex */
public interface AdFullScreenListener<AdType extends IAd> {
    void onAdClosed(@NonNull AdType adtype, boolean z);
}
