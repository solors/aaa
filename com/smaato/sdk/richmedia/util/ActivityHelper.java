package com.smaato.sdk.richmedia.util;

import android.app.Activity;
import android.content.ComponentName;
import android.content.pm.PackageManager;
import androidx.annotation.NonNull;

/* loaded from: classes7.dex */
public final class ActivityHelper {
    public boolean isDestroyedOnOrientationChange(@NonNull Activity activity) {
        boolean z;
        boolean z2;
        try {
            int i = activity.getPackageManager().getActivityInfo(new ComponentName(activity, activity.getClass()), 0).configChanges;
            if ((i & 128) != 0) {
                z = true;
            } else {
                z = false;
            }
            if ((i & 1024) != 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (!z || !z2) {
                return true;
            }
            return false;
        } catch (PackageManager.NameNotFoundException unused) {
            return true;
        }
    }

    public boolean isLockedByUserOrDeveloper(@NonNull Activity activity) {
        if (!DeviceUtils.isAutoRotateLocked(activity) && !OrientationLockedCompat.m39013d(activity)) {
            return false;
        }
        return true;
    }
}
