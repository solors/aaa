package net.pubnative.lite.sdk.vpaid.models.vast;

import net.pubnative.lite.sdk.vpaid.xml.Attribute;
import net.pubnative.lite.sdk.vpaid.xml.Tag;

/* renamed from: net.pubnative.lite.sdk.vpaid.models.vast.Ad */
/* loaded from: classes10.dex */
public class C38799Ad {
    @Attribute
    private String adType;
    @Attribute
    private String conditionalAd;
    @Attribute

    /* renamed from: id */
    private String f102180id;
    @Tag
    private InLine inLine;
    @Attribute
    private String sequence;
    @Tag
    private Wrapper wrapper;

    public String getAdType() {
        return this.adType;
    }

    public String getConditionalAd() {
        return this.conditionalAd;
    }

    public String getId() {
        return this.f102180id;
    }

    public InLine getInLine() {
        return this.inLine;
    }

    public String getSequence() {
        return this.sequence;
    }

    public Wrapper getWrapper() {
        return this.wrapper;
    }
}
