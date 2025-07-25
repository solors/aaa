package net.pubnative.lite.sdk.vpaid.models.vast;

import java.util.List;
import net.pubnative.lite.sdk.vpaid.xml.Tag;

/* loaded from: classes10.dex */
public class Extensions {
    @Tag(com.smaato.sdk.video.vast.model.Extension.NAME)
    private List<Extension> extensionList;

    public List<Extension> getExtensions() {
        return this.extensionList;
    }
}
