package net.pubnative.lite.sdk.vpaid.models.vast;

import android.text.TextUtils;
import net.pubnative.lite.sdk.vpaid.xml.Attribute;
import net.pubnative.lite.sdk.vpaid.xml.Text;

/* loaded from: classes10.dex */
public class AdSystem {
    @Text
    private String text;
    @Attribute
    private String version;

    public String getText() {
        if (TextUtils.isEmpty(this.text)) {
            return "";
        }
        return this.text.trim();
    }

    public String getVersion() {
        return this.version;
    }
}
