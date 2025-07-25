package com.monetization.ads.mediation.banner;

import android.content.Context;
import android.view.View;
import com.monetization.ads.mediation.base.C25606a;
import com.monetization.ads.mediation.base.MediatedAdRequestError;
import java.util.Map;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes7.dex */
public abstract class MediatedBannerAdapter extends C25606a {

    @Metadata
    /* loaded from: classes7.dex */
    public interface MediatedBannerAdapterListener {
        void onAdClicked();

        void onAdFailedToLoad(@NotNull MediatedAdRequestError mediatedAdRequestError);

        void onAdImpression();

        void onAdLeftApplication();

        void onAdLoaded(@NotNull View view);
    }

    public abstract void loadBanner(@NotNull Context context, @NotNull MediatedBannerAdapterListener mediatedBannerAdapterListener, @NotNull Map<String, ? extends Object> map, @NotNull Map<String, String> map2);

    public abstract void onInvalidate();
}
