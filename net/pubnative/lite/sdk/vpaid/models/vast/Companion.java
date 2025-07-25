package net.pubnative.lite.sdk.vpaid.models.vast;

import java.util.List;
import net.pubnative.lite.sdk.vpaid.xml.Attribute;
import net.pubnative.lite.sdk.vpaid.xml.Tag;

/* loaded from: classes10.dex */
public class Companion {
    @Tag
    private AdParameters adParameters;
    @Attribute
    private String adSlotId;
    @Tag
    private AltText altText;
    @Attribute
    private String apiFramework;
    @Attribute
    private String assetHeight;
    @Attribute
    private String assetWidth;
    @Tag
    private CompanionClickThrough companionClickThrough;
    @Tag(com.smaato.sdk.video.vast.model.Companion.COMPANION_CLICK_TRACKING)
    private List<CompanionClickTracking> companionClickTrackingList;
    @Attribute
    private String expandedHeight;
    @Attribute
    private String expandedWidth;
    @Attribute
    private String height;
    @Tag("HTMLResource")
    private List<HTMLResource> htmlResources;
    @Tag("IFrameResource")
    private List<IFrameResource> iFrameResources;
    @Attribute

    /* renamed from: id */
    private String f102184id;
    @Attribute
    private String pxratio;
    @Attribute
    private String renderingMode;
    @Tag("StaticResource")
    private List<StaticResource> staticResources;
    @Tag
    private TrackingEvents trackingEvents;
    @Attribute
    private String width;

    public AdParameters getAdParameters() {
        return this.adParameters;
    }

    public String getAdSlotId() {
        return this.adSlotId;
    }

    public AltText getAltText() {
        return this.altText;
    }

    public String getApiFramework() {
        return this.apiFramework;
    }

    public String getAssetHeight() {
        return this.assetHeight;
    }

    public String getAssetWidth() {
        return this.assetWidth;
    }

    public CompanionClickThrough getCompanionClickThrough() {
        return this.companionClickThrough;
    }

    public List<CompanionClickTracking> getCompanionClickTrackingList() {
        return this.companionClickTrackingList;
    }

    public String getExpandedHeight() {
        return this.expandedHeight;
    }

    public String getExpandedWidth() {
        return this.expandedWidth;
    }

    public String getHeight() {
        return this.height;
    }

    public List<HTMLResource> getHtmlResources() {
        return this.htmlResources;
    }

    public String getId() {
        return this.f102184id;
    }

    public String getPxratio() {
        return this.pxratio;
    }

    public String getRenderingMode() {
        return this.renderingMode;
    }

    public List<StaticResource> getStaticResources() {
        return this.staticResources;
    }

    public TrackingEvents getTrackingEvents() {
        return this.trackingEvents;
    }

    public String getWidth() {
        return this.width;
    }

    public List<IFrameResource> getiFrameResources() {
        return this.iFrameResources;
    }
}
