package com.google.android.material.color;

/* loaded from: classes5.dex */
final class MathUtils {
    private MathUtils() {
    }

    public static float differenceDegrees(float f, float f2) {
        return 180.0f - Math.abs(Math.abs(f - f2) - 180.0f);
    }

    public static float lerp(float f, float f2, float f3) {
        return ((1.0f - f3) * f) + (f3 * f2);
    }

    public static float sanitizeDegrees(float f) {
        return f < 0.0f ? (f % 360.0f) + 360.0f : f >= 360.0f ? f % 360.0f : f;
    }

    public static int sanitizeDegrees(int i) {
        if (i < 0) {
            return (i % 360) + 360;
        }
        return i >= 360 ? i % 360 : i;
    }
}
