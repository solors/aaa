package com.smaato.sdk.core.remoteconfig.publisher;

import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public class ButtonSizes {
    private static final Boolean DEFAULT_SIZE_ENABLED = Boolean.FALSE;
    private final Map<String, Boolean> fixedSizesMap;

    /* loaded from: classes7.dex */
    public enum ButtonSize {
        SMALL,
        MID
    }

    /* renamed from: com.smaato.sdk.core.remoteconfig.publisher.ButtonSizes$b */
    /* loaded from: classes7.dex */
    static final class C27265b {
        @Nullable

        /* renamed from: a */
        private Map<String, Boolean> f71875a;

        /* JADX INFO: Access modifiers changed from: package-private */
        public C27265b() {
        }

        /* renamed from: b */
        private boolean m39378b(JSONObject jSONObject) {
            if (jSONObject != null && jSONObject.has("type") && jSONObject.has("enabled")) {
                return true;
            }
            return false;
        }

        /* renamed from: c */
        private void m39377c(JSONArray jSONArray) {
            if (jSONArray == null) {
                return;
            }
            this.f71875a = new HashMap();
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                try {
                    JSONObject jSONObject = jSONArray.getJSONObject(i);
                    if (m39378b(jSONObject)) {
                        this.f71875a.put(jSONObject.getString("type"), Boolean.valueOf(jSONObject.getBoolean("enabled")));
                    }
                } catch (JSONException unused) {
                    Log.d(C27265b.class.getSimpleName(), "Failed to Parse Json Array");
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @NonNull
        /* renamed from: a */
        public ButtonSizes m39379a() {
            Map map = this.f71875a;
            if (map == null) {
                map = new HashMap();
            }
            return new ButtonSizes(map);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public C27265b(@NonNull JSONObject jSONObject) {
            if (jSONObject.has("fixSizes")) {
                m39377c(jSONObject.optJSONArray("fixSizes"));
            }
        }
    }

    public boolean isButtonSizeEnabled(ButtonSize buttonSize) {
        Boolean bool = this.fixedSizesMap.get(buttonSize.name());
        if (bool != null) {
            return bool.booleanValue();
        }
        return DEFAULT_SIZE_ENABLED.booleanValue();
    }

    private ButtonSizes(@NonNull Map<String, Boolean> map) {
        this.fixedSizesMap = map;
    }
}
