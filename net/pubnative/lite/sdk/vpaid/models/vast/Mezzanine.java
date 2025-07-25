package net.pubnative.lite.sdk.vpaid.models.vast;

import android.text.TextUtils;
import net.pubnative.lite.sdk.vpaid.xml.Attribute;
import net.pubnative.lite.sdk.vpaid.xml.Text;

/* loaded from: classes10.dex */
public class Mezzanine {
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
    private String f102191id;
    @Attribute
    private String mediaType;
    @Text
    private String text;
    @Attribute
    private String type;
    @Attribute
    private String width;

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
        return this.f102191id;
    }

    public String getMediaType() {
        return this.mediaType;
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
}
