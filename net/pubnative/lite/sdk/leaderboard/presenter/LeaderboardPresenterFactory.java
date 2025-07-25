package net.pubnative.lite.sdk.leaderboard.presenter;

import android.content.Context;
import net.pubnative.lite.sdk.banner.presenter.BannerPresenterFactory;
import net.pubnative.lite.sdk.models.IntegrationType;

@Deprecated
/* loaded from: classes10.dex */
public class LeaderboardPresenterFactory extends BannerPresenterFactory {
    public LeaderboardPresenterFactory(Context context) {
        super(context, IntegrationType.STANDALONE);
    }
}
