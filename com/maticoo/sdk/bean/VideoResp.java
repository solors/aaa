package com.maticoo.sdk.bean;

import android.text.TextUtils;
import com.maticoo.sdk.utils.JSONUtil;
import com.maticoo.sdk.utils.crash.CrashUtil;
import com.maticoo.sdk.utils.log.DeveloperLog;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public class VideoResp {
    private String clickThroughUrl;
    private String[] clickTrackers;
    private Companion companion;
    private String[] error;
    private int height;
    private Icon[] icon;
    private String[] impTrackers;
    private Map<TrackEventType, String[]> trackEvent;
    private String type;
    private int width;

    public static String toJsonString(VideoResp videoResp) {
        if (videoResp == null) {
            return "";
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("imp_trackers", JSONUtil.convertArray(videoResp.impTrackers));
            jSONObject.put("click_tracking", JSONUtil.convertArray(videoResp.clickTrackers));
            jSONObject.put("click_through_url", videoResp.clickThroughUrl);
            if (videoResp.trackEvent != null) {
                JSONObject jSONObject2 = new JSONObject();
                for (TrackEventType trackEventType : videoResp.trackEvent.keySet()) {
                    String[] strArr = videoResp.trackEvent.get(trackEventType);
                    if (strArr != null) {
                        JSONArray jSONArray = new JSONArray();
                        for (String str : strArr) {
                            jSONArray.put(str);
                        }
                        jSONObject2.put(trackEventType.name(), jSONArray);
                    }
                }
                jSONObject.put("track_event", jSONObject2);
            }
            if (videoResp.companion != null) {
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("static_resource", videoResp.companion.getStaticResource());
                jSONObject3.put("click_through_url", videoResp.companion.getClickThroughUrl());
                jSONObject3.put("click_tracking", JSONUtil.convertArray(videoResp.companion.getClickTrackers()));
                jSONObject3.put("width", videoResp.companion.getWidth());
                jSONObject3.put("height", videoResp.companion.getHeight());
            }
            jSONObject.put("width", videoResp.width);
            jSONObject.put("height", videoResp.height);
            jSONObject.put("type", videoResp.type);
            return jSONObject.toString();
        } catch (Exception e) {
            DeveloperLog.LogE("NativeBean convert JSONObject error: " + e.getMessage());
            CrashUtil.getSingleton().reportSDKException(e);
            return "";
        }
    }

    public static VideoResp toVideoResp(String str) {
        TrackEventType[] values;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            VideoResp videoResp = new VideoResp();
            videoResp.impTrackers = (String[]) JSONUtil.convertToArray(jSONObject.optJSONArray("imp_trackers"), String.class);
            videoResp.clickTrackers = (String[]) JSONUtil.convertToArray(jSONObject.optJSONArray("click_tracking"), String.class);
            videoResp.clickThroughUrl = jSONObject.optString("click_through_url");
            JSONObject optJSONObject = jSONObject.optJSONObject("track_event");
            if (optJSONObject != null) {
                videoResp.trackEvent = new HashMap();
                for (TrackEventType trackEventType : TrackEventType.values()) {
                    JSONArray optJSONArray = optJSONObject.optJSONArray(trackEventType.name());
                    if (optJSONArray != null) {
                        videoResp.trackEvent.put(trackEventType, (String[]) JSONUtil.convertToArray(optJSONArray, String.class));
                    }
                }
            }
            JSONObject optJSONObject2 = jSONObject.optJSONObject("companion");
            if (optJSONObject2 != null) {
                videoResp.companion = Companion.toCompanion(optJSONObject2);
            }
            videoResp.error = (String[]) JSONUtil.convertToArray(jSONObject.optJSONArray("error"), String.class);
            JSONArray optJSONArray2 = jSONObject.optJSONArray("icon");
            if (optJSONArray2 != null) {
                videoResp.icon = new Icon[optJSONArray2.length()];
                for (int i = 0; i < optJSONArray2.length(); i++) {
                    JSONObject optJSONObject3 = optJSONArray2.optJSONObject(i);
                    if (optJSONObject3 != null) {
                        videoResp.icon[i] = Icon.toIcon(optJSONObject3);
                    }
                }
            }
            videoResp.width = jSONObject.optInt("width");
            videoResp.height = jSONObject.optInt("height");
            videoResp.type = jSONObject.optString("type");
            return videoResp;
        } catch (Exception e) {
            DeveloperLog.LogE("JSONObject convert VideoResp error: " + e.getMessage());
            CrashUtil.getSingleton().reportSDKException(e, "VideoResp");
            return null;
        }
    }

    public String getClickThroughUrl() {
        return this.clickThroughUrl;
    }

    public String[] getClickTrackers() {
        return this.clickTrackers;
    }

    public Companion getCompanion() {
        return this.companion;
    }

    public String[] getError() {
        return this.error;
    }

    public int getHeight() {
        return this.height;
    }

    public Icon[] getIcon() {
        return this.icon;
    }

    public String[] getImpTrackers() {
        return this.impTrackers;
    }

    public Map<TrackEventType, String[]> getTrackEvent() {
        return this.trackEvent;
    }

    public String getType() {
        return this.type;
    }

    public int getWidth() {
        return this.width;
    }

    public void setError(String[] strArr) {
        this.error = strArr;
    }
}
