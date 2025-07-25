package com.google.android.exoplayer2;

import android.os.Bundle;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.Bundleable;
import com.google.android.exoplayer2.util.Util;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* loaded from: classes4.dex */
public final class DeviceInfo implements Bundleable {
    public static final int PLAYBACK_TYPE_LOCAL = 0;
    public static final int PLAYBACK_TYPE_REMOTE = 1;
    public final int maxVolume;
    public final int minVolume;
    public final int playbackType;
    public static final DeviceInfo UNKNOWN = new DeviceInfo(0, 0, 0);

    /* renamed from: b */
    private static final String f31426b = Util.intToStringMaxRadix(0);

    /* renamed from: c */
    private static final String f31427c = Util.intToStringMaxRadix(1);

    /* renamed from: d */
    private static final String f31428d = Util.intToStringMaxRadix(2);
    public static final Bundleable.Creator<DeviceInfo> CREATOR = new Bundleable.Creator() { // from class: com.google.android.exoplayer2.b
        @Override // com.google.android.exoplayer2.Bundleable.Creator
        public final Bundleable fromBundle(Bundle bundle) {
            DeviceInfo m76074b;
            m76074b = DeviceInfo.m76074b(bundle);
            return m76074b;
        }
    };

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes4.dex */
    public @interface PlaybackType {
    }

    public DeviceInfo(int i, int i2, int i3) {
        this.playbackType = i;
        this.minVolume = i2;
        this.maxVolume = i3;
    }

    /* renamed from: b */
    public static /* synthetic */ DeviceInfo m76074b(Bundle bundle) {
        return new DeviceInfo(bundle.getInt(f31426b, 0), bundle.getInt(f31427c, 0), bundle.getInt(f31428d, 0));
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DeviceInfo)) {
            return false;
        }
        DeviceInfo deviceInfo = (DeviceInfo) obj;
        if (this.playbackType == deviceInfo.playbackType && this.minVolume == deviceInfo.minVolume && this.maxVolume == deviceInfo.maxVolume) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.playbackType) * 31) + this.minVolume) * 31) + this.maxVolume;
    }

    @Override // com.google.android.exoplayer2.Bundleable
    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putInt(f31426b, this.playbackType);
        bundle.putInt(f31427c, this.minVolume);
        bundle.putInt(f31428d, this.maxVolume);
        return bundle;
    }
}
