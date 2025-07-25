package androidx.media3.common;

import android.os.Bundle;
import androidx.annotation.IntRange;
import androidx.annotation.Nullable;
import androidx.media3.common.Bundleable;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* loaded from: classes.dex */
public final class DeviceInfo implements Bundleable {
    public static final int PLAYBACK_TYPE_LOCAL = 0;
    public static final int PLAYBACK_TYPE_REMOTE = 1;
    @IntRange(from = 0)
    public final int maxVolume;
    @IntRange(from = 0)
    public final int minVolume;
    public final int playbackType;
    @Nullable
    public final String routingControllerId;
    public static final DeviceInfo UNKNOWN = new Builder(0).build();
    private static final String FIELD_PLAYBACK_TYPE = Util.intToStringMaxRadix(0);
    private static final String FIELD_MIN_VOLUME = Util.intToStringMaxRadix(1);
    private static final String FIELD_MAX_VOLUME = Util.intToStringMaxRadix(2);
    private static final String FIELD_ROUTING_CONTROLLER_ID = Util.intToStringMaxRadix(3);
    @UnstableApi
    public static final Bundleable.Creator<DeviceInfo> CREATOR = new Bundleable.Creator() { // from class: androidx.media3.common.i
        @Override // androidx.media3.common.Bundleable.Creator
        public final Bundleable fromBundle(Bundle bundle) {
            DeviceInfo lambda$static$0;
            lambda$static$0 = DeviceInfo.lambda$static$0(bundle);
            return lambda$static$0;
        }
    };

    /* loaded from: classes.dex */
    public static final class Builder {
        private int maxVolume;
        private int minVolume;
        private final int playbackType;
        @Nullable
        private String routingControllerId;

        public Builder(int i) {
            this.playbackType = i;
        }

        public DeviceInfo build() {
            boolean z;
            if (this.minVolume <= this.maxVolume) {
                z = true;
            } else {
                z = false;
            }
            Assertions.checkArgument(z);
            return new DeviceInfo(this);
        }

        @CanIgnoreReturnValue
        public Builder setMaxVolume(@IntRange(from = 0) int i) {
            this.maxVolume = i;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setMinVolume(@IntRange(from = 0) int i) {
            this.minVolume = i;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setRoutingControllerId(@Nullable String str) {
            boolean z;
            if (this.playbackType == 0 && str != null) {
                z = false;
            } else {
                z = true;
            }
            Assertions.checkArgument(z);
            this.routingControllerId = str;
            return this;
        }
    }

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface PlaybackType {
    }

    public static /* synthetic */ DeviceInfo lambda$static$0(Bundle bundle) {
        int i = bundle.getInt(FIELD_PLAYBACK_TYPE, 0);
        int i2 = bundle.getInt(FIELD_MIN_VOLUME, 0);
        int i3 = bundle.getInt(FIELD_MAX_VOLUME, 0);
        return new Builder(i).setMinVolume(i2).setMaxVolume(i3).setRoutingControllerId(bundle.getString(FIELD_ROUTING_CONTROLLER_ID)).build();
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DeviceInfo)) {
            return false;
        }
        DeviceInfo deviceInfo = (DeviceInfo) obj;
        if (this.playbackType == deviceInfo.playbackType && this.minVolume == deviceInfo.minVolume && this.maxVolume == deviceInfo.maxVolume && Util.areEqual(this.routingControllerId, deviceInfo.routingControllerId)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        int i = (((((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.playbackType) * 31) + this.minVolume) * 31) + this.maxVolume) * 31;
        String str = this.routingControllerId;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return i + hashCode;
    }

    @Override // androidx.media3.common.Bundleable
    @UnstableApi
    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        int i = this.playbackType;
        if (i != 0) {
            bundle.putInt(FIELD_PLAYBACK_TYPE, i);
        }
        int i2 = this.minVolume;
        if (i2 != 0) {
            bundle.putInt(FIELD_MIN_VOLUME, i2);
        }
        int i3 = this.maxVolume;
        if (i3 != 0) {
            bundle.putInt(FIELD_MAX_VOLUME, i3);
        }
        String str = this.routingControllerId;
        if (str != null) {
            bundle.putString(FIELD_ROUTING_CONTROLLER_ID, str);
        }
        return bundle;
    }

    @UnstableApi
    @Deprecated
    public DeviceInfo(int i, @IntRange(from = 0) int i2, @IntRange(from = 0) int i3) {
        this(new Builder(i).setMinVolume(i2).setMaxVolume(i3));
    }

    private DeviceInfo(Builder builder) {
        this.playbackType = builder.playbackType;
        this.minVolume = builder.minVolume;
        this.maxVolume = builder.maxVolume;
        this.routingControllerId = builder.routingControllerId;
    }
}
