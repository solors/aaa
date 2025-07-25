package com.fyber.inneractive.sdk.config.remote;

import android.text.TextUtils;
import com.fyber.inneractive.sdk.config.enums.Track;
import com.maticoo.sdk.utils.event.Event;
import java.util.LinkedHashSet;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.fyber.inneractive.sdk.config.remote.f */
/* loaded from: classes4.dex */
public final class C14405f {

    /* renamed from: a */
    public Set f27244a = null;

    /* renamed from: a */
    public static C14405f m77913a(JSONObject jSONObject) {
        Track fromValue;
        C14405f c14405f = null;
        if (jSONObject == null) {
            return null;
        }
        JSONArray optJSONArray = jSONObject.optJSONArray(Event.DEFAULT_TYPE);
        if (optJSONArray != null) {
            c14405f = new C14405f();
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            for (int i = 0; i < optJSONArray.length(); i++) {
                String optString = optJSONArray.optString(i);
                if (!TextUtils.isEmpty(optString) && (fromValue = Track.fromValue(optString)) != null) {
                    linkedHashSet.add(fromValue);
                }
            }
            c14405f.f27244a = linkedHashSet;
        }
        return c14405f;
    }
}
