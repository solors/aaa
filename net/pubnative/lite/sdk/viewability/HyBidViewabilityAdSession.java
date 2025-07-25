package net.pubnative.lite.sdk.viewability;

import android.text.TextUtils;
import android.view.View;
import com.iab.omid.library.pubnativenet.ScriptInjector;
import com.iab.omid.library.pubnativenet.adsession.AdEvents;
import com.iab.omid.library.pubnativenet.adsession.AdSession;
import com.iab.omid.library.pubnativenet.adsession.FriendlyObstructionPurpose;
import com.iab.omid.library.pubnativenet.adsession.VerificationScriptResource;
import java.util.ArrayList;
import java.util.List;
import net.pubnative.lite.sdk.utils.Logger;

/* loaded from: classes10.dex */
public abstract class HyBidViewabilityAdSession {
    private static final String TAG = "HyBidViewabilityAdSession";
    protected AdEvents mAdEvents;
    protected AdSession mAdSession;
    protected final List<VerificationScriptResource> mVerificationScriptResources = new ArrayList();
    final ViewabilityManager viewabilityManager;

    public HyBidViewabilityAdSession(ViewabilityManager viewabilityManager) {
        this.viewabilityManager = viewabilityManager;
    }

    public void addFriendlyObstruction(View view, FriendlyObstructionPurpose friendlyObstructionPurpose, String str) {
        AdSession adSession;
        if (view != null && (adSession = this.mAdSession) != null) {
            adSession.addFriendlyObstruction(view, friendlyObstructionPurpose, str);
        }
    }

    public void addVerificationScriptResource(VerificationScriptResource verificationScriptResource) {
        this.mVerificationScriptResources.add(verificationScriptResource);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void createAdEvents() {
        AdSession adSession = this.mAdSession;
        if (adSession != null) {
            this.mAdEvents = AdEvents.createAdEvents(adSession);
        }
    }

    public void fireImpression() {
        AdEvents adEvents;
        if (this.viewabilityManager.isViewabilityMeasurementEnabled() && (adEvents = this.mAdEvents) != null) {
            try {
                adEvents.impressionOccurred();
            } catch (IllegalArgumentException | IllegalStateException e) {
                e.printStackTrace();
            }
        }
    }

    public void fireLoaded() {
        AdEvents adEvents;
        if (this.viewabilityManager.isViewabilityMeasurementEnabled() && (adEvents = this.mAdEvents) != null) {
            try {
                adEvents.loaded();
            } catch (IllegalArgumentException | IllegalStateException e) {
                e.printStackTrace();
            }
        }
    }

    public boolean isVerificationResourcesPresent() {
        List<VerificationScriptResource> list = this.mVerificationScriptResources;
        if (list != null && !list.isEmpty()) {
            return true;
        }
        return false;
    }

    public String prependOMJS(String str) {
        if (!this.viewabilityManager.isViewabilityMeasurementEnabled()) {
            return str;
        }
        try {
            if (!TextUtils.isEmpty(this.viewabilityManager.getServiceJs())) {
                return ScriptInjector.injectScriptContentIntoHtml(this.viewabilityManager.getServiceJs(), str);
            }
            return str;
        } catch (Exception e) {
            e.printStackTrace();
            return str;
        }
    }

    public void removeAllFriendlyObstructions() {
        AdSession adSession;
        if (this.viewabilityManager.isViewabilityMeasurementEnabled() && (adSession = this.mAdSession) != null) {
            adSession.removeAllFriendlyObstructions();
        }
    }

    public void removeFriendlyObstruction(View view) {
        AdSession adSession;
        if (this.viewabilityManager.isViewabilityMeasurementEnabled() && (adSession = this.mAdSession) != null) {
            adSession.removeFriendlyObstruction(view);
        }
    }

    public void stopAdSession() {
        AdSession adSession;
        if (this.viewabilityManager.isViewabilityMeasurementEnabled() && (adSession = this.mAdSession) != null) {
            try {
                adSession.finish();
            } catch (RuntimeException e) {
                Logger.m14227e(TAG, e.getMessage());
            }
            this.mAdSession = null;
        }
    }
}
