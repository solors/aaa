package net.pubnative.lite.sdk.vpaid.models.vast;

import net.pubnative.lite.sdk.vpaid.xml.Attribute;
import net.pubnative.lite.sdk.vpaid.xml.Tag;

/* loaded from: classes10.dex */
public class Linear {
    @Tag
    private AdParameters adParameters;
    @Tag
    private Duration duration;
    @Tag
    private Icons icons;
    @Tag
    private MediaFiles mediaFiles;
    @Attribute
    private String skipoffset;
    @Tag
    private TrackingEvents trackingEvents;
    @Tag
    private VideoClicks videoClicks;

    public AdParameters getAdParameters() {
        return this.adParameters;
    }

    public Duration getDuration() {
        return this.duration;
    }

    public Icons getIcons() {
        return this.icons;
    }

    public MediaFiles getMediaFiles() {
        return this.mediaFiles;
    }

    public String getSkipOffset() {
        return this.skipoffset;
    }

    public TrackingEvents getTrackingEvents() {
        return this.trackingEvents;
    }

    public VideoClicks getVideoClicks() {
        return this.videoClicks;
    }
}
