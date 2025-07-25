package com.smaato.sdk.core.remoteconfig.global;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.maticoo.sdk.utils.log.p406bi.Constants;
import com.smaato.sdk.core.remoteconfig.global.ConfigButtonDelays;
import com.smaato.sdk.core.remoteconfig.global.ConfigButtonSizes;
import com.smaato.sdk.core.remoteconfig.global.ConfigFeatures;
import com.smaato.sdk.core.remoteconfig.global.ConfigProperties;
import com.smaato.sdk.core.remoteconfig.global.ConfigUrls;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public final class GenericConfig {
    @NonNull
    private final ConfigButtonDelays configButtonDelays;
    @NonNull
    private final ConfigButtonSizes configButtonSizes;
    @NonNull
    private final ConfigFeatures configFeatures;
    @NonNull
    private final ConfigProperties configProperties;
    @NonNull
    private final ConfigUrls configUrls;

    public static GenericConfig create() {
        return new C27261b().m39383b();
    }

    @NonNull
    public ConfigButtonDelays getConfigButtonDelays() {
        return this.configButtonDelays;
    }

    @NonNull
    public ConfigButtonSizes getConfigButtonSizes() {
        return this.configButtonSizes;
    }

    @NonNull
    public ConfigFeatures getConfigFeatures() {
        return this.configFeatures;
    }

    @NonNull
    public ConfigProperties getConfigProperties() {
        return this.configProperties;
    }

    @NonNull
    public ConfigUrls getConfigUrls() {
        return this.configUrls;
    }

    /* renamed from: com.smaato.sdk.core.remoteconfig.global.GenericConfig$b */
    /* loaded from: classes7.dex */
    private static final class C27261b {
        @Nullable

        /* renamed from: a */
        private ConfigUrls.C27259b f71867a;
        @Nullable

        /* renamed from: b */
        private ConfigProperties.C27257b f71868b;
        @Nullable

        /* renamed from: c */
        private ConfigFeatures.C27254b f71869c;
        @Nullable

        /* renamed from: d */
        private ConfigButtonSizes.C27252b f71870d;
        @Nullable

        /* renamed from: e */
        private ConfigButtonDelays.C27250b f71871e;

        /* JADX INFO: Access modifiers changed from: private */
        @NonNull
        /* renamed from: b */
        public GenericConfig m39383b() {
            ConfigUrls.C27259b c27259b = this.f71867a;
            if (c27259b == null) {
                c27259b = new ConfigUrls.C27259b();
            }
            this.f71867a = c27259b;
            ConfigProperties.C27257b c27257b = this.f71868b;
            if (c27257b == null) {
                c27257b = new ConfigProperties.C27257b();
            }
            this.f71868b = c27257b;
            ConfigFeatures.C27254b c27254b = this.f71869c;
            if (c27254b == null) {
                c27254b = new ConfigFeatures.C27254b();
            }
            this.f71869c = c27254b;
            ConfigButtonSizes.C27252b c27252b = this.f71870d;
            if (c27252b == null) {
                c27252b = new ConfigButtonSizes.C27252b();
            }
            this.f71870d = c27252b;
            ConfigButtonDelays.C27250b c27250b = this.f71871e;
            if (c27250b == null) {
                c27250b = new ConfigButtonDelays.C27250b();
            }
            this.f71871e = c27250b;
            return new GenericConfig(this.f71867a.m39387a(), this.f71868b.m39389a(), this.f71869c.m39395a(), this.f71870d.m39396a(), this.f71871e.m39398a());
        }

        private C27261b() {
        }

        private C27261b(@NonNull JSONObject jSONObject) {
            JSONObject optJSONObject = jSONObject.optJSONObject("remoteconfig");
            if (optJSONObject != null) {
                JSONObject optJSONObject2 = optJSONObject.optJSONObject("urls");
                if (optJSONObject2 != null) {
                    this.f71867a = new ConfigUrls.C27259b(optJSONObject2);
                }
                JSONObject optJSONObject3 = optJSONObject.optJSONObject(Constants.KEY_PROPERTIES);
                if (optJSONObject3 != null) {
                    this.f71868b = new ConfigProperties.C27257b(optJSONObject3);
                }
                JSONArray optJSONArray = optJSONObject.optJSONArray("features");
                if (optJSONArray != null) {
                    this.f71869c = new ConfigFeatures.C27254b(optJSONArray);
                }
                JSONObject optJSONObject4 = optJSONObject.optJSONObject("buttonSize");
                if (optJSONObject4 != null) {
                    this.f71870d = new ConfigButtonSizes.C27252b(optJSONObject4);
                }
                JSONObject optJSONObject5 = optJSONObject.optJSONObject("buttonDelay");
                if (optJSONObject5 != null) {
                    this.f71871e = new ConfigButtonDelays.C27250b(optJSONObject5);
                }
            }
        }
    }

    private GenericConfig(@NonNull ConfigUrls configUrls, @NonNull ConfigProperties configProperties, @NonNull ConfigFeatures configFeatures, @NonNull ConfigButtonSizes configButtonSizes, @NonNull ConfigButtonDelays configButtonDelays) {
        this.configUrls = configUrls;
        this.configProperties = configProperties;
        this.configFeatures = configFeatures;
        this.configButtonSizes = configButtonSizes;
        this.configButtonDelays = configButtonDelays;
    }

    public static GenericConfig create(@NonNull JSONObject jSONObject) {
        return new C27261b(jSONObject).m39383b();
    }
}
