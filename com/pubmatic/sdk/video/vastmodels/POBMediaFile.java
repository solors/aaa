package com.pubmatic.sdk.video.vastmodels;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.pubmatic.sdk.common.utility.POBUtils;
import com.pubmatic.sdk.video.xmlserialiser.POBNodeBuilder;
import com.pubmatic.sdk.video.xmlserialiser.POBXMLNodeListener;
import com.smaato.sdk.video.vast.model.MediaFile;

/* loaded from: classes7.dex */
public class POBMediaFile implements POBXMLNodeListener {
    @Nullable

    /* renamed from: a */
    private String f71048a;
    @Nullable

    /* renamed from: b */
    private String f71049b;

    /* renamed from: c */
    private int f71050c;

    /* renamed from: d */
    private int f71051d;

    /* renamed from: e */
    private int f71052e;

    /* renamed from: f */
    private boolean f71053f;

    /* renamed from: g */
    private boolean f71054g = true;
    @Nullable

    /* renamed from: h */
    private String f71055h;
    @Nullable

    /* renamed from: i */
    private String f71056i;

    @Override // com.pubmatic.sdk.video.xmlserialiser.POBXMLNodeListener
    public void build(@NonNull POBNodeBuilder pOBNodeBuilder) {
        this.f71048a = pOBNodeBuilder.getAttributeValue("delivery");
        this.f71049b = pOBNodeBuilder.getAttributeValue("type");
        this.f71050c = POBUtils.getIntegerValue(pOBNodeBuilder.getAttributeValue(MediaFile.BITRATE));
        this.f71051d = POBUtils.getIntegerValue(pOBNodeBuilder.getAttributeValue("width"));
        this.f71052e = POBUtils.getIntegerValue(pOBNodeBuilder.getAttributeValue("height"));
        this.f71053f = POBUtils.getBooleanValue(pOBNodeBuilder.getAttributeValue(MediaFile.SCALABLE));
        String attributeValue = pOBNodeBuilder.getAttributeValue(MediaFile.MAINTAIN_ASPECT_RATIO);
        if (attributeValue != null && !attributeValue.isEmpty()) {
            this.f71054g = POBUtils.getBooleanValue(attributeValue);
        }
        this.f71055h = pOBNodeBuilder.getNodeValue();
        this.f71056i = pOBNodeBuilder.getAttributeValue(MediaFile.FILE_SIZE);
    }

    public int getBitrate() {
        return this.f71050c;
    }

    @Nullable
    public String getDelivery() {
        return this.f71048a;
    }

    @Nullable
    public String getFileSize() {
        return this.f71056i;
    }

    public int getHeight() {
        return this.f71052e;
    }

    public boolean getMaintainAspectRatio() {
        return this.f71054g;
    }

    @Nullable
    public String getMediaFileURL() {
        return this.f71055h;
    }

    public boolean getScalable() {
        return this.f71053f;
    }

    @Nullable
    public String getType() {
        return this.f71049b;
    }

    public int getWidth() {
        return this.f71051d;
    }

    @NonNull
    public String toString() {
        return "Type: " + this.f71049b + ", bitrate: " + this.f71050c + ", w: " + this.f71051d + ", h: " + this.f71052e + ", URL: " + this.f71055h;
    }
}
