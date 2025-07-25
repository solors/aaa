package com.pubmatic.sdk.video.vastmodels;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.pubmatic.sdk.common.utility.POBUtils;
import com.pubmatic.sdk.video.vastmodels.POBVastCreative;
import com.pubmatic.sdk.video.xmlserialiser.POBNodeBuilder;
import com.smaato.sdk.video.vast.model.Linear;
import java.util.List;

/* loaded from: classes7.dex */
public class POBLinear extends POBVastCreative {

    /* renamed from: a */
    private double f71041a;
    @Nullable

    /* renamed from: b */
    private List<POBTracking> f71042b;
    @Nullable

    /* renamed from: c */
    private String f71043c;
    @Nullable

    /* renamed from: d */
    private List<POBMediaFile> f71044d;
    @Nullable

    /* renamed from: e */
    private List<POBIcon> f71045e;
    @Nullable

    /* renamed from: f */
    private String f71046f;

    /* renamed from: g */
    private double f71047g = -1.0d;

    @Override // com.pubmatic.sdk.video.vastmodels.POBVastCreative, com.pubmatic.sdk.video.xmlserialiser.POBXMLNodeListener
    public void build(@NonNull POBNodeBuilder pOBNodeBuilder) {
        this.f71046f = pOBNodeBuilder.getNodeValue("../UniversalAdId");
        String nodeValue = pOBNodeBuilder.getNodeValue(Linear.DURATION);
        if (nodeValue != null) {
            this.f71041a = POBUtils.getSeconds(nodeValue);
        }
        this.f71042b = pOBNodeBuilder.getObjectList("TrackingEvents/Tracking", POBTracking.class);
        this.mClickThroughURL = pOBNodeBuilder.getNodeValue("VideoClicks/ClickThrough");
        this.mClickTrackers = pOBNodeBuilder.getStringList("VideoClicks/ClickTracking");
        this.f71043c = pOBNodeBuilder.getNodeValue("VideoClicks/CustomClick");
        this.f71044d = pOBNodeBuilder.getObjectList("MediaFiles/MediaFile", POBMediaFile.class);
        this.f71045e = pOBNodeBuilder.getObjectList("Icons/Icon", POBIcon.class);
        String attributeValue = pOBNodeBuilder.getAttributeValue(Linear.SKIPOFFSET);
        if (attributeValue != null) {
            double convertToSeconds = POBUtils.convertToSeconds(nodeValue, attributeValue);
            this.f71047g = convertToSeconds;
            this.f71047g = Math.max(0.0d, convertToSeconds);
            return;
        }
        this.f71047g = -1.0d;
    }

    @Nullable
    public String getCustomClick() {
        return this.f71043c;
    }

    public double getDuration() {
        return this.f71041a;
    }

    @Nullable
    public List<POBIcon> getIconList() {
        return this.f71045e;
    }

    @Nullable
    public List<POBMediaFile> getMediaFiles() {
        return this.f71044d;
    }

    public double getSkipOffset() {
        return this.f71047g;
    }

    @Override // com.pubmatic.sdk.video.vastmodels.POBVastCreative
    @Nullable
    public List<POBTracking> getTrackingEvents() {
        return this.f71042b;
    }

    @Nullable
    public String getUniversalAdId() {
        return this.f71046f;
    }

    @Override // com.pubmatic.sdk.video.vastmodels.POBVastCreative
    public POBVastCreative.CreativeType getVastCreativeType() {
        return POBVastCreative.CreativeType.LINEAR;
    }
}
