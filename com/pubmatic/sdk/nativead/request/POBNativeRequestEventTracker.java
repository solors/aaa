package com.pubmatic.sdk.nativead.request;

import androidx.annotation.NonNull;
import com.pubmatic.sdk.common.log.POBLog;
import com.pubmatic.sdk.nativead.POBNativeConstants;
import com.pubmatic.sdk.openwrap.core.nativead.POBNativeEventTrackingMethod;
import com.pubmatic.sdk.openwrap.core.nativead.POBNativeEventType;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public class POBNativeRequestEventTracker {
    @NonNull

    /* renamed from: a */
    private final POBNativeEventType f70477a;
    @NonNull

    /* renamed from: b */
    private final List<POBNativeEventTrackingMethod> f70478b;

    public POBNativeRequestEventTracker(@NonNull POBNativeEventType pOBNativeEventType, @NonNull List<POBNativeEventTrackingMethod> list) {
        this.f70477a = pOBNativeEventType;
        this.f70478b = list;
    }

    @NonNull
    public List<POBNativeEventTrackingMethod> getMethods() {
        return this.f70478b;
    }

    @NonNull
    public JSONObject getRTBJSON() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("event", this.f70477a.getEventTypeValue());
            JSONArray jSONArray = new JSONArray();
            for (int i = 0; i < this.f70478b.size(); i++) {
                jSONArray.put(this.f70478b.get(i).getEventEventTrackingMethodValue());
            }
            jSONObject.put(POBNativeConstants.NATIVE_METHODS, jSONArray);
        } catch (JSONException e) {
            POBLog.error("POBNativeReqEventTrackr", String.format("JSON exception encountered while creating the JSONObject of %s class.", "POBNativeReqEventTrackr") + e.getMessage(), new Object[0]);
        }
        return jSONObject;
    }

    @NonNull
    public POBNativeEventType getType() {
        return this.f70477a;
    }
}
