package com.smaato.sdk.core.remoteconfig.publisher;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.smaato.sdk.core.remoteconfig.publisher.ButtonDelays;
import com.smaato.sdk.core.remoteconfig.publisher.ButtonSizes;
import com.smaato.sdk.core.remoteconfig.publisher.ErrorLoggingRate;
import com.smaato.sdk.core.remoteconfig.publisher.SoundSettings;
import com.smaato.sdk.core.remoteconfig.publisher.UnifiedBidding;
import com.smaato.sdk.core.util.Objects;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public final class Configuration {
    private final ButtonDelays buttonDelays;
    private final ButtonSizes buttonSizes;
    @NonNull
    private final ErrorLoggingRate errorLoggingRate;
    private final SoundSettings soundSettings;
    private final long ttlMillis;
    @NonNull
    private final UnifiedBidding unifiedBidding;

    @NonNull
    public static Configuration create() {
        return new C27267b().m39375b();
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || Configuration.class != obj.getClass()) {
            return false;
        }
        Configuration configuration = (Configuration) obj;
        if (this.ttlMillis != configuration.ttlMillis) {
            return false;
        }
        if (this.soundSettings.equals(configuration.soundSettings) && this.buttonDelays.equals(configuration.buttonDelays) && this.buttonSizes.equals(configuration.buttonSizes) && this.unifiedBidding.equals(configuration.unifiedBidding) && this.errorLoggingRate.equals(configuration.errorLoggingRate)) {
            return true;
        }
        return false;
    }

    @NonNull
    public ButtonDelays getButtonDelays() {
        return this.buttonDelays;
    }

    public ButtonSizes getButtonSizes() {
        return this.buttonSizes;
    }

    @NonNull
    public ErrorLoggingRate getErrorLoggingRate() {
        return this.errorLoggingRate;
    }

    public SoundSettings getSoundSettings() {
        return this.soundSettings;
    }

    public long getTtlMillis() {
        return this.ttlMillis;
    }

    @NonNull
    public UnifiedBidding getUnifiedBidding() {
        return this.unifiedBidding;
    }

    public int hashCode() {
        return Objects.hash(this.soundSettings, this.buttonDelays, this.buttonSizes, this.unifiedBidding, this.errorLoggingRate, Long.valueOf(this.ttlMillis));
    }

    /* renamed from: com.smaato.sdk.core.remoteconfig.publisher.Configuration$b */
    /* loaded from: classes7.dex */
    private static final class C27267b {
        @Nullable

        /* renamed from: a */
        private Long f71876a;
        @Nullable

        /* renamed from: b */
        private SoundSettings.C27273b f71877b;
        @Nullable

        /* renamed from: c */
        private ButtonDelays.C27263b f71878c;
        @Nullable

        /* renamed from: d */
        private ButtonSizes.C27265b f71879d;
        @Nullable

        /* renamed from: e */
        private UnifiedBidding.C27275b f71880e;
        @Nullable

        /* renamed from: f */
        private ErrorLoggingRate.C27269b f71881f;

        /* JADX INFO: Access modifiers changed from: private */
        @NonNull
        /* renamed from: b */
        public Configuration m39375b() {
            Long l = this.f71876a;
            if (l == null || l.longValue() < 0 || this.f71876a.longValue() > 86400000) {
                this.f71876a = 86400000L;
            }
            SoundSettings.C27273b c27273b = this.f71877b;
            if (c27273b == null) {
                c27273b = new SoundSettings.C27273b();
            }
            this.f71877b = c27273b;
            ButtonDelays.C27263b c27263b = this.f71878c;
            if (c27263b == null) {
                c27263b = new ButtonDelays.C27263b();
            }
            this.f71878c = c27263b;
            ButtonSizes.C27265b c27265b = this.f71879d;
            if (c27265b == null) {
                c27265b = new ButtonSizes.C27265b();
            }
            this.f71879d = c27265b;
            UnifiedBidding.C27275b c27275b = this.f71880e;
            if (c27275b == null) {
                c27275b = new UnifiedBidding.C27275b();
            }
            this.f71880e = c27275b;
            ErrorLoggingRate.C27269b c27269b = this.f71881f;
            if (c27269b == null) {
                c27269b = new ErrorLoggingRate.C27269b();
            }
            this.f71881f = c27269b;
            return new Configuration(this.f71877b.m39372a(), this.f71878c.m39382a(), this.f71879d.m39379a(), this.f71880e.m39371a(), this.f71881f.m39374a(), this.f71876a.longValue());
        }

        private C27267b() {
            this.f71876a = 0L;
        }

        private C27267b(@NonNull JSONObject jSONObject) {
            JSONObject optJSONObject = jSONObject.optJSONObject("meta");
            if (optJSONObject != null && optJSONObject.optInt("ttl", -1) != -1) {
                this.f71876a = Long.valueOf(optJSONObject.optInt("ttl") * 60 * 60 * 1000);
            }
            JSONObject optJSONObject2 = jSONObject.optJSONObject("soundSettings");
            if (optJSONObject2 != null) {
                this.f71877b = new SoundSettings.C27273b(optJSONObject2);
            }
            JSONObject optJSONObject3 = jSONObject.optJSONObject("buttonDelays");
            if (optJSONObject3 != null) {
                this.f71878c = new ButtonDelays.C27263b(optJSONObject3);
            }
            JSONObject optJSONObject4 = jSONObject.optJSONObject("buttonSizes");
            if (optJSONObject4 != null) {
                this.f71879d = new ButtonSizes.C27265b(optJSONObject4);
            }
            JSONObject optJSONObject5 = jSONObject.optJSONObject("unifiedBidding");
            if (optJSONObject5 != null) {
                this.f71880e = new UnifiedBidding.C27275b(optJSONObject5);
            }
            JSONObject optJSONObject6 = jSONObject.optJSONObject("errorLoggingRates");
            if (optJSONObject6 != null) {
                this.f71881f = new ErrorLoggingRate.C27269b(optJSONObject6);
            }
        }
    }

    private Configuration(@NonNull SoundSettings soundSettings, @NonNull ButtonDelays buttonDelays, @NonNull ButtonSizes buttonSizes, @NonNull UnifiedBidding unifiedBidding, @NonNull ErrorLoggingRate errorLoggingRate, long j) {
        this.soundSettings = soundSettings;
        this.buttonDelays = buttonDelays;
        this.buttonSizes = buttonSizes;
        this.unifiedBidding = unifiedBidding;
        this.errorLoggingRate = (ErrorLoggingRate) Objects.requireNonNull(errorLoggingRate);
        this.ttlMillis = j;
    }

    @NonNull
    public static Configuration create(@NonNull JSONObject jSONObject) {
        return new C27267b(jSONObject).m39375b();
    }
}
