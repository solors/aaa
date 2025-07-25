package com.maticoo.sdk.bean;

import com.maticoo.sdk.utils.JSONUtil;
import com.maticoo.sdk.utils.crash.CrashUtil;
import com.maticoo.sdk.utils.log.DeveloperLog;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public class Companion {
    private String clickThroughUrl;
    private String[] clickTrackers;
    private int height;
    private String staticResource;
    private Map<TrackEventType, String[]> trackEvent;
    private int width;

    public static Companion toCompanion(JSONObject jSONObject) {
        TrackEventType[] values;
        if (jSONObject == null) {
            return null;
        }
        try {
            Companion companion = new Companion();
            JSONObject optJSONObject = jSONObject.optJSONObject("track_event");
            if (optJSONObject != null) {
                companion.trackEvent = new HashMap();
                for (TrackEventType trackEventType : TrackEventType.values()) {
                    JSONArray optJSONArray = optJSONObject.optJSONArray(trackEventType.name());
                    if (optJSONArray != null) {
                        companion.trackEvent.put(trackEventType, (String[]) JSONUtil.convertToArray(optJSONArray, String.class));
                    }
                }
            }
            companion.clickTrackers = (String[]) JSONUtil.convertToArray(jSONObject.optJSONArray("click_tracking"), String.class);
            companion.clickThroughUrl = jSONObject.optString("click_through_url");
            companion.staticResource = jSONObject.optString("static_resource");
            companion.width = jSONObject.optInt("width");
            companion.height = jSONObject.optInt("height");
            return companion;
        } catch (Exception e) {
            DeveloperLog.LogE("JSONObject convert Icon error: " + e.getMessage());
            CrashUtil.getSingleton().reportSDKException(e, "Icon");
            return null;
        }
    }

    public String getClickThroughUrl() {
        return this.clickThroughUrl;
    }

    public String[] getClickTrackers() {
        return this.clickTrackers;
    }

    public int getHeight() {
        return this.height;
    }

    public String getStaticResource() {
        return this.staticResource;
    }

    public Map<TrackEventType, String[]> getTrackEvent() {
        return this.trackEvent;
    }

    public int getWidth() {
        return this.width;
    }
}
