package com.smaato.sdk.rewarded.view;

import android.content.Context;
import android.content.Intent;
import androidx.annotation.NonNull;
import com.smaato.sdk.core.util.Objects;
import com.smaato.sdk.interstitial.view.InterstitialAdActivity;
import java.util.UUID;

/* loaded from: classes7.dex */
public class RewardedInterstitialAdActivity extends InterstitialAdActivity {
    @NonNull
    public static Intent createIntent(@NonNull Context context, @NonNull UUID uuid) {
        Objects.requireNonNull(context);
        Objects.requireNonNull(uuid);
        return new Intent(context, RewardedInterstitialAdActivity.class).putExtra("KEY_PRESENTER_UUID", uuid).putExtra("KEY_BACKGROUND_COLOR", 0).putExtra("KEY_IS_SPLASH", false).addFlags(268435456);
    }
}
