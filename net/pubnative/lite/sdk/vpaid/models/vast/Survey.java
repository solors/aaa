package net.pubnative.lite.sdk.vpaid.models.vast;

import android.text.TextUtils;
import net.pubnative.lite.sdk.vpaid.xml.Attribute;
import net.pubnative.lite.sdk.vpaid.xml.Text;

/* loaded from: classes10.dex */
public class Survey {
    @Text
    private String text;
    @Attribute
    private String type;

    public String getText() {
        if (TextUtils.isEmpty(this.text)) {
            return "";
        }
        return this.text.trim();
    }

    public String getType() {
        return this.type;
    }
}
