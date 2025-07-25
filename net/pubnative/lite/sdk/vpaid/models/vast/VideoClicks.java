package net.pubnative.lite.sdk.vpaid.models.vast;

import java.util.List;
import net.pubnative.lite.sdk.vpaid.xml.Tag;

/* loaded from: classes10.dex */
public class VideoClicks {
    @Tag
    private ClickThrough clickThrough;
    @Tag(com.smaato.sdk.video.vast.model.VideoClicks.CLICK_TRACKING)
    private List<ClickTracking> clickTrackingList;
    @Tag(com.smaato.sdk.video.vast.model.VideoClicks.CUSTOM_CLICK)
    private List<CustomClick> customClickList;

    public ClickThrough getClickThrough() {
        return this.clickThrough;
    }

    public List<ClickTracking> getClickTrackingList() {
        return this.clickTrackingList;
    }

    public List<CustomClick> getCustomClickList() {
        return this.customClickList;
    }
}
