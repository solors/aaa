package net.pubnative.lite.sdk.vpaid.models.vast;

import android.text.TextUtils;
import net.pubnative.lite.sdk.vpaid.xml.Attribute;
import net.pubnative.lite.sdk.vpaid.xml.Text;

/* loaded from: classes10.dex */
public class UniversalAdId {
    @Attribute
    private String idRegistry;
    @Attribute
    private String idValue;
    @Text
    private String text;

    public String getIdRegistry() {
        return this.idRegistry;
    }

    public String getIdValue() {
        return this.idValue;
    }

    public String getText() {
        if (TextUtils.isEmpty(this.text)) {
            return "";
        }
        return this.text.trim();
    }
}
