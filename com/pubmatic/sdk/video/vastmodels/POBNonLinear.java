package com.pubmatic.sdk.video.vastmodels;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.pubmatic.sdk.common.utility.POBUtils;
import com.pubmatic.sdk.video.vastmodels.POBVastCreative;
import com.pubmatic.sdk.video.xmlserialiser.POBNodeBuilder;
import com.smaato.sdk.video.vast.model.Companion;
import com.smaato.sdk.video.vast.model.MediaFile;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes7.dex */
public class POBNonLinear extends POBVastCreative {

    /* renamed from: a */
    private int f71057a;

    /* renamed from: b */
    private int f71058b;

    /* renamed from: c */
    private int f71059c;

    /* renamed from: d */
    private int f71060d;
    @Nullable

    /* renamed from: e */
    private String f71061e;

    /* renamed from: f */
    private boolean f71062f;

    /* renamed from: g */
    private boolean f71063g = true;
    @Nullable

    /* renamed from: h */
    private List<POBTracking> f71064h;
    @Nullable

    /* renamed from: i */
    private String f71065i;
    @Nullable

    /* renamed from: j */
    private List<String> f71066j;
    @Nullable

    /* renamed from: k */
    private List<POBResource> f71067k;
    @Nullable

    /* renamed from: l */
    private String f71068l;

    @Override // com.pubmatic.sdk.video.vastmodels.POBVastCreative, com.pubmatic.sdk.video.xmlserialiser.POBXMLNodeListener
    public void build(@NonNull POBNodeBuilder pOBNodeBuilder) {
        this.f71057a = POBUtils.getIntegerValue(pOBNodeBuilder.getAttributeValue("width"));
        this.f71058b = POBUtils.getIntegerValue(pOBNodeBuilder.getAttributeValue("height"));
        this.f71059c = POBUtils.getIntegerValue(pOBNodeBuilder.getAttributeValue(Companion.EXPANDED_WIDTH));
        this.f71060d = POBUtils.getIntegerValue(pOBNodeBuilder.getAttributeValue(Companion.EXPANDED_HEIGHT));
        this.f71061e = pOBNodeBuilder.getAttributeValue("minSuggestedDuration");
        this.f71062f = POBUtils.getBooleanValue(pOBNodeBuilder.getAttributeValue(MediaFile.SCALABLE));
        String attributeValue = pOBNodeBuilder.getAttributeValue(MediaFile.MAINTAIN_ASPECT_RATIO);
        if (attributeValue != null && !attributeValue.isEmpty()) {
            this.f71063g = POBUtils.getBooleanValue(attributeValue);
        }
        this.f71064h = pOBNodeBuilder.getObjectList("TrackingEvents/Tracking", POBTracking.class);
        this.f71065i = pOBNodeBuilder.getNodeValue("NonLinearClickThrough");
        this.f71066j = pOBNodeBuilder.getStringList("NonLinearClickTracking");
        this.f71067k = new ArrayList();
        POBResource pOBResource = (POBResource) pOBNodeBuilder.getNodeObject("StaticResource", POBResource.class);
        if (pOBResource != null) {
            this.f71067k.add(pOBResource);
        }
        POBResource pOBResource2 = (POBResource) pOBNodeBuilder.getNodeObject("HTMLResource", POBResource.class);
        if (pOBResource2 != null) {
            this.f71067k.add(pOBResource2);
        }
        POBResource pOBResource3 = (POBResource) pOBNodeBuilder.getNodeObject("IFrameResource", POBResource.class);
        if (pOBResource3 != null) {
            this.f71067k.add(pOBResource3);
        }
        this.f71068l = pOBNodeBuilder.getNodeValue("../../UniversalAdId");
    }

    @Override // com.pubmatic.sdk.video.vastmodels.POBVastCreative
    @Nullable
    public String getClickThroughURL() {
        return this.f71065i;
    }

    @Override // com.pubmatic.sdk.video.vastmodels.POBVastCreative, com.pubmatic.sdk.common.base.POBAdDescriptor
    @Nullable
    public List<String> getClickTrackers() {
        return this.f71066j;
    }

    public int getExpandedHeight() {
        return this.f71060d;
    }

    public int getExpandedWidth() {
        return this.f71059c;
    }

    public int getHeight() {
        return this.f71058b;
    }

    public boolean getMaintainAspectRatio() {
        return this.f71063g;
    }

    @Nullable
    public String getMinSuggestedDuration() {
        return this.f71061e;
    }

    @Nullable
    public List<POBResource> getResource() {
        return this.f71067k;
    }

    public boolean getScalable() {
        return this.f71062f;
    }

    @Override // com.pubmatic.sdk.video.vastmodels.POBVastCreative
    @Nullable
    public List<POBTracking> getTrackingEvents() {
        return this.f71064h;
    }

    @Nullable
    public String getUniversalAdId() {
        return this.f71068l;
    }

    @Override // com.pubmatic.sdk.video.vastmodels.POBVastCreative
    public POBVastCreative.CreativeType getVastCreativeType() {
        return POBVastCreative.CreativeType.NONLINEAR;
    }

    public int getWidth() {
        return this.f71057a;
    }
}
