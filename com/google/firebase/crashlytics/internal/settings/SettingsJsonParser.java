package com.google.firebase.crashlytics.internal.settings;

import com.google.firebase.crashlytics.internal.Logger;
import com.google.firebase.crashlytics.internal.common.CurrentTimeProvider;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class SettingsJsonParser {

    /* renamed from: a */
    private final CurrentTimeProvider f42964a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public SettingsJsonParser(CurrentTimeProvider currentTimeProvider) {
        this.f42964a = currentTimeProvider;
    }

    /* renamed from: a */
    private static SettingsJsonTransform m66875a(int i) {
        if (i != 3) {
            Logger logger = Logger.getLogger();
            logger.m67214e("Could not determine SettingsJsonTransform for settings version " + i + ". Using default settings values.");
            return new DefaultSettingsJsonTransform();
        }
        return new SettingsV3JsonTransform();
    }

    public Settings parseSettingsJson(JSONObject jSONObject) throws JSONException {
        return m66875a(jSONObject.getInt("settings_version")).buildFromJson(this.f42964a, jSONObject);
    }
}
