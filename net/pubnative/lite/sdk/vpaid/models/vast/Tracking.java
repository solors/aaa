package net.pubnative.lite.sdk.vpaid.models.vast;

import android.text.TextUtils;
import net.pubnative.lite.sdk.vpaid.xml.Attribute;
import net.pubnative.lite.sdk.vpaid.xml.Text;

/* loaded from: classes10.dex */
public class Tracking {
    @Attribute
    private String event;
    @Attribute
    private String offset;
    @Text
    private String text;

    public String getEvent() {
        if (TextUtils.isEmpty(this.event)) {
            return "";
        }
        return this.event;
    }

    public String getOffset() {
        return this.offset;
    }

    public String getText() {
        if (TextUtils.isEmpty(this.text)) {
            return "";
        }
        return this.text.trim();
    }
}
