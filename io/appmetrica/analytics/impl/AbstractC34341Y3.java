package io.appmetrica.analytics.impl;

import android.location.Location;
import android.text.TextUtils;
import com.amazon.p047a.p048a.p059h.Metric;
import com.ironsource.C19577ad;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import io.appmetrica.analytics.PreloadInfo;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: io.appmetrica.analytics.impl.Y3 */
/* loaded from: classes9.dex */
public abstract class AbstractC34341Y3 {
    /* renamed from: a */
    public static String m22081a(Location location) {
        if (location == null) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(IronSourceConstants.EVENTS_PROVIDER, location.getProvider());
            jSONObject.put(Metric.f2405b, location.getTime());
            jSONObject.put("accuracy", location.getAccuracy());
            jSONObject.put("alt", location.getAltitude());
            jSONObject.put("lng", location.getLongitude());
            jSONObject.put(C19577ad.f49134q, location.getLatitude());
            return jSONObject.toString();
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: b */
    public static PreloadInfo m22079b(String str) {
        String str2 = null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject(str);
        if (jSONObject.has("trackid")) {
            str2 = jSONObject.optString("trackid");
        }
        PreloadInfo.Builder newBuilder = PreloadInfo.newBuilder(str2);
        HashMap m21876c = AbstractC34451cb.m21876c(jSONObject.optString("params"));
        if (m21876c != null && m21876c.size() > 0) {
            for (Map.Entry entry : m21876c.entrySet()) {
                newBuilder.setAdditionalParams((String) entry.getKey(), (String) entry.getValue());
            }
        }
        return newBuilder.build();
    }

    /* renamed from: a */
    public static Location m22080a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            Location location = new Location(jSONObject.has(IronSourceConstants.EVENTS_PROVIDER) ? jSONObject.optString(IronSourceConstants.EVENTS_PROVIDER) : null);
            location.setLongitude(jSONObject.getDouble("lng"));
            location.setLatitude(jSONObject.getDouble(C19577ad.f49134q));
            location.setTime(jSONObject.optLong(Metric.f2405b));
            location.setAccuracy((float) jSONObject.optDouble("accuracy"));
            location.setAltitude((float) jSONObject.optDouble("alt"));
            return location;
        } catch (Throwable unused) {
            return null;
        }
    }
}
