package com.smaato.sdk.interstitial;

import android.app.Activity;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import androidx.core.view.ViewCompat;

/* loaded from: classes7.dex */
public abstract class InterstitialAd extends InterstitialAdBase {
    @ColorInt
    protected int backgroundColor = ViewCompat.MEASURED_STATE_MASK;

    public void setBackgroundColor(@ColorInt int i) {
        this.backgroundColor = i;
    }

    public final void showAd(@NonNull Activity activity) {
        showAdInternal(activity);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract void showAdInternal(@NonNull Activity activity);
}
