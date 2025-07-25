package com.maticoo.sdk.bean;

import com.maticoo.sdk.utils.JSONUtil;
import com.maticoo.sdk.utils.crash.CrashUtil;
import com.maticoo.sdk.utils.log.DeveloperLog;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public class Icon {
    private String clickThroughUrl;
    private String[] clickTracking;
    private int height;
    private String program;
    private String staticResource;
    private String viewTracking;
    private int width;
    private String xPosition;
    private String yPosition;

    public static Icon toIcon(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        try {
            Icon icon = new Icon();
            icon.viewTracking = jSONObject.optString("view_tracking");
            icon.clickTracking = (String[]) JSONUtil.convertToArray(jSONObject.optJSONArray("click_tracking"), String.class);
            icon.clickThroughUrl = jSONObject.optString("click_through_url");
            icon.staticResource = jSONObject.optString("static_resource");
            icon.program = jSONObject.optString(com.smaato.sdk.video.vast.model.Icon.PROGRAM);
            icon.width = jSONObject.optInt("width");
            icon.height = jSONObject.optInt("height");
            icon.xPosition = jSONObject.optString("x_position");
            icon.yPosition = jSONObject.optString("y_position");
            return icon;
        } catch (Exception e) {
            DeveloperLog.LogE("JSONObject convert Icon error: " + e.getMessage());
            CrashUtil.getSingleton().reportSDKException(e, "Icon");
            return null;
        }
    }

    public static JSONObject toJSON(Icon icon) {
        if (icon == null) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("click_through_url", icon.clickThroughUrl);
            jSONObject.put("static_resource", icon.staticResource);
            jSONObject.put(com.smaato.sdk.video.vast.model.Icon.PROGRAM, icon.program);
            jSONObject.put("width", icon.width);
            jSONObject.put("height", icon.height);
            jSONObject.put("x_position", icon.xPosition);
            jSONObject.put("y_position", icon.yPosition);
            return jSONObject;
        } catch (Exception e) {
            DeveloperLog.LogE("Icon convert JSONObject error: " + e.getMessage());
            CrashUtil.getSingleton().reportSDKException(e);
            return null;
        }
    }

    public String getClickThroughUrl() {
        return this.clickThroughUrl;
    }

    public String[] getClickTracking() {
        return this.clickTracking;
    }

    public int getHeight() {
        return this.height;
    }

    public String getProgram() {
        return this.program;
    }

    public String getStaticResource() {
        return this.staticResource;
    }

    public String getViewTracking() {
        return this.viewTracking;
    }

    public int getWidth() {
        return this.width;
    }

    public String getxPosition() {
        return this.xPosition;
    }

    public String getyPosition() {
        return this.yPosition;
    }
}
