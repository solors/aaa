package io.bidmachine.core;

import java.util.concurrent.TimeUnit;

/* loaded from: classes9.dex */
public class VisibilityParams {
    public static final boolean DEF_IGNORE_OVERLAP = false;
    public static final boolean DEF_IGNORE_WINDOW_FOCUS = false;
    public static final float DEF_PIXEL_THRESHOLD = 1.0f;
    public static final long DEF_TIME_THRESHOLD_SEC = 1;
    private long timeThresholdMs = TimeUnit.SECONDS.toMillis(1);
    private float pixelThreshold = 1.0f;
    private boolean ignoreWindowFocus = false;
    private boolean ignoreOverlap = false;

    public float getPixelThreshold() {
        return this.pixelThreshold;
    }

    public long getTimeThresholdMs() {
        return this.timeThresholdMs;
    }

    public boolean isIgnoreOverlap() {
        return this.ignoreOverlap;
    }

    public boolean isIgnoreWindowFocus() {
        return this.ignoreWindowFocus;
    }

    public void setIgnoreOverlap(boolean z) {
        this.ignoreOverlap = z;
    }

    public void setIgnoreWindowFocus(boolean z) {
        this.ignoreWindowFocus = z;
    }

    public void setPixelThreshold(float f) {
        this.pixelThreshold = f;
    }

    public void setTimeThresholdMs(long j) {
        this.timeThresholdMs = j;
    }

    public void setTimeThresholdSec(long j) {
        setTimeThresholdMs(TimeUnit.SECONDS.toMillis(j));
    }
}
