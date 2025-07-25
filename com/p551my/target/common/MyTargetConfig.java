package com.p551my.target.common;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* renamed from: com.my.target.common.MyTargetConfig */
/* loaded from: classes7.dex */
public final class MyTargetConfig {
    public final boolean isTrackingEnvironmentEnabled;
    public final boolean isTrackingLocationEnabled;
    @Nullable
    public final String[] testDevices;

    /* renamed from: com.my.target.common.MyTargetConfig$Builder */
    /* loaded from: classes7.dex */
    public static final class Builder {
        private static final boolean DEFAULT_TRACKING_ENVIRONMENT = true;
        private static final boolean DEFAULT_TRACKING_LOCATION = false;
        @Nullable
        String[] testDevices;
        boolean trackingEnvironment = true;
        boolean trackingLocation = false;

        @NonNull
        public MyTargetConfig build() {
            return new MyTargetConfig(this.trackingEnvironment, this.trackingLocation, this.testDevices);
        }

        @NonNull
        public Builder from(@NonNull MyTargetConfig myTargetConfig) {
            this.trackingLocation = myTargetConfig.isTrackingLocationEnabled;
            this.trackingEnvironment = myTargetConfig.isTrackingEnvironmentEnabled;
            this.testDevices = myTargetConfig.testDevices;
            return this;
        }

        @NonNull
        public Builder withTestDevices(@Nullable String... strArr) {
            this.testDevices = strArr;
            return this;
        }

        @NonNull
        public Builder withTrackingEnvironment(boolean z) {
            this.trackingEnvironment = z;
            return this;
        }

        @NonNull
        public Builder withTrackingLocation(boolean z) {
            this.trackingLocation = z;
            return this;
        }
    }

    public MyTargetConfig(boolean z, boolean z2, @Nullable String[] strArr) {
        this.isTrackingEnvironmentEnabled = z;
        this.isTrackingLocationEnabled = z2;
        this.testDevices = strArr;
    }
}
