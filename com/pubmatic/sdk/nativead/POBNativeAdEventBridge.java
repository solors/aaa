package com.pubmatic.sdk.nativead;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.pubmatic.sdk.common.POBAdServerSignalingEventListener;
import com.pubmatic.sdk.openwrap.core.POBBaseEvent;

/* loaded from: classes7.dex */
public abstract class POBNativeAdEventBridge extends POBBaseEvent {
    @Nullable
    public abstract View getAdServerView();

    public abstract void setNativeAdEventListener(@NonNull POBNativeAdEventListener pOBNativeAdEventListener);

    public abstract void setSignalingEventListener(@NonNull POBAdServerSignalingEventListener pOBAdServerSignalingEventListener);

    public abstract void trackClick();

    public abstract void trackImpression();
}
