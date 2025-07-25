package com.pubmatic.sdk.video.vastmodels;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.pubmatic.sdk.video.xmlserialiser.POBNodeBuilder;
import com.pubmatic.sdk.video.xmlserialiser.POBXMLNodeListener;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes7.dex */
public class POBVast implements POBXMLNodeListener {
    @Nullable

    /* renamed from: a */
    private List<POBVastAd> f71079a;
    @Nullable

    /* renamed from: b */
    private String f71080b;

    @Override // com.pubmatic.sdk.video.xmlserialiser.POBXMLNodeListener
    public void build(@NonNull POBNodeBuilder pOBNodeBuilder) {
        this.f71080b = pOBNodeBuilder.getAttributeValue("version");
        this.f71079a = new ArrayList();
        if (pOBNodeBuilder.getNode("/VAST/Ad") != null) {
            POBVastAd pOBVastAd = (POBVastAd) pOBNodeBuilder.getNodeObject("/VAST/Ad[1]/InLine", POBVastAd.class);
            if (pOBVastAd != null) {
                this.f71079a.add(pOBVastAd);
                return;
            }
            POBVastAd pOBVastAd2 = (POBVastAd) pOBNodeBuilder.getNodeObject("/VAST/Ad[1]/Wrapper", POBVastAd.class);
            if (pOBVastAd2 != null) {
                this.f71079a.add(pOBVastAd2);
                return;
            }
            return;
        }
        POBVastAd pOBVastAd3 = new POBVastAd();
        pOBVastAd3.build(pOBNodeBuilder);
        this.f71079a.add(pOBVastAd3);
    }

    @Nullable
    public List<POBVastAd> getAds() {
        return this.f71079a;
    }

    @Nullable
    public String getVersion() {
        return this.f71080b;
    }
}
