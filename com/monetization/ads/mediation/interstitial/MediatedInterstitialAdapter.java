package com.monetization.ads.mediation.interstitial;

import android.app.Activity;
import android.content.Context;
import com.monetization.ads.mediation.base.C25606a;
import com.monetization.ads.mediation.base.MediatedAdRequestError;
import java.util.Map;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes7.dex */
public abstract class MediatedInterstitialAdapter extends C25606a {

    @Metadata
    /* loaded from: classes7.dex */
    public interface MediatedInterstitialAdapterListener {
        void onAdImpression();

        void onInterstitialClicked();

        void onInterstitialDismissed();

        void onInterstitialFailedToLoad(@NotNull MediatedAdRequestError mediatedAdRequestError);

        void onInterstitialLeftApplication();

        void onInterstitialLoaded();

        void onInterstitialShown();
    }

    public abstract boolean isLoaded();

    public abstract void loadInterstitial(@NotNull Context context, @NotNull MediatedInterstitialAdapterListener mediatedInterstitialAdapterListener, @NotNull Map<String, ? extends Object> map, @NotNull Map<String, String> map2);

    public abstract void onInvalidate();

    public abstract void showInterstitial(@NotNull Activity activity);
}
