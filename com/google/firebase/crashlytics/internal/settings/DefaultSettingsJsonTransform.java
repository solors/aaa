package com.google.firebase.crashlytics.internal.settings;

import com.google.firebase.crashlytics.internal.common.CurrentTimeProvider;
import com.google.firebase.crashlytics.internal.settings.Settings;
import com.p552ot.pubsub.util.C26601v;
import org.json.JSONObject;

/* loaded from: classes4.dex */
class DefaultSettingsJsonTransform implements SettingsJsonTransform {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static Settings m66897a(CurrentTimeProvider currentTimeProvider) {
        return new Settings(currentTimeProvider.getCurrentTimeMillis() + ((long) C26601v.f69837d), new Settings.SessionData(8, 4), new Settings.FeatureFlagData(true, false, false), 0, 3600, 10.0d, 1.2d, 60);
    }

    @Override // com.google.firebase.crashlytics.internal.settings.SettingsJsonTransform
    public Settings buildFromJson(CurrentTimeProvider currentTimeProvider, JSONObject jSONObject) {
        return m66897a(currentTimeProvider);
    }
}
