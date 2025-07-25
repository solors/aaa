package com.monetization.ads.mediation.appopenad;

import android.app.Activity;
import android.content.Context;
import com.monetization.ads.mediation.base.C25606a;
import com.monetization.ads.mediation.base.MediatedAdRequestError;
import java.util.Map;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes7.dex */
public abstract class MediatedAppOpenAdAdapter extends C25606a {

    @Metadata
    /* loaded from: classes7.dex */
    public interface MediatedAppOpenAdAdapterListener {
        void onAdImpression();

        void onAppOpenAdClicked();

        void onAppOpenAdDismissed();

        void onAppOpenAdFailedToLoad(@NotNull MediatedAdRequestError mediatedAdRequestError);

        void onAppOpenAdLeftApplication();

        void onAppOpenAdLoaded();

        void onAppOpenAdShown();
    }

    public abstract boolean isLoaded();

    public abstract void loadAppOpenAd(@NotNull Context context, @NotNull MediatedAppOpenAdAdapterListener mediatedAppOpenAdAdapterListener, @NotNull Map<String, ? extends Object> map, @NotNull Map<String, String> map2);

    public abstract void onInvalidate();

    public abstract void showAppOpenAd(@NotNull Activity activity);
}
