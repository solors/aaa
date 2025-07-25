package com.maticoo.sdk.mraid;

import androidx.annotation.NonNull;
import java.util.Formatter;
import java.util.Locale;
import java.util.Map;

/* loaded from: classes6.dex */
public class ExpandProperties {
    private int width = 0;
    private int height = 0;
    private boolean useCustomClose = false;

    public static ExpandProperties propertiesFromArgs(Map<String, String> map) {
        ExpandProperties expandProperties = new ExpandProperties();
        try {
            expandProperties.setWidth(Integer.parseInt(map.get("width")));
            expandProperties.setHeight(Integer.parseInt(map.get("height")));
            expandProperties.setUseCustomClose(false);
        } catch (Exception unused) {
        }
        return expandProperties;
    }

    public int getHeight() {
        return this.height;
    }

    public int getWidth() {
        return this.width;
    }

    public void setHeight(int i) {
        this.height = i;
    }

    public void setUseCustomClose(boolean z) {
        this.useCustomClose = z;
    }

    public void setWidth(int i) {
        this.width = i;
    }

    @NonNull
    public String toString() {
        String str;
        if (this.useCustomClose) {
            str = "true";
        } else {
            str = "false";
        }
        Formatter formatter = new Formatter(Locale.US);
        formatter.format("{width:%d,height:%d,useCustomClose:'%s'}", Integer.valueOf(this.width), Integer.valueOf(this.height), str);
        String formatter2 = formatter.toString();
        formatter.close();
        return formatter2;
    }

    public boolean useCustomClose() {
        return this.useCustomClose;
    }
}
