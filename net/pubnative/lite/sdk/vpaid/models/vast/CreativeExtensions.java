package net.pubnative.lite.sdk.vpaid.models.vast;

import java.util.List;
import net.pubnative.lite.sdk.vpaid.xml.Tag;

/* loaded from: classes10.dex */
public class CreativeExtensions {
    @Tag("CreativeExtension")
    private List<CreativeExtension> creativeExtensions;

    public List<CreativeExtension> getCreativeExtensions() {
        return this.creativeExtensions;
    }
}
