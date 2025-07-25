package net.pubnative.lite.sdk.vpaid.models.vast;

import java.util.List;
import net.pubnative.lite.sdk.vpaid.xml.Tag;

/* loaded from: classes10.dex */
public class TrackingEvents {
    @Tag(com.smaato.sdk.video.vast.model.Tracking.NAME)
    private List<Tracking> trackingList;

    public List<Tracking> getTrackingList() {
        return this.trackingList;
    }
}
