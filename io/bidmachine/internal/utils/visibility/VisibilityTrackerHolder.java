package io.bidmachine.internal.utils.visibility;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import io.bidmachine.core.VisibilityParams;

/* loaded from: classes9.dex */
public class VisibilityTrackerHolder {
    @NonNull
    private final Object lock = new Object();
    @Nullable
    @VisibleForTesting
    VisibilityTracker visibilityTracker;

    @NonNull
    @VisibleForTesting
    VisibilityTracker createVisibilityTracker(@NonNull View view, @NonNull VisibilityParams visibilityParams, @NonNull VisibilityTrackerListener visibilityTrackerListener) {
        return new VisibilityTrackerImpl(view, visibilityParams, visibilityTrackerListener);
    }

    public void startTracking(@NonNull View view, @NonNull VisibilityParams visibilityParams, @NonNull VisibilityTrackerListener visibilityTrackerListener) {
        synchronized (this.lock) {
            stopTracking();
            VisibilityTracker createVisibilityTracker = createVisibilityTracker(view, visibilityParams, visibilityTrackerListener);
            this.visibilityTracker = createVisibilityTracker;
            createVisibilityTracker.start();
        }
    }

    public void stopTracking() {
        synchronized (this.lock) {
            VisibilityTracker visibilityTracker = this.visibilityTracker;
            if (visibilityTracker != null) {
                visibilityTracker.stop();
                this.visibilityTracker = null;
            }
        }
    }
}
