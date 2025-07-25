package net.pubnative.lite.sdk.vpaid.models.vast;

import android.text.TextUtils;
import net.pubnative.lite.sdk.vpaid.xml.Attribute;
import net.pubnative.lite.sdk.vpaid.xml.Text;

/* loaded from: classes10.dex */
public class JavaScriptResource {
    @Attribute
    private String apiFramework;
    @Attribute
    private String browserOptional;
    @Text
    private String text;

    public String getApiFramework() {
        return this.apiFramework;
    }

    public String getText() {
        if (TextUtils.isEmpty(this.text)) {
            return "";
        }
        return this.text.trim();
    }

    public String isBrowserOptional() {
        return this.browserOptional;
    }
}
