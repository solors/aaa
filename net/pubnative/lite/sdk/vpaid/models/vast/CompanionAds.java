package net.pubnative.lite.sdk.vpaid.models.vast;

import java.util.List;
import net.pubnative.lite.sdk.vpaid.xml.Attribute;
import net.pubnative.lite.sdk.vpaid.xml.Tag;

/* loaded from: classes10.dex */
public class CompanionAds {
    @Tag("Companion")
    private List<Companion> companions;
    @Attribute
    private String required;

    public List<Companion> getCompanions() {
        return this.companions;
    }

    public String getRequired() {
        return this.required;
    }
}
