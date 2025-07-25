package net.pubnative.lite.sdk.viewability;

import android.view.View;
import com.iab.omid.library.pubnativenet.adsession.AdSession;
import com.iab.omid.library.pubnativenet.adsession.AdSessionConfiguration;
import com.iab.omid.library.pubnativenet.adsession.AdSessionContext;
import com.iab.omid.library.pubnativenet.adsession.CreativeType;
import com.iab.omid.library.pubnativenet.adsession.ImpressionType;
import com.iab.omid.library.pubnativenet.adsession.Owner;
import net.pubnative.lite.sdk.utils.Logger;

/* loaded from: classes10.dex */
public class HyBidViewabilityNativeAdSession extends HyBidViewabilityAdSession {
    private static final String TAG = "HyBidViewabilityNativeAdSession";

    public HyBidViewabilityNativeAdSession(ViewabilityManager viewabilityManager) {
        super(viewabilityManager);
    }

    public void initAdSession(View view) {
        if (!this.viewabilityManager.isViewabilityMeasurementEnabled()) {
            return;
        }
        try {
            AdSession createAdSession = AdSession.createAdSession(AdSessionConfiguration.createAdSessionConfiguration(CreativeType.NATIVE_DISPLAY, ImpressionType.BEGIN_TO_RENDER, Owner.NATIVE, Owner.NONE, false), AdSessionContext.createNativeAdSessionContext(this.viewabilityManager.getPartner(), this.viewabilityManager.getServiceJs(), this.mVerificationScriptResources, "", ""));
            this.mAdSession = createAdSession;
            createAdSession.registerAdView(view);
            createAdEvents();
            this.mAdSession.start();
        } catch (IllegalArgumentException e) {
            Logger.m14227e("", e.getMessage());
        } catch (NullPointerException e2) {
            Logger.m14226e(TAG, "OM SDK Ad Session - Exception", e2);
        }
    }
}
