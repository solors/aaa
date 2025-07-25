package com.maticoo.sdk.utils.event;

import android.app.Application;
import android.text.TextUtils;
import com.maticoo.sdk.utils.ApplicationUtil;
import com.maticoo.sdk.utils.JSONUtil;
import com.maticoo.sdk.utils.request.network.util.NetworkChecker;
import com.mobilefuse.sdk.telemetry.TelemetryCategory;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public class Event {
    public static final String DEFAULT_TYPE = "track";
    private int eventId;
    public boolean justToSdkServer;
    private final JSONObject mProperties;
    private String type;

    public Event(int i) {
        this.mProperties = new JSONObject();
        this.type = DEFAULT_TYPE;
        this.justToSdkServer = false;
        this.eventId = i;
        if (i != -1) {
            addProperty(TelemetryCategory.EID, Integer.valueOf(i));
        }
        addProperty("ts", Long.valueOf(System.currentTimeMillis()));
        Application applicationContext = ApplicationUtil.getInstance().getApplicationContext();
        if (applicationContext != null) {
            addProperty("network_type", Integer.valueOf(NetworkChecker.getConnectType(applicationContext).getValue()));
        }
    }

    public void addParamsWithMap(Map<String, Object> map) {
        for (String str : map.keySet()) {
            Object obj = map.get(str);
            if (obj != null) {
                addProperty(str, obj);
            }
        }
    }

    public void addProperties(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        try {
            JSONUtil.mergeJSONObject(jSONObject, this.mProperties);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    public void addProperty(String str, Object obj) {
        try {
            if (TextUtils.isEmpty(str) || obj == null) {
                return;
            }
            this.mProperties.put(str, obj);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    public int getEventId() {
        return this.eventId;
    }

    public String getEventName() {
        return EventId.getEventName(this.eventId);
    }

    public int getEventPriority() {
        return EventId.getEventPriority(this.eventId);
    }

    public JSONObject getProperties() {
        return this.mProperties;
    }

    public String getType() {
        return this.type;
    }

    public boolean isInteractEvent() {
        int i = this.eventId;
        if (i != 301 && i != 302 && i != 303) {
            return false;
        }
        return true;
    }

    public void setType(String str) {
        this.type = str;
    }

    String toJson() {
        return this.mProperties.toString();
    }

    public String toString() {
        return toJson();
    }

    public Event(int i, JSONObject jSONObject) {
        this(i);
        addProperties(jSONObject);
    }

    public Event(int i, JSONObject jSONObject, String str) {
        this(i, jSONObject);
        this.type = str;
    }

    public Event(String str) throws Exception {
        this.mProperties = new JSONObject();
        this.eventId = 0;
        this.type = DEFAULT_TYPE;
        this.justToSdkServer = false;
        addProperties(new JSONObject(str));
    }
}
