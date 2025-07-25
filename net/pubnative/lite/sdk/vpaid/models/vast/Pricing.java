package net.pubnative.lite.sdk.vpaid.models.vast;

import android.text.TextUtils;
import net.pubnative.lite.sdk.vpaid.xml.Attribute;
import net.pubnative.lite.sdk.vpaid.xml.Text;

/* loaded from: classes10.dex */
public class Pricing {
    @Attribute
    private String currency;
    @Attribute
    private String model;
    @Text
    private String text;

    public String getCurrency() {
        return this.currency;
    }

    public String getModel() {
        return this.model;
    }

    public String getText() {
        if (TextUtils.isEmpty(this.text)) {
            return "";
        }
        return this.text.trim();
    }
}
