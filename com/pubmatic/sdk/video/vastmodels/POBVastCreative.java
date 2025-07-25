package com.pubmatic.sdk.video.vastmodels;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.ironsource.C21114v8;
import com.pubmatic.sdk.video.xmlserialiser.POBNodeBuilder;
import com.pubmatic.sdk.video.xmlserialiser.POBXMLNodeListener;
import com.zeus.gmc.sdk.mobileads.columbus.internal.cioiic.C32664c2oc2i;
import java.util.ArrayList;
import java.util.List;
import net.pubnative.lite.sdk.vpaid.enums.EventConstants;

/* loaded from: classes7.dex */
public abstract class POBVastCreative implements POBXMLNodeListener {
    @Nullable
    protected String mClickThroughURL;
    @Nullable
    protected List<String> mClickTrackers;

    /* loaded from: classes7.dex */
    public enum CreativeType {
        LINEAR,
        NONLINEAR,
        COMPANION
    }

    /* loaded from: classes7.dex */
    public enum POBEventTypes {
        CREATIVE_VIEW("creativeview"),
        START("start"),
        FIRST_QUARTILE("firstquartile"),
        MID_POINT("midpoint"),
        THIRD_QUARTILE("thirdQuartile"),
        COMPLETE("complete"),
        MUTE("mute"),
        UNMUTE("unmute"),
        PAUSE("pause"),
        REWIND("rewind"),
        RESUME("resume"),
        FULL_SCREEN("fullscreen"),
        EXIT_FULL_SCREEN(C32664c2oc2i.c222o2o2c2o),
        EXPAND("expand"),
        COLLAPSE(C32664c2oc2i.ciio2c),
        ACCEPT_INVITATION_LINEAR("acceptInvitationLinear"),
        CLOSE_LINEAR("closeLinear"),
        SKIP(EventConstants.SKIP),
        PROGRESS("progress"),
        AD_EXPAND(EventConstants.AD_EXPAND),
        AD_COLLAPSE(EventConstants.AD_COLLAPSE),
        MINIMIZE(EventConstants.MINIMIZE),
        OVERLAY_VIEW_DURATION(EventConstants.OVERLAY_VIEW_DURATION),
        CLOSE("close"),
        OTHER_AD_INTERACTION(EventConstants.OTHER_AD_INTERACTION),
        LOADED(C21114v8.C21122h.f54087r),
        PLAYER_EXPAND(EventConstants.PLAYER_EXPAND),
        PLAYER_COLLAPSE(EventConstants.PLAYER_COLLAPSE),
        NOT_USED(EventConstants.NOT_USED);
        

        /* renamed from: b */
        private final String f71112b;

        POBEventTypes(String str) {
            this.f71112b = str;
        }

        public String getValue() {
            return this.f71112b;
        }
    }

    @Override // com.pubmatic.sdk.video.xmlserialiser.POBXMLNodeListener
    public abstract /* synthetic */ void build(@NonNull POBNodeBuilder pOBNodeBuilder);

    @Nullable
    public String getClickThroughURL() {
        return this.mClickThroughURL;
    }

    @Nullable
    public List<String> getClickTrackers() {
        return this.mClickTrackers;
    }

    @NonNull
    public List<String> getTrackingEventUrls(@NonNull POBEventTypes pOBEventTypes) {
        ArrayList arrayList = new ArrayList();
        List<POBTracking> trackingEvents = getTrackingEvents(pOBEventTypes);
        if (trackingEvents != null) {
            for (POBTracking pOBTracking : trackingEvents) {
                arrayList.add(pOBTracking.getUrl());
            }
        }
        return arrayList;
    }

    @Nullable
    abstract List<POBTracking> getTrackingEvents();

    @Nullable
    public List<POBTracking> getTrackingEvents(@NonNull POBEventTypes pOBEventTypes) {
        ArrayList arrayList = new ArrayList();
        List<POBTracking> trackingEvents = getTrackingEvents();
        if (trackingEvents != null) {
            for (POBTracking pOBTracking : trackingEvents) {
                if (pOBTracking.getEvent() != null && pOBTracking.getEvent().equalsIgnoreCase(pOBEventTypes.getValue())) {
                    arrayList.add(pOBTracking);
                }
            }
        }
        return arrayList;
    }

    public abstract CreativeType getVastCreativeType();
}
