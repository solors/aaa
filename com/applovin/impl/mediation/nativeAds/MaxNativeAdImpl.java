package com.applovin.impl.mediation.nativeAds;

import android.view.View;
import androidx.annotation.Nullable;
import com.applovin.impl.mediation.ads.C4861b;
import java.util.List;

/* loaded from: classes2.dex */
public class MaxNativeAdImpl {
    private C4861b adViewTracker;
    private List<View> clickableViews;

    @Nullable
    public C4861b getAdViewTracker() {
        return this.adViewTracker;
    }

    @Nullable
    public List<View> getClickableViews() {
        return this.clickableViews;
    }

    public void setAdViewTracker(C4861b c4861b) {
        this.adViewTracker = c4861b;
    }

    public void setClickableViews(List<View> list) {
        this.clickableViews = list;
    }
}
