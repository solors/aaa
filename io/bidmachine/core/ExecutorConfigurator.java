package io.bidmachine.core;

import androidx.annotation.FloatRange;
import androidx.annotation.VisibleForTesting;

/* renamed from: io.bidmachine.core.a */
/* loaded from: classes9.dex */
class ExecutorConfigurator {
    @VisibleForTesting
    public static final float DEFAULT_CPU_USAGE_FRACTION = 0.25f;
    @VisibleForTesting
    public static final float DEFAULT_SERVICE_TIME_RATIO = 0.100000024f;
    @VisibleForTesting
    public static final float DEFAULT_WAIT_TIME_RATIO = 0.9f;
    @VisibleForTesting
    public static final float MIN_CPU_USAGE_FRACTION = 1.0E-4f;
    private final int corePoolSize;
    private final int maximumPoolSize;

    public ExecutorConfigurator() {
        this(0.25f, 0.9f);
    }

    @VisibleForTesting
    static int calculateCorePoolSize(int i, float f) {
        return Math.max(1, Math.round(i * f));
    }

    @VisibleForTesting
    static int calculateMaximumPoolSize(int i, float f, float f2) {
        if (f <= 0.0f) {
            return Integer.MAX_VALUE;
        }
        return Math.round(i * ((f2 / f) + 1.0f));
    }

    @VisibleForTesting
    static float ensureMinimumCpuUsage(float f) {
        return Math.max(f, 1.0E-4f);
    }

    @VisibleForTesting
    static float ensureValidWaitTimeRatio(float f) {
        return Math.max(0.0f, Math.min(1.0f, f));
    }

    @VisibleForTesting
    int availableProcessors() {
        return Runtime.getRuntime().availableProcessors();
    }

    public int getCorePoolSize() {
        return this.corePoolSize;
    }

    public int getMaximumPoolSize() {
        return this.maximumPoolSize;
    }

    public ExecutorConfigurator(@FloatRange(from = 0.0d, m105511to = 1.0d) float f) {
        this(f, 0.9f);
    }

    public ExecutorConfigurator(@FloatRange(from = 0.0d, m105511to = 1.0d) float f, @FloatRange(from = 0.0d, m105511to = 1.0d) float f2) {
        float ensureMinimumCpuUsage = ensureMinimumCpuUsage(f);
        float ensureValidWaitTimeRatio = ensureValidWaitTimeRatio(f2);
        int calculateCorePoolSize = calculateCorePoolSize(availableProcessors(), ensureMinimumCpuUsage);
        this.corePoolSize = calculateCorePoolSize;
        this.maximumPoolSize = calculateMaximumPoolSize(calculateCorePoolSize, 1.0f - ensureValidWaitTimeRatio, ensureValidWaitTimeRatio);
    }
}
