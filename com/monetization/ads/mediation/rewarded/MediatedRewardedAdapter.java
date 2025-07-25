package com.monetization.ads.mediation.rewarded;

import android.app.Activity;
import android.content.Context;
import com.monetization.ads.mediation.base.C25606a;
import java.util.Map;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes7.dex */
public abstract class MediatedRewardedAdapter extends C25606a {
    public abstract boolean isLoaded();

    public abstract void loadRewardedAd(@NotNull Context context, @NotNull MediatedRewardedAdapterListener mediatedRewardedAdapterListener, @NotNull Map<String, ? extends Object> map, @NotNull Map<String, String> map2);

    public abstract void onInvalidate();

    public abstract void showRewardedAd(@NotNull Activity activity);
}
