package io.bidmachine.ads.networks.gam;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.bidmachine.AdsFormat;

/* loaded from: classes9.dex */
public abstract class InternalGAMBannerAd extends InternalGAMAd {
    public InternalGAMBannerAd(@NonNull GAMLoader gAMLoader, @NonNull AdsFormat adsFormat, @NonNull GAMUnitData gAMUnitData) {
        super(gAMLoader, adsFormat, gAMUnitData);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Nullable
    public abstract View getAdView();
}
