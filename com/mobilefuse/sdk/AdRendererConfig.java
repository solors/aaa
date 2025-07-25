package com.mobilefuse.sdk;

import com.mobilefuse.sdk.config.ObservableConfig;

/* loaded from: classes7.dex */
public class AdRendererConfig {
    private String advertisingId;
    private boolean closeButtonEnabled;
    private String deviceIp;
    private ExtendedAdType extendedAdType;
    private boolean fullscreenAd;
    private boolean limitTrackingEnabled;
    private ObservableConfig observableConfig;
    private String sdkName;
    private String sdkVersion;
    private boolean subjectToCoppa;
    private boolean testMode;
    private boolean thumbnailSize;
    private boolean transparentBackground;
    private int adWidth = -1;
    private int adHeight = -1;

    /* loaded from: classes7.dex */
    public static class Builder {
        private AdRendererConfig config = new AdRendererConfig();

        public AdRendererConfig build() {
            return this.config;
        }

        public String getAdvertisingId() {
            return this.config.advertisingId;
        }

        public String getDeviceIp() {
            return this.config.deviceIp;
        }

        public ExtendedAdType getExtendedAdType() {
            return this.config.extendedAdType;
        }

        public ObservableConfig getObservableConfig() {
            return this.config.observableConfig;
        }

        public String getSdkName() {
            return this.config.sdkName;
        }

        public String getSdkVersion() {
            return this.config.sdkVersion;
        }

        public boolean isCloseButtonEnabled() {
            return this.config.closeButtonEnabled;
        }

        public boolean isFullscreenAd() {
            return this.config.fullscreenAd;
        }

        public boolean isLimitTrackingEnabled() {
            return this.config.limitTrackingEnabled;
        }

        public boolean isSubjectToCoppa() {
            return this.config.subjectToCoppa;
        }

        public boolean isTestMode() {
            return this.config.testMode;
        }

        public boolean isThumbnailSize() {
            return this.config.thumbnailSize;
        }

        public boolean isTransparentBackground() {
            return this.config.transparentBackground;
        }

        public Builder setAdHeight(int i) {
            this.config.adHeight = i;
            return this;
        }

        public Builder setAdWidth(int i) {
            this.config.adWidth = i;
            return this;
        }

        public Builder setAdvertisingId(String str) {
            this.config.advertisingId = str;
            return this;
        }

        public Builder setCloseButtonEnabled(boolean z) {
            this.config.closeButtonEnabled = z;
            return this;
        }

        public Builder setDeviceIp(String str) {
            this.config.deviceIp = str;
            return this;
        }

        public Builder setExtendedAdType(ExtendedAdType extendedAdType) {
            this.config.extendedAdType = extendedAdType;
            return this;
        }

        public Builder setFullscreenAd(boolean z) {
            this.config.fullscreenAd = z;
            return this;
        }

        public Builder setLimitTrackingEnabled(boolean z) {
            this.config.limitTrackingEnabled = z;
            return this;
        }

        public Builder setObservableConfig(ObservableConfig observableConfig) {
            this.config.observableConfig = observableConfig;
            return this;
        }

        public Builder setSdkName(String str) {
            this.config.sdkName = str;
            return this;
        }

        public Builder setSdkVersion(String str) {
            this.config.sdkVersion = str;
            return this;
        }

        public Builder setSubjectToCoppa(boolean z) {
            this.config.subjectToCoppa = z;
            return this;
        }

        public Builder setTestMode(boolean z) {
            this.config.testMode = z;
            return this;
        }

        public Builder setThumbnailSize(boolean z) {
            this.config.thumbnailSize = z;
            return this;
        }

        public Builder setTransparentBackground(boolean z) {
            this.config.transparentBackground = z;
            return this;
        }
    }

    AdRendererConfig() {
    }

    public int getAdHeight() {
        return this.adHeight;
    }

    public int getAdWidth() {
        return this.adWidth;
    }

    public String getAdvertisingId() {
        return this.advertisingId;
    }

    public String getDeviceIp() {
        return this.deviceIp;
    }

    public ExtendedAdType getExtendedAdType() {
        return this.extendedAdType;
    }

    public ObservableConfig getObservableConfig() {
        return this.observableConfig;
    }

    public String getSdkName() {
        return this.sdkName;
    }

    public String getSdkVersion() {
        return this.sdkVersion;
    }

    public boolean isCloseButtonEnabled() {
        return this.closeButtonEnabled;
    }

    public boolean isFullscreenAd() {
        return this.fullscreenAd;
    }

    public boolean isLimitTrackingEnabled() {
        return this.limitTrackingEnabled;
    }

    public boolean isSubjectToCoppa() {
        return this.subjectToCoppa;
    }

    public boolean isTestMode() {
        return this.testMode;
    }

    public boolean isThumbnailSize() {
        return this.thumbnailSize;
    }

    public boolean isTransparentBackground() {
        return this.transparentBackground;
    }
}
