package com.smaato.sdk.core.remoteconfig.publisher;

import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.smaato.sdk.core.util.Objects;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public class ButtonDelays {
    private static final Boolean DEFAULT_DELAY_ENABLED = Boolean.FALSE;
    private final int displayAdDelaySeconds;
    private final Map<String, Boolean> fixedDelaysMap;
    private final int videoAdDelaySeconds;

    /* loaded from: classes7.dex */
    public enum ButtonDelay {
        LARGE,
        MID
    }

    /* renamed from: com.smaato.sdk.core.remoteconfig.publisher.ButtonDelays$b */
    /* loaded from: classes7.dex */
    static final class C27263b {
        @Nullable

        /* renamed from: a */
        private Integer f71872a;
        @Nullable

        /* renamed from: b */
        private Integer f71873b;
        @Nullable

        /* renamed from: c */
        private Map<String, Boolean> f71874c;

        /* JADX INFO: Access modifiers changed from: package-private */
        public C27263b() {
        }

        /* renamed from: b */
        private boolean m39381b(JSONObject jSONObject) {
            if (jSONObject != null && jSONObject.has("type") && jSONObject.has("enabled")) {
                return true;
            }
            return false;
        }

        /* renamed from: c */
        private void m39380c(JSONArray jSONArray) {
            if (jSONArray == null) {
                return;
            }
            this.f71874c = new HashMap();
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                try {
                    JSONObject jSONObject = jSONArray.getJSONObject(i);
                    if (m39381b(jSONObject)) {
                        this.f71874c.put(jSONObject.getString("type"), Boolean.valueOf(jSONObject.getBoolean("enabled")));
                    }
                } catch (JSONException unused) {
                    Log.d(C27263b.class.getSimpleName(), "Failed to Parse Json Array");
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @NonNull
        /* renamed from: a */
        public ButtonDelays m39382a() {
            Integer num = this.f71872a;
            if (num == null || num.intValue() < 0) {
                this.f71872a = 5;
            }
            Integer num2 = this.f71873b;
            if (num2 == null || num2.intValue() < 0) {
                this.f71873b = 3;
            }
            Map<String, Boolean> map = this.f71874c;
            if (map == null) {
                map = new HashMap<>();
            }
            this.f71874c = map;
            return new ButtonDelays(this.f71872a.intValue(), this.f71873b.intValue(), this.f71874c);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public C27263b(@NonNull JSONObject jSONObject) {
            if (jSONObject.optInt("videoSkip", -1) != -1) {
                this.f71872a = Integer.valueOf(jSONObject.optInt("videoSkip"));
            }
            if (jSONObject.optInt("displayClose", -1) != -1) {
                this.f71873b = Integer.valueOf(jSONObject.optInt("displayClose"));
            }
            if (jSONObject.has("fixDelays")) {
                m39380c(jSONObject.optJSONArray("fixDelays"));
            }
        }
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ButtonDelays buttonDelays = (ButtonDelays) obj;
        if (this.videoAdDelaySeconds == buttonDelays.videoAdDelaySeconds && this.displayAdDelaySeconds == buttonDelays.getDisplayAdDelaySeconds() && this.fixedDelaysMap == buttonDelays.fixedDelaysMap) {
            return true;
        }
        return false;
    }

    public int getDisplayAdDelaySeconds() {
        return this.displayAdDelaySeconds;
    }

    public int getVideoAdDelaySeconds() {
        return this.videoAdDelaySeconds;
    }

    public int hashCode() {
        return Objects.hash(Integer.valueOf(this.videoAdDelaySeconds), Integer.valueOf(this.displayAdDelaySeconds), this.fixedDelaysMap);
    }

    public boolean isButtonDelayEnabled(ButtonDelay buttonDelay) {
        Boolean bool = this.fixedDelaysMap.get(buttonDelay.name());
        if (bool != null) {
            return bool.booleanValue();
        }
        return DEFAULT_DELAY_ENABLED.booleanValue();
    }

    private ButtonDelays(int i, int i2, Map<String, Boolean> map) {
        this.videoAdDelaySeconds = i;
        this.displayAdDelaySeconds = i2;
        this.fixedDelaysMap = map;
    }
}
