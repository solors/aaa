package net.pubnative.lite.sdk.vpaid.models.vast;

import java.util.List;
import net.pubnative.lite.sdk.vpaid.xml.Tag;

/* loaded from: classes10.dex */
public class Creatives {
    @Tag(com.smaato.sdk.video.vast.model.Creative.NAME)
    private List<Creative> creatives;

    public List<Creative> getCreatives() {
        return this.creatives;
    }
}
