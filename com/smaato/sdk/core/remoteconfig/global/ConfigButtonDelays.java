package com.smaato.sdk.core.remoteconfig.global;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.smaato.sdk.core.util.Objects;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public class ConfigButtonDelays {
    private final DelayOptions displayAdDelay;
    private final DelayOptions videoAdDelay;

    /* loaded from: classes7.dex */
    public static class DelayOptions {
        private final int largeInSec;
        private final int midInSec;

        public DelayOptions(int i, int i2) {
            this.largeInSec = i;
            this.midInSec = i2;
        }

        public int getLargeInSec() {
            return this.largeInSec;
        }

        public int getMidInSec() {
            return this.midInSec;
        }
    }

    /* renamed from: com.smaato.sdk.core.remoteconfig.global.ConfigButtonDelays$b */
    /* loaded from: classes7.dex */
    static final class C27250b {
        @Nullable

        /* renamed from: a */
        private DelayOptions f71849a;
        @Nullable

        /* renamed from: b */
        private DelayOptions f71850b;

        /* JADX INFO: Access modifiers changed from: package-private */
        public C27250b() {
        }

        @Nullable
        /* renamed from: b */
        private DelayOptions m39397b(JSONObject jSONObject) {
            if (jSONObject == null) {
                return null;
            }
            int optInt = jSONObject.optInt("large", -1);
            int optInt2 = jSONObject.optInt("mid", -1);
            if (optInt == -1 || optInt2 == -1) {
                return null;
            }
            return new DelayOptions(optInt, optInt2);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @NonNull
        /* renamed from: a */
        public ConfigButtonDelays m39398a() {
            if (this.f71849a == null) {
                this.f71849a = new DelayOptions(8, 5);
            }
            if (this.f71850b == null) {
                this.f71850b = new DelayOptions(5, 3);
            }
            return new ConfigButtonDelays(this.f71849a, this.f71850b);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public C27250b(@NonNull JSONObject jSONObject) {
            if (jSONObject.has("videoSkip")) {
                this.f71849a = m39397b(jSONObject.optJSONObject("videoSkip"));
            }
            if (jSONObject.has("displayClose")) {
                this.f71850b = m39397b(jSONObject.optJSONObject("displayClose"));
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
        ConfigButtonDelays configButtonDelays = (ConfigButtonDelays) obj;
        if (this.videoAdDelay == configButtonDelays.getVideoAdDelay() && this.displayAdDelay == configButtonDelays.getDisplayAdDelay()) {
            return true;
        }
        return false;
    }

    public DelayOptions getDisplayAdDelay() {
        return this.displayAdDelay;
    }

    public DelayOptions getVideoAdDelay() {
        return this.videoAdDelay;
    }

    public int hashCode() {
        return Objects.hash(this.videoAdDelay, this.displayAdDelay);
    }

    private ConfigButtonDelays(DelayOptions delayOptions, DelayOptions delayOptions2) {
        this.videoAdDelay = delayOptions;
        this.displayAdDelay = delayOptions2;
    }
}
