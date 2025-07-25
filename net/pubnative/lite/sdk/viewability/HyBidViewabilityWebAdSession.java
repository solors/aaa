package net.pubnative.lite.sdk.viewability;

import android.webkit.WebView;
import com.iab.omid.library.pubnativenet.adsession.AdSession;
import com.iab.omid.library.pubnativenet.adsession.AdSessionConfiguration;
import com.iab.omid.library.pubnativenet.adsession.AdSessionContext;
import com.iab.omid.library.pubnativenet.adsession.CreativeType;
import com.iab.omid.library.pubnativenet.adsession.ImpressionType;
import com.iab.omid.library.pubnativenet.adsession.Owner;
import net.pubnative.lite.sdk.utils.Logger;

/* loaded from: classes10.dex */
public class HyBidViewabilityWebAdSession extends HyBidViewabilityAdSession {
    private static final String TAG = "HyBidViewabilityWebAdSession";

    public HyBidViewabilityWebAdSession(ViewabilityManager viewabilityManager) {
        super(viewabilityManager);
    }

    public void initAdSession(WebView webView, boolean z) {
        Owner owner;
        CreativeType creativeType;
        ImpressionType impressionType;
        Owner owner2;
        if (!this.viewabilityManager.isViewabilityMeasurementEnabled()) {
            return;
        }
        try {
            AdSessionContext createHtmlAdSessionContext = AdSessionContext.createHtmlAdSessionContext(this.viewabilityManager.getPartner(), webView, "", "");
            if (z) {
                owner = Owner.JAVASCRIPT;
            } else {
                owner = Owner.NATIVE;
            }
            if (z) {
                creativeType = CreativeType.DEFINED_BY_JAVASCRIPT;
            } else {
                creativeType = CreativeType.HTML_DISPLAY;
            }
            if (z) {
                impressionType = ImpressionType.DEFINED_BY_JAVASCRIPT;
            } else {
                impressionType = ImpressionType.BEGIN_TO_RENDER;
            }
            if (z) {
                owner2 = owner;
            } else {
                owner2 = Owner.NONE;
            }
            AdSession createAdSession = AdSession.createAdSession(AdSessionConfiguration.createAdSessionConfiguration(creativeType, impressionType, owner, owner2, false), createHtmlAdSessionContext);
            this.mAdSession = createAdSession;
            createAdSession.registerAdView(webView);
            createAdEvents();
            this.mAdSession.start();
        } catch (IllegalArgumentException e) {
            Logger.m14227e("", e.getMessage());
        } catch (NullPointerException e2) {
            Logger.m14226e(TAG, "OM SDK Ad Session - Exception", e2);
        }
    }
}
