package com.smaato.sdk.richmedia.mraid.dataprovider;

import android.content.Context;
import androidx.annotation.NonNull;
import com.smaato.sdk.core.util.Objects;
import com.smaato.sdk.richmedia.util.DeviceUtils;

/* loaded from: classes7.dex */
public final class MraidAppOrientation {
    public final boolean isLocked;
    @NonNull
    public final DeviceUtils.ScreenOrientation orientation;

    private MraidAppOrientation(boolean z, @NonNull DeviceUtils.ScreenOrientation screenOrientation) {
        this.isLocked = z;
        this.orientation = screenOrientation;
    }

    @NonNull
    public static MraidAppOrientation from(@NonNull Context context) {
        return new MraidAppOrientation(DeviceUtils.isOrientationLocked(context), DeviceUtils.getScreenOrientation(context));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || MraidAppOrientation.class != obj.getClass()) {
            return false;
        }
        MraidAppOrientation mraidAppOrientation = (MraidAppOrientation) obj;
        if (this.isLocked == mraidAppOrientation.isLocked && this.orientation == mraidAppOrientation.orientation) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return Objects.hash(Boolean.valueOf(this.isLocked), this.orientation);
    }
}
