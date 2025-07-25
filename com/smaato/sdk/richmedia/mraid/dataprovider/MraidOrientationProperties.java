package com.smaato.sdk.richmedia.mraid.dataprovider;

import androidx.annotation.NonNull;
import com.smaato.sdk.core.util.Objects;
import com.smaato.sdk.richmedia.util.DeviceUtils;

/* loaded from: classes7.dex */
public final class MraidOrientationProperties {
    public final boolean allowOrientationChange;
    @NonNull
    public final DeviceUtils.ScreenOrientation forceOrientation;

    public MraidOrientationProperties(boolean z, @NonNull DeviceUtils.ScreenOrientation screenOrientation) {
        this.allowOrientationChange = z;
        this.forceOrientation = (DeviceUtils.ScreenOrientation) Objects.requireNonNull(screenOrientation);
    }

    @NonNull
    public static MraidOrientationProperties createDefault() {
        return new MraidOrientationProperties(true, DeviceUtils.ScreenOrientation.UNKNOWN);
    }
}
