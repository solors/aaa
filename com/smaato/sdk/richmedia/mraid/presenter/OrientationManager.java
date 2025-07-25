package com.smaato.sdk.richmedia.mraid.presenter;

import android.app.Activity;
import android.content.Context;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.smaato.sdk.core.log.LogDomain;
import com.smaato.sdk.core.log.Logger;
import com.smaato.sdk.core.util.Threads;
import com.smaato.sdk.richmedia.mraid.dataprovider.MraidOrientationProperties;
import com.smaato.sdk.richmedia.util.ActivityHelper;
import com.smaato.sdk.richmedia.util.DeviceUtils;

/* loaded from: classes7.dex */
public final class OrientationManager {
    @NonNull
    private final ActivityHelper activityHelper;
    @NonNull
    private final Logger logger;
    @Nullable
    private Integer originalOrientation;

    public OrientationManager(@NonNull Logger logger, @NonNull ActivityHelper activityHelper) {
        this.logger = logger;
        this.activityHelper = activityHelper;
    }

    private void lockOrientation(@NonNull Activity activity, @NonNull DeviceUtils.ScreenOrientation screenOrientation) {
        this.originalOrientation = Integer.valueOf(activity.getRequestedOrientation());
        setOrientation(activity, DeviceUtils.getActivityInfoOrientation(screenOrientation));
    }

    private void setOrientation(@NonNull Activity activity, int i) {
        activity.setRequestedOrientation(i);
    }

    private void unlockOrientation(@NonNull Activity activity) {
        setOrientation(activity, -1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @MainThread
    public void applyOrientationProperties(@NonNull Context context, @NonNull MraidOrientationProperties mraidOrientationProperties) {
        Threads.ensureMainThread();
        if (!(context instanceof Activity)) {
            return;
        }
        Activity activity = (Activity) context;
        boolean z = false;
        if (this.activityHelper.isLockedByUserOrDeveloper(activity)) {
            this.logger.error(LogDomain.MRAID, "Won't apply orientation properties. Reason: Activity is locked", new Object[0]);
        } else if (this.activityHelper.isDestroyedOnOrientationChange(activity)) {
            this.logger.error(LogDomain.MRAID, "Won't apply orientation properties. Reason: Activity might be destroyed on orientation change", new Object[0]);
        } else {
            DeviceUtils.ScreenOrientation screenOrientation = mraidOrientationProperties.forceOrientation;
            if ((screenOrientation == DeviceUtils.ScreenOrientation.PORTRAIT || screenOrientation == DeviceUtils.ScreenOrientation.LANDSCAPE) ? true : true) {
                lockOrientation(activity, screenOrientation);
            } else if (mraidOrientationProperties.allowOrientationChange) {
                unlockOrientation(activity);
            } else {
                lockOrientation(activity, DeviceUtils.getScreenOrientation(context));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @MainThread
    public void restoreOriginalOrientation(@NonNull Context context) {
        Threads.ensureMainThread();
        Integer num = this.originalOrientation;
        if (num == null || !(context instanceof Activity)) {
            return;
        }
        setOrientation((Activity) context, num.intValue());
        this.originalOrientation = null;
    }
}
