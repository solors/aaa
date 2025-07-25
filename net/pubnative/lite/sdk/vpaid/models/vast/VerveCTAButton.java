package net.pubnative.lite.sdk.vpaid.models.vast;

import net.pubnative.lite.sdk.vpaid.xml.Tag;

/* loaded from: classes10.dex */
public class VerveCTAButton {
    @Tag
    private HTMLResource htmlResource;
    @Tag
    private TrackingEvents trackingEvents;

    public HTMLResource getHtmlResource() {
        return this.htmlResource;
    }

    public TrackingEvents getTrackingEvents() {
        return this.trackingEvents;
    }
}
