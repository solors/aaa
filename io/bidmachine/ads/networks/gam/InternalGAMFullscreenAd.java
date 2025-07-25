package io.bidmachine.ads.networks.gam;

import android.app.Activity;
import androidx.annotation.NonNull;
import androidx.annotation.UiThread;
import io.bidmachine.AdsFormat;
import io.bidmachine.ads.networks.gam.InternalGAMAd;
import io.bidmachine.core.Logger;
import io.bidmachine.core.Utils;
import io.bidmachine.utils.BMError;

/* loaded from: classes9.dex */
public abstract class InternalGAMFullscreenAd extends InternalGAMAd {
    public InternalGAMFullscreenAd(@NonNull GAMLoader gAMLoader, @NonNull AdsFormat adsFormat, @NonNull GAMUnitData gAMUnitData) {
        super(gAMLoader, adsFormat, gAMUnitData);
    }

    public /* synthetic */ void lambda$show$0(Activity activity, InternalGAMFullscreenAdPresentListener internalGAMFullscreenAdPresentListener) {
        try {
            setStatus(InternalGAMAd.EnumC35253a.Showing);
            showAd(activity, internalGAMFullscreenAdPresentListener);
        } catch (Throwable th) {
            Logger.m20086w(th);
            internalGAMFullscreenAdPresentListener.onAdShowFailed(BMError.throwable("Exception showing InternalGAM object", th));
        }
    }

    public final void show(@NonNull final Activity activity, @NonNull final InternalGAMFullscreenAdPresentListener internalGAMFullscreenAdPresentListener) {
        Utils.onUiThread(new Runnable() { // from class: io.bidmachine.ads.networks.gam.a0
            {
                InternalGAMFullscreenAd.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                InternalGAMFullscreenAd.this.lambda$show$0(activity, internalGAMFullscreenAdPresentListener);
            }
        });
    }

    @UiThread
    protected abstract void showAd(@NonNull Activity activity, @NonNull InternalGAMFullscreenAdPresentListener internalGAMFullscreenAdPresentListener) throws Throwable;
}
