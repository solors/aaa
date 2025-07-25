package com.google.firebase.crashlytics.internal.settings;

import com.google.firebase.crashlytics.internal.common.CurrentTimeProvider;
import com.google.firebase.crashlytics.internal.settings.Settings;
import com.maticoo.sdk.utils.constant.KeyConstants;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
class SettingsV3JsonTransform implements SettingsJsonTransform {
    /* renamed from: a */
    private static Settings.FeatureFlagData m66874a(JSONObject jSONObject) {
        return new Settings.FeatureFlagData(jSONObject.optBoolean("collect_reports", true), jSONObject.optBoolean("collect_anrs", false), jSONObject.optBoolean("collect_build_ids", false));
    }

    /* renamed from: b */
    private static Settings.SessionData m66873b(JSONObject jSONObject) {
        return new Settings.SessionData(jSONObject.optInt("max_custom_exception_events", 8), 4);
    }

    /* renamed from: c */
    private static long m66872c(CurrentTimeProvider currentTimeProvider, long j, JSONObject jSONObject) {
        if (jSONObject.has("expires_at")) {
            return jSONObject.optLong("expires_at");
        }
        return currentTimeProvider.getCurrentTimeMillis() + (j * 1000);
    }

    @Override // com.google.firebase.crashlytics.internal.settings.SettingsJsonTransform
    public Settings buildFromJson(CurrentTimeProvider currentTimeProvider, JSONObject jSONObject) throws JSONException {
        Settings.SessionData m66873b;
        int optInt = jSONObject.optInt("settings_version", 0);
        int optInt2 = jSONObject.optInt("cache_duration", 3600);
        double optDouble = jSONObject.optDouble("on_demand_upload_rate_per_minute", 10.0d);
        double optDouble2 = jSONObject.optDouble("on_demand_backoff_base", 1.2d);
        int optInt3 = jSONObject.optInt("on_demand_backoff_step_duration_seconds", 60);
        if (jSONObject.has(KeyConstants.RequestBody.KEY_SESSION)) {
            m66873b = m66873b(jSONObject.getJSONObject(KeyConstants.RequestBody.KEY_SESSION));
        } else {
            m66873b = m66873b(new JSONObject());
        }
        return new Settings(m66872c(currentTimeProvider, optInt2, jSONObject), m66873b, m66874a(jSONObject.getJSONObject("features")), optInt, optInt2, optDouble, optDouble2, optInt3);
    }
}
