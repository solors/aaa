package net.pubnative.lite.sdk.vpaid.models.vast;

import java.util.List;
import net.pubnative.lite.sdk.vpaid.xml.Attribute;
import net.pubnative.lite.sdk.vpaid.xml.Tag;

/* loaded from: classes10.dex */
public class IconClickFallbackImage {
    @Tag
    private AltText altText;
    @Attribute
    private String height;
    @Tag("StaticResource")
    private List<StaticResource> staticResources;
    @Attribute
    private String width;

    public AltText getAltText() {
        return this.altText;
    }

    public String getHeight() {
        return this.height;
    }

    public List<StaticResource> getStaticResources() {
        return this.staticResources;
    }

    public String getWidth() {
        return this.width;
    }
}
