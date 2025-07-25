package com.smaato.sdk.core;

import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.smaato.sdk.core.log.LogDomain;
import com.smaato.sdk.core.log.LogLevel;
import com.smaato.sdk.core.util.Objects;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes7.dex */
public final class Config {
    @NonNull
    private final AdContentRating adContentRating;
    private final boolean disableSessionTracking;
    private final boolean enableLogging;
    private List<ExtensionConfiguration> extensionConfigurations;
    private final boolean httpsOnly;
    @NonNull
    private final LogLevel logLevel;
    private String mUnityVersion;

    /* loaded from: classes7.dex */
    public static class ConfigBuilder {
        private boolean disableSessionTracking;
        private boolean enableLogging;
        private boolean httpsOnly;
        @NonNull
        private LogLevel logLevel = LogLevel.INFO;
        @NonNull
        private AdContentRating adContentRating = AdContentRating.MAX_AD_CONTENT_RATING_UNDEFINED;
        private String mUnityVersion = "";
        private final List<ExtensionConfiguration> extensionConfigurations = new ArrayList();

        public ConfigBuilder addExtensionConfiguration(ExtensionConfiguration extensionConfiguration) {
            this.extensionConfigurations.add(extensionConfiguration);
            return this;
        }

        @NonNull
        public Config build() {
            return new Config(this.logLevel, this.adContentRating, this.enableLogging, this.disableSessionTracking, this.httpsOnly, this.mUnityVersion, this.extensionConfigurations);
        }

        public ConfigBuilder disableSessionTracking(boolean z) {
            this.disableSessionTracking = z;
            return this;
        }

        @NonNull
        public ConfigBuilder enableLogging(boolean z) {
            this.enableLogging = z;
            return this;
        }

        @NonNull
        public ConfigBuilder setAdContentRating(@Nullable AdContentRating adContentRating) {
            if (adContentRating != null) {
                this.adContentRating = adContentRating;
            } else {
                Log.w(LogDomain.CORE.name(), String.format("Setting adContentRating to null is ignored, current value = %s", this.adContentRating));
            }
            return this;
        }

        @NonNull
        public ConfigBuilder setHttpsOnly(boolean z) {
            this.httpsOnly = z;
            return this;
        }

        @NonNull
        public ConfigBuilder setLogLevel(@Nullable LogLevel logLevel) {
            if (logLevel != null) {
                this.logLevel = logLevel;
            } else {
                Log.w(LogDomain.CORE.name(), String.format("Setting logLevel to null is ignored, current value = %s", this.logLevel));
            }
            return this;
        }

        @NonNull
        public ConfigBuilder setUnityVersion(String str) {
            this.mUnityVersion = str;
            return this;
        }
    }

    @NonNull
    public static ConfigBuilder builder() {
        return new ConfigBuilder();
    }

    @NonNull
    public AdContentRating getAdContentRating() {
        return this.adContentRating;
    }

    @NonNull
    public LogLevel getConsoleLogLevel() {
        return this.logLevel;
    }

    @NonNull
    public List<ExtensionConfiguration> getExtensionConfigurations() {
        return this.extensionConfigurations;
    }

    public String getUnityVersion() {
        return this.mUnityVersion;
    }

    public boolean isHttpsOnly() {
        return this.httpsOnly;
    }

    public boolean loggingEnabled() {
        return this.enableLogging;
    }

    public boolean sessionTrackingDisabled() {
        return this.disableSessionTracking;
    }

    private Config(@NonNull LogLevel logLevel, @NonNull AdContentRating adContentRating, boolean z, boolean z2, boolean z3, String str, List<ExtensionConfiguration> list) {
        this.mUnityVersion = "";
        this.logLevel = (LogLevel) Objects.requireNonNull(logLevel);
        this.adContentRating = (AdContentRating) Objects.requireNonNull(adContentRating);
        this.enableLogging = z;
        this.disableSessionTracking = z2;
        this.httpsOnly = z3;
        this.mUnityVersion = str;
        this.extensionConfigurations = list;
    }
}
