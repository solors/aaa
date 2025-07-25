package net.pubnative.lite.sdk.mrect.presenter;

import android.content.Context;
import net.pubnative.lite.sdk.banner.presenter.BannerPresenterFactory;
import net.pubnative.lite.sdk.models.IntegrationType;

@Deprecated
/* loaded from: classes10.dex */
public class MRectPresenterFactory extends BannerPresenterFactory {
    public MRectPresenterFactory(Context context) {
        super(context, IntegrationType.STANDALONE);
    }
}
