package io.bidmachine.rendering.utils.concurrent;

import androidx.annotation.FloatRange;
import androidx.annotation.VisibleForTesting;

/* loaded from: classes9.dex */
public class ExecutorConfigurator {
    @VisibleForTesting
    public static final float DEFAULT_CPU_USAGE_FRACTION = 0.25f;
    @VisibleForTesting
    public static final float DEFAULT_SERVICE_TIME_RATIO = 0.100000024f;
    @VisibleForTesting
    public static final float DEFAULT_WAIT_TIME_RATIO = 0.9f;
    @VisibleForTesting
    public static final float MIN_CPU_USAGE_FRACTION = 1.0E-4f;

    /* renamed from: a */
    private final int f97967a;

    /* renamed from: b */
    private final int f97968b;

    public ExecutorConfigurator() {
        this(0.25f, 0.9f);
    }

    /* renamed from: b */
    static float m19018b(float f) {
        return Math.max(0.0f, Math.min(1.0f, f));
    }

    /* renamed from: a */
    int m19022a() {
        return Runtime.getRuntime().availableProcessors();
    }

    public int getCorePoolSize() {
        return this.f97967a;
    }

    public int getMaximumPoolSize() {
        return this.f97968b;
    }

    public ExecutorConfigurator(@FloatRange(from = 0.0d, m105511to = 1.0d) float f) {
        this(f, 0.9f);
    }

    /* renamed from: a */
    static int m19020a(int i, float f) {
        return Math.max(1, Math.round(i * f));
    }

    public ExecutorConfigurator(@FloatRange(from = 0.0d, m105511to = 1.0d) float f, @FloatRange(from = 0.0d, m105511to = 1.0d) float f2) {
        float m19021a = m19021a(f);
        float m19018b = m19018b(f2);
        int m19020a = m19020a(m19022a(), m19021a);
        this.f97967a = m19020a;
        this.f97968b = m19019a(m19020a, 1.0f - m19018b, m19018b);
    }

    /* renamed from: a */
    static int m19019a(int i, float f, float f2) {
        if (f <= 0.0f) {
            return Integer.MAX_VALUE;
        }
        return Math.round(i * ((f2 / f) + 1.0f));
    }

    /* renamed from: a */
    static float m19021a(float f) {
        return Math.max(f, 1.0E-4f);
    }
}
