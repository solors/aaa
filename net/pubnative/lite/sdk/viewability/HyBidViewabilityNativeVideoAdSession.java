package net.pubnative.lite.sdk.viewability;

import android.view.View;
import com.iab.omid.library.pubnativenet.adsession.AdEvents;
import com.iab.omid.library.pubnativenet.adsession.AdSession;
import com.iab.omid.library.pubnativenet.adsession.AdSessionConfiguration;
import com.iab.omid.library.pubnativenet.adsession.AdSessionContext;
import com.iab.omid.library.pubnativenet.adsession.CreativeType;
import com.iab.omid.library.pubnativenet.adsession.ImpressionType;
import com.iab.omid.library.pubnativenet.adsession.Owner;
import com.iab.omid.library.pubnativenet.adsession.VerificationScriptResource;
import com.iab.omid.library.pubnativenet.adsession.media.InteractionType;
import com.iab.omid.library.pubnativenet.adsession.media.MediaEvents;
import com.iab.omid.library.pubnativenet.adsession.media.Position;
import com.iab.omid.library.pubnativenet.adsession.media.VastProperties;
import java.util.List;
import net.pubnative.lite.sdk.utils.Logger;

/* loaded from: classes10.dex */
public class HyBidViewabilityNativeVideoAdSession extends HyBidViewabilityNativeAdSession {
    private static final String OM_EXCEPTION = "OM SDK Ad Session - Exception";
    private static final String TAG = "HyBidViewabilityNativeVideoAdSession";
    private boolean completeFired;
    private boolean firstQuartileFired;
    private MediaEvents mMediaEvents;
    private boolean midpointFired;
    private boolean muted;
    private boolean startFired;
    private boolean thirdQuartileFired;

    public HyBidViewabilityNativeVideoAdSession(ViewabilityManager viewabilityManager) {
        super(viewabilityManager);
        this.startFired = false;
        this.firstQuartileFired = false;
        this.midpointFired = false;
        this.thirdQuartileFired = false;
        this.completeFired = false;
        this.muted = true;
    }

    protected void createMediaEvents() {
        try {
            AdSession adSession = this.mAdSession;
            if (adSession != null) {
                this.mMediaEvents = MediaEvents.createMediaEvents(adSession);
            }
        } catch (Exception e) {
            Logger.m14226e(TAG, OM_EXCEPTION, e);
        }
    }

    public void fireBufferFinish() {
        MediaEvents mediaEvents;
        try {
            if (this.viewabilityManager.isViewabilityMeasurementEnabled() && (mediaEvents = this.mMediaEvents) != null) {
                mediaEvents.bufferFinish();
            }
        } catch (Exception e) {
            Logger.m14226e(TAG, OM_EXCEPTION, e);
        }
    }

    public void fireBufferStart() {
        MediaEvents mediaEvents;
        try {
            if (this.viewabilityManager.isViewabilityMeasurementEnabled() && (mediaEvents = this.mMediaEvents) != null) {
                mediaEvents.bufferStart();
            }
        } catch (Exception e) {
            Logger.m14226e(TAG, OM_EXCEPTION, e);
        }
    }

    public void fireClick() {
        MediaEvents mediaEvents;
        try {
            if (this.viewabilityManager.isViewabilityMeasurementEnabled() && (mediaEvents = this.mMediaEvents) != null) {
                mediaEvents.adUserInteraction(InteractionType.CLICK);
            }
        } catch (Exception e) {
            Logger.m14226e(TAG, OM_EXCEPTION, e);
        }
    }

    public void fireComplete() {
        MediaEvents mediaEvents;
        try {
            if (this.viewabilityManager.isViewabilityMeasurementEnabled() && (mediaEvents = this.mMediaEvents) != null && !this.completeFired) {
                mediaEvents.complete();
                this.completeFired = true;
            }
        } catch (Exception e) {
            Logger.m14226e(TAG, OM_EXCEPTION, e);
        }
    }

    public void fireFirstQuartile() {
        MediaEvents mediaEvents;
        try {
            if (this.viewabilityManager.isViewabilityMeasurementEnabled() && (mediaEvents = this.mMediaEvents) != null && !this.firstQuartileFired) {
                mediaEvents.firstQuartile();
                this.firstQuartileFired = true;
            }
        } catch (Exception e) {
            Logger.m14226e(TAG, OM_EXCEPTION, e);
        }
    }

    @Override // net.pubnative.lite.sdk.viewability.HyBidViewabilityAdSession
    public void fireLoaded() {
        try {
            if (!this.viewabilityManager.isViewabilityMeasurementEnabled()) {
                return;
            }
            VastProperties createVastPropertiesForNonSkippableMedia = VastProperties.createVastPropertiesForNonSkippableMedia(false, Position.STANDALONE);
            AdEvents adEvents = this.mAdEvents;
            if (adEvents != null) {
                adEvents.loaded(createVastPropertiesForNonSkippableMedia);
            }
        } catch (Exception e) {
            Logger.m14226e(TAG, OM_EXCEPTION, e);
        }
    }

    public void fireMidpoint() {
        MediaEvents mediaEvents;
        try {
            if (this.viewabilityManager.isViewabilityMeasurementEnabled() && (mediaEvents = this.mMediaEvents) != null && !this.midpointFired) {
                mediaEvents.midpoint();
                this.midpointFired = true;
            }
        } catch (Exception e) {
            Logger.m14226e(TAG, OM_EXCEPTION, e);
        }
    }

    public void firePause() {
        MediaEvents mediaEvents;
        try {
            if (this.viewabilityManager.isViewabilityMeasurementEnabled() && (mediaEvents = this.mMediaEvents) != null) {
                mediaEvents.pause();
            }
        } catch (Exception e) {
            Logger.m14226e(TAG, OM_EXCEPTION, e);
        }
    }

    public void fireResume() {
        MediaEvents mediaEvents;
        try {
            if (this.viewabilityManager.isViewabilityMeasurementEnabled() && (mediaEvents = this.mMediaEvents) != null) {
                mediaEvents.resume();
            }
        } catch (Exception e) {
            Logger.m14226e(TAG, OM_EXCEPTION, e);
        }
    }

    public void fireSkipped() {
        MediaEvents mediaEvents;
        try {
            if (this.viewabilityManager.isViewabilityMeasurementEnabled() && (mediaEvents = this.mMediaEvents) != null) {
                mediaEvents.skipped();
            }
        } catch (Exception e) {
            Logger.m14226e(TAG, OM_EXCEPTION, e);
        }
    }

    public void fireStart(float f, boolean z) {
        MediaEvents mediaEvents;
        float f2;
        try {
            if (this.viewabilityManager.isViewabilityMeasurementEnabled() && (mediaEvents = this.mMediaEvents) != null && !this.startFired) {
                if (z) {
                    f2 = 0.0f;
                } else {
                    f2 = 1.0f;
                }
                mediaEvents.start(f, f2);
                this.startFired = true;
            }
        } catch (Exception e) {
            Logger.m14226e(TAG, OM_EXCEPTION, e);
        }
    }

    public void fireThirdQuartile() {
        MediaEvents mediaEvents;
        try {
            if (this.viewabilityManager.isViewabilityMeasurementEnabled() && (mediaEvents = this.mMediaEvents) != null && !this.thirdQuartileFired) {
                mediaEvents.thirdQuartile();
                this.thirdQuartileFired = true;
            }
        } catch (Exception e) {
            Logger.m14226e(TAG, OM_EXCEPTION, e);
        }
    }

    public void fireVolumeChange(boolean z) {
        float f;
        try {
            if (this.viewabilityManager.isViewabilityMeasurementEnabled() && z != this.muted) {
                this.muted = z;
                MediaEvents mediaEvents = this.mMediaEvents;
                if (mediaEvents != null && !this.completeFired) {
                    if (z) {
                        f = 0.0f;
                    } else {
                        f = 1.0f;
                    }
                    mediaEvents.volumeChange(f);
                }
            }
        } catch (Exception e) {
            Logger.m14226e(TAG, OM_EXCEPTION, e);
        }
    }

    public void initAdSession(View view, List<VerificationScriptResource> list) {
        if (!this.viewabilityManager.isViewabilityMeasurementEnabled()) {
            return;
        }
        this.mVerificationScriptResources.addAll(list);
        try {
            AdSessionContext createNativeAdSessionContext = AdSessionContext.createNativeAdSessionContext(this.viewabilityManager.getPartner(), this.viewabilityManager.getServiceJs(), this.mVerificationScriptResources, "", "");
            CreativeType creativeType = CreativeType.VIDEO;
            ImpressionType impressionType = ImpressionType.BEGIN_TO_RENDER;
            Owner owner = Owner.NATIVE;
            AdSession createAdSession = AdSession.createAdSession(AdSessionConfiguration.createAdSessionConfiguration(creativeType, impressionType, owner, owner, false), createNativeAdSessionContext);
            this.mAdSession = createAdSession;
            createAdSession.registerAdView(view);
            createAdEvents();
            createMediaEvents();
            this.mAdSession.start();
        } catch (Exception e) {
            Logger.m14226e(TAG, OM_EXCEPTION, e);
        }
    }
}
