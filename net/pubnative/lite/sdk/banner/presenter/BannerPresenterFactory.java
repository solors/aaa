package net.pubnative.lite.sdk.banner.presenter;

import android.content.Context;
import net.pubnative.lite.sdk.models.AdSize;
import net.pubnative.lite.sdk.models.C38595Ad;
import net.pubnative.lite.sdk.models.ImpressionTrackingMethod;
import net.pubnative.lite.sdk.models.IntegrationType;
import net.pubnative.lite.sdk.presenter.AdPresenter;
import net.pubnative.lite.sdk.presenter.PresenterFactory;
import net.pubnative.lite.sdk.utils.Logger;

/* loaded from: classes10.dex */
public class BannerPresenterFactory extends PresenterFactory {
    private static final String TAG = "BannerPresenterFactory";

    public BannerPresenterFactory(Context context, IntegrationType integrationType) {
        super(context, integrationType);
    }

    @Override // net.pubnative.lite.sdk.presenter.PresenterFactory
    public AdPresenter fromCreativeType(int i, C38595Ad c38595Ad, AdSize adSize) {
        return fromCreativeType(i, c38595Ad, adSize, ImpressionTrackingMethod.AD_VIEWABLE);
    }

    @Override // net.pubnative.lite.sdk.presenter.PresenterFactory
    protected AdPresenter fromCreativeType(int i, C38595Ad c38595Ad, AdSize adSize, ImpressionTrackingMethod impressionTrackingMethod) {
        if (c38595Ad != null && c38595Ad.getImpressionTrackingMethod() != null && ImpressionTrackingMethod.fromString(c38595Ad.getImpressionTrackingMethod()) != null) {
            impressionTrackingMethod = ImpressionTrackingMethod.fromString(c38595Ad.getImpressionTrackingMethod());
        }
        ImpressionTrackingMethod impressionTrackingMethod2 = impressionTrackingMethod;
        if (i != 4) {
            if (i != 8 && i != 10 && i != 12) {
                switch (i) {
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                    case 29:
                        break;
                    default:
                        String str = TAG;
                        Logger.m14227e(str, "Incompatible asset group type: " + i + ", for banner ad format.");
                        return null;
                }
            }
            return new MraidAdPresenter(getContext(), c38595Ad, adSize, impressionTrackingMethod2);
        }
        return new VastAdPresenter(getContext(), c38595Ad, adSize, impressionTrackingMethod2, this.mIntegrationType);
    }
}
