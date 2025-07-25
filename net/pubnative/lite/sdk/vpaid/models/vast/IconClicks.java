package net.pubnative.lite.sdk.vpaid.models.vast;

import java.util.List;
import net.pubnative.lite.sdk.vpaid.xml.Tag;

/* loaded from: classes10.dex */
public class IconClicks {
    @Tag
    private IconClickFallbackImages iconClickFallbackImages;
    @Tag
    private IconClickThrough iconClickThrough;
    @Tag("IconClickTracking")
    private List<IconClickTracking> iconClickTrackingList;

    public IconClickFallbackImages getIconClickFallbackImages() {
        return this.iconClickFallbackImages;
    }

    public IconClickThrough getIconClickThrough() {
        return this.iconClickThrough;
    }

    public List<IconClickTracking> getIconClickTrackingList() {
        return this.iconClickTrackingList;
    }
}
