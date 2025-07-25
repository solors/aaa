package net.pubnative.lite.sdk.vpaid.models.vast;

import net.pubnative.lite.sdk.vpaid.xml.Attribute;
import net.pubnative.lite.sdk.vpaid.xml.Tag;

/* loaded from: classes10.dex */
public class Extension {
    @Tag
    private AdVerifications adVerifications;
    @Attribute
    private String type;

    public AdVerifications getAdVerifications() {
        return this.adVerifications;
    }

    public String getType() {
        return this.type;
    }
}
