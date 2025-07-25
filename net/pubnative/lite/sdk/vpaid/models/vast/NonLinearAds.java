package net.pubnative.lite.sdk.vpaid.models.vast;

import java.util.List;
import net.pubnative.lite.sdk.vpaid.xml.Tag;

/* loaded from: classes10.dex */
public class NonLinearAds {
    @Tag("NonLinear")
    private List<NonLinear> nonLinearList;
    @Tag
    private TrackingEvents trackingEvents;

    public List<NonLinear> getNonLinearList() {
        return this.nonLinearList;
    }

    public TrackingEvents getTrackingEvents() {
        return this.trackingEvents;
    }
}
