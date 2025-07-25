package net.pubnative.lite.sdk.vpaid.models.vast;

import android.text.TextUtils;
import net.pubnative.lite.sdk.vpaid.xml.Attribute;
import net.pubnative.lite.sdk.vpaid.xml.Text;

/* loaded from: classes10.dex */
public class MediaFile {
    @Attribute
    private String apiFramework;
    @Attribute
    private String bitrate;
    @Attribute
    private String codec;
    @Attribute
    private String delivery;
    @Attribute
    private String fileSize;
    @Attribute
    private String height;
    @Attribute

    /* renamed from: id */
    private String f102190id;
    @Attribute
    private String maintainAspectRatio;
    @Attribute
    private String maxBitrate;
    @Attribute
    private String mediaType;
    @Attribute
    private String minBitrate;
    @Attribute
    private String scalable;
    @Text
    private String text;
    @Attribute
    private String type;
    @Attribute
    private String width;

    public String getApiFramework() {
        return this.apiFramework;
    }

    public String getBitrate() {
        return this.bitrate;
    }

    public String getCodec() {
        return this.codec;
    }

    public String getDelivery() {
        return this.delivery;
    }

    public String getFileSize() {
        return this.fileSize;
    }

    public String getHeight() {
        return this.height;
    }

    public String getId() {
        return this.f102190id;
    }

    public String getMaxBitrate() {
        return this.maxBitrate;
    }

    public String getMediaType() {
        return this.mediaType;
    }

    public String getMinBitrate() {
        return this.minBitrate;
    }

    public String getText() {
        if (TextUtils.isEmpty(this.text)) {
            return "";
        }
        return this.text.trim();
    }

    public String getType() {
        return this.type;
    }

    public String getWidth() {
        return this.width;
    }

    public String isMaintainAspectRatio() {
        return this.maintainAspectRatio;
    }

    public String isScalable() {
        return this.scalable;
    }
}
