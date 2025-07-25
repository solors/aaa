package net.pubnative.lite.sdk.vpaid.models.vast;

import android.text.TextUtils;
import net.pubnative.lite.sdk.vpaid.xml.Attribute;
import net.pubnative.lite.sdk.vpaid.xml.Text;

/* loaded from: classes10.dex */
public class InteractiveCreativeFile {
    @Attribute
    private String apiFramework;
    @Text
    private String text;
    @Attribute
    private String type;
    @Attribute
    private boolean variableDuration;

    public String getApiFramework() {
        return this.apiFramework;
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

    public boolean isVariableDuration() {
        return this.variableDuration;
    }
}
