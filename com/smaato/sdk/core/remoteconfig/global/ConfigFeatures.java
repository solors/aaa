package com.smaato.sdk.core.remoteconfig.global;

import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public class ConfigFeatures {
    private static final Boolean DEFAULT_FEATURED_ENABLED = Boolean.TRUE;
    @NonNull
    private final Map<String, C27255c> featuresMap;

    /* loaded from: classes7.dex */
    public enum Feature {
        BUTTON_SIZE("ButtonSize"),
        BUTTON_DELAY("ButtonDelay");
        
        public final String label;

        Feature(String str) {
            this.label = str;
        }
    }

    /* renamed from: com.smaato.sdk.core.remoteconfig.global.ConfigFeatures$b */
    /* loaded from: classes7.dex */
    static final class C27254b {
        @Nullable

        /* renamed from: a */
        private Map<String, C27255c> f71853a;

        /* JADX INFO: Access modifiers changed from: package-private */
        public C27254b() {
        }

        /* renamed from: b */
        private boolean m39394b(JSONObject jSONObject) {
            if (jSONObject != null && jSONObject.has("minVersionSupport") && jSONObject.has("enabled")) {
                return true;
            }
            return false;
        }

        /* renamed from: c */
        private boolean m39393c(JSONObject jSONObject) {
            if (jSONObject != null && jSONObject.has("featureName") && jSONObject.has("android")) {
                return true;
            }
            return false;
        }

        /* renamed from: d */
        private void m39392d(JSONArray jSONArray) {
            if (jSONArray == null) {
                return;
            }
            this.f71853a = new HashMap();
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                try {
                    JSONObject jSONObject = jSONArray.getJSONObject(i);
                    if (m39393c(jSONObject)) {
                        String string = jSONObject.getString("featureName");
                        JSONObject jSONObject2 = jSONObject.getJSONObject("android");
                        if (m39394b(jSONObject2)) {
                            this.f71853a.put(string, new C27255c(jSONObject2.optString("minVersionSupport"), Boolean.valueOf(jSONObject2.optBoolean("enabled"))));
                        }
                    }
                } catch (JSONException unused) {
                    Log.d(C27254b.class.getSimpleName(), "Failed to Parse Json Array");
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @NonNull
        /* renamed from: a */
        public ConfigFeatures m39395a() {
            Map map = this.f71853a;
            if (map == null) {
                map = new HashMap();
            }
            return new ConfigFeatures(map);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public C27254b(@NonNull JSONArray jSONArray) {
            m39392d(jSONArray);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.smaato.sdk.core.remoteconfig.global.ConfigFeatures$c */
    /* loaded from: classes7.dex */
    public static class C27255c {
        @NonNull

        /* renamed from: a */
        private final String f71854a;
        @NonNull

        /* renamed from: b */
        private final Boolean f71855b;

        public C27255c(@NonNull String str, @NonNull Boolean bool) {
            this.f71854a = str;
            this.f71855b = bool;
        }
    }

    @VisibleForTesting
    protected static String getCurrentVersion() {
        try {
            String[] split = "22.7.1".split("-");
            if (split.length <= 1) {
                return "22.7.1";
            }
            return split[0];
        } catch (Exception unused) {
            return "22.7.1";
        }
    }

    public boolean isFeatureEnabled(Feature feature) {
        C27255c c27255c = this.featuresMap.get(feature.label);
        if (c27255c != null) {
            if (c27255c.f71855b.booleanValue() && getCurrentVersion().compareTo(c27255c.f71854a) >= 0) {
                return true;
            }
            return false;
        }
        return DEFAULT_FEATURED_ENABLED.booleanValue();
    }

    private ConfigFeatures(@NonNull Map<String, C27255c> map) {
        this.featuresMap = map;
    }
}
